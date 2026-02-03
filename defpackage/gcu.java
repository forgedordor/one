package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gcu implements PointerInputEventHandler {
    final /* synthetic */ gcw a;

    public gcu(gcw gcwVar) {
        this.a = gcwVar;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(isn isnVar, fcxy<? super fctx> fcxyVar) {
        final gcw gcwVar = this.a;
        Object objI = dzm.i(isnVar, null, null, new gcs(gcwVar, null), new fdap() { // from class: gcr
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                gcw gcwVar2 = gcwVar;
                fdil.d(gcwVar2.E(), null, null, new gct(gcwVar2, (ihs) obj, null), 3);
                return fctx.a;
            }
        }, fcxyVar, 3);
        return objI == fcyl.a ? objI : fctx.a;
    }
}
