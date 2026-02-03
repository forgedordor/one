package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
class axlo extends ejvj {
    @Override // defpackage.ejvj
    protected final /* bridge */ /* synthetic */ Object a(Object obj) {
        elng elngVar = (elng) obj;
        switch (elngVar) {
            case UNKNOWN_CLOUD_SYNC_STATUS:
                return feds.UNKNOWN_CLOUD_SYNC_STATUS;
            case NOT_ENABLED:
                return feds.NOT_ENABLED;
            case ENABLED:
                return feds.ENABLED;
            case IN_INITIAL_SYNC:
                return feds.IN_INITIAL_SYNC;
            case FI_ENABLED:
                return feds.FI_ENABLED;
            case FI_INITIAL_SYNC_IN_PROGRESS:
                return feds.FI_INITIAL_SYNC_IN_PROGRESS;
            case BNR_ENABLED:
                return feds.BNR_ENABLED;
            case BNR_INITIAL_SYNC_IN_PROGRESS:
                return feds.BNR_INITIAL_SYNC_IN_PROGRESS;
            default:
                throw new IllegalArgumentException("unknown enum value: ".concat(elngVar.toString()));
        }
    }

    @Override // defpackage.ejvj
    protected final /* bridge */ /* synthetic */ Object b(Object obj) {
        feds fedsVar = (feds) obj;
        switch (fedsVar) {
            case UNKNOWN_CLOUD_SYNC_STATUS:
                return elng.UNKNOWN_CLOUD_SYNC_STATUS;
            case NOT_ENABLED:
                return elng.NOT_ENABLED;
            case ENABLED:
                return elng.ENABLED;
            case IN_INITIAL_SYNC:
                return elng.IN_INITIAL_SYNC;
            case FI_ENABLED:
                return elng.FI_ENABLED;
            case FI_INITIAL_SYNC_IN_PROGRESS:
                return elng.FI_INITIAL_SYNC_IN_PROGRESS;
            case BNR_ENABLED:
                return elng.BNR_ENABLED;
            case BNR_INITIAL_SYNC_IN_PROGRESS:
                return elng.BNR_INITIAL_SYNC_IN_PROGRESS;
            default:
                throw new IllegalArgumentException("unknown enum value: ".concat(fedsVar.toString()));
        }
    }
}
