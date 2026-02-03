package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cwgn implements fdav {
    final /* synthetic */ etv a;
    final /* synthetic */ List b;
    final /* synthetic */ kio c;
    final /* synthetic */ hox d;
    final /* synthetic */ boolean e;
    final /* synthetic */ cwhd f;

    public cwgn(etv etvVar, List list, kio kioVar, hox hoxVar, boolean z, cwhd cwhdVar) {
        this.a = etvVar;
        this.b = list;
        this.c = kioVar;
        this.d = hoxVar;
        this.e = z;
        this.f = cwhdVar;
    }

    public static final float b(hox hoxVar) {
        return ((Number) hoxVar.a()).floatValue();
    }

    public static final long c(hox hoxVar) {
        return ((ihs) hoxVar.a()).a;
    }

    @Override // defpackage.fdav
    public final /* synthetic */ Object a(Object obj, Object obj2, Object obj3, Object obj4) {
        final int iIntValue = ((Number) obj2).intValue();
        hml hmlVar = (hml) obj3;
        int iIntValue2 = ((Number) obj4).intValue();
        ((ete) obj).getClass();
        Object objF = hmlVar.f();
        Object obj5 = hmk.a;
        if (objF == obj5) {
            objF = hob.a(fcyi.a, hmlVar);
            hmlVar.y(objF);
        }
        final fdjx fdjxVar = (fdjx) objF;
        hmlVar.v(-1224400529);
        boolean zF = hmlVar.F(fdjxVar);
        final etv etvVar = this.a;
        boolean zD = ((((iIntValue2 & 112) ^ 48) > 32 && hmlVar.B(iIntValue)) || (iIntValue2 & 48) == 32) | zF | hmlVar.D(etvVar);
        final List list = this.b;
        boolean zF2 = zD | hmlVar.F(list);
        Object objF2 = hmlVar.f();
        if (zF2 || objF2 == obj5) {
            objF2 = new fdae() { // from class: cwgg
                @Override // defpackage.fdae
                public final Object invoke() {
                    auvw.k(fdjxVar, null, null, new cwgm(etvVar, iIntValue, list, null), 3);
                    return fctx.a;
                }
            };
            hmlVar.y(objF2);
        }
        final fdae fdaeVar = (fdae) objF2;
        hmlVar.o();
        ics icsVarA = ics.e;
        ics icsVarX = egq.x(egq.u(egq.d(icsVarA, 1.0f), 0.0f, 400.0f, 1), 0.0f, 400.0f, 1);
        hmlVar.v(-1633490746);
        final kio kioVar = this.c;
        boolean zD2 = hmlVar.D(kioVar);
        final hox hoxVar = this.d;
        Object objF3 = hmlVar.f();
        if (zD2 || objF3 == obj5) {
            objF3 = new fdap() { // from class: cwgh
                @Override // defpackage.fdap
                public final Object invoke(Object obj6) {
                    hoxVar.b(new kir(fdcu.b(((int) (((kjg) obj6).a >> 32)) / kioVar.ed())));
                    return fctx.a;
                }
            };
            hmlVar.y(objF3);
        }
        hmlVar.o();
        ics icsVarA2 = iye.a(icsVarX, (fdap) objF3);
        boolean z = this.e;
        cwhd cwhdVar = this.f;
        ixm ixmVarA = ecz.a(ibw.e, false);
        long jB = hmg.b(hmlVar);
        long j = jB ^ (jB >>> 32);
        hxi hxiVarN = hmlVar.N();
        ics icsVarB = icj.b(hmlVar, icsVarA2);
        fdae fdaeVar2 = jbb.a;
        hmlVar.M();
        hmlVar.x();
        if (hmlVar.H()) {
            hmlVar.j(fdaeVar2);
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
        hmlVar.v(1849434622);
        Object objF4 = hmlVar.f();
        if (objF4 == obj5) {
            hpl hplVar = new hpl(Float.valueOf(1.0f), hsi.a);
            hmlVar.y(hplVar);
            objF4 = hplVar;
        }
        final hox hoxVar2 = (hox) objF4;
        hmlVar.o();
        hmlVar.v(1849434622);
        Object objF5 = hmlVar.f();
        if (objF5 == obj5) {
            hpl hplVar2 = new hpl(new ihs(0L), hsi.a);
            hmlVar.y(hplVar2);
            objF5 = hplVar2;
        }
        final hox hoxVar3 = (hox) objF5;
        hmlVar.o();
        if (!z) {
            iIntValue = (iIntValue + 1) % list.size();
        }
        dkri dkriVar = ((cwhd) list.get(iIntValue)).a;
        hmlVar.v(748926123);
        if (list.size() < 2) {
            fctx fctxVar = fctx.a;
            hmlVar.v(-1633490746);
            Object objF6 = hmlVar.f();
            if (objF6 == obj5) {
                objF6 = new cwgl(hoxVar2, hoxVar3);
                hmlVar.y(objF6);
            }
            hmlVar.o();
            ics icsVarA3 = itf.a(icsVarA, fctxVar, (PointerInputEventHandler) objF6);
            hmlVar.v(-1633490746);
            Object objF7 = hmlVar.f();
            if (objF7 == obj5) {
                objF7 = new fdap() { // from class: cwgi
                    @Override // defpackage.fdap
                    public final Object invoke(Object obj6) {
                        ikl iklVar = (ikl) obj6;
                        iklVar.getClass();
                        hox hoxVar4 = hoxVar2;
                        iklVar.x(cwgn.b(hoxVar4));
                        iklVar.y(cwgn.b(hoxVar4));
                        hox hoxVar5 = hoxVar3;
                        iklVar.D(Float.intBitsToFloat((int) (cwgn.c(hoxVar5) >> 32)));
                        iklVar.E(Float.intBitsToFloat((int) (cwgn.c(hoxVar5) & 4294967295L)));
                        return fctx.a;
                    }
                };
                hmlVar.y(objF7);
            }
            hmlVar.o();
            icsVarA = ijn.a(icsVarA3, (fdap) objF7);
        }
        hmlVar.o();
        hmlVar.v(5004770);
        boolean zD3 = hmlVar.D(fdaeVar);
        Object objF8 = hmlVar.f();
        if (zD3 || objF8 == obj5) {
            objF8 = new fdae() { // from class: cwgj
                @Override // defpackage.fdae
                public final Object invoke() {
                    fdaeVar.invoke();
                    return fctx.a;
                }
            };
            hmlVar.y(objF8);
        }
        hmlVar.o();
        dkqr.h(dkriVar, dihi.a(joj.a(dli.e(icsVarA, false, null, (fdae) objF8, 15), "monogram"), cwhdVar.c, true), hmlVar, 0);
        hmlVar.n();
        return fctx.a;
    }
}
