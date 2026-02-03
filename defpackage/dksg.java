package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dksg implements fdat {
    final /* synthetic */ dkrn a;
    final /* synthetic */ int b;

    public dksg(dkrn dkrnVar, int i) {
        this.a = dkrnVar;
        this.b = i;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hml hmlVar = (hml) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hmlVar.I()) {
            hmlVar.s();
        } else {
            ics icsVarD = efy.d(ics.e, 12.0f);
            dkrn dkrnVar = this.a;
            int i = this.b;
            ixm ixmVarA = edl.a(ecr.g(10.0f), ibw.j, hmlVar, 6);
            long jB = hmg.b(hmlVar);
            long j = jB ^ (jB >>> 32);
            hxi hxiVarN = hmlVar.N();
            ics icsVarB = icj.b(hmlVar, icsVarD);
            fdae fdaeVar = jbb.a;
            hmlVar.M();
            hmlVar.x();
            if (hmlVar.H()) {
                hmlVar.j(fdaeVar);
            } else {
                hmlVar.z();
            }
            int i2 = (int) j;
            hsk.b(hmlVar, ixmVarA, jbb.e);
            hsk.b(hmlVar, hxiVarN, jbb.d);
            fdat fdatVar = jbb.f;
            if (hmlVar.H() || !fdbq.f(hmlVar.f(), Integer.valueOf(i2))) {
                Integer numValueOf = Integer.valueOf(i2);
                hmlVar.y(numValueOf);
                hmlVar.h(numValueOf, fdatVar);
            }
            hsk.b(hmlVar, icsVarB, jbb.c);
            if (dkrnVar instanceof dkrl) {
                hmlVar.v(1315175840);
                dksh.a((dkrl) dkrnVar, i, hmlVar, 0);
                hmlVar.o();
            } else {
                if (!(dkrnVar instanceof dkrm)) {
                    hmlVar.v(1315173125);
                    hmlVar.o();
                    throw new fctg();
                }
                hmlVar.v(1315179069);
                dksh.b((dkrm) dkrnVar, i, hmlVar, 0);
                hmlVar.o();
            }
            hmlVar.n();
        }
        return fctx.a;
    }
}
