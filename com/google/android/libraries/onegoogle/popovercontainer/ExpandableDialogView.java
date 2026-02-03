package com.google.android.libraries.onegoogle.popovercontainer;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Property;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowInsets;
import android.view.animation.AccelerateInterpolator;
import com.google.android.apps.messaging.R;
import com.google.android.libraries.onegoogle.common.OverScrollControlledNestedScrollView;
import com.google.android.libraries.onegoogle.popovercontainer.ExpandableDialogView;
import defpackage.dypw;
import defpackage.dyrb;
import defpackage.dyrg;
import defpackage.dyyb;
import defpackage.dyyh;
import defpackage.dzbq;
import defpackage.dzbv;
import defpackage.dzbw;
import defpackage.dzbx;
import defpackage.dzby;
import defpackage.dzbz;
import defpackage.dzca;
import defpackage.dzcb;
import defpackage.dzcc;
import defpackage.dzdc;
import defpackage.dzdd;
import defpackage.eecf;
import defpackage.eehg;
import defpackage.eejp;
import defpackage.eejq;
import defpackage.eemo;
import defpackage.eesc;
import defpackage.eesh;
import defpackage.eesj;
import defpackage.kzb;
import defpackage.lda;
import defpackage.ldl;
import defpackage.ldm;
import defpackage.len;
import defpackage.ley;
import defpackage.luc;
import defpackage.lud;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ExpandableDialogView extends ViewGroup implements ldl, dyyh {
    public static final /* synthetic */ int m = 0;
    private static final TimeInterpolator n = new luc();
    private static final Property o = new dzbz(Integer.class);
    private static final Property p = new dzca(RectF.class);
    private static final Property q = new dzcb(Integer.class);
    private boolean A;
    private boolean B;
    private int C;
    private final Paint D;
    private final Paint E;
    private final Paint F;
    private final RectF G;
    private final ObjectAnimator H;
    private final ObjectAnimator I;
    private final int J;
    private final eejp K;
    private final Paint L;
    private final int M;
    private final boolean N;
    private final boolean O;
    private final lda P;
    private OverScrollControlledNestedScrollView Q;
    private View R;
    private boolean S;
    private Configuration T;
    private boolean U;
    private boolean V;
    private boolean W;
    public final Rect a;
    private int aa;
    private int ab;
    private int ac;
    private int ad;
    private int ae;
    private int af;
    public final float b;
    public final RectF c;
    public View d;
    public final eesc e;
    public final float f;
    public float g;
    public View h;
    public int i;
    public Runnable j;
    public Window k;
    public int l;
    private final ldm r;
    private final Rect s;
    private final int t;
    private final int u;
    private final int v;
    private final int w;
    private final int x;
    private final int y;
    private float z;

    public ExpandableDialogView(Context context, AttributeSet attributeSet) throws Resources.NotFoundException {
        super(context, attributeSet);
        this.r = new ldm();
        this.s = new Rect();
        this.a = new Rect();
        Paint paint = new Paint(1);
        this.D = paint;
        Paint paint2 = new Paint(1);
        this.E = paint2;
        Paint paint3 = new Paint(1);
        this.F = paint3;
        this.G = new RectF();
        RectF rectF = new RectF();
        this.c = rectF;
        Paint paint4 = new Paint(1);
        this.L = paint4;
        this.t = getResources().getDimensionPixelSize(R.dimen.og_dialog_margin_horizontal);
        this.v = getResources().getDimensionPixelSize(R.dimen.og_dialog_tablet_margin_bottom);
        this.w = getResources().getDimensionPixelSize(R.dimen.og_dialog_tablet_width);
        this.x = getResources().getDimensionPixelSize(R.dimen.og_dialog_tablet_max_height);
        this.y = getResources().getDimensionPixelSize(R.dimen.og_dialog_tablet_min_scroll);
        float fA = dypw.a(getContext(), R.attr.ogDialogCornerRadius);
        this.b = fA;
        this.f = dypw.a(getContext(), R.attr.ogDialogHeaderElevation);
        setWillNotDraw(false);
        paint4.setStyle(Paint.Style.FILL);
        int iA = eejq.a(R.dimen.m3_sys_elevation_level2, getContext());
        this.J = iA;
        int i = dypw.e(context, R.attr.elevationOverlayEnabled).data;
        this.K = new eejp(i != 0, eehg.c(context, R.attr.elevationOverlayColor, 0), eehg.c(context, R.attr.elevationOverlayAccentColor, 0), iA, context.getResources().getDisplayMetrics().density);
        int iB = dypw.b(getContext(), R.attr.ogLightGrey);
        this.M = iB;
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, dzdc.a, 0, 0);
        try {
            this.N = typedArrayObtainStyledAttributes.getBoolean(2, false);
            this.O = typedArrayObtainStyledAttributes.getBoolean(0, false);
            this.u = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, getResources().getDimensionPixelSize(R.dimen.og_dialog_default_margin_top));
            typedArrayObtainStyledAttributes.recycle();
            paint3.setColor(iA);
            paint.setColor(kzb.h(iA, Math.round(204.0f)));
            paint2.setColor(iB);
            ObjectAnimator objectAnimatorOfInt = ObjectAnimator.ofInt(this, (Property<ExpandableDialogView, Integer>) o, 0);
            this.I = objectAnimatorOfInt;
            objectAnimatorOfInt.setDuration(150L);
            objectAnimatorOfInt.setInterpolator(new lud());
            objectAnimatorOfInt.addListener(new dzbv(this));
            eesc eescVarF = eesc.F(getContext());
            this.e = eescVarF;
            eescVarF.P(ColorStateList.valueOf(iA));
            eesh eeshVar = new eesh();
            eeshVar.j(fA);
            eeshVar.k(fA);
            eescVarF.fx(new eesj(eeshVar));
            ObjectAnimator objectAnimatorOfObject = ObjectAnimator.ofObject(this, (Property<ExpandableDialogView, V>) p, new dzdd(new RectF()), rectF);
            this.H = objectAnimatorOfObject;
            objectAnimatorOfObject.setDuration(300L);
            objectAnimatorOfObject.setInterpolator(new lud());
            objectAnimatorOfObject.addListener(new dzbw(this));
            setClipToOutline(true);
            setOutlineProvider(new dzbx(this));
            setClipChildren(false);
            q(getResources().getConfiguration());
            lda ldaVar = new lda(getContext(), new dzby(this));
            this.P = ldaVar;
            ldaVar.a(false);
            this.l = 1;
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    private final void o(int i) {
        int i2;
        Rect rect = this.a;
        int iHeight = rect.height();
        int iRound = Math.round(this.t * (1.0f - a()));
        if (this.U && i > (i2 = this.w)) {
            int i3 = this.C;
            Rect rect2 = this.s;
            rect.top = i3 + rect2.top;
            int i4 = this.l;
            int i5 = i4 - 1;
            if (i4 == 0) {
                throw null;
            }
            if (i5 == 0) {
                rect.left = ((((i - rect2.left) - rect2.right) - i2) / 2) + rect2.left;
            }
            rect.right = rect.left + i2;
            rect.bottom = rect.top + iHeight;
            this.G.set(rect);
            return;
        }
        Rect rect3 = this.s;
        rect.top = rect3.top + (m() ? 0 : this.C - this.i);
        rect.left = rect3.left + iRound;
        rect.right = (i - rect3.right) - iRound;
        if (this.A || v()) {
            rect.bottom = rect.top + iHeight;
        } else if (this.i <= 0) {
            rect.bottom = rect.top + this.d.getMeasuredHeight() + this.ab;
        } else {
            rect.bottom = rect3.top + this.C + this.d.getMeasuredHeight() + this.ab + Math.round((this.aa - r1) * a());
        }
        if (m()) {
            this.G.set(0.0f, 0.0f, i, this.aa);
        } else {
            this.G.set(rect.left, rect.top - (n.getInterpolation(Math.max(0.0f, (a() - 0.6f) / 0.39999998f)) * rect3.top), rect.right, rect.bottom);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void p(float f) {
        this.R.setTranslationY(f);
    }

    private final void q(Configuration configuration) {
        this.U = configuration.smallestScreenWidthDp >= 600;
        this.V = configuration.orientation == 2;
        this.W = dyrb.a(getContext());
        requestLayout();
    }

    private final void r(float f) {
        this.z = f;
        s();
    }

    private final void s() {
        OverScrollControlledNestedScrollView overScrollControlledNestedScrollView = this.Q;
        if (overScrollControlledNestedScrollView != null) {
            boolean z = true;
            if (!m() && !this.U) {
                z = false;
            }
            overScrollControlledNestedScrollView.h = z;
        }
    }

    private final boolean u() {
        int i = this.i;
        return i < -290 || i <= this.ae;
    }

    private final boolean v() {
        return (this.V || this.W) && !this.U;
    }

    public final float a() {
        if (this.U) {
            return 0.0f;
        }
        if (v()) {
            return 1.0f;
        }
        return this.z;
    }

    @Override // defpackage.dyyh
    public final void b(dyyb dyybVar) {
        dyybVar.b(findViewById(R.id.og_container_header), 93522);
        dyybVar.b(findViewById(R.id.og_header_close_button), 93521);
        View view = this.h;
        view.getClass();
        dyybVar.b(view, 90573);
    }

    public final int c(float f) {
        return this.K.b(this.J, f + eemo.b(this));
    }

    @Override // defpackage.ldk
    public final void d(View view, int i, int i2, int[] iArr, int i3) {
        int i4;
        int i5;
        if (i2 <= 0 || (i4 = this.i) >= (i5 = this.C)) {
            return;
        }
        if (!this.A && !this.B) {
            i5 = 0;
        }
        int iMin = Math.min(i2, i5 - i4);
        iArr[1] = iMin;
        i(this.i + iMin);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void dispatchDraw(Canvas canvas) {
        Rect rect = this.a;
        int iSave = canvas.save();
        canvas.clipRect(rect.left, rect.top, rect.right, this.c.bottom);
        super.dispatchDraw(canvas);
        canvas.restoreToCount(iSave);
    }

    @Override // defpackage.ldl
    public final void f(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        if (i4 < 0) {
            if (i5 == 0 || this.i < this.C) {
                int iMax = Math.max(i4 + this.i, this.ae);
                iArr[1] = iMax - this.i;
                i(iMax);
            }
        }
    }

    @Override // android.view.View
    protected final boolean fitSystemWindows(Rect rect) {
        this.s.set(rect);
        return true;
    }

    @Override // defpackage.ldk
    public final void g(View view, View view2, int i, int i2) {
        this.r.b(i, i2);
    }

    @Override // defpackage.dyyh
    public final void gW(dyyb dyybVar) {
        dyybVar.e(findViewById(R.id.og_header_close_button));
        dyybVar.e(findViewById(R.id.og_container_header));
        View view = this.h;
        view.getClass();
        dyybVar.e(view);
    }

    @Override // android.view.ViewGroup
    public final int getNestedScrollAxes() {
        return this.r.a();
    }

    @Override // defpackage.ldk
    public final void h(View view, int i) {
        this.r.c(i);
        if (i == 1) {
            this.S = false;
        }
        if (this.S || m()) {
            return;
        }
        if (!u()) {
            if (this.i >= 145) {
                this.I.setIntValues(this.C);
            } else {
                this.I.setIntValues(0);
            }
            this.I.start();
            return;
        }
        ObjectAnimator objectAnimator = this.I;
        objectAnimator.setIntValues(this.ad);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setDuration(50L);
        animatorSet.setInterpolator(new AccelerateInterpolator());
        if (this.k != null) {
            int color = getContext().getColor(R.color.google_scrim);
            animatorSet.playTogether(objectAnimator, ObjectAnimator.ofObject(this.k.getDecorView(), (Property<View, V>) q, new eecf(), Integer.valueOf(color), Integer.valueOf(kzb.h(color, 0))));
        } else {
            animatorSet.playTogether(objectAnimator);
        }
        animatorSet.start();
    }

    public final void i(int i) {
        Runnable runnable;
        if (this.i == i) {
            return;
        }
        r(Math.max(0.0f, i / this.C));
        this.Q.offsetTopAndBottom(this.i - i);
        this.i = i;
        this.H.cancel();
        o(getWidth());
        if (!this.A) {
            j(this.G);
        }
        this.c.set(this.G);
        k();
        invalidate();
        invalidateOutline();
        View view = this.d;
        Rect rect = this.a;
        view.measure(View.MeasureSpec.makeMeasureSpec(rect.width(), 1073741824), View.MeasureSpec.makeMeasureSpec(getHeight(), Integer.MIN_VALUE));
        this.d.layout(rect.left, rect.top, rect.right, rect.top + this.d.getMeasuredHeight());
        if (!this.N) {
            this.Q.layout(rect.left, this.d.getBottom(), rect.right, rect.bottom);
        }
        if (i > this.ad || (runnable = this.j) == null) {
            return;
        }
        runnable.run();
    }

    public final void j(RectF rectF) {
        this.c.set(rectF);
        p((rectF.bottom - this.Q.getTop()) - this.ac);
        k();
        invalidate();
        invalidateOutline();
    }

    public final void k() {
        Window window;
        Rect rect = this.s;
        RectF rectF = this.c;
        boolean zL = l();
        dyrg.b(this, rectF.top < ((float) rect.top) / 2.0f, !zL);
        float f = rectF.bottom;
        int height = getHeight() - rect.bottom;
        Window window2 = this.k;
        boolean z = f >= ((float) height);
        if (window2 != null) {
            if (this.V || !z) {
                window2.setNavigationBarColor(0);
            } else {
                window2.setNavigationBarColor(this.af);
            }
        }
        if (!this.V || this.U) {
            if (!z) {
                setSystemUiVisibility(getSystemUiVisibility() & (-17));
            } else if (Build.VERSION.SDK_INT > 26 && Build.VERSION.SDK_INT < 29 && !zL) {
                setSystemUiVisibility(getSystemUiVisibility() | 16);
            }
            if (Build.VERSION.SDK_INT < 28 || (window = this.k) == null) {
                return;
            }
            window.setNavigationBarDividerColor(z ? this.M : 0);
        }
    }

    public final boolean l() {
        Configuration configuration = this.T;
        return configuration != null && (configuration.uiMode & 48) == 32;
    }

    final boolean m() {
        return a() == 1.0f;
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        this.s.set(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
        return windowInsets.consumeSystemWindowInsets();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        post(new Runnable() { // from class: dzbu
            @Override // java.lang.Runnable
            public final void run() {
                ExpandableDialogView expandableDialogView = this.a;
                expandableDialogView.setSystemUiVisibility(expandableDialogView.getSystemUiVisibility() & (-17));
                if (!expandableDialogView.l()) {
                    expandableDialogView.setSystemUiVisibility(expandableDialogView.getSystemUiVisibility() | 16);
                }
                expandableDialogView.k();
            }
        });
        this.af = (this.k == null || Build.VERSION.SDK_INT >= 29) ? 0 : this.k.getNavigationBarColor();
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        q(configuration);
        s();
    }

    @Override // android.view.View
    protected final void onDraw(Canvas canvas) {
        float fA = 1.0f - a();
        float f = this.b;
        RectF rectF = this.c;
        float f2 = f * fA;
        canvas.drawRoundRect(rectF, f2, f2, this.F);
        eesh eeshVar = new eesh();
        eeshVar.j(f2);
        eeshVar.k(f2);
        this.e.fx(new eesj(eeshVar));
        if (m()) {
            View view = this.d;
            int[] iArr = ley.a;
            float fA2 = len.a(view);
            Paint paint = this.L;
            paint.setColor(c(fA2));
            Rect rect = this.s;
            canvas.drawRect(rect.left, -rect.top, rectF.right - rect.right, this.d.getTop(), paint);
        }
    }

    @Override // android.view.View
    public final void onDrawForeground(Canvas canvas) {
        float fA = 1.0f - a();
        canvas.save();
        Rect rect = this.s;
        canvas.clipRect(0, getHeight() - rect.bottom, getWidth(), getHeight());
        RectF rectF = this.c;
        Paint paint = this.D;
        float f = this.b * fA;
        canvas.drawRoundRect(rectF, f, f, paint);
        int height = getHeight() - rect.bottom;
        float width = getWidth();
        float height2 = (getHeight() - rect.bottom) + 1;
        Paint paint2 = this.E;
        canvas.drawRect(0.0f, height, width, height2, paint2);
        canvas.restore();
        if (m()) {
            if (rect.left > 0) {
                canvas.drawRect(rect.left - 1, 0.0f, rect.left, getHeight(), paint2);
            }
            if (rect.right > 0) {
                canvas.drawRect(getWidth() - rect.right, 0.0f, (getWidth() - rect.right) + 1, getHeight(), paint2);
            }
        }
    }

    @Override // android.view.View
    protected final void onFinishInflate() {
        super.onFinishInflate();
        View childAt = getChildAt(0);
        this.d = childAt;
        int[] iArr = ley.a;
        childAt.setBackground(this.e);
        this.d.setOutlineProvider(null);
        this.Q = (OverScrollControlledNestedScrollView) findViewById(R.id.og_container_scroll_view);
        this.R = findViewById(R.id.og_container_footer);
        this.h = findViewById(R.id.og_dialog_scrim_ve);
        findViewById(R.id.og_container_disable_content_view).setBackgroundColor(this.J);
        if (Build.VERSION.SDK_INT <= 26) {
            this.Q.findViewById(R.id.og_container_scroll_root).setFocusableInTouchMode(true);
        }
        s();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        Rect rect = this.a;
        this.d.layout(rect.left, rect.top, rect.right, rect.top + this.d.getMeasuredHeight());
        int i5 = (this.U || !this.N) ? rect.left : this.s.left;
        this.Q.layout(i5, this.d.getBottom(), this.Q.getMeasuredWidth() + i5, rect.bottom);
        if (this.i == 0) {
            this.Q.setScrollY(0);
        }
        k();
        if (!getResources().getConfiguration().equals(this.T)) {
            this.T = getResources().getConfiguration();
            this.c.set(this.G);
            invalidateOutline();
            return;
        }
        RectF rectF = this.c;
        RectF rectF2 = this.G;
        if (rectF.equals(rectF2)) {
            return;
        }
        ObjectAnimator objectAnimator = this.H;
        objectAnimator.setObjectValues(rectF2);
        objectAnimator.start();
    }

    @Override // android.view.View
    protected final void onMeasure(int i, int i2) {
        int iMin;
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        setMeasuredDimension(size, size2);
        o(size);
        Rect rect = this.s;
        int i3 = (size2 - rect.top) - rect.bottom;
        Rect rect2 = this.a;
        this.d.measure(View.MeasureSpec.makeMeasureSpec(rect2.width(), 1073741824), View.MeasureSpec.makeMeasureSpec(i3, Integer.MIN_VALUE));
        int measuredHeight = this.d.getMeasuredHeight();
        int iWidth = (this.U || !this.N) ? rect2.width() : (size - rect.left) - rect.right;
        int i4 = i3 - measuredHeight;
        boolean z = this.U;
        int i5 = z ? (i4 - this.u) - this.v : i4 - this.u;
        int i6 = z ? this.y : 0;
        this.aa = size2 - rect.bottom;
        this.Q.findViewById(R.id.og_container_scroll_root).setMinimumHeight(0);
        this.Q.measure(View.MeasureSpec.makeMeasureSpec(iWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(i4, Integer.MIN_VALUE));
        this.ab = this.Q.getMeasuredHeight();
        boolean z2 = this.Q.getMeasuredHeight() - i5 >= i6;
        this.A = z2;
        if (m() || (!this.U && z2 && this.Q.getMeasuredHeight() < i4)) {
            this.Q.findViewById(R.id.og_container_scroll_root).setMinimumHeight(i4);
            this.Q.measure(View.MeasureSpec.makeMeasureSpec(iWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(i4, 1073741824));
        }
        if (m() || this.A) {
            iMin = this.U ? Math.min(this.x - measuredHeight, i5) : i4;
        } else {
            iMin = this.Q.getMeasuredHeight();
            r(0.0f);
        }
        if (!this.O || m() || this.U) {
            this.C = this.u;
        } else {
            this.C = Math.max(this.u, (i4 - iMin) / 2);
        }
        int i7 = -size2;
        this.ad = rect.top + i7 + this.C;
        this.ae = (i7 / 2) + rect.top + this.C;
        rect2.bottom = rect2.top + iMin + measuredHeight;
        this.G.bottom = m() ? this.aa : rect2.bottom;
        this.ac = this.Q.findViewById(R.id.og_container_scroll_root).getMeasuredHeight();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f, float f2, boolean z) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f, float f2) {
        return this.i < this.C;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i) {
        this.r.d(i);
    }

    @Override // android.view.View
    protected final void onRestoreInstanceState(Parcelable parcelable) {
        dzcc dzccVar = (dzcc) parcelable;
        super.onRestoreInstanceState(dzccVar.a());
        r(true != dzccVar.b() ? 0.0f : 1.0f);
        this.i = Math.round(this.z * this.u);
    }

    @Override // android.view.View
    protected final Parcelable onSaveInstanceState() {
        float f = this.z;
        Parcelable parcelableOnSaveInstanceState = super.onSaveInstanceState();
        if (parcelableOnSaveInstanceState != null) {
            return new dzbq(f == 1.0f, parcelableOnSaveInstanceState);
        }
        throw new NullPointerException("Null parentState");
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        this.r.e();
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return this.P.b(motionEvent);
    }

    @Override // defpackage.ldk
    public final boolean t(View view, View view2, int i, int i2) {
        if (u()) {
            return false;
        }
        this.I.cancel();
        if (this.U || v()) {
            return false;
        }
        if (i2 == 1) {
            this.S = true;
        }
        this.B = m();
        return true;
    }

    @Override // defpackage.ldk
    public final void e(View view, int i, int i2, int i3, int i4, int i5) {
    }
}
