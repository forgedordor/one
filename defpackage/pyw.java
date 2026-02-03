package defpackage;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.view.WindowManager;
import android.view.WindowMetrics;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class pyw implements pyv {
    public static final pyw a = new pyw();

    private pyw() {
    }

    @Override // defpackage.pyv
    public final pxd a(Activity activity, pyq pyqVar) {
        return new pxd(new prj(pyj.a.a().a(activity)), pyqVar.a(activity));
    }

    @Override // defpackage.pyv
    public final pxd b(Context context, pyq pyqVar) {
        WindowManager windowManager = (WindowManager) context.getSystemService(WindowManager.class);
        float f = context.getResources().getDisplayMetrics().density;
        Rect bounds = windowManager.getCurrentWindowMetrics().getBounds();
        bounds.getClass();
        return new pxd(bounds, f);
    }

    @Override // defpackage.pyv
    public final pxd c(WindowMetrics windowMetrics, float f) {
        Rect bounds = windowMetrics.getBounds();
        bounds.getClass();
        return new pxd(bounds, f);
    }
}
