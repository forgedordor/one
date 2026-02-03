package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jpj implements View.OnAttachStateChangeListener {
    final /* synthetic */ View a;
    final /* synthetic */ hqq b;

    public jpj(View view, hqq hqqVar) {
        this.a = view;
        this.b = hqqVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.a.removeOnAttachStateChangeListener(this);
        this.b.w();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
