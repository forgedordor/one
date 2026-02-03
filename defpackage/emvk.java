package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class emvk implements evsv {
    static final evsv a = new emvk();

    private emvk() {
    }

    @Override // defpackage.evsv
    public final boolean a(int i) {
        emvl emvlVar;
        switch (i) {
            case 0:
                emvlVar = emvl.UNKNOWN;
                break;
            case 1:
                emvlVar = emvl.TOO_MANY_PARTICIPANTS_IN_ONE_ON_ONE_CONVERSATION;
                break;
            case 2:
                emvlVar = emvl.RCS_GROUP_ID_UPDATED;
                break;
            case 3:
                emvlVar = emvl.NEW_CONVERSATION_WITH_EXISTING_RCS_GROUP_ID;
                break;
            case 4:
                emvlVar = emvl.NEW_CONVERSATION_CREATED;
                break;
            case 5:
                emvlVar = emvl.CONVERSATION_FORKING;
                break;
            case 6:
                emvlVar = emvl.MIXED_UP_PARTICIPANT;
                break;
            default:
                emvlVar = null;
                break;
        }
        return emvlVar != null;
    }
}
