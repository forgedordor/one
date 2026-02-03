package defpackage;

import androidx.compose.ui.platform.AndroidComposeView;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jdo {
    public final jcr a;
    public boolean c;
    public boolean d;
    public kil h;
    public final jbm b = new jbm();
    public final jfb e = new jfb();
    public final hum f = new hum(new jfg[16]);
    public final hum g = new hum(new jdn[16]);
    public final jcy i = null;

    public jdo(jcr jcrVar) {
        this.a = jcrVar;
    }

    public static final boolean l(jcr jcrVar, kil kilVar) {
        if (jcrVar.j == null) {
            return false;
        }
        boolean zAq = kilVar != null ? jcrVar.aq(kilVar) : jcrVar.aq(jcrVar.w.c());
        jcr jcrVarS = jcrVar.s();
        if (zAq && jcrVarS != null) {
            if (jcrVarS.j == null) {
                jcr.ay(jcrVarS, false, 3);
                return zAq;
            }
            if (jcrVar.aE() == 1) {
                jcr.aw(jcrVarS, false, 3);
                return zAq;
            }
            if (jcrVar.aE() == 2) {
                jcrVarS.ab(false);
                return true;
            }
        }
        return zAq;
    }

    public static final boolean m(jcr jcrVar, kil kilVar) {
        boolean zAr = kilVar != null ? jcrVar.ar(kilVar) : jcrVar.ar(jcrVar.w.b());
        jcr jcrVarS = jcrVar.s();
        if (zAr && jcrVarS != null) {
            if (jcrVar.aD() == 1) {
                jcr.ay(jcrVarS, false, 3);
                return zAr;
            }
            if (jcrVar.aD() == 2) {
                jcrVarS.ac(false);
                return true;
            }
        }
        return zAr;
    }

    public static final boolean n(jcr jcrVar) {
        return jcrVar.am() && t(jcrVar);
    }

    public static final boolean o(jcr jcrVar) {
        jcr jcrVarS;
        if (!jcrVar.an()) {
            return false;
        }
        do {
            if ((!s(jcrVar) && ((jcrVarS = jcrVar.s()) == null || jcrVarS.aC() != 1)) || (jcrVar = jcrVar.s()) == null) {
                return false;
            }
        } while (!jcrVar.f());
        return true;
    }

    private final void p(jcr jcrVar, boolean z) {
        hum humVarQ = jcrVar.q();
        Object[] objArr = humVarQ.a;
        int i = humVarQ.b;
        for (int i2 = 0; i2 < i; i2++) {
            jcr jcrVar2 = (jcr) objArr[i2];
            if ((!z && s(jcrVar2)) || (z && t(jcrVar2))) {
                if (jcx.a(jcrVar2) && !z) {
                    if (jcrVar2.am() && this.b.c(jcrVar2)) {
                        r(jcrVar2, true, false);
                    } else {
                        e(jcrVar2, true);
                    }
                }
                q(jcrVar2, z);
                if (!u(jcrVar2, z)) {
                    p(jcrVar2, z);
                }
            }
        }
        q(jcrVar, z);
    }

    private final void q(jcr jcrVar, boolean z) {
        if (u(jcrVar, z)) {
            r(jcrVar, z, false);
        }
    }

    private final boolean r(jcr jcrVar, boolean z, boolean z2) {
        kil kilVar;
        boolean zL;
        iyk iygVar;
        jcr jcrVarS;
        jdm jdmVar;
        jaj jajVar;
        if (jcrVar.B) {
            return false;
        }
        if (!jcrVar.f() && !jcrVar.ao() && !o(jcrVar) && !fdbq.f(jcrVar.A(), true) && !n(jcrVar)) {
            jcw jcwVar = jcrVar.w;
            if (!jcwVar.o.w.j() && ((jdmVar = jcwVar.p) == null || (jajVar = jdmVar.p) == null || !jajVar.j())) {
                return false;
            }
        }
        jcr jcrVar2 = this.a;
        if (jcrVar == jcrVar2) {
            kilVar = this.h;
            kilVar.getClass();
        } else {
            kilVar = null;
        }
        if (z) {
            zL = jcrVar.am() ? l(jcrVar, kilVar) : false;
            if (z2 && ((zL || jcrVar.al()) && fdbq.f(jcrVar.A(), true))) {
                jcrVar.S();
            }
        } else {
            boolean zM = jcrVar.an() ? m(jcrVar, kilVar) : false;
            if (z2 && jcrVar.ak() && (jcrVar == jcrVar2 || ((jcrVarS = jcrVar.s()) != null && jcrVarS.f() && jcrVar.ao()))) {
                if (jcrVar == jcrVar2) {
                    if (jcrVar.C == 3) {
                        jcrVar.J();
                    }
                    jcr jcrVarS2 = jcrVar.s();
                    if (jcrVarS2 == null || (iygVar = jcrVarS2.w().m) == null) {
                        jfh jfhVarA = jcv.a(jcrVar);
                        fdap fdapVar = iyn.a;
                        iygVar = new iyg(jfhVarA);
                    }
                    iyk.A(iygVar, jcrVar.v(), 0, 0);
                } else {
                    jcrVar.aa();
                }
                this.e.b(jcrVar);
                ((AndroidComposeView) jcv.a(jcrVar)).p.c(jcrVar);
            }
            zL = zM;
        }
        c();
        return zL;
    }

    private static final boolean s(jcr jcrVar) {
        return jcrVar.aD() == 1 || jcrVar.w.o.w.j();
    }

    private static final boolean t(jcr jcrVar) {
        jaj jajVar;
        if (jcrVar.aE() == 1) {
            return true;
        }
        jdm jdmVar = jcrVar.w.p;
        return (jdmVar == null || (jajVar = jdmVar.p) == null || !jajVar.j()) ? false : true;
    }

    private static final boolean u(jcr jcrVar, boolean z) {
        return z ? jcrVar.am() : jcrVar.an();
    }

    public final void a() {
        hum humVar = this.f;
        Object[] objArr = humVar.a;
        int i = humVar.b;
        for (int i2 = 0; i2 < i; i2++) {
            ((jfg) objArr[i2]).ew();
        }
        humVar.g();
    }

    public final void b(boolean z) {
        if (z) {
            jfb jfbVar = this.e;
            jcr jcrVar = this.a;
            hum humVar = jfbVar.a;
            humVar.g();
            humVar.n(jcrVar);
            jcrVar.A = true;
        }
        jfb jfbVar2 = this.e;
        hum humVar2 = jfbVar2.a;
        humVar2.j(jfa.a);
        int i = humVar2.b;
        jcr[] jcrVarArr = jfbVar2.b;
        if (jcrVarArr == null || jcrVarArr.length < i) {
            jcrVarArr = new jcr[Math.max(16, i)];
        }
        jfbVar2.b = null;
        for (int i2 = 0; i2 < i; i2++) {
            jcrVarArr[i2] = (jcr) humVar2.a[i2];
        }
        humVar2.g();
        while (true) {
            i--;
            if (i < 0) {
                jfbVar2.b = jcrVarArr;
                return;
            }
            jcr jcrVar2 = jcrVarArr[i];
            jcrVar2.getClass();
            if (jcrVar2.A) {
                jfbVar2.a(jcrVar2);
            }
        }
    }

    public final void c() {
        hum humVar = this.g;
        int i = humVar.b;
        if (i != 0) {
            Object[] objArr = humVar.a;
            for (int i2 = 0; i2 < i; i2++) {
                jdn jdnVar = (jdn) objArr[i2];
                jcr jcrVar = jdnVar.a;
                if (jcrVar.d()) {
                    if (jdnVar.b) {
                        jcr.aw(jcrVar, jdnVar.c, 2);
                    } else {
                        jcr.ay(jcrVar, jdnVar.c, 2);
                    }
                }
            }
            humVar.g();
        }
    }

    public final void d(jcr jcrVar) {
        hum humVarQ = jcrVar.q();
        Object[] objArr = humVarQ.a;
        int i = humVarQ.b;
        for (int i2 = 0; i2 < i; i2++) {
            jcr jcrVar2 = (jcr) objArr[i2];
            if (fdbq.f(jcrVar2.A(), true) && !jcrVar2.B) {
                if (this.b.c(jcrVar2)) {
                    jcrVar2.S();
                }
                d(jcrVar2);
            }
        }
    }

    public final void e(jcr jcrVar, boolean z) {
        if (!this.c) {
            itw.d("forceMeasureTheSubtree should be executed during the measureAndLayout pass");
        }
        if (u(jcrVar, z)) {
            itw.c("node not yet measured");
        }
        p(jcrVar, z);
    }

    public final void f(jcr jcrVar) {
        hum humVarQ = jcrVar.q();
        Object[] objArr = humVarQ.a;
        int i = humVarQ.b;
        for (int i2 = 0; i2 < i; i2++) {
            jcr jcrVar2 = (jcr) objArr[i2];
            if (s(jcrVar2)) {
                if (jcx.a(jcrVar2)) {
                    g(jcrVar2, true);
                } else {
                    f(jcrVar2);
                }
            }
        }
    }

    public final void g(jcr jcrVar, boolean z) {
        kil kilVar;
        if (jcrVar.B) {
            return;
        }
        if (jcrVar == this.a) {
            kilVar = this.h;
            kilVar.getClass();
        } else {
            kilVar = null;
        }
        if (z) {
            l(jcrVar, kilVar);
        } else {
            m(jcrVar, kilVar);
        }
    }

    public final boolean h() {
        return this.b.b();
    }

    public final boolean i(fdae fdaeVar) {
        boolean z;
        jcr jcrVar = this.a;
        if (!jcrVar.d()) {
            itw.c("performMeasureAndLayout called with unattached root");
        }
        if (!jcrVar.f()) {
            itw.c("performMeasureAndLayout called with unplaced root");
        }
        if (this.c) {
            itw.c("performMeasureAndLayout called during measure layout");
        }
        boolean z2 = false;
        if (this.h != null) {
            this.c = true;
            this.d = true;
            try {
                jbm jbmVar = this.b;
                if (jbmVar.b()) {
                    z = false;
                    while (jbmVar.b()) {
                        jbj jbjVar = jbmVar.a;
                        boolean zD = jbjVar.d();
                        boolean z3 = !zD;
                        if (zD) {
                            jbjVar = jbmVar.b;
                        }
                        jcr jcrVarA = jbjVar.a();
                        boolean zR = r(jcrVarA, z3, true);
                        if (jcrVarA == jcrVar && zR) {
                            z = true;
                        }
                    }
                    if (fdaeVar != null) {
                        fdaeVar.invoke();
                    }
                } else {
                    z = false;
                }
                this.c = false;
                this.d = false;
                z2 = z;
            } finally {
            }
        }
        a();
        return z2;
    }

    public final boolean j(jcr jcrVar, boolean z) {
        int iAC = jcrVar.aC();
        int i = iAC - 1;
        if (iAC == 0) {
            throw null;
        }
        if (i != 0 && i != 1) {
            if (i == 2 || i == 3) {
                this.g.n(new jdn(jcrVar, false, z));
            } else {
                if (i != 4) {
                    throw new fctg();
                }
                if (!jcrVar.an() || z) {
                    jcrVar.V();
                    if (!jcrVar.B && (jcrVar.f() || o(jcrVar))) {
                        jcr jcrVarS = jcrVar.s();
                        if (jcrVarS == null || !jcrVarS.an()) {
                            this.b.a(jcrVar, false);
                        }
                        if (!this.d) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }
}
