package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
class dsin extends ejvj {
    @Override // defpackage.ejvj
    protected final /* bridge */ /* synthetic */ Object a(Object obj) {
        etor etorVar = (etor) obj;
        int iOrdinal = etorVar.ordinal();
        if (iOrdinal == 0) {
            return evld.ACTION_UNSPECIFIED;
        }
        if (iOrdinal == 1) {
            return evld.DISPLAYED;
        }
        if (iOrdinal == 2) {
            return evld.TAPPED;
        }
        if (iOrdinal == 3) {
            return evld.AUTOMATED;
        }
        throw new IllegalArgumentException("unknown enum value: ".concat(etorVar.toString()));
    }

    @Override // defpackage.ejvj
    protected final /* bridge */ /* synthetic */ Object b(Object obj) {
        evld evldVar = (evld) obj;
        int iOrdinal = evldVar.ordinal();
        if (iOrdinal == 0) {
            return etor.UNKNOWN;
        }
        if (iOrdinal == 1) {
            return etor.DISPLAYED;
        }
        if (iOrdinal == 2) {
            return etor.TAPPED;
        }
        if (iOrdinal == 3) {
            return etor.AUTOMATED;
        }
        throw new IllegalArgumentException("unknown enum value: ".concat(evldVar.toString()));
    }
}
