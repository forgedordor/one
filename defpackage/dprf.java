package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dprf implements PointerInputEventHandler {
    final /* synthetic */ dprl a;
    final /* synthetic */ dppy b;
    final /* synthetic */ dplv c;
    final /* synthetic */ fdjx d;
    final /* synthetic */ hsf e;
    final /* synthetic */ hox f;
    final /* synthetic */ hox g;
    final /* synthetic */ dplv h;

    public dprf(dprl dprlVar, dppy dppyVar, dplv dplvVar, fdjx fdjxVar, hsf hsfVar, hox hoxVar, hox hoxVar2, dplv dplvVar2) {
        this.a = dprlVar;
        this.b = dppyVar;
        this.c = dplvVar;
        this.d = fdjxVar;
        this.e = hsfVar;
        this.f = hoxVar;
        this.g = hoxVar2;
        this.h = dplvVar2;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(isn isnVar, fcxy<? super fctx> fcxyVar) {
        final dprl dprlVar = this.a;
        final dppy dppyVar = this.b;
        final dplv dplvVar = this.c;
        final fdjx fdjxVar = this.d;
        final hsf hsfVar = this.e;
        final hox hoxVar = this.f;
        final hox hoxVar2 = this.g;
        fdap fdapVar = new fdap() { // from class: dprc
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                dprl dprlVar2 = dprlVar;
                ihs ihsVar = (ihs) obj;
                dprg.f(dprlVar2, "Double tap detected");
                if (((dpsb) dppyVar).d) {
                    dplvVar.g();
                }
                hox hoxVar3 = hoxVar2;
                hox hoxVar4 = hoxVar;
                fdil.d(fdjxVar, null, null, new dpre(dprlVar2, ihsVar, hsfVar, hoxVar4, hoxVar3, null), 3);
                return fctx.a;
            }
        };
        final dplv dplvVar2 = this.h;
        Object objI = dzm.i(isnVar, fdapVar, null, null, new fdap() { // from class: dprd
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                dprl dprlVar2 = dprlVar;
                dprg.f(dprlVar2, "Single tap detected");
                if (((dpsb) dppyVar).d) {
                    dplvVar2.h();
                }
                dprg.f(dprlVar2, "Finished handling single tap");
                return fctx.a;
            }
        }, fcxyVar, 6);
        return objI == fcyl.a ? objI : fctx.a;
    }
}
