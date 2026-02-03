package com.google.android.material.bottomsheet;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Property;
import android.util.SparseIntArray;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.RoundedCorner;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.apps.messaging.R;
import defpackage.aao;
import defpackage.eecd;
import defpackage.eeej;
import defpackage.eeek;
import defpackage.eeel;
import defpackage.eeen;
import defpackage.eeeo;
import defpackage.eeep;
import defpackage.eeer;
import defpackage.eeet;
import defpackage.eefd;
import defpackage.eemt;
import defpackage.eemz;
import defpackage.eena;
import defpackage.eepy;
import defpackage.eesc;
import defpackage.eesj;
import defpackage.kty;
import defpackage.kub;
import defpackage.ley;
import defpackage.lhd;
import defpackage.ljm;
import defpackage.ljn;
import defpackage.lud;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes5.dex */
public class BottomSheetBehavior<V extends View> extends kty<V> implements eemt {
    public int A;
    public WeakReference B;
    public WeakReference C;
    public final ArrayList D;
    eena E;
    public int F;
    public boolean G;
    final SparseIntArray H;
    private int I;
    private float J;
    private int K;
    private int L;
    private ColorStateList M;
    private int N;
    private int O;
    private boolean P;
    private boolean Q;
    private boolean R;
    private eesj S;
    private boolean T;
    private final eeet U;
    private ValueAnimator V;
    private boolean W;
    private boolean X;
    private boolean Y;
    private int Z;
    public boolean a;
    private boolean aa;
    private final float ab;
    private int ac;
    private VelocityTracker ad;
    private int ae;
    private Map af;
    private final ljm ag;
    public int b;
    public int c;
    public boolean d;
    public eesc e;
    public int f;
    public boolean g;
    public boolean h;
    public boolean i;
    public boolean j;
    public boolean k;
    public boolean l;
    public int m;
    public int n;
    int o;
    public int p;
    public int q;
    float r;
    public int s;
    float t;
    public boolean u;
    public boolean v;
    public boolean w;
    public int x;
    public ljn y;
    int z;

    public BottomSheetBehavior() {
        this.I = 0;
        this.a = true;
        this.N = -1;
        this.O = -1;
        this.U = new eeet(this);
        this.r = 0.5f;
        this.t = -1.0f;
        this.w = true;
        this.W = true;
        this.x = 4;
        this.ab = 0.1f;
        this.D = new ArrayList();
        this.ae = -1;
        this.H = new SparseIntArray();
        this.ag = new eeen(this);
    }

    private final float M() {
        WeakReference weakReference;
        WindowInsets rootWindowInsets;
        if (this.e == null || (weakReference = this.B) == null || weakReference.get() == null || Build.VERSION.SDK_INT < 31) {
            return 0.0f;
        }
        View view = (View) this.B.get();
        if (!W() || (rootWindowInsets = view.getRootWindowInsets()) == null) {
            return 0.0f;
        }
        return Math.max(Y(this.e.x(), rootWindowInsets.getRoundedCorner(0)), Y(this.e.y(), rootWindowInsets.getRoundedCorner(1)));
    }

    private final int N() {
        int i;
        return this.d ? Math.min(Math.max(this.K, this.A - ((this.z * 9) / 16)), this.ac) + this.m : (this.P || this.g || (i = this.f) <= 0) ? this.c + this.m : Math.max(this.c, i + this.L);
    }

    private final int O(int i) {
        return i != 3 ? i != 4 ? i != 5 ? this.q : this.A : this.s : t();
    }

    private final void P() {
        int iN = N();
        if (this.a) {
            this.s = Math.max(this.A - iN, this.p);
        } else {
            this.s = this.A - iN;
        }
    }

    private final void Q() {
        this.q = (int) (this.A * (1.0f - this.r));
    }

    private final void R(View view, lhd lhdVar, int i) {
        ley.y(view, lhdVar, new eeeo(this, i));
    }

    private final void S() {
        this.F = -1;
        this.ae = -1;
        VelocityTracker velocityTracker = this.ad;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.ad = null;
        }
    }

    private final void T() throws Resources.NotFoundException {
        View view;
        int iA;
        WeakReference weakReference = this.B;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        ley.n(view, 524288);
        ley.n(view, 262144);
        ley.n(view, 1048576);
        SparseIntArray sparseIntArray = this.H;
        int i = sparseIntArray.get(0, -1);
        if (i != -1) {
            ley.n(view, i);
            sparseIntArray.delete(0);
        }
        if (!this.a && this.x != 6) {
            String string = view.getResources().getString(R.string.bottomsheet_action_expand_halfway);
            eeeo eeeoVar = new eeeo(this, 6);
            List listI = ley.i(view);
            int i2 = 0;
            while (true) {
                if (i2 >= listI.size()) {
                    int i3 = -1;
                    for (int i4 = 0; i4 < 32 && i3 == -1; i4++) {
                        i3 = ley.a[i4];
                        boolean z = true;
                        for (int i5 = 0; i5 < listI.size(); i5++) {
                            z &= ((lhd) listI.get(i5)).a() != i3;
                        }
                        if (true != z) {
                            i3 = -1;
                        }
                    }
                    iA = i3;
                } else {
                    if (TextUtils.equals(string, ((lhd) listI.get(i2)).b())) {
                        iA = ((lhd) listI.get(i2)).a();
                        break;
                    }
                    i2++;
                }
            }
            if (iA != -1) {
                ley.j(view, new lhd(null, iA, string, eeeoVar, null));
            }
            sparseIntArray.put(0, iA);
        }
        if (this.u && this.x != 5) {
            R(view, lhd.h, 5);
        }
        int i6 = this.x;
        if (i6 == 3) {
            R(view, lhd.g, true == this.a ? 4 : 6);
            return;
        }
        if (i6 == 4) {
            R(view, lhd.f, true == this.a ? 3 : 6);
        } else {
            if (i6 != 6) {
                return;
            }
            R(view, lhd.g, 4);
            R(view, lhd.f, 3);
        }
    }

    private final void U(int i, boolean z) {
        ValueAnimator valueAnimator;
        if (i == 2) {
            return;
        }
        boolean z2 = this.x == 3 && (this.R || W());
        if (this.T == z2 || this.e == null) {
            return;
        }
        this.T = z2;
        if (!z || (valueAnimator = this.V) == null) {
            ValueAnimator valueAnimator2 = this.V;
            if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                this.V.cancel();
            }
            this.e.Q(this.T ? M() : 1.0f);
            return;
        }
        if (valueAnimator.isRunning()) {
            this.V.reverse();
        } else {
            this.V.setFloatValues(this.e.q.l, z2 ? M() : 1.0f);
            this.V.start();
        }
    }

    private final void V(boolean z) {
        WeakReference weakReference = this.B;
        if (weakReference == null) {
            return;
        }
        ViewParent parent = ((View) weakReference.get()).getParent();
        if (parent instanceof CoordinatorLayout) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
            int childCount = coordinatorLayout.getChildCount();
            if (z) {
                if (this.af != null) {
                    return;
                } else {
                    this.af = new HashMap(childCount);
                }
            }
            for (int i = 0; i < childCount; i++) {
                View childAt = coordinatorLayout.getChildAt(i);
                if (childAt != this.B.get() && z) {
                    this.af.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                }
            }
            if (z) {
                return;
            }
            this.af = null;
        }
    }

    private final boolean W() {
        WeakReference weakReference = this.B;
        if (weakReference != null && weakReference.get() != null) {
            int[] iArr = new int[2];
            ((View) this.B.get()).getLocationOnScreen(iArr);
            if (iArr[1] == 0) {
                return true;
            }
        }
        return false;
    }

    private final boolean X() {
        if (this.y != null) {
            return this.w || this.x == 1;
        }
        return false;
    }

    private static final float Y(float f, RoundedCorner roundedCorner) {
        if (roundedCorner != null) {
            float radius = roundedCorner.getRadius();
            if (radius > 0.0f && f > 0.0f) {
                return radius / f;
            }
        }
        return 0.0f;
    }

    private static final int Z(int i, int i2, int i3, int i4) {
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i, i2, i4);
        if (i3 == -1) {
            return childMeasureSpec;
        }
        int mode = View.MeasureSpec.getMode(childMeasureSpec);
        int size = View.MeasureSpec.getSize(childMeasureSpec);
        if (mode == 1073741824) {
            return View.MeasureSpec.makeMeasureSpec(Math.min(size, i3), 1073741824);
        }
        if (size != 0) {
            i3 = Math.min(size, i3);
        }
        return View.MeasureSpec.makeMeasureSpec(i3, Integer.MIN_VALUE);
    }

    public static BottomSheetBehavior v(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof kub)) {
            throw new IllegalArgumentException("The view is not a child of CoordinatorLayout");
        }
        kty ktyVar = ((kub) layoutParams).a;
        if (ktyVar instanceof BottomSheetBehavior) {
            return (BottomSheetBehavior) ktyVar;
        }
        throw new IllegalArgumentException("The view is not associated with BottomSheetBehavior");
    }

    public final void A(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("offset must be greater than or equal to 0");
        }
        this.o = i;
        U(this.x, true);
    }

    public final void B(float f) {
        if (f <= 0.0f || f >= 1.0f) {
            throw new IllegalArgumentException("ratio must be a float value between 0 and 1");
        }
        this.r = f;
        if (this.B != null) {
            Q();
        }
    }

    public final void C(boolean z) throws Resources.NotFoundException {
        if (this.u != z) {
            this.u = z;
            if (!z && this.x == 5) {
                E(4);
            }
            T();
        }
    }

    public final void D(int i) {
        if (i == -1) {
            if (this.d) {
                return;
            } else {
                this.d = true;
            }
        } else {
            if (!this.d && this.c == i) {
                return;
            }
            this.d = false;
            this.c = Math.max(0, i);
        }
        L();
    }

    public final void E(int i) throws Resources.NotFoundException {
        if (!this.u && i == 5) {
            Log.w("BottomSheetBehavior", "Cannot set state: 5");
            return;
        }
        int i2 = (i == 6 && this.a && O(6) <= this.p) ? 3 : i;
        WeakReference weakReference = this.B;
        if (weakReference == null || weakReference.get() == null) {
            F(i);
            return;
        }
        View view = (View) this.B.get();
        eeej eeejVar = new eeej(this, view, i2);
        ViewParent parent = view.getParent();
        if (parent != null && parent.isLayoutRequested() && view.isAttachedToWindow()) {
            view.post(eeejVar);
        } else {
            eeejVar.run();
        }
    }

    public final void F(int i) throws Resources.NotFoundException {
        View view;
        if (this.x == i) {
            return;
        }
        this.x = i;
        int i2 = 4;
        if (i != 4 && i != 3 && i != 6 && this.u && i == 5) {
            i = 5;
        }
        WeakReference weakReference = this.B;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        int i3 = 0;
        if (i == 3) {
            V(true);
        } else {
            if (i == 6 || i == 5) {
                i2 = i;
            } else if (i == 4) {
            }
            V(false);
            i = i2;
        }
        U(i, true);
        while (true) {
            ArrayList arrayList = this.D;
            if (i3 >= arrayList.size()) {
                T();
                return;
            } else {
                ((eeep) arrayList.get(i3)).b(view, i);
                i3++;
            }
        }
    }

    @Override // defpackage.eemt
    public final void G(aao aaoVar) {
        eena eenaVar = this.E;
        if (eenaVar == null) {
            return;
        }
        eenaVar.e = aaoVar;
    }

    public final void H(View view, int i, boolean z) throws Resources.NotFoundException {
        int iO = O(i);
        ljn ljnVar = this.y;
        if (ljnVar == null || (!z ? ljnVar.j(view, view.getLeft(), iO) : ljnVar.h(view.getLeft(), iO))) {
            F(i);
            return;
        }
        F(2);
        U(i, true);
        this.U.a(i);
    }

    @Override // defpackage.eemt
    public final void I(aao aaoVar) {
        eena eenaVar = this.E;
        if (eenaVar == null) {
            return;
        }
        eenaVar.h(aaoVar);
    }

    public final boolean J() {
        return this.u;
    }

    public final boolean K(View view, float f) {
        if (this.v) {
            return true;
        }
        if (view.getTop() < this.s) {
            return false;
        }
        return Math.abs((((float) view.getTop()) + (f * this.ab)) - ((float) this.s)) / ((float) N()) > 0.5f;
    }

    public final void L() {
        View view;
        if (this.B != null) {
            P();
            if (this.x != 4 || (view = (View) this.B.get()) == null) {
                return;
            }
            view.requestLayout();
        }
    }

    @Override // defpackage.kty
    public final void a(kub kubVar) {
        this.B = null;
        this.y = null;
        this.E = null;
    }

    @Override // defpackage.kty
    public final void b() {
        this.B = null;
        this.y = null;
        this.E = null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0064, code lost:
    
        if (r1 == false) goto L36;
     */
    @Override // defpackage.kty
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(androidx.coordinatorlayout.widget.CoordinatorLayout r4, android.view.View r5, android.view.View r6, int r7, int r8, int[] r9, int r10) throws android.content.res.Resources.NotFoundException {
        /*
            r3 = this;
            r4 = 1
            if (r10 != r4) goto L5
            goto La2
        L5:
            java.lang.ref.WeakReference r7 = r3.C
            if (r7 == 0) goto L10
            java.lang.Object r7 = r7.get()
            android.view.View r7 = (android.view.View) r7
            goto L11
        L10:
            r7 = 0
        L11:
            if (r6 != r7) goto La2
            int r10 = r5.getTop()
            int r0 = r10 - r8
            if (r8 <= 0) goto L53
            boolean r1 = r3.aa
            if (r1 != 0) goto L2b
            boolean r1 = r3.W
            if (r1 != 0) goto L2b
            if (r6 != r7) goto L2b
            boolean r6 = r6.canScrollVertically(r4)
            if (r6 != 0) goto L67
        L2b:
            int r6 = r3.t()
            if (r0 >= r6) goto L43
            int r6 = r3.t()
            int r10 = r10 - r6
            r9[r4] = r10
            int[] r6 = defpackage.ley.a
            int r6 = -r10
            r5.offsetTopAndBottom(r6)
            r6 = 3
            r3.F(r6)
            goto L94
        L43:
            boolean r6 = r3.w
            if (r6 == 0) goto La2
            r9[r4] = r8
            int r6 = -r8
            int[] r7 = defpackage.ley.a
            r5.offsetTopAndBottom(r6)
            r3.F(r4)
            goto L94
        L53:
            if (r8 >= 0) goto L94
            r1 = -1
            boolean r1 = r6.canScrollVertically(r1)
            boolean r2 = r3.aa
            if (r2 != 0) goto L6a
            boolean r2 = r3.W
            if (r2 != 0) goto L6a
            if (r6 != r7) goto L6a
            if (r1 != 0) goto L67
            goto L6c
        L67:
            r3.X = r4
            return
        L6a:
            if (r1 != 0) goto L94
        L6c:
            int r6 = r3.s
            if (r0 <= r6) goto L85
            boolean r7 = r3.J()
            if (r7 == 0) goto L77
            goto L85
        L77:
            int r10 = r10 - r6
            r9[r4] = r10
            int[] r6 = defpackage.ley.a
            int r6 = -r10
            r5.offsetTopAndBottom(r6)
            r6 = 4
            r3.F(r6)
            goto L94
        L85:
            boolean r6 = r3.w
            if (r6 == 0) goto La2
            r9[r4] = r8
            int r6 = -r8
            int[] r7 = defpackage.ley.a
            r5.offsetTopAndBottom(r6)
            r3.F(r4)
        L94:
            int r5 = r5.getTop()
            r3.y(r5)
            r3.Z = r8
            r3.aa = r4
            r4 = 0
            r3.X = r4
        La2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.c(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.View, int, int, int[], int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0098  */
    @Override // defpackage.kty
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(androidx.coordinatorlayout.widget.CoordinatorLayout r3, android.view.View r4, android.view.View r5, int r6) throws android.content.res.Resources.NotFoundException {
        /*
            r2 = this;
            int r3 = r4.getTop()
            int r6 = r2.t()
            r0 = 3
            if (r3 != r6) goto Lf
            r2.F(r0)
            return
        Lf:
            java.lang.ref.WeakReference r3 = r2.C
            if (r3 == 0) goto Lb6
            java.lang.Object r3 = r3.get()
            if (r5 != r3) goto Lb6
            boolean r3 = r2.aa
            if (r3 != 0) goto L1f
            goto Lb6
        L1f:
            int r3 = r2.Z
            r5 = 6
            if (r3 <= 0) goto L35
            boolean r3 = r2.a
            if (r3 == 0) goto L2a
            goto Lb0
        L2a:
            int r3 = r4.getTop()
            int r6 = r2.q
            if (r3 <= r6) goto Lb0
        L32:
            r0 = r5
            goto Lb0
        L35:
            boolean r3 = r2.u
            if (r3 == 0) goto L56
            android.view.VelocityTracker r3 = r2.ad
            if (r3 != 0) goto L3f
            r3 = 0
            goto L4e
        L3f:
            r6 = 1000(0x3e8, float:1.401E-42)
            float r1 = r2.J
            r3.computeCurrentVelocity(r6, r1)
            android.view.VelocityTracker r3 = r2.ad
            int r6 = r2.F
            float r3 = r3.getYVelocity(r6)
        L4e:
            boolean r3 = r2.K(r4, r3)
            if (r3 == 0) goto L56
            r0 = 5
            goto Lb0
        L56:
            int r3 = r2.Z
            r6 = 4
            if (r3 != 0) goto L94
            int r3 = r4.getTop()
            boolean r1 = r2.a
            if (r1 == 0) goto L75
            int r5 = r2.p
            int r5 = r3 - r5
            int r5 = java.lang.Math.abs(r5)
            int r1 = r2.s
            int r3 = r3 - r1
            int r3 = java.lang.Math.abs(r3)
            if (r5 >= r3) goto L98
            goto Lb0
        L75:
            int r1 = r2.q
            if (r3 >= r1) goto L84
            int r6 = r2.s
            int r6 = r3 - r6
            int r6 = java.lang.Math.abs(r6)
            if (r3 >= r6) goto L32
            goto Lb0
        L84:
            int r0 = r3 - r1
            int r0 = java.lang.Math.abs(r0)
            int r1 = r2.s
            int r3 = r3 - r1
            int r3 = java.lang.Math.abs(r3)
            if (r0 >= r3) goto L98
            goto L32
        L94:
            boolean r3 = r2.a
            if (r3 == 0) goto L9a
        L98:
            r0 = r6
            goto Lb0
        L9a:
            int r3 = r4.getTop()
            int r0 = r2.q
            int r0 = r3 - r0
            int r0 = java.lang.Math.abs(r0)
            int r1 = r2.s
            int r3 = r3 - r1
            int r3 = java.lang.Math.abs(r3)
            if (r0 >= r3) goto L98
            goto L32
        Lb0:
            r3 = 0
            r2.H(r4, r0, r3)
            r2.aa = r3
        Lb6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.e(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.View, int):void");
    }

    @Override // defpackage.kty
    public final boolean f(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        int i;
        ljn ljnVar;
        if (!view.isShown() || !this.w) {
            this.Y = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            S();
            actionMasked = 0;
        }
        if (this.ad == null) {
            this.ad = VelocityTracker.obtain();
        }
        this.ad.addMovement(motionEvent);
        if (actionMasked == 0) {
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            this.ae = y;
            if (this.x != 2) {
                WeakReference weakReference = this.C;
                View view2 = weakReference != null ? (View) weakReference.get() : null;
                if (view2 != null && coordinatorLayout.k(view2, x, y)) {
                    this.F = motionEvent.getPointerId(motionEvent.getActionIndex());
                    this.G = true;
                }
            }
            this.Y = this.F == -1 && !coordinatorLayout.k(view, x, this.ae);
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.G = false;
            this.F = -1;
            if (this.Y) {
                this.Y = false;
                return false;
            }
        }
        if (!this.Y && (ljnVar = this.y) != null && ljnVar.i(motionEvent)) {
            return true;
        }
        WeakReference weakReference2 = this.C;
        View view3 = weakReference2 != null ? (View) weakReference2.get() : null;
        if (actionMasked == 2 && view3 != null && !this.Y && this.x != 1 && !coordinatorLayout.k(view3, (int) motionEvent.getX(), (int) motionEvent.getY()) && this.y != null && (i = this.ae) != -1) {
            if (Math.abs(i - motionEvent.getY()) > this.y.a) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0097  */
    @Override // defpackage.kty
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean g(androidx.coordinatorlayout.widget.CoordinatorLayout r6, android.view.View r7, int r8) throws android.content.res.Resources.NotFoundException {
        /*
            Method dump skipped, instructions count: 349
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.g(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, int):boolean");
    }

    @Override // defpackage.kty
    public final boolean i(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i, int i2) {
        this.Z = 0;
        this.aa = false;
        return (i & 2) != 0;
    }

    @Override // defpackage.kty
    public final boolean j(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        if (!view.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.x == 1 && actionMasked == 0) {
            return true;
        }
        if (X()) {
            this.y.e(motionEvent);
        }
        if (actionMasked == 0) {
            S();
        }
        if (this.ad == null) {
            this.ad = VelocityTracker.obtain();
        }
        this.ad.addMovement(motionEvent);
        if (X() && actionMasked == 2 && !this.Y) {
            float fAbs = Math.abs(this.ae - motionEvent.getY());
            ljn ljnVar = this.y;
            if (fAbs > ljnVar.a) {
                ljnVar.d(view, motionEvent.getPointerId(motionEvent.getActionIndex()));
            }
        }
        return !this.Y;
    }

    @Override // defpackage.kty
    public final boolean n(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(Z(i, coordinatorLayout.getPaddingLeft() + coordinatorLayout.getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, this.N, marginLayoutParams.width), Z(i3, coordinatorLayout.getPaddingTop() + coordinatorLayout.getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, this.O, marginLayoutParams.height));
        return true;
    }

    @Override // defpackage.kty
    public final boolean o(View view, View view2, float f) {
        WeakReference weakReference = this.C;
        return (weakReference == null || view2 != weakReference.get() || this.x == 3 || this.X) ? false : true;
    }

    @Override // defpackage.kty
    public final void q(View view, Parcelable parcelable) {
        eeer eeerVar = (eeer) parcelable;
        int i = this.I;
        int i2 = 4;
        if (i != 0) {
            if (i == -1 || (i & 1) == 1) {
                this.c = eeerVar.b;
            }
            if (i == -1 || (i & 2) == 2) {
                this.a = eeerVar.e;
            }
            if (i == -1 || (i & 4) == 4) {
                this.u = eeerVar.f;
            }
            if (i == -1 || (i & 8) == 8) {
                this.v = eeerVar.g;
            }
        }
        int i3 = eeerVar.a;
        if (i3 != 1 && i3 != 2) {
            i2 = i3;
        }
        this.x = i2;
    }

    @Override // defpackage.kty
    public final Parcelable r(View view) {
        return new eeer(View.BaseSavedState.EMPTY_STATE, this);
    }

    public final int t() {
        if (this.a) {
            return this.p;
        }
        return Math.max(this.o, this.Q ? 0 : this.n);
    }

    final View u(View view) {
        if (view.getVisibility() != 0) {
            return null;
        }
        if (view.isNestedScrollingEnabled()) {
            return view;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View viewU = u(viewGroup.getChildAt(i));
                if (viewU != null) {
                    return viewU;
                }
            }
        }
        return null;
    }

    public final void w(eeep eeepVar) {
        ArrayList arrayList = this.D;
        if (arrayList.contains(eeepVar)) {
            return;
        }
        arrayList.add(eeepVar);
    }

    @Override // defpackage.eemt
    public final void x() {
        eena eenaVar = this.E;
        if (eenaVar == null) {
            return;
        }
        eenaVar.f();
    }

    public final void y(int i) {
        View view = (View) this.B.get();
        if (view != null) {
            ArrayList arrayList = this.D;
            if (arrayList.isEmpty()) {
                return;
            }
            int i2 = this.s;
            if (i <= i2 && i2 != t()) {
                t();
            }
            for (int i3 = 0; i3 < arrayList.size(); i3++) {
                ((eeep) arrayList.get(i3)).c(view);
            }
        }
    }

    @Override // defpackage.eemt
    public final void z() throws Resources.NotFoundException {
        eena eenaVar = this.E;
        if (eenaVar == null) {
            return;
        }
        if (eenaVar.c() == null || Build.VERSION.SDK_INT < 34) {
            E(true == this.u ? 5 : 4);
            return;
        }
        if (!this.u) {
            Animator animatorE = this.E.e();
            animatorE.setDuration(eecd.b(r2.b, r2.c, r0.b));
            animatorE.start();
            E(4);
            return;
        }
        eena eenaVar2 = this.E;
        eeek eeekVar = new eeek(this);
        View view = eenaVar2.a;
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.TRANSLATION_Y, view.getHeight() * view.getScaleY());
        objectAnimatorOfFloat.setInterpolator(new lud());
        objectAnimatorOfFloat.setDuration(eecd.b(eenaVar2.b, eenaVar2.c, r0.b));
        objectAnimatorOfFloat.addListener(new eemz(eenaVar2));
        objectAnimatorOfFloat.addListener(eeekVar);
        objectAnimatorOfFloat.start();
    }

    public BottomSheetBehavior(Context context, AttributeSet attributeSet) throws Resources.NotFoundException {
        super(context, attributeSet);
        this.I = 0;
        this.a = true;
        this.N = -1;
        this.O = -1;
        this.U = new eeet(this);
        this.r = 0.5f;
        this.t = -1.0f;
        this.w = true;
        this.W = true;
        this.x = 4;
        this.ab = 0.1f;
        this.D = new ArrayList();
        this.ae = -1;
        this.H = new SparseIntArray();
        this.ag = new eeen(this);
        this.L = context.getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, eefd.a);
        if (typedArrayObtainStyledAttributes.hasValue(3)) {
            this.M = eepy.c(context, typedArrayObtainStyledAttributes, 3);
        }
        if (typedArrayObtainStyledAttributes.hasValue(22)) {
            this.S = new eesj(eesj.h(context, attributeSet, R.attr.bottomSheetStyle, R.style.Widget_Design_BottomSheet_Modal));
        }
        if (this.S != null) {
            eesc eescVar = new eesc(this.S);
            this.e = eescVar;
            eescVar.L(context);
            ColorStateList colorStateList = this.M;
            if (colorStateList != null) {
                this.e.P(colorStateList);
            } else {
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(android.R.attr.colorBackground, typedValue, true);
                this.e.setTint(typedValue.data);
            }
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(M(), 1.0f);
        this.V = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(500L);
        this.V.addUpdateListener(new eeel(this));
        this.t = typedArrayObtainStyledAttributes.getDimension(2, -1.0f);
        if (typedArrayObtainStyledAttributes.hasValue(0)) {
            this.N = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, -1);
        }
        if (typedArrayObtainStyledAttributes.hasValue(1)) {
            this.O = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, -1);
        }
        TypedValue typedValuePeekValue = typedArrayObtainStyledAttributes.peekValue(10);
        if (typedValuePeekValue != null && typedValuePeekValue.data == -1) {
            D(typedValuePeekValue.data);
        } else {
            D(typedArrayObtainStyledAttributes.getDimensionPixelSize(10, -1));
        }
        C(typedArrayObtainStyledAttributes.getBoolean(9, false));
        this.P = typedArrayObtainStyledAttributes.getBoolean(14, false);
        boolean z = typedArrayObtainStyledAttributes.getBoolean(7, true);
        if (this.a != z) {
            this.a = z;
            if (this.B != null) {
                P();
            }
            F((this.a && this.x == 6) ? 3 : this.x);
            U(this.x, true);
            T();
        }
        this.v = typedArrayObtainStyledAttributes.getBoolean(13, false);
        this.w = typedArrayObtainStyledAttributes.getBoolean(4, true);
        this.W = typedArrayObtainStyledAttributes.getBoolean(5, true);
        this.I = typedArrayObtainStyledAttributes.getInt(11, 0);
        B(typedArrayObtainStyledAttributes.getFloat(8, 0.5f));
        TypedValue typedValuePeekValue2 = typedArrayObtainStyledAttributes.peekValue(6);
        if (typedValuePeekValue2 != null && typedValuePeekValue2.type == 16) {
            A(typedValuePeekValue2.data);
        } else {
            A(typedArrayObtainStyledAttributes.getDimensionPixelOffset(6, 0));
        }
        this.b = typedArrayObtainStyledAttributes.getInt(12, 500);
        this.g = typedArrayObtainStyledAttributes.getBoolean(18, false);
        this.h = typedArrayObtainStyledAttributes.getBoolean(19, false);
        this.i = typedArrayObtainStyledAttributes.getBoolean(20, false);
        this.Q = typedArrayObtainStyledAttributes.getBoolean(21, true);
        this.j = typedArrayObtainStyledAttributes.getBoolean(15, false);
        this.k = typedArrayObtainStyledAttributes.getBoolean(16, false);
        this.l = typedArrayObtainStyledAttributes.getBoolean(17, false);
        this.R = typedArrayObtainStyledAttributes.getBoolean(24, true);
        typedArrayObtainStyledAttributes.recycle();
        this.J = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }

    @Override // defpackage.kty
    public final void d(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int i3, int i4, int i5, int[] iArr) {
    }
}
