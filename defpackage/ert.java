package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ert implements PointerInputEventHandler {
    final /* synthetic */ etv a;

    public ert(etv etvVar) {
        this.a = etvVar;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(isn isnVar, fcxy<? super fctx> fcxyVar) {
        Object objA = fdjy.a(new ers(isnVar, this.a, null), fcxyVar);
        return objA == fcyl.a ? objA : fctx.a;
    }
}
