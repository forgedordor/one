package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;

/* compiled from: PG */
/* loaded from: classes.dex */
final class hhk implements PointerInputEventHandler {
    final /* synthetic */ hcj a;

    public hhk(hcj hcjVar) {
        this.a = hcjVar;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(isn isnVar, fcxy<? super fctx> fcxyVar) {
        Object objA = fdjy.a(new hhj(isnVar, this.a, null), fcxyVar);
        return objA == fcyl.a ? objA : fctx.a;
    }
}
