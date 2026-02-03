package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fla implements fbh {
    final /* synthetic */ boolean a;
    final /* synthetic */ flg b;

    public fla(boolean z, flg flgVar) {
        this.a = z;
        this.b = flgVar;
    }

    private final void g() {
        flg flgVar = this.b;
        flgVar.v(true);
        flgVar.q(null);
        flgVar.n(null);
    }

    @Override // defpackage.fbh
    public final void a() {
        g();
    }

    @Override // defpackage.fbh
    public final void b(long j) {
        flg flgVar = this.b;
        if (flgVar.d() == null) {
            return;
        }
        flgVar.p(ihs.e(flgVar.c(), j));
        long jE = ihs.e(flgVar.b(), flgVar.c());
        if (flgVar.G(new ihs(jE), flgVar.b(), this.a, fis.d)) {
            flgVar.o(jE);
            flgVar.p(0L);
        }
    }

    @Override // defpackage.fbh
    public final void c(long j) {
        flg flgVar = this.b;
        if (flgVar.d() == null) {
            return;
        }
        fil filVarF = flgVar.f();
        filVarF.getClass();
        boolean z = this.a;
        Object objA = flgVar.a.c.a((z ? filVarF.a : filVarF.b).b);
        if (objA == null) {
            ebs.b("SelectionRegistrar should contain the current selection's selectableIds");
            throw new fcta();
        }
        fii fiiVar = (fii) objA;
        ivy ivyVarK = fiiVar.k();
        if (ivyVarK == null) {
            ebs.b("Current selectable should have layout coordinates.");
            throw new fcta();
        }
        long jF = fiiVar.f(filVarF, z);
        if ((9223372034707292159L & jF) != 9205357640488583168L) {
            flgVar.o(flgVar.j().h(ivyVarK, fjy.a(jF)));
            flgVar.p(0L);
        }
    }

    @Override // defpackage.fbh
    public final void d() {
        g();
    }

    @Override // defpackage.fbh
    public final void e() {
        g();
    }

    @Override // defpackage.fbh
    public final void f() {
        flg flgVar;
        fil filVarF;
        ivy ivyVarK;
        boolean z = this.a;
        if ((z ? this.b.h() : this.b.g()) == null || (filVarF = (flgVar = this.b).f()) == null) {
            return;
        }
        fii fiiVarE = flgVar.e(z ? filVarF.a : filVarF.b);
        if (fiiVarE == null || (ivyVarK = fiiVarE.k()) == null) {
            return;
        }
        long jF = fiiVarE.f(filVarF, z);
        if ((9223372034707292159L & jF) != 9205357640488583168L) {
            flgVar.n(new ihs(flgVar.j().h(ivyVarK, fjy.a(jF))));
            flgVar.q(z ? ezl.b : ezl.c);
            flgVar.v(false);
        }
    }
}
