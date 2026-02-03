package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class xxs implements fdaw {
    final /* synthetic */ xxu a;

    public xxs(xxu xxuVar) {
        this.a = xxuVar;
    }

    @Override // defpackage.fdaw
    public final /* synthetic */ Object a(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        dpmc dpmcVar = (dpmc) obj;
        ics icsVar = (ics) obj2;
        xvx xvxVar = (xvx) obj3;
        hml hmlVar = (hml) obj4;
        int iIntValue = ((Number) obj5).intValue();
        dpmcVar.getClass();
        icsVar.getClass();
        xvxVar.getClass();
        xxd xxdVar = (xxd) hro.a(xvxVar.c, hmlVar).a();
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
        xxu xxuVar = this.a;
        hsk.b(hmlVar, icsVarB, jbb.c);
        edf edfVar = edf.a;
        boolean zH = xxu.h(xvxVar);
        int i2 = dpop.a;
        cye.b(zH, null, dpoq.a, dpoq.b, null, hxe.d(-1230023029, new xxr(xxuVar), hmlVar), hmlVar, 196608, 18);
        xxa.c(dpmcVar, edfVar.a(icsVar, ibw.h), xxdVar, hmlVar, (iIntValue & 14) | 512);
        hmlVar.n();
        return fctx.a;
    }
}
