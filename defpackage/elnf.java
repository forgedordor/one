package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class elnf implements evsv {
    static final evsv a = new elnf();

    private elnf() {
    }

    @Override // defpackage.evsv
    public final boolean a(int i) {
        elng elngVar;
        switch (i) {
            case 0:
                elngVar = elng.UNKNOWN_CLOUD_SYNC_STATUS;
                break;
            case 1:
                elngVar = elng.NOT_ENABLED;
                break;
            case 2:
                elngVar = elng.ENABLED;
                break;
            case 3:
                elngVar = elng.IN_INITIAL_SYNC;
                break;
            case 4:
                elngVar = elng.FI_ENABLED;
                break;
            case 5:
                elngVar = elng.FI_INITIAL_SYNC_IN_PROGRESS;
                break;
            case 6:
                elngVar = elng.BNR_ENABLED;
                break;
            case 7:
                elngVar = elng.BNR_INITIAL_SYNC_IN_PROGRESS;
                break;
            default:
                elngVar = null;
                break;
        }
        return elngVar != null;
    }
}
