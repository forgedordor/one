package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.PopupWindow;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dxeb extends ViewGroup {
    public final Paint a;
    public PopupWindow b;
    public final boolean c;
    public View d;
    public int e;
    public View f;
    public int g;
    private final int[] h;
    private final Path i;
    private final RectF j;
    private final int k;
    private final int l;
    private final int m;
    private final int n;
    private final int o;
    private final int p;
    private final int q;
    private final int r;
    private Rect s;
    private int t;

    public dxeb(Context context) throws Resources.NotFoundException {
        super(context);
        this.t = 0;
        this.h = new int[2];
        this.i = new Path();
        this.j = new RectF();
        Paint paint = new Paint();
        this.a = paint;
        this.k = context.getResources().getDimensionPixelSize(R.dimen.lt_tooltip_container_padding_horizontal);
        this.l = context.getResources().getDimensionPixelSize(R.dimen.lt_tooltip_container_padding_vertical);
        this.m = context.getResources().getDimensionPixelSize(R.dimen.lt_tooltip_margin);
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.lt_tooltip_shadow_offset);
        this.n = dimensionPixelSize;
        int dimensionPixelSize2 = context.getResources().getDimensionPixelSize(R.dimen.lt_tooltip_shadow_radius);
        this.r = dimensionPixelSize2;
        this.o = context.getResources().getDimensionPixelSize(R.dimen.lt_tooltip_arrow_length);
        this.p = context.getResources().getDimensionPixelSize(R.dimen.lt_tooltip_arrow_base_width);
        this.q = context.getResources().getDimensionPixelSize(R.dimen.lt_tooltip_container_corner_radius);
        int iB = eehg.b(this, R.attr.colorPrimaryContainer);
        int iA = eejq.a(R.dimen.m3_sys_elevation_level5, context);
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(iB);
        paint.setAntiAlias(true);
        paint.setShadowLayer(dimensionPixelSize2, 0.0f, dimensionPixelSize, iA);
        this.c = true;
    }

    private final Point f() {
        return g(false);
    }

    private final Point g(boolean z) {
        WindowManager windowManager = (WindowManager) getContext().getSystemService("window");
        Point point = new Point();
        if (windowManager == null) {
            return point;
        }
        Display defaultDisplay = windowManager.getDefaultDisplay();
        if (z) {
            defaultDisplay.getRealSize(point);
            return point;
        }
        defaultDisplay.getSize(point);
        return point;
    }

    private final void h(int i, int i2) {
        int i3 = this.k;
        int i4 = i3 + i3;
        int size = View.MeasureSpec.getSize(i) - i4;
        int i5 = this.l;
        int i6 = i5 + i5;
        int size2 = View.MeasureSpec.getSize(i2) - i6;
        int i7 = this.n;
        int i8 = size - i7;
        int iMin = Math.min(f().x, i8);
        View view = this.d;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iMin, Integer.MIN_VALUE);
        int i9 = this.o;
        int i10 = (size2 - i7) - i9;
        view.measure(iMakeMeasureSpec, View.MeasureSpec.makeMeasureSpec(i10, 0));
        if (this.d.getMeasuredHeight() > i10) {
            this.d.measure(View.MeasureSpec.makeMeasureSpec(i8, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(i10, Integer.MIN_VALUE));
        }
        int measuredWidth = this.d.getMeasuredWidth() + i4;
        int measuredHeight = this.d.getMeasuredHeight() + i6;
        RectF rectF = this.j;
        rectF.set(0.0f, 0.0f, measuredWidth, measuredHeight);
        setMeasuredDimension(((int) rectF.width()) + i7, ((int) rectF.height()) + i7 + i9);
    }

    public final int a() {
        int iWidth;
        int measuredWidth = getMeasuredWidth();
        int[] iArr = ley.a;
        int layoutDirection = getLayoutDirection();
        int i = this.g;
        if (i == 1) {
            iWidth = layoutDirection == 1 ? (this.s.left + this.s.width()) - measuredWidth : this.s.left;
        } else {
            if (i != 2) {
                throw new IllegalStateException();
            }
            iWidth = this.s.left - ((measuredWidth - this.s.width()) / 2);
        }
        int i2 = this.m;
        WindowManager windowManager = (WindowManager) getContext().getSystemService("window");
        return Math.min((g(windowManager != null && windowManager.getDefaultDisplay().getRotation() == 3).x - i2) - measuredWidth, Math.max(i2, iWidth));
    }

    public final int b() {
        return this.s.top + (this.e == 1 ? -getMeasuredHeight() : 0);
    }

    public final void c() {
        PopupWindow popupWindow = this.b;
        if (popupWindow != null) {
            popupWindow.dismiss();
        }
    }

    public final void d() {
        View view = this.f;
        int[] iArr = this.h;
        view.getLocationInWindow(iArr);
        int measuredWidth = view.getWidth() == 0 ? view.getMeasuredWidth() : view.getWidth();
        int measuredHeight = view.getHeight() == 0 ? view.getMeasuredHeight() : view.getHeight();
        int i = iArr[0];
        int i2 = iArr[1];
        int i3 = this.t;
        this.s = new Rect(i, i2 + i3, measuredWidth + i, i2 + measuredHeight + i3);
    }

    public final void e() {
        Point pointF = f();
        int i = pointF.x;
        int i2 = pointF.y;
        int i3 = this.m;
        h(View.MeasureSpec.makeMeasureSpec(i - (i3 + i3), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(i2, Integer.MIN_VALUE));
    }

    @Override // android.view.View
    protected final void onDraw(Canvas canvas) {
        canvas.save();
        Paint paint = this.a;
        float f = this.q;
        canvas.drawRoundRect(this.j, f, f, paint);
        if (this.e == 1) {
            getLocationOnScreen(this.h);
            canvas.save();
            canvas.translate(this.m - r1[0], 0.0f);
            canvas.drawPath(this.i, paint);
            canvas.restore();
        }
        canvas.restore();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int iWidth;
        View view = this.d;
        int i5 = this.e == 1 ? this.o : 0;
        int i6 = this.l;
        int i7 = i4 - i2;
        int i8 = this.k;
        view.layout(i8, i6, (i3 - i) - i8, (i7 - i6) - i5);
        this.b.update(a(), b(), getMeasuredWidth(), getMeasuredHeight(), true);
        int i9 = this.g;
        if (i9 == 1) {
            int iWidth2 = this.s.width() - (this.p / 2);
            int i10 = this.m;
            iWidth = iWidth2 - (i10 + i10);
        } else {
            if (i9 != 2) {
                throw new IllegalStateException("Tooltip has invalid alignment.");
            }
            iWidth = this.s.width() / 2;
        }
        int[] iArr = ley.a;
        if (getLayoutDirection() == 1) {
            iWidth = this.s.width() - iWidth;
        }
        View view2 = this.f;
        int[] iArr2 = this.h;
        view2.getLocationOnScreen(iArr2);
        int i11 = iWidth + iArr2[0];
        Path path = this.i;
        path.reset();
        if (this.e == 1) {
            int i12 = i11 - this.m;
            int i13 = this.p;
            path.moveTo(i12 - (i13 / 2), this.j.bottom);
            path.rLineTo(i13, 0.0f);
            float f = (-i13) / 2.0f;
            path.rLineTo(f, this.o);
            path.rLineTo(f, -r11);
            path.close();
        }
    }

    @Override // android.view.View
    protected final void onMeasure(int i, int i2) {
        h(i, i2);
        if (this.f != null) {
            d();
            e();
        }
    }

    @Override // android.view.View
    public final void setTranslationY(float f) {
        this.t = (int) f;
        d();
    }
}
