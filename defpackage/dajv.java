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
/* loaded from: classes3.dex */
public final class dajv extends ViewGroup {
    public final Paint a;
    public PopupWindow b;
    public final boolean c;
    public boolean d;
    public View e;
    public int f;
    public View g;
    public int h;
    public int i;
    private final int[] j;
    private final Path k;
    private final RectF l;
    private final int m;
    private final int n;
    private final int o;
    private final int p;
    private final int q;
    private final int r;
    private final int s;
    private final int t;
    private Rect u;
    private int v;

    public dajv(Context context) throws Resources.NotFoundException {
        super(context);
        this.v = 0;
        this.i = 0;
        this.j = new int[2];
        this.k = new Path();
        this.l = new RectF();
        Paint paint = new Paint();
        this.a = paint;
        this.m = context.getResources().getDimensionPixelSize(R.dimen.tooltip_container_padding_horizontal);
        this.n = context.getResources().getDimensionPixelSize(R.dimen.tooltip_container_padding_vertical);
        this.o = context.getResources().getDimensionPixelSize(R.dimen.tooltip_margin);
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.tooltip_shadow_offset);
        this.p = dimensionPixelSize;
        int dimensionPixelSize2 = context.getResources().getDimensionPixelSize(R.dimen.tooltip_shadow_radius);
        this.t = dimensionPixelSize2;
        this.q = context.getResources().getDimensionPixelSize(R.dimen.tooltip_arrow_length);
        this.r = context.getResources().getDimensionPixelSize(R.dimen.tooltip_arrow_base_width);
        this.s = context.getResources().getDimensionPixelSize(R.dimen.tooltip_container_corner_radius);
        int color = context.getColor(R.color.tooltip_background_color);
        int color2 = context.getColor(R.color.tooltip_shadow_color);
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(color);
        paint.setAntiAlias(true);
        paint.setShadowLayer(dimensionPixelSize2, 0.0f, dimensionPixelSize, color2);
        this.c = true;
        this.d = false;
    }

    private final Point g() {
        return h(false);
    }

    private final Point h(boolean z) {
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

    private final void i(Canvas canvas) {
        getLocationOnScreen(this.j);
        canvas.save();
        canvas.translate(this.o - r0[0], 0.0f);
        canvas.drawPath(this.k, this.a);
        canvas.restore();
    }

    private final void j(int i, int i2) {
        int i3 = this.m;
        int i4 = i3 + i3;
        int size = View.MeasureSpec.getSize(i) - i4;
        int i5 = this.n;
        int i6 = i5 + i5;
        int size2 = View.MeasureSpec.getSize(i2) - i6;
        int i7 = this.p;
        int i8 = size - i7;
        int iMin = Math.min(g().x, i8);
        View view = this.e;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iMin, Integer.MIN_VALUE);
        int i9 = this.q;
        int i10 = (size2 - i7) - i9;
        view.measure(iMakeMeasureSpec, View.MeasureSpec.makeMeasureSpec(i10, 0));
        if (this.e.getMeasuredHeight() > i10) {
            this.e.measure(View.MeasureSpec.makeMeasureSpec(i8, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(i10, Integer.MIN_VALUE));
        }
        int measuredWidth = this.e.getMeasuredWidth() + i4;
        int measuredHeight = this.e.getMeasuredHeight() + i6;
        RectF rectF = this.l;
        rectF.set(0.0f, 0.0f, measuredWidth, measuredHeight);
        setMeasuredDimension(((int) rectF.width()) + i7, ((int) rectF.height()) + i7 + i9);
    }

    public final int a() {
        int iWidth;
        int i;
        int iWidth2;
        int measuredWidth = getMeasuredWidth();
        int[] iArr = ley.a;
        int layoutDirection = getLayoutDirection();
        int i2 = this.h;
        if (i2 != 1) {
            if (i2 == 2) {
                iWidth = this.u.left - ((measuredWidth - this.u.width()) / 2);
            } else {
                if (i2 != 3) {
                    throw new IllegalStateException();
                }
                if (layoutDirection == 1) {
                    iWidth = this.u.left;
                } else {
                    i = this.u.left;
                    iWidth2 = this.u.width();
                    iWidth = (i + iWidth2) - measuredWidth;
                }
            }
        } else if (layoutDirection == 1) {
            i = this.u.left;
            iWidth2 = this.u.width();
            iWidth = (i + iWidth2) - measuredWidth;
        } else {
            iWidth = this.u.left;
        }
        int i3 = this.o;
        WindowManager windowManager = (WindowManager) getContext().getSystemService("window");
        return Math.min((h(windowManager != null && windowManager.getDefaultDisplay().getRotation() == 3).x - i3) - measuredWidth, Math.max(i3, iWidth));
    }

    public final int b() {
        int i = this.f;
        return this.u.top + (i == 1 ? -getMeasuredHeight() : i == 2 ? this.u.height() : 0);
    }

    public final void c() {
        PopupWindow popupWindow = this.b;
        if (popupWindow != null) {
            popupWindow.dismiss();
        }
    }

    public final void d() {
        View view = this.g;
        int[] iArr = this.j;
        view.getLocationInWindow(iArr);
        int measuredWidth = view.getWidth() == 0 ? view.getMeasuredWidth() : view.getWidth();
        int measuredHeight = view.getHeight() == 0 ? view.getMeasuredHeight() : view.getHeight();
        int i = iArr[0];
        int i2 = iArr[1];
        int i3 = this.v;
        this.u = new Rect(i, i2 + i3, measuredWidth + i, i2 + measuredHeight + i3);
    }

    public final void e() {
        this.b.update(a(), b(), getMeasuredWidth(), getMeasuredHeight(), true);
    }

    public final void f() {
        Point pointG = g();
        int i = pointG.x;
        int iHeight = pointG.y;
        int i2 = this.i;
        if (i2 == 0) {
            int i3 = this.o;
            i2 = i - (i3 + i3);
        }
        if (this.f == 2) {
            iHeight = ((iHeight - this.u.top) - this.u.height()) - this.o;
        }
        j(View.MeasureSpec.makeMeasureSpec(i2, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(iHeight, Integer.MIN_VALUE));
    }

    @Override // android.view.View
    protected final void onDraw(Canvas canvas) {
        canvas.save();
        if (this.f == 2) {
            canvas.translate(0.0f, this.q);
            i(canvas);
        }
        RectF rectF = this.l;
        float f = this.s;
        canvas.drawRoundRect(rectF, f, f, this.a);
        if (this.f == 1) {
            i(canvas);
        }
        canvas.restore();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int iWidth;
        View view = this.e;
        int i5 = this.f;
        int i6 = i5 == 2 ? this.q : 0;
        int i7 = this.n;
        int i8 = i3 - i;
        int i9 = this.m;
        view.layout(i9, i7 + i6, i8 - i9, ((i4 - i2) - i7) - (i5 == 1 ? this.q : 0));
        e();
        int i10 = this.h;
        if (i10 == 1) {
            int i11 = this.r / 2;
            int i12 = this.o;
            iWidth = i11 + i12 + i12;
        } else if (i10 == 2) {
            iWidth = this.u.width() / 2;
        } else {
            if (i10 != 3) {
                throw new IllegalStateException("Tooltip has invalid alignment.");
            }
            int iWidth2 = this.u.width() - (this.r / 2);
            int i13 = this.o;
            iWidth = iWidth2 - (i13 + i13);
        }
        int[] iArr = ley.a;
        if (getLayoutDirection() == 1) {
            iWidth = this.u.width() - iWidth;
        }
        View view2 = this.g;
        int[] iArr2 = this.j;
        view2.getLocationOnScreen(iArr2);
        int i14 = iWidth + iArr2[0];
        Path path = this.k;
        path.reset();
        int i15 = this.f;
        if (i15 == 1) {
            int i16 = i14 - this.o;
            int i17 = this.r;
            path.moveTo(i16 - (i17 / 2), this.l.bottom);
            path.rLineTo(i17, 0.0f);
            int i18 = (-i17) / 2;
            float f = i18;
            path.rLineTo(f, this.q);
            path.rLineTo(f, -r8);
            path.close();
            return;
        }
        if (i15 == 2) {
            int i19 = i14 - this.o;
            int i20 = this.r / 2;
            path.moveTo(i19 + i20, this.l.top);
            path.rLineTo(-r8, 0.0f);
            int i21 = this.q;
            float f2 = i20;
            path.rLineTo(f2, -i21);
            path.rLineTo(f2, i21);
            path.close();
        }
    }

    @Override // android.view.View
    protected final void onMeasure(int i, int i2) {
        j(i, i2);
        if (this.g != null) {
            d();
            f();
        }
    }

    @Override // android.view.View
    public final void setTranslationY(float f) {
        this.v = (int) f;
        d();
    }
}
