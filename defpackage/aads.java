package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aads implements PointerInputEventHandler {
    final /* synthetic */ fdap a;

    public aads(fdap fdapVar) {
        this.a = fdapVar;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(isn isnVar, fcxy<? super fctx> fcxyVar) {
        Object objB = dvn.b(isnVar, new aadr(this.a, null), fcxyVar);
        return objB == fcyl.a ? objB : fctx.a;
    }
}
