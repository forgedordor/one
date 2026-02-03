package defpackage;

import android.graphics.Rect;
import android.view.FocusFinder;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.AndroidComposeView;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ifw {
    public static final ifq a(int i) {
        if (i == 1) {
            return new ifq(2);
        }
        if (i == 2) {
            return new ifq(1);
        }
        if (i == 17) {
            return new ifq(3);
        }
        if (i == 33) {
            return new ifq(5);
        }
        if (i == 66) {
            return new ifq(4);
        }
        if (i != 130) {
            return null;
        }
        return new ifq(6);
    }

    public static final ihu b(View view, View view2) {
        int[] iArr = ifv.a;
        view.getLocationInWindow(iArr);
        int i = iArr[0];
        int i2 = iArr[1];
        view2.getLocationInWindow(iArr);
        int i3 = iArr[0];
        float f = i - i3;
        float f2 = i2 - iArr[1];
        return new ihu(f, f2, view.getWidth() + f, view.getHeight() + f2);
    }

    public static final kji c(int i) {
        if (i == 0) {
            return kji.a;
        }
        if (i != 1) {
            return null;
        }
        return kji.b;
    }

    public static final Integer d(int i) {
        if (ifq.b(i, 5)) {
            return 33;
        }
        if (ifq.b(i, 6)) {
            return 130;
        }
        if (ifq.b(i, 3)) {
            return 17;
        }
        if (ifq.b(i, 4)) {
            return 66;
        }
        if (ifq.b(i, 1)) {
            return 2;
        }
        return !ifq.b(i, 2) ? null : 1;
    }

    public static final boolean e(View view, Integer num, Rect rect) {
        if (num == null) {
            return view.requestFocus();
        }
        if (!(view instanceof ViewGroup)) {
            return view.requestFocus(num.intValue(), rect);
        }
        ViewGroup viewGroup = (ViewGroup) view;
        if (viewGroup.isFocused()) {
            return true;
        }
        if (viewGroup.isFocusable() && !viewGroup.hasFocus()) {
            return viewGroup.requestFocus(num.intValue(), rect);
        }
        if (view instanceof AndroidComposeView) {
            return ((AndroidComposeView) view).requestFocus(num.intValue(), rect);
        }
        if (rect != null) {
            View viewFindNextFocusFromRect = FocusFinder.getInstance().findNextFocusFromRect(viewGroup, rect, num.intValue());
            return viewFindNextFocusFromRect != null ? viewFindNextFocusFromRect.requestFocus(num.intValue(), rect) : viewGroup.requestFocus(num.intValue(), rect);
        }
        View viewFindNextFocus = FocusFinder.getInstance().findNextFocus(viewGroup, viewGroup.hasFocus() ? viewGroup.findFocus() : null, num.intValue());
        return viewFindNextFocus != null ? viewFindNextFocus.requestFocus(num.intValue()) : view.requestFocus(num.intValue());
    }
}
