package com.google.android.libraries.onegoogle.tooltip;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import com.google.android.libraries.onegoogle.account.disc.AccountParticleDisc;
import com.google.android.libraries.onegoogle.accountmenu.SelectedAccountDisc;
import defpackage.dyml;
import defpackage.dypw;
import defpackage.dyrb;
import defpackage.dzdf;
import defpackage.dzdh;
import defpackage.dzdv;
import defpackage.dzed;
import defpackage.ley;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class TooltipView extends ViewGroup {
    private final int A;
    private final int B;
    private final int C;
    private float D;
    private float E;
    private float F;
    private final int G;
    private final int H;
    private final int I;
    private int J;
    public final dzdh a;
    public final ViewGroup b;
    public final dzed c;
    public final View d;
    public int e;
    public int f;
    public int g;
    public int h;
    public final dzdv i;
    public final dyml j;
    private final RectF k;
    private final Path l;
    private final RectF m;
    private final Rect n;
    private final Paint o;
    private final Point p;
    private final int[] q;
    private final int r;
    private final int s;
    private final int t;
    private final int u;
    private final int v;
    private final int w;
    private final int x;
    private final int y;
    private final int z;

    /* compiled from: PG */
    public static class ScaleAnimatable implements dzdf {
        private final View a;

        public ScaleAnimatable(View view) {
            this.a = view;
        }

        public void setScale(float f) {
            View view = this.a;
            view.setScaleX(f);
            view.setScaleY(f);
        }
    }

    public TooltipView(View view, dzdh dzdhVar, dyml dymlVar) throws Resources.NotFoundException {
        super(view.getContext());
        this.k = new RectF();
        this.l = new Path();
        this.m = new RectF();
        this.n = new Rect();
        Paint paint = new Paint();
        this.o = paint;
        this.p = new Point();
        this.q = new int[2];
        this.J = 5;
        this.e = 0;
        this.f = 0;
        this.D = 1.0f;
        this.a = dzdhVar;
        this.I = 2;
        this.j = dymlVar;
        Context context = getContext();
        setId(R.id.content);
        setWillNotDraw(false);
        Resources resources = getResources();
        this.r = resources.getDimensionPixelSize(com.google.android.apps.messaging.R.dimen.og_tooltip_padding);
        this.s = resources.getDimensionPixelSize(com.google.android.apps.messaging.R.dimen.og_tooltip_margin);
        this.t = resources.getDimensionPixelSize(com.google.android.apps.messaging.R.dimen.og_tooltip_anchor_margin);
        this.u = resources.getDimensionPixelSize(com.google.android.apps.messaging.R.dimen.og_tooltip_arrow_height);
        this.v = resources.getDimensionPixelSize(com.google.android.apps.messaging.R.dimen.og_tooltip_arrow_width);
        this.w = Math.round(dypw.a(getContext(), com.google.android.apps.messaging.R.attr.ogDialogCornerRadius));
        this.x = resources.getDimensionPixelSize(com.google.android.apps.messaging.R.dimen.og_tooltip_min_animation_width);
        int dimensionPixelSize = resources.getDimensionPixelSize(com.google.android.apps.messaging.R.dimen.og_tooltip_shadow_radius);
        this.y = dimensionPixelSize;
        int dimensionPixelSize2 = resources.getDimensionPixelSize(com.google.android.apps.messaging.R.dimen.og_tooltip_shadow_offset);
        this.z = dimensionPixelSize2;
        this.A = resources.getDimensionPixelSize(com.google.android.apps.messaging.R.dimen.og_tooltip_arrow_tip_radius);
        this.B = resources.getDimensionPixelSize(com.google.android.apps.messaging.R.dimen.og_tooltip_max_width);
        this.C = resources.getDimensionPixelSize(com.google.android.apps.messaging.R.dimen.og_tooltip_min_space_between_arrow_and_edge);
        this.G = dimensionPixelSize - dimensionPixelSize2;
        this.H = dimensionPixelSize + dimensionPixelSize2;
        paint.setStyle(Paint.Style.FILL);
        float f = dimensionPixelSize;
        float f2 = dimensionPixelSize2;
        paint.setShadowLayer(f, f2, f2, context.getColor(com.google.android.apps.messaging.R.color.og_tooltip_shadow));
        c(context.getColor(com.google.android.apps.messaging.R.color.google_blue600));
        if (Build.VERSION.SDK_INT < 28) {
            setLayerType(1, paint);
        }
        final dzed dzedVar = new dzed(this, this);
        this.c = dzedVar;
        if (dyrb.a(context)) {
            dzedVar.setFocusable(true);
        }
        this.d = view;
        if (view.getParent() instanceof ViewGroup) {
            ((ViewGroup) view.getParent()).removeView(view);
        }
        addView(view);
        dzdv dzdvVar = new dzdv(getContext(), dzdhVar, new Runnable() { // from class: dzdx
            @Override // java.lang.Runnable
            public final void run() {
                dzedVar.dismiss();
            }
        });
        this.i = dzdvVar;
        dzdvVar.setId(com.google.android.apps.messaging.R.id.og_tooltip_scrim_view);
        View rootView = ((SelectedAccountDisc) dzdhVar).c.getRootView();
        if (!(rootView instanceof ViewGroup)) {
            throw new IllegalStateException("Should not happen. Root view is not a ViewGroup");
        }
        this.b = (ViewGroup) rootView;
    }

    private final RectF e(float f) {
        float fMax;
        float f2;
        float f3;
        float f4;
        int i = this.g - this.e;
        int i2 = this.h;
        int i3 = i2 - this.f;
        float f5 = this.x;
        float f6 = this.E - f5;
        int i4 = this.J;
        float f7 = (f * f6) + f5;
        float f8 = i3;
        float f9 = i;
        if (i(i4)) {
            float measuredWidth = (getMeasuredWidth() - this.E) * (f9 / getMeasuredWidth());
            float f10 = (int) ((f9 - measuredWidth) - (r3 / 2));
            float f11 = f10 / f6;
            float f12 = 0.5f - f11;
            int i5 = this.y;
            int i6 = this.z;
            float f13 = this.E;
            float f14 = measuredWidth + (f10 - (f11 * (f7 - f5))) + (((f12 + f12) * i5) - i6);
            fMax = f9 > f13 / 2.0f ? Math.max((f9 + (this.v / 2.0f)) + this.C, f14 + f13) - this.E : Math.min((f9 - (this.v / 2.0f)) - this.C, f14);
            if (this.J == 2) {
                f4 = f8 + this.u;
            } else {
                f2 = f8 - this.u;
                f3 = this.F;
                f4 = f2 - f3;
            }
        } else {
            fMax = i4 == 3 ? (f9 - this.u) - f7 : f9 + this.u;
            float f15 = (this.v * 0.5f) + this.C;
            if (h(i2)) {
                f4 = f8 - f15;
            } else {
                f2 = f8 + f15;
                f3 = this.F;
                f4 = f2 - f3;
            }
        }
        RectF rectF = this.k;
        rectF.set(fMax, f4, f7 + fMax, this.F + f4);
        return rectF;
    }

    private final void f(Point point) {
        ((WindowManager) getContext().getSystemService("window")).getDefaultDisplay().getSize(point);
    }

    private final void g(Path path, float f) {
        path.reset();
        int i = this.g - this.e;
        int i2 = this.h - this.f;
        float f2 = this.v;
        float f3 = f2 / 2.0f;
        int i3 = this.u;
        float fHypot = (float) Math.hypot(i3, f3);
        float f4 = i3;
        float degrees = (float) Math.toDegrees(Math.atan(f4 / f3));
        int i4 = this.J;
        float f5 = i2;
        float f6 = i;
        float f7 = this.A;
        float f8 = fHypot * f7;
        float f9 = (f8 + f8) / f2;
        if (i4 == 1) {
            float f10 = -degrees;
            float f11 = f6 + f3;
            float f12 = f6 + f7;
            float f13 = f6 - f7;
            float f14 = f6 - f3;
            float f15 = f5 - f4;
            path.moveTo(f14, f15);
            RectF rectF = this.m;
            float f16 = f5 - f9;
            rectF.set(f13, f16 - f7, f12, f16 + f7);
            path.arcTo(rectF, degrees - 270.0f, f10 + f10);
            path.lineTo(f11, f15);
        } else if (i4 == 2) {
            float f17 = f6 + f3;
            float f18 = f6 + f7;
            float f19 = f6 - f7;
            float f20 = f4 + f5;
            path.moveTo(f6 - f3, f20);
            RectF rectF2 = this.m;
            float f21 = f5 + f9;
            rectF2.set(f19, f21 - f7, f18, f21 + f7);
            path.arcTo(rectF2, (-90.0f) - degrees, degrees + degrees);
            path.lineTo(f17, f20);
        } else {
            float f22 = -degrees;
            float f23 = f5 + f3;
            float f24 = f5 + f7;
            float f25 = f5 - f7;
            float f26 = f5 - f3;
            if (i4 == 3) {
                float f27 = f6 - f4;
                path.moveTo(f27, f26);
                RectF rectF3 = this.m;
                float f28 = f6 - f9;
                rectF3.set(f28 - f7, f25, f28 + f7, f24);
                path.arcTo(rectF3, f22, degrees + degrees);
                path.lineTo(f27, f23);
            } else {
                float f29 = f4 + f6;
                path.moveTo(f29, f26);
                RectF rectF4 = this.m;
                float f30 = f6 + f9;
                rectF4.set(f30 - f7, f25, f30 + f7, f24);
                path.arcTo(rectF4, degrees + 180.0f, f22 + f22);
                path.lineTo(f29, f23);
            }
        }
        path.close();
        RectF rectFE = e(f);
        float f31 = this.w;
        path.addRoundRect(rectFE, f31, f31, Path.Direction.CW);
    }

    private final boolean h(float f) {
        return f < ((float) this.p.y) * 0.5f;
    }

    private static boolean i(int i) {
        return i == 1 || i == 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Animator a() throws Resources.NotFoundException {
        Animator animatorLoadAnimator = AnimatorInflater.loadAnimator(getContext(), com.google.android.apps.messaging.R.animator.og_tooltip_anchor_animator);
        AccountParticleDisc accountParticleDisc = ((SelectedAccountDisc) this.a).c;
        animatorLoadAnimator.setTarget(accountParticleDisc instanceof dzdf ? (dzdf) accountParticleDisc : new ScaleAnimatable(accountParticleDisc));
        return animatorLoadAnimator;
    }

    public final void b(Rect rect) {
        this.n.set(rect);
    }

    public final void c(int i) {
        this.o.setColor(i);
    }

    public final void d() {
        int iHeight;
        int iWidth;
        Point point = this.p;
        f(point);
        int i = point.x;
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        int i2 = this.J;
        int i3 = 0;
        if (i2 == 1) {
            iHeight = ((-measuredHeight) - this.t) + this.H;
        } else if (i2 == 2) {
            iHeight = (this.n.height() + this.t) - this.G;
        } else if (i2 == 3) {
            i3 = this.H + ((-measuredWidth) - this.t);
            iHeight = (this.n.height() - measuredHeight) / 2;
        } else if (i2 == 4) {
            Rect rect = this.n;
            int iWidth2 = rect.width() + this.t;
            int i4 = this.G;
            iHeight = (rect.height() - measuredHeight) / 2;
            i3 = iWidth2 - i4;
        } else {
            iHeight = 0;
        }
        if (i(this.J)) {
            Rect rect2 = this.n;
            this.f = rect2.top + iHeight;
            iWidth = rect2.left + ((rect2.width() - measuredWidth) / 2);
        } else {
            Rect rect3 = this.n;
            int i5 = rect3.left + i3;
            int i6 = this.v;
            int i7 = this.C;
            float fExactCenterY = rect3.exactCenterY();
            float f = (i6 * 0.5f) + i7;
            if (h(fExactCenterY)) {
                this.f = Math.round((fExactCenterY - f) - this.G);
            } else {
                this.f = Math.round(((fExactCenterY + f) + this.H) - measuredHeight);
            }
            iWidth = i5;
        }
        if (!i(this.J)) {
            this.e = iWidth;
            return;
        }
        int i8 = this.s;
        this.e = Math.min((i - i8) - measuredWidth, Math.max(i8, iWidth));
        Rect rect4 = this.n;
        int i9 = (rect4.left + rect4.right) / 2;
        if (i9 > i / 2) {
            this.e = Math.max(i9 + (((this.v / 2) + this.C) + this.H), this.e + measuredWidth) - measuredWidth;
            return;
        }
        this.e = Math.min(i9 - (((this.v / 2) + this.C) + this.G), this.e);
    }

    @Override // android.view.View
    protected final void onDraw(Canvas canvas) {
        Paint paint = this.o;
        if (paint.getAlpha() != 0) {
            canvas.drawPath(this.l, paint);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        d();
        this.c.update(this.e, this.f, getMeasuredWidth(), getMeasuredHeight(), true);
        RectF rectFE = e(1.0f);
        this.d.layout((int) rectFE.left, (int) rectFE.top, (int) rectFE.right, (int) rectFE.bottom);
        g(this.l, this.D);
    }

    @Override // android.view.View
    protected final void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        if (this.J == 5) {
            int i7 = this.I;
            int[] iArr = ley.a;
            getLayoutDirection();
            int i8 = i7 - 1;
            if (i7 == 0) {
                throw null;
            }
            if (i8 == 0) {
                i6 = 1;
            } else {
                if (i8 != 1) {
                    throw new RuntimeException(null, null);
                }
                i6 = 2;
            }
            this.J = i6;
        }
        int[] iArr2 = this.q;
        Point point = this.p;
        f(point);
        int i9 = point.x;
        int iHeight = point.y;
        int i10 = this.J;
        int i11 = i10 - 1;
        if (i10 == 0) {
            throw null;
        }
        if (i11 != 0) {
            if (i11 == 1) {
                i5 = this.s;
                i3 = i9 - (i5 + i5);
                Rect rect = this.n;
                iHeight = (iHeight - rect.top) - rect.height();
            } else if (i11 == 2) {
                Rect rect2 = this.n;
                int i12 = this.s;
                i3 = rect2.left - i12;
                i5 = i12 + i12;
            } else {
                if (i11 != 3) {
                    throw new IllegalStateException();
                }
                Rect rect3 = this.n;
                int iWidth = (i9 - rect3.left) - rect3.width();
                int i13 = this.s;
                i4 = iHeight - (i13 + i13);
                i3 = iWidth - i13;
            }
            i4 = iHeight - i5;
        } else {
            int i14 = this.s;
            i3 = i9 - (i14 + i14);
            i4 = this.n.top - i14;
        }
        iArr2[0] = i3;
        iArr2[1] = i4;
        int i15 = this.r;
        int i16 = i15 + i15;
        int i17 = this.y;
        int i18 = this.J;
        int i19 = i17 + i17;
        int i20 = (i4 - i16) - i19;
        int i21 = (i3 - i16) - i19;
        if (i(i18)) {
            i20 -= this.u;
        } else if (i18 == 3 || i18 == 4) {
            i21 -= this.u;
        }
        int i22 = this.B;
        View view = this.d;
        view.measure(View.MeasureSpec.makeMeasureSpec(Math.min(i21, i22), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(i20, 0));
        if (view.getMeasuredHeight() > i20) {
            view.measure(View.MeasureSpec.makeMeasureSpec(i21, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(i20, Integer.MIN_VALUE));
        }
        this.E = view.getMeasuredWidth() + i16;
        float measuredHeight = view.getMeasuredHeight() + i16;
        this.F = measuredHeight;
        int i23 = (int) this.E;
        int i24 = this.J;
        int i25 = ((int) measuredHeight) + i19;
        int i26 = i23 + i19;
        if (i(i24)) {
            i25 += this.u;
        } else if (i24 == 3 || i24 == 4) {
            i26 += this.u;
        }
        setMeasuredDimension((int) Math.ceil(i26 * 1.05f), (int) Math.ceil(i25 * 1.05f));
        Rect rect4 = this.n;
        int iCenterX = rect4.centerX();
        int iCenterY = rect4.centerY();
        int i27 = this.J;
        int i28 = i27 - 1;
        if (i27 == 0) {
            throw null;
        }
        if (i28 == 0) {
            this.g = iCenterX;
            this.h = rect4.top - this.t;
            return;
        }
        if (i28 == 1) {
            this.g = iCenterX;
            this.h = rect4.bottom + this.t;
        } else if (i28 == 2) {
            this.g = rect4.left - this.t;
            this.h = iCenterY;
        } else if (i28 != 3) {
            if (i28 == 4) {
                throw new IllegalStateException();
            }
        } else {
            this.g = rect4.right + this.t;
            this.h = iCenterY;
        }
    }

    public void setBubbleWidthScale(float f) {
        this.D = f;
        g(this.l, f);
        invalidate();
    }

    public void setContentAlpha(float f) {
        this.d.setAlpha(f);
        invalidate();
    }

    public void setTooltipAlpha(float f) {
        this.o.setAlpha((int) (f * 255.0f));
        invalidate();
    }
}
