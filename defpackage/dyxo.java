package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dyxo implements View.OnAttachStateChangeListener {
    final /* synthetic */ dyxp a;
    private final dyay b;

    public dyxo(dyxp dyxpVar, View view, int i) {
        this.a = dyxpVar;
        this.b = new dyxn(this, view, i);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        dyau dyauVar = this.a.a;
        dyay dyayVar = this.b;
        dyauVar.c(dyayVar);
        if (dyauVar.e()) {
            dyayVar.b(dyauVar.a());
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.a.a.d(this.b);
    }
}
