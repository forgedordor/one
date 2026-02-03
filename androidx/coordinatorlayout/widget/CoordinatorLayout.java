package androidx.coordinatorlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.messaging.R;
import defpackage.a;
import defpackage.cvw;
import defpackage.ktv;
import defpackage.ktw;
import defpackage.ktx;
import defpackage.kty;
import defpackage.ktz;
import defpackage.kua;
import defpackage.kub;
import defpackage.kuc;
import defpackage.kue;
import defpackage.kuf;
import defpackage.kug;
import defpackage.kuh;
import defpackage.lcd;
import defpackage.lcf;
import defpackage.ldk;
import defpackage.ldl;
import defpackage.ldm;
import defpackage.ldn;
import defpackage.lel;
import defpackage.len;
import defpackage.ley;
import defpackage.lgt;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public class CoordinatorLayout extends ViewGroup implements ldk, ldl {
    public static final String a;
    public static final Class[] b;
    public static final ThreadLocal c;
    static final Comparator d;
    public static final /* synthetic */ int i = 0;
    private static final lcd j;
    public final kug e;
    public lgt f;
    public boolean g;
    public ViewGroup.OnHierarchyChangeListener h;
    private final List k;
    private final List l;
    private final int[] m;
    private final int[] n;
    private final int[] o;
    private boolean p;
    private boolean q;
    private int[] r;
    private View s;
    private View t;
    private kuc u;
    private boolean v;
    private Drawable w;
    private ldn x;
    private final ldm y;

    static {
        Package r0 = CoordinatorLayout.class.getPackage();
        a = r0 != null ? r0.getName() : null;
        d = new kuf();
        b = new Class[]{Context.class, AttributeSet.class};
        c = new ThreadLocal();
        j = new lcf(12);
    }

    public CoordinatorLayout(Context context) {
        this(context, null);
    }

    private final boolean A(int i2) {
        View view;
        View focusedChild = this;
        while (true) {
            if (focusedChild == null) {
                view = null;
                break;
            }
            if (focusedChild.isFocused()) {
                view = focusedChild;
                break;
            }
            focusedChild = focusedChild instanceof ViewGroup ? ((ViewGroup) focusedChild).getFocusedChild() : null;
        }
        t(this, view, 2, 1);
        int[] iArr = this.o;
        d(view, 0, i2, iArr, 1);
        int i3 = iArr[1];
        iArr[0] = 0;
        iArr[1] = 0;
        f(view, 0, i3, 0, i2, 1, iArr);
        h(view, 1);
        return iArr[1] > 0;
    }

    private final boolean B(kty ktyVar, View view, MotionEvent motionEvent, int i2) {
        return i2 != 0 ? ktyVar.j(this, view, motionEvent) : ktyVar.f(this, view, motionEvent);
    }

    private final boolean C(MotionEvent motionEvent, int i2) {
        int actionMasked = motionEvent.getActionMasked();
        List list = this.l;
        list.clear();
        boolean zIsChildrenDrawingOrderEnabled = isChildrenDrawingOrderEnabled();
        int childCount = getChildCount();
        for (int i3 = childCount - 1; i3 >= 0; i3--) {
            list.add(getChildAt(zIsChildrenDrawingOrderEnabled ? getChildDrawingOrder(childCount, i3) : i3));
        }
        Comparator comparator = d;
        if (comparator != null) {
            Collections.sort(list, comparator);
        }
        int size = list.size();
        MotionEvent motionEventE = null;
        boolean zB = false;
        for (int i4 = 0; i4 < size; i4++) {
            View view = (View) list.get(i4);
            kub kubVar = (kub) view.getLayoutParams();
            kty ktyVar = kubVar.a;
            if (!zB || actionMasked == 0) {
                if (!zB && ktyVar != null && (zB = B(ktyVar, view, motionEvent, i2))) {
                    this.s = view;
                    if (actionMasked != 3 && actionMasked != 1) {
                        for (int i5 = 0; i5 < i4; i5++) {
                            View view2 = (View) list.get(i5);
                            kty ktyVar2 = ((kub) view2.getLayoutParams()).a;
                            if (ktyVar2 != null) {
                                if (motionEventE == null) {
                                    motionEventE = E(motionEvent);
                                }
                                B(ktyVar2, view2, motionEventE, i2);
                            }
                        }
                    }
                }
                if (kubVar.a == null) {
                    kubVar.m = false;
                }
                boolean z = kubVar.m;
            } else if (ktyVar != null) {
                if (motionEventE == null) {
                    motionEventE = E(motionEvent);
                }
                B(ktyVar, view, motionEventE, i2);
            }
        }
        list.clear();
        if (motionEventE != null) {
            motionEventE.recycle();
        }
        return zB;
    }

    private static final void D(int i2, Rect rect, Rect rect2, kub kubVar, int i3, int i4) {
        int i5 = kubVar.c;
        if (i5 == 0) {
            i5 = 17;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(i5, i2);
        int i6 = absoluteGravity & 7;
        int i7 = absoluteGravity & 112;
        int absoluteGravity2 = Gravity.getAbsoluteGravity(s(kubVar.d), i2);
        int i8 = absoluteGravity2 & 7;
        int i9 = absoluteGravity2 & 112;
        int iWidth = i8 != 1 ? i8 != 5 ? rect.left : rect.right : rect.left + (rect.width() / 2);
        int iHeight = i9 != 16 ? i9 != 80 ? rect.top : rect.bottom : rect.top + (rect.height() / 2);
        if (i6 == 1) {
            iWidth -= i3 / 2;
        } else if (i6 != 5) {
            iWidth -= i3;
        }
        if (i7 == 16) {
            iHeight -= i4 / 2;
        } else if (i7 != 80) {
            iHeight -= i4;
        }
        rect2.set(iWidth, iHeight, i3 + iWidth, i4 + iHeight);
    }

    private static final MotionEvent E(MotionEvent motionEvent) {
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        motionEventObtain.setAction(3);
        return motionEventObtain;
    }

    private static final void F(View view, int i2) {
        kub kubVar = (kub) view.getLayoutParams();
        int i3 = kubVar.i;
        if (i3 != i2) {
            int[] iArr = ley.a;
            view.offsetLeftAndRight(i2 - i3);
            kubVar.i = i2;
        }
    }

    private static final void G(View view, int i2) {
        kub kubVar = (kub) view.getLayoutParams();
        int i3 = kubVar.j;
        if (i3 != i2) {
            int[] iArr = ley.a;
            view.offsetTopAndBottom(i2 - i3);
            kubVar.j = i2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static final kub l(View view) {
        kub kubVar = (kub) view.getLayoutParams();
        if (!kubVar.b) {
            if (view instanceof ktx) {
                kty ktyVarA = ((ktx) view).a();
                if (ktyVarA == null) {
                    Log.e("CoordinatorLayout", "Attached behavior class is null");
                }
                kubVar.b(ktyVarA);
                kubVar.b = true;
                return kubVar;
            }
            ktz ktzVar = null;
            for (Class<?> superclass = view.getClass(); superclass != null; superclass = superclass.getSuperclass()) {
                ktzVar = (ktz) superclass.getAnnotation(ktz.class);
                if (ktzVar != null) {
                    break;
                }
            }
            if (ktzVar != null) {
                try {
                    kubVar.b((kty) ktzVar.a().getDeclaredConstructor(null).newInstance(null));
                } catch (Exception e) {
                    Log.e("CoordinatorLayout", "Default behavior class " + ktzVar.a().getName() + " could not be instantiated. Did you forget a default constructor?", e);
                }
            }
            kubVar.b = true;
        }
        return kubVar;
    }

    private final int n() {
        return p() - getHeight();
    }

    private final int o() {
        return -p();
    }

    private final int p() {
        int height = 0;
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            View childAt = getChildAt(i2);
            kub kubVar = (kub) childAt.getLayoutParams();
            height += childAt.getHeight() + kubVar.topMargin + kubVar.bottomMargin;
        }
        return height;
    }

    private final int q(int i2) {
        int[] iArr = this.r;
        if (iArr != null) {
            if (i2 >= 0 && i2 < iArr.length) {
                return iArr[i2];
            }
            Log.e("CoordinatorLayout", a.y(this, i2, "Keyline index ", " out of range for "));
            return 0;
        }
        Log.e("CoordinatorLayout", "No keylines defined for " + this + " - attempted index lookup " + i2);
        return 0;
    }

    private final int r() {
        return (int) (getHeight() * 0.2f);
    }

    private static int s(int i2) {
        if ((i2 & 7) == 0) {
            i2 |= 8388611;
        }
        return (i2 & 112) == 0 ? i2 | 48 : i2;
    }

    private static int u(int i2) {
        if (i2 == 0) {
            return 8388661;
        }
        return i2;
    }

    private static Rect v() {
        Rect rect = (Rect) j.a();
        return rect == null ? new Rect() : rect;
    }

    private final void w(kub kubVar, Rect rect, int i2, int i3) {
        int width = getWidth();
        int height = getHeight();
        int iMax = Math.max(getPaddingLeft() + kubVar.leftMargin, Math.min(rect.left, ((width - getPaddingRight()) - i2) - kubVar.rightMargin));
        int iMax2 = Math.max(getPaddingTop() + kubVar.topMargin, Math.min(rect.top, ((height - getPaddingBottom()) - i3) - kubVar.bottomMargin));
        rect.set(iMax, iMax2, i2 + iMax, i3 + iMax2);
    }

    private static void x(Rect rect) {
        rect.setEmpty();
        j.b(rect);
    }

    private final void y() {
        View view = this.s;
        if (view != null) {
            kty ktyVar = ((kub) view.getLayoutParams()).a;
            if (ktyVar != null) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                ktyVar.j(this, this.s, motionEventObtain);
                motionEventObtain.recycle();
            }
            this.s = null;
        }
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            ((kub) getChildAt(i2).getLayoutParams()).m = false;
        }
        this.p = false;
    }

    private final void z() {
        int[] iArr = ley.a;
        if (!getFitsSystemWindows()) {
            len.k(this, null);
            return;
        }
        if (this.x == null) {
            this.x = new ktw(this);
        }
        len.k(this, this.x);
        setSystemUiVisibility(1280);
    }

    public final List a(View view) {
        cvw cvwVar = this.e.b;
        int i2 = cvwVar.d;
        ArrayList arrayList = null;
        for (int i3 = 0; i3 < i2; i3++) {
            ArrayList arrayList2 = (ArrayList) cvwVar.g(i3);
            if (arrayList2 != null && arrayList2.contains(view)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(cvwVar.d(i3));
            }
        }
        return arrayList == null ? Collections.EMPTY_LIST : arrayList;
    }

    public final void b(View view) {
        ArrayList arrayListA = this.e.a(view);
        if (arrayListA == null || arrayListA.isEmpty()) {
            return;
        }
        for (int i2 = 0; i2 < arrayListA.size(); i2++) {
            View view2 = (View) arrayListA.get(i2);
            kty ktyVar = ((kub) view2.getLayoutParams()).a;
            if (ktyVar != null) {
                ktyVar.l(this, view2, view);
            }
        }
    }

    final void c(View view, boolean z, Rect rect) {
        if (view.isLayoutRequested() || view.getVisibility() == 8) {
            rect.setEmpty();
        } else if (z) {
            kuh.a(this, view, rect);
        } else {
            rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
    }

    @Override // android.view.ViewGroup
    protected final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof kub) && super.checkLayoutParams(layoutParams);
    }

    @Override // defpackage.ldk
    public final void d(View view, int i2, int i3, int[] iArr, int i4) {
        kty ktyVar;
        int childCount = getChildCount();
        boolean z = false;
        int iMax = 0;
        int iMax2 = 0;
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                kub kubVar = (kub) childAt.getLayoutParams();
                if (kubVar.d(i4) && (ktyVar = kubVar.a) != null) {
                    int[] iArr2 = this.m;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    ktyVar.c(this, childAt, view, i2, i3, iArr2, i4);
                    iMax = i2 > 0 ? Math.max(iMax, iArr2[0]) : Math.min(iMax, iArr2[0]);
                    iMax2 = i3 > 0 ? Math.max(iMax2, iArr2[1]) : Math.min(iMax2, iArr2[1]);
                    z = true;
                }
            }
        }
        iArr[0] = iMax;
        iArr[1] = iMax2;
        if (z) {
            i(1);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        boolean zDispatchKeyEvent = super.dispatchKeyEvent(keyEvent);
        if (!zDispatchKeyEvent && keyEvent.getAction() == 0) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode == 19) {
                return keyEvent.isAltPressed() ? A(-getHeight()) : A(-r());
            }
            if (keyCode == 20) {
                return keyEvent.isAltPressed() ? A(getHeight()) : A(r());
            }
            if (keyCode == 62) {
                return keyEvent.isShiftPressed() ? A(o()) : A(n());
            }
            if (keyCode == 92) {
                return A(-getHeight());
            }
            if (keyCode == 93) {
                return A(getHeight());
            }
            if (keyCode == 122) {
                return A(o());
            }
            if (keyCode == 123) {
                return A(n());
            }
        }
        return zDispatchKeyEvent;
    }

    @Override // android.view.ViewGroup
    protected final boolean drawChild(Canvas canvas, View view, long j2) {
        kty ktyVar = ((kub) view.getLayoutParams()).a;
        return super.drawChild(canvas, view, j2);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.w;
        if (drawable != null && drawable.isStateful() && drawable.setState(drawableState)) {
            invalidate();
        }
    }

    @Override // defpackage.ldk
    public final void e(View view, int i2, int i3, int i4, int i5, int i6) {
        f(view, i2, i3, i4, i5, 0, this.n);
    }

    @Override // defpackage.ldl
    public final void f(View view, int i2, int i3, int i4, int i5, int i6, int[] iArr) {
        kty ktyVar;
        int childCount = getChildCount();
        boolean z = false;
        int iMax = 0;
        int iMax2 = 0;
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            if (childAt.getVisibility() != 8) {
                kub kubVar = (kub) childAt.getLayoutParams();
                if (kubVar.d(i6) && (ktyVar = kubVar.a) != null) {
                    int[] iArr2 = this.m;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    ktyVar.d(this, childAt, view, i2, i3, i4, i5, i6, iArr2);
                    iMax = i4 > 0 ? Math.max(iMax, iArr2[0]) : Math.min(iMax, iArr2[0]);
                    iMax2 = i5 > 0 ? Math.max(iMax2, iArr2[1]) : Math.min(iMax2, iArr2[1]);
                    z = true;
                }
            }
        }
        iArr[0] = iArr[0] + iMax;
        iArr[1] = iArr[1] + iMax2;
        if (z) {
            i(1);
        }
    }

    @Override // defpackage.ldk
    public final void g(View view, View view2, int i2, int i3) {
        this.y.b(i2, i3);
        this.t = view2;
        int childCount = getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            kub kubVar = (kub) getChildAt(i4).getLayoutParams();
            if (kubVar.d(i3)) {
                kty ktyVar = kubVar.a;
            }
        }
    }

    @Override // android.view.ViewGroup
    protected final /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new kub(-2, -2);
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new kub(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    public final int getNestedScrollAxes() {
        return this.y.a();
    }

    @Override // android.view.View
    protected final int getSuggestedMinimumHeight() {
        return Math.max(super.getSuggestedMinimumHeight(), getPaddingTop() + getPaddingBottom());
    }

    @Override // android.view.View
    protected final int getSuggestedMinimumWidth() {
        return Math.max(super.getSuggestedMinimumWidth(), getPaddingLeft() + getPaddingRight());
    }

    @Override // defpackage.ldk
    public final void h(View view, int i2) {
        this.y.c(i2);
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            kub kubVar = (kub) childAt.getLayoutParams();
            if (kubVar.d(i2)) {
                kty ktyVar = kubVar.a;
                if (ktyVar != null) {
                    ktyVar.e(this, childAt, view, i2);
                }
                kubVar.c(i2, false);
                kubVar.a();
            }
        }
        this.t = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:140:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00c0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void i(int r22) {
        /*
            Method dump skipped, instructions count: 687
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.i(int):void");
    }

    public final void j(View view, int i2) {
        Rect rectV;
        Rect rectV2;
        kub kubVar = (kub) view.getLayoutParams();
        View view2 = kubVar.k;
        if (view2 == null && kubVar.f != -1) {
            throw new IllegalStateException("An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete.");
        }
        if (view2 != null) {
            rectV = v();
            rectV2 = v();
            try {
                kuh.a(this, view2, rectV);
                kub kubVar2 = (kub) view.getLayoutParams();
                int measuredWidth = view.getMeasuredWidth();
                int measuredHeight = view.getMeasuredHeight();
                D(i2, rectV, rectV2, kubVar2, measuredWidth, measuredHeight);
                w(kubVar2, rectV2, measuredWidth, measuredHeight);
                view.layout(rectV2.left, rectV2.top, rectV2.right, rectV2.bottom);
                return;
            } finally {
                x(rectV);
                x(rectV2);
            }
        }
        int i3 = kubVar.e;
        if (i3 < 0) {
            kub kubVar3 = (kub) view.getLayoutParams();
            rectV = v();
            rectV.set(getPaddingLeft() + kubVar3.leftMargin, getPaddingTop() + kubVar3.topMargin, (getWidth() - getPaddingRight()) - kubVar3.rightMargin, (getHeight() - getPaddingBottom()) - kubVar3.bottomMargin);
            if (this.f != null) {
                int[] iArr = ley.a;
                if (getFitsSystemWindows() && !view.getFitsSystemWindows()) {
                    rectV.left += this.f.b();
                    rectV.top += this.f.d();
                    rectV.right -= this.f.c();
                    rectV.bottom -= this.f.a();
                }
            }
            rectV2 = v();
            Gravity.apply(s(kubVar3.c), view.getMeasuredWidth(), view.getMeasuredHeight(), rectV, rectV2, i2);
            view.layout(rectV2.left, rectV2.top, rectV2.right, rectV2.bottom);
            return;
        }
        kub kubVar4 = (kub) view.getLayoutParams();
        int absoluteGravity = Gravity.getAbsoluteGravity(u(kubVar4.c), i2);
        int i4 = absoluteGravity & 7;
        int i5 = absoluteGravity & 112;
        int width = getWidth();
        int height = getHeight();
        int measuredWidth2 = view.getMeasuredWidth();
        int measuredHeight2 = view.getMeasuredHeight();
        if (i2 == 1) {
            i3 = width - i3;
        }
        int iQ = q(i3) - measuredWidth2;
        if (i4 == 1) {
            iQ += measuredWidth2 / 2;
        } else if (i4 == 5) {
            iQ += measuredWidth2;
        }
        int i6 = i5 != 16 ? i5 != 80 ? 0 : measuredHeight2 : measuredHeight2 / 2;
        int iMax = Math.max(getPaddingLeft() + kubVar4.leftMargin, Math.min(iQ, ((width - getPaddingRight()) - measuredWidth2) - kubVar4.rightMargin));
        int iMax2 = Math.max(getPaddingTop() + kubVar4.topMargin, Math.min(i6, ((height - getPaddingBottom()) - measuredHeight2) - kubVar4.bottomMargin));
        view.layout(iMax, iMax2, measuredWidth2 + iMax, measuredHeight2 + iMax2);
    }

    public final boolean k(View view, int i2, int i3) {
        Rect rectV = v();
        kuh.a(this, view, rectV);
        try {
            return rectV.contains(i2, i3);
        } finally {
            x(rectV);
        }
    }

    public final void m(View view, int i2, int i3, int i4) {
        measureChildWithMargins(view, i2, i3, i4, 0);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        y();
        if (this.v) {
            if (this.u == null) {
                this.u = new kuc(this);
            }
            getViewTreeObserver().addOnPreDrawListener(this.u);
        }
        if (this.f == null) {
            int[] iArr = ley.a;
            if (getFitsSystemWindows()) {
                lel.c(this);
            }
        }
        this.q = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        y();
        if (this.v && this.u != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.u);
        }
        View view = this.t;
        if (view != null) {
            onStopNestedScroll(view);
        }
        this.q = false;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!this.g || this.w == null) {
            return;
        }
        lgt lgtVar = this.f;
        int iD = lgtVar != null ? lgtVar.d() : 0;
        if (iD > 0) {
            this.w.setBounds(0, 0, getWidth(), iD);
            this.w.draw(canvas);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            y();
            actionMasked = 0;
        }
        boolean zC = C(motionEvent, 0);
        if (actionMasked != 1 && actionMasked != 3) {
            return zC;
        }
        this.s = null;
        y();
        return zC;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        kty ktyVar;
        int layoutDirection = getLayoutDirection();
        List list = this.k;
        int size = list.size();
        for (int i6 = 0; i6 < size; i6++) {
            View view = (View) list.get(i6);
            if (view.getVisibility() != 8 && ((ktyVar = ((kub) view.getLayoutParams()).a) == null || !ktyVar.g(this, view, layoutDirection))) {
                j(view, layoutDirection);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:131:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0297  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x02cb  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00bd  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final void onMeasure(int r27, int r28) {
        /*
            Method dump skipped, instructions count: 849
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.onMeasure(int, int):void");
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f, float f2, boolean z) {
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() != 8) {
                kub kubVar = (kub) childAt.getLayoutParams();
                if (kubVar.n) {
                    kty ktyVar = kubVar.a;
                }
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f, float f2) {
        kty ktyVar;
        int childCount = getChildCount();
        boolean zO = false;
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() != 8) {
                kub kubVar = (kub) childAt.getLayoutParams();
                if (kubVar.n && (ktyVar = kubVar.a) != null) {
                    zO |= ktyVar.o(childAt, view, f2);
                }
            }
        }
        return zO;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i2, int i3, int[] iArr) {
        d(view, i2, i3, iArr, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i2, int i3, int i4, int i5) {
        e(view, i2, i3, i4, i5, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i2) {
        g(view, view2, i2, 0);
    }

    @Override // android.view.View
    protected final void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof kue)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        kue kueVar = (kue) parcelable;
        super.onRestoreInstanceState(kueVar.d);
        SparseArray sparseArray = kueVar.a;
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            int id = childAt.getId();
            kty ktyVar = l(childAt).a;
            if (id != -1 && ktyVar != null && (parcelable2 = (Parcelable) sparseArray.get(id)) != null) {
                ktyVar.q(childAt, parcelable2);
            }
        }
    }

    @Override // android.view.View
    protected final Parcelable onSaveInstanceState() {
        Parcelable parcelableR;
        kue kueVar = new kue(super.onSaveInstanceState());
        SparseArray sparseArray = new SparseArray();
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            int id = childAt.getId();
            kty ktyVar = ((kub) childAt.getLayoutParams()).a;
            if (id != -1 && ktyVar != null && (parcelableR = ktyVar.r(childAt)) != null) {
                sparseArray.append(id, parcelableR);
            }
        }
        kueVar.a = sparseArray;
        return kueVar;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i2) {
        return t(view, view2, i2, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        h(view, 0);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean zC;
        int actionMasked = motionEvent.getActionMasked();
        View view = this.s;
        boolean z = false;
        if (view != null) {
            kty ktyVar = ((kub) view.getLayoutParams()).a;
            zC = ktyVar != null ? ktyVar.j(this, this.s, motionEvent) : false;
        } else {
            zC = C(motionEvent, 1);
            if (actionMasked != 0 && zC) {
                z = true;
            }
        }
        if (this.s == null || actionMasked == 3) {
            zC |= super.onTouchEvent(motionEvent);
        } else if (z) {
            MotionEvent motionEventE = E(motionEvent);
            super.onTouchEvent(motionEventE);
            motionEventE.recycle();
        }
        if (actionMasked != 1 && actionMasked != 3) {
            return zC;
        }
        this.s = null;
        y();
        return zC;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        kty ktyVar = ((kub) view.getLayoutParams()).a;
        if (ktyVar == null || !ktyVar.h(this, view, rect, z)) {
            return super.requestChildRectangleOnScreen(view, rect, z);
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        super.requestDisallowInterceptTouchEvent(z);
        if (!z || this.p) {
            return;
        }
        if (this.s == null) {
            int childCount = getChildCount();
            MotionEvent motionEventObtain = null;
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                kty ktyVar = ((kub) childAt.getLayoutParams()).a;
                if (ktyVar != null) {
                    if (motionEventObtain == null) {
                        long jUptimeMillis = SystemClock.uptimeMillis();
                        motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                    }
                    ktyVar.f(this, childAt, motionEventObtain);
                }
            }
            if (motionEventObtain != null) {
                motionEventObtain.recycle();
            }
        }
        y();
        this.p = true;
    }

    @Override // android.view.View
    public final void setFitsSystemWindows(boolean z) {
        super.setFitsSystemWindows(z);
        z();
    }

    @Override // android.view.ViewGroup
    public final void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.h = onHierarchyChangeListener;
    }

    @Override // android.view.View
    public final void setVisibility(int i2) {
        super.setVisibility(i2);
        Drawable drawable = this.w;
        if (drawable != null) {
            boolean z = i2 == 0;
            if (drawable.isVisible() != z) {
                this.w.setVisible(z, false);
            }
        }
    }

    @Override // defpackage.ldk
    public final boolean t(View view, View view2, int i2, int i3) {
        int childCount = getChildCount();
        boolean z = false;
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            if (childAt.getVisibility() != 8) {
                kub kubVar = (kub) childAt.getLayoutParams();
                kty ktyVar = kubVar.a;
                if (ktyVar != null) {
                    boolean zI = ktyVar.i(this, childAt, view, view2, i2, i3);
                    z |= zI;
                    kubVar.c(i3, zI);
                } else {
                    kubVar.c(i3, false);
                }
            }
        }
        return z;
    }

    @Override // android.view.View
    protected final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.w;
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.coordinatorLayoutStyle);
    }

    @Override // android.view.ViewGroup
    protected final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof kub ? new kub((kub) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new kub((ViewGroup.MarginLayoutParams) layoutParams) : new kub(layoutParams);
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet, int i2) {
        TypedArray typedArrayObtainStyledAttributes;
        Context context2;
        CoordinatorLayout coordinatorLayout;
        super(context, attributeSet, i2);
        this.k = new ArrayList();
        this.e = new kug();
        this.l = new ArrayList();
        this.m = new int[2];
        this.n = new int[2];
        this.o = new int[2];
        this.y = new ldm();
        if (i2 == 0) {
            typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ktv.a, 0, 2132151726);
        } else {
            typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ktv.a, i2, 0);
        }
        TypedArray typedArray = typedArrayObtainStyledAttributes;
        if (i2 == 0) {
            coordinatorLayout = this;
            context2 = context;
            ley.o(coordinatorLayout, context2, ktv.a, attributeSet, typedArray, 0, 2132151726);
        } else {
            context2 = context;
            coordinatorLayout = this;
            ley.o(coordinatorLayout, context2, ktv.a, attributeSet, typedArray, i2, 0);
        }
        int resourceId = typedArray.getResourceId(0, 0);
        if (resourceId != 0) {
            Resources resources = context2.getResources();
            coordinatorLayout.r = resources.getIntArray(resourceId);
            float f = resources.getDisplayMetrics().density;
            int length = coordinatorLayout.r.length;
            for (int i3 = 0; i3 < length; i3++) {
                coordinatorLayout.r[i3] = (int) (r12[i3] * f);
            }
        }
        coordinatorLayout.w = typedArray.getDrawable(1);
        typedArray.recycle();
        z();
        super.setOnHierarchyChangeListener(new kua(this));
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
    }
}
