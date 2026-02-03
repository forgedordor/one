package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class sfo implements evsv {
    public static final evsv a = new sfo();

    private sfo() {
    }

    @Override // defpackage.evsv
    public final boolean a(int i) {
        sfp sfpVar;
        switch (i) {
            case 0:
                sfpVar = sfp.USER_FEEDBACK_UNKNOWN;
                break;
            case 1:
                sfpVar = sfp.USER_FEEDBACK_MARKED_NOT_SPAM;
                break;
            case 2:
                sfpVar = sfp.USER_FEEDBACK_MARKED_SPAM;
                break;
            case 3:
                sfpVar = sfp.USER_FEEDBACK_CONFIRMED_SPAM;
                break;
            case 4:
                sfpVar = sfp.USER_FEEDBACK_LEFT_SPAM;
                break;
            case 5:
                sfpVar = sfp.USER_FEEDBACK_DELETED_SPAM;
                break;
            case 6:
                sfpVar = sfp.USER_FEEDBACK_BLOCKED_SPAM;
                break;
            default:
                sfpVar = null;
                break;
        }
        return sfpVar != null;
    }
}
