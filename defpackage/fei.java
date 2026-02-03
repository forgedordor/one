package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fei implements PointerInputEventHandler {
    final /* synthetic */ fej a;

    public fei(fej fejVar) {
        this.a = fejVar;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(isn isnVar, fcxy<? super fctx> fcxyVar) {
        Object objB = dvn.b(isnVar, new feh(this.a, null), fcxyVar);
        return objB == fcyl.a ? objB : fctx.a;
    }
}
