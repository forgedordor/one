package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dpii implements Runnable {
    final /* synthetic */ dpil a;

    public dpii(dpil dpilVar) {
        this.a = dpilVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        View view;
        dpil dpilVar = this.a;
        if (!dpilVar.aF() || (view = dpilVar.Q) == null) {
            return;
        }
        view.requestLayout();
    }
}
