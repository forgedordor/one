package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dius implements fdau {
    final /* synthetic */ diva a;
    final /* synthetic */ fdat b;

    public dius(diva divaVar, fdat fdatVar) {
        this.a = divaVar;
        this.b = fdatVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r17v4, types: [dkrl] */
    @Override // defpackage.fdau
    public final /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        dkrm dkrmVar;
        Integer num;
        hml hmlVar = (hml) obj2;
        int iIntValue = ((Number) obj3).intValue();
        ((edp) obj).getClass();
        if ((iIntValue & 17) == 16 && hmlVar.I()) {
            hmlVar.s();
        } else {
            diva divaVar = this.a;
            boolean z = divaVar.n.a;
            ibx ibxVar = z ? ibw.j : ibw.k;
            fdat fdatVar = this.b;
            ico icoVar = ics.e;
            ixm ixmVarA = edl.a(ecr.c, ibxVar, hmlVar, 0);
            long jB = hmg.b(hmlVar);
            long j = jB ^ (jB >>> 32);
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
            int i = (int) j;
            hsk.b(hmlVar, ixmVarA, jbb.e);
            hsk.b(hmlVar, hxiVarN, jbb.d);
            fdat fdatVar2 = jbb.f;
            if (hmlVar.H() || !fdbq.f(hmlVar.f(), Integer.valueOf(i))) {
                Integer numValueOf = Integer.valueOf(i);
                hmlVar.y(numValueOf);
                hmlVar.h(numValueOf, fdatVar2);
            }
            hsk.b(hmlVar, icsVarB, jbb.c);
            edp edpVar = edp.a;
            final dpn dpnVarA = dpc.a(0, hmlVar, 0, 1);
            int iB = dpnVarA.b() - dpnVarA.c();
            hmlVar.v(-323561741);
            float fEm = ((kio) hmlVar.e(jmh.e)).em(glz.d(hmlVar).k.i());
            hmlVar.o();
            hmlVar.v(5004770);
            boolean zD = hmlVar.D(dpnVarA);
            Object objF = hmlVar.f();
            if (zD || objF == hmk.a) {
                objF = new hpl(false, hsi.a);
                hmlVar.y(objF);
            }
            hox hoxVar = (hox) objF;
            hmlVar.o();
            if (iB < fEm || !dpnVarA.h()) {
                hoxVar.b(true);
            }
            String str = divaVar.a;
            Integer num2 = divaVar.b;
            Integer num3 = divaVar.c;
            String str2 = divaVar.d;
            String str3 = divaVar.e;
            String str4 = divaVar.f;
            List list = divaVar.i;
            List list2 = divaVar.j;
            ArrayList arrayList = new ArrayList(fcva.p(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                divd divdVar = (divd) it.next();
                Iterator it2 = it;
                if (divdVar instanceof divb) {
                    divb divbVar = (divb) divdVar;
                    dkrmVar = new dkrl(divbVar.a, divbVar.b, divbVar.c, divbVar.d, divbVar.e);
                    num = num3;
                } else {
                    if (!(divdVar instanceof divc)) {
                        throw new fctg();
                    }
                    divc divcVar = (divc) divdVar;
                    num = num3;
                    dkrmVar = new dkrm(divcVar.a, divcVar.b);
                }
                arrayList.add(dkrmVar);
                it = it2;
                num3 = num;
            }
            dksh.f(edpVar, new dksk(str, num2, num3, str2, str3, str4, list, arrayList, new dksj(z)), divaVar.l, 5, dpnVarA, fdatVar, hmlVar, 6, 0);
            dlbr dlbrVar = divaVar.m;
            hmlVar.v(-323512879);
            Object objF2 = hmlVar.f();
            Object obj4 = hmk.a;
            if (objF2 == obj4) {
                objF2 = hob.a(fcyi.a, hmlVar);
                hmlVar.y(objF2);
            }
            final fdjx fdjxVar = (fdjx) objF2;
            if (!((Boolean) hoxVar.a()).booleanValue()) {
                hmlVar.v(-1633490746);
                boolean zF = hmlVar.F(fdjxVar) | hmlVar.D(dpnVarA);
                Object objF3 = hmlVar.f();
                if (zF || objF3 == obj4) {
                    objF3 = new fdae() { // from class: diuq
                        @Override // defpackage.fdae
                        public final Object invoke() {
                            fdil.d(fdjxVar, null, null, new diur(dpnVarA, null), 3);
                            return fctx.a;
                        }
                    };
                    hmlVar.y(objF3);
                }
                hmlVar.o();
                dlbp.b(dlbr.a(dlbrVar, true, null, null, (fdae) objF3, 14), efs.b(edp.a(joj.a(icoVar, "bottom_sheet_scroll_to_bottom"), ibw.k), 0.0f, -8.0f), false, hmlVar, 0, 4);
            }
            hmlVar.o();
            diuy.h(1, divaVar.g, true, efy.i(icoVar, 24.0f, 0.0f, 2), divaVar.h, hoxVar, hmlVar, 3072, 0);
            hmlVar.n();
        }
        return fctx.a;
    }
}
