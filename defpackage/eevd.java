package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.LinearLayout;
import com.google.android.material.tabs.TabLayout;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eevd extends LinearLayout {
    public ValueAnimator a;
    public final /* synthetic */ TabLayout b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eevd(TabLayout tabLayout, Context context) {
        super(context);
        this.b = tabLayout;
        setWillNotDraw(false);
    }

    private final void e(int i) {
        TabLayout tabLayout = this.b;
        if (tabLayout.G == 0 || (tabLayout.n.getBounds().left == -1 && tabLayout.n.getBounds().right == -1)) {
            View childAt = getChildAt(i);
            Drawable drawable = tabLayout.n;
            RectF rectFB = eeuw.b(tabLayout, childAt);
            drawable.setBounds((int) rectFB.left, drawable.getBounds().top, (int) rectFB.right, drawable.getBounds().bottom);
            tabLayout.a = i;
        }
    }

    public final void a() {
        e(this.b.a());
    }

    public final void b(int i) {
        TabLayout tabLayout = this.b;
        Rect bounds = tabLayout.n.getBounds();
        tabLayout.n.setBounds(bounds.left, 0, bounds.right, i);
        requestLayout();
    }

    public final void c(View view, View view2, float f) {
        if (view == null || view.getWidth() <= 0) {
            TabLayout tabLayout = this.b;
            Drawable drawable = tabLayout.n;
            drawable.setBounds(-1, drawable.getBounds().top, -1, tabLayout.n.getBounds().bottom);
        } else {
            TabLayout tabLayout2 = this.b;
            tabLayout2.C.a(tabLayout2, view, view2, f, tabLayout2.n);
        }
        postInvalidateOnAnimation();
    }

    public final void d(boolean z, int i, int i2) {
        TabLayout tabLayout = this.b;
        if (tabLayout.a == i) {
            return;
        }
        View childAt = getChildAt(tabLayout.a());
        View childAt2 = getChildAt(i);
        if (childAt2 == null) {
            a();
            return;
        }
        tabLayout.a = i;
        eevc eevcVar = new eevc(this, childAt, childAt2);
        if (!z) {
            this.a.removeAllUpdateListeners();
            this.a.addUpdateListener(eevcVar);
            return;
        }
        ValueAnimator valueAnimator = new ValueAnimator();
        this.a = valueAnimator;
        valueAnimator.setInterpolator(tabLayout.D);
        valueAnimator.setDuration(i2);
        valueAnimator.setFloatValues(0.0f, 1.0f);
        valueAnimator.addUpdateListener(eevcVar);
        valueAnimator.start();
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int height;
        TabLayout tabLayout = this.b;
        int iHeight = tabLayout.n.getBounds().height();
        if (iHeight < 0) {
            iHeight = tabLayout.n.getIntrinsicHeight();
        }
        int i = tabLayout.w;
        if (i == 0) {
            height = getHeight() - iHeight;
            iHeight = getHeight();
        } else if (i != 1) {
            height = 0;
            if (i != 2) {
                iHeight = i != 3 ? 0 : getHeight();
            }
        } else {
            int height2 = getHeight() - iHeight;
            iHeight = (getHeight() + iHeight) / 2;
            height = height2 / 2;
        }
        if (tabLayout.n.getBounds().width() > 0) {
            Rect bounds = tabLayout.n.getBounds();
            tabLayout.n.setBounds(bounds.left, height, bounds.right, iHeight);
            tabLayout.n.draw(canvas);
        }
        super.draw(canvas);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        ValueAnimator valueAnimator = this.a;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            d(false, this.b.a(), -1);
            return;
        }
        TabLayout tabLayout = this.b;
        int iA = tabLayout.a;
        if (iA == -1) {
            iA = tabLayout.a();
            tabLayout.a = iA;
        }
        e(iA);
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (View.MeasureSpec.getMode(i) != 1073741824) {
            return;
        }
        TabLayout tabLayout = this.b;
        if (tabLayout.u == 1 || tabLayout.x == 2) {
            int childCount = getChildCount();
            int iMax = 0;
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = getChildAt(i3);
                if (childAt.getVisibility() == 0) {
                    iMax = Math.max(iMax, childAt.getMeasuredWidth());
                }
            }
            if (iMax > 0) {
                int iA = (int) eemo.a(getContext(), 16);
                if (iMax * childCount <= getMeasuredWidth() - (iA + iA)) {
                    boolean z = false;
                    for (int i4 = 0; i4 < childCount; i4++) {
                        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) getChildAt(i4).getLayoutParams();
                        if (layoutParams.width != iMax || layoutParams.weight != 0.0f) {
                            layoutParams.width = iMax;
                            layoutParams.weight = 0.0f;
                            z = true;
                        }
                    }
                    if (!z) {
                        return;
                    }
                } else {
                    tabLayout.u = 0;
                    tabLayout.v(false);
                }
                super.onMeasure(i, i2);
            }
        }
    }
}
