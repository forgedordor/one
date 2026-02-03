package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ds implements lvh {
    final /* synthetic */ ea a;

    public ds(ea eaVar) {
        this.a = eaVar;
    }

    @Override // defpackage.lvh
    public final void gL(lvj lvjVar, lva lvaVar) {
        View view;
        if (lvaVar != lva.ON_STOP || (view = this.a.Q) == null) {
            return;
        }
        view.cancelPendingInputEvents();
    }
}
