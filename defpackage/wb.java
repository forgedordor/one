package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Parcelable;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class wb {
    boolean A;
    public final boolean B;
    public final boolean C;
    public int D;
    public boolean E;
    public int F;
    public int G;
    public int H;
    public int I;
    private final zo a;
    private final zo b;
    sm t;
    public RecyclerView u;
    public final zp v;
    public final zp w;
    public wr x;
    public boolean y;
    public boolean z;

    public wb() {
        vy vyVar = new vy(this);
        this.a = vyVar;
        vz vzVar = new vz(this);
        this.b = vzVar;
        this.v = new zp(vyVar);
        this.w = new zp(vzVar);
        this.y = false;
        this.z = false;
        this.A = false;
        this.B = true;
        this.C = true;
    }

    public static wa aC(Context context, AttributeSet attributeSet, int i, int i2) {
        wa waVar = new wa();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ma.a, i, i2);
        waVar.a = typedArrayObtainStyledAttributes.getInt(0, 1);
        waVar.b = typedArrayObtainStyledAttributes.getInt(10, 1);
        waVar.c = typedArrayObtainStyledAttributes.getBoolean(9, false);
        waVar.d = typedArrayObtainStyledAttributes.getBoolean(11, false);
        typedArrayObtainStyledAttributes.recycle();
        return waVar;
    }

    public static int ar(int i, int i2, int i3) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        return mode != Integer.MIN_VALUE ? mode != 1073741824 ? Math.max(i2, i3) : size : Math.min(size, Math.max(i2, i3));
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x001f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int at(int r3, int r4, int r5, int r6, boolean r7) {
        /*
            int r3 = r3 - r5
            r5 = 0
            int r3 = java.lang.Math.max(r5, r3)
            r0 = -1
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = 1073741824(0x40000000, float:2.0)
            if (r7 == 0) goto L19
            if (r6 < 0) goto L10
            goto L1b
        L10:
            if (r6 != r0) goto L2f
            if (r4 == r1) goto L1f
            if (r4 == 0) goto L2f
            if (r4 == r2) goto L1f
            goto L2f
        L19:
            if (r6 < 0) goto L1d
        L1b:
            r4 = r2
            goto L31
        L1d:
            if (r6 != r0) goto L21
        L1f:
            r6 = r3
            goto L31
        L21:
            r7 = -2
            if (r6 != r7) goto L2f
            if (r4 == r1) goto L2c
            if (r4 != r2) goto L29
            goto L2c
        L29:
            r6 = r3
            r4 = r5
            goto L31
        L2c:
            r6 = r3
            r4 = r1
            goto L31
        L2f:
            r4 = r5
            r6 = r4
        L31:
            int r3 = android.view.View.MeasureSpec.makeMeasureSpec(r6, r4)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wb.at(int, int, int, int, boolean):int");
    }

    public static boolean bk(int i, int i2, int i3) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (i3 > 0 && i != i3) {
            return false;
        }
        if (mode == Integer.MIN_VALUE) {
            return size >= i;
        }
        if (mode != 0) {
            return mode == 1073741824 && size == i;
        }
        return true;
    }

    public static final int bo(View view) {
        return view.getBottom() + ((wc) view.getLayoutParams()).d.bottom;
    }

    public static final int bp(View view) {
        return view.getLeft() - ((wc) view.getLayoutParams()).d.left;
    }

    public static final int bq(View view) {
        Rect rect = ((wc) view.getLayoutParams()).d;
        return view.getMeasuredHeight() + rect.top + rect.bottom;
    }

    public static final int br(View view) {
        Rect rect = ((wc) view.getLayoutParams()).d;
        return view.getMeasuredWidth() + rect.left + rect.right;
    }

    public static final int bs(View view) {
        return view.getRight() + ((wc) view.getLayoutParams()).d.right;
    }

    public static final int bt(View view) {
        return view.getTop() - ((wc) view.getLayoutParams()).d.top;
    }

    public static final int bu(View view) {
        return ((wc) view.getLayoutParams()).a();
    }

    public static final void bw(View view, int i, int i2, int i3, int i4) {
        Rect rect = ((wc) view.getLayoutParams()).d;
        view.layout(i + rect.left, i2 + rect.top, i3 - rect.right, i4 - rect.bottom);
    }

    public static final void bx(View view, int i, int i2, int i3, int i4) {
        wc wcVar = (wc) view.getLayoutParams();
        Rect rect = wcVar.d;
        view.layout(i + rect.left + wcVar.leftMargin, i2 + rect.top + wcVar.topMargin, (i3 - rect.right) - wcVar.rightMargin, (i4 - rect.bottom) - wcVar.bottomMargin);
    }

    private final void c(View view, int i, boolean z) {
        wv wvVarK = RecyclerView.k(view);
        if (z || wvVarK.v()) {
            this.u.i.b(wvVarK);
        } else {
            this.u.i.g(wvVarK);
        }
        wc wcVar = (wc) view.getLayoutParams();
        if (wvVarK.B() || wvVarK.w()) {
            if (wvVarK.w()) {
                wvVarK.p();
            } else {
                wvVarK.i();
            }
            this.t.g(view, i, view.getLayoutParams(), false);
        } else if (view.getParent() == this.u) {
            int iC = this.t.c(view);
            if (i == -1) {
                i = this.t.a();
            }
            if (iC == -1) {
                throw new IllegalStateException("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:" + this.u.indexOfChild(view) + this.u.o());
            }
            if (iC != i) {
                wb wbVar = this.u.o;
                View viewAE = wbVar.aE(iC);
                if (viewAE == null) {
                    throw new IllegalArgumentException("Cannot move a child from non-existing index:" + iC + wbVar.u.toString());
                }
                wbVar.aM(iC);
                wc wcVar2 = (wc) viewAE.getLayoutParams();
                wv wvVarK2 = RecyclerView.k(viewAE);
                if (wvVarK2.v()) {
                    wbVar.u.i.b(wvVarK2);
                } else {
                    wbVar.u.i.g(wvVarK2);
                }
                wbVar.t.g(viewAE, i, wcVar2, wvVarK2.v());
            }
        } else {
            this.t.f(view, i, false);
            wcVar.e = true;
            wr wrVar = this.x;
            if (wrVar != null && wrVar.k && wrVar.k(view) == wrVar.g) {
                wrVar.l = view;
            }
        }
        if (wcVar.f) {
            wvVarK.a.invalidate();
            wcVar.f = false;
        }
    }

    public int C(ws wsVar) {
        return 0;
    }

    public int D(ws wsVar) {
        return 0;
    }

    public int E(ws wsVar) {
        return 0;
    }

    public int F(ws wsVar) {
        return 0;
    }

    public int G(ws wsVar) {
        return 0;
    }

    public int H(ws wsVar) {
        return 0;
    }

    public Parcelable Q() {
        return null;
    }

    public View T(int i) {
        int iAs = as();
        for (int i2 = 0; i2 < iAs; i2++) {
            View viewAE = aE(i2);
            wv wvVarK = RecyclerView.k(viewAE);
            if (wvVarK != null && wvVarK.gl() == i && !wvVarK.A() && (this.u.N.g || !wvVarK.v())) {
                return viewAE;
            }
        }
        return null;
    }

    public void U(String str) {
        RecyclerView recyclerView = this.u;
        if (recyclerView != null) {
            recyclerView.z(str);
        }
    }

    public void Y(AccessibilityEvent accessibilityEvent) {
        RecyclerView recyclerView = this.u;
        wj wjVar = recyclerView.e;
        ws wsVar = recyclerView.N;
        if (recyclerView == null || accessibilityEvent == null) {
            return;
        }
        boolean z = true;
        if (!recyclerView.canScrollVertically(1) && !this.u.canScrollVertically(-1) && !this.u.canScrollHorizontally(-1) && !this.u.canScrollHorizontally(1)) {
            z = false;
        }
        accessibilityEvent.setScrollable(z);
        vo voVar = this.u.n;
        if (voVar != null) {
            accessibilityEvent.setItemCount(voVar.a());
        }
    }

    public final int aA() {
        RecyclerView recyclerView = this.u;
        if (recyclerView != null) {
            return recyclerView.getPaddingRight();
        }
        return 0;
    }

    public final int aB() {
        RecyclerView recyclerView = this.u;
        if (recyclerView != null) {
            return recyclerView.getPaddingTop();
        }
        return 0;
    }

    public final View aD(View view) {
        View viewN;
        RecyclerView recyclerView = this.u;
        if (recyclerView == null || (viewN = recyclerView.n(view)) == null || this.t.k(viewN)) {
            return null;
        }
        return viewN;
    }

    public final View aE(int i) {
        sm smVar = this.t;
        if (smVar != null) {
            return smVar.d(i);
        }
        return null;
    }

    public final View aF() {
        View focusedChild;
        RecyclerView recyclerView = this.u;
        if (recyclerView == null || (focusedChild = recyclerView.getFocusedChild()) == null || this.t.k(focusedChild)) {
            return null;
        }
        return focusedChild;
    }

    public final void aG(View view) {
        aH(view, -1);
    }

    public final void aH(View view, int i) {
        c(view, i, true);
    }

    public final void aI(View view) {
        aJ(view, -1);
    }

    public final void aJ(View view, int i) {
        c(view, i, false);
    }

    public final void aK(View view, Rect rect) {
        RecyclerView recyclerView = this.u;
        if (recyclerView == null) {
            rect.set(0, 0, 0, 0);
        } else {
            rect.set(recyclerView.g(view));
        }
    }

    public final void aL(wj wjVar) {
        int iAs = as();
        while (true) {
            iAs--;
            if (iAs < 0) {
                return;
            }
            View viewAE = aE(iAs);
            wv wvVarK = RecyclerView.k(viewAE);
            if (!wvVarK.A()) {
                if (!wvVarK.t() || wvVarK.v() || this.u.n.b) {
                    aM(iAs);
                    wjVar.n(viewAE);
                    this.u.i.g(wvVarK);
                } else {
                    ba(iAs);
                    wjVar.m(wvVarK);
                }
            }
        }
    }

    public final void aM(int i) {
        aE(i);
        this.t.h(i);
    }

    public final void aN(RecyclerView recyclerView) {
        this.z = true;
        aS(recyclerView);
    }

    public final void aO(RecyclerView recyclerView, wj wjVar) {
        this.z = false;
        X(recyclerView, wjVar);
    }

    public void aP(View view, Rect rect) {
        RecyclerView.P(view, rect);
    }

    public void aQ(int i) {
        RecyclerView recyclerView = this.u;
        if (recyclerView != null) {
            int iA = recyclerView.h.a();
            for (int i2 = 0; i2 < iA; i2++) {
                recyclerView.h.d(i2).offsetLeftAndRight(i);
            }
        }
    }

    public void aR(int i) {
        RecyclerView recyclerView = this.u;
        if (recyclerView != null) {
            int iA = recyclerView.h.a();
            for (int i2 = 0; i2 < iA; i2++) {
                recyclerView.h.d(i2).offsetTopAndBottom(i);
            }
        }
    }

    public final void aT(View view, lhg lhgVar) {
        wv wvVarK = RecyclerView.k(view);
        if (wvVarK == null || wvVarK.v() || this.t.k(wvVarK.a)) {
            return;
        }
        RecyclerView recyclerView = this.u;
        n(recyclerView.e, recyclerView.N, view, lhgVar);
    }

    public final void aV() {
        int iAs = as();
        while (true) {
            iAs--;
            if (iAs < 0) {
                return;
            } else {
                this.t.j(iAs);
            }
        }
    }

    public final void aW(wj wjVar) {
        int iAs = as();
        while (true) {
            iAs--;
            if (iAs < 0) {
                return;
            }
            if (!RecyclerView.k(aE(iAs)).A()) {
                aZ(iAs, wjVar);
            }
        }
    }

    public final void aX(wj wjVar) {
        ArrayList arrayList = wjVar.a;
        int size = arrayList.size();
        for (int i = size - 1; i >= 0; i--) {
            View view = ((wv) arrayList.get(i)).a;
            wv wvVarK = RecyclerView.k(view);
            if (!wvVarK.A()) {
                wvVarK.n(false);
                if (wvVarK.x()) {
                    this.u.removeDetachedView(view, false);
                }
                vv vvVar = this.u.E;
                if (vvVar != null) {
                    vvVar.b(wvVarK);
                }
                wvVarK.n(true);
                wjVar.i(view);
            }
        }
        arrayList.clear();
        ArrayList arrayList2 = wjVar.b;
        if (arrayList2 != null) {
            arrayList2.clear();
        }
        if (size > 0) {
            this.u.invalidate();
        }
    }

    public final void aY(View view, wj wjVar) {
        sm smVar = this.t;
        int i = smVar.c;
        if (i == 1) {
            throw new IllegalStateException("Cannot call removeView(At) within removeView(At)");
        }
        if (i == 2) {
            throw new IllegalStateException("Cannot call removeView(At) within removeViewIfHidden");
        }
        try {
            smVar.c = 1;
            smVar.d = view;
            vm vmVar = smVar.e;
            int iB = vmVar.b(view);
            if (iB >= 0) {
                if (smVar.a.g(iB)) {
                    smVar.l(view);
                }
                vmVar.e(iB);
            }
            smVar.c = 0;
            smVar.d = null;
            wjVar.l(view);
        } catch (Throwable th) {
            smVar.c = 0;
            smVar.d = null;
            throw th;
        }
    }

    public final void aZ(int i, wj wjVar) {
        View viewAE = aE(i);
        ba(i);
        wjVar.l(viewAE);
    }

    public void aa(int i) {
        int i2 = RecyclerView.aa;
    }

    public boolean ae() {
        return false;
    }

    public boolean af() {
        throw null;
    }

    public boolean ag() {
        return this.A;
    }

    public boolean ai() {
        return false;
    }

    public boolean ak() {
        return false;
    }

    public void aq(RecyclerView recyclerView, int i) {
        Log.e("RecyclerView", "You must override smoothScrollToPosition to support smooth scrolling");
    }

    public final int as() {
        sm smVar = this.t;
        if (smVar != null) {
            return smVar.a();
        }
        return 0;
    }

    public final int au() {
        RecyclerView recyclerView = this.u;
        vo voVar = recyclerView != null ? recyclerView.n : null;
        if (voVar != null) {
            return voVar.a();
        }
        return 0;
    }

    public final int av() {
        return this.u.getLayoutDirection();
    }

    public final int aw() {
        RecyclerView recyclerView = this.u;
        int[] iArr = ley.a;
        return recyclerView.getMinimumHeight();
    }

    public final int ax() {
        RecyclerView recyclerView = this.u;
        int[] iArr = ley.a;
        return recyclerView.getMinimumWidth();
    }

    public final int ay() {
        RecyclerView recyclerView = this.u;
        if (recyclerView != null) {
            return recyclerView.getPaddingBottom();
        }
        return 0;
    }

    public final int az() {
        RecyclerView recyclerView = this.u;
        if (recyclerView != null) {
            return recyclerView.getPaddingLeft();
        }
        return 0;
    }

    public final void bA(int i, int i2) {
        this.u.fk(i, i2);
    }

    public final void bB(Runnable runnable) {
        RecyclerView recyclerView = this.u;
        if (recyclerView != null) {
            recyclerView.removeCallbacks(runnable);
        }
    }

    @Deprecated
    public final void bC() {
        this.A = true;
    }

    public int bS(wj wjVar, ws wsVar) {
        RecyclerView recyclerView = this.u;
        if (recyclerView == null || recyclerView.n == null || !ae()) {
            return 1;
        }
        return this.u.n.a();
    }

    public int bT(wj wjVar, ws wsVar) {
        RecyclerView recyclerView = this.u;
        if (recyclerView == null || recyclerView.n == null || !af()) {
            return 1;
        }
        return this.u.n.a();
    }

    public wc bU(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof wc ? new wc((wc) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new wc((ViewGroup.MarginLayoutParams) layoutParams) : new wc(layoutParams);
    }

    public final void ba(int i) {
        if (aE(i) != null) {
            this.t.j(i);
        }
    }

    public final void bb() {
        RecyclerView recyclerView = this.u;
        if (recyclerView != null) {
            recyclerView.requestLayout();
        }
    }

    public final void bc() {
        this.y = true;
    }

    public final void bd(RecyclerView recyclerView) {
        be(View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), 1073741824));
    }

    public final void be(int i, int i2) {
        this.H = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        this.F = mode;
        if (mode == 0 && !RecyclerView.a) {
            this.H = 0;
        }
        this.I = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i2);
        this.G = mode2;
        if (mode2 != 0 || RecyclerView.a) {
            return;
        }
        this.I = 0;
    }

    public final void bf(int i, int i2) {
        this.u.setMeasuredDimension(i, i2);
    }

    public final void bg(int i, int i2) {
        int iAs = as();
        if (iAs == 0) {
            this.u.fk(i, i2);
            return;
        }
        int i3 = Integer.MIN_VALUE;
        int i4 = Integer.MAX_VALUE;
        int i5 = Integer.MAX_VALUE;
        int i6 = Integer.MIN_VALUE;
        for (int i7 = 0; i7 < iAs; i7++) {
            View viewAE = aE(i7);
            Rect rect = this.u.l;
            aP(viewAE, rect);
            if (rect.left < i4) {
                i4 = rect.left;
            }
            if (rect.right > i3) {
                i3 = rect.right;
            }
            if (rect.top < i5) {
                i5 = rect.top;
            }
            if (rect.bottom > i6) {
                i6 = rect.bottom;
            }
        }
        this.u.l.set(i4, i5, i3, i6);
        q(this.u.l, i, i2);
    }

    public final void bh(RecyclerView recyclerView) {
        if (recyclerView == null) {
            this.u = null;
            this.t = null;
            this.H = 0;
            this.I = 0;
        } else {
            this.u = recyclerView;
            this.t = recyclerView.h;
            this.H = recyclerView.getWidth();
            this.I = recyclerView.getHeight();
        }
        this.F = 1073741824;
        this.G = 1073741824;
    }

    public final void bi(wr wrVar) {
        wr wrVar2 = this.x;
        if (wrVar2 != null && wrVar != wrVar2 && wrVar2.k) {
            wrVar2.n();
        }
        this.x = wrVar;
        RecyclerView recyclerView = this.u;
        recyclerView.K.d();
        if (wrVar.m) {
            Log.w("RecyclerView", "An instance of " + wrVar.getClass().getSimpleName() + " was started more than once. Each instance of" + wrVar.getClass().getSimpleName() + " is intended to only be used once. You should create a new instance for each use.");
        }
        wrVar.h = recyclerView;
        wrVar.i = this;
        int i = wrVar.g;
        if (i == -1) {
            throw new IllegalArgumentException("Invalid target position");
        }
        RecyclerView recyclerView2 = wrVar.h;
        recyclerView2.N.a = i;
        wrVar.k = true;
        wrVar.j = true;
        wrVar.l = recyclerView2.o.T(wrVar.g);
        wrVar.h.K.b();
        wrVar.m = true;
    }

    public final boolean bj() {
        RecyclerView recyclerView = this.u;
        return recyclerView != null && recyclerView.j;
    }

    public final boolean bl() {
        wr wrVar = this.x;
        return wrVar != null && wrVar.k;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x00ac, code lost:
    
        if (r2 != 0) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00aa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean bm(android.support.v7.widget.RecyclerView r9, android.view.View r10, android.graphics.Rect r11, boolean r12, boolean r13) {
        /*
            r8 = this;
            int r0 = r8.az()
            int r1 = r8.aB()
            int r2 = r8.H
            int r3 = r8.aA()
            int r2 = r2 - r3
            int r3 = r8.I
            int r4 = r8.ay()
            int r3 = r3 - r4
            int r4 = r10.getLeft()
            int r5 = r11.left
            int r4 = r4 + r5
            int r5 = r10.getScrollX()
            int r4 = r4 - r5
            int r5 = r10.getTop()
            int r6 = r11.top
            int r5 = r5 + r6
            int r10 = r10.getScrollY()
            int r5 = r5 - r10
            int r10 = r11.width()
            int r10 = r10 + r4
            int r11 = r11.height()
            int r11 = r11 + r5
            int r4 = r4 - r0
            int r5 = r5 - r1
            int r11 = r11 - r3
            r0 = 0
            int r1 = java.lang.Math.min(r0, r4)
            int r10 = r10 - r2
            int r2 = java.lang.Math.min(r0, r5)
            int r3 = java.lang.Math.max(r0, r10)
            int r11 = java.lang.Math.max(r0, r11)
            int r6 = r8.av()
            r7 = 1
            if (r6 != r7) goto L5d
            if (r3 == 0) goto L58
            r1 = r3
            goto L63
        L58:
            int r1 = java.lang.Math.max(r1, r10)
            goto L63
        L5d:
            if (r1 != 0) goto L63
            int r1 = java.lang.Math.min(r4, r3)
        L63:
            if (r2 == 0) goto L66
            goto L6a
        L66:
            int r2 = java.lang.Math.min(r5, r11)
        L6a:
            int[] r10 = new int[]{r1, r2}
            r10 = r10[r0]
            if (r13 == 0) goto Laa
            android.view.View r11 = r9.getFocusedChild()
            if (r11 != 0) goto L79
            goto Laf
        L79:
            int r13 = r8.az()
            int r1 = r8.aB()
            int r3 = r8.H
            int r4 = r8.aA()
            int r3 = r3 - r4
            int r4 = r8.I
            int r5 = r8.ay()
            int r4 = r4 - r5
            android.support.v7.widget.RecyclerView r5 = r8.u
            android.graphics.Rect r5 = r5.l
            r8.aP(r11, r5)
            int r11 = r5.left
            int r11 = r11 - r10
            if (r11 >= r3) goto Laf
            int r11 = r5.right
            int r11 = r11 - r10
            if (r11 <= r13) goto Laf
            int r11 = r5.top
            int r11 = r11 - r2
            if (r11 >= r4) goto Laf
            int r11 = r5.bottom
            int r11 = r11 - r2
            if (r11 <= r1) goto Laf
        Laa:
            if (r10 != 0) goto Lb0
            if (r2 == 0) goto Laf
            goto Lb1
        Laf:
            return r0
        Lb0:
            r0 = r10
        Lb1:
            if (r12 == 0) goto Lb7
            r9.scrollBy(r0, r2)
            goto Lba
        Lb7:
            r9.ar(r0, r2)
        Lba:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wb.bm(android.support.v7.widget.RecyclerView, android.view.View, android.graphics.Rect, boolean, boolean):boolean");
    }

    public final boolean bn(View view, int i, int i2, wc wcVar) {
        return (!view.isLayoutRequested() && this.B && bk(view.getWidth(), i, wcVar.width) && bk(view.getHeight(), i2, wcVar.height)) ? false : true;
    }

    public final void bv(View view, Rect rect) {
        Matrix matrix;
        Rect rect2 = ((wc) view.getLayoutParams()).d;
        rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, view.getHeight() + rect2.bottom);
        if (this.u != null && (matrix = view.getMatrix()) != null && !matrix.isIdentity()) {
            RectF rectF = this.u.m;
            rectF.set(rect);
            matrix.mapRect(rectF);
            rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
        }
        rect.offset(view.getLeft(), view.getTop());
    }

    public void by(View view) {
        wc wcVar = (wc) view.getLayoutParams();
        Rect rectG = this.u.g(view);
        int i = rectG.left + rectG.right;
        int i2 = rectG.top + rectG.bottom;
        int iAt = at(this.H, this.F, az() + aA() + wcVar.leftMargin + wcVar.rightMargin + i, wcVar.width, ae());
        int iAt2 = at(this.I, this.G, aB() + ay() + wcVar.topMargin + wcVar.bottomMargin + i2, wcVar.height, af());
        if (bn(view, iAt, iAt2, wcVar)) {
            view.measure(iAt, iAt2);
        }
    }

    public int d(int i, wj wjVar, ws wsVar) {
        return 0;
    }

    public int e(int i, wj wjVar, ws wsVar) {
        return 0;
    }

    public abstract wc f();

    public wc h(Context context, AttributeSet attributeSet) {
        return new wc(context, attributeSet);
    }

    public View j(View view, int i, wj wjVar, ws wsVar) {
        return null;
    }

    public void m(wj wjVar, ws wsVar, lhg lhgVar) {
        if (this.u.canScrollVertically(-1) || this.u.canScrollHorizontally(-1)) {
            lhgVar.h(8192);
            lhgVar.O(true);
            lhgVar.af();
        }
        if (this.u.canScrollVertically(1) || this.u.canScrollHorizontally(1)) {
            lhgVar.h(4096);
            lhgVar.O(true);
            lhgVar.af();
        }
        lhgVar.u(lhe.a(bT(wjVar, wsVar), bS(wjVar, wsVar), 0));
    }

    public void n(wj wjVar, ws wsVar, View view, lhg lhgVar) {
        lhgVar.v(lhf.a(af() ? bu(view) : 0, 1, ae() ? bu(view) : 0, 1, false));
    }

    public void o(wj wjVar, ws wsVar) {
        throw null;
    }

    public void q(Rect rect, int i, int i2) {
        bf(ar(i, rect.width() + az() + aA(), ax()), ar(i2, rect.height() + aB() + ay(), aw()));
    }

    public boolean t(wc wcVar) {
        return wcVar != null;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x008c A[PHI: r0
      0x008c: PHI (r0v7 int) = (r0v4 int), (r0v17 int) binds: [B:26:0x007f, B:19:0x0057] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean u(int r11, android.os.Bundle r12) {
        /*
            Method dump skipped, instructions count: 222
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wb.u(int, android.os.Bundle):boolean");
    }

    public boolean v() {
        return false;
    }

    public void bz() {
    }

    public void y() {
    }

    public void Z(Parcelable parcelable) {
    }

    public void aS(RecyclerView recyclerView) {
    }

    public void aU(int i) {
    }

    public void p(ws wsVar) {
    }

    public void A(int i, int i2) {
    }

    public void B(int i, int i2) {
    }

    public void X(RecyclerView recyclerView, wj wjVar) {
    }

    public void am(int i, tw twVar) {
    }

    public void x(int i, int i2) {
    }

    public void z(int i, int i2) {
    }

    public void al(int i, int i2, ws wsVar, tw twVar) {
    }
}
