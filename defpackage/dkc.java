package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dkc implements PointerInputEventHandler {
    final /* synthetic */ dkd a;

    public dkc(dkd dkdVar) {
        this.a = dkdVar;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(isn isnVar, fcxy<? super fctx> fcxyVar) {
        Object objB = this.a.b(isnVar, fcxyVar);
        return objB == fcyl.a ? objB : fctx.a;
    }
}
