package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eluo implements evsv {
    static final evsv a = new eluo();

    private eluo() {
    }

    @Override // defpackage.evsv
    public final boolean a(int i) {
        elup elupVar;
        switch (i) {
            case 0:
                elupVar = elup.UNKNOWN_HAPPINESS_TRACKING_MODE;
                break;
            case 1:
                elupVar = elup.HAPPINESS_TRACKING_MODE_SURVEY;
                break;
            case 2:
                elupVar = elup.HAPPINESS_TRACKING_MODE_PLAY_STORE_RATING;
                break;
            case 3:
                elupVar = elup.HAPPINESS_TRACKING_MODE_HIDDEN;
                break;
            case 4:
                elupVar = elup.SMART_REPLY_HAPPINESS_TRACKING_SURVEY;
                break;
            case 5:
                elupVar = elup.SHARE_AND_CONNECT_HAPPINESS_TRACKING_SURVEY;
                break;
            case 6:
                elupVar = elup.ORGANIZE_HAPPINESS_TRACKING_SURVEY;
                break;
            default:
                elupVar = null;
                break;
        }
        return elupVar != null;
    }
}
