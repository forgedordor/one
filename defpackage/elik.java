package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class elik implements evsv {
    static final evsv a = new elik();

    private elik() {
    }

    @Override // defpackage.evsv
    public final boolean a(int i) {
        elil elilVar;
        switch (i) {
            case 0:
                elilVar = elil.UNKNOWN_BUGLE_OPEN_CAUSE;
                break;
            case 1:
                elilVar = elil.VIA_LAUNCH_ICON;
                break;
            case 2:
                elilVar = elil.VIA_NOTIFICATION;
                break;
            case 3:
                elilVar = elil.VIA_SHARING_INTENT;
                break;
            case 4:
                elilVar = elil.VIA_LOCKSCREEN;
                break;
            case 5:
                elilVar = elil.VIA_WIDGET;
                break;
            case 6:
                elilVar = elil.VIA_OTHER_APPS_WITHOUT_SHARING_DATA;
                break;
            case 7:
                elilVar = elil.VIA_DEFAULT;
                break;
            case 8:
                elilVar = elil.VIA_SHORTCUT;
                break;
            case 9:
                elilVar = elil.VIA_TRAMPOLINE;
                break;
            case 10:
                elilVar = elil.VIA_ASSISTANT_APP_CONTROL;
                break;
            default:
                elilVar = null;
                break;
        }
        return elilVar != null;
    }
}
