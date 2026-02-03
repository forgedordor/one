package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fmh implements fbh {
    final /* synthetic */ fmx a;

    public fmh(fmx fmxVar) {
        this.a = fmxVar;
    }

    @Override // defpackage.fbh
    public final void b(long j) {
        fda fdaVarD;
        iqa iqaVar;
        fmx fmxVar = this.a;
        fmxVar.o = ihs.e(fmxVar.o, j);
        faj fajVar = fmxVar.d;
        if (fajVar == null || (fdaVarD = fajVar.d()) == null) {
            return;
        }
        fmxVar.n(new ihs(ihs.e(fmxVar.m, fmxVar.o)));
        kel kelVar = fmxVar.b;
        ihs ihsVarD = fmxVar.d();
        ihsVarD.getClass();
        int iB = kelVar.b(fdaVarD.a(ihsVarD.a, true));
        long jA = jyp.a(iB, iB);
        long j2 = jyo.a;
        if (jyo.h(jA, fmxVar.f().c)) {
            return;
        }
        faj fajVar2 = fmxVar.d;
        if ((fajVar2 == null || fajVar2.s()) && (iqaVar = fmxVar.i) != null) {
            iqaVar.a(9);
        }
        fmxVar.c.invoke(new kew(fmxVar.f().b, jA));
    }

    @Override // defpackage.fbh
    public final void c(long j) {
        fda fdaVarD;
        fmx fmxVar = this.a;
        long jA = fjy.a(fmxVar.a(true));
        faj fajVar = fmxVar.d;
        if (fajVar == null || (fdaVarD = fajVar.d()) == null) {
            return;
        }
        long jC = fdaVarD.c(jA);
        fmxVar.m = jC;
        fmxVar.n(new ihs(jC));
        fmxVar.o = 0L;
        fmxVar.p(ezl.a);
        fmxVar.t(false);
    }

    @Override // defpackage.fbh
    public final void d() {
        fmx fmxVar = this.a;
        fmxVar.p(null);
        fmxVar.n(null);
    }

    @Override // defpackage.fbh
    public final void e() {
        fmx fmxVar = this.a;
        fmxVar.p(null);
        fmxVar.n(null);
    }

    @Override // defpackage.fbh
    public final void a() {
    }

    @Override // defpackage.fbh
    public final void f() {
    }
}
