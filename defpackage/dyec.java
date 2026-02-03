package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dyec implements View.OnAttachStateChangeListener {
    final /* synthetic */ dyay a;
    final /* synthetic */ dyed b;

    public dyec(dyed dyedVar, dyay dyayVar) {
        this.a = dyayVar;
        this.b = dyedVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        dydi dydiVar = this.b.b;
        dyay dyayVar = this.a;
        dydiVar.c(dyayVar);
        if (dydiVar.e()) {
            dyayVar.a();
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.b.b.d(this.a);
    }
}
