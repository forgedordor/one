package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
class dxul extends ejvj {
    @Override // defpackage.ejvj
    protected final /* bridge */ /* synthetic */ Object a(Object obj) {
        evcc evccVar = (evcc) obj;
        int iOrdinal = evccVar.ordinal();
        if (iOrdinal == 0) {
            return evgv.UNSPECIFIED;
        }
        if (iOrdinal == 1) {
            return evgv.TRUE;
        }
        if (iOrdinal == 2) {
            return evgv.FALSE;
        }
        throw new IllegalArgumentException("unknown enum value: ".concat(evccVar.toString()));
    }

    @Override // defpackage.ejvj
    protected final /* bridge */ /* synthetic */ Object b(Object obj) {
        evgv evgvVar = (evgv) obj;
        int iOrdinal = evgvVar.ordinal();
        if (iOrdinal == 0) {
            return evcc.UNSPECIFIED;
        }
        if (iOrdinal == 1) {
            return evcc.TRUE;
        }
        if (iOrdinal == 2) {
            return evcc.FALSE;
        }
        throw new IllegalArgumentException("unknown enum value: ".concat(evgvVar.toString()));
    }
}
