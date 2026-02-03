package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fjs implements PointerInputEventHandler {
    final /* synthetic */ fic a;
    final /* synthetic */ fbh b;

    public fjs(fic ficVar, fbh fbhVar) {
        this.a = ficVar;
        this.b = fbhVar;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(isn isnVar, fcxy<? super fctx> fcxyVar) {
        Object objB = dvn.b(isnVar, new fjr(this.a, new fhy(isnVar.b()), this.b, null), fcxyVar);
        return objB == fcyl.a ? objB : fctx.a;
    }
}
