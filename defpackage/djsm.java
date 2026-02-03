package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class djsm implements PointerInputEventHandler {
    final /* synthetic */ fdae a;

    public djsm(fdae fdaeVar) {
        this.a = fdaeVar;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(isn isnVar, fcxy<? super fctx> fcxyVar) {
        final fdae fdaeVar = this.a;
        Object objA = dlqj.a(isnVar, new fdap() { // from class: djsl
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                fdaeVar.invoke();
                return true;
            }
        }, true, fcxyVar);
        return objA == fcyl.a ? objA : fctx.a;
    }
}
