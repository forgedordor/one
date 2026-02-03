package defpackage;

import android.app.Activity;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;

/* compiled from: PG */
/* loaded from: classes.dex */
final class jkw implements jkv {
    public static final jkw a = new jkw();

    private jkw() {
    }

    @Override // defpackage.jkv
    public final Rect a(Activity activity) {
        Rect rect = new Rect();
        Display defaultDisplay = activity.getWindowManager().getDefaultDisplay();
        defaultDisplay.getRectSize(rect);
        if (!activity.isInMultiWindowMode()) {
            Point point = new Point();
            defaultDisplay.getRealSize(point);
            int iA = jks.a(activity);
            if (rect.bottom + iA == point.y) {
                rect.bottom += iA;
                return rect;
            }
            if (rect.right + iA == point.x) {
                rect.right += iA;
            }
        }
        return rect;
    }
}
