using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Text;
using System.Windows.Forms;
using AgentWebServiceSample.PcoAgentWS;

namespace AgentWebServiceSample
{
    public partial class SimpleAgent : Form
    {
        private AgentServiceService WSProxy;

        private int AgentLogin;

        private bool LoggedIn=false;

        public SimpleAgent()
        {
            InitializeComponent();
        }

        private void BtnLogin_Click(object sender, EventArgs e)
        {
            AgentLogin = int.Parse(TxTAgentLogin.Text);
            int r;
            UserEvents.Text = "";
            UserEvents.AppendText("User Action:  " + "Login Request\n");
            r = WSProxy.Login(int.Parse(TxTAgentLogin.Text), TxTPassword.Text, int.Parse(TxTStation.Text), false);
            string response = r >= 0 ? "Logged In" : "Error Logging";
            if (r >= 0)
            LoggedIn = true;

            UserEvents.AppendText("Server Response: " + response);

            //Start checking events on the server
            if(LoggedIn)
            CheckEvents();

            
        }

               


        private void CheckEvents()
        {
        WSProxy.WaitForEventAsync(AgentLogin);
            

        }


        private void SimpleAgent_Load(object sender, EventArgs e)
        {
            WSProxy = new AgentServiceService();
            WSProxy.WaitForEventCompleted += new WaitForEventCompletedEventHandler(WriteCheckResponse);

        }

        private void BtnStart_Click(object sender, EventArgs e)
        {
            int r;
            UserEvents.Text = "";
            UserEvents.AppendText("User Action:  " + "Start Request\n");
            r = WSProxy.StartSession(AgentLogin);
            string response = r >= 0 ? "Session Started" : "Error Starting";
            UserEvents.AppendText("Server Response: " + response);

            
        }

        private void BtnStop_Click(object sender, EventArgs e)
        {
            int r;
            UserEvents.Text = "";
            UserEvents.AppendText("User Action:  " + "Stop Request \n");
            r = WSProxy.StopSession(AgentLogin,0);
            string response = r >= 0 ? "Session Stopped" : "Error Stopping";
            UserEvents.AppendText("Server Response: " + response);

        }

        private void BtnLogout_Click(object sender, EventArgs e)
        {
            int r;
            UserEvents.Text = "";
            UserEvents.AppendText("User Action:  " + "Logout Request \n");
            r = WSProxy.Logout(AgentLogin,0);
            string response = r >= 0 ? "Logged out" : "Error Logging out";
            if (r >= 0) LoggedIn = false;
            UserEvents.AppendText("Server Response: " + response);

        }

        private void button1_Click(object sender, EventArgs e)
        {
            Close();

        }

        private void WriteCheckResponse(object sender, WaitForEventCompletedEventArgs args)
        {
      
            if (args.Result)
            { //There are events!!!
                RetrieveEvents();
            }
            else
            {// No events for now :(

                ServerEvents.Text = "No pending events. Retrying...\n" + ServerEvents.Text;
                                
                //Retrying
                if (LoggedIn)
                CheckEvents();
            }
            
        }

        private void RetrieveEvents()
        {
            

            ServerEvents.Text = "Retrieving Events: \n" + ServerEvents.Text;
            

            TAgentEvent[] EventList;
            int r = WSProxy.GetEvent(AgentLogin, out EventList);

            foreach (TAgentEvent CurrentEvent in EventList )
            {
                
                ServerEvents.Text = "Retrieved Event : " + CurrentEvent.EventCode + "\n" + ServerEvents.Text;

                switch (CurrentEvent.EventCode)
                {
                    case AGFWEventsCode.AGM_ACTION_CHANGE:
                        
                        UpdateActionButtons((int)CurrentEvent.EventFields[0].Value);
                        break;
                }

            }

            
            
            //Retrying
            if (LoggedIn)
            CheckEvents();



        }

        private void BtnAnswer_Click(object sender, EventArgs e)
        {
            int r = WSProxy.AnswerCall(AgentLogin);
            if (r >= 0)
                UserEvents.Text = "Answering Call";
            else
                UserEvents.Text = "Error on answering";
        }


        protected void UpdateActionButtons(Int32 actionMask)
        {

            BtnStart.Enabled = ((actionMask & AGFWEventsCode.ACT_START) > 0);
            BtnStop.Enabled = ((actionMask & AGFWEventsCode.ACT_STOP) > 0);
            BtnLogout.Enabled = ((actionMask & AGFWEventsCode.ACT_LOGOUT) > 0);
            
            BtnEndContact.Enabled = ((actionMask & AGFWEventsCode.ACT_END_CONTACT) > 0);
            BtnAnswer.Enabled = ((actionMask & AGFWEventsCode.ACT_SPH_ANSWERCALL) > 0);
            BtnClear.Enabled = ((actionMask & AGFWEventsCode.ACT_SPH_CLEARCALL) > 0);


        }

        private void BntEndContact_Click(object sender, EventArgs e)
        {
            TWSQInfo EndInfo = new TWSQInfo();
            EndInfo.QCode=int.Parse(TxtFinalCode.Text);

            int r = WSProxy.FinalizeContact(AgentLogin, EndInfo);
            if (r >= 0)
                UserEvents.Text = "Contact Codificated Correctly";
            else
                UserEvents.Text = "Error On Codificating Contact";
        }

        private void BtnClear_Click(object sender, EventArgs e)
        {
            int r = WSProxy.ClearCall(AgentLogin);
            if (r >= 0)
                UserEvents.Text = "Clearing Call";
            else
                UserEvents.Text = "Error Clearing Call";

        }


    }
}