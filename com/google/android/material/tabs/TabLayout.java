package com.google.android.material.tabs;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.car.app.model.Alert;
import androidx.viewpager.widget.ViewPager;
import com.google.android.apps.messaging.R;
import defpackage.a;
import defpackage.eecd;
import defpackage.eejo;
import defpackage.eemh;
import defpackage.eemo;
import defpackage.eenh;
import defpackage.eepy;
import defpackage.eesc;
import defpackage.eesd;
import defpackage.eeut;
import defpackage.eeuu;
import defpackage.eeuv;
import defpackage.eeuw;
import defpackage.eeux;
import defpackage.eeuy;
import defpackage.eeuz;
import defpackage.eevb;
import defpackage.eevd;
import defpackage.eeve;
import defpackage.eevf;
import defpackage.eevh;
import defpackage.eevi;
import defpackage.eexh;
import defpackage.kt;
import defpackage.ku;
import defpackage.lcd;
import defpackage.lce;
import defpackage.lcf;
import defpackage.lhe;
import defpackage.lhg;
import defpackage.pou;
import defpackage.poz;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
@poz
/* loaded from: classes5.dex */
public class TabLayout extends HorizontalScrollView {
    private static final int H = 2132150862;
    private static final lcd I = new lcf(16);
    int A;
    public boolean B;
    public eeuw C;
    public final TimeInterpolator D;
    public final ArrayList E;
    public ViewPager F;
    public int G;
    private eeve J;
    private int K;
    private final int L;
    private final int M;
    private final int N;
    private int O;
    private eeuz P;
    private ValueAnimator Q;
    private pou R;
    private DataSetObserver S;
    private eevf T;
    private eeuy U;
    private boolean V;
    private final lcd W;
    public int a;
    public final ArrayList b;
    final eevd c;
    public int d;
    public int e;
    public int f;
    public int g;
    public final int h;
    public final int i;
    public int j;
    public ColorStateList k;
    public ColorStateList l;
    public ColorStateList m;
    public Drawable n;
    public PorterDuff.Mode o;
    public float p;
    public float q;
    public float r;
    public final int s;
    public int t;
    public int u;
    int v;
    public int w;
    public int x;
    public boolean y;
    public boolean z;

    public TabLayout(Context context) {
        this(context, null);
    }

    private final int A() {
        int i = this.L;
        if (i != -1) {
            return i;
        }
        int i2 = this.x;
        if (i2 == 0 || i2 == 2) {
            return this.N;
        }
        return 0;
    }

    private final void B(View view) {
        if (!(view instanceof TabItem)) {
            throw new IllegalArgumentException("Only TabItem instances can be added to TabLayout");
        }
        TabItem tabItem = (TabItem) view;
        eeve eeveVarE = e();
        CharSequence charSequence = tabItem.a;
        if (charSequence != null) {
            eeveVarE.f(charSequence);
        }
        Drawable drawable = tabItem.b;
        if (drawable != null) {
            eeveVarE.e(drawable);
        }
        int i = tabItem.c;
        if (i != 0) {
            eeveVarE.f = LayoutInflater.from(eeveVarE.i.getContext()).inflate(i, (ViewGroup) eeveVarE.i, false);
            eeveVarE.b();
        }
        if (!TextUtils.isEmpty(tabItem.getContentDescription())) {
            eeveVarE.d(tabItem.getContentDescription());
        }
        g(eeveVarE);
    }

