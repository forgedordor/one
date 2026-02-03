package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class enql implements evsv {
    static final evsv a = new enql();

    private enql() {
    }

    @Override // defpackage.evsv
    public final boolean a(int i) {
        enqm enqmVar;
        switch (i) {
            case 0:
                enqmVar = enqm.UNKNOWN;
                break;
            case 1:
                enqmVar = enqm.CANT_SYNC_WITH_TELEPHONY;
                break;
            case 2:
                enqmVar = enqm.SYNC_ALREADY_IN_PROGRESS;
                break;
            case 3:
                enqmVar = enqm.BUGLE_NOT_DEFAULT_SMS_APP;
                break;
            case 4:
                enqmVar = enqm.BATCH_IS_ORPHAN;
                break;
            case 5:
                enqmVar = enqm.BATCH_IS_DIRTY;
                break;
            case 6:
                enqmVar = enqm.CURSOR_SCAN_FAILED;
                break;
            case 7:
                enqmVar = enqm.MISSING_PERMISSIONS;
                break;
            case 8:
                enqmVar = enqm.FAILED_TO_UPDATE_FIRST_FULL_SYNC_TIMESTAMP;
                break;
            case 9:
                enqmVar = enqm.PARTIAL_SYNC_QUEUED;
                break;
            case 10:
                enqmVar = enqm.FULL_SYNC_DELAYED;
                break;
            case 11:
                enqmVar = enqm.FULL_SYNC_DO_NOT_START;
                break;
            case 12:
                enqmVar = enqm.WEAR_UTIL_IS_PRESENT;
                break;
            case 13:
                enqmVar = enqm.NOT_SMS_CAPABLE;
                break;
            case 14:
                enqmVar = enqm.SMS_NOT_ALLOWED_FOR_USER;
                break;
            case 15:
                enqmVar = enqm.SYNC_DISABLED;
                break;
            case 16:
                enqmVar = enqm.REDESIGN_DISABLED_DURING_EXECUTION;
                break;
            case 17:
                enqmVar = enqm.REDESIGN_ENABLED_DURING_EXECUTION;
                break;
            case 18:
                enqmVar = enqm.NON_SMS_CAPABLE_WEAR_DEVICE;
                break;
            case 19:
                enqmVar = enqm.DUPLICATE_TELEPHONY_MESSAGE_TIMESTAMP_FOUND;
                break;
            case 20:
                enqmVar = enqm.OLDER_MESSAGES_OUT_OF_SYNC_AFTER_RETRY;
                break;
            case 21:
                enqmVar = enqm.RECENT_MESSAGES_OUT_OF_SYNC_AFTER_RETRY;
                break;
            case 22:
                enqmVar = enqm.STALLED;
                break;
            default:
                enqmVar = null;
                break;
        }
        return enqmVar != null;
    }
}
