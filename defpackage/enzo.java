package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class enzo implements evsv {
    static final evsv a = new enzo();

    private enzo() {
    }

    @Override // defpackage.evsv
    public final boolean a(int i) {
        enzp enzpVar;
        switch (i) {
            case 0:
                enzpVar = enzp.UNDEFINED_EVENT;
                break;
            case 1:
                enzpVar = enzp.REQUEST_BUGLE_DATABASE_RESTORE;
                break;
            case 2:
                enzpVar = enzp.REQUEST_ATTACHMENTS_RESTORE;
                break;
            case 3:
                enzpVar = enzp.COMPLETE_RESTORE;
                break;
            case 4:
                enzpVar = enzp.DO_COMPLETE_RESTORE;
                break;
            case 5:
                enzpVar = enzp.DO_BUGLE_DATABASE_RESTORE;
                break;
            case 6:
                enzpVar = enzp.DO_ATTACHMENTS_RESTORE;
                break;
            case 7:
                enzpVar = enzp.REQUEST_RESTORE_AFTER_APP_UPDATE;
                break;
            case 8:
                enzpVar = enzp.INITIALIZE_RESTORE_WORKFLOW;
                break;
            case 9:
                enzpVar = enzp.CLEAN_UP;
                break;
            case 10:
                enzpVar = enzp.COMPLETE_FROM_STALLED_RESTORE;
                break;
            case 11:
                enzpVar = enzp.FIX_UP_PARTS_TABLE_CONVERSATION_IDS;
                break;
            case 12:
                enzpVar = enzp.WAITING_FOR_APP_UPDATE_INITIAL_PROMPT_SHOWN;
                break;
            case 13:
                enzpVar = enzp.WAITING_FOR_APP_UPDATE_READY_FOR_REPROMPT;
                break;
            default:
                enzpVar = null;
                break;
        }
        return enzpVar != null;
    }
}
