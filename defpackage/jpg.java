package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jpg implements View.OnAttachStateChangeListener {
    final /* synthetic */ fdlr a;

    public jpg(fdlr fdlrVar) {
        this.a = fdlrVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        view.removeOnAttachStateChangeListener(this);
        this.a.t(null);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
