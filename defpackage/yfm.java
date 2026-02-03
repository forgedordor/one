package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class yfm implements PointerInputEventHandler {
    final /* synthetic */ yen a;

    public yfm(yen yenVar) {
        this.a = yenVar;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(isn isnVar, fcxy<? super fctx> fcxyVar) {
        final yen yenVar = this.a;
        Object objI = dzm.i(isnVar, null, null, null, new fdap() { // from class: yfl
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                yenVar.u.invoke();
                return fctx.a;
            }
        }, fcxyVar, 7);
        return objI == fcyl.a ? objI : fctx.a;
    }
}
