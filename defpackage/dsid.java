package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
class dsid extends ejvj {
    @Override // defpackage.ejvj
    protected final /* bridge */ /* synthetic */ Object a(Object obj) {
        etlo etloVar = (etlo) obj;
        int iOrdinal = etloVar.ordinal();
        if (iOrdinal == 0) {
            return evlr.BUTTONS_LAYOUT_UNSPECIFIED;
        }
        if (iOrdinal == 1) {
            return evlr.STACKED;
        }
        if (iOrdinal == 2) {
            return evlr.SIDE_BY_SIDE;
        }
        throw new IllegalArgumentException("unknown enum value: ".concat(etloVar.toString()));
    }

    @Override // defpackage.ejvj
    protected final /* bridge */ /* synthetic */ Object b(Object obj) {
        evlr evlrVar = (evlr) obj;
        int iOrdinal = evlrVar.ordinal();
        if (iOrdinal == 0) {
            return etlo.UNKNOWN_LAYOUT;
        }
        if (iOrdinal == 1) {
            return etlo.VERTICAL;
        }
        if (iOrdinal == 2) {
            return etlo.HORIZONTAL;
        }
        throw new IllegalArgumentException("unknown enum value: ".concat(evlrVar.toString()));
    }
}
