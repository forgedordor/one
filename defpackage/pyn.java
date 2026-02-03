package defpackage;

import android.app.Activity;
import android.graphics.Rect;
import android.view.WindowManager;

/* compiled from: PG */
/* loaded from: classes.dex */
final class pyn implements pyj {
    public static final pyn b = new pyn();

    private pyn() {
    }

    @Override // defpackage.pyj
    public final Rect a(Activity activity) {
        Rect bounds = ((WindowManager) activity.getSystemService(WindowManager.class)).getCurrentWindowMetrics().getBounds();
        bounds.getClass();
        return bounds;
    }
}
