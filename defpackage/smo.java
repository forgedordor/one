package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class smo extends Exception {
    public final int a;
    public final int b;

    /* JADX WARN: Illegal instructions before constructor call */
    public smo(int i, int i2, String str, Throwable th) {
        Integer numValueOf = Integer.valueOf(i);
        String str2 = "UNKNOWN";
        String str3 = i != 1 ? i != 2 ? i != 3 ? i != 4 ? "UNKNOWN" : "CONNECTION_ERROR" : "PREPARATION_ERROR" : "INFERENCE_ERROR" : "DOWNLOAD_ERROR";
        Integer numValueOf2 = Integer.valueOf(i2);
        if (i2 == 15) {
            str2 = "RESPONSE_GENERATION_ERROR";
        } else if (i2 == 16) {
            str2 = "NOT_SUPPORTED";
        } else if (i2 != 501) {
            switch (i2) {
                case 2:
                    str2 = "BAD_DATA";
                    break;
                case 3:
                    str2 = "BAD_REQUEST";
                    break;
                case 4:
                    str2 = "REQUEST_PROCESSING_ERROR";
                    break;
                case 5:
                    str2 = "COMPUTE_ERROR";
                    break;
                case 6:
                    str2 = "IPC_ERROR";
                    break;
                case 7:
                    str2 = "CANCELLED";
                    break;
                case 8:
                    str2 = "NOT_AVAILABLE";
                    break;
                case 9:
                    str2 = "BUSY";
                    break;
                case 10:
                    str2 = "SERVICE_PROCESSING_ERROR";
                    break;
                case 11:
                    str2 = "RESPONSE_PROCESSING_ERROR";
                    break;
                case 12:
                    str2 = "REQUEST_TOO_LARGE";
                    break;
                default:
                    switch (i2) {
                        case 601:
                            str2 = "BINDING_FAILURE";
                            break;
                        case 602:
                            str2 = "SERVICE_DISCONNECTED";
                            break;
                        case 603:
                            str2 = "BINDING_DIED";
                            break;
                        case 604:
                            str2 = "NEEDS_SYSTEM_UPDATE";
                            break;
                        case 605:
                            str2 = "NULL_BINDING";
                            break;
                        case 606:
                            str2 = "FEATURE_NOT_FOUND";
                            break;
                    }
            }
        } else {
            str2 = "NOT_ENOUGH_DISK_SPACE";
        }
        super(String.format("AICore failed with error type %s-%s and error code %s-%s: %s", numValueOf, str3, numValueOf2, str2, str), th);
        this.a = i;
        this.b = i2;
    }
}
