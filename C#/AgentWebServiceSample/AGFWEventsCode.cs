using System;
using System.Data;
using System.Configuration;
using System.Web;


namespace AgentWebServiceSample
{
    public class AGFWEventsCode
    {

    public const Int32 ACT_ALL = 0xFFFF;
    public const Int32 ACT_START = 0x0001; //B-00000001
    public const Int32 ACT_STOP = 0x0002; //B-00000010
    public const Int32 ACT_LOGIN = 0x0004; //B-00000100
    public const Int32 ACT_LOGOUT = 0x0008; //B-00001000
    public const Int32 ACT_QUALIFY = 0x0010; //B-00010000
    public const Int32 ACT_CLEARCALL = 0x0020; //B-00100000
    public const Int32 ACT_INFO_CONTACT = 0x0040; //B-01000000
    public const Int32 ACT_SOFTPHONE = 0x0080; //B-10000000
    public const Int32 ACT_REC_DEMAND = 0x0100; //00000001-B
    public const Int32 ACT_END_CONTACT = 0x0200; //00000010-B
    public const Int32 ACT_ALTERNATIVE = 0x0400; //00000100-B
    public const Int32 ACT_CONTACTCALL = 0x0800; //00001000-B
    public const Int32 ACT_HISTORY = 0x1000; //00010000-B
    public const Int32 ACT_TB_MSG = 0x2000; //00100000-B
    public const Int32 ACT_TB_REC = 0x4000; //01000000-B
    public const Int32 ACT_TB_SMS = 0x8000; //10000000-B



    //Softphone masks
    public const Int32 ACT_SPH_ALL = 0xFF00;
    public const Int32 ACT_SPH_ANSWERCALL = 0x00010000;
    public const Int32 ACT_SPH_HOLDCALL = 0x00020000;
    public const Int32 ACT_SPH_RETRIEVECALL = 0x00040000;
    public const Int32 ACT_SPH_CLEARCALL = 0x00080000;
    public const Int32 ACT_SPH_TRANSFERCALL = 0x00100000;
    public const Int32 ACT_SPH_CONFERCALL = 0x00200000;
    public const Int32 ACT_SPH_MAKECALL = 0x00400000;
    public const Int32 ACT_SPH_CLEARALLCALL = 0x00800000;


    public const Int32 AGM_LOGIN_EVENT                     = 0x0F01;
    public const Int32 AGM_LOGOUT_EVENT                    = 0x0F02;
    public const Int32 AGM_CALL_ALERT                      = 0x0F03;
    public const Int32 AGM_END_CALL_ALERT                  = 0x0F04;
    public const Int32 AGM_STOP_SESSION                    = 0x0F05;
    public const Int32 AGM_EXTERNAL_STOP_SESSION           = 0x0F06;
    public const Int32 AGM_INBOUND_CALL                    = 0x0F07;
    public const Int32 AGM_OUTBOUND_CALL                   = 0x0F08;
    public const Int32 AGM_ACTION_CHANGE                   = 0x0F09;
    public const Int32 AGM_STATE_CHANGE                    = 0x0F0A;
    public const Int32 AGM_SERVICE_CHANGE                  = 0x0F0B;
    public const Int32 AGM_FINALIZE_CONTACT                = 0x0F0C;
    public const Int32 AGM_EXTERNALAPPS_CHANGE             = 0x0F0D;
    public const Int32 AGM_ALTERNATIVEPHONES_CHANGE        = 0x0F0E;
    public const Int32 AGM_SOUND_EVENT                     = 0x0F0F;
    public const Int32 AGM_ACW_EVENT                       = 0x0F10;
    public const Int32 AGM_MINACW_EVENT                    = 0x0F11;
    public const Int32 AGM_MAXACW_EVENT                    = 0x0F12;
    public const Int32 AGM_RECORDING_START                 = 0x0F13;
    public const Int32 AGM_RECORDING_STOP                  = 0x0F14;
    public const Int32 AGM_LINES_CHANGE                    = 0x0F15;
    public const Int32 AGM_STATION_CALL                    = 0x0F16;
    public const Int32 AGM_TRANSFER_RECEIVED               = 0x0F17;
    public const Int32 AGM_TRANSFER_COMPLETED              = 0x0F18;
    public const Int32 AGM_MAIL_SUSPEND_CHANGE             = 0x0F19;
    public const Int32 AGM_FATAL_ERROR                     = 0x0FFF;



    }
}
