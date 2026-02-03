package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
class cmyv extends ejvj {
    @Override // defpackage.ejvj
    protected final /* bridge */ /* synthetic */ Object a(Object obj) {
        aszo aszoVar = (aszo) obj;
        int iOrdinal = aszoVar.ordinal();
        if (iOrdinal == 0) {
            return eqhx.c;
        }
        if (iOrdinal == 1) {
            return eqhx.b;
        }
        if (iOrdinal == 2) {
            return eqhx.a;
        }
        throw new IllegalArgumentException("unknown enum value: ".concat(aszoVar.toString()));
    }

    @Override // defpackage.ejvj
    protected final /* bridge */ /* synthetic */ Object b(Object obj) {
        eqhx eqhxVar = (eqhx) obj;
        int iOrdinal = eqhxVar.ordinal();
        if (iOrdinal == 0) {
            return aszo.NOT_RCS;
        }
        if (iOrdinal == 1) {
            return aszo.OFFLINE;
        }
        if (iOrdinal == 2) {
            return aszo.ONLINE;
        }
        if (iOrdinal == 3) {
            return aszo.NOT_RCS;
        }
        throw new IllegalArgumentException("unknown enum value: ".concat(eqhxVar.toString()));
    }
}
