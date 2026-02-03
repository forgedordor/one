package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dycm implements View.OnAttachStateChangeListener {
    final /* synthetic */ dyco a;

    public dycm(dyco dycoVar) {
        this.a = dycoVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        dyco dycoVar = this.a;
        dydi dydiVar = ((dydm) dycoVar.a).b;
        if (dydiVar.e()) {
            dycoVar.a(dydiVar.a());
        }
        dycoVar.b.removeOnAttachStateChangeListener(this);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }
}
