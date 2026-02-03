package defpackage;

import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ljn {
    private static final Interpolator c = new ljj();
    public int a;
    public Interpolator b;
    private int d;
    private float[] f;
    private float[] g;
    private float[] h;
    private float[] i;
    private int[] j;
    private int[] k;
    private int[] l;
    private int m;
    private VelocityTracker n;
    private final float o;
    private float p;
    private int q;
    private final OverScroller r;
    private final ljm s;
    private View t;
    private boolean u;
    private final ViewGroup v;
    private int e = -1;
    private final Runnable w = new ljk(this);

    private ljn(Context context, ViewGroup viewGroup, ljm ljmVar) {
        if (ljmVar == null) {
            throw new NullPointerException("Callback may not be null");
        }
        this.v = viewGroup;
        this.s = ljmVar;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.q = (int) ((context.getResources().getDisplayMetrics().density * 20.0f) + 0.5f);
        this.a = viewConfiguration.getScaledTouchSlop();
        this.o = viewConfiguration.getScaledMaximumFlingVelocity();
        this.p = viewConfiguration.getScaledMinimumFlingVelocity();
        this.b = c;
        this.r = new OverScroller(context, new ljl(this));
    }

    public static ljn b(ViewGroup viewGroup, ljm ljmVar) {
        return new ljn(viewGroup.getContext(), viewGroup, ljmVar);
    }

    private final int m(int i, int i2, int i3) {
        int iAbs;
        if (i == 0) {
            return 0;
        }
        int width = this.v.getWidth() / 2;
        float fSin = (float) Math.sin((Math.min(1.0f, Math.abs(i) / r0) - 0.5f) * 0.47123894f);
        int iAbs2 = Math.abs(i2);
        if (iAbs2 > 0) {
            float f = width;
            iAbs = Math.round(Math.abs((f + (fSin * f)) / iAbs2) * 1000.0f) * 4;
        } else {
            iAbs = (int) (((Math.abs(i) / i3) + 1.0f) * 256.0f);
        }
        return Math.min(iAbs, 600);
    }

    private final void n(int i) {
        float[] fArr = this.f;
        if (fArr == null || !g(i)) {
            return;
        }
        fArr[i] = 0.0f;
        this.g[i] = 0.0f;
        this.h[i] = 0.0f;
        this.i[i] = 0.0f;
        this.j[i] = 0;
        this.k[i] = 0;
        this.l[i] = 0;
        this.m = (~(1 << i)) & this.m;
    }

    private final void o(float f, float f2) {
        this.u = true;
        this.s.d(this.t, f, f2);
        this.u = false;
        if (this.d == 1) {
            f(0);
        }
    }

    private final void p() {
        float f = this.o;
        this.n.computeCurrentVelocity(1000, f);
        o(w(this.n.getXVelocity(this.e), this.p, f), w(this.n.getYVelocity(this.e), this.p, f));
    }

    private final void q(float f, float f2, int i) {
        y(f, f2, i);
        y(f2, f, i);
        y(f, f2, i);
        y(f2, f, i);
    }

    private final void r(float f, float f2, int i) {
        float[] fArr = this.f;
        if (fArr == null || fArr.length <= i) {
            int i2 = i + 1;
            float[] fArr2 = new float[i2];
            float[] fArr3 = new float[i2];
            float[] fArr4 = new float[i2];
            float[] fArr5 = new float[i2];
            int[] iArr = new int[i2];
            int[] iArr2 = new int[i2];
            int[] iArr3 = new int[i2];
            if (fArr != null) {
                System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
                float[] fArr6 = this.g;
                System.arraycopy(fArr6, 0, fArr3, 0, fArr6.length);
                float[] fArr7 = this.h;
                System.arraycopy(fArr7, 0, fArr4, 0, fArr7.length);
                float[] fArr8 = this.i;
                System.arraycopy(fArr8, 0, fArr5, 0, fArr8.length);
                int[] iArr4 = this.j;
                System.arraycopy(iArr4, 0, iArr, 0, iArr4.length);
                int[] iArr5 = this.k;
                System.arraycopy(iArr5, 0, iArr2, 0, iArr5.length);
                int[] iArr6 = this.l;
                System.arraycopy(iArr6, 0, iArr3, 0, iArr6.length);
            }
            this.f = fArr2;
            this.g = fArr3;
            this.h = fArr4;
            this.i = fArr5;
            this.j = iArr;
            this.k = iArr2;
            this.l = iArr3;
        }
        float[] fArr9 = this.f;
        this.h[i] = f;
        fArr9[i] = f;
        float[] fArr10 = this.g;
        this.i[i] = f2;
        fArr10[i] = f2;
        int[] iArr7 = this.j;
        int i3 = (int) f;
        int i4 = (int) f2;
        ViewGroup viewGroup = this.v;
        int i5 = i3 < viewGroup.getLeft() + this.q ? 1 : 0;
        if (i4 < viewGroup.getTop() + this.q) {
            i5 |= 4;
        }
        if (i3 > viewGroup.getRight() - this.q) {
            i5 |= 2;
        }
        if (i4 > viewGroup.getBottom() - this.q) {
            i5 |= 8;
        }
        iArr7[i] = i5;
        this.m |= 1 << i;
    }

    private final void s(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i = 0; i < pointerCount; i++) {
            int pointerId = motionEvent.getPointerId(i);
            if (v(pointerId)) {
                float x = motionEvent.getX(i);
                float y = motionEvent.getY(i);
                this.h[pointerId] = x;
                this.i[pointerId] = y;
            }
        }
    }

    private final boolean t(View view, float f, float f2) {
        if (view == null) {
            return false;
        }
        ljm ljmVar = this.s;
        boolean z = ljmVar.a(view) > 0;
        boolean z2 = ljmVar.h() > 0;
        if (!z || !z2) {
            return z ? Math.abs(f) > ((float) this.a) : z2 && Math.abs(f2) > ((float) this.a);
        }
        int i = this.a;
        return (f * f) + (f2 * f2) > ((float) (i * i));
    }

    private final boolean u(int i, int i2, int i3, int i4) {
        float f;
        float f2;
        float f3;
        int left = this.t.getLeft();
        int top = this.t.getTop();
        int i5 = i - left;
        int i6 = i2 - top;
        if (i5 == 0) {
            i5 = 0;
            if (i6 == 0) {
                this.r.abortAnimation();
                f(0);
                return false;
            }
        }
        int i7 = i5;
        View view = this.t;
        int i8 = (int) this.p;
        int i9 = (int) this.o;
        int iX = x(i3, i8, i9);
        int iX2 = x(i4, (int) this.p, i9);
        int iAbs = Math.abs(i7);
        int iAbs2 = Math.abs(i6);
        int iAbs3 = Math.abs(iX);
        int iAbs4 = Math.abs(iX2);
        int i10 = iAbs3 + iAbs4;
        int i11 = iAbs + iAbs2;
        if (iX != 0) {
            f = iAbs3 / i10;
        } else {
            f = iAbs / i11;
        }
        if (iX2 != 0) {
            f2 = i10;
            f3 = iAbs4;
        } else {
            f2 = i11;
            f3 = iAbs2;
        }
        float f4 = f3 / f2;
        float fM = m(i7, iX, r13.a(view)) * f;
        float fM2 = m(i6, iX2, this.s.h());
        this.b = c;
        this.r.startScroll(left, top, i7, i6, (int) (fM + (fM2 * f4)));
        f(2);
        return true;
    }

    private final boolean v(int i) {
        return g(i);
    }

    private static final float w(float f, float f2, float f3) {
        float fAbs = Math.abs(f);
        if (fAbs < f2) {
            return 0.0f;
        }
        return fAbs > f3 ? f > 0.0f ? f3 : -f3 : f;
    }

    private static final int x(int i, int i2, int i3) {
        int iAbs = Math.abs(i);
        if (iAbs < i2) {
            return 0;
        }
        return iAbs > i3 ? i > 0 ? i3 : -i3 : i;
    }

    private final void y(float f, float f2, int i) {
        Math.abs(f);
        Math.abs(f2);
        int i2 = this.j[i];
    }

    public final View a(int i, int i2) {
        ViewGroup viewGroup = this.v;
        int childCount = viewGroup.getChildCount();
        while (true) {
            childCount--;
            if (childCount < 0) {
                return null;
            }
            View childAt = viewGroup.getChildAt(childCount);
            if (i >= childAt.getLeft() && i < childAt.getRight() && i2 >= childAt.getTop() && i2 < childAt.getBottom()) {
                return childAt;
            }
        }
    }

    public final void c() {
        this.e = -1;
        float[] fArr = this.f;
        if (fArr != null) {
            Arrays.fill(fArr, 0.0f);
            Arrays.fill(this.g, 0.0f);
            Arrays.fill(this.h, 0.0f);
            Arrays.fill(this.i, 0.0f);
            Arrays.fill(this.j, 0);
            Arrays.fill(this.k, 0);
            Arrays.fill(this.l, 0);
            this.m = 0;
        }
        VelocityTracker velocityTracker = this.n;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.n = null;
        }
    }

    public final void d(View view, int i) {
        ViewParent parent = view.getParent();
        ViewGroup viewGroup = this.v;
        if (parent != viewGroup) {
            throw new IllegalArgumentException(a.h(viewGroup, "captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (", ")"));
        }
        this.t = view;
        this.e = i;
        this.s.b(view, i);
        f(1);
    }

    public final void e(MotionEvent motionEvent) {
        int iFindPointerIndex;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        int i = 0;
        if (actionMasked == 0) {
            c();
            actionMasked = 0;
        }
        if (this.n == null) {
            this.n = VelocityTracker.obtain();
        }
        this.n.addMovement(motionEvent);
        if (actionMasked == 0) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            View viewA = a((int) x, (int) y);
            r(x, y, pointerId);
            k(viewA, pointerId);
            int i2 = this.j[pointerId];
            return;
        }
        if (actionMasked == 1) {
            if (this.d == 1) {
                p();
            }
            c();
            return;
        }
        if (actionMasked != 2) {
            if (actionMasked == 3) {
                if (this.d == 1) {
                    o(0.0f, 0.0f);
                }
                c();
                return;
            }
            if (actionMasked == 5) {
                int pointerId2 = motionEvent.getPointerId(actionIndex);
                float x2 = motionEvent.getX(actionIndex);
                int i3 = (int) x2;
                float y2 = motionEvent.getY(actionIndex);
                int i4 = (int) y2;
                r(x2, y2, pointerId2);
                if (this.d == 0) {
                    k(a(i3, i4), pointerId2);
                    int i5 = this.j[pointerId2];
                    return;
                }
                View view = this.t;
                if (view != null && i3 >= view.getLeft() && i3 < view.getRight() && i4 >= view.getTop() && i4 < view.getBottom()) {
                    k(this.t, pointerId2);
                    return;
                }
                return;
            }
            if (actionMasked != 6) {
                return;
            }
            int pointerId3 = motionEvent.getPointerId(actionIndex);
            if (this.d == 1 && pointerId3 == this.e) {
                int pointerCount = motionEvent.getPointerCount();
                while (true) {
                    if (i >= pointerCount) {
                        break;
                    }
                    int pointerId4 = motionEvent.getPointerId(i);
                    if (pointerId4 != this.e) {
                        View viewA2 = a((int) motionEvent.getX(i), (int) motionEvent.getY(i));
                        View view2 = this.t;
                        if (viewA2 == view2 && k(view2, pointerId4)) {
                            if (this.e == -1) {
                                break;
                            }
                        }
                    }
                    i++;
                }
                p();
            }
            n(pointerId3);
            return;
        }
        if (this.d == 1) {
            int i6 = this.e;
            if (!v(i6) || (iFindPointerIndex = motionEvent.findPointerIndex(i6)) == -1) {
                return;
            }
            float x3 = motionEvent.getX(iFindPointerIndex);
            float y3 = motionEvent.getY(iFindPointerIndex);
            float[] fArr = this.h;
            int i7 = this.e;
            float f = x3 - fArr[i7];
            float f2 = y3 - this.i[i7];
            int i8 = (int) f;
            int left = this.t.getLeft() + i8;
            int i9 = (int) f2;
            int top = this.t.getTop() + i9;
            int left2 = this.t.getLeft();
            int top2 = this.t.getTop();
            if (i8 != 0) {
                left = this.s.f(this.t, left);
                int[] iArr = ley.a;
                this.t.offsetLeftAndRight(left - left2);
            }
            if (i9 != 0) {
                top = this.s.g(this.t, top);
                int[] iArr2 = ley.a;
                this.t.offsetTopAndBottom(top - top2);
            }
            if (i8 != 0 || i9 != 0) {
                this.s.i(this.t, left, top);
            }
        } else {
            int pointerCount2 = motionEvent.getPointerCount();
            while (i < pointerCount2) {
                int pointerId5 = motionEvent.getPointerId(i);
                if (v(pointerId5)) {
                    float x4 = motionEvent.getX(i);
                    float y4 = motionEvent.getY(i);
                    float f3 = x4 - this.f[pointerId5];
                    float f4 = y4 - this.g[pointerId5];
                    q(f3, f4, pointerId5);
                    if (this.d == 1) {
                        break;
                    }
                    View viewA3 = a((int) x4, (int) y4);
                    if (t(viewA3, f3, f4) && k(viewA3, pointerId5)) {
                        break;
                    }
                }
                i++;
            }
        }
        s(motionEvent);
    }

    final void f(int i) {
        this.v.removeCallbacks(this.w);
        if (this.d != i) {
            this.d = i;
            this.s.c(i);
            if (this.d == 0) {
                this.t = null;
            }
        }
    }

    public final boolean g(int i) {
        return ((1 << i) & this.m) != 0;
    }

    public final boolean h(int i, int i2) {
        if (this.u) {
            return u(i, i2, (int) this.n.getXVelocity(this.e), (int) this.n.getYVelocity(this.e));
        }
        throw new IllegalStateException("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00e4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean i(android.view.MotionEvent r18) {
        /*
            Method dump skipped, instructions count: 274
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ljn.i(android.view.MotionEvent):boolean");
    }

    public final boolean j(View view, int i, int i2) {
        this.t = view;
        this.e = -1;
        boolean zU = u(i, i2, 0, 0);
        if (zU || this.d != 0 || this.t == null) {
            return zU;
        }
        this.t = null;
        return false;
    }

    final boolean k(View view, int i) {
        if (view == this.t && this.e == i) {
            return true;
        }
        if (view == null || !this.s.e(view, i)) {
            return false;
        }
        this.e = i;
        d(view, i);
        return true;
    }

    public final boolean l() {
        if (this.d == 2) {
            OverScroller overScroller = this.r;
            boolean zComputeScrollOffset = overScroller.computeScrollOffset();
            int currX = overScroller.getCurrX();
            int currY = overScroller.getCurrY();
            int left = currX - this.t.getLeft();
            int top = currY - this.t.getTop();
            if (left != 0) {
                View view = this.t;
                int[] iArr = ley.a;
                view.offsetLeftAndRight(left);
            }
            if (top != 0) {
                View view2 = this.t;
                int[] iArr2 = ley.a;
                view2.offsetTopAndBottom(top);
            }
            if (left != 0 || top != 0) {
                this.s.i(this.t, currX, currY);
            }
            if (!zComputeScrollOffset) {
                this.v.post(this.w);
            } else if (currX == overScroller.getFinalX() && currY == overScroller.getFinalY()) {
                overScroller.abortAnimation();
                this.v.post(this.w);
            }
        }
        return this.d == 2;
    }
}
