package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class djrd implements PointerInputEventHandler {
    final /* synthetic */ djrl a;

    public djrd(djrl djrlVar) {
        this.a = djrlVar;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(isn isnVar, fcxy<? super fctx> fcxyVar) {
        final djrl djrlVar = this.a;
        Object objA = dlqj.a(isnVar, new fdap() { // from class: djrc
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                djrlVar.e().invoke();
                return true;
            }
        }, true, fcxyVar);
        return objA == fcyl.a ? objA : fctx.a;
    }
}
