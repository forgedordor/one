package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fcj implements PointerInputEventHandler {
    final /* synthetic */ fdjx a;
    final /* synthetic */ hox b;
    final /* synthetic */ hsf c;
    final /* synthetic */ ebk d;

    public fcj(fdjx fdjxVar, hox hoxVar, ebk ebkVar, hsf hsfVar) {
        this.a = fdjxVar;
        this.b = hoxVar;
        this.d = ebkVar;
        this.c = hsfVar;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(isn isnVar, fcxy<? super fctx> fcxyVar) {
        fci fciVar = new fci(this.a, this.b, this.d, null);
        final hsf hsfVar = this.c;
        Object objC = dzm.c(isnVar, fciVar, new fdap() { // from class: fcf
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                ((fdap) hsfVar.a()).invoke((ihs) obj);
                return fctx.a;
            }
        }, fcxyVar);
        return objC == fcyl.a ? objC : fctx.a;
    }
}
