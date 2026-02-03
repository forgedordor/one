package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ov implements View.OnAttachStateChangeListener {
    final /* synthetic */ ow a;

    public ov(ow owVar) {
        this.a = owVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        ow owVar = this.a;
        ViewTreeObserver viewTreeObserver = owVar.d;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                owVar.d = view.getViewTreeObserver();
            }
            owVar.d.removeGlobalOnLayoutListener(owVar.b);
        }
        view.removeOnAttachStateChangeListener(this);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
