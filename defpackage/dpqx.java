package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dpqx implements PointerInputEventHandler {
    final /* synthetic */ dprl a;
    final /* synthetic */ dppy b;
    final /* synthetic */ dplv c;
    final /* synthetic */ hox d;
    final /* synthetic */ hsf e;
    final /* synthetic */ hsf f;

    public dpqx(dprl dprlVar, dppy dppyVar, dplv dplvVar, hox hoxVar, hsf hsfVar, hsf hsfVar2) {
        this.a = dprlVar;
        this.b = dppyVar;
        this.c = dplvVar;
        this.d = hoxVar;
        this.e = hsfVar;
        this.f = hsfVar2;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(isn isnVar, fcxy<? super fctx> fcxyVar) {
        Object objB = dvn.b(isnVar, new dpqw(this.a, this.b, this.c, this.d, this.e, this.f, null), fcxyVar);
        return objB == fcyl.a ? objB : fctx.a;
    }
}
