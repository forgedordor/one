package defpackage;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.view.WindowManager;
import android.view.WindowMetrics;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class pyx implements pyv {
    public static final pyx a = new pyx();

    private pyx() {
    }

    @Override // defpackage.pyv
    public final pxd a(Activity activity, pyq pyqVar) {
        return pyw.a.a(activity, pyqVar);
    }

    @Override // defpackage.pyv
    public final pxd b(Context context, pyq pyqVar) {
        WindowManager windowManager = context.isUiContext() ? (WindowManager) context.getSystemService(WindowManager.class) : (WindowManager) context.getApplicationContext().getSystemService(WindowManager.class);
        Rect bounds = windowManager.getCurrentWindowMetrics().getBounds();
        bounds.getClass();
        return new pxd(bounds, windowManager.getCurrentWindowMetrics().getDensity());
    }

    @Override // defpackage.pyv
    public final pxd c(WindowMetrics windowMetrics, float f) {
        Rect bounds = windowMetrics.getBounds();
        bounds.getClass();
        return new pxd(bounds, windowMetrics.getDensity());
    }
}
