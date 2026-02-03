package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
class cnad implements ejvr {
    @Override // defpackage.ejvr
    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        eqcr eqcrVar = (eqcr) obj;
        switch (eqcrVar.ordinal()) {
            case 0:
                return auga.RECOVERY_STRATEGY_NONE;
            case 1:
                return auga.RECOVERY_STRATEGY_NONE;
            case 2:
                return auga.RECOVERY_STRATEGY_REFRESH_REGISTRATION;
            case 3:
                return auga.RECOVERY_STRATEGY_REPROVISION;
            case 4:
                return auga.RECOVERY_STRATEGY_RECREATE_GROUP;
            case 5:
                return auga.RECOVERY_STRATEGY_NONE;
            case 6:
                return auga.RECOVERY_STRATEGY_INVALIDATE_CAPABILITIES_CACHE;
            default:
                throw new IllegalArgumentException("unknown enum value: ".concat(String.valueOf(String.valueOf(eqcrVar))));
        }
    }
}
