package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;

/* compiled from: PG */
/* loaded from: classes.dex */
final class hho implements PointerInputEventHandler {
    final /* synthetic */ hcj a;

    public hho(hcj hcjVar) {
        this.a = hcjVar;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(isn isnVar, fcxy<? super fctx> fcxyVar) {
        Object objA = fdjy.a(new hhn(isnVar, this.a, null), fcxyVar);
        return objA == fcyl.a ? objA : fctx.a;
    }
}
