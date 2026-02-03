package android.support.v7.widget;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.car.app.model.Alert;
import defpackage.lhf;
import defpackage.lhg;
import defpackage.uc;
import defpackage.uk;
import defpackage.vc;
import defpackage.wa;
import defpackage.wb;
import defpackage.wc;
import defpackage.wj;
import defpackage.wq;
import defpackage.ws;
import defpackage.xd;
import defpackage.yf;
import defpackage.yg;
import defpackage.yh;
import defpackage.yj;
import defpackage.yk;
import defpackage.ym;
import defpackage.yn;
import java.util.BitSet;

/* compiled from: PG */
/* loaded from: classes.dex */
public class StaggeredGridLayoutManager extends wb implements wq {
    private final yg J;
    private boolean K;
    private final boolean L;
    private int[] M;
    private final Runnable N;
    yn[] a;
    public vc b;
    vc c;
    public int d;
    public boolean e;
    boolean f;
    public int g;
    public int h;
    public final yk i;
    public ym j;
    private int k;
    private int l;
    private final uc m;
    private BitSet n;
    private int o;
    private boolean p;
    private boolean q;
    private int r;
    private final Rect s;

    public StaggeredGridLayoutManager(int i) {
        this.k = -1;
        this.e = false;
        this.f = false;
        this.g = -1;
        this.h = Integer.MIN_VALUE;
        this.i = new yk();
        this.o = 2;
        this.s = new Rect();
        this.J = new yg(this);
        this.K = false;
        this.L = true;
        this.N = new yf(this);
        this.d = 1;
        J(i);
        this.m = new uc();
        ad();
    }

    private final int O(int i) {
        if (as() == 0) {
            return this.f ? 1 : -1;
        }
        return (i < c()) != this.f ? -1 : 1;
    }

    private final int R(ws wsVar) {
        if (as() == 0) {
            return 0;
        }
        vc vcVar = this.b;
        boolean z = this.L;
        boolean z2 = !z;
        return xd.a(wsVar, vcVar, r(z2), l(z2), this, z);
    }

    private final int S(ws wsVar) {
        if (as() == 0) {
            return 0;
        }
        vc vcVar = this.b;
        boolean z = this.L;
        boolean z2 = !z;
        return xd.b(wsVar, vcVar, r(z2), l(z2), this, z, this.f);
    }

    private final int V(ws wsVar) {
        if (as() == 0) {
            return 0;
        }
        vc vcVar = this.b;
        boolean z = this.L;
        boolean z2 = !z;
        return xd.c(wsVar, vcVar, r(z2), l(z2), this, z);
    }

