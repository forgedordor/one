package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fedr implements evsv {
    static final evsv a = new fedr();

    private fedr() {
    }

    @Override // defpackage.evsv
    public final boolean a(int i) {
        feds fedsVar;
        switch (i) {
            case 0:
                fedsVar = feds.UNKNOWN_CLOUD_SYNC_STATUS;
                break;
            case 1:
                fedsVar = feds.NOT_ENABLED;
                break;
            case 2:
                fedsVar = feds.ENABLED;
                break;
            case 3:
                fedsVar = feds.IN_INITIAL_SYNC;
                break;
            case 4:
                fedsVar = feds.FI_ENABLED;
                break;
            case 5:
                fedsVar = feds.FI_INITIAL_SYNC_IN_PROGRESS;
                break;
            case 6:
                fedsVar = feds.BNR_ENABLED;
                break;
            case 7:
                fedsVar = feds.BNR_INITIAL_SYNC_IN_PROGRESS;
                break;
            default:
                fedsVar = null;
                break;
        }
        return fedsVar != null;
    }
}
