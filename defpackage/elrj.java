package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class elrj implements evsv {
    static final evsv a = new elrj();

    private elrj() {
    }

    @Override // defpackage.evsv
    public final boolean a(int i) {
        elrk elrkVar;
        switch (i) {
            case 0:
                elrkVar = elrk.UNKNOWN_BIZINFO_EVENT_SOURCE;
                break;
            case 1:
                elrkVar = elrk.BIZINFO_SOURCE_CONVERSATION_LIST_AVATAR;
                break;
            case 2:
                elrkVar = elrk.BIZINFO_SOURCE_CONVERSATION_AVATAR;
                break;
            case 3:
                elrkVar = elrk.BIZINFO_SOURCE_CONVERSATION_START;
                break;
            case 4:
                elrkVar = elrk.BIZINFO_SOURCE_CONVERSATION_OVERFLOW_MENU;
                break;
            case 5:
                elrkVar = elrk.BIZINFO_SOURCE_CONVERSATION_ACTION_BAR;
                break;
            case 6:
                elrkVar = elrk.BIZINFO_SOURCE_CONVERSATION_TITLE;
                break;
            case 7:
                elrkVar = elrk.BIZINFO_SOURCE_SIM_SWITCHED_TOMBSTONE;
                break;
            default:
                elrkVar = null;
                break;
        }
        return elrkVar != null;
    }
}
