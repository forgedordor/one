package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class ctul implements fdat {
    final /* synthetic */ hsf a;
    final /* synthetic */ dpn b;

    public ctul(hsf hsfVar, dpn dpnVar) {
        this.a = hsfVar;
        this.b = dpnVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hml hmlVar = (hml) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hmlVar.I()) {
            hmlVar.s();
        } else {
            hmlVar.v(1849434622);
            Object objF = hmlVar.f();
            if (objF == hmk.a) {
                objF = new igr();
                hmlVar.y(objF);
            }
            igr igrVar = (igr) objF;
            hmlVar.o();
            ibx ibxVar = ibw.k;
            hmlVar.v(748583515);
            hsf hsfVar = this.a;
            ico icoVar = ics.e;
            ics icsVarA = ctuo.a(hsfVar).s.a ? dkl.a(icoVar, glz.a(hmlVar).F, ikj.a) : icoVar;
            hmlVar.o();
            dpn dpnVar = this.b;
            ecq ecqVar = ecr.c;
            ixm ixmVarA = edl.a(ecqVar, ibxVar, hmlVar, 48);
            int iA = ctuk.a(hmg.b(hmlVar));
            hxi hxiVarN = hmlVar.N();
            ics icsVarB = icj.b(hmlVar, icsVarA);
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
            ctuo.l(ctuo.a(hsfVar).a, ctuo.a(hsfVar).q, ctuo.a(hsfVar).s.a, hmlVar, 0);
            ics icsVarC = dpc.c(icoVar, dpnVar, false & ((14 & 8) == 0), (14 & 2) != 0, true);
            ixm ixmVarA2 = edl.a(ecqVar, ibxVar, hmlVar, 48);
            int iA2 = ctuk.a(hmg.b(hmlVar));
            hxi hxiVarN2 = hmlVar.N();
            ics icsVarB2 = icj.b(hmlVar, icsVarC);
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
            dkrj dkrjVar = ctuo.a(hsfVar).b;
            dkrk dkrkVar = ctuo.a(hsfVar).c;
            if (ctuo.a(hsfVar).s.b && dkrkVar != null) {
                hmlVar.v(-385717450);
                ctuo.f(dkrkVar, ctuo.a(hsfVar), hmlVar, 0);
                hmlVar.o();
            } else if (ctuo.a(hsfVar).s.b || dkrjVar == null || dkrjVar.a.isEmpty()) {
                hmlVar.v(-385403296);
                hmlVar.o();
            } else {
                hmlVar.v(-385469605);
                ctuo.e(dkrjVar, hmlVar, 0);
                hmlVar.o();
            }
            ctuo.i(ctuo.a(hsfVar), igrVar, hmlVar, 48);
            dthx.b(ctuo.a(hsfVar).k, null, glz.a(hmlVar).q, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, glz.d(hmlVar).l, hmlVar, 0, 0, 65530);
            ctrn ctrnVar = ctuo.a(hsfVar).e;
            hmlVar.v(-1674991196);
            if (ctrnVar != null) {
                ctuo.c(ctrnVar, hmlVar, 0);
            }
            hmlVar.o();
            hmlVar.n();
            hmlVar.n();
            ctuo.m(igrVar, hmlVar, 6);
        }
        return fctx.a;
    }
}
