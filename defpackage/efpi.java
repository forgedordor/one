package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
class efpi extends ejvj {
    @Override // defpackage.ejvj
    protected final /* bridge */ /* synthetic */ Object a(Object obj) {
        efjf efjfVar = (efjf) obj;
        int iOrdinal = efjfVar.ordinal();
        if (iOrdinal == 0) {
            return cjhx.UNKNOWN_TYPE;
        }
        if (iOrdinal == 1) {
            return cjhx.PRESENT;
        }
        if (iOrdinal == 2) {
            return cjhx.ABSENT;
        }
        if (iOrdinal == 3) {
            return cjhx.PENDING;
        }
        throw new IllegalArgumentException("unknown enum value: ".concat(efjfVar.toString()));
    }

    @Override // defpackage.ejvj
    protected final /* bridge */ /* synthetic */ Object b(Object obj) {
        cjhx cjhxVar = (cjhx) obj;
        int iOrdinal = cjhxVar.ordinal();
        if (iOrdinal == 0) {
            return efjf.UNKNOWN;
        }
        if (iOrdinal == 1) {
            return efjf.PRESENT;
        }
        if (iOrdinal == 2) {
            return efjf.ABSENT;
        }
        if (iOrdinal == 3) {
            return efjf.PENDING;
        }
        throw new IllegalArgumentException("unknown enum value: ".concat(cjhxVar.toString()));
    }
}
