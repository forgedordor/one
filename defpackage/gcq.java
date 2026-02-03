package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gcq implements PointerInputEventHandler {
    final /* synthetic */ gcw a;

    public gcq(gcw gcwVar) {
        this.a = gcwVar;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(isn isnVar, fcxy<? super fctx> fcxyVar) {
        final gcw gcwVar = this.a;
        Object objH = duh.h(isnVar, new fdap() { // from class: dtn
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                return fctx.a;
            }
        }, new fdae() { // from class: gcm
            @Override // defpackage.fdae
            public final Object invoke() {
                gcw gcwVar2 = gcwVar;
                fdil.d(gcwVar2.E(), null, null, new gco(gcwVar2, null), 3);
                return fctx.a;
            }
        }, new fdae() { // from class: dtj
            @Override // defpackage.fdae
            public final Object invoke() {
                return fctx.a;
            }
        }, new fdat() { // from class: gcn
            @Override // defpackage.fdat
            public final Object a(Object obj, Object obj2) {
                gcw gcwVar2 = gcwVar;
                fdil.d(gcwVar2.E(), null, null, new gcp(gcwVar2, (ihs) obj2, null), 3);
                return fctx.a;
            }
        }, fcxyVar);
        return objH == fcyl.a ? objH : fctx.a;
    }
}
