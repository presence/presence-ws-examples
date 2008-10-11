package com.presenceco.AgentWSSample;
import java.awt.BorderLayout;

import javax.swing.DefaultListModel;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JApplet;
import javax.swing.JScrollPane;

import java.awt.Dimension;
import javax.swing.JButton;

import org.tempuri.AgentServiceProxy;

import AgentLibrary.TAgentEvent;
import AgentLibrary.holders.TAgentEventListHolder;

import java.awt.Rectangle;
import java.rmi.RemoteException;
import javax.swing.JList;
import javax.swing.JTextArea;
import javax.swing.JTextPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.xml.rpc.holders.IntHolder;

public class SimpleAgent extends JApplet {

	private JPanel jContentPane = null;
	private JButton Login = null;
	private JButton BtnStart = null;
	private JButton BtnStop = null;
	private JButton BtnLogout = null;

	private AgentServiceProxy sp = null;  //  @jve:decl-index=0:
	private JTextArea EventsProcessedArea = null;
	private JLabel LblAgentLogin = null;
	private JLabel LblPassword = null;
	private JLabel LblStation = null;
	private JTextField TxtAgentLogin = null;
	private JTextField TxtAgentStation = null;
	private JPasswordField TxtPassword = null;
	
	
	// Agent Login Data
	int AgentLogin; 
	String AgentPassword;
	int AgentStation;
	private JButton BtnCheckEvents = null;
	private JButton BtnGetEvents = null;
	/**
	 * This is the xxx default constructor
	 */
	public SimpleAgent() {
		super();
	}

	/**
	 * This method initializes this
	 * 
	 * @return void
	 */
	public void init() {
		this.setSize(600, 600);
		this.setContentPane(getJContentPane());
		this.sp= new AgentServiceProxy();
		
		
	}

	/**
	 * This method initializes jContentPane
	 * 
	 * @return javax.swing.JPanel
	 */
	private JPanel getJContentPane() {
		if (jContentPane == null) {
			LblStation = new JLabel();
			LblStation.setBounds(new Rectangle(66, 93, 58, 16));
			LblStation.setText("Station");
			LblPassword = new JLabel();
			LblPassword.setBounds(new Rectangle(64, 65, 64, 16));
			LblPassword.setText("Password");
			LblAgentLogin = new JLabel();
			LblAgentLogin.setBounds(new Rectangle(62, 39, 72, 19));
			LblAgentLogin.setText("AgentLogin");
			jContentPane = new JPanel();
			jContentPane.setLayout(null);
			jContentPane.add(getLogin(), null);
			jContentPane.add(getBtnStart(), null);
			jContentPane.add(getBtnStop(), null);
			jContentPane.add(getBtnLogout(), null);
			jContentPane.add(getEventsProcessedArea(), null);
			jContentPane.add(LblAgentLogin, null);
			jContentPane.add(LblPassword, null);
			jContentPane.add(LblStation, null);
			jContentPane.add(getTxtAgentLogin(), null);
			jContentPane.add(getTxtAgentStation(), null);
			jContentPane.add(getTxtPassword(), null);
			jContentPane.add(getBtnCheckEvents(), null);
			jContentPane.add(getBtnGetEvents(), null);
			
			
		}
		return jContentPane;
	}

	/**
	 * This method initializes Login	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getLogin() {
		if (Login == null) {
			Login = new JButton();
			Login.setBounds(new Rectangle(66, 134, 73, 20));
			Login.setText("Login");
			Login.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					AgentLogin = Integer.parseInt(TxtAgentLogin.getText());
					AgentPassword = TxtPassword.getText();
					AgentStation = Integer.parseInt(TxtAgentStation.getText());
					
					
					EventsProcessedArea.setText("");
					EventsProcessedArea.append("User Event: "+ "Login Request\n");
				try {
					int r = sp.login(AgentLogin, AgentPassword, AgentStation, false);
					String response =  r>=0? "OK\n" :"No OK: "+r+"\n";
					EventsProcessedArea.append("Server Response: "+ response);
					
				} catch (RemoteException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			 
				
				}
			});
		}
		return Login;
	}

	/**
	 * This method initializes BtnStart	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getBtnStart() {
		if (BtnStart == null) {
			BtnStart = new JButton();
			BtnStart.setBounds(new Rectangle(153, 135, 63, 19));
			BtnStart.setText("Start");
			BtnStart.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					EventsProcessedArea.setText("");
					EventsProcessedArea.append("User Event: "+ "Start Request\n");
					try {
						int r= sp.startSession(AgentLogin);
						String response =  r>=0? "OK\n" :"No OK: "+r+"\n";
						EventsProcessedArea.append("Server Response: "+ response);
						
					} catch (RemoteException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					
				}
			});
		}
		return BtnStart;
	}

	/**
	 * This method initializes BtnStop	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getBtnStop() {
		if (BtnStop == null) {
			BtnStop = new JButton();
			BtnStop.setBounds(new Rectangle(227, 135, 61, 19));
			BtnStop.setText("Stop");
			BtnStop.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					EventsProcessedArea.setText("");
					EventsProcessedArea.append("User Event: "+ "Stop Request\n");
					try {
						int r = sp.stopSession(AgentLogin, 0);
						String response =  r>=0? "OK\n" :"No OK: "+r+"\n";
						EventsProcessedArea.append("Server Response: "+ response);
					} catch (RemoteException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
			});
		}
		return BtnStop;
	}

	/**
	 * This method initializes BtnLogout	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getBtnLogout() {
		if (BtnLogout == null) {
			BtnLogout = new JButton();
			BtnLogout.setBounds(new Rectangle(300, 135, 75, 19));
			BtnLogout.setText("Logout");
			BtnLogout.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					EventsProcessedArea.setText("");
					EventsProcessedArea.append("User Event: "+ "Logout Request\n");
					try {
						int r=sp.logout(AgentLogin, 0);
						String response =  r>=0? "OK\n" :"No OK: "+r+"\n";
						EventsProcessedArea.append("Server Response: "+ response);
					} catch (RemoteException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
			});
		}
		return BtnLogout;
	}

	/**
	 * This method initializes EventsProcessedArea1	
	 * 	
	 * @return javax.swing.JTextPane	
	 */
	

