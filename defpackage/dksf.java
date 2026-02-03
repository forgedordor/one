package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dksf implements fdat {
    final /* synthetic */ dkrm a;
    final /* synthetic */ int b;

    public dksf(dkrm dkrmVar, int i) {
        this.a = dkrmVar;
        this.b = i;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hml hmlVar = (hml) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hmlVar.I()) {
            hmlVar.s();
        } else {
            dkrm dkrmVar = this.a;
            int i = this.b;
            ecj ecjVarG = ecr.g(16.0f);
            ico icoVar = ics.e;
            ibx ibxVar = ibw.j;
            ixm ixmVarA = edl.a(ecjVarG, ibxVar, hmlVar, 6);
            int iA = dksc.a(hmg.b(hmlVar));
            hxi hxiVarN = hmlVar.N();
            ics icsVarB = icj.b(hmlVar, icoVar);
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
            ics icsVarA = dkl.a(icoVar, glz.a(hmlVar).F, glz.c(hmlVar).c);
            iby ibyVar = ibw.a;
            ixm ixmVarA2 = ecz.a(ibyVar, false);
            int iA2 = dksc.a(hmg.b(hmlVar));
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
            ics icsVarB3 = edf.a.b(icoVar);
            hmlVar.v(1849434622);
            Object objF = hmlVar.f();
            Object obj3 = hmk.a;
            if (objF == obj3) {
                objF = new fdap() { // from class: dksd
                    @Override // defpackage.fdap
                    public final Object invoke(Object obj4) {
                        jto jtoVar = (jto) obj4;
                        jtoVar.getClass();
                        jtk.g(jtoVar);
                        return fctx.a;
                    }
                };
                hmlVar.y(objF);
            }
            hmlVar.o();
            ics icsVarC = jsh.c(icsVarB3, false, (fdap) objF);
            hmlVar.v(1849434622);
            Object objF2 = hmlVar.f();
            if (objF2 == obj3) {
                objF2 = new ebk();
                hmlVar.y(objF2);
            }
            ebk ebkVar = (ebk) objF2;
            hmlVar.o();
            hmlVar.v(1849434622);
            Object objF3 = hmlVar.f();
            if (objF3 == obj3) {
                objF3 = new fdae() { // from class: dkse
                    @Override // defpackage.fdae
                    public final Object invoke() {
                        return fctx.a;
                    }
                };
                hmlVar.y(objF3);
            }
            hmlVar.o();
            ics icsVarA2 = idb.a(dli.c(icsVarC, ebkVar, null, false, null, null, (fdae) objF3, 28), 100.0f);
            ixm ixmVarA3 = ecz.a(ibyVar, false);
            int iA3 = dksc.a(hmg.b(hmlVar));
            hxi hxiVarN3 = hmlVar.N();
            ics icsVarB4 = icj.b(hmlVar, icsVarA2);
            hmlVar.M();
            hmlVar.x();
            if (hmlVar.H()) {
                hmlVar.j(fdaeVar);
            } else {
                hmlVar.z();
            }
            hsk.b(hmlVar, ixmVarA3, fdatVar);
            hsk.b(hmlVar, hxiVarN3, fdatVar2);
            if (hmlVar.H() || !fdbq.f(hmlVar.f(), Integer.valueOf(iA3))) {
                Integer numValueOf3 = Integer.valueOf(iA3);
                hmlVar.y(numValueOf3);
                hmlVar.h(numValueOf3, fdatVar3);
            }
            hsk.b(hmlVar, icsVarB4, fdatVar4);
            hmlVar.n();
            ics icsVarJ = efy.j(dkl.a(icoVar, glz.a(hmlVar).c, glz.c(hmlVar).c), 0.0f, 8.0f, 0.0f, 8.0f, 5);
            ixm ixmVarA4 = edl.a(ecr.c, ibxVar, hmlVar, 0);
            int iA4 = dksc.a(hmg.b(hmlVar));
            hxi hxiVarN4 = hmlVar.N();
            ics icsVarB5 = icj.b(hmlVar, icsVarJ);
            hmlVar.M();
            hmlVar.x();
            if (hmlVar.H()) {
                hmlVar.j(fdaeVar);
            } else {
                hmlVar.z();
            }
            hsk.b(hmlVar, ixmVarA4, fdatVar);
            hsk.b(hmlVar, hxiVarN4, fdatVar2);
            if (hmlVar.H() || !fdbq.f(hmlVar.f(), Integer.valueOf(iA4))) {
                Integer numValueOf4 = Integer.valueOf(iA4);
                hmlVar.y(numValueOf4);
                hmlVar.h(numValueOf4, fdatVar3);
            }
            hsk.b(hmlVar, icsVarB5, fdatVar4);
            hmlVar.v(2102965333);
            Iterator it = dkrmVar.a.iterator();
            while (it.hasNext()) {
                dleh.a(new dldx(((dksi) it.next()).a), null, dpc.a((int) ((kio) hmlVar.e(jmh.e)).en(r1.b), hmlVar, 0, 0), false, null, hmlVar, 0, 26);
            }
            hmlVar.o();
            hmlVar.n();
            hmlVar.n();
            dthx.b(dkrmVar.b.a, egq.d(icoVar, 1.0f), glz.a(hmlVar).q, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, jyq.y(glz.d(hmlVar).h, 0L, 0L, kcc.f, null, null, null, 0L, null, i, 0, 0L, null, null, 0, 16744443), hmlVar, 48, 0, 65528);
            hmlVar.n();
        }
        return fctx.a;
    }
}
