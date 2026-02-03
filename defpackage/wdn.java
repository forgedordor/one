package defpackage;

import android.view.View;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class wdn implements PointerInputEventHandler {
    final /* synthetic */ dpir a;
    final /* synthetic */ View b;

    public wdn(dpir dpirVar, View view) {
        this.a = dpirVar;
        this.b = view;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(isn isnVar, fcxy<? super fctx> fcxyVar) {
        Object objQ = isnVar.q(new wdm(this.a, this.b, null), fcxyVar);
        return objQ == fcyl.a ? objQ : fctx.a;
    }
}
