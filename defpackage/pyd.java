package defpackage;

import android.app.Activity;
import android.os.IBinder;
import android.view.View;
import androidx.window.layout.adapter.sidecar.SidecarCompat;
import java.lang.ref.WeakReference;

/* compiled from: PG */
/* loaded from: classes.dex */
final class pyd implements View.OnAttachStateChangeListener {
    private final SidecarCompat a;
    private final WeakReference b;

    public pyd(SidecarCompat sidecarCompat, Activity activity) {
        this.a = sidecarCompat;
        this.b = new WeakReference(activity);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        view.getClass();
        view.removeOnAttachStateChangeListener(this);
        Activity activity = (Activity) this.b.get();
        IBinder iBinderA = pyb.a(activity);
        if (activity == null || iBinderA == null) {
            return;
        }
        this.a.b(iBinderA, activity);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        view.getClass();
    }
}
