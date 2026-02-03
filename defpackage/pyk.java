package defpackage;

import android.app.Activity;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;

/* compiled from: PG */
/* loaded from: classes.dex */
final class pyk implements pyj {
    public static final pyk b = new pyk();

    private pyk() {
    }

    @Override // defpackage.pyj
    public final Rect a(Activity activity) {
        Rect rect = new Rect();
        Display defaultDisplay = activity.getWindowManager().getDefaultDisplay();
        defaultDisplay.getRectSize(rect);
        if (!activity.isInMultiWindowMode()) {
            defaultDisplay.getClass();
            Point pointA = pyt.a(defaultDisplay);
            int iA = pyo.a(activity);
            if (rect.bottom + iA == pointA.y) {
                rect.bottom += iA;
                return rect;
            }
            if (rect.right + iA == pointA.x) {
                rect.right += iA;
            }
        }
        return rect;
    }
}
