package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
class eqce implements ejvr {
    @Override // defpackage.ejvr
    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        eqcr eqcrVar = (eqcr) obj;
        switch (eqcrVar.ordinal()) {
            case 0:
                return exzd.ERROR_NO_RETRY;
            case 1:
                return exzd.ERROR_RETRY_IMMEDIATE;
            case 2:
                return exzd.ERROR_RETRY_REFRESH_REGISTRATION;
            case 3:
                return exzd.ERROR_RETRY_NEEDS_REPROVISION;
            case 4:
                return exzd.ERROR_RETRY_NEEDS_GROUP_RECREATION;
            case 5:
                return exzd.ERROR_REMOVE_SELF_FROM_GROUP;
            case 6:
                return exzd.ERROR_DESTINATION_NOT_TACHYGRAM;
            default:
                throw new IllegalArgumentException("unknown enum value: ".concat(String.valueOf(String.valueOf(eqcrVar))));
        }
    }
}
