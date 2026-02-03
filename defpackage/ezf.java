package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ezf implements PointerInputEventHandler {
    final /* synthetic */ fbh a;
    final /* synthetic */ fmx b;

    public ezf(fbh fbhVar, fmx fmxVar) {
        this.a = fbhVar;
        this.b = fmxVar;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(isn isnVar, fcxy<? super fctx> fcxyVar) {
        Object objA = fdjy.a(new eze(isnVar, this.a, this.b, null), fcxyVar);
        return objA == fcyl.a ? objA : fctx.a;
    }
}
