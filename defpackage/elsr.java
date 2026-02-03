package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class elsr implements evsv {
    static final evsv a = new elsr();

    private elsr() {
    }

    @Override // defpackage.evsv
    public final boolean a(int i) {
        elss elssVar;
        switch (i) {
            case 0:
                elssVar = elss.UNKNOWN;
                break;
            case 1:
                elssVar = elss.TEXT;
                break;
            case 2:
                elssVar = elss.ATTACHMENT;
                break;
            case 3:
                elssVar = elss.SUCCESS_RECEIPT;
                break;
            case 4:
                elssVar = elss.FTD_RECEIPT;
                break;
            case 5:
                elssVar = elss.LOCATION;
                break;
            case 6:
                elssVar = elss.READ_REPORT;
                break;
            case 7:
                elssVar = elss.TYPING_INDICATOR;
                break;
            default:
                elssVar = null;
                break;
        }
        return elssVar != null;
    }
}
