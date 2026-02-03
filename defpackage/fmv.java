package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fmv implements fbh {
    final /* synthetic */ fmx a;

    public fmv(fmx fmxVar) {
        this.a = fmxVar;
    }

    private final void g() {
        fmx fmxVar = this.a;
        fmxVar.p(null);
        fmxVar.n(null);
        fmxVar.t(true);
        fmxVar.n = null;
        boolean zI = jyo.i(fmxVar.f().c);
        fmxVar.q(zI ? ezm.c : ezm.b);
        faj fajVar = fmxVar.d;
        if (fajVar != null) {
            fajVar.o(!zI && fnb.a(fmxVar, true));
        }
        faj fajVar2 = fmxVar.d;
        if (fajVar2 != null) {
            fajVar2.n(!zI && fnb.a(fmxVar, false));
        }
        faj fajVar3 = fmxVar.d;
        if (fajVar3 != null) {
            fajVar3.l(zI && fnb.a(fmxVar, true));
        }
    }

    @Override // defpackage.fbh
    public final void a() {
        g();
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0089  */
    @Override // defpackage.fbh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(long r9) {
        /*
            r8 = this;
            fmx r0 = r8.a
            boolean r1 = r0.A()
            if (r1 == 0) goto Lc5
            kew r1 = r0.f()
            java.lang.String r1 = r1.a()
            int r1 = r1.length()
            if (r1 != 0) goto L18
            goto Lc5
        L18:
            long r1 = r0.o
            long r9 = defpackage.ihs.e(r1, r9)
            r0.o = r9
            faj r9 = r0.d
            r10 = 0
            if (r9 == 0) goto Lc2
            fda r9 = r9.d()
            if (r9 == 0) goto Lc2
            long r1 = r0.m
            long r3 = r0.o
            long r1 = defpackage.ihs.e(r1, r3)
            ihs r3 = new ihs
            r3.<init>(r1)
            r0.n(r3)
            java.lang.Integer r1 = r0.n
            if (r1 != 0) goto L89
            ihs r1 = r0.d()
            r1.getClass()
            long r1 = r1.a
            boolean r1 = r9.d(r1)
            if (r1 != 0) goto L89
            kel r1 = r0.b
            long r2 = r0.m
            int r2 = defpackage.fda.e(r9, r2)
            int r1 = r1.b(r2)
            kel r2 = r0.b
            ihs r3 = r0.d()
            r3.getClass()
            long r3 = r3.a
            int r9 = defpackage.fda.e(r9, r3)
            int r9 = r2.b(r9)
            if (r1 != r9) goto L72
            fit r9 = defpackage.fis.a
            goto L74
        L72:
            fit r9 = defpackage.fis.b
        L74:
            r6 = r9
            kew r1 = r0.f()
            ihs r9 = r0.d()
            r9.getClass()
            long r2 = r9.a
            r5 = 0
            r7 = 1
            r4 = 0
            r0.b(r1, r2, r4, r5, r6, r7)
            goto Lc0
        L89:
            java.lang.Integer r1 = r0.n
            if (r1 == 0) goto L92
            int r1 = r1.intValue()
            goto L98
        L92:
            long r1 = r0.m
            int r1 = r9.a(r1, r10)
        L98:
            ihs r2 = r0.d()
            r2.getClass()
            long r2 = r2.a
            int r9 = r9.a(r2, r10)
            java.lang.Integer r2 = r0.n
            if (r2 != 0) goto Lab
            if (r1 == r9) goto Lc5
        Lab:
            kew r1 = r0.f()
            ihs r9 = r0.d()
            r9.getClass()
            long r2 = r9.a
            fit r6 = defpackage.fis.b
            r7 = 1
            r4 = 0
            r5 = 0
            r0.b(r1, r2, r4, r5, r6, r7)
        Lc0:
            long r1 = defpackage.jyo.a
        Lc2:
            r0.t(r10)
        Lc5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fmv.b(long):void");
    }

    @Override // defpackage.fbh
    public final void c(long j) {
        fmx fmxVar;
        long j2;
        fda fdaVarD;
        fda fdaVarD2;
        fmx fmxVar2 = this.a;
        if (fmxVar2.A() && fmxVar2.c() == null) {
            fmxVar2.p(ezl.c);
            fmxVar2.w = -1;
            fmxVar2.l();
            faj fajVar = fmxVar2.d;
            if (fajVar == null || (fdaVarD2 = fajVar.d()) == null || !fdaVarD2.d(j)) {
                fmxVar = fmxVar2;
                j2 = j;
                faj fajVar2 = fmxVar.d;
                if (fajVar2 != null && (fdaVarD = fajVar2.d()) != null) {
                    int iB = fmxVar.b.b(fdaVarD.a(j2, true));
                    juo juoVar = fmxVar.f().b;
                    long jA = jyp.a(iB, iB);
                    long j3 = jyo.a;
                    kew kewVar = new kew(juoVar, jA);
                    fmxVar.j(false);
                    iqa iqaVar = fmxVar.i;
                    if (iqaVar != null) {
                        iqaVar.a(9);
                    }
                    fmxVar.c.invoke(kewVar);
                }
            } else {
                if (fmxVar2.f().a().length() == 0) {
                    return;
                }
                fmxVar2.j(false);
                long jB = fmxVar2.b(kew.b(fmxVar2.f(), null, jyo.a, 5), j, true, false, fis.b, true);
                fmxVar = fmxVar2;
                j2 = j;
                fmxVar.n = Integer.valueOf(jyo.e(jB));
            }
            fmxVar.q(ezm.a);
            fmxVar.m = j2;
            fmxVar.n(new ihs(j2));
            fmxVar.o = 0L;
        }
    }

    @Override // defpackage.fbh
    public final void d() {
        g();
    }

    @Override // defpackage.fbh
    public final void e() {
    }

    @Override // defpackage.fbh
    public final void f() {
    }
}
