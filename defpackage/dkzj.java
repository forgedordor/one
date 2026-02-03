package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dkzj implements PointerInputEventHandler {
    final /* synthetic */ fdae a;

    public dkzj(fdae fdaeVar) {
        this.a = fdaeVar;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(isn isnVar, fcxy<? super fctx> fcxyVar) {
        final fdae fdaeVar = this.a;
        Object objI = dzm.i(isnVar, null, null, null, new fdap() { // from class: dkzi
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                fdaeVar.invoke();
                return fctx.a;
            }
        }, fcxyVar, 7);
        return objI == fcyl.a ? objI : fctx.a;
    }
}
