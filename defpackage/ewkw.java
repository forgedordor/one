package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ewkw implements evsv {
    static final evsv a = new ewkw();

    private ewkw() {
    }

    @Override // defpackage.evsv
    public final boolean a(int i) {
        ewkx ewkxVar;
        switch (i) {
            case 0:
                ewkxVar = ewkx.FILE_TRANSFER_FAILURE_REASON_UNKNOWN;
                break;
            case 1:
                ewkxVar = ewkx.FILE_TRANSFER_FAILURE_REASON_FILE_TRANSFER_CANCELLED;
                break;
            case 2:
                ewkxVar = ewkx.FILE_TRANSFER_FAILURE_REASON_HTTP_REQUEST_FAILED;
                break;
            case 3:
                ewkxVar = ewkx.FILE_TRANSFER_FAILURE_REASON_EMPTY_HTTP_RESPONSE_BODY;
                break;
            case 4:
                ewkxVar = ewkx.FILE_TRANSFER_FAILURE_REASON_UNEXPECTED_HTTP_RESPONSE_CODE;
                break;
            case 5:
                ewkxVar = ewkx.FILE_TRANSFER_FAILURE_REASON_MAX_RETRIES_REACHED;
                break;
            case 6:
                ewkxVar = ewkx.FILE_TRANSFER_FAILURE_REASON_SESSION_ERROR;
                break;
            case 7:
                ewkxVar = ewkx.FILE_TRANSFER_FAILURE_REASON_WRITING_TO_FILE_FAILED;
                break;
            case 8:
                ewkxVar = ewkx.FILE_TRANSFER_FAILURE_REASON_INVALID_RETRY_AFTER_VALUE;
                break;
            case 9:
                ewkxVar = ewkx.FILE_TRANSFER_FAILURE_REASON_INVALID_RESPONSE_DATA_SIZE;
                break;
            case 10:
                ewkxVar = ewkx.FILE_TRANSFER_FAILURE_REASON_FAILED_TO_DELETE_A_FILE;
                break;
            case 11:
                ewkxVar = ewkx.FILE_TRANSFER_FAILURE_REASON_GBA_AUTH_FAILURE;
                break;
            case 12:
                ewkxVar = ewkx.FILE_TRANSFER_FAILURE_REASON_GBA_UNEXPECTED_EXCEPTION;
                break;
            default:
                ewkxVar = null;
                break;
        }
        return ewkxVar != null;
    }
}
