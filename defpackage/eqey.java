package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
abstract class eqey extends ejvj {
    @Override // defpackage.ejvj
    protected final /* bridge */ /* synthetic */ Object a(Object obj) {
        fell fellVar = (fell) obj;
        int iOrdinal = fellVar.ordinal();
        if (iOrdinal == 0) {
            return f();
        }
        if (iOrdinal == 1) {
            return eqdz.c;
        }
        if (iOrdinal == 2) {
            return g();
        }
        if (iOrdinal == 3) {
            return eqdz.a;
        }
        throw new IllegalArgumentException("unknown enum value: ".concat(fellVar.toString()));
    }

    @Override // defpackage.ejvj
    protected final /* bridge */ /* synthetic */ Object b(Object obj) {
        eqdz eqdzVar = (eqdz) obj;
        int iOrdinal = eqdzVar.ordinal();
        if (iOrdinal == 0) {
            return fell.UNRECOGNIZED;
        }
        if (iOrdinal == 1) {
            return h();
        }
        if (iOrdinal == 2) {
            return fell.ADMIN;
        }
        throw new IllegalArgumentException("unknown enum value: ".concat(eqdzVar.toString()));
    }

    public abstract eqdz f();

    public abstract eqdz g();

    public abstract fell h();
}
