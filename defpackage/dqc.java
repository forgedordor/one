package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dqc implements PointerInputEventHandler {
    final /* synthetic */ fdap a;

    public dqc(fdap fdapVar) {
        this.a = fdapVar;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(isn isnVar, fcxy<? super fctx> fcxyVar) {
        Object objB = dvn.b(isnVar, new fee(this.a, null), fcxyVar);
        fcyl fcylVar = fcyl.a;
        if (objB != fcylVar) {
            objB = fctx.a;
        }
        return objB == fcylVar ? objB : fctx.a;
    }
}
