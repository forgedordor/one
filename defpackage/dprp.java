package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dprp implements fdau {
    final /* synthetic */ dplv a;
    final /* synthetic */ dpsb b;
    final /* synthetic */ dplv c;
    final /* synthetic */ dprl d;
    final /* synthetic */ fdap e;

    public dprp(dplv dplvVar, dpsb dpsbVar, dplv dplvVar2, dprl dprlVar, fdap fdapVar) {
        this.a = dplvVar;
        this.b = dpsbVar;
        this.c = dplvVar2;
        this.d = dprlVar;
        this.e = fdapVar;
    }

    @Override // defpackage.fdau
    public final /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        final fdap fdapVar;
        Object obj4;
        edk edkVar = (edk) obj;
        hml hmlVar = (hml) obj2;
        int iIntValue = ((Number) obj3).intValue();
        edkVar.getClass();
        if ((iIntValue & 6) == 0) {
            iIntValue |= true != hmlVar.D(edkVar) ? 2 : 4;
        }
        if ((iIntValue & 19) == 18 && hmlVar.I()) {
            hmlVar.s();
        } else {
            dplv dplvVar = this.a;
            dpsb dpsbVar = this.b;
            ico icoVar = ics.e;
            ics icsVarA = dpqr.a(icoVar, edkVar, dpsbVar, hmlVar);
            dplv dplvVar2 = this.c;
            dprl dprlVar = this.d;
            fdap fdapVar2 = this.e;
            int i = dprg.a;
            icsVarA.getClass();
            hmlVar.v(-1695364984);
            hmlVar.v(1849434622);
            Object objF = hmlVar.f();
            Object obj5 = hmk.a;
            if (objF == obj5) {
                objF = dprb.a;
                hmlVar.y(objF);
            }
            hmlVar.o();
            hsf hsfVar = dprlVar.d;
            final hox hoxVar = dprlVar.f;
            hsf hsfVar2 = dprlVar.e;
            long j = ((kjb) ((fdap) objF).invoke(new kjg(dprg.d(hoxVar)))).a;
            hox hoxVar2 = dprlVar.g;
            hox hoxVar3 = dprlVar.h;
            float f = ((kir) fddu.n(new kir(((kir) ddu.b((dplvVar2.b() || !dprlVar.c() || ((Boolean) hoxVar2.a()).booleanValue()) ? 0.0f : 20.0f, new dtgd().b(), hmlVar, 0, 12).a()).a), new kir(0.0f))).a;
            Object objF2 = hmlVar.f();
            if (objF2 == obj5) {
                objF2 = hob.a(fcyi.a, hmlVar);
                hmlVar.y(objF2);
            }
            fdjx fdjxVar = (fdjx) objF2;
            hmlVar.v(-1453088833);
            ics icsVarC = ijn.c(dplvVar2.f(icsVarA, false), dprg.b(hsfVar), dprg.b(hsfVar), 0.0f, Float.intBitsToFloat((int) (dprg.e(hsfVar2) >> 32)) + kjb.a(j), Float.intBitsToFloat((int) (dprg.e(hsfVar2) & 4294967295L)) + kjb.b(j), 0.0f, 0L, evn.b(f), true, 0, 518116);
            if (dpsbVar.b) {
                fctx fctxVar = fctx.a;
                hmlVar.v(-1224400529);
                boolean zF = hmlVar.F(dprlVar) | hmlVar.F(dpsbVar) | hmlVar.F(dplvVar2) | hmlVar.F(fdjxVar) | hmlVar.D(hsfVar) | hmlVar.D(hoxVar3) | hmlVar.D(hoxVar) | hmlVar.F(dplvVar2);
                Object objF3 = hmlVar.f();
                if (zF || objF3 == obj5) {
                    fdapVar = fdapVar2;
                    obj4 = obj5;
                    dprf dprfVar = new dprf(dprlVar, dpsbVar, dplvVar2, fdjxVar, hsfVar, hoxVar3, hoxVar, dplvVar2);
                    hmlVar.y(dprfVar);
                    objF3 = dprfVar;
                } else {
                    fdapVar = fdapVar2;
                    obj4 = obj5;
                }
                hmlVar.o();
                icsVarC = icsVarC.a(itf.a(icoVar, fctxVar, (PointerInputEventHandler) objF3));
            } else {
                fdapVar = fdapVar2;
                obj4 = obj5;
            }
            hmlVar.o();
            hmlVar.v(-1633490746);
            boolean zD = hmlVar.D(hoxVar) | hmlVar.D(fdapVar);
            Object objF4 = hmlVar.f();
            if (zD || objF4 == obj4) {
                objF4 = new fdap() { // from class: dpqu
                    @Override // defpackage.fdap
                    public final Object invoke(Object obj6) {
                        kjg kjgVar = (kjg) obj6;
                        long j2 = kjgVar.a;
                        int i2 = dprg.a;
                        hoxVar.b(new kjg(j2));
                        fdapVar.invoke(kjgVar);
                        return fctx.a;
                    }
                };
                hmlVar.y(objF4);
            }
            hmlVar.o();
            ics icsVarA2 = iye.a(icsVarC, (fdap) objF4);
            hmlVar.o();
            dprw.a(dplvVar, icsVarA2, dpsbVar, iuz.b, null, hmlVar, 3072, 8);
            fdae fdaeVar = dpsbVar.c;
            if (fdaeVar != null) {
                dpqh.a(djrr.aG, jqu.b(R.string.delete_button_content_description, hmlVar), fdaeVar, edkVar.a(icoVar, ibw.g), hmlVar, 6, 0);
            }
        }
        return fctx.a;
    }
}
