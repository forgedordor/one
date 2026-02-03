package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dtkv implements View.OnAttachStateChangeListener {
    final /* synthetic */ dtli a;

    public dtkv(dtli dtliVar) {
        this.a = dtliVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.a.d(1);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
