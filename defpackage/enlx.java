package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class enlx implements evsv {
    static final evsv a = new enlx();

    private enlx() {
    }

    @Override // defpackage.evsv
    public final boolean a(int i) {
        enly enlyVar;
        switch (i) {
            case 0:
                enlyVar = enly.UNKNOWN_RESULT_STATUS;
                break;
            case 1:
                enlyVar = enly.SUCCESS_CACHE;
                break;
            case 2:
                enlyVar = enly.SUCCESS;
                break;
            case 3:
                enlyVar = enly.STATUS_CODE_NOT_MAPPED;
                break;
            case 4:
                enlyVar = enly.GMS_ERROR;
                break;
            case 5:
                enlyVar = enly.TARGET_NODE_NOT_CONNECTED;
                break;
            case 6:
                enlyVar = enly.DUPLICATE_LISTENER;
                break;
            case 7:
                enlyVar = enly.UNKNOWN_LISTENER;
                break;
            case 8:
                enlyVar = enly.DATA_ITEM_TOO_LARGE;
                break;
            case 9:
                enlyVar = enly.INVALID_TARGET_NODE;
                break;
            case 10:
                enlyVar = enly.ASSET_UNAVAILABLE;
                break;
            case 11:
                enlyVar = enly.DUPLICATE_CAPABILITY;
                break;
            case 12:
                enlyVar = enly.UNKNOWN_CAPABILITY;
                break;
            case 13:
                enlyVar = enly.WIFI_CREDENTIAL_SYNC_NO_CREDENTIAL_FETCHED;
                break;
            case 14:
                enlyVar = enly.UNSUPPORTED_BY_TARGET_NODE;
                break;
            case 15:
                enlyVar = enly.SIGN_IN_REQUIRED;
                break;
            case 16:
                enlyVar = enly.INVALID_ACCOUNT;
                break;
            case 17:
                enlyVar = enly.RESOLUTION_REQUIRED;
                break;
            case 18:
                enlyVar = enly.NETWORK_ERROR;
                break;
            case 19:
                enlyVar = enly.INTERNAL_ERROR;
                break;
            case 20:
                enlyVar = enly.DEVELOPER_ERROR;
                break;
            case 21:
                enlyVar = enly.INTERRUPTED;
                break;
            case 22:
                enlyVar = enly.TIMEOUT;
                break;
            case 23:
                enlyVar = enly.CANCELED;
                break;
            case 24:
                enlyVar = enly.API_NOT_CONNECTED;
                break;
            case 25:
                enlyVar = enly.DEAD_CLIENT;
                break;
            case 26:
                enlyVar = enly.REMOTE_EXCEPTION;
                break;
            case 27:
                enlyVar = enly.CONNECTION_SUSPENDED_DURING_CALL;
                break;
            case 28:
                enlyVar = enly.RECONNECTION_TIMED_OUT_DURING_UPDATE;
                break;
            case 29:
                enlyVar = enly.RECONNECTION_TIMED_OUT;
                break;
            case 30:
                enlyVar = enly.CLIENT_FAILURE;
                break;
            case 31:
                enlyVar = enly.TASK_TIMEOUT;
                break;
            case 32:
                enlyVar = enly.FEATURE_UNSUPPORTED;
                break;
            case 33:
                enlyVar = enly.REMOTE_ERROR;
                break;
            case 34:
                enlyVar = enly.REMOTE_PARSE_ERROR;
                break;
            case 35:
                enlyVar = enly.REMOTE_EXECUTION_TIMEOUT;
                break;
            case 36:
                enlyVar = enly.REMOTE_INVALID_PARAMETER;
                break;
            case 37:
                enlyVar = enly.RESPONSE_PARSE_ERROR;
                break;
            default:
                enlyVar = null;
                break;
        }
        return enlyVar != null;
    }
}
