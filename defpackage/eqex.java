package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
class eqex extends ejvj {
    @Override // defpackage.ejvj
    protected final /* bridge */ /* synthetic */ Object a(Object obj) {
        felk felkVar = (felk) obj;
        int iOrdinal = felkVar.ordinal();
        if (iOrdinal == 0) {
            return eqef.b;
        }
        if (iOrdinal == 1) {
            return eqef.c;
        }
        if (iOrdinal == 2) {
            return eqef.a;
        }
        throw new IllegalArgumentException("unknown enum value: ".concat(felkVar.toString()));
    }

    @Override // defpackage.ejvj
    protected final /* bridge */ /* synthetic */ Object b(Object obj) {
        eqef eqefVar = (eqef) obj;
        int iOrdinal = eqefVar.ordinal();
        if (iOrdinal == 0) {
            return felk.UNRECOGNIZED;
        }
        if (iOrdinal == 1) {
            return felk.DEFAULT_TYPE;
        }
        if (iOrdinal == 2) {
            return felk.ADMINISTRATED;
        }
        throw new IllegalArgumentException("unknown enum value: ".concat(eqefVar.toString()));
    }
}
