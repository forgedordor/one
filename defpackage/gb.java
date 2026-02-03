package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gb implements View.OnAttachStateChangeListener {
    final /* synthetic */ View a;

    public gb(View view) {
        this.a = view;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        View view2 = this.a;
        view2.removeOnAttachStateChangeListener(this);
        int[] iArr = ley.a;
        lel.c(view2);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }
}
