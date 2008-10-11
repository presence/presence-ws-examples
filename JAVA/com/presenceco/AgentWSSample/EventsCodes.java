package com.presenceco.AgentWSSample;

public class EventsCodes {
	public final int ACT_ALL = 0xFFFF;
	public static final int ACT_START = 0x0001; // B-00000001
	public static final int ACT_STOP = 0x0002; // B-00000010
	public static final int ACT_LOGIN = 0x0004; // B-00000100
	public static final int ACT_LOGOUT = 0x0008; // B-00001000
	public static final int ACT_QUALIFY = 0x0010; // B-00010000
	public static final int ACT_CLEARCALL = 0x0020; // B-00100000
	public static final int ACT_INFO_CONTACT = 0x0040; // B-01000000
	public static final int ACT_SOFTPHONE = 0x0080; // B-10000000
	public static final int ACT_REC_DEMAND = 0x0100; // 00000001-B
	public static final int ACT_END_CONTACT = 0x0200; // 00000010-B
	public static final int ACT_ALTERNATIVE = 0x0400; // 00000100-B
	public static final int ACT_CONTACTCALL = 0x0800; // 00001000-B
	public static final int ACT_HISTORY = 0x1000; // 00010000-B
	public static final int ACT_TB_MSG = 0x2000; // 00100000-B
	public static final int ACT_TB_REC = 0x4000; // 01000000-B
	public static final int ACT_TB_SMS = 0x8000; // 10000000-B



	// Softphone masks
	public static final int ACT_SPH_ALL = 0xFF00;
	public static final int ACT_SPH_ANSWERCALL = 0x00010000;
	public static final int ACT_SPH_HOLDCALL = 0x00020000;
	public static final int ACT_SPH_RETRIEVECALL = 0x00040000;
	public static final int ACT_SPH_CLEARCALL = 0x00080000;
	public static final int ACT_SPH_TRANSFERCALL = 0x00100000;
	public static final int ACT_SPH_CONFERCALL = 0x00200000;
	public static final int ACT_SPH_MAKECALL = 0x00400000;
	public static final int ACT_SPH_CLEARALLCALL = 0x00800000;

	public static final int AGM_LOGIN_EVENT                     = 0x0F01;
	public static final int AGM_LOGOUT_EVENT                    = 0x0F02;
	public static final int AGM_CALL_ALERT                      = 0x0F03;
	public static final int AGM_END_CALL_ALERT                  = 0x0F04;
	public static final int AGM_STOP_SESSION                    = 0x0F05;
	public static final int AGM_EXTERNAL_STOP_SESSION           = 0x0F06;
	public static final int AGM_INBOUND_CALL                    = 0x0F07;
	public static final int AGM_OUTBOUND_CALL                   = 0x0F08;
	public static final int AGM_ACTION_CHANGE                   = 0x0F09;
	public static final int AGM_STATE_CHANGE                    = 0x0F0A;
	public static final int AGM_SERVICE_CHANGE                  = 0x0F0B;
	public static final int AGM_FINALIZE_CONTACT                = 0x0F0C;
	public static final int AGM_EXTERNALAPPS_CHANGE             = 0x0F0D;
	public static final int AGM_ALTERNATIVEPHONES_CHANGE        = 0x0F0E;
	public static final int AGM_SOUND_EVENT                     = 0x0F0F;
	public static final int AGM_ACW_EVENT                       = 0x0F10;
	public static final int AGM_MINACW_EVENT                    = 0x0F11;
	public static final int AGM_MAXACW_EVENT                    = 0x0F12;
	public static final int AGM_RECORDING_START                 = 0x0F13;
	public static final int AGM_RECORDING_STOP                  = 0x0F14;
	public static final int AGM_LINES_CHANGE                    = 0x0F15;
	public static final int AGM_STATION_CALL                    = 0x0F16;
	public static final int AGM_TRANSFER_RECEIVED               = 0x0F17;
	public static final int AGM_TRANSFER_COMPLETED              = 0x0F18;
	public static final int AGM_MAIL_SUSPEND_CHANGE             = 0x0F19;
	public static final int AGM_FATAL_ERROR                     = 0x0FFF;
}
