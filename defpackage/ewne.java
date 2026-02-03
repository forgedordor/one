package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ewne implements evsv {
    static final evsv a = new ewne();

    private ewne() {
    }

    @Override // defpackage.evsv
    public final boolean a(int i) {
        ewnf ewnfVar;
        switch (i) {
            case 0:
                ewnfVar = ewnf.SIP_REGISTRATION_STATE_UNKNOWN;
                break;
            case 1:
                ewnfVar = ewnf.SIP_REGISTRATION_STOPPED_STATE;
                break;
            case 2:
                ewnfVar = ewnf.SIP_REGISTRATION_READY_STATE;
                break;
            case 3:
                ewnfVar = ewnf.SIP_REGISTRATION_WAIT_FOR_NETWORK_STATE;
                break;
            case 4:
                ewnfVar = ewnf.SIP_REGISTRATION_CONNECTING_STATE;
                break;
            case 5:
                ewnfVar = ewnf.SIP_REGISTRATION_REGISTERING_STATE;
                break;
            case 6:
                ewnfVar = ewnf.SIP_REGISTRATION_REGISTERED_STATE;
                break;
            case 7:
                ewnfVar = ewnf.SIP_REGISTRATION_SUBSCRIBING_STATE;
                break;
            case 8:
                ewnfVar = ewnf.SIP_REGISTRATION_SUBSCRIBED_STATE;
                break;
            case 9:
                ewnfVar = ewnf.SIP_REGISTRATION_REREGISTERING_STATE;
                break;
            case 10:
                ewnfVar = ewnf.SIP_REGISTRATION_REREGISTERED_STATE;
                break;
            case 11:
                ewnfVar = ewnf.SIP_REGISTRATION_DEREGISTERING_STATE;
                break;
            case 12:
                ewnfVar = ewnf.SIP_REGISTRATION_DEREGISTERED_STATE;
                break;
            case 13:
                ewnfVar = ewnf.SIP_REGISTRATION_RECONFIGURATION_REQUIRED_STATE;
                break;
            case 14:
                ewnfVar = ewnf.SIP_REGISTRATION_RETRY_STATE;
                break;
            case 15:
                ewnfVar = ewnf.SIP_REGISTRATION_DISABLED_STATE;
                break;
            case 16:
                ewnfVar = ewnf.SIP_REGISTRATION_SIM_REMOVED_STATE;
                break;
            case 17:
                ewnfVar = ewnf.SIP_REGISTRATION_RECEIVE_CONFIGURATION_STATE;
                break;
            case 18:
                ewnfVar = ewnf.SIP_REGISTRATION_RECEIVE_FEATURE_TAGS_STATE;
                break;
            case 19:
                ewnfVar = ewnf.SIP_REGISTRATION_INACTIVE_STATE;
                break;
            case 20:
                ewnfVar = ewnf.SIP_REGISTRATION_TERMINATED_STATE;
                break;
            case 21:
                ewnfVar = ewnf.SIP_REGISTRATION_PUBLISHED_STATE;
                break;
            default:
                ewnfVar = null;
                break;
        }
        return ewnfVar != null;
    }
}
