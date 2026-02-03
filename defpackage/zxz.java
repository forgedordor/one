package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class zxz implements fdau {
    final /* synthetic */ zxa a;
    final /* synthetic */ gun b;
    final /* synthetic */ hox c;

    public zxz(zxa zxaVar, gun gunVar, hox hoxVar) {
        this.a = zxaVar;
        this.b = gunVar;
        this.c = hoxVar;
    }

    @Override // defpackage.fdau
    public final /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        zyh zyhVar;
        hml hmlVar = (hml) obj2;
        int iIntValue = ((Number) obj3).intValue();
        ((egc) obj).getClass();
        if ((iIntValue & 17) == 16 && hmlVar.I()) {
            hmlVar.s();
        } else {
            ico icoVar = ics.e;
            ics icsVarC = egq.c(icoVar, 1.0f);
            final zxa zxaVar = this.a;
            gun gunVar = this.b;
            hox hoxVar = this.c;
            ixm ixmVarA = ecz.a(ibw.a, false);
            long jB = hmg.b(hmlVar);
            long j = jB ^ (jB >>> 32);
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
            hmlVar.v(-661677719);
            if (!((Boolean) dljt.b(hmlVar).c.invoke()).booleanValue() && (zyhVar = zxaVar.s) != null) {
                zyhVar.a(hmlVar, 0);
            }
            hmlVar.o();
            hmlVar.v(963062390);
            zya.e(edfVar, zxaVar, hmlVar, 6);
            hmlVar.o();
            eain eainVar = eain.a;
            hmlVar.v(-415220705);
            ihu ihuVar = new ihu(Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);
            hmlVar.v(1849434622);
            Object objF = hmlVar.f();
            Object obj4 = hmk.a;
            if (objF == obj4) {
                objF = new eais(eainVar, ihuVar, eaio.a);
                hmlVar.y(objF);
            }
            eais eaisVar = (eais) objF;
            hmlVar.o();
            hmlVar.o();
            yen yenVar = zxaVar.b;
            ics icsVarB2 = ehm.b(edfVar.b(icoVar), new efr(ehv.f(hmlVar), 16));
            hmlVar.v(5004770);
            boolean zD = hmlVar.D(zxaVar);
            Object objF2 = hmlVar.f();
            if (zD || objF2 == obj4) {
                objF2 = new fdap() { // from class: zxw
                    @Override // defpackage.fdap
                    public final Object invoke(Object obj5) {
                        aadp aadpVar = (aadp) obj5;
                        aadpVar.getClass();
                        zxaVar.k.invoke(aadpVar);
                        return fctx.a;
                    }
                };
                hmlVar.y(objF2);
            }
            fdap fdapVar = (fdap) objF2;
            hmlVar.o();
            icsVarB2.getClass();
            fdapVar.getClass();
            ygj.e(yenVar, zya.a(hoxVar), itf.a(icsVarB2, fctx.a, new aads(fdapVar)), eaisVar, hmlVar, 0);
            zya.h(zxaVar, hxe.d(-1637165938, new zxx(zxaVar, edfVar, eaisVar), hmlVar), hmlVar, 48);
            xup xupVar = zxaVar.g;
            fdpl fdplVar = xupVar != null ? xupVar.a : null;
            hmlVar.v(-661638501);
            hsf hsfVarB = fdplVar == null ? null : hsb.b(fdplVar, false, null, hmlVar, 2);
            hmlVar.o();
            if (hsfVarB == null) {
                hsfVarB = new hpl(false, hsi.a);
            }
            hmlVar.v(-661635868);
            if (((Boolean) hsfVarB.a()).booleanValue()) {
                hmlVar.v(-661634085);
                float fEl = ((kio) hmlVar.e(jmh.e)).el(((Number) hsb.b(zxaVar.f, 0, null, hmlVar, 2).a()).intValue());
                hmlVar.o();
                zya.j(ien.a(efs.b(edfVar.a(icoVar, ibw.c), -8.0f, fEl + 8.0f), 0.25f), hmlVar, 0);
            }
            hmlVar.o();
            hmlVar.v(964571222);
            zya.f(edfVar, zxaVar, hmlVar, 6);
            hmlVar.o();
            zya.d(zxaVar, gunVar, hmlVar, 48);
            zya.h(zxaVar, hxe.d(-1481577723, new zxy(zxaVar), hmlVar), hmlVar, 48);
            hmlVar.n();
        }
        return fctx.a;
    }
}
