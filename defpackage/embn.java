package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class embn implements evsv {
    static final evsv a = new embn();

    private embn() {
    }

    @Override // defpackage.evsv
    public final boolean a(int i) {
        embo emboVar;
        switch (i) {
            case 0:
                emboVar = embo.UNDEFINED;
                break;
            case 1:
                emboVar = embo.XMS_MESSAGE_ON_RCS_GROUP;
                break;
            case 2:
                emboVar = embo.RECIPIENT_LOST_RCS;
                break;
            case 3:
                emboVar = embo.ATTACHMENT_FAILED_TO_SEND;
                break;
            case 4:
                emboVar = embo.MESSAGE_TO_NON_ENCRYPTED_RECIPIENT;
                break;
            case 5:
                emboVar = embo.RECIPIENT_DID_NOT_DECRYPT;
                break;
            case 6:
                emboVar = embo.ATTACHMENT_PROCESS_FAILED;
                break;
            case 7:
                emboVar = embo.APP_RESTART;
                break;
            case 8:
                emboVar = embo.EMERGENCY_NUMBER;
                break;
            case 9:
                emboVar = embo.CANCELED;
                break;
            case 10:
                emboVar = embo.SENDING_TIMEOUT;
                break;
            case 11:
                emboVar = embo.DELIVERY_TIMEOUT;
                break;
            case 12:
                emboVar = embo.RECIPIENT_NEGATIVE_DELIVERY;
                break;
            default:
                emboVar = null;
                break;
        }
        return emboVar != null;
    }
}
