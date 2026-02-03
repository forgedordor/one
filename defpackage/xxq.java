package defpackage;

import j$.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class xxq implements fdaw {
    final /* synthetic */ xxu a;

    public xxq(xxu xxuVar) {
        this.a = xxuVar;
    }

    @Override // defpackage.fdaw
    public final /* synthetic */ Object a(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        dpme dpmeVar = (dpme) obj;
        ics icsVar = (ics) obj2;
        xvx xvxVar = (xvx) obj3;
        hml hmlVar = (hml) obj4;
        int iIntValue = ((Number) obj5).intValue();
        dpmeVar.getClass();
        icsVar.getClass();
        xvxVar.getClass();
        xwn xwnVar = (xwn) Map.EL.getOrDefault(xvxVar.b, (String) hro.a(xvxVar.a, hmlVar).a(), null);
        fdpl fdplVar = xwnVar != null ? xwnVar.a : null;
        hmlVar.v(84903864);
        hsf hsfVarB = fdplVar == null ? null : hsb.b(fdplVar, null, null, hmlVar, 2);
        hmlVar.o();
        xyz xyzVar = hsfVarB != null ? (xyz) hsfVarB.a() : null;
        xxu xxuVar = this.a;
        ico icoVar = ics.e;
        ixm ixmVarA = ecz.a(ibw.a, false);
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
        fdat fdatVar = jbb.f;
        if (hmlVar.H() || !fdbq.f(hmlVar.f(), Integer.valueOf(i))) {
            Integer numValueOf = Integer.valueOf(i);
            hmlVar.y(numValueOf);
            hmlVar.h(numValueOf, fdatVar);
        }
        hsk.b(hmlVar, icsVarB, jbb.c);
        edf edfVar = edf.a;
        boolean zH = xxu.h(xvxVar);
        int i2 = dpop.a;
        cye.b(zH, null, dpoq.a, dpoq.b, null, hxe.d(1806985724, new xxp(xxuVar), hmlVar), hmlVar, 196608, 18);
        xyj.a(dpmeVar, edfVar.a(icsVar, ibw.b), xyzVar, hmlVar, iIntValue & 14);
        hmlVar.n();
        return fctx.a;
    }
}
