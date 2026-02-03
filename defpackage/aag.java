package defpackage;

import android.content.res.Resources;
import android.graphics.Canvas;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.animation.Interpolator;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class aag {
    private static final Interpolator a = new aae();
    private static final Interpolator b = new aaf();
    private int c = -1;

    public static int c(int i, int i2) {
        int i3;
        int i4 = i & 789516;
        if (i4 == 0) {
            return i;
        }
        int i5 = i & (~i4);
        if (i2 == 0) {
            i3 = i4 << 2;
        } else {
            int i6 = i4 + i4;
            i5 |= (-789517) & i6;
            i3 = (i6 & 789516) << 2;
        }
        return i5 | i3;
    }

    public static int f(int i, int i2) {
        return i2 << (i * 8);
    }

    public static int g(int i, int i2) {
        return f(2, i) | f(1, i2) | f(0, i2 | i);
    }

    public final int b(int i, int i2) {
        int i3;
        int i4 = i & 3158064;
        if (i4 == 0) {
            return i;
        }
        int i5 = i & (~i4);
        if (i2 == 0) {
            i3 = i4 >> 2;
        } else {
            int i6 = i4 >> 1;
            i5 |= (-3158065) & i6;
            i3 = (i6 & 3158064) >> 2;
        }
        return i5 | i3;
    }

    final int d(RecyclerView recyclerView, wv wvVar) {
        return b(e(recyclerView, wvVar), recyclerView.getLayoutDirection());
    }

    public abstract int e(RecyclerView recyclerView, wv wvVar);

    public void h(Canvas canvas, RecyclerView recyclerView, wv wvVar, float f, float f2, int i, boolean z) {
        View view = wvVar.a;
        if (z && view.getTag(R.id.item_touch_helper_previous_elevation) == null) {
            int[] iArr = ley.a;
            Float fValueOf = Float.valueOf(len.a(view));
            int childCount = recyclerView.getChildCount();
            float f3 = 0.0f;
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = recyclerView.getChildAt(i2);
                if (childAt != view) {
                    float fA = len.a(childAt);
                    if (fA > f3) {
                        f3 = fA;
                    }
                }
            }
            len.j(view, f3 + 1.0f);
            view.setTag(R.id.item_touch_helper_previous_elevation, fValueOf);
        }
        view.setTranslationX(f);
        view.setTranslationY(f2);
    }

    public abstract void i(wv wvVar, int i);

    final boolean j(RecyclerView recyclerView, wv wvVar) {
        return (d(recyclerView, wvVar) & 16711680) != 0;
    }

    public boolean k() {
        return true;
    }

    public boolean l() {
        return true;
    }

    public abstract boolean m(RecyclerView recyclerView, wv wvVar, wv wvVar2);

    public final void n(wv wvVar) {
        View view = wvVar.a;
        Object tag = view.getTag(R.id.item_touch_helper_previous_elevation);
        if (tag instanceof Float) {
            float fFloatValue = ((Float) tag).floatValue();
            int[] iArr = ley.a;
            len.j(view, fFloatValue);
        }
        view.setTag(R.id.item_touch_helper_previous_elevation, null);
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
    }

    public final int o(RecyclerView recyclerView, int i, int i2, long j) throws Resources.NotFoundException {
        int dimensionPixelSize = this.c;
        if (dimensionPixelSize == -1) {
            dimensionPixelSize = recyclerView.getResources().getDimensionPixelSize(R.dimen.item_touch_helper_max_drag_scroll_per_frame);
            this.c = dimensionPixelSize;
        }
        int iAbs = Math.abs(i2);
        int iSignum = (int) (((int) (((int) Math.signum(i2)) * dimensionPixelSize * b.getInterpolation(Math.min(1.0f, iAbs / i)))) * a.getInterpolation(j <= 2000 ? j / 2000.0f : 1.0f));
        return iSignum == 0 ? i2 > 0 ? 1 : -1 : iSignum;
    }

    public float a(float f) {
        return f;
    }

    public void p(wv wvVar) {
    }
}
