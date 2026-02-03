package defpackage;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Point;
import android.graphics.Rect;
import android.inputmethodservice.InputMethodService;
import android.view.Display;
import android.view.WindowManager;
import android.view.WindowMetrics;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class pyy implements pyv {
    public static final pyy a = new pyy();

    private pyy() {
    }

    @Override // defpackage.pyv
    public final pxd a(Activity activity, pyq pyqVar) {
        activity.getClass();
        return new pxd(new prj(pyj.a.a().a(activity)), pyqVar.a(activity));
    }

    @Override // defpackage.pyv
    public final pxd b(Context context, pyq pyqVar) {
        Context baseContext = context;
        while (true) {
            if (!(baseContext instanceof ContextWrapper)) {
                baseContext = context;
                break;
            }
            if (!(baseContext instanceof Activity) && !(baseContext instanceof InputMethodService)) {
                ContextWrapper contextWrapper = (ContextWrapper) baseContext;
                if (contextWrapper.getBaseContext() == null) {
                    break;
                }
                baseContext = contextWrapper.getBaseContext();
                baseContext.getClass();
            } else {
                break;
            }
        }
        if (baseContext instanceof Activity) {
            return a((Activity) baseContext, pyqVar);
        }
        if (!(baseContext instanceof InputMethodService) && !(baseContext instanceof Application)) {
            throw new IllegalArgumentException("Must provide a UiContext or Application Context");
        }
        Object systemService = context.getSystemService("window");
        systemService.getClass();
        Display defaultDisplay = ((WindowManager) systemService).getDefaultDisplay();
        defaultDisplay.getClass();
        Point pointA = pyt.a(defaultDisplay);
        return new pxd(new Rect(0, 0, pointA.x, pointA.y), pyqVar.a(context));
    }

    @Override // defpackage.pyv
    public final pxd c(WindowMetrics windowMetrics, float f) {
        throw new UnsupportedOperationException("translateWindowMetrics not available before API30");
    }
}
