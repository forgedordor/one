package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gts implements PointerInputEventHandler {
    final /* synthetic */ gtx a;

    public gts(gtx gtxVar) {
        this.a = gtxVar;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(isn isnVar, fcxy<? super fctx> fcxyVar) {
        final gtx gtxVar = this.a;
        Object objI = dzm.i(isnVar, null, null, new gtr(gtxVar, null), new fdap() { // from class: gtq
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                gtx gtxVar2 = gtxVar;
                gtxVar2.h(0.0f);
                gtxVar2.f.invoke();
                return fctx.a;
            }
        }, fcxyVar, 3);
        return objI == fcyl.a ? objI : fctx.a;
    }
}
