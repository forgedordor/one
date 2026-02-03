package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dpra implements PointerInputEventHandler {
    final /* synthetic */ dppy a;
    final /* synthetic */ dprl b;
    final /* synthetic */ fdjx c;
    final /* synthetic */ dplv d;
    final /* synthetic */ hsf e;
    final /* synthetic */ hox f;

    public dpra(dppy dppyVar, dprl dprlVar, fdjx fdjxVar, dplv dplvVar, hsf hsfVar, hox hoxVar) {
        this.a = dppyVar;
        this.b = dprlVar;
        this.c = fdjxVar;
        this.d = dplvVar;
        this.e = hsfVar;
        this.f = hoxVar;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(isn isnVar, fcxy<? super fctx> fcxyVar) {
        Object objB;
        dppy dppyVar = this.a;
        return (((dpsb) dppyVar).b && (objB = dvn.b(isnVar, new dpqz(this.b, this.c, dppyVar, this.d, this.e, this.f, null), fcxyVar)) == fcyl.a) ? objB : fctx.a;
    }
}