    /* JADX WARN: Removed duplicated region for block: B:140:0x0299  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x02b5  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0302  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0306  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x030d  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0326  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x032a  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0331  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0337  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final int W(defpackage.wj r24, defpackage.uc r25, defpackage.ws r26) {
        /*
            Method dump skipped, instructions count: 929
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.StaggeredGridLayoutManager.W(wj, uc, ws):int");
    }

    private final int ab(int i) {
        int iD = this.a[0].d(i);
        for (int i2 = 1; i2 < this.k; i2++) {
            int iD2 = this.a[i2].d(i);
            if (iD2 > iD) {
                iD = iD2;
            }
        }
        return iD;
    }

    private final int ac(int i) {
        int iF = this.a[0].f(i);
        for (int i2 = 1; i2 < this.k; i2++) {
            int iF2 = this.a[i2].f(i);
            if (iF2 < iF) {
                iF = iF2;
            }
        }
        return iF;
    }

    private final void ad() {
        this.b = vc.p(this, this.d);
        this.c = vc.p(this, 1 - this.d);
    }

    private final void ah(wj wjVar, ws wsVar, boolean z) {
        int iF;
        int i;
        int iAb = ab(Integer.MIN_VALUE);
        if (iAb != Integer.MIN_VALUE && (iF = this.b.f() - iAb) > 0) {
            int i2 = -k(-iF, wjVar, wsVar);
            if (!z || (i = iF - i2) <= 0) {
                return;
            }
            this.b.n(i);
        }
    }

    private final void aj(wj wjVar, ws wsVar, boolean z) {
        int iJ;
        int iAc = ac(Alert.DURATION_SHOW_INDEFINITELY);
        if (iAc != Integer.MAX_VALUE && (iJ = iAc - this.b.j()) > 0) {
            int iK = iJ - k(iJ, wjVar, wsVar);
            if (!z || iK <= 0) {
                return;
            }
            this.b.n(-iK);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void an(int r8, int r9, int r10) {
        /*
            r7 = this;
            boolean r0 = r7.f
            if (r0 == 0) goto L9
            int r0 = r7.i()
            goto Ld
        L9:
            int r0 = r7.c()
        Ld:
            r1 = 8
            if (r10 != r1) goto L1a
            if (r8 >= r9) goto L16
            int r2 = r9 + 1
            goto L1c
        L16:
            int r2 = r8 + 1
            r3 = r9
            goto L1d
        L1a:
            int r2 = r8 + r9
        L1c:
            r3 = r8
        L1d:
            yk r4 = r7.i
            r4.i(r3)
            r5 = 1
            if (r10 == r5) goto L36
            r6 = 2
            if (r10 == r6) goto L32
            if (r10 == r1) goto L2b
            goto L39
        L2b:
            r4.f(r8, r5)
            r4.e(r9, r5)
            goto L39
        L32:
            r4.f(r8, r9)
            goto L39
        L36:
            r4.e(r8, r9)
        L39:
            if (r2 > r0) goto L3c
            goto L4e
        L3c:
            boolean r8 = r7.f
            if (r8 == 0) goto L45
            int r8 = r7.c()
            goto L49
        L45:
            int r8 = r7.i()
        L49:
            if (r3 > r8) goto L4e
            r7.bb()
        L4e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.StaggeredGridLayoutManager.an(int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x03d7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void ao(defpackage.wj r12, defpackage.ws r13, boolean r14) {
        /*
            Method dump skipped, instructions count: 1017
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.StaggeredGridLayoutManager.ao(wj, ws, boolean):void");
    }

    private final void ap(wj wjVar, uc ucVar) {
        if (!ucVar.a || ucVar.i) {
            return;
        }
        if (ucVar.b == 0) {
            if (ucVar.e == -1) {
                bD(wjVar, ucVar.g);
                return;
            } else {
                bE(wjVar, ucVar.f);
                return;
            }
        }
        int i = 1;
        if (ucVar.e == -1) {
            int i2 = ucVar.f;
            int iF = this.a[0].f(i2);
            while (i < this.k) {
                int iF2 = this.a[i].f(i2);
                if (iF2 > iF) {
                    iF = iF2;
                }
                i++;
            }
            int i3 = i2 - iF;
            bD(wjVar, i3 < 0 ? ucVar.g : ucVar.g - Math.min(i3, ucVar.b));
            return;
        }
        int i4 = ucVar.g;
        int iD = this.a[0].d(i4);
        while (i < this.k) {
            int iD2 = this.a[i].d(i4);
            if (iD2 < iD) {
                iD = iD2;
            }
            i++;
        }
        int i5 = iD - ucVar.g;
        bE(wjVar, i5 < 0 ? ucVar.f : Math.min(i5, ucVar.b) + ucVar.f);
    }

    private final void bD(wj wjVar, int i) {
        int iAs = as();
        while (true) {
            iAs--;
            if (iAs < 0) {
                return;
            }
            View viewAE = aE(iAs);
            if (this.b.d(viewAE) < i || this.b.m(viewAE) < i) {
                return;
            }
            yh yhVar = (yh) viewAE.getLayoutParams();
            if (yhVar.b) {
                for (int i2 = 0; i2 < this.k; i2++) {
                    if (this.a[i2].a.size() == 1) {
                        return;
                    }
                }
                for (int i3 = 0; i3 < this.k; i3++) {
                    this.a[i3].m();
                }
            } else if (yhVar.a.a.size() == 1) {
                return;
            } else {
                yhVar.a.m();
            }
            aY(viewAE, wjVar);
        }
    }

    private final void bE(wj wjVar, int i) {
        while (as() > 0) {
            View viewAE = aE(0);
            if (this.b.a(viewAE) > i || this.b.l(viewAE) > i) {
                return;
            }
            yh yhVar = (yh) viewAE.getLayoutParams();
            if (yhVar.b) {
                for (int i2 = 0; i2 < this.k; i2++) {
                    if (this.a[i2].a.size() == 1) {
                        return;
                    }
                }
                for (int i3 = 0; i3 < this.k; i3++) {
                    this.a[i3].n();
                }
            } else if (yhVar.a.a.size() == 1) {
                return;
            } else {
                yhVar.a.n();
            }
            aY(viewAE, wjVar);
        }
    }

    private final void bF() {
        this.f = (this.d == 1 || !M()) ? this.e : !this.e;
    }

    private final void bG(int i) {
        uc ucVar = this.m;
        ucVar.e = i;
        ucVar.d = this.f != (i == -1) ? -1 : 1;
    }

    private final void bH(int i, int i2) {
        for (int i3 = 0; i3 < this.k; i3++) {
            if (!this.a[i3].a.isEmpty()) {
                bJ(this.a[i3], i, i2);
            }
        }
    }

    private final void bI(int i, ws wsVar) {
        int iK;
        int iK2;
        int i2;
        uc ucVar = this.m;
        boolean z = false;
        ucVar.b = 0;
        ucVar.c = i;
        if (!bl() || (i2 = wsVar.a) == -1) {
            iK = 0;
            iK2 = 0;
        } else {
            if (this.f == (i2 < i)) {
                iK = this.b.k();
                iK2 = 0;
            } else {
                iK2 = this.b.k();
                iK = 0;
            }
        }
        if (bj()) {
            ucVar.f = this.b.j() - iK2;
            ucVar.g = this.b.f() + iK;
        } else {
            ucVar.g = this.b.e() + iK;
            ucVar.f = -iK2;
        }
        ucVar.h = false;
        ucVar.a = true;
        if (this.b.h() == 0 && this.b.e() == 0) {
            z = true;
        }
        ucVar.i = z;
    }

    private final void bJ(yn ynVar, int i, int i2) {
        int i3 = ynVar.d;
        if (i == -1) {
            if (ynVar.e() + i3 <= i2) {
                this.n.set(ynVar.e, false);
            }
        } else if (ynVar.c() - i3 >= i2) {
            this.n.set(ynVar.e, false);
        }
    }

    private final boolean bK(int i) {
        int i2 = this.d;
        boolean z = i == -1;
        if (i2 == 0) {
            return z != this.f;
        }
        return (z == this.f) == M();
    }

    private final void bL(View view, int i, int i2) {
        Rect rect = this.s;
        aK(view, rect);
        yh yhVar = (yh) view.getLayoutParams();
        int iBM = bM(i, yhVar.leftMargin + rect.left, yhVar.rightMargin + rect.right);
        int iBM2 = bM(i2, yhVar.topMargin + rect.top, yhVar.bottomMargin + rect.bottom);
        if (bn(view, iBM, iBM2, yhVar)) {
            view.measure(iBM, iBM2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x000e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final int bM(int r3, int r4, int r5) {
        /*
            r0 = 0
            if (r4 != 0) goto L6
            if (r5 == 0) goto L14
            r4 = r0
        L6:
            int r1 = android.view.View.MeasureSpec.getMode(r3)
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r1 == r2) goto L15
            r2 = 1073741824(0x40000000, float:2.0)
            if (r1 != r2) goto L14
            r1 = r2
            goto L15
        L14:
            return r3
        L15:
            int r3 = android.view.View.MeasureSpec.getSize(r3)
            int r3 = r3 - r4
            int r3 = r3 - r5
            int r3 = java.lang.Math.max(r0, r3)
            int r3 = android.view.View.MeasureSpec.makeMeasureSpec(r3, r1)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.StaggeredGridLayoutManager.bM(int, int, int):int");
    }

    @Override // defpackage.wb
    public final void A(int i, int i2) {
        an(i, i2, 2);
    }

    @Override // defpackage.wb
    public final void B(int i, int i2) {
        an(i, i2, 4);
    }

    @Override // defpackage.wb
    public final int C(ws wsVar) {
        return R(wsVar);
    }

    @Override // defpackage.wb
    public final int D(ws wsVar) {
        return S(wsVar);
    }

    @Override // defpackage.wb
    public final int E(ws wsVar) {
        return V(wsVar);
    }

    @Override // defpackage.wb
    public final int F(ws wsVar) {
        return R(wsVar);
    }

    @Override // defpackage.wb
    public final int G(ws wsVar) {
        return S(wsVar);
    }

    @Override // defpackage.wb
    public final int H(ws wsVar) {
        return V(wsVar);
    }

    public final void I(boolean z) {
        U(null);
        ym ymVar = this.j;
        if (ymVar != null && ymVar.h != z) {
            ymVar.h = z;
        }
        this.e = z;
        bb();
    }

    public final void J(int i) {
        U(null);
        if (i != this.k) {
            this.i.c();
            bb();
            this.k = i;
            this.n = new BitSet(i);
            this.a = new yn[this.k];
            for (int i2 = 0; i2 < this.k; i2++) {
                this.a[i2] = new yn(this, i2);
            }
            bb();
        }
    }

    final void K(int i) {
        this.l = i / this.k;
        this.r = View.MeasureSpec.makeMeasureSpec(i, this.c.h());
    }

    public final boolean L() {
        int iC;
        int i;
        if (as() != 0 && this.o != 0 && this.z) {
            if (this.f) {
                iC = i();
                i = c();
            } else {
                iC = c();
                i = i();
            }
            if (iC == 0) {
                if (s() != null) {
                    this.i.c();
                    bc();
                    bb();
                    return true;
                }
                iC = 0;
            }
            if (this.K) {
                int i2 = true != this.f ? 1 : -1;
                yk ykVar = this.i;
                int i3 = i + 1;
                yj yjVarH = ykVar.h(iC, i3, i2);
                if (yjVarH == null) {
                    this.K = false;
                    ykVar.g(i3);
                    return false;
                }
                yj yjVarH2 = ykVar.h(iC, yjVarH.a, -i2);
                if (yjVarH2 == null) {
                    ykVar.g(yjVarH.a);
                } else {
                    ykVar.g(yjVarH2.a + 1);
                }
                bc();
                bb();
                return true;
            }
        }
        return false;
    }

    final boolean M() {
        return av() == 1;
    }

    public final void N() {
        U(null);
        if (this.o == 2) {
            return;
        }
        this.o = 2;
        bb();
    }

    @Override // defpackage.wq
    public final PointF P(int i) {
        int iO = O(i);
        PointF pointF = new PointF();
        if (iO == 0) {
            return null;
        }
        float f = iO;
        if (this.d == 0) {
            pointF.x = f;
            pointF.y = 0.0f;
            return pointF;
        }
        pointF.x = 0.0f;
        pointF.y = f;
        return pointF;
    }

    @Override // defpackage.wb
    public final Parcelable Q() {
        int iF;
        int iJ;
        int[] iArr;
        ym ymVar = this.j;
        if (ymVar != null) {
            return new ym(ymVar);
        }
        ym ymVar2 = new ym();
        ymVar2.h = this.e;
        ymVar2.i = this.p;
        ymVar2.j = this.q;
        yk ykVar = this.i;
        if (ykVar == null || (iArr = ykVar.a) == null) {
            ymVar2.e = 0;
        } else {
            ymVar2.f = iArr;
            ymVar2.e = ymVar2.f.length;
            ymVar2.g = ykVar.b;
        }
        if (as() <= 0) {
            ymVar2.a = -1;
            ymVar2.b = -1;
            ymVar2.c = 0;
            return ymVar2;
        }
        ymVar2.a = this.p ? i() : c();
        View viewL = this.f ? l(true) : r(true);
        ymVar2.b = viewL != null ? bu(viewL) : -1;
        int i = this.k;
        ymVar2.c = i;
        ymVar2.d = new int[i];
        for (int i2 = 0; i2 < this.k; i2++) {
            if (this.p) {
                iF = this.a[i2].d(Integer.MIN_VALUE);
                if (iF != Integer.MIN_VALUE) {
                    iJ = this.b.f();
                    iF -= iJ;
                }
            } else {
                iF = this.a[i2].f(Integer.MIN_VALUE);
                if (iF != Integer.MIN_VALUE) {
                    iJ = this.b.j();
                    iF -= iJ;
                }
            }
            ymVar2.d[i2] = iF;
        }
        return ymVar2;
    }

    @Override // defpackage.wb
    public final void U(String str) {
        if (this.j == null) {
            super.U(str);
        }
    }

    @Override // defpackage.wb
    public void X(RecyclerView recyclerView, wj wjVar) {
        bB(this.N);
        for (int i = 0; i < this.k; i++) {
            this.a[i].k();
        }
        recyclerView.requestLayout();
    }

    @Override // defpackage.wb
    public final void Y(AccessibilityEvent accessibilityEvent) {
        super.Y(accessibilityEvent);
        if (as() > 0) {
            View viewR = r(false);
            View viewL = l(false);
            if (viewR == null || viewL == null) {
                return;
            }
            int iBu = bu(viewR);
            int iBu2 = bu(viewL);
            if (iBu < iBu2) {
                accessibilityEvent.setFromIndex(iBu);
                accessibilityEvent.setToIndex(iBu2);
            } else {
                accessibilityEvent.setFromIndex(iBu2);
                accessibilityEvent.setToIndex(iBu);
            }
        }
    }

    @Override // defpackage.wb
    public final void Z(Parcelable parcelable) {
        if (parcelable instanceof ym) {
            ym ymVar = (ym) parcelable;
            this.j = ymVar;
            if (this.g != -1) {
                ymVar.a();
                this.j.b();
            }
            bb();
        }
    }

    @Override // defpackage.wb
    public final void aQ(int i) {
        super.aQ(i);
        for (int i2 = 0; i2 < this.k; i2++) {
            this.a[i2].l(i);
        }
    }

    @Override // defpackage.wb
    public final void aR(int i) {
        super.aR(i);
        for (int i2 = 0; i2 < this.k; i2++) {
            this.a[i2].l(i);
        }
    }

    @Override // defpackage.wb
    public final void aU(int i) {
        if (i == 0) {
            L();
        }
    }

    @Override // defpackage.wb
    public final void aa(int i) {
        ym ymVar = this.j;
        if (ymVar != null && ymVar.a != i) {
            ymVar.a();
        }
        this.g = i;
        this.h = Integer.MIN_VALUE;
        bb();
    }

    @Override // defpackage.wb
    public final boolean ae() {
        return this.d == 0;
    }

    @Override // defpackage.wb
    public final boolean af() {
        return this.d == 1;
    }

    @Override // defpackage.wb
    public final boolean ag() {
        return this.o != 0;
    }

    @Override // defpackage.wb
    public final boolean ai() {
        return this.e;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x001c  */
    @Override // defpackage.wb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void al(int r5, int r6, defpackage.ws r7, defpackage.tw r8) {
        /*
            r4 = this;
            r0 = 1
            int r1 = r4.d
            if (r0 != r1) goto L6
            r5 = r6
        L6:
            int r6 = r4.as()
            if (r6 == 0) goto L76
            if (r5 != 0) goto Lf
            goto L76
        Lf:
            r4.w(r5, r7)
            int[] r5 = r4.M
            r6 = 0
            if (r5 == 0) goto L1c
            int r0 = r4.k
            int r5 = r5.length
            if (r5 >= r0) goto L22
        L1c:
            int r5 = r4.k
            int[] r5 = new int[r5]
            r4.M = r5
        L22:
            r5 = r6
            r0 = r5
        L24:
            int r1 = r4.k
            if (r5 >= r1) goto L54
            uc r1 = r4.m
            int r2 = r1.d
            r3 = -1
            if (r2 != r3) goto L3b
            int r1 = r1.f
            yn[] r2 = r4.a
            r2 = r2[r5]
            int r2 = r2.f(r1)
            int r1 = r1 - r2
            goto L49
        L3b:
            yn[] r2 = r4.a
            r2 = r2[r5]
            int r3 = r1.g
            int r2 = r2.d(r3)
            int r1 = r1.g
            int r1 = r2 - r1
        L49:
            if (r1 < 0) goto L51
            int[] r2 = r4.M
            r2[r0] = r1
            int r0 = r0 + 1
        L51:
            int r5 = r5 + 1
            goto L24
        L54:
            int[] r5 = r4.M
            java.util.Arrays.sort(r5, r6, r0)
        L59:
            if (r6 >= r0) goto L76
            uc r5 = r4.m
            boolean r1 = r5.a(r7)
            if (r1 == 0) goto L76
            int r1 = r5.c
            int[] r2 = r4.M
            r2 = r2[r6]
            r8.a(r1, r2)
            int r1 = r5.c
            int r2 = r5.d
            int r1 = r1 + r2
            r5.c = r1
            int r6 = r6 + 1
            goto L59
        L76:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.StaggeredGridLayoutManager.al(int, int, ws, tw):void");
    }

    @Override // defpackage.wb
    public final void aq(RecyclerView recyclerView, int i) {
        uk ukVar = new uk(recyclerView.getContext());
        ukVar.g = i;
        bi(ukVar);
    }

    @Override // defpackage.wb
    public final int bS(wj wjVar, ws wsVar) {
        if (this.d == 1) {
            return Math.min(this.k, wsVar.a());
        }
        return -1;
    }

    @Override // defpackage.wb
    public final int bT(wj wjVar, ws wsVar) {
        if (this.d == 0) {
            return Math.min(this.k, wsVar.a());
        }
        return -1;
    }

    @Override // defpackage.wb
    public final wc bU(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new yh((ViewGroup.MarginLayoutParams) layoutParams) : new yh(layoutParams);
    }

    @Override // defpackage.wb
    public final void bz() {
        this.i.c();
        for (int i = 0; i < this.k; i++) {
            this.a[i].k();
        }
    }

    final int c() {
        if (as() == 0) {
            return 0;
        }
        return bu(aE(0));
    }

    @Override // defpackage.wb
    public final int d(int i, wj wjVar, ws wsVar) {
        return k(i, wjVar, wsVar);
    }

    @Override // defpackage.wb
    public final int e(int i, wj wjVar, ws wsVar) {
        return k(i, wjVar, wsVar);
    }

    @Override // defpackage.wb
    public final wc f() {
        return this.d == 0 ? new yh(-2, -1) : new yh(-1, -2);
    }

    @Override // defpackage.wb
    public final wc h(Context context, AttributeSet attributeSet) {
        return new yh(context, attributeSet);
    }

    final int i() {
        int iAs = as();
        if (iAs == 0) {
            return 0;
        }
        return bu(aE(iAs - 1));
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0052  */
    @Override // defpackage.wb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View j(android.view.View r10, int r11, defpackage.wj r12, defpackage.ws r13) {
        /*
            Method dump skipped, instructions count: 335
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.StaggeredGridLayoutManager.j(android.view.View, int, wj, ws):android.view.View");
    }

    final int k(int i, wj wjVar, ws wsVar) {
        if (as() == 0 || i == 0) {
            return 0;
        }
        w(i, wsVar);
        uc ucVar = this.m;
        int iW = W(wjVar, ucVar, wsVar);
        if (ucVar.b >= iW) {
            i = i < 0 ? -iW : iW;
        }
        this.b.n(-i);
        this.p = this.f;
        ucVar.b = 0;
        ap(wjVar, ucVar);
        return i;
    }

    final View l(boolean z) {
        int iJ = this.b.j();
        int iF = this.b.f();
        View view = null;
        for (int iAs = as() - 1; iAs >= 0; iAs--) {
            View viewAE = aE(iAs);
            int iD = this.b.d(viewAE);
            int iA = this.b.a(viewAE);
            if (iA > iJ && iD < iF) {
                if (iA <= iF || !z) {
                    return viewAE;
                }
                if (view == null) {
                    view = viewAE;
                }
            }
        }
        return view;
    }

    @Override // defpackage.wb
    public final void m(wj wjVar, ws wsVar, lhg lhgVar) {
        super.m(wjVar, wsVar, lhgVar);
        lhgVar.s("android.support.v7.widget.StaggeredGridLayoutManager");
    }

    @Override // defpackage.wb
    public final void n(wj wjVar, ws wsVar, View view, lhg lhgVar) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof yh)) {
            super.aT(view, lhgVar);
            return;
        }
        yh yhVar = (yh) layoutParams;
        if (this.d == 0) {
            lhgVar.v(lhf.a(yhVar.d(), yhVar.b ? this.k : 1, -1, -1, false));
        } else {
            lhgVar.v(lhf.a(-1, -1, yhVar.d(), yhVar.b ? this.k : 1, false));
        }
    }

    @Override // defpackage.wb
    public final void o(wj wjVar, ws wsVar) {
        ao(wjVar, wsVar, true);
    }

    @Override // defpackage.wb
    public final void p(ws wsVar) {
        this.g = -1;
        this.h = Integer.MIN_VALUE;
        this.j = null;
        this.J.a();
    }

    @Override // defpackage.wb
    public final void q(Rect rect, int i, int i2) {
        int iAr;
        int iAr2;
        int iAz = az() + aA();
        int iAB = aB() + ay();
        if (this.d == 1) {
            iAr2 = ar(i2, rect.height() + iAB, aw());
            iAr = ar(i, (this.l * this.k) + iAz, ax());
        } else {
            iAr = ar(i, rect.width() + iAz, ax());
            iAr2 = ar(i2, (this.l * this.k) + iAB, aw());
        }
        bf(iAr, iAr2);
    }

    final View r(boolean z) {
        int iJ = this.b.j();
        int iF = this.b.f();
        int iAs = as();
        View view = null;
        for (int i = 0; i < iAs; i++) {
            View viewAE = aE(i);
            int iD = this.b.d(viewAE);
            if (this.b.a(viewAE) > iJ && iD < iF) {
                if (iD >= iJ || !z) {
                    return viewAE;
                }
                if (view == null) {
                    view = viewAE;
                }
            }
        }
        return view;
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00b2 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00e2 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00a0 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x002e A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final android.view.View s() {
        /*
            Method dump skipped, instructions count: 229
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.StaggeredGridLayoutManager.s():android.view.View");
    }

    @Override // defpackage.wb
    public final boolean t(wc wcVar) {
        return wcVar instanceof yh;
    }

    @Override // defpackage.wb
    public final boolean v() {
        return this.j == null;
    }

    final void w(int i, ws wsVar) {
        int iC;
        int i2;
        if (i > 0) {
            iC = i();
            i2 = 1;
        } else {
            iC = c();
            i2 = -1;
        }
        uc ucVar = this.m;
        ucVar.a = true;
        bI(iC, wsVar);
        bG(i2);
        ucVar.c = iC + ucVar.d;
        ucVar.b = Math.abs(i);
    }

    @Override // defpackage.wb
    public final void x(int i, int i2) {
        an(i, i2, 1);
    }

    @Override // defpackage.wb
    public final void y() {
        this.i.c();
        bb();
    }

    @Override // defpackage.wb
    public final void z(int i, int i2) {
        an(i, i2, 8);
    }

    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        this.k = -1;
        this.e = false;
        this.f = false;
        this.g = -1;
        this.h = Integer.MIN_VALUE;
        this.i = new yk();
        this.o = 2;
        this.s = new Rect();
        this.J = new yg(this);
        this.K = false;
        this.L = true;
        this.N = new yf(this);
        wa waVarAC = aC(context, attributeSet, i, i2);
        int i3 = waVarAC.a;
        if (i3 != 0 && i3 != 1) {
            throw new IllegalArgumentException("invalid orientation.");
        }
        U(null);
        if (i3 != this.d) {
            this.d = i3;
            vc vcVar = this.b;
            this.b = this.c;
            this.c = vcVar;
            bb();
        }
        J(waVarAC.b);
        I(waVarAC.c);
        this.m = new uc();
        ad();
    }
}
