package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
class dsie extends ejvj {
    @Override // defpackage.ejvj
    protected final /* bridge */ /* synthetic */ Object a(Object obj) {
        etmr etmrVar = (etmr) obj;
        int iOrdinal = etmrVar.ordinal();
        if (iOrdinal == 0) {
            return evoh.CLIENT_VALUE_UNKNOWN;
        }
        if (iOrdinal == 1) {
            return evoh.CLIENT_VALUE_ACCOUNT_NAME;
        }
        throw new IllegalArgumentException("unknown enum value: ".concat(etmrVar.toString()));
    }

    @Override // defpackage.ejvj
    protected final /* bridge */ /* synthetic */ Object b(Object obj) {
        evoh evohVar = (evoh) obj;
        int iOrdinal = evohVar.ordinal();
        if (iOrdinal == 0) {
            return etmr.CLIENT_VALUE_UNKNOWN;
        }
        if (iOrdinal == 1) {
            return etmr.CLIENT_VALUE_ACCOUNT_NAME;
        }
        throw new IllegalArgumentException("unknown enum value: ".concat(evohVar.toString()));
    }
}
