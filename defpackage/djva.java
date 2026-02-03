package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class djva implements PointerInputEventHandler {
    final /* synthetic */ djvm a;

    public djva(djvm djvmVar) {
        this.a = djvmVar;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(isn isnVar, fcxy<? super fctx> fcxyVar) {
        final djvm djvmVar = this.a;
        Object objA = dlqj.a(isnVar, new fdap() { // from class: djuz
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                Boolean bool = (Boolean) djvmVar.a().invoke();
                bool.booleanValue();
                return bool;
            }
        }, false, fcxyVar);
        return objA == fcyl.a ? objA : fctx.a;
    }
}
