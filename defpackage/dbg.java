package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dbg extends icr implements iuh, jbp, jac, cyn {
    public boolean a;
    public dbm b;
    public final jaa c;
    private ini d;

    public dbg(dbm dbmVar) {
        this.b = dbmVar;
        this.d = dbmVar.f();
        this.c = jad.a(new fcti(dbi.a, dbmVar));
    }

    private final void x(ini iniVar) {
        if (iniVar == null) {
            ini iniVar2 = this.d;
            if (iniVar2 != null) {
                jbg.k(this).b(iniVar2);
            }
        } else {
            this.b.k.b(iniVar);
        }
        this.d = iniVar;
    }

    @Override // defpackage.iuh
    public final /* synthetic */ int a(iue iueVar, ivt ivtVar, int i) {
        jer jerVar = this.s.y;
        jerVar.getClass();
        jdf jdfVarC = jerVar.C();
        jdfVarC.getClass();
        if (!jdfVarC.V()) {
            return ivtVar.a(i);
        }
        return o(new iug(iueVar, iueVar.q()), new jeu(ivtVar, 2, 2), kim.k(0, i, 0, 13)).j();
    }

    @Override // defpackage.jcd
    public final ixn b(ixp ixpVar, ixk ixkVar, long j) {
        iyl iylVarE = ixkVar.e(j);
        return ixpVar.ej(iylVarE.a, iylVarE.b, fcvp.a, new dbf(iylVarE, this));
    }

    @Override // defpackage.icr
    public final void dT() {
        ini iniVar = this.d;
        if (iniVar != null) {
            jbg.k(this).b(iniVar);
        }
        x(jbg.k(this).a());
    }

    @Override // defpackage.icr
    public final void dU() {
        u();
    }

    @Override // defpackage.jcd
    public final /* synthetic */ int e(ivu ivuVar, ivt ivtVar, int i) {
        return jcc.a(this, ivuVar, ivtVar, i);
    }

    @Override // defpackage.jcd
    public final /* synthetic */ int f(ivu ivuVar, ivt ivtVar, int i) {
        return jcc.b(this, ivuVar, ivtVar, i);
    }

    @Override // defpackage.jcd
    public final /* synthetic */ int g(ivu ivuVar, ivt ivtVar, int i) {
        return jcc.c(this, ivuVar, ivtVar, i);
    }

    @Override // defpackage.jcd
    public final /* synthetic */ int h(ivu ivuVar, ivt ivtVar, int i) {
        return jcc.d(this, ivuVar, ivtVar, i);
    }

    @Override // defpackage.iuh
    public final /* synthetic */ int i(iue iueVar, ivt ivtVar, int i) {
        jer jerVar = this.s.y;
        jerVar.getClass();
        jdf jdfVarC = jerVar.C();
        jdfVarC.getClass();
        if (!jdfVarC.V()) {
            return ivtVar.b(i);
        }
        return o(new iug(iueVar, iueVar.q()), new jeu(ivtVar, 2, 1), kim.k(0, 0, i, 7)).k();
    }

    @Override // defpackage.iuh
    public final /* synthetic */ int j(iue iueVar, ivt ivtVar, int i) {
        jer jerVar = this.s.y;
        jerVar.getClass();
        jdf jdfVarC = jerVar.C();
        jdfVarC.getClass();
        if (!jdfVarC.V()) {
            return ivtVar.c(i);
        }
        return o(new iug(iueVar, iueVar.q()), new jeu(ivtVar, 1, 2), kim.k(0, i, 0, 13)).j();
    }

    @Override // defpackage.iuh
    public final /* synthetic */ int k(iue iueVar, ivt ivtVar, int i) {
        jer jerVar = this.s.y;
        jerVar.getClass();
        jdf jdfVarC = jerVar.C();
        jdfVarC.getClass();
        if (!jdfVarC.V()) {
            return ivtVar.d(i);
        }
        return o(new iug(iueVar, iueVar.q()), new jeu(ivtVar, 1, 1), kim.k(0, 0, i, 7)).k();
    }

    public final cyl l() {
        return this.b.c();
    }

    public final dbl m() {
        return this.b.d();
    }

    public final ivy n() {
        ivy ivyVar = m().b.f;
        if (ivyVar != null) {
            return ivyVar;
        }
        fdbq.c("root");
        return null;
    }

    @Override // defpackage.iuh
    public final ixn o(iui iuiVar, ixk ixkVar, long j) {
        int i;
        if (m().j()) {
            ihu ihuVarC = l().c();
            if (ihuVarC == null) {
                dbl dblVarM = m();
                if (dblVarM.j()) {
                    dblVarM.i();
                    if (dblVarM.b() == null) {
                        dblVarM.e(dblVarM.c());
                    }
                    ihuVarC = dblVarM.b();
                } else {
                    ihuVarC = null;
                }
            }
            if (ihuVarC != null) {
                long jC = kjh.c(ihuVarC.b());
                long j2 = jC >> 32;
                long j3 = jC & 4294967295L;
                int i2 = (int) j2;
                if (i2 == Integer.MAX_VALUE || (i = (int) j3) == Integer.MAX_VALUE) {
                    throw new IllegalArgumentException("Error: Infinite width/height is invalid. animated bounds: " + l().c() + ", current bounds: " + m().b());
                }
                j = kik.c(fddu.f(i2, 0), fddu.f(i, 0));
            }
        }
        iyl iylVarE = ixkVar.e(j);
        this.a = true;
        if (!m().j()) {
            m().e(null);
            return iuiVar.ej(iylVarE.a, iylVarE.b, fcvp.a, new dbb(iylVarE));
        }
        if (!m().b.a()) {
            return iuiVar.ej(iylVarE.a, iylVarE.b, fcvp.a, new dbc(this, iylVarE));
        }
        dbo dboVar = (dbo) this.b.d.a();
        long jG = this.b.d().b.dX(jbg.b(this)).g();
        dboVar.a();
        return iuiVar.ej((int) (jG >> 32), (int) (jG & 4294967295L), fcvp.a, new dbd(this, iylVarE));
    }

    @Override // defpackage.jac
    public final jaa p() {
        return this.c;
    }

    @Override // defpackage.jaf
    public final /* synthetic */ Object q(izw izwVar) {
        return jab.a(this, izwVar);
    }

    @Override // defpackage.jbp
    public final void r(imw imwVar) {
        dbm dbmVar = this.b;
        if (m().j() && m().b() != null) {
            dbr dbrVarE = this.b.e();
            m().b().getClass();
            jbg.g(this);
            dbm dbmVar2 = dbrVarE.b().i;
            dbr dbrVarE2 = dbmVar2 != null ? dbmVar2.e() : null;
            if (dbrVarE2 != null) {
                dbrVarE2.b();
            }
        }
        dbmVar.h = null;
        ini iniVarF = this.b.f();
        if (iniVarF == null) {
            throw new IllegalArgumentException("Error: Layer is null when accessed for shared bounds/element : " + m().a + ",target: " + this.b.c().e() + ", is attached: " + this.C);
        }
        dbe dbeVar = new dbe(imwVar);
        long jB = imwVar.b();
        imwVar.s(iniVarF, (((int) Float.intBitsToFloat((int) (jB & 4294967295L))) & 4294967295L) | (((int) Float.intBitsToFloat((int) (jB >> 32))) << 32), dbeVar);
        dbm dbmVar3 = this.b;
        if (!dbmVar3.d().j() || (!dbmVar3.k() && dbmVar3.j())) {
            inm.a(imwVar, iniVarF);
        }
    }

    @Override // defpackage.icr
    public final void s() {
        x(null);
        dbm dbmVar = this.b;
        dbmVar.i = null;
        dbmVar.j = null;
        this.a = false;
    }

    public final void u() {
        jaa jaaVar = this.c;
        jag jagVar = dbi.a;
        dbm dbmVar = this.b;
        if (jaaVar == izv.a) {
            itw.c("In order to provide locals you must override providedValues: ModifierLocalMap");
        }
        if (!jaaVar.c(jagVar)) {
            itw.c(a.h(jagVar, "Any provided key must be initially provided in the overridden providedValues: ModifierLocalMap property. Key ", " was not found."));
        }
        jaaVar.b(jagVar, dbmVar);
        this.b.i = (dbm) jab.a(this, jagVar);
        x(jbg.k(this).a());
        this.a = false;
        this.b.j = this;
    }

    @Override // defpackage.iuh
    public final boolean v() {
        return m().j() && this.b.d().b.a();
    }

    @Override // defpackage.jbp
    public final /* synthetic */ void t() {
    }

    @Override // defpackage.iuh
    public final /* synthetic */ void w() {
    }
}
