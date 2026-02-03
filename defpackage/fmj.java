package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fmj implements fbh {
    final /* synthetic */ fmx a;
    final /* synthetic */ boolean b;

    public fmj(fmx fmxVar, boolean z) {
        this.a = fmxVar;
        this.b = z;
    }

    @Override // defpackage.fbh
    public final void b(long j) {
        fmx fmxVar = this.a;
        long jE = ihs.e(fmxVar.o, j);
        fmxVar.o = jE;
        fmxVar.n(new ihs(ihs.e(fmxVar.m, jE)));
        kew kewVarF = fmxVar.f();
        ihs ihsVarD = fmxVar.d();
        ihsVarD.getClass();
        fmxVar.b(kewVarF, ihsVarD.a, false, this.b, fis.d, true);
        fmxVar.t(false);
    }

    @Override // defpackage.fbh
    public final void d() {
        fmx fmxVar = this.a;
        fmxVar.p(null);
        fmxVar.n(null);
        fmxVar.t(true);
    }

    @Override // defpackage.fbh
    public final void e() {
        fmx fmxVar = this.a;
        fmxVar.p(null);
        fmxVar.n(null);
        fmxVar.t(true);
    }

    @Override // defpackage.fbh
    public final void f() {
        fda fdaVarD;
        boolean z = this.b;
        ezl ezlVar = z ? ezl.b : ezl.c;
        fmx fmxVar = this.a;
        fmxVar.p(ezlVar);
        long jA = fjy.a(fmxVar.a(z));
        faj fajVar = fmxVar.d;
        if (fajVar == null || (fdaVarD = fajVar.d()) == null) {
            return;
        }
        long jC = fdaVarD.c(jA);
        fmxVar.m = jC;
        fmxVar.n(new ihs(jC));
        fmxVar.o = 0L;
        fmxVar.w = -1;
        faj fajVar2 = fmxVar.d;
        if (fajVar2 != null) {
            fajVar2.i(true);
        }
        fmxVar.t(false);
    }

    @Override // defpackage.fbh
    public final void a() {
    }

    @Override // defpackage.fbh
    public final void c(long j) {
    }
}
