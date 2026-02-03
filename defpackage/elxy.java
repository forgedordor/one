package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class elxy implements evsv {
    static final evsv a = new elxy();

    private elxy() {
    }

    @Override // defpackage.evsv
    public final boolean a(int i) {
        elxz elxzVar;
        switch (i) {
            case 0:
                elxzVar = elxz.UNKNOWN;
                break;
            case 1:
                elxzVar = elxz.SENDERS_IDENTITY_INCORRECT;
                break;
            case 2:
                elxzVar = elxz.IDENTITY_VERIFICATION_RETRY_LIMIT_REACHED;
                break;
            case 3:
                elxzVar = elxz.SENDERS_USER_ID_INCORRECT;
                break;
            case 4:
                elxzVar = elxz.TACHYON_DOWNLOAD_FAILED;
                break;
            case 5:
                elxzVar = elxz.OTHER_EXCEPTION;
                break;
            case 6:
                elxzVar = elxz.SUCCESS;
                break;
            case 7:
                elxzVar = elxz.SENDERS_USER_ID_EMPTY;
                break;
            default:
                elxzVar = null;
                break;
        }
        return elxzVar != null;
    }
}
