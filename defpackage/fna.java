package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fna implements PointerInputEventHandler {
    final /* synthetic */ fbh a;

    public fna(fbh fbhVar) {
        this.a = fbhVar;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(isn isnVar, fcxy<? super fctx> fcxyVar) {
        Object objA = faw.a(isnVar, this.a, fcxyVar);
        return objA == fcyl.a ? objA : fctx.a;
    }
}
