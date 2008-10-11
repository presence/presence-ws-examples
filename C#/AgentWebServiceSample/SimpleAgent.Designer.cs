namespace AgentWebServiceSample
{
    partial class SimpleAgent
    {
        /// <summary>
        /// Required designer variable.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        /// Clean up any resources being used.
        /// </summary>
        /// <param name="disposing">true if managed resources should be disposed; otherwise, false.</param>
        protected override void Dispose(bool disposing)
        {
            if (disposing && (components != null))
            {
                components.Dispose();
            }
            base.Dispose(disposing);
        }

        #region Windows Form Designer generated code

        /// <summary>
        /// Required method for Designer support - do not modify
        /// the contents of this method with the code editor.
        /// </summary>
        private void InitializeComponent()
        {
            this.label1 = new System.Windows.Forms.Label();
            this.label2 = new System.Windows.Forms.Label();
            this.label3 = new System.Windows.Forms.Label();
            this.TxTAgentLogin = new System.Windows.Forms.TextBox();
            this.TxTPassword = new System.Windows.Forms.TextBox();
            this.TxTStation = new System.Windows.Forms.TextBox();
            this.BtnLogin = new System.Windows.Forms.Button();
            this.BtnStart = new System.Windows.Forms.Button();
            this.BtnStop = new System.Windows.Forms.Button();
            this.BtnLogout = new System.Windows.Forms.Button();
            this.UserEvents = new System.Windows.Forms.TextBox();
            this.BtnClose = new System.Windows.Forms.Button();
            this.ServerEvents = new System.Windows.Forms.RichTextBox();
            this.label4 = new System.Windows.Forms.Label();
            this.label5 = new System.Windows.Forms.Label();
            this.BtnAnswer = new System.Windows.Forms.Button();
            this.BtnEndContact = new System.Windows.Forms.Button();
            this.BtnClear = new System.Windows.Forms.Button();
            this.TxtFinalCode = new System.Windows.Forms.TextBox();
            this.label6 = new System.Windows.Forms.Label();
            this.SuspendLayout();
            // 
            // label1
            // 
            this.label1.AutoSize = true;
            this.label1.Location = new System.Drawing.Point(125, 17);
            this.label1.Name = "label1";
            this.label1.Size = new System.Drawing.Size(64, 13);
            this.label1.TabIndex = 0;
            this.label1.Text = "Agent Login";
            // 
            // label2
            // 
            this.label2.AutoSize = true;
            this.label2.Location = new System.Drawing.Point(136, 41);
            this.label2.Name = "label2";
            this.label2.Size = new System.Drawing.Size(53, 13);
            this.label2.TabIndex = 1;
            this.label2.Text = "Password";
            // 
            // label3
            // 
            this.label3.AutoSize = true;
            this.label3.Location = new System.Drawing.Point(149, 67);
            this.label3.Name = "label3";
            this.label3.Size = new System.Drawing.Size(40, 13);
            this.label3.TabIndex = 2;
            this.label3.Text = "Station";
            // 
            // TxTAgentLogin
            // 
            this.TxTAgentLogin.Location = new System.Drawing.Point(195, 10);
            this.TxTAgentLogin.Name = "TxTAgentLogin";
            this.TxTAgentLogin.Size = new System.Drawing.Size(100, 20);
            this.TxTAgentLogin.TabIndex = 3;
            // 
            // TxTPassword
            // 
            this.TxTPassword.Location = new System.Drawing.Point(195, 34);
            this.TxTPassword.Name = "TxTPassword";
            this.TxTPassword.PasswordChar = '*';
            this.TxTPassword.Size = new System.Drawing.Size(100, 20);
            this.TxTPassword.TabIndex = 4;
            // 
            // TxTStation
            // 
            this.TxTStation.Location = new System.Drawing.Point(195, 60);
            this.TxTStation.Name = "TxTStation";
            this.TxTStation.Size = new System.Drawing.Size(100, 20);
            this.TxTStation.TabIndex = 5;
            // 
            // BtnLogin
            // 
            this.BtnLogin.Location = new System.Drawing.Point(19, 106);
            this.BtnLogin.Name = "BtnLogin";
            this.BtnLogin.Size = new System.Drawing.Size(75, 23);
            this.BtnLogin.TabIndex = 6;
            this.BtnLogin.Text = "Login";
            this.BtnLogin.UseVisualStyleBackColor = true;
            this.BtnLogin.Click += new System.EventHandler(this.BtnLogin_Click);
            // 
            // BtnStart
            // 
            this.BtnStart.Location = new System.Drawing.Point(100, 106);
            this.BtnStart.Name = "BtnStart";
            this.BtnStart.Size = new System.Drawing.Size(75, 23);
            this.BtnStart.TabIndex = 7;
            this.BtnStart.Text = "Start";
            this.BtnStart.UseVisualStyleBackColor = true;
            this.BtnStart.Click += new System.EventHandler(this.BtnStart_Click);
            // 
            // BtnStop
            // 
            this.BtnStop.Location = new System.Drawing.Point(181, 105);
            this.BtnStop.Name = "BtnStop";
            this.BtnStop.Size = new System.Drawing.Size(75, 23);
            this.BtnStop.TabIndex = 8;
            this.BtnStop.Text = "Stop";
            this.BtnStop.UseVisualStyleBackColor = true;
            this.BtnStop.Click += new System.EventHandler(this.BtnStop_Click);
            // 
            // BtnLogout
            // 
            this.BtnLogout.Location = new System.Drawing.Point(521, 105);
            this.BtnLogout.Name = "BtnLogout";
            this.BtnLogout.Size = new System.Drawing.Size(75, 23);
            this.BtnLogout.TabIndex = 9;
            this.BtnLogout.Text = "Logout";
            this.BtnLogout.UseVisualStyleBackColor = true;
            this.BtnLogout.Click += new System.EventHandler(this.BtnLogout_Click);
            // 
            // UserEvents
            // 
            this.UserEvents.Location = new System.Drawing.Point(29, 165);
            this.UserEvents.Multiline = true;
            this.UserEvents.Name = "UserEvents";
            this.UserEvents.Size = new System.Drawing.Size(215, 181);
            this.UserEvents.TabIndex = 12;
            // 
            // BtnClose
            // 
            this.BtnClose.Location = new System.Drawing.Point(537, 352);
            this.BtnClose.Name = "BtnClose";
            this.BtnClose.Size = new System.Drawing.Size(75, 23);
            this.BtnClose.TabIndex = 14;
            this.BtnClose.Text = "Close";
            this.BtnClose.UseVisualStyleBackColor = true;
            this.BtnClose.Click += new System.EventHandler(this.button1_Click);
            // 
            // ServerEvents
            // 
            this.ServerEvents.Location = new System.Drawing.Point(263, 165);
            this.ServerEvents.Name = "ServerEvents";
            this.ServerEvents.ScrollBars = System.Windows.Forms.RichTextBoxScrollBars.Vertical;
            this.ServerEvents.Size = new System.Drawing.Size(289, 181);
            this.ServerEvents.TabIndex = 15;
            this.ServerEvents.Text = "";
            // 
            // label4
            // 
            this.label4.AutoSize = true;
            this.label4.Location = new System.Drawing.Point(29, 146);
            this.label4.Name = "label4";
            this.label4.Size = new System.Drawing.Size(65, 13);
            this.label4.TabIndex = 16;
            this.label4.Text = "User Events";
            // 
            // label5
            // 
            this.label5.AutoSize = true;
            this.label5.Location = new System.Drawing.Point(260, 149);
            this.label5.Name = "label5";
            this.label5.Size = new System.Drawing.Size(144, 13);
            this.label5.TabIndex = 17;
            this.label5.Text = "Asynchronous Server Events";
            // 
            // BtnAnswer
            // 
            this.BtnAnswer.Location = new System.Drawing.Point(263, 105);
            this.BtnAnswer.Name = "BtnAnswer";
            this.BtnAnswer.Size = new System.Drawing.Size(75, 23);
            this.BtnAnswer.TabIndex = 18;
            this.BtnAnswer.Text = "Answer Call";
            this.BtnAnswer.UseVisualStyleBackColor = true;
            this.BtnAnswer.Click += new System.EventHandler(this.BtnAnswer_Click);
            // 
            // BtnEndContact
            // 
            this.BtnEndContact.Location = new System.Drawing.Point(430, 105);
            this.BtnEndContact.Name = "BtnEndContact";
            this.BtnEndContact.Size = new System.Drawing.Size(75, 23);
            this.BtnEndContact.TabIndex = 19;
            this.BtnEndContact.Text = "EndContact";
            this.BtnEndContact.UseVisualStyleBackColor = true;
            this.BtnEndContact.Click += new System.EventHandler(this.BntEndContact_Click);
            // 
            // BtnClear
            // 
            this.BtnClear.Location = new System.Drawing.Point(345, 104);
            this.BtnClear.Name = "BtnClear";
            this.BtnClear.Size = new System.Drawing.Size(75, 23);
            this.BtnClear.TabIndex = 20;
            this.BtnClear.Text = "Clear Call";
            this.BtnClear.UseVisualStyleBackColor = true;
            this.BtnClear.Click += new System.EventHandler(this.BtnClear_Click);
            // 
            // TxtFinalCode
            // 
            this.TxtFinalCode.Location = new System.Drawing.Point(430, 41);
            this.TxtFinalCode.Name = "TxtFinalCode";
            this.TxtFinalCode.Size = new System.Drawing.Size(100, 20);
            this.TxtFinalCode.TabIndex = 21;
            this.TxtFinalCode.Text = "667";
            // 
            // label6
            // 
            this.label6.AutoSize = true;
            this.label6.Location = new System.Drawing.Point(355, 47);
            this.label6.Name = "label6";
            this.label6.Size = new System.Drawing.Size(57, 13);
            this.label6.TabIndex = 22;
            this.label6.Text = "Final Code";
            // 
            // SimpleAgent
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(624, 387);
            this.Controls.Add(this.label6);
            this.Controls.Add(this.TxtFinalCode);
            this.Controls.Add(this.BtnClear);
            this.Controls.Add(this.BtnEndContact);
            this.Controls.Add(this.BtnAnswer);
            this.Controls.Add(this.label5);
            this.Controls.Add(this.label4);
            this.Controls.Add(this.ServerEvents);
            this.Controls.Add(this.BtnClose);
            this.Controls.Add(this.UserEvents);
            this.Controls.Add(this.BtnLogout);
            this.Controls.Add(this.BtnStop);
            this.Controls.Add(this.BtnStart);
            this.Controls.Add(this.BtnLogin);
            this.Controls.Add(this.TxTStation);
            this.Controls.Add(this.TxTPassword);
            this.Controls.Add(this.TxTAgentLogin);
            this.Controls.Add(this.label3);
            this.Controls.Add(this.label2);
            this.Controls.Add(this.label1);
            this.Name = "SimpleAgent";
            this.Text = "Form1";
            this.Load += new System.EventHandler(this.SimpleAgent_Load);
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.Label label1;
        private System.Windows.Forms.Label label2;
        private System.Windows.Forms.Label label3;
        private System.Windows.Forms.TextBox TxTAgentLogin;
        private System.Windows.Forms.TextBox TxTPassword;
        private System.Windows.Forms.TextBox TxTStation;
        private System.Windows.Forms.Button BtnLogin;
        private System.Windows.Forms.Button BtnStart;
        private System.Windows.Forms.Button BtnStop;
        private System.Windows.Forms.Button BtnLogout;
        private System.Windows.Forms.TextBox UserEvents;
        private System.Windows.Forms.Button BtnClose;
        private System.Windows.Forms.RichTextBox ServerEvents;
        private System.Windows.Forms.Label label4;
        private System.Windows.Forms.Label label5;
        private System.Windows.Forms.Button BtnAnswer;
        private System.Windows.Forms.Button BtnEndContact;
        private System.Windows.Forms.Button BtnClear;
        private System.Windows.Forms.TextBox TxtFinalCode;
        private System.Windows.Forms.Label label6;
    }
}