    private final void C(int i) {
        if (i == -1) {
            return;
        }
        if (getWindowToken() != null && isLaidOut()) {
            eevd eevdVar = this.c;
            int childCount = eevdVar.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                if (eevdVar.getChildAt(i2).getWidth() > 0) {
                }
            }
            int scrollX = getScrollX();
            int iZ = z(i, 0.0f);
            if (scrollX != iZ) {
                if (this.Q == null) {
                    ValueAnimator valueAnimator = new ValueAnimator();
                    this.Q = valueAnimator;
                    valueAnimator.setInterpolator(this.D);
                    this.Q.setDuration(this.v);
                    this.Q.addUpdateListener(new eeux(this));
                }
                this.Q.setIntValues(scrollX, iZ);
                this.Q.start();
            }
            int i3 = this.v;
            ValueAnimator valueAnimator2 = eevdVar.a;
            if (valueAnimator2 != null && valueAnimator2.isRunning() && eevdVar.b.a != i) {
                eevdVar.a.cancel();
            }
            eevdVar.d(true, i, i3);
            return;
        }
        x(i);
    }

    private final void D(int i) {
        eevd eevdVar = this.c;
        int childCount = eevdVar.getChildCount();
        if (i < childCount) {
            int i2 = 0;
            while (i2 < childCount) {
                View childAt = eevdVar.getChildAt(i2);
                boolean z = i2 == i;
                if ((i2 != i || childAt.isSelected()) && (i2 == i || !childAt.isSelected())) {
                    childAt.setSelected(z);
                    childAt.setActivated(z);
                } else {
                    childAt.setSelected(z);
                    childAt.setActivated(z);
                    if (childAt instanceof eevh) {
                        ((eevh) childAt).c();
                    }
                }
                i2++;
            }
        }
    }

    private final void E() {
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((eeve) arrayList.get(i)).b();
        }
    }

    private final void F(LinearLayout.LayoutParams layoutParams) {
        if (this.x == 1 && this.u == 0) {
            layoutParams.width = 0;
            layoutParams.weight = 1.0f;
        } else {
            layoutParams.width = -2;
            layoutParams.weight = 0.0f;
        }
    }

    private final boolean G() {
        int i = this.x;
        return i == 0 || i == 2;
    }

    private final void H(ViewPager viewPager, boolean z) {
        List list;
        ViewPager viewPager2 = this.F;
        if (viewPager2 != null) {
            eevf eevfVar = this.T;
            if (eevfVar != null) {
                viewPager2.i(eevfVar);
            }
            eeuy eeuyVar = this.U;
            if (eeuyVar != null && (list = this.F.h) != null) {
                list.remove(eeuyVar);
            }
        }
        eeuz eeuzVar = this.P;
        if (eeuzVar != null) {
            k(eeuzVar);
            this.P = null;
        }
        if (viewPager != null) {
            this.F = viewPager;
            if (this.T == null) {
                this.T = new eevf(this);
            }
            eevf eevfVar2 = this.T;
            eevfVar2.b = 0;
            eevfVar2.a = 0;
            viewPager.d(eevfVar2);
            eevi eeviVar = new eevi(viewPager);
            this.P = eeviVar;
            f(eeviVar);
            pou pouVar = viewPager.b;
            if (pouVar != null) {
                n(pouVar, true);
            }
            if (this.U == null) {
                this.U = new eeuy(this);
            }
            eeuy eeuyVar2 = this.U;
            eeuyVar2.a = true;
            if (viewPager.h == null) {
                viewPager.h = new ArrayList();
            }
            viewPager.h.add(eeuyVar2);
            x(viewPager.c);
        } else {
            this.F = null;
            n(null, false);
        }
        this.V = z;
    }

    public static ColorStateList c(int i, int i2) {
        return new ColorStateList(new int[][]{SELECTED_STATE_SET, EMPTY_STATE_SET}, new int[]{i2, i});
    }

    private final int z(int i, float f) {
        eevd eevdVar;
        View childAt;
        int i2 = this.x;
        if ((i2 != 0 && i2 != 2) || (childAt = (eevdVar = this.c).getChildAt(i)) == null) {
            return 0;
        }
        int i3 = i + 1;
        View childAt2 = i3 < eevdVar.getChildCount() ? eevdVar.getChildAt(i3) : null;
        int width = childAt.getWidth();
        int width2 = childAt2 != null ? childAt2.getWidth() : 0;
        int left = (childAt.getLeft() + (width / 2)) - (getWidth() / 2);
        int i4 = (int) ((width + width2) * 0.5f * f);
        return getLayoutDirection() == 0 ? left + i4 : left - i4;
    }

    public final int a() {
        eeve eeveVar = this.J;
        if (eeveVar != null) {
            return eeveVar.e;
        }
        return -1;
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public final void addView(View view) {
        B(view);
    }

    public final int b() {
        return this.b.size();
    }

    public final eeve d(int i) {
        if (i < 0 || i >= b()) {
            return null;
        }
        return (eeve) this.b.get(i);
    }

    public final eeve e() {
        eeve eeveVar = (eeve) I.a();
        if (eeveVar == null) {
            eeveVar = new eeve();
        }
        eeveVar.h = this;
        lcd lcdVar = this.W;
        eevh eevhVar = lcdVar != null ? (eevh) lcdVar.a() : null;
        if (eevhVar == null) {
            eevhVar = new eevh(this, getContext());
        }
        eevhVar.a(eeveVar);
        eevhVar.setFocusable(true);
        eevhVar.setMinimumWidth(A());
        if (TextUtils.isEmpty(eeveVar.d)) {
            eevhVar.setContentDescription(eeveVar.c);
        } else {
            eevhVar.setContentDescription(eeveVar.d);
        }
        eeveVar.i = eevhVar;
        if (eeveVar.j != -1) {
            eeveVar.i.setId(0);
        }
        return eeveVar;
    }

    @Deprecated
    public final void f(eeuz eeuzVar) {
        ArrayList arrayList = this.E;
        if (arrayList.contains(eeuzVar)) {
            return;
        }
        arrayList.add(eeuzVar);
    }

    public final void g(eeve eeveVar) {
        h(eeveVar, this.b.isEmpty());
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return generateDefaultLayoutParams();
    }

    public final void h(eeve eeveVar, boolean z) {
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        if (eeveVar.h != this) {
            throw new IllegalArgumentException("Tab belongs to a different TabLayout.");
        }
        eeveVar.e = size;
        arrayList.add(size, eeveVar);
        int size2 = arrayList.size();
        int i = -1;
        for (int i2 = size + 1; i2 < size2; i2++) {
            if (((eeve) arrayList.get(i2)).e == this.a) {
                i = i2;
            }
            ((eeve) arrayList.get(i2)).e = i2;
        }
        this.a = i;
        eevh eevhVar = eeveVar.i;
        eevhVar.setSelected(false);
        eevhVar.setActivated(false);
        eevd eevdVar = this.c;
        int i3 = eeveVar.e;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -1);
        F(layoutParams);
        eevdVar.addView(eevhVar, i3, layoutParams);
        if (z) {
            eeveVar.a();
        }
    }

    public final void i() {
        int i = this.x;
        int iMax = (i == 0 || i == 2) ? Math.max(0, this.O - this.d) : 0;
        eevd eevdVar = this.c;
        eevdVar.setPaddingRelative(iMax, 0, 0, 0);
        int i2 = this.x;
        if (i2 == 0) {
            int i3 = this.u;
            if (i3 == 0) {
                Log.w("TabLayout", "MODE_SCROLLABLE + GRAVITY_FILL is not supported, GRAVITY_START will be used instead");
            } else if (i3 == 1) {
                eevdVar.setGravity(1);
            } else if (i3 == 2) {
            }
            eevdVar.setGravity(8388611);
        } else if (i2 == 1 || i2 == 2) {
            if (this.u == 2) {
                Log.w("TabLayout", "GRAVITY_START is not supported with the current tab mode, GRAVITY_CENTER will be used instead");
            }
            eevdVar.setGravity(1);
        }
        v(true);
    }

    public final void j() {
        int i;
        eevd eevdVar = this.c;
        for (int childCount = eevdVar.getChildCount() - 1; childCount >= 0; childCount--) {
            eevh eevhVar = (eevh) eevdVar.getChildAt(childCount);
            eevdVar.removeViewAt(childCount);
            if (eevhVar != null) {
                eevhVar.a(null);
                eevhVar.setSelected(false);
                this.W.b(eevhVar);
            }
            requestLayout();
        }
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            eeve eeveVar = (eeve) it.next();
            it.remove();
            eeveVar.h = null;
            eeveVar.i = null;
            eeveVar.a = null;
            eeveVar.b = null;
            eeveVar.j = -1;
            eeveVar.c = null;
            eeveVar.d = null;
            eeveVar.e = -1;
            eeveVar.f = null;
            I.b(eeveVar);
        }
        this.J = null;
        pou pouVar = this.R;
        if (pouVar != null) {
            int iJ = pouVar.j();
            for (int i2 = 0; i2 < iJ; i2++) {
                eeve eeveVarE = e();
                eeveVarE.f(this.R.k(i2));
                h(eeveVarE, false);
            }
            ViewPager viewPager = this.F;
            if (viewPager == null || iJ <= 0 || (i = viewPager.c) == a() || i >= b()) {
                return;
            }
            l(d(i));
        }
    }

    @Deprecated
    public final void k(eeuz eeuzVar) {
        this.E.remove(eeuzVar);
    }

    public final void l(eeve eeveVar) {
        m(eeveVar, true);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0038 A[PHI: r0
      0x0038: PHI (r0v13 eeve) = (r0v11 eeve), (r0v0 eeve) binds: [B:19:0x0032, B:16:0x002e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m(defpackage.eeve r4, boolean r5) {
        /*
            r3 = this;
            eeve r0 = r3.J
            r1 = -1
            if (r0 != r4) goto L22
            if (r0 == 0) goto L74
            java.util.ArrayList r5 = r3.E
            int r0 = r5.size()
            int r0 = r0 + r1
        Le:
            if (r0 < 0) goto L1c
            java.lang.Object r1 = r5.get(r0)
            eeuz r1 = (defpackage.eeuz) r1
            r1.a(r4)
            int r0 = r0 + (-1)
            goto Le
        L1c:
            int r4 = r4.e
            r3.C(r4)
            return
        L22:
            if (r4 == 0) goto L27
            int r2 = r4.e
            goto L28
        L27:
            r2 = r1
        L28:
            if (r5 == 0) goto L40
            if (r0 == 0) goto L31
            int r5 = r0.e
            if (r5 != r1) goto L38
            goto L32
        L31:
            r0 = 0
        L32:
            if (r2 == r1) goto L38
            r3.x(r2)
            goto L3b
        L38:
            r3.C(r2)
        L3b:
            if (r2 == r1) goto L40
            r3.D(r2)
        L40:
            r3.J = r4
            if (r0 == 0) goto L5d
            com.google.android.material.tabs.TabLayout r5 = r0.h
            if (r5 == 0) goto L5d
            java.util.ArrayList r5 = r3.E
            int r0 = r5.size()
            int r0 = r0 + r1
        L4f:
            if (r0 < 0) goto L5d
            java.lang.Object r2 = r5.get(r0)
            eeuz r2 = (defpackage.eeuz) r2
            r2.c()
            int r0 = r0 + (-1)
            goto L4f
        L5d:
            if (r4 == 0) goto L74
            java.util.ArrayList r5 = r3.E
            int r0 = r5.size()
            int r0 = r0 + r1
        L66:
            if (r0 < 0) goto L74
            java.lang.Object r1 = r5.get(r0)
            eeuz r1 = (defpackage.eeuz) r1
            r1.b(r4)
            int r0 = r0 + (-1)
            goto L66
        L74:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.tabs.TabLayout.m(eeve, boolean):void");
    }

    public final void n(pou pouVar, boolean z) {
        DataSetObserver dataSetObserver;
        pou pouVar2 = this.R;
        if (pouVar2 != null && (dataSetObserver = this.S) != null) {
            pouVar2.f.unregisterObserver(dataSetObserver);
        }
        this.R = pouVar;
        if (z && pouVar != null) {
            if (this.S == null) {
                this.S = new eevb(this);
            }
            pouVar.f.registerObserver(this.S);
        }
        j();
    }

    public final void o(int i, float f, boolean z, boolean z2, boolean z3) {
        float f2 = i + f;
        int iRound = Math.round(f2);
        if (iRound >= 0) {
            eevd eevdVar = this.c;
            if (iRound >= eevdVar.getChildCount()) {
                return;
            }
            if (z2) {
                eevdVar.b.a = Math.round(f2);
                ValueAnimator valueAnimator = eevdVar.a;
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    eevdVar.a.cancel();
                }
                eevdVar.c(eevdVar.getChildAt(i), eevdVar.getChildAt(i + 1), f);
            }
            ValueAnimator valueAnimator2 = this.Q;
            if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                this.Q.cancel();
            }
            int iZ = z(i, f);
            int scrollX = getScrollX();
            boolean z4 = (i < a() && iZ >= scrollX) || (i > a() && iZ <= scrollX) || i == a();
            if (getLayoutDirection() == 1) {
                z4 = (i < a() && iZ <= scrollX) || (i > a() && iZ >= scrollX) || i == a();
            }
            if (z4 || this.G == 1 || z3) {
                if (i < 0) {
                    iZ = 0;
                }
                scrollTo(iZ, 0);
            }
            if (z) {
                D(iRound);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        eesd.c(this);
        if (this.F == null) {
            ViewParent parent = getParent();
            if (parent instanceof ViewPager) {
                H((ViewPager) parent, true);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.V) {
            u(null);
            this.V = false;
        }
    }

    @Override // android.view.View
    protected final void onDraw(Canvas canvas) {
        eevh eevhVar;
        Drawable drawable;
        int i = 0;
        while (true) {
            eevd eevdVar = this.c;
            if (i >= eevdVar.getChildCount()) {
                super.onDraw(canvas);
                return;
            }
            View childAt = eevdVar.getChildAt(i);
            if ((childAt instanceof eevh) && (drawable = (eevhVar = (eevh) childAt).f) != null) {
                drawable.setBounds(eevhVar.getLeft(), eevhVar.getTop(), eevhVar.getRight(), eevhVar.getBottom());
                drawable.draw(canvas);
            }
            i++;
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        new lhg(accessibilityNodeInfo).u(lhe.a(1, b(), 1));
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return G() && super.onInterceptTouchEvent(motionEvent);
    }

    /* JADX WARN: Removed duplicated region for block: B:54:? A[RETURN, SYNTHETIC] */
    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final void onMeasure(int r9, int r10) {
        /*
            r8 = this;
            android.content.Context r0 = r8.getContext()
            java.util.ArrayList r1 = r8.b
            int r2 = r1.size()
            r3 = 0
            r4 = r3
        Lc:
            r5 = 48
            if (r4 >= r2) goto L2e
            java.lang.Object r6 = r1.get(r4)
            eeve r6 = (defpackage.eeve) r6
            if (r6 == 0) goto L2b
            android.graphics.drawable.Drawable r7 = r6.b
            if (r7 == 0) goto L2b
            java.lang.CharSequence r6 = r6.c
            boolean r6 = android.text.TextUtils.isEmpty(r6)
            if (r6 != 0) goto L2b
            boolean r1 = r8.y
            if (r1 != 0) goto L2e
            r5 = 72
            goto L2e
        L2b:
            int r4 = r4 + 1
            goto Lc
        L2e:
            float r0 = defpackage.eemo.a(r0, r5)
            int r0 = java.lang.Math.round(r0)
            int r1 = android.view.View.MeasureSpec.getMode(r10)
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = 1073741824(0x40000000, float:2.0)
            r5 = 1
            if (r1 == r2) goto L53
            if (r1 == 0) goto L44
            goto L66
        L44:
            int r10 = r8.getPaddingTop()
            int r0 = r0 + r10
            int r10 = r8.getPaddingBottom()
            int r0 = r0 + r10
            int r10 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r4)
            goto L66
        L53:
            int r1 = r8.getChildCount()
            if (r1 != r5) goto L66
            int r1 = android.view.View.MeasureSpec.getSize(r10)
            if (r1 < r0) goto L66
            android.view.View r1 = r8.getChildAt(r3)
            r1.setMinimumHeight(r0)
        L66:
            int r0 = android.view.View.MeasureSpec.getSize(r9)
            int r1 = android.view.View.MeasureSpec.getMode(r9)
            if (r1 == 0) goto L84
            int r1 = r8.M
            if (r1 <= 0) goto L75
            goto L82
        L75:
            float r0 = (float) r0
            android.content.Context r1 = r8.getContext()
            r2 = 56
            float r1 = defpackage.eemo.a(r1, r2)
            float r0 = r0 - r1
            int r1 = (int) r0
        L82:
            r8.t = r1
        L84:
            super.onMeasure(r9, r10)
            int r9 = r8.getChildCount()
            if (r9 != r5) goto Lcf
            android.view.View r9 = r8.getChildAt(r3)
            int r0 = r8.x
            if (r0 == 0) goto La7
            if (r0 == r5) goto L9b
            r1 = 2
            if (r0 == r1) goto La7
            goto Lcf
        L9b:
            int r0 = r9.getMeasuredWidth()
            int r1 = r8.getMeasuredWidth()
            if (r0 == r1) goto La6
            goto Lb1
        La6:
            return
        La7:
            int r0 = r9.getMeasuredWidth()
            int r1 = r8.getMeasuredWidth()
            if (r0 >= r1) goto Lcf
        Lb1:
            int r0 = r8.getPaddingTop()
            int r1 = r8.getPaddingBottom()
            int r0 = r0 + r1
            android.view.ViewGroup$LayoutParams r1 = r9.getLayoutParams()
            int r1 = r1.height
            int r10 = getChildMeasureSpec(r10, r0, r1)
            int r0 = r8.getMeasuredWidth()
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r4)
            r9.measure(r0, r10)
        Lcf:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.tabs.TabLayout.onMeasure(int, int):void");
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() != 8 || G()) {
            return super.onTouchEvent(motionEvent);
        }
        return false;
    }

    public final void p(Drawable drawable) {
        if (drawable == null) {
            drawable = new GradientDrawable();
        }
        Drawable drawableMutate = drawable.mutate();
        this.n = drawableMutate;
        eejo.f(drawableMutate, this.K);
        int intrinsicHeight = this.A;
        if (intrinsicHeight == -1) {
            intrinsicHeight = this.n.getIntrinsicHeight();
        }
        this.c.b(intrinsicHeight);
    }

    public final void q(int i) {
        this.K = i;
        eejo.f(this.n, i);
        v(false);
    }

    public final void r(ColorStateList colorStateList) {
        if (this.l != colorStateList) {
            this.l = colorStateList;
            E();
        }
    }

    public final void s(int i) {
        if (i != this.x) {
            this.x = i;
            i();
        }
    }

    @Override // android.view.View
    public final void setElevation(float f) {
        super.setElevation(f);
        eesd.b(this, f);
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return Math.max(0, ((this.c.getWidth() - getWidth()) - getPaddingLeft()) - getPaddingRight()) > 0;
    }

    public final void t(ColorStateList colorStateList) {
        if (this.k != colorStateList) {
            this.k = colorStateList;
            E();
        }
    }

    public final void u(ViewPager viewPager) {
        H(viewPager, false);
    }

    public final void v(boolean z) {
        int i = 0;
        while (true) {
            eevd eevdVar = this.c;
            if (i >= eevdVar.getChildCount()) {
                return;
            }
            View childAt = eevdVar.getChildAt(i);
            childAt.setMinimumWidth(A());
            F((LinearLayout.LayoutParams) childAt.getLayoutParams());
            if (z) {
                childAt.requestLayout();
            }
            i++;
        }
    }

    public final void w() {
        if (this.y) {
            return;
        }
        this.y = true;
        int i = 0;
        while (true) {
            eevd eevdVar = this.c;
            if (i >= eevdVar.getChildCount()) {
                i();
                return;
            }
            View childAt = eevdVar.getChildAt(i);
            if (childAt instanceof eevh) {
                eevh eevhVar = (eevh) childAt;
                eevhVar.setOrientation(!eevhVar.g.y ? 1 : 0);
                TextView textView = eevhVar.d;
                if (textView == null && eevhVar.e == null) {
                    eevhVar.d(eevhVar.a, eevhVar.b, true);
                } else {
                    eevhVar.d(textView, eevhVar.e, false);
                }
            }
            i++;
        }
    }

    public final void x(int i) {
        o(i, 0.0f, true, true, true);
    }

    public final void y() {
        p(ku.a(getContext(), R.drawable.compose_screen_bottom_bar_selected_item_background_coolranch));
    }

    public TabLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.tabStyle);
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public final void addView(View view, int i) {
        B(view);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return generateDefaultLayoutParams();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public TabLayout(Context context, AttributeSet attributeSet, int i) throws Resources.NotFoundException {
        int i2 = H;
        super(eexh.a(context, attributeSet, i, i2), attributeSet, i);
        this.a = -1;
        this.b = new ArrayList();
        this.j = -1;
        this.K = 0;
        this.t = Alert.DURATION_SHOW_INDEFINITELY;
        this.A = -1;
        this.E = new ArrayList();
        this.W = new lce(12);
        Context context2 = getContext();
        setHorizontalScrollBarEnabled(false);
        eevd eevdVar = new eevd(this, context2);
        this.c = eevdVar;
        super.addView(eevdVar, 0, new FrameLayout.LayoutParams(-2, -1));
        TypedArray typedArrayA = eemh.a(context2, attributeSet, eeuv.b, i, i2, 24);
        ColorStateList colorStateListA = eejo.a(getBackground());
        if (colorStateListA != null) {
            eesc eescVar = new eesc();
            eescVar.P(colorStateListA);
            eescVar.L(context2);
            eescVar.O(getElevation());
            setBackground(eescVar);
        }
        p(eepy.e(context2, typedArrayA, 5));
        q(typedArrayA.getColor(8, 0));
        eevdVar.b(typedArrayA.getDimensionPixelSize(11, -1));
        int i3 = typedArrayA.getInt(10, 0);
        if (this.w != i3) {
            this.w = i3;
            eevdVar.postInvalidateOnAnimation();
        }
        int i4 = typedArrayA.getInt(7, 0);
        if (i4 == 0) {
            this.C = new eeuw();
        } else if (i4 == 1) {
            this.C = new eeut();
        } else if (i4 == 2) {
            this.C = new eeuu();
        } else {
            throw new IllegalArgumentException(a.D(i4, " is not a valid TabIndicatorAnimationMode"));
        }
        this.z = typedArrayA.getBoolean(9, true);
        eevdVar.a();
        eevdVar.postInvalidateOnAnimation();
        int dimensionPixelSize = typedArrayA.getDimensionPixelSize(16, 0);
        this.g = dimensionPixelSize;
        this.f = dimensionPixelSize;
        this.e = dimensionPixelSize;
        this.d = dimensionPixelSize;
        this.d = typedArrayA.getDimensionPixelSize(19, dimensionPixelSize);
        this.e = typedArrayA.getDimensionPixelSize(20, this.e);
        this.f = typedArrayA.getDimensionPixelSize(18, this.f);
        this.g = typedArrayA.getDimensionPixelSize(17, this.g);
        this.h = true != eemh.e(context2) ? R.attr.textAppearanceButton : R.attr.textAppearanceTitleSmall;
        int resourceId = typedArrayA.getResourceId(24, R.style.TextAppearance_Design_Tab);
        this.i = resourceId;
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(resourceId, kt.z);
        try {
            this.p = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
            this.k = eepy.c(context2, typedArrayObtainStyledAttributes, 3);
            typedArrayObtainStyledAttributes.recycle();
            if (typedArrayA.hasValue(22)) {
                this.j = typedArrayA.getResourceId(22, resourceId);
            }
            int i5 = this.j;
            if (i5 != -1) {
                typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(i5, kt.z);
                try {
                    this.q = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, (int) this.p);
                    ColorStateList colorStateListC = eepy.c(context2, typedArrayObtainStyledAttributes, 3);
                    if (colorStateListC != null) {
                        this.k = c(this.k.getDefaultColor(), colorStateListC.getColorForState(new int[]{android.R.attr.state_selected}, colorStateListC.getDefaultColor()));
                    }
                } finally {
                }
            }
            if (typedArrayA.hasValue(25)) {
                this.k = eepy.c(context2, typedArrayA, 25);
            }
            if (typedArrayA.hasValue(23)) {
                this.k = c(this.k.getDefaultColor(), typedArrayA.getColor(23, 0));
            }
            this.l = eepy.c(context2, typedArrayA, 3);
            this.o = eemo.c(typedArrayA.getInt(4, -1), null);
            this.m = eepy.c(context2, typedArrayA, 21);
            this.v = typedArrayA.getInt(6, 300);
            this.D = eenh.a(context2, R.attr.motionEasingEmphasizedInterpolator, eecd.b);
            this.L = typedArrayA.getDimensionPixelSize(14, -1);
            this.M = typedArrayA.getDimensionPixelSize(13, -1);
            this.s = typedArrayA.getResourceId(0, 0);
            this.O = typedArrayA.getDimensionPixelSize(1, 0);
            this.x = typedArrayA.getInt(15, 1);
            this.u = typedArrayA.getInt(2, 0);
            this.y = typedArrayA.getBoolean(12, false);
            this.B = typedArrayA.getBoolean(26, false);
            typedArrayA.recycle();
            Resources resources = getResources();
            this.r = resources.getDimensionPixelSize(R.dimen.design_tab_text_size_2line);
            this.N = resources.getDimensionPixelSize(R.dimen.design_tab_scrollable_min_width);
            i();
        } finally {
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        B(view);
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        B(view);
    }
}
