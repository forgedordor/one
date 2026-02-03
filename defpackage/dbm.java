package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dbm implements dax, hqt {
    public final hox a;
    public final hox b;
    public final hox c;
    public final hox d;
    public final hox e;
    public final hox f;
    public final hox g;
    public ikd h;
    public dbm i;
    public cyn j;
    public final hox k;
    public final hrg l = new hpf(0.0f);

    public dbm(dbl dblVar, cyl cylVar, dbo dboVar, dch dchVar, dbr dbrVar) {
        hsi hsiVar = hsi.a;
        this.a = new hpl(true, hsiVar);
        this.b = new hpl(dblVar, hsiVar);
        this.c = new hpl(cylVar, hsiVar);
        this.d = new hpl(dboVar, hsiVar);
        this.e = new hpl(false, hsiVar);
        this.f = new hpl(dchVar, hsiVar);
        this.g = new hpl(dbrVar, hsiVar);
        this.k = new hpl(null, hsiVar);
    }

    @Override // defpackage.dax
    public final float a() {
        return this.l.c();
    }

    @Override // defpackage.dax
    public final void b(imz imzVar) {
        ini iniVarF = f();
        if (iniVarF == null || !k() || d().b() == null) {
            return;
        }
        ihu ihuVarB = d().b();
        ihs ihsVar = ihuVarB != null ? new ihs(ihuVarB.c()) : null;
        ihsVar.getClass();
        long j = ihsVar.a;
        int i = (int) (4294967295L & j);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat(i);
        float f = -fIntBitsToFloat2;
        float f2 = -fIntBitsToFloat;
        imzVar.t().c.e(fIntBitsToFloat, fIntBitsToFloat2);
        try {
            inm.a(imzVar, iniVarF);
        } finally {
            imzVar.t().c.e(f2, f);
        }
    }

    public final cyl c() {
        return (cyl) this.c.a();
    }

    public final dbl d() {
        return (dbl) this.b.a();
    }

    public final dbr e() {
        return (dbr) this.g.a();
    }

    public final ini f() {
        return (ini) this.k.a();
    }

    @Override // defpackage.hqt
    public final void h() {
        dcf dcfVar = d().b;
        dbl dblVarD = d();
        iac iacVar = dblVarD.f;
        iacVar.remove(this);
        if (iacVar.isEmpty()) {
            dblVarD.h();
            dcf dcfVar2 = dblVarD.b;
            dbv.a().b(dblVarD);
        } else {
            dblVarD.b.g(dblVarD, dblVarD.g, dblVarD.h);
        }
        dcfVar.e.invoke(dcfVar);
        dcf dcfVar3 = dblVarD.b;
        dcfVar3.f();
        dcfVar.h.remove(this);
        if (iacVar.isEmpty()) {
            fdil.d(dcfVar3.b, null, null, new dby(dblVarD, null), 3);
        }
        d().d();
    }

    @Override // defpackage.hqt
    public final void i() {
        dcf dcfVar = d().b;
        dbl dblVarD = d();
        dblVarD.f.add(this);
        dcf dcfVar2 = dblVarD.b;
        dcfVar2.g(dblVarD, dblVarD.g, dblVarD.h);
        dcfVar.e.invoke(dcfVar);
        dcfVar2.f();
        iac iacVar = dcfVar.h;
        int i = 0;
        iaq iaqVar = new iaq(iacVar, 0);
        while (true) {
            if (!iaqVar.hasNext()) {
                i = -1;
                break;
            }
            dax daxVar = (dax) iaqVar.next();
            dbm dbmVar = daxVar instanceof dbm ? (dbm) daxVar : null;
            if (fdbq.f(dbmVar != null ? dbmVar.d() : null, d())) {
                break;
            } else {
                i++;
            }
        }
        if (i == iacVar.a() - 1 || i == -1) {
            iacVar.add(this);
        } else {
            iacVar.add(i + 1, this);
        }
        d().d();
    }

    public final boolean j() {
        return fdbq.f(d().d, this.j) || !((Boolean) this.e.a()).booleanValue();
    }

    public final boolean k() {
        return j() && d().j() && ((Boolean) this.a.a()).booleanValue() && d().b.a();
    }

    public final boolean l() {
        return c().e();
    }

    @Override // defpackage.hqt
    public final void g() {
    }
}
