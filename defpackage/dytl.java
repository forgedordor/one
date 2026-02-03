package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dytl implements View.OnAttachStateChangeListener {
    final /* synthetic */ dytu a;

    public dytl(dytu dytuVar) {
        this.a = dytuVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        dytu dytuVar = this.a;
        dytuVar.u(37);
        dytuVar.removeOnAttachStateChangeListener(this);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }
}
