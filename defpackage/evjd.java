package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class evjd implements evsv {
    public static final evsv a = new evjd();

    private evjd() {
    }

    @Override // defpackage.evsv
    public final boolean a(int i) {
        evje evjeVar;
        switch (i) {
            case 0:
                evjeVar = evje.FETCH_REASON_UNSPECIFIED;
                break;
            case 1:
                evjeVar = evje.FULL_SYNC_INSTRUCTION;
                break;
            case 2:
                evjeVar = evje.SYNC_INSTRUCTION;
                break;
            case 3:
                evjeVar = evje.COLLABORATOR_API_CALL;
                break;
            case 4:
                evjeVar = evje.GUNS_MIGRATION;
                break;
            case 5:
                evjeVar = evje.INBOX;
                break;
            case 6:
                evjeVar = evje.DELAYED_IMPRESSION;
                break;
            case 7:
                evjeVar = evje.REMOTE_DELETED_MESSAGES;
                break;
            case 8:
                evjeVar = evje.LOCALE_CHANGED;
                break;
            case 9:
                evjeVar = evje.GROWTHKIT_PERIODIC_FETCH;
                break;
            case 10:
                evjeVar = evje.GROWTHKIT_SYNC_ON_STARTUP;
                break;
            case 11:
                evjeVar = evje.GROWTHKIT_SYNC_AFTER_PROMO_SHOWN;
                break;
            case 12:
                evjeVar = evje.GROWTHKIT_SYNC_AFTER_USER_ACTION;
                break;
            case 13:
                evjeVar = evje.GROWTHKIT_SYNC_FOR_TEST_REASON;
                break;
            case 14:
                evjeVar = evje.GROWTHKIT_SYNC_INSTRUCTION;
                break;
            default:
                evjeVar = null;
                break;
        }
        return evjeVar != null;
    }
}
