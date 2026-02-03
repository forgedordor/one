package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ctah {
    public static final enly a(int i) {
        if (i == -1) {
            return enly.SUCCESS_CACHE;
        }
        if (i == 0) {
            return enly.SUCCESS;
        }
        if (i == 10) {
            return enly.DEVELOPER_ERROR;
        }
        switch (i) {
            case 4:
                return enly.SIGN_IN_REQUIRED;
            case 5:
                return enly.INVALID_ACCOUNT;
            case 6:
                return enly.RESOLUTION_REQUIRED;
            case 7:
                return enly.NETWORK_ERROR;
            case 8:
                return enly.INTERNAL_ERROR;
            default:
                switch (i) {
                    case 13:
                        return enly.GMS_ERROR;
                    case 14:
                        return enly.INTERRUPTED;
                    case 15:
                        return enly.TIMEOUT;
                    case 16:
                        return enly.CANCELED;
                    case 17:
                        return enly.API_NOT_CONNECTED;
                    case 18:
                        return enly.DEAD_CLIENT;
                    case 19:
                        return enly.REMOTE_EXCEPTION;
                    case 20:
                        return enly.CONNECTION_SUSPENDED_DURING_CALL;
                    case 21:
                        return enly.RECONNECTION_TIMED_OUT_DURING_UPDATE;
                    case 22:
                        return enly.RECONNECTION_TIMED_OUT;
                    default:
                        switch (i) {
                            case 4000:
                                return enly.TARGET_NODE_NOT_CONNECTED;
                            case 4001:
                                return enly.DUPLICATE_LISTENER;
                            case 4002:
                                return enly.UNKNOWN_LISTENER;
                            case 4003:
                                return enly.DATA_ITEM_TOO_LARGE;
                            case 4004:
                                return enly.INVALID_TARGET_NODE;
                            case 4005:
                                return enly.ASSET_UNAVAILABLE;
                            case 4006:
                                return enly.DUPLICATE_CAPABILITY;
                            case 4007:
                                return enly.UNKNOWN_CAPABILITY;
                            case 4008:
                                return enly.WIFI_CREDENTIAL_SYNC_NO_CREDENTIAL_FETCHED;
                            case 4009:
                                return enly.UNSUPPORTED_BY_TARGET_NODE;
                            default:
                                return enly.STATUS_CODE_NOT_MAPPED;
                        }
                }
        }
    }
}
