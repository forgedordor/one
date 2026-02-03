package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class yal implements PointerInputEventHandler {
    final /* synthetic */ ybf a;

    public yal(ybf ybfVar) {
        this.a = ybfVar;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(isn isnVar, fcxy<? super fctx> fcxyVar) {
        final ybf ybfVar = this.a;
        Object objI = dzm.i(isnVar, null, null, null, new fdap() { // from class: yak
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                ybfVar.d.invoke();
                return fctx.a;
            }
        }, fcxyVar, 7);
        return objI == fcyl.a ? objI : fctx.a;
    }
}
