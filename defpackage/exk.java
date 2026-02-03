package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;

/* compiled from: PG */
/* loaded from: classes.dex */
final class exk implements PointerInputEventHandler {
    final /* synthetic */ hox a;
    final /* synthetic */ fdap b;

    public exk(hox hoxVar, fdap fdapVar) {
        this.a = hoxVar;
        this.b = fdapVar;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(isn isnVar, fcxy<? super fctx> fcxyVar) {
        final hox hoxVar = this.a;
        final fdap fdapVar = this.b;
        Object objI = dzm.i(isnVar, null, null, null, new fdap() { // from class: exj
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                ihs ihsVar = (ihs) obj;
                jyi jyiVar = (jyi) hoxVar.a();
                if (jyiVar != null) {
                    fdapVar.invoke(Integer.valueOf(jyiVar.k(ihsVar.a)));
                }
                return fctx.a;
            }
        }, fcxyVar, 7);
        return objI == fcyl.a ? objI : fctx.a;
    }
}
