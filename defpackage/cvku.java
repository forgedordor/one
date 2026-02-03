package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cvku implements View.OnAttachStateChangeListener {
    final /* synthetic */ fcsu a;
    final /* synthetic */ cvkz b;

    public cvku(cvkz cvkzVar, fcsu fcsuVar) {
        this.a = fcsuVar;
        this.b = cvkzVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        ((crqv) this.a.b()).m(this.b.f);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        ((crqv) this.a.b()).o(this.b.f);
    }
}
