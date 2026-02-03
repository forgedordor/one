package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ewna implements evsv {
    static final evsv a = new ewna();

    private ewna() {
    }

    @Override // defpackage.evsv
    public final boolean a(int i) {
        ewnb ewnbVar;
        switch (i) {
            case 0:
                ewnbVar = ewnb.REGISTRATION_EVENT_MESSAGE_UNKNOWN;
                break;
            case 1:
                ewnbVar = ewnb.REGISTRATION_EVENT_MESSAGE_SEND_SIP_MESSAGE;
                break;
            case 2:
                ewnbVar = ewnb.REGISTRATION_EVENT_MESSAGE_RECEIVE_SIP_RESPONSE;
                break;
            case 3:
                ewnbVar = ewnb.REGISTRATION_EVENT_MESSAGE_SIP_REQUEST_TIMEOUT;
                break;
            case 4:
                ewnbVar = ewnb.REGISTRATION_EVENT_MESSAGE_CONNECTIVITY_EVENT;
                break;
            case 5:
                ewnbVar = ewnb.REGISTRATION_EVENT_MESSAGE_TRANSPORT_ERROR;
                break;
            case 6:
                ewnbVar = ewnb.REGISTRATION_EVENT_MESSAGE_START_REGISTRATION;
                break;
            case 7:
                ewnbVar = ewnb.REGISTRATION_EVENT_MESSAGE_STOP_REGISTRATION;
                break;
            case 8:
                ewnbVar = ewnb.REGISTRATION_EVENT_MESSAGE_DISCOVER_SIP_SERVER;
                break;
            case 9:
                ewnbVar = ewnb.REGISTRATION_EVENT_MESSAGE_CONNECT_TO_SERVER;
                break;
            case 10:
                ewnbVar = ewnb.REGISTRATION_EVENT_MESSAGE_CONNECTED_TO_SERVER;
                break;
            case 11:
                ewnbVar = ewnb.REGISTRATION_EVENT_MESSAGE_REFRESH_TIMEOUT;
                break;
            case 12:
                ewnbVar = ewnb.REGISTRATION_EVENT_MESSAGE_RETRY_TIMEOUT;
                break;
            case 13:
                ewnbVar = ewnb.REGISTRATION_EVENT_MESSAGE_REREGISTRATION_REQUIRED;
                break;
            case 14:
                ewnbVar = ewnb.REGISTRATION_EVENT_MESSAGE_SIM_DETECTED;
                break;
            case 15:
                ewnbVar = ewnb.REGISTRATION_EVENT_MESSAGE_SIM_REMOVED;
                break;
            case 16:
                ewnbVar = ewnb.REGISTRATION_EVENT_MESSAGE_CONNECTION_CREATED;
                break;
            case 17:
                ewnbVar = ewnb.REGISTRATION_EVENT_MESSAGE_CONNECTION_DESTROYED;
                break;
            case 18:
                ewnbVar = ewnb.REGISTRATION_EVENT_MESSAGE_CONFIGURED;
                break;
            case 19:
                ewnbVar = ewnb.REGISTRATION_EVENT_MESSAGE_ACTIVATE;
                break;
            case 20:
                ewnbVar = ewnb.REGISTRATION_EVENT_MESSAGE_DEACTIVATE;
                break;
            case 21:
                ewnbVar = ewnb.REGISTRATION_EVENT_MESSAGE_REGISTRATION_FAILED;
                break;
            case 22:
                ewnbVar = ewnb.REGISTRATION_EVENT_MESSAGE_REGISTER_TIMEOUT;
                break;
            case 23:
                ewnbVar = ewnb.REGISTRATION_EVENT_MESSAGE_PUBLISH_TIMEOUT;
                break;
            case 24:
                ewnbVar = ewnb.REGISTRATION_EVENT_MESSAGE_PUBLISH_200OK_RESPONSE;
                break;
            case 25:
                ewnbVar = ewnb.REGISTRATION_EVENT_MESSAGE_PUBLISH_FAILED_RESPONSE;
                break;
            case 26:
                ewnbVar = ewnb.REGISTRATION_EVENT_MESSAGE_CONNECTION_TIMEOUT;
                break;
            case 27:
                ewnbVar = ewnb.REGISTRATION_EVENT_MESSAGE_CONNECT_TO_SERVER_FAILURE;
                break;
            default:
                ewnbVar = null;
                break;
        }
        return ewnbVar != null;
    }
}
