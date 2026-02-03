package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class emsg implements evsv {
    static final evsv a = new emsg();

    private emsg() {
    }

    @Override // defpackage.evsv
    public final boolean a(int i) {
        emsh emshVar;
        switch (i) {
            case 0:
                emshVar = emsh.UNKNOWN_CLOSING_SOURCE;
                break;
            case 1:
                emshVar = emsh.BACK_BUTTON;
                break;
            case 2:
                emshVar = emsh.BACK_ICON;
                break;
            case 3:
                emshVar = emsh.KEYBOARD_OPEN;
                break;
            case 4:
                emshVar = emsh.SELECTION;
                break;
            case 5:
                emshVar = emsh.DISMISSAL;
                break;
            case 6:
                emshVar = emsh.MESSAGE_SELECTED;
                break;
            default:
                emshVar = null;
                break;
        }
        return emshVar != null;
    }
}
