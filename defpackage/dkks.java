package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dkks {
    public static final float a(dkkr dkkrVar, boolean z) {
        dkkh dkkhVar = dkkrVar.y.c;
        float f = (dkkhVar == dkkh.b || dkkhVar == dkkh.c) ? 1.0f : 8.0f;
        if (z) {
            return 0.0f;
        }
        return f;
    }

    public static final float b(dkkr dkkrVar) {
        return true != dkkrVar.p ? 8.0f : 4.0f;
    }

    public static final float c(dkkr dkkrVar) {
        dkgu dkguVar = dkkrVar.y;
        dkly dklyVar = dkguVar.f;
        if ((dklyVar != null ? ((dkku) dklyVar).c : null) != null) {
            return 0.0f;
        }
        dkkh dkkhVar = dkguVar.c;
        return (dkkhVar == dkkh.c || dkkhVar == dkkh.d) ? 1.0f : 8.0f;
    }

    public static final ibx d(dkkr dkkrVar) {
        int iOrdinal = dkkrVar.y.b.ordinal();
        if (iOrdinal == 0) {
            return ibw.j;
        }
        if (iOrdinal == 1) {
            return ibw.k;
        }
        if (iOrdinal == 2) {
            return ibw.l;
        }
        throw new fctg();
    }

    public static final iby e(dkkr dkkrVar) {
        int iOrdinal = dkkrVar.y.b.ordinal();
        if (iOrdinal == 0) {
            return ibw.d;
        }
        if (iOrdinal == 1) {
            return ibw.e;
        }
        if (iOrdinal == 2) {
            return ibw.f;
        }
        throw new fctg();
    }

    public static final boolean f(dkkr dkkrVar) {
        return dkkrVar.p && dkkrVar.y.b == dkgv.a;
    }

    public static /* synthetic */ evm g(dkgu dkguVar) {
        if (dkguVar.b == dkgv.c) {
            int iOrdinal = dkguVar.c.ordinal();
            if (iOrdinal == 0) {
                return evn.b(20.0f);
            }
            if (iOrdinal == 1) {
                return evn.c(20.0f, 20.0f, 4.0f, 20.0f);
            }
            if (iOrdinal == 2) {
                return evn.c(20.0f, 4.0f, 4.0f, 20.0f);
            }
            if (iOrdinal == 3) {
                return evn.c(20.0f, 4.0f, 20.0f, 20.0f);
            }
            throw new fctg();
        }
        int iOrdinal2 = dkguVar.c.ordinal();
        if (iOrdinal2 == 0) {
            return evn.b(20.0f);
        }
        if (iOrdinal2 == 1) {
            return evn.c(20.0f, 20.0f, 20.0f, 4.0f);
        }
        if (iOrdinal2 == 2) {
            return evn.c(4.0f, 20.0f, 20.0f, 4.0f);
        }
        if (iOrdinal2 == 3) {
            return evn.c(4.0f, 20.0f, 20.0f, 20.0f);
        }
        throw new fctg();
    }
}
