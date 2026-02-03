package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class enop implements evsv {
    static final evsv a = new enop();

    private enop() {
    }

    @Override // defpackage.evsv
    public final boolean a(int i) {
        enoq enoqVar;
        switch (i) {
            case 0:
                enoqVar = enoq.UNKNOWN;
                break;
            case 1:
                enoqVar = enoq.NOT_ENABLED;
                break;
            case 2:
                enoqVar = enoq.FALLBACK_TO_TELEPHONY;
                break;
            case 3:
                enoqVar = enoq.LOST_CONNECTION;
                break;
            case 4:
                enoqVar = enoq.THROTTLED;
                break;
            case 5:
                enoqVar = enoq.NO_PERMISSIONS;
                break;
            case 6:
                enoqVar = enoq.FAILED_TO_CREATE_BACKUP;
                break;
            case 7:
                enoqVar = enoq.RETRIES_FAILED;
                break;
            case 8:
                enoqVar = enoq.FILE_NOT_FOUND;
                break;
            case 9:
                enoqVar = enoq.UNEXPECTED_EXCEPTION;
                break;
            case 10:
                enoqVar = enoq.STABLE_RESTORE_VERSION_NOT_AVAILABLE;
                break;
            case 11:
                enoqVar = enoq.HEURISTICS_FAILED;
                break;
            case 12:
                enoqVar = enoq.MISSING_SESSION_ID;
                break;
            case 13:
                enoqVar = enoq.EMPTY_PFD;
                break;
            case 14:
                enoqVar = enoq.BACKUP_DB_COPY_FAILED;
                break;
            case 15:
                enoqVar = enoq.ATTACHMENT_COPY_FAILED;
                break;
            case 16:
                enoqVar = enoq.INVALID_REQUEST_ARGUMENT;
                break;
            case 17:
                enoqVar = enoq.EXPLICIT_WRITE_LOCK_DISABLED;
                break;
            case 18:
                enoqVar = enoq.SOURCE_MESSAGES_VERSION_TOO_LOW;
                break;
            case 19:
                enoqVar = enoq.TARGET_MESSAGES_VERSION_TOO_LOW;
                break;
            case 20:
                enoqVar = enoq.HEURISTICS_FAILED_TRANSFER_ZERO_FILES;
                break;
            case 21:
                enoqVar = enoq.NOT_DEFAULT_SMS_APP;
                break;
            case 22:
                enoqVar = enoq.MISSING_ITEM_METADATA;
                break;
            case 23:
                enoqVar = enoq.SESSION_ID_EMPTY;
                break;
            case 24:
                enoqVar = enoq.UNEXPECTED_SESSION_ID_BYTE_LENGTH;
                break;
            default:
                enoqVar = null;
                break;
        }
        return enoqVar != null;
    }
}
