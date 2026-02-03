package android.support.v7.widget;

import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.OverScroller;
import androidx.car.app.model.Alert;
import com.google.android.apps.messaging.R;
import defpackage.ks;
import defpackage.kzc;
import defpackage.ldk;
import defpackage.ldl;
import defpackage.ldm;
import defpackage.lel;
import defpackage.len;
import defpackage.ley;
import defpackage.lgc;
import defpackage.lgd;
import defpackage.lge;
import defpackage.lgf;
import defpackage.lgg;
import defpackage.lgh;
import defpackage.lgp;
import defpackage.lgt;
import defpackage.nk;
import defpackage.oo;
import defpackage.pd;
import defpackage.pe;
import defpackage.pf;
import defpackage.pg;
import defpackage.ph;
import defpackage.pi;
import defpackage.ss;
import defpackage.st;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ActionBarOverlayLayout extends ViewGroup implements ss, ldk, ldl {
    static final int[] a;
    private static final lgt k;
    private static final Rect l;
    private lgt A;
    private lgt B;
    private lgt C;
    private OverScroller D;
    private final Runnable E;
    private final Runnable F;
    private final ldm G;
    private final pi H;
    public int b;
    public ActionBarContainer c;
    public boolean d;
    public boolean e;
    public boolean f;
    public int g;
    public pg h;
    public ViewPropertyAnimator i;
    public final AnimatorListenerAdapter j;
    private int m;
    private ContentFrameLayout n;
    private st o;
    private Drawable p;
    private boolean q;
    private int r;
    private final Rect s;
    private final Rect t;
    private final Rect u;
    private final Rect v;
    private final Rect w;
    private boolean x;
    private boolean y;
    private lgt z;

    static {
        new Rect();
        a = new int[]{R.attr.actionBarSize, android.R.attr.windowContentOverlay};
        lgh lggVar = Build.VERSION.SDK_INT >= 34 ? new lgg() : Build.VERSION.SDK_INT >= 31 ? new lgf() : Build.VERSION.SDK_INT >= 30 ? new lge() : Build.VERSION.SDK_INT >= 29 ? new lgd() : new lgc();
        lggVar.c(kzc.d(0, 1, 0, 1));
        k = lggVar.a();
        l = new Rect();
    }

    public ActionBarOverlayLayout(Context context) {
        this(context, null);
    }

    private final void v(Context context) {
        TypedArray typedArrayObtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(a);
        this.m = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(1);
        this.p = drawable;
        setWillNotDraw(drawable == null);
        typedArrayObtainStyledAttributes.recycle();
        this.D = new OverScroller(context);
    }

    private static final boolean w(View view, int i, int i2, int i3, int i4) {
        boolean z;
        ph phVar = (ph) view.getLayoutParams();
        if (phVar.leftMargin != i) {
            phVar.leftMargin = i;
            z = true;
        } else {
            z = false;
        }
        if (phVar.topMargin != i2) {
            phVar.topMargin = i2;
            z = true;
        }
        if (phVar.rightMargin != i3) {
            phVar.rightMargin = i3;
            z = true;
        }
        if (phVar.bottomMargin == i4) {
            return z;
        }
        phVar.bottomMargin = i4;
        return true;
    }

    @Override // defpackage.ss
    public final void a() {
        i();
        this.o.g();
    }

    public final void b() {
        removeCallbacks(this.E);
        removeCallbacks(this.F);
        ViewPropertyAnimator viewPropertyAnimator = this.i;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    @Override // defpackage.ss
    public final void c(int i) {
        i();
        if (i == 2) {
            this.o.i();
        } else if (i == 5) {
            this.o.h();
        } else {
            if (i != 109) {
                return;
            }
            this.d = true;
        }
    }

    @Override // android.view.ViewGroup
    protected final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ph;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.p != null) {
            int bottom = this.c.getVisibility() == 0 ? (int) (this.c.getBottom() + this.c.getTranslationY() + 0.5f) : 0;
            this.p.setBounds(0, bottom, getWidth(), this.p.getIntrinsicHeight() + bottom);
            this.p.draw(canvas);
        }
    }

    @Override // defpackage.ldk
    public final void e(View view, int i, int i2, int i3, int i4, int i5) {
        if (i5 == 0) {
            onNestedScroll(view, i, i2, i3, i4);
        }
    }

    @Override // defpackage.ldl
    public final void f(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        e(view, i, i2, i3, i4, i5);
    }

    @Override // defpackage.ldk
    public final void g(View view, View view2, int i, int i2) {
        if (i2 == 0) {
            onNestedScrollAccepted(view, view2, i);
        }
    }

    @Override // android.view.ViewGroup
    protected final /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ph();
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ph(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    public final int getNestedScrollAxes() {
        return this.G.a();
    }

    @Override // defpackage.ldk
    public final void h(View view, int i) {
        if (i == 0) {
            onStopNestedScroll(view);
        }
    }

    final void i() {
        st stVarG;
        if (this.n == null) {
            this.n = (ContentFrameLayout) findViewById(R.id.action_bar_activity_content);
            this.c = (ActionBarContainer) findViewById(R.id.action_bar_container);
            KeyEvent.Callback callbackFindViewById = findViewById(R.id.action_bar);
            if (callbackFindViewById instanceof st) {
                stVarG = (st) callbackFindViewById;
            } else {
                if (!(callbackFindViewById instanceof Toolbar)) {
                    throw new IllegalStateException("Can't make a decor toolbar out of ".concat(String.valueOf(callbackFindViewById.getClass().getSimpleName())));
                }
                stVarG = ((Toolbar) callbackFindViewById).g();
            }
            this.o = stVarG;
        }
    }

    public final void j(int i) {
        b();
        this.c.setTranslationY(-Math.max(0, Math.min(i, this.c.getHeight())));
    }

    public final void k(boolean z) {
        if (z != this.q) {
            this.q = z;
            if (z) {
                return;
            }
            b();
            j(0);
        }
    }

    @Override // defpackage.ss
    public final void l(Menu menu, oo ooVar) {
        i();
        this.o.m(menu, ooVar);
    }

    @Override // defpackage.ss
    public final void m() {
        i();
        this.o.n();
    }

    @Override // defpackage.ss
    public final void n(Window.Callback callback) {
        i();
        this.o.v(callback);
    }

    @Override // defpackage.ss
    public final void o(CharSequence charSequence) {
        i();
        this.o.w(charSequence);
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        boolean zW;
        i();
        int windowSystemUiVisibility = getWindowSystemUiVisibility();
        int i = windowSystemUiVisibility & 256;
        int i2 = windowSystemUiVisibility & 1536;
        lgt lgtVar = k;
        int[] iArr = ley.a;
        pi piVar = this.H;
        Rect rect = this.w;
        len.e(piVar, lgtVar, rect);
        boolean zEquals = rect.equals(l);
        this.x = !zEquals;
        boolean z = true;
        boolean z2 = i != 0;
        boolean z3 = zEquals || (z2 && i2 != 0);
        this.y = z3;
        pg pgVar = this.h;
        if (pgVar != null) {
            ((ks) pgVar).k = (z2 || z3) ? false : true;
        }
        lgt lgtVarP = lgt.p(windowInsets, this);
        lgp lgpVar = lgtVarP.b;
        Rect rect2 = this.v;
        kzc kzcVarD = lgpVar.d();
        int i3 = kzcVarD.b;
        int i4 = kzcVarD.c;
        int i5 = kzcVarD.d;
        rect2.set(i3, i4, i5, kzcVarD.e);
        if (this.y) {
            kzc kzcVarF = lgtVarP.f(2);
            int i6 = kzcVarF.b;
            int i7 = kzcVarF.d;
            this.c.setPadding(i3 - i6, i4, i5 - i7, 0);
            zW = w(this.c, i6, 0, i7, 0);
        } else {
            this.c.setPadding(0, 0, 0, 0);
            zW = w(this.c, i3, i4, i5, 0);
        }
        Rect rect3 = this.s;
        len.e(this, lgtVarP, rect3);
        lgt lgtVarN = lgtVarP.n(rect3.left, rect3.top, rect3.right, rect3.bottom);
        this.z = lgtVarN;
        if (this.A.equals(lgtVarN)) {
            z = zW;
        } else {
            this.A = this.z;
        }
        Rect rect4 = this.t;
        if (rect4.equals(rect3)) {
            if (z) {
            }
            return lgtVarP.k().m().l().e();
        }
        rect4.set(rect3);
        requestLayout();
        return lgtVarP.k().m().l().e();
    }

    @Override // android.view.View
    protected final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        v(getContext());
        int[] iArr = ley.a;
        lel.c(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        b();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                ph phVar = (ph) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i6 = phVar.leftMargin + paddingLeft;
                int i7 = phVar.topMargin + paddingTop;
                childAt.layout(i6, i7, measuredWidth + i6, measuredHeight + i7);
            }
        }
    }

    @Override // android.view.View
    protected final void onMeasure(int i, int i2) {
        int measuredHeight;
        i();
        measureChildWithMargins(this.c, i, 0, i2, 0);
        ph phVar = (ph) this.c.getLayoutParams();
        int iMax = Math.max(0, this.c.getMeasuredWidth() + phVar.leftMargin + phVar.rightMargin);
        int iMax2 = Math.max(0, this.c.getMeasuredHeight() + phVar.topMargin + phVar.bottomMargin);
        int iCombineMeasuredStates = View.combineMeasuredStates(0, this.c.getMeasuredState());
        int[] iArr = ley.a;
        boolean z = (getWindowSystemUiVisibility() & 256) != 0;
        if (z) {
            measuredHeight = this.m;
            if (this.y) {
                measuredHeight += this.v.top;
            }
        } else {
            measuredHeight = this.c.getVisibility() != 8 ? this.c.getMeasuredHeight() : 0;
        }
        Rect rect = this.u;
        rect.set(this.s);
        lgt lgtVar = this.z;
        this.B = lgtVar;
        if (this.d || z || !this.x) {
            kzc kzcVarD = this.y ? kzc.d(lgtVar.b(), Math.max(this.B.d(), measuredHeight), this.B.c(), Math.max(this.B.a(), 0)) : kzc.d(lgtVar.b(), this.B.d() + measuredHeight, this.B.c(), this.B.a());
            lgt lgtVar2 = this.B;
            lgh lggVar = Build.VERSION.SDK_INT >= 34 ? new lgg(lgtVar2) : Build.VERSION.SDK_INT >= 31 ? new lgf(lgtVar2) : Build.VERSION.SDK_INT >= 30 ? new lge(lgtVar2) : Build.VERSION.SDK_INT >= 29 ? new lgd(lgtVar2) : new lgc(lgtVar2);
            lggVar.c(kzcVarD);
            this.B = lggVar.a();
        } else {
            if (this.y) {
                rect.top = Math.max(rect.top, measuredHeight);
                rect.bottom = Math.max(rect.bottom, 0);
            } else {
                rect.top += measuredHeight;
                rect.bottom = rect.bottom;
            }
            this.B = this.B.n(0, measuredHeight, 0, 0);
        }
        w(this.n, rect.left, rect.top, rect.right, rect.bottom);
        if (!this.C.equals(this.B)) {
            lgt lgtVar3 = this.B;
            this.C = lgtVar3;
            ley.f(this.n, lgtVar3);
        }
        measureChildWithMargins(this.n, i, 0, i2, 0);
        ph phVar2 = (ph) this.n.getLayoutParams();
        int iMax3 = Math.max(iMax, this.n.getMeasuredWidth() + phVar2.leftMargin + phVar2.rightMargin);
        int iMax4 = Math.max(iMax2, this.n.getMeasuredHeight() + phVar2.topMargin + phVar2.bottomMargin);
        int iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates, this.n.getMeasuredState());
        setMeasuredDimension(View.resolveSizeAndState(Math.max(iMax3 + getPaddingLeft() + getPaddingRight(), getSuggestedMinimumWidth()), i, iCombineMeasuredStates2), View.resolveSizeAndState(Math.max(iMax4 + getPaddingTop() + getPaddingBottom(), getSuggestedMinimumHeight()), i2, iCombineMeasuredStates2 << 16));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f, float f2, boolean z) {
        if (!this.q || !z) {
            return false;
        }
        this.D.fling(0, 0, 0, (int) f2, 0, 0, Integer.MIN_VALUE, Alert.DURATION_SHOW_INDEFINITELY);
        if (this.D.getFinalY() > this.c.getHeight()) {
            b();
            this.F.run();
        } else {
            b();
            this.E.run();
        }
        this.f = true;
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f, float f2) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        int i5 = this.r + i2;
        this.r = i5;
        j(i5);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i) {
        ks ksVar;
        nk nkVar;
        this.G.d(i);
        ActionBarContainer actionBarContainer = this.c;
        this.r = actionBarContainer != null ? -((int) actionBarContainer.getTranslationY()) : 0;
        b();
        pg pgVar = this.h;
        if (pgVar == null || (nkVar = (ksVar = (ks) pgVar).n) == null) {
            return;
        }
        nkVar.a();
        ksVar.n = null;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i) {
        if ((i & 2) == 0 || this.c.getVisibility() != 0) {
            return false;
        }
        return this.q;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        if (!this.q || this.f) {
            return;
        }
        if (this.r <= this.c.getHeight()) {
            b();
            postDelayed(this.E, 600L);
        } else {
            b();
            postDelayed(this.F, 600L);
        }
    }

    @Override // android.view.View
    @Deprecated
    public final void onWindowSystemUiVisibilityChanged(int i) {
        super.onWindowSystemUiVisibilityChanged(i);
        i();
        int i2 = this.g ^ i;
        this.g = i;
        pg pgVar = this.h;
        if (pgVar != null) {
            boolean z = (i & 256) != 0;
            int i3 = i & 4;
            ks ksVar = (ks) pgVar;
            ksVar.k = (z || this.y) ? false : true;
            if (i3 == 0 || !z) {
                if (ksVar.m) {
                    ksVar.m = false;
                    ksVar.c(true);
                }
            } else if (!ksVar.m) {
                ksVar.m = true;
                ksVar.c(true);
            }
        }
        if ((i2 & 256) == 0 || this.h == null) {
            return;
        }
        int[] iArr = ley.a;
        lel.c(this);
    }

    @Override // android.view.View
    protected final void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        this.b = i;
        pg pgVar = this.h;
        if (pgVar != null) {
            ((ks) pgVar).j = i;
        }
    }

    @Override // defpackage.ss
    public final boolean p() {
        i();
        return this.o.x();
    }

    @Override // defpackage.ss
    public final boolean q() {
        i();
        return this.o.z();
    }

    @Override // defpackage.ss
    public final boolean r() {
        i();
        return this.o.A();
    }

    @Override // defpackage.ss
    public final boolean s() {
        i();
        return this.o.B();
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // defpackage.ldk
    public final boolean t(View view, View view2, int i, int i2) {
        return i2 == 0 && onStartNestedScroll(view, view2, i);
    }

    @Override // defpackage.ss
    public final boolean u() {
        i();
        return this.o.C();
    }

    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = 0;
        this.s = new Rect();
        this.t = new Rect();
        this.u = new Rect();
        this.v = new Rect();
        this.w = new Rect();
        this.x = true;
        this.y = false;
        new Rect();
        new Rect();
        new Rect();
        new Rect();
        lgt lgtVar = lgt.a;
        this.z = lgtVar;
        this.A = lgtVar;
        this.B = lgtVar;
        this.C = lgtVar;
        this.j = new pd(this);
        this.E = new pe(this);
        this.F = new pf(this);
        v(context);
        this.G = new ldm();
        pi piVar = new pi(context);
        this.H = piVar;
        addView(piVar);
    }

    @Override // android.view.ViewGroup
    protected final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new ph(layoutParams);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
    }

    @Override // defpackage.ldk
    public final void d(View view, int i, int i2, int[] iArr, int i3) {
    }
}
