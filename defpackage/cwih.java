package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cwih implements fdau {
    final /* synthetic */ cwhg a;
    final /* synthetic */ dpn b;
    final /* synthetic */ dbs c;
    final /* synthetic */ cwhs d;
    final /* synthetic */ cyg e;
    final /* synthetic */ float f;

    public cwih(cwhg cwhgVar, dpn dpnVar, dbs dbsVar, cwhs cwhsVar, cyg cygVar, float f) {
        this.a = cwhgVar;
        this.b = dpnVar;
        this.c = dbsVar;
        this.d = cwhsVar;
        this.e = cygVar;
        this.f = f;
    }

    @Override // defpackage.fdau
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        egc egcVar = (egc) obj;
        hml hmlVar = (hml) obj2;
        int iIntValue = ((Number) obj3).intValue();
        egcVar.getClass();
        if ((iIntValue & 6) == 0) {
            iIntValue |= true != hmlVar.D(egcVar) ? 2 : 4;
        }
        if ((iIntValue & 19) == 18 && hmlVar.I()) {
            hmlVar.s();
        } else {
            ico icoVar = ics.e;
            ics icsVarC = efy.c(egq.c(dkl.a(icoVar, glz.a(hmlVar).F, ikj.a), 1.0f), egcVar);
            dpn dpnVar = this.b;
            dbs dbsVar = this.c;
            cwhs cwhsVar = this.d;
            cyg cygVar = this.e;
            float f = this.f;
            ixm ixmVarA = ecz.a(ibw.a, false);
            int iA = cwig.a(hmg.b(hmlVar));
            hxi hxiVarN = hmlVar.N();
            ics icsVarB = icj.b(hmlVar, icsVarC);
            fdae fdaeVar = jbb.a;
            hmlVar.M();
            hmlVar.x();
            if (hmlVar.H()) {
                hmlVar.j(fdaeVar);
            } else {
                hmlVar.z();
            }
            fdat fdatVar = jbb.e;
            hsk.b(hmlVar, ixmVarA, fdatVar);
            fdat fdatVar2 = jbb.d;
            hsk.b(hmlVar, hxiVarN, fdatVar2);
            fdat fdatVar3 = jbb.f;
            if (hmlVar.H() || !fdbq.f(hmlVar.f(), Integer.valueOf(iA))) {
                Integer numValueOf = Integer.valueOf(iA);
                hmlVar.y(numValueOf);
                hmlVar.h(numValueOf, fdatVar3);
            }
            fdat fdatVar4 = jbb.c;
            hsk.b(hmlVar, icsVarB, fdatVar4);
            ecj ecjVarG = ecr.g(8.0f);
            ics icsVarA = joj.a(efy.j(dpc.c(icoVar, dpnVar, false & ((14 & 8) == 0), (14 & 2) != 0, true), 16.0f, 0.0f, 16.0f, 0.0f, 10), "conversation_details_scroller");
            ixm ixmVarA2 = edl.a(ecjVarG, ibw.j, hmlVar, 0);
            int iA2 = cwig.a(hmg.b(hmlVar));
            hxi hxiVarN2 = hmlVar.N();
            ics icsVarB2 = icj.b(hmlVar, icsVarA);
            hmlVar.M();
            hmlVar.x();
            if (hmlVar.H()) {
                hmlVar.j(fdaeVar);
            } else {
                hmlVar.z();
            }
            hsk.b(hmlVar, ixmVarA2, fdatVar);
            hsk.b(hmlVar, hxiVarN2, fdatVar2);
            if (hmlVar.H() || !fdbq.f(hmlVar.f(), Integer.valueOf(iA2))) {
                Integer numValueOf2 = Integer.valueOf(iA2);
                hmlVar.y(numValueOf2);
                hmlVar.h(numValueOf2, fdatVar3);
            }
            hsk.b(hmlVar, icsVarB2, fdatVar4);
            cwab.d(dbsVar, cwhsVar.a, cygVar, 1.0f - f, hmlVar, 0);
            cwil.d(cwhsVar, hmlVar, 0);
            egt.a(ehr.b(icoVar), hmlVar);
            hmlVar.n();
            hmlVar.n();
            cwhg cwhgVar = this.a;
            cweb.a(cwhgVar.a.i, hmlVar, 0);
            dktt dkttVar = (dktt) hro.a(cwhgVar.b, hmlVar).a();
            hmlVar.v(-1575390289);
            if (dkttVar != null) {
                if (dkttVar instanceof djmy) {
                    hmlVar.v(1710591355);
                    djmf.a((djmy) dkttVar, null, hmlVar, 0);
                    hmlVar.o();
                } else if (dkttVar instanceof divg) {
                    hmlVar.v(1710593156);
                    zyl.b((divg) dkttVar, null, hmlVar, 0);
                    hmlVar.o();
                } else if (dkttVar instanceof aaam) {
                    hmlVar.v(1710595951);
                    ((aaam) dkttVar).a.a(hmlVar, 0);
                    hmlVar.o();
                } else if (dkttVar instanceof dmgp) {
                    hmlVar.v(1710598357);
                    ((dmgl) hmlVar.e(cwil.a)).a((dmgp) dkttVar, hmlVar, 0);
                    hmlVar.o();
                } else {
                    hmlVar.v(1488965852);
                    hmlVar.o();
                }
            }
            hmlVar.o();
        }
        return fctx.a;
    }
}
