package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fmx {
    public final fdy a;
    public kel b;
    public fdap c;
    public faj d;
    public final hox e;
    public kfp f;
    public fdae g;
    public fdjx h;
    public iqa i;
    public igr j;
    public final hox k;
    public final hox l;
    public long m;
    public Integer n;
    public long o;
    public kew p;
    public final fbh q;
    public final fic r;
    public jgu s;
    public jkd t;
    private final hox u;
    private final hox v;
    private int w;
    private fjz x;
    private final hox y;

    public fmx() {
        this(null);
    }

    private final boolean I() {
        return !jyo.i(f().c);
    }

    private final boolean J() {
        return this.f instanceof ken;
    }

    public final boolean A() {
        return ((Boolean) this.l.a()).booleanValue();
    }

    public final void D() {
        fdjx fdjxVar = this.h;
        if (fdjxVar != null) {
            fdil.d(fdjxVar, null, fdjz.d, new fmi(this, null), 1);
        }
    }

    public final void G() {
        fdjx fdjxVar = this.h;
        if (fdjxVar != null) {
            fdil.d(fdjxVar, null, fdjz.d, new fml(this, null), 1);
        }
    }

    public final void H(boolean z) {
        fdjx fdjxVar = this.h;
        if (fdjxVar != null) {
            fdil.d(fdjxVar, null, fdjz.d, new fmg(this, z, null), 1);
        }
    }

    public final long a(boolean z) {
        fda fdaVarD;
        jyi jyiVar;
        juo juoVarE;
        faj fajVar = this.d;
        if (fajVar == null || (fdaVarD = fajVar.d()) == null || (jyiVar = fdaVarD.a) == null || (juoVarE = e()) == null) {
            return 9205357640488583168L;
        }
        if (fdbq.f(juoVarE.b, jyiVar.a.a.b)) {
            return fns.a(jyiVar, this.b.a(z ? jyo.e(f().c) : jyo.a(f().c)), z, jyo.j(f().c));
        }
        return 9205357640488583168L;
    }

    public final long b(kew kewVar, long j, boolean z, boolean z2, fit fitVar, boolean z3) {
        fda fdaVarD;
        long j2;
        fil filVar;
        boolean z4;
        boolean z5;
        iqa iqaVar;
        int i;
        faj fajVar = this.d;
        if (fajVar == null || (fdaVarD = fajVar.d()) == null) {
            return jyo.a;
        }
        kel kelVar = this.b;
        long j3 = kewVar.c;
        long jA = jyp.a(kelVar.a(jyo.e(j3)), this.b.a(jyo.a(j3)));
        int iA = fdaVarD.a(j, false);
        int iE = (z2 || z) ? iA : jyo.e(jA);
        int iA2 = (!z2 || z) ? iA : jyo.a(jA);
        fjz fjzVar = this.x;
        int i2 = (z || fjzVar == null || (i = this.w) == -1) ? -1 : i;
        jyi jyiVar = fdaVarD.a;
        if (z) {
            j2 = j3;
            filVar = null;
        } else {
            j2 = j3;
            filVar = new fil(new fik(fkc.b(jyiVar, jyo.e(jA)), jyo.e(jA), 1L), new fik(fkc.b(jyiVar, jyo.a(jA)), jyo.a(jA), 1L), jyo.j(jA));
        }
        fmd fmdVar = new fmd(z2, 1, 1, filVar, new fij(1L, 1, iE, iA2, i2, jyiVar));
        if (!fmdVar.m(fjzVar)) {
            return j2;
        }
        this.x = fmdVar;
        this.w = iA;
        fil filVarA = fitVar.a(fmdVar);
        long jA2 = jyp.a(this.b.b(filVarA.a.a), this.b.b(filVarA.b.a));
        long j4 = j2;
        if (jyo.h(jA2, j4)) {
            return j4;
        }
        boolean z6 = jyo.j(jA2) != jyo.j(j4) && jyo.h(jyp.a(jyo.a(jA2), jyo.e(jA2)), j4);
        boolean z7 = jyo.i(jA2) && jyo.i(j4);
        if (z3 && kewVar.a().length() > 0 && !z6 && !z7 && (iqaVar = this.i) != null) {
            iqaVar.a(9);
        }
        this.c.invoke(new kew(kewVar.b, jA2));
        if (!z3) {
            t(!jyo.i(jA2));
        }
        faj fajVar2 = this.d;
        if (fajVar2 != null) {
            fajVar2.i(z3);
        }
        faj fajVar3 = this.d;
        if (fajVar3 != null) {
            fajVar3.o(!jyo.i(jA2) && fnb.a(this, true));
        }
        faj fajVar4 = this.d;
        if (fajVar4 != null) {
            if (jyo.i(jA2)) {
                z4 = false;
            } else {
                z4 = false;
                if (fnb.a(this, false)) {
                    z5 = true;
                }
                fajVar4.n(z5);
            }
            z5 = z4;
            fajVar4.n(z5);
        } else {
            z4 = false;
        }
        faj fajVar5 = this.d;
        if (fajVar5 != null) {
            if (jyo.i(jA2) && fnb.a(this, true)) {
                z4 = true;
            }
            fajVar5.l(z4);
        }
        return jA2;
    }

    public final ezl c() {
        return (ezl) this.u.a();
    }

    public final ihs d() {
        return (ihs) this.v.a();
    }

    public final juo e() {
        fbf fbfVar;
        faj fajVar = this.d;
        if (fajVar == null || (fbfVar = fajVar.a) == null) {
            return null;
        }
        return fbfVar.a;
    }

    public final kew f() {
        return (kew) this.e.a();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(defpackage.fcxy r5) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.fmw
            if (r0 == 0) goto L13
            r0 = r5
            fmw r0 = (defpackage.fmw) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            fmw r0 = new fmw
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            fmx r0 = r0.d
            defpackage.fctl.b(r5)
            goto L44
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L31:
            defpackage.fctl.b(r5)
            jgu r5 = r4.s
            if (r5 == 0) goto L47
            r0.d = r4
            r0.c = r3
            java.lang.Object r5 = r5.a()
            if (r5 != r1) goto L43
            return r1
        L43:
            r0 = r4
        L44:
            jlf r5 = (defpackage.jlf) r5
            goto L49
        L47:
            r5 = 0
            r0 = r4
        L49:
            hox r0 = r0.y
            r0.b(r5)
            fctx r5 = defpackage.fctx.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fmx.g(fcxy):java.lang.Object");
    }

    public final void h() {
        fdae fdaeVar = this.g;
        if (fdaeVar != null) {
            fdaeVar.invoke();
        }
    }

    public final void i(ihs ihsVar) {
        if (!jyo.i(f().c)) {
            faj fajVar = this.d;
            fda fdaVarD = fajVar != null ? fajVar.d() : null;
            int iC = (ihsVar == null || fdaVarD == null) ? jyo.c(f().c) : this.b.b(fdaVarD.a(ihsVar.a, true));
            this.c.invoke(kew.b(f(), null, jyp.a(iC, iC), 5));
        }
        q((ihsVar == null || f().a().length() <= 0) ? ezm.a : ezm.c);
        t(false);
    }

    public final void j(boolean z) {
        igr igrVar;
        faj fajVar = this.d;
        if (fajVar != null && !fajVar.p() && (igrVar = this.j) != null) {
            igrVar.a(new igq());
        }
        this.p = f();
        t(z);
        q(ezm.b);
    }

    public final void k() {
        t(false);
        q(ezm.a);
    }

    public final void l() {
        jkd jkdVar = this.t;
        if (jkdVar == null || jkdVar.b != 1) {
            return;
        }
        jkdVar.a();
    }

    public final void m() {
        juo juoVar = f().b;
        long jA = jyp.a(0, f().a().length());
        long j = jyo.a;
        kew kewVar = new kew(juoVar, jA);
        this.c.invoke(kewVar);
        this.p = kew.b(this.p, null, kewVar.c, 5);
        j(true);
    }

    public final void n(ihs ihsVar) {
        this.v.b(ihsVar);
    }

    public final void o(long j) {
        faj fajVar = this.d;
        if (fajVar != null) {
            fajVar.g(j);
        }
        faj fajVar2 = this.d;
        if (fajVar2 != null) {
            fajVar2.k(jyo.a);
        }
        if (jyo.i(j)) {
            return;
        }
        k();
    }

    public final void p(ezl ezlVar) {
        this.u.b(ezlVar);
    }

    public final void q(ezm ezmVar) {
        faj fajVar = this.d;
        if (fajVar != null) {
            if (fajVar.c() == ezmVar) {
                fajVar = null;
            }
            if (fajVar != null) {
                fajVar.h(ezmVar);
            }
        }
    }

    public final void r(long j) {
        faj fajVar = this.d;
        if (fajVar != null) {
            fajVar.k(j);
        }
        faj fajVar2 = this.d;
        if (fajVar2 != null) {
            fajVar2.g(jyo.a);
        }
        if (jyo.i(j)) {
            return;
        }
        k();
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x001f, code lost:
    
        if (r4.s() != false) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void s() {
        /*
            r5 = this;
            hzg r0 = defpackage.hzf.a()
            r1 = 0
            if (r0 == 0) goto Lc
            fdap r2 = r0.k()
            goto Ld
        Lc:
            r2 = r1
        Ld:
            hzg r3 = defpackage.hzf.b(r0)
            boolean r4 = r5.A()     // Catch: java.lang.Throwable -> L38
            if (r4 == 0) goto L34
            faj r4 = r5.d     // Catch: java.lang.Throwable -> L38
            if (r4 == 0) goto L21
            boolean r4 = r4.s()     // Catch: java.lang.Throwable -> L38
            if (r4 == 0) goto L34
        L21:
            defpackage.hzf.e(r0, r3, r2)
            fdjx r0 = r5.h
            if (r0 == 0) goto L33
            fdjz r2 = defpackage.fdjz.d
            fmu r3 = new fmu
            r3.<init>(r5, r1)
            r4 = 1
            defpackage.fdil.d(r0, r1, r2, r3, r4)
        L33:
            return
        L34:
            defpackage.hzf.e(r0, r3, r2)
            return
        L38:
            r1 = move-exception
            defpackage.hzf.e(r0, r3, r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fmx.s():void");
    }

    public final void t(boolean z) {
        faj fajVar = this.d;
        if (fajVar != null) {
            fajVar.m(z);
        }
        if (z) {
            s();
        } else {
            l();
        }
    }

    public final boolean u() {
        return z() && jyo.i(f().c);
    }

    public final boolean v() {
        return I() && !J();
    }

    public final boolean w() {
        return I() && z() && !J();
    }

    public final boolean x() {
        jlf jlfVar;
        return z() && (jlfVar = (jlf) this.y.a()) != null && jlfVar.a.getDescription().hasMimeType("text/*");
    }

    public final boolean y() {
        return jyo.b(f().c) != f().a().length();
    }

    public final boolean z() {
        return ((Boolean) this.k.a()).booleanValue();
    }

    public fmx(fdy fdyVar) {
        this.a = fdyVar;
        this.b = fea.a;
        this.c = new fdap() { // from class: fmf
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                return fctx.a;
            }
        };
        kew kewVar = new kew((String) null, 0L, 7);
        hsi hsiVar = hsi.a;
        this.e = new hpl(kewVar, hsiVar);
        this.f = kfo.a;
        this.k = new hpl(true, hsiVar);
        this.l = new hpl(true, hsiVar);
        this.m = 0L;
        this.o = 0L;
        this.u = new hpl(null, hsiVar);
        this.v = new hpl(null, hsiVar);
        this.w = -1;
        this.p = new kew((String) null, 0L, 7);
        this.y = new hpl(null, hsiVar);
        this.q = new fmv(this);
        this.r = new fmk(this);
    }
}
