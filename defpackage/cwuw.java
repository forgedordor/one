package defpackage;

import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cwuw implements fdat {
    final /* synthetic */ hox a;
    final /* synthetic */ kph b;
    final /* synthetic */ cwui c;
    final /* synthetic */ fdae d;
    final /* synthetic */ fdae e;

    public cwuw(hox hoxVar, kph kphVar, cwui cwuiVar, fdae fdaeVar, fdae fdaeVar2) {
        this.a = hoxVar;
        this.b = kphVar;
        this.c = cwuiVar;
        this.d = fdaeVar;
        this.e = fdaeVar2;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hml hmlVar = (hml) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hmlVar.I()) {
            hmlVar.s();
        } else {
            this.a.b(fctx.a);
            kph kphVar = this.b;
            kphVar.c();
            hmlVar.v(-507329165);
            kpg kpgVarB = kphVar.b();
            kow kowVarA = kpgVarB.a();
            kow kowVarB = kpgVarB.b();
            eci eciVarH = ecr.h(10.0f, ibw.k);
            icc iccVar = ibw.n;
            ico icoVar = ics.e;
            ics icsVarF = efy.f(icoVar, 10.0f, 18.0f, 48.0f, 8.0f);
            hmlVar.v(1849434622);
            Object objF = hmlVar.f();
            Object obj3 = hmk.a;
            if (objF == obj3) {
                objF = cwuq.a;
                hmlVar.y(objF);
            }
            hmlVar.o();
            ics icsVarD = kph.d(icsVarF, kowVarA, (fdap) objF);
            ixm ixmVarA = egk.a(eciVarH, iccVar, hmlVar, 54);
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
            int i = (int) j;
            hsk.b(hmlVar, ixmVarA, jbb.e);
            hsk.b(hmlVar, hxiVarN, jbb.d);
            fdat fdatVar = jbb.f;
            if (hmlVar.H() || !fdbq.f(hmlVar.f(), Integer.valueOf(i))) {
                Integer numValueOf = Integer.valueOf(i);
                hmlVar.y(numValueOf);
                hmlVar.h(numValueOf, fdatVar);
            }
            hsk.b(hmlVar, icsVarB, jbb.c);
            hmlVar.v(-1724562617);
            cwui cwuiVar = this.c;
            Integer num = cwuiVar.c;
            if (num != null) {
                num.intValue();
                dtfn.a(jqq.a(R.drawable.gs_android_satellite_vd_theme_24, hmlVar, 0), null, egq.k(icoVar, 18.0f), glz.a(hmlVar).s, hmlVar, 432, 0);
            }
            hmlVar.o();
            cwux.b(cwuiVar, this.e, null, hmlVar, 0);
            hmlVar.n();
            hmlVar.v(1092049377);
            if (cwuiVar.d) {
                fdae fdaeVar2 = this.d;
                hmlVar.v(1849434622);
                Object objF2 = hmlVar.f();
                if (objF2 == obj3) {
                    objF2 = cwur.a;
                    hmlVar.y(objF2);
                }
                hmlVar.o();
                cwux.a(fdaeVar2, kph.d(icoVar, kowVarB, (fdap) objF2), cwue.b, hmlVar, 384);
            }
            hmlVar.o();
            hmlVar.o();
            hmlVar.v(1659148056);
            hmlVar.o();
        }
        return fctx.a;
    }
}
