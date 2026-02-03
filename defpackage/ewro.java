package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ewro implements evsv {
    public static final evsv a = new ewro();

    private ewro() {
    }

    @Override // defpackage.evsv
    public final boolean a(int i) {
        ewrp ewrpVar;
        switch (i) {
            case 0:
                ewrpVar = ewrp.RCS_PROVISIONING_UNKNOWN_STATE;
                break;
            case 1:
                ewrpVar = ewrp.RCS_PROVISIONING_ENABLED_STATE;
                break;
            case 2:
                ewrpVar = ewrp.RCS_PROVISIONING_DISABLED_STATE;
                break;
            case 3:
                ewrpVar = ewrp.RCS_PROVISIONING_READY_STATE;
                break;
            case 4:
                ewrpVar = ewrp.RCS_PROVISIONING_IN_PROGRESS_STATE;
                break;
            case 5:
                ewrpVar = ewrp.RCS_PROVISIONING_RETRY_STATE;
                break;
            case 6:
                ewrpVar = ewrp.RCS_PROVISIONING_CONFIGURED_STATE;
                break;
            case 7:
                ewrpVar = ewrp.RCS_PROVISIONING_WAITING_FOR_NETWORK_STATE;
                break;
            case 8:
                ewrpVar = ewrp.RCS_PROVISIONING_WAITING_FOR_CONSENT_STATE;
                break;
            case 9:
                ewrpVar = ewrp.RCS_PROVISIONING_WAITING_FOR_CONSTELLATION_CONSENT_STATE;
                break;
            case 10:
                ewrpVar = ewrp.RCS_PROVISIONING_WAITING_FOR_GOOGLE_TOS_STATE;
                break;
            case 11:
                ewrpVar = ewrp.RCS_PROVISIONING_WAITING_FOR_BATTERY_OPTIMIZATION_STATE;
                break;
            case 12:
                ewrpVar = ewrp.RCS_PROVISIONING_WAITING_FOR_TERMS_AND_CONDITIONS_STATE;
                break;
            case 13:
                ewrpVar = ewrp.RCS_PROVISIONING_WAITING_FOR_OTP_STATE;
                break;
            case 14:
                ewrpVar = ewrp.RCS_PROVISIONING_CHECK_PRECONDITIONS_STATE;
                break;
            case 15:
                ewrpVar = ewrp.RCS_PROVISIONING_REQUEST_WITH_HE_STATE;
                break;
            case 16:
                ewrpVar = ewrp.RCS_PROVISIONING_REQUEST_WITH_HE_PROXY_STATE;
                break;
            case 17:
                ewrpVar = ewrp.RCS_PROVISIONING_REQUEST_WITHOUT_AUTH_STATE;
                break;
            case 18:
                ewrpVar = ewrp.RCS_PROVISIONING_REQUEST_WITH_TOKEN_STATE;
                break;
            case 19:
                ewrpVar = ewrp.RCS_PROVISIONING_REQUEST_WITH_IMSI_STATE;
                break;
            case 20:
                ewrpVar = ewrp.RCS_PROVISIONING_REQUEST_WITH_MSISDN_STATE;
                break;
            case 21:
                ewrpVar = ewrp.RCS_PROVISIONING_PROCESS_CONFIGURATION_STATE;
                break;
            case 22:
                ewrpVar = ewrp.RCS_PROVISIONING_VERIFY_OTP_STATE;
                break;
            case 23:
                ewrpVar = ewrp.RCS_PROVISIONING_WAITING_FOR_MANUAL_MSISDN_ENTRY_STATE;
                break;
            case 24:
                ewrpVar = ewrp.RCS_PROVISIONING_REPLAY_REQUEST_STATE;
                break;
            case 25:
                ewrpVar = ewrp.RCS_PROVISIONING_SEND_DISABLE_RCS_STATE;
                break;
            case 26:
                ewrpVar = ewrp.RCS_PROVISIONING_DISABLE_RCS_RETRY_STATE;
                break;
            case 27:
                ewrpVar = ewrp.RCS_PROVISIONING_REPLAY_DISABLE_RCS_REQUEST_STATE;
                break;
            case 28:
                ewrpVar = ewrp.RCS_PROVISIONING_SET_GOOGLE_TOS_CONSENT_STATE;
                break;
            case 29:
                ewrpVar = ewrp.RCS_PROVISIONING_GET_GOOGLE_TOS_CONSENT_STATE;
                break;
            case 30:
                ewrpVar = ewrp.RCS_PROVISIONING_REQUEST_WITH_MSISDN_TOKEN_STATE;
                break;
            case 31:
                ewrpVar = ewrp.RCS_PROVISIONING_VERIFY_MSISDN_STATE;
                break;
            case 32:
                ewrpVar = ewrp.RCS_PROVISIONING_WAITING_FOR_RCS_DEFAULT_ON_STATE;
                break;
            case 33:
                ewrpVar = ewrp.RCS_PROVISIONING_WAITING_FOR_APP_OPEN_STATE;
                break;
            case 34:
                ewrpVar = ewrp.RCS_PROVISIONING_REQUEST_ATTESTATION_STATE;
                break;
            default:
                ewrpVar = null;
                break;
        }
        return ewrpVar != null;
    }
}
