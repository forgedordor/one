package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import java.lang.ref.WeakReference;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eeui implements View.OnAttachStateChangeListener, ViewTreeObserver.OnGlobalLayoutListener {
    public final WeakReference a;
    private final WeakReference b;

    public eeui(BaseTransientBottomBar baseTransientBottomBar, View view) {
        this.b = new WeakReference(baseTransientBottomBar);
        this.a = new WeakReference(view);
    }

    private final boolean b() {
        if (this.b.get() != null) {
            return false;
        }
        a();
        return true;
    }

    public final void a() {
        WeakReference weakReference = this.a;
        if (weakReference.get() != null) {
            ((View) weakReference.get()).removeOnAttachStateChangeListener(this);
            eemo.j((View) weakReference.get(), this);
        }
        weakReference.clear();
        this.b.clear();
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        if (b()) {
            return;
        }
        WeakReference weakReference = this.b;
        BaseTransientBottomBar baseTransientBottomBar = (BaseTransientBottomBar) weakReference.get();
        String str = BaseTransientBottomBar.b;
        if (baseTransientBottomBar.l) {
            ((BaseTransientBottomBar) weakReference.get()).h();
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        if (b()) {
            return;
        }
        eemo.h(view, this);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        if (b()) {
            return;
        }
        eemo.j(view, this);
    }
}
