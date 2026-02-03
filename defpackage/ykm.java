package defpackage;

import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ykm {
    public static final long a(ajlt ajltVar) {
        ajltVar.getClass();
        return ajltVar.o().toEpochMilli();
    }

    public static final dkgv b(ajlt ajltVar) {
        ajltVar.getClass();
        return r(ajltVar) ? dkgv.c : dkgv.a;
    }

    public static final Instant c(ajlt ajltVar) {
        ajltVar.getClass();
        angj angjVarB = ajltVar.B();
        if (angjVarB != null) {
            return ((bqec) fcva.S(angjVarB.a)).n();
        }
        return null;
    }

    public static final boolean d(anlb anlbVar) {
        anla anlaVar = anlbVar instanceof anla ? (anla) anlbVar : null;
        return anlaVar != null && anlaVar.d;
    }

    public static final boolean e(anlb anlbVar) {
        anla anlaVar = anlbVar instanceof anla ? (anla) anlbVar : null;
        return anlaVar != null && anlaVar.c;
    }

    public static final boolean f(anlb anlbVar) {
        anla anlaVar = anlbVar instanceof anla ? (anla) anlbVar : null;
        return anlaVar != null && anlaVar.b;
    }

    public static final boolean g(anlb anlbVar) {
        anla anlaVar = anlbVar instanceof anla ? (anla) anlbVar : null;
        return anlaVar != null && anlaVar.f;
    }

    public static final boolean h(anlb anlbVar) {
        anla anlaVar = anlbVar instanceof anla ? (anla) anlbVar : null;
        return anlaVar != null && anlaVar.h;
    }

    public static final boolean i(anlb anlbVar) {
        return d(anlbVar) || e(anlbVar) || f(anlbVar) || h(anlbVar);
    }

    @fcsv
    public static final boolean j(ajlt ajltVar) {
        ajltVar.getClass();
        anlb anlbVarJ = ajltVar.j();
        return anlbVarJ != null && anlbVarJ.b() == 2;
    }

    public static final boolean k(anlb anlbVar) {
        return anlbVar != null && anlbVar.b() == 2;
    }

    public static final boolean l(ajlt ajltVar) {
        aobs aobsVarI;
        ajmc ajmcVarD = ajltVar.d();
        ajlr ajlrVar = ajmcVarD instanceof ajlr ? (ajlr) ajmcVarD : null;
        if (ajlrVar == null || (aobsVarI = ajlrVar.a().I()) == null) {
            return false;
        }
        return aobsVarI.a();
    }

    public static final boolean m(ajlt ajltVar) {
        aobs aobsVarI;
        ajmc ajmcVarD = ajltVar.d();
        Boolean bool = null;
        ajlr ajlrVar = ajmcVarD instanceof ajlr ? (ajlr) ajmcVarD : null;
        if (ajlrVar != null && (aobsVarI = ajlrVar.a().I()) != null) {
            bvdz bvdzVarD = aobsVarI.a.D();
            if (bvdzVarD != null) {
                int iOrdinal = bvdzVarD.ordinal();
                if (iOrdinal == 1) {
                    bool = true;
                } else if (iOrdinal == 2) {
                    bool = false;
                }
            }
            if (bool != null) {
                return bool.booleanValue();
            }
        }
        return false;
    }

    public static final boolean n(ajlt ajltVar) {
        ajmc ajmcVarD = ajltVar.d();
        ajlr ajlrVar = ajmcVarD instanceof ajlr ? (ajlr) ajmcVarD : null;
        if (ajlrVar != null) {
            return ajlrVar.a().A();
        }
        return false;
    }

    public static final boolean o(ajlt ajltVar) {
        ajltVar.getClass();
        if (!r(ajltVar) || (ajltVar instanceof ajmy)) {
            return false;
        }
        ajmc ajmcVarD = ajltVar.d();
        ajmcVarD.getClass();
        return ((ajmr) ajmcVarD).a() == ajlq.DELIVERED;
    }

    public static final boolean p(ajlt ajltVar) {
        ajltVar.getClass();
        return ajltVar.B() != null;
    }

    public static final boolean q(ajlt ajltVar) {
        ajltVar.getClass();
        return ajltVar.d().d() == 1;
    }

    public static final boolean r(ajlt ajltVar) {
        ajltVar.getClass();
        return ajltVar.d().d() == 2;
    }

    public static final boolean s(ajlt ajltVar) {
        ajltVar.getClass();
        return ajltVar.a() == ajls.b;
    }

    public static final boolean t(ajlt ajltVar) {
        return ajltVar.a() == ajls.b;
    }

    public static final boolean u(ajlt ajltVar) {
        ajltVar.getClass();
        if (!r(ajltVar) || (ajltVar instanceof ajmy)) {
            return false;
        }
        ajmc ajmcVarD = ajltVar.d();
        ajmcVarD.getClass();
        return ((ajmr) ajmcVarD).a() == ajlq.SENDING;
    }

    public static final boolean v(anlb anlbVar) {
        anla anlaVar = anlbVar instanceof anla ? (anla) anlbVar : null;
        return anlaVar != null && anlaVar.e;
    }

    public static final boolean w(ajlt ajltVar) {
        ajltVar.getClass();
        if (!r(ajltVar) || (ajltVar instanceof ajmy)) {
            return false;
        }
        ajmc ajmcVarD = ajltVar.d();
        ajmcVarD.getClass();
        return ((ajmr) ajmcVarD).a() == ajlq.SENT;
    }

    public static final boolean x(ajlt ajltVar) {
        ajltVar.getClass();
        return ajltVar.a() == ajls.a;
    }

    public static final boolean y(ajlt ajltVar) {
        anzg anzgVarH;
        ajmc ajmcVarD = ajltVar.d();
        ajlr ajlrVar = ajmcVarD instanceof ajlr ? (ajlr) ajmcVarD : null;
        if (ajlrVar == null || (anzgVarH = ajlrVar.a().H()) == null) {
            return false;
        }
        return anzgVarH.b();
    }

    public static final boolean z(ajlt ajltVar) {
        anzg anzgVarH;
        ajmc ajmcVarD = ajltVar.d();
        ajlr ajlrVar = ajmcVarD instanceof ajlr ? (ajlr) ajmcVarD : null;
        if (ajlrVar == null || (anzgVarH = ajlrVar.a().H()) == null) {
            return false;
        }
        return anzgVarH.c();
    }
}