	/**
	 * This method initializes EventsProcessedArea	
	 * 	
	 * @return javax.swing.JTextArea	
	 */
	private JTextArea getEventsProcessedArea() {
		if (EventsProcessedArea == null) {
			EventsProcessedArea = new JTextArea();
			EventsProcessedArea.setBounds(new Rectangle(47, 170, 388, 364));
		}
		return EventsProcessedArea;
	}

	/**
	 * This method initializes TxtAgentLogin	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getTxtAgentLogin() {
		if (TxtAgentLogin == null) {
			TxtAgentLogin = new JTextField();
			TxtAgentLogin.setBounds(new Rectangle(153, 39, 87, 18));
		}
		return TxtAgentLogin;
	}

	/**
	 * This method initializes TxtAgentStation	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getTxtAgentStation() {
		if (TxtAgentStation == null) {
			TxtAgentStation = new JTextField();
			TxtAgentStation.setBounds(new Rectangle(152, 93, 85, 18));
		}
		return TxtAgentStation;
	}

	/**
	 * This method initializes TxtPassword	
	 * 	
	 * @return javax.swing.JPasswordField	
	 */
	private JPasswordField getTxtPassword() {
		if (TxtPassword == null) {
			TxtPassword = new JPasswordField();
			TxtPassword.setBounds(new Rectangle(153, 66, 84, 16));
		}
		return TxtPassword;
	}

	/**
	 * This method initializes BtnCheckEvents	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getBtnCheckEvents() {
		if (BtnCheckEvents == null) {
			BtnCheckEvents = new JButton();
			BtnCheckEvents.setBounds(new Rectangle(448, 179, 115, 22));
			BtnCheckEvents.setText("CheckEvents");
			BtnCheckEvents.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					EventsProcessedArea.setText("");
					EventsProcessedArea.append("User Event: "+ "Check Events Request\n");
					EventsProcessedArea.append("Note : If there are not events pending on server it will block during 3 seconds waiting for events\n" +
							"Finally if no pending events will return false" +
							"\n\n");
					try {
						boolean r = sp.waitForEvent(AgentLogin);
						String response =  r? "Events Waiting to be processed\n" :"No Pending Events: "+r+"\n";
						EventsProcessedArea.append("Server Response: "+ response);
					} catch (RemoteException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					
					
				}
			});
		}
		return BtnCheckEvents;
	}

	/**
	 * This method initializes BtnGetEvents	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getBtnGetEvents() {
		if (BtnGetEvents == null) {
			BtnGetEvents = new JButton();
			BtnGetEvents.setBounds(new Rectangle(447, 215, 116, 22));
			BtnGetEvents.setText("Get Events");
			BtnGetEvents.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					IntHolder result = new IntHolder();
					TAgentEventListHolder EventsList = new TAgentEventListHolder();			
					EventsProcessedArea.setText("");
					EventsProcessedArea.append("User Event: "+ "Retrieve Events Request\n");
					
					try {
						
						sp.getEvent(AgentLogin, result, EventsList);
						String response =  result.value>=0? "Events Retrieved correctly\n" :"Error : "+result.value+"\n";
						EventsProcessedArea.append("Server Response: "+ response + "\n");
						int index=0;
						while (index < EventsList.value.length)
							{
		
							TAgentEvent CurrentEvent = EventsList.value[index];
							
							switch(CurrentEvent.getEventCode())
							{
							case  EventsCodes.AGM_ACTION_CHANGE:
								EventsProcessedArea.append("Retrieved Event: "+ " Action Change, Action Mask =" + CurrentEvent.getEventFields()[0].getValue().toString() +"\n");
								break;
							
							case EventsCodes.AGM_STATE_CHANGE:
								EventsProcessedArea.append("Retrieved Event: "+ " Agent State Changed " + Integer.toHexString(CurrentEvent.getEventCode()) +"\n");
								break;
							default:
							
							EventsProcessedArea.append("Retrieved Event: "+ Integer.toHexString(CurrentEvent.getEventCode()) +"\n");
							break;
							}
							
							index++;
							}
							
						
							
						
					} catch (RemoteException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					
					
				}
			});
		}
		return BtnGetEvents;
	}
	


}  //  @jve:decl-index=0:visual-constraint="1,-3"
