package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ns implements View.OnAttachStateChangeListener {
    final /* synthetic */ nw a;

    public ns(nw nwVar) {
        this.a = nwVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        nw nwVar = this.a;
        ViewTreeObserver viewTreeObserver = nwVar.e;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                nwVar.e = view.getViewTreeObserver();
            }
            nwVar.e.removeGlobalOnLayoutListener(nwVar.c);
        }
        view.removeOnAttachStateChangeListener(this);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
