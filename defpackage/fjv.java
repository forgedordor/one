package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fjv implements PointerInputEventHandler {
    final /* synthetic */ fdap a;

    public fjv(fdap fdapVar) {
        this.a = fdapVar;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(isn isnVar, fcxy<? super fctx> fcxyVar) {
        Object objQ = isnVar.q(new fju(this.a, null), fcxyVar);
        return objQ == fcyl.a ? objQ : fctx.a;
    }
}
