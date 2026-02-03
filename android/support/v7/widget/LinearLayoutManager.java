package android.support.v7.widget;

import android.content.Context;
import android.graphics.PointF;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import defpackage.a;
import defpackage.aal;
import defpackage.lhd;
import defpackage.lhg;
import defpackage.tw;
import defpackage.uf;
import defpackage.ug;
import defpackage.uh;
import defpackage.uj;
import defpackage.uk;
import defpackage.vc;
import defpackage.vo;
import defpackage.wa;
import defpackage.wb;
import defpackage.wc;
import defpackage.wj;
import defpackage.wq;
import defpackage.ws;
import defpackage.xd;

/* compiled from: PG */
/* loaded from: classes.dex */
public class LinearLayoutManager extends wb implements aal, wq {
    private uh a;
    private boolean b;
    private boolean c;
    private final ug d;
    private int e;
    private int[] f;
    public int k;
    vc l;
    public boolean m;
    boolean n;
    public boolean o;
    int p;
    int q;
    uj r;
    final uf s;

    public LinearLayoutManager() {
        this(1);
    }

    private final int bD(ws wsVar) {
        if (as() == 0) {
            return 0;
        }
        W();
        return xd.c(wsVar, this.l, ao(!this.c), an(!this.c), this, this.c);
    }

    private final int bE(int i, wj wjVar, ws wsVar, boolean z) {
        int iF;
        int iF2 = this.l.f() - i;
        if (iF2 <= 0) {
            return 0;
        }
        int i2 = -O(-iF2, wjVar, wsVar);
        int i3 = i + i2;
        if (!z || (iF = this.l.f() - i3) <= 0) {
            return i2;
        }
        this.l.n(iF);
        return iF + i2;
    }

    private final int bF(int i, wj wjVar, ws wsVar, boolean z) {
        int iJ;
        int iJ2 = i - this.l.j();
        if (iJ2 <= 0) {
            return 0;
        }
        int i2 = -O(iJ2, wjVar, wsVar);
        int i3 = i + i2;
        if (!z || (iJ = i3 - this.l.j()) <= 0) {
            return i2;
        }
        this.l.n(-iJ);
        return i2 - iJ;
    }

    private final View bG() {
        return R(0, as());
    }

    private final View bH() {
        return R(as() - 1, -1);
    }

    private final View bI() {
        return aE(this.n ? 0 : as() - 1);
    }

    private final View bJ() {
        return aE(this.n ? as() - 1 : 0);
    }

    private final void bK(wj wjVar, uh uhVar) {
        if (!uhVar.a || uhVar.m) {
            return;
        }
        int i = uhVar.g;
        int i2 = uhVar.i;
        if (uhVar.f == -1) {
            int iAs = as();
            if (i >= 0) {
                int iE = (this.l.e() - i) + i2;
                if (this.n) {
                    for (int i3 = 0; i3 < iAs; i3++) {
                        View viewAE = aE(i3);
                        if (this.l.d(viewAE) < iE || this.l.m(viewAE) < iE) {
                            bL(wjVar, 0, i3);
                            return;
                        }
                    }
                    return;
                }
                int i4 = iAs - 1;
                for (int i5 = i4; i5 >= 0; i5--) {
                    View viewAE2 = aE(i5);
                    if (this.l.d(viewAE2) < iE || this.l.m(viewAE2) < iE) {
                        bL(wjVar, i4, i5);
                        return;
                    }
                }
                return;
            }
            return;
        }
        if (i >= 0) {
            int i6 = i - i2;
            int iAs2 = as();
            if (!this.n) {
                for (int i7 = 0; i7 < iAs2; i7++) {
                    View viewAE3 = aE(i7);
                    if (this.l.a(viewAE3) > i6 || this.l.l(viewAE3) > i6) {
                        bL(wjVar, 0, i7);
                        return;
                    }
                }
                return;
            }
            int i8 = iAs2 - 1;
            for (int i9 = i8; i9 >= 0; i9--) {
                View viewAE4 = aE(i9);
                if (this.l.a(viewAE4) > i6 || this.l.l(viewAE4) > i6) {
                    bL(wjVar, i8, i9);
                    return;
                }
            }
        }
    }

    private final void bL(wj wjVar, int i, int i2) {
        if (i == i2) {
            return;
        }
        if (i2 <= i) {
            while (i > i2) {
                aZ(i, wjVar);
                i--;
            }
        } else {
            while (true) {
                i2--;
                if (i2 < i) {
                    return;
                } else {
                    aZ(i2, wjVar);
                }
            }
        }
    }

    private final void bM() {
        this.n = (this.k == 1 || !ah()) ? this.m : !this.m;
    }

    private final void bN(int i, int i2, boolean z, ws wsVar) {
        int iJ;
        this.a.m = aj();
        this.a.f = i;
        int[] iArr = this.f;
        iArr[0] = 0;
        iArr[1] = 0;
        V(wsVar, iArr);
        int iMax = Math.max(0, this.f[0]);
        int iMax2 = Math.max(0, this.f[1]);
        int i3 = i == 1 ? iMax2 : iMax;
        uh uhVar = this.a;
        uhVar.h = i3;
        if (i != 1) {
            iMax = iMax2;
        }
        uhVar.i = iMax;
        if (i == 1) {
            uhVar.h = i3 + this.l.g();
            View viewBI = bI();
            uh uhVar2 = this.a;
            uhVar2.e = true == this.n ? -1 : 1;
            int iBu = bu(viewBI);
            uh uhVar3 = this.a;
            uhVar2.d = iBu + uhVar3.e;
            uhVar3.b = this.l.a(viewBI);
            iJ = this.l.a(viewBI) - this.l.f();
        } else {
            View viewBJ = bJ();
            this.a.h += this.l.j();
            uh uhVar4 = this.a;
            uhVar4.e = true != this.n ? -1 : 1;
            int iBu2 = bu(viewBJ);
            uh uhVar5 = this.a;
            uhVar4.d = iBu2 + uhVar5.e;
            uhVar5.b = this.l.d(viewBJ);
            iJ = (-this.l.d(viewBJ)) + this.l.j();
        }
        uh uhVar6 = this.a;
        uhVar6.c = i2;
        if (z) {
            uhVar6.c = i2 - iJ;
        }
        uhVar6.g = iJ;
    }

    private final void bO(uf ufVar) {
        bP(ufVar.b, ufVar.c);
    }

    private final void bP(int i, int i2) {
        this.a.c = this.l.f() - i2;
        uh uhVar = this.a;
        uhVar.e = true != this.n ? 1 : -1;
        uhVar.d = i;
        uhVar.f = 1;
        uhVar.b = i2;
        uhVar.g = Integer.MIN_VALUE;
    }

    private final void bQ(uf ufVar) {
        bR(ufVar.b, ufVar.c);
    }

    private final void bR(int i, int i2) {
        this.a.c = i2 - this.l.j();
        uh uhVar = this.a;
        uhVar.d = i;
        uhVar.e = true != this.n ? -1 : 1;
        uhVar.f = -1;
        uhVar.b = i2;
        uhVar.g = Integer.MIN_VALUE;
    }

    private final int c(ws wsVar) {
        if (as() == 0) {
            return 0;
        }
        W();
        return xd.a(wsVar, this.l, ao(!this.c), an(!this.c), this, this.c);
    }

    private final int r(ws wsVar) {
        if (as() == 0) {
            return 0;
        }
        W();
        return xd.b(wsVar, this.l, ao(!this.c), an(!this.c), this, this.c, this.n);
    }

    @Override // defpackage.wb
    public final int C(ws wsVar) {
        return c(wsVar);
    }

    @Override // defpackage.wb
    public final int D(ws wsVar) {
        return r(wsVar);
    }

    @Override // defpackage.wb
    public final int E(ws wsVar) {
        return bD(wsVar);
    }

    @Override // defpackage.wb
    public final int F(ws wsVar) {
        return c(wsVar);
    }

    @Override // defpackage.wb
    public final int G(ws wsVar) {
        return r(wsVar);
    }

    @Override // defpackage.wb
    public final int H(ws wsVar) {
        return bD(wsVar);
    }

    final int I(int i) {
        int i2 = -1;
        int i3 = 1;
        if (i == 1) {
            return (this.k != 1 && ah()) ? 1 : -1;
        }
        if (i == 2) {
            return (this.k != 1 && ah()) ? -1 : 1;
        }
        if (i == 17) {
            i3 = 0;
        } else if (i != 33) {
            if (i != 66) {
                return (i == 130 && this.k == 1) ? 1 : Integer.MIN_VALUE;
            }
            i2 = 1;
            i3 = 0;
        }
        if (this.k == i3) {
            return i2;
        }
        return Integer.MIN_VALUE;
    }

    final int J(wj wjVar, uh uhVar, ws wsVar, boolean z) {
        int i = uhVar.c;
        int i2 = uhVar.g;
        if (i2 != Integer.MIN_VALUE) {
            if (i < 0) {
                uhVar.g = i2 + i;
            }
            bK(wjVar, uhVar);
        }
        int i3 = uhVar.c + uhVar.h;
        ug ugVar = this.d;
        while (true) {
            if ((!uhVar.m && i3 <= 0) || !uhVar.d(wsVar)) {
                break;
            }
            ugVar.a = 0;
            ugVar.b = false;
            ugVar.c = false;
            ugVar.d = false;
            k(wjVar, wsVar, uhVar, ugVar);
            if (!ugVar.b) {
                int i4 = uhVar.b;
                int i5 = ugVar.a;
                uhVar.b = i4 + (uhVar.f * i5);
                if (!ugVar.c || uhVar.l != null || !wsVar.g) {
                    uhVar.c -= i5;
                    i3 -= i5;
                }
                int i6 = uhVar.g;
                if (i6 != Integer.MIN_VALUE) {
                    int i7 = i6 + i5;
                    uhVar.g = i7;
                    int i8 = uhVar.c;
                    if (i8 < 0) {
                        uhVar.g = i7 + i8;
                    }
                    bK(wjVar, uhVar);
                }
                if (z && ugVar.d) {
                    break;
                }
            } else {
                break;
            }
        }
        return i - uhVar.c;
    }

    public final int K() {
        View viewS = S(0, as(), true, false);
        if (viewS == null) {
            return -1;
        }
        return bu(viewS);
    }

    public final int L() {
        View viewS = S(0, as(), false, true);
        if (viewS == null) {
            return -1;
        }
        return bu(viewS);
    }

    public final int M() {
        View viewS = S(as() - 1, -1, false, true);
        if (viewS == null) {
            return -1;
        }
        return bu(viewS);
    }

    @Deprecated
    protected int N(ws wsVar) {
        if (wsVar.a != -1) {
            return this.l.k();
        }
        return 0;
    }

    final int O(int i, wj wjVar, ws wsVar) {
        if (as() != 0 && i != 0) {
            W();
            this.a.a = true;
            int i2 = i > 0 ? 1 : -1;
            int iAbs = Math.abs(i);
            bN(i2, iAbs, true, wsVar);
            uh uhVar = this.a;
            int iJ = uhVar.g + J(wjVar, uhVar, wsVar, false);
            if (iJ >= 0) {
                if (iAbs > iJ) {
                    i = i2 * iJ;
                }
                this.l.n(-i);
                this.a.k = i;
                return i;
            }
        }
        return 0;
    }

    @Override // defpackage.wq
    public final PointF P(int i) {
        if (as() == 0) {
            return null;
        }
        float f = (i < bu(aE(0))) != this.n ? -1 : 1;
        return this.k == 0 ? new PointF(f, 0.0f) : new PointF(0.0f, f);
    }

    @Override // defpackage.wb
    public final Parcelable Q() {
        uj ujVar = this.r;
        if (ujVar != null) {
            return new uj(ujVar);
        }
        uj ujVar2 = new uj();
        if (as() <= 0) {
            ujVar2.a();
            return ujVar2;
        }
        W();
        boolean z = this.b ^ this.n;
        ujVar2.c = z;
        if (z) {
            View viewBI = bI();
            ujVar2.b = this.l.f() - this.l.a(viewBI);
            ujVar2.a = bu(viewBI);
            return ujVar2;
        }
        View viewBJ = bJ();
        ujVar2.a = bu(viewBJ);
        ujVar2.b = this.l.d(viewBJ) - this.l.j();
        return ujVar2;
    }

    final View R(int i, int i2) {
        W();
        if (i2 <= i && i2 >= i) {
            return aE(i);
        }
        int iD = this.l.d(aE(i));
        int iJ = this.l.j();
        int i3 = iD < iJ ? 16388 : 4097;
        int i4 = iD < iJ ? 16644 : 4161;
        return this.k == 0 ? this.v.a(i, i2, i4, i3) : this.w.a(i, i2, i4, i3);
    }

    final View S(int i, int i2, boolean z, boolean z2) {
        W();
        int i3 = this.k;
        int i4 = true != z ? 320 : 24579;
        int i5 = true != z2 ? 0 : 320;
        return i3 == 0 ? this.v.a(i, i2, i4, i5) : this.w.a(i, i2, i4, i5);
    }

    @Override // defpackage.wb
    public final View T(int i) {
        int iAs = as();
        if (iAs == 0) {
            return null;
        }
        int iBu = i - bu(aE(0));
        if (iBu >= 0 && iBu < iAs) {
            View viewAE = aE(iBu);
            if (bu(viewAE) == i) {
                return viewAE;
            }
        }
        return super.T(i);
    }

    @Override // defpackage.wb
    public final void U(String str) {
        if (this.r == null) {
            super.U(str);
        }
    }

    protected void V(ws wsVar, int[] iArr) {
        int iN = N(wsVar);
        int i = this.a.f;
        int i2 = i == -1 ? 0 : iN;
        if (i != -1) {
            iN = 0;
        }
        iArr[0] = iN;
        iArr[1] = i2;
    }

    final void W() {
        if (this.a == null) {
            this.a = new uh();
        }
    }

    @Override // defpackage.wb
    public final void Y(AccessibilityEvent accessibilityEvent) {
        super.Y(accessibilityEvent);
        if (as() > 0) {
            accessibilityEvent.setFromIndex(L());
            accessibilityEvent.setToIndex(M());
        }
    }

    @Override // defpackage.wb
    public final void Z(Parcelable parcelable) {
        if (parcelable instanceof uj) {
            uj ujVar = (uj) parcelable;
            this.r = ujVar;
            if (this.p != -1) {
                ujVar.a();
            }
            bb();
        }
    }

    @Override // defpackage.wb
    public final void aa(int i) {
        this.p = i;
        this.q = Integer.MIN_VALUE;
        uj ujVar = this.r;
        if (ujVar != null) {
            ujVar.a();
        }
        bb();
    }

    public final void ab(int i, int i2) {
        this.p = i;
        this.q = i2;
        uj ujVar = this.r;
        if (ujVar != null) {
            ujVar.a();
        }
        bb();
    }

    public final void ac(int i) {
        if (i != 0 && i != 1) {
            throw new IllegalArgumentException(a.g(i, "invalid orientation:"));
        }
        U(null);
        if (i != this.k || this.l == null) {
            vc vcVarP = vc.p(this, i);
            this.l = vcVarP;
            this.s.a = vcVarP;
            this.k = i;
            bb();
        }
    }

    public final void ad(boolean z) {
        U(null);
        if (z == this.m) {
            return;
        }
        this.m = z;
        bb();
    }

    @Override // defpackage.wb
    public boolean ae() {
        return this.k == 0;
    }

    @Override // defpackage.wb
    public boolean af() {
        return this.k == 1;
    }

    @Override // defpackage.wb
    public final boolean ag() {
        return true;
    }

    protected final boolean ah() {
        return av() == 1;
    }

    @Override // defpackage.wb
    public final boolean ai() {
        return this.m;
    }

    final boolean aj() {
        return this.l.h() == 0 && this.l.e() == 0;
    }

    @Override // defpackage.wb
    public final boolean ak() {
        if (this.G != 1073741824 && this.F != 1073741824) {
            int iAs = as();
            for (int i = 0; i < iAs; i++) {
                ViewGroup.LayoutParams layoutParams = aE(i).getLayoutParams();
                if (layoutParams.width < 0 && layoutParams.height < 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // defpackage.wb
    public final void al(int i, int i2, ws wsVar, tw twVar) {
        if (1 == this.k) {
            i = i2;
        }
        if (as() == 0 || i == 0) {
            return;
        }
        W();
        bN(i > 0 ? 1 : -1, Math.abs(i), true, wsVar);
        w(wsVar, this.a, twVar);
    }

    @Override // defpackage.wb
    public final void am(int i, tw twVar) {
        boolean z;
        int i2;
        uj ujVar = this.r;
        if (ujVar == null || !ujVar.b()) {
            bM();
            z = this.n;
            i2 = this.p;
            if (i2 == -1) {
                i2 = z ? i - 1 : 0;
            }
        } else {
            z = ujVar.c;
            i2 = ujVar.a;
        }
        int i3 = true != z ? 1 : -1;
        for (int i4 = 0; i4 < this.e && i2 >= 0 && i2 < i; i4++) {
            twVar.a(i2, 0);
            i2 += i3;
        }
    }

    final View an(boolean z) {
        return this.n ? S(0, as(), z, true) : S(as() - 1, -1, z, true);
    }

    final View ao(boolean z) {
        return this.n ? S(as() - 1, -1, z, true) : S(0, as(), z, true);
    }

    @Override // defpackage.aal
    public final void ap(View view, View view2) {
        U("Cannot drop a view during a scroll or layout calculation");
        W();
        bM();
        int iBu = bu(view);
        int iBu2 = bu(view2);
        boolean z = this.n;
        char c = iBu < iBu2 ? (char) 1 : (char) 65535;
        if (z) {
            if (c == 1) {
                ab(iBu2, this.l.f() - (this.l.d(view2) + this.l.b(view)));
                return;
            } else {
                ab(iBu2, this.l.f() - this.l.a(view2));
                return;
            }
        }
        if (c == 65535) {
            ab(iBu2, this.l.d(view2));
        } else {
            ab(iBu2, this.l.a(view2) - this.l.b(view));
        }
    }

    @Override // defpackage.wb
    public void aq(RecyclerView recyclerView, int i) {
        uk ukVar = new uk(recyclerView.getContext());
        ukVar.g = i;
        bi(ukVar);
    }

    @Override // defpackage.wb
    public int d(int i, wj wjVar, ws wsVar) {
        if (this.k == 1) {
            return 0;
        }
        return O(i, wjVar, wsVar);
    }

    @Override // defpackage.wb
    public int e(int i, wj wjVar, ws wsVar) {
        if (this.k == 0) {
            return 0;
        }
        return O(i, wjVar, wsVar);
    }

    @Override // defpackage.wb
    public wc f() {
        return new wc(-2, -2);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0077  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.view.View i(defpackage.wj r17, defpackage.ws r18, boolean r19, boolean r20) {
        /*
            r16 = this;
            r0 = r16
            r0.W()
            int r1 = r0.as()
            r2 = 1
            r3 = 0
            if (r20 == 0) goto L15
            int r1 = r0.as()
            r4 = -1
            int r1 = r1 + r4
            r5 = r4
            goto L18
        L15:
            r4 = r1
            r5 = r2
            r1 = r3
        L18:
            int r6 = r18.a()
            vc r7 = r0.l
            int r7 = r7.j()
            vc r8 = r0.l
            int r8 = r8.f()
            r9 = 0
            r10 = r9
            r11 = r10
        L2b:
            if (r1 == r4) goto L7a
            android.view.View r12 = r0.aE(r1)
            int r13 = bu(r12)
            vc r14 = r0.l
            int r14 = r14.d(r12)
            vc r15 = r0.l
            int r15 = r15.a(r12)
            if (r13 < 0) goto L78
            if (r13 >= r6) goto L78
            android.view.ViewGroup$LayoutParams r13 = r12.getLayoutParams()
            wc r13 = (defpackage.wc) r13
            boolean r13 = r13.c()
            if (r13 == 0) goto L55
            if (r11 != 0) goto L78
            r11 = r12
            goto L78
        L55:
            if (r15 > r7) goto L5b
            if (r14 >= r7) goto L5b
            r13 = r2
            goto L5c
        L5b:
            r13 = r3
        L5c:
            if (r14 < r8) goto L62
            if (r15 <= r8) goto L62
            r14 = r2
            goto L63
        L62:
            r14 = r3
        L63:
            if (r13 != 0) goto L69
            if (r14 == 0) goto L68
            goto L69
        L68:
            return r12
        L69:
            if (r19 == 0) goto L71
            if (r14 == 0) goto L6e
            goto L73
        L6e:
            if (r9 != 0) goto L78
            goto L77
        L71:
            if (r13 == 0) goto L75
        L73:
            r10 = r12
            goto L78
        L75:
            if (r9 != 0) goto L78
        L77:
            r9 = r12
        L78:
            int r1 = r1 + r5
            goto L2b
        L7a:
            if (r9 == 0) goto L7d
            return r9
        L7d:
            if (r10 == 0) goto L80
            return r10
        L80:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.LinearLayoutManager.i(wj, ws, boolean, boolean):android.view.View");
    }

    @Override // defpackage.wb
    public View j(View view, int i, wj wjVar, ws wsVar) {
        int I;
        View viewBG;
        bM();
        if (as() == 0 || (I = I(i)) == Integer.MIN_VALUE) {
            return null;
        }
        W();
        bN(I, (int) (this.l.k() * 0.33333334f), false, wsVar);
        uh uhVar = this.a;
        uhVar.g = Integer.MIN_VALUE;
        uhVar.a = false;
        J(wjVar, uhVar, wsVar, true);
        if (I == -1) {
            viewBG = this.n ? bH() : bG();
            I = -1;
        } else {
            viewBG = this.n ? bG() : bH();
        }
        View viewBJ = I == -1 ? bJ() : bI();
        if (!viewBJ.hasFocusable()) {
            return viewBG;
        }
        if (viewBG == null) {
            return null;
        }
        return viewBJ;
    }

    public void k(wj wjVar, ws wsVar, uh uhVar, ug ugVar) {
        int iAz;
        int i;
        int i2;
        int iC;
        View viewA = uhVar.a(wjVar);
        if (viewA == null) {
            ugVar.b = true;
            return;
        }
        wc wcVar = (wc) viewA.getLayoutParams();
        if (uhVar.l == null) {
            if (this.n == (uhVar.f == -1)) {
                aI(viewA);
            } else {
                aJ(viewA, 0);
            }
        } else {
            if (this.n == (uhVar.f == -1)) {
                aG(viewA);
            } else {
                aH(viewA, 0);
            }
        }
        by(viewA);
        ugVar.a = this.l.b(viewA);
        if (this.k == 1) {
            if (ah()) {
                iC = this.H - aA();
                iAz = iC - this.l.c(viewA);
            } else {
                iAz = az();
                iC = this.l.c(viewA) + iAz;
            }
            if (uhVar.f == -1) {
                i = uhVar.b;
                i2 = i - ugVar.a;
            } else {
                i2 = uhVar.b;
                i = ugVar.a + i2;
            }
        } else {
            int iAB = aB();
            int iC2 = this.l.c(viewA) + iAB;
            if (uhVar.f == -1) {
                int i3 = uhVar.b;
                int i4 = i3 - ugVar.a;
                iC = i3;
                i = iC2;
                iAz = i4;
                i2 = iAB;
            } else {
                int i5 = uhVar.b;
                int i6 = ugVar.a + i5;
                iAz = i5;
                i = iC2;
                i2 = iAB;
                iC = i6;
            }
        }
        bx(viewA, iAz, i2, iC, i);
        if (wcVar.c() || wcVar.b()) {
            ugVar.c = true;
        }
        ugVar.d = viewA.hasFocusable();
    }

    @Override // defpackage.wb
    public void m(wj wjVar, ws wsVar, lhg lhgVar) {
        super.m(wjVar, wsVar, lhgVar);
        vo voVar = this.u.n;
        if (voVar == null || voVar.a() <= 0) {
            return;
        }
        lhgVar.i(lhd.i);
    }

    /* JADX WARN: Removed duplicated region for block: B:114:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01a4  */
    @Override // defpackage.wb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void o(defpackage.wj r17, defpackage.ws r18) {
        /*
            Method dump skipped, instructions count: 1003
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.LinearLayoutManager.o(wj, ws):void");
    }

    @Override // defpackage.wb
    public void p(ws wsVar) {
        this.r = null;
        this.p = -1;
        this.q = Integer.MIN_VALUE;
        this.s.d();
    }

    public void s(boolean z) {
        U(null);
        if (this.o == z) {
            return;
        }
        this.o = z;
        bb();
    }

    @Override // defpackage.wb
    public boolean u(int i, Bundle bundle) {
        int iMin;
        if (super.u(i, bundle)) {
            return true;
        }
        if (i == 16908343 && bundle != null) {
            if (this.k == 1) {
                int i2 = bundle.getInt("android.view.accessibility.action.ARGUMENT_ROW_INT", -1);
                if (i2 < 0) {
                    return false;
                }
                RecyclerView recyclerView = this.u;
                iMin = Math.min(i2, bT(recyclerView.e, recyclerView.N) - 1);
            } else {
                int i3 = bundle.getInt("android.view.accessibility.action.ARGUMENT_COLUMN_INT", -1);
                if (i3 < 0) {
                    return false;
                }
                RecyclerView recyclerView2 = this.u;
                iMin = Math.min(i3, bS(recyclerView2.e, recyclerView2.N) - 1);
            }
            if (iMin >= 0) {
                ab(iMin, 0);
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.wb
    public boolean v() {
        return this.r == null && this.b == this.o;
    }

    public void w(ws wsVar, uh uhVar, tw twVar) {
        int i = uhVar.d;
        if (i < 0 || i >= wsVar.a()) {
            return;
        }
        twVar.a(i, Math.max(0, uhVar.g));
    }

    public LinearLayoutManager(int i) {
        this.k = 1;
        this.m = false;
        this.n = false;
        this.o = false;
        this.c = true;
        this.p = -1;
        this.q = Integer.MIN_VALUE;
        this.r = null;
        this.s = new uf();
        this.d = new ug();
        this.e = 2;
        this.f = new int[2];
        ac(i);
        ad(false);
    }

    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        this.k = 1;
        this.m = false;
        this.n = false;
        this.o = false;
        this.c = true;
        this.p = -1;
        this.q = Integer.MIN_VALUE;
        this.r = null;
        this.s = new uf();
        this.d = new ug();
        this.e = 2;
        this.f = new int[2];
        wa waVarAC = aC(context, attributeSet, i, i2);
        ac(waVarAC.a);
        ad(waVarAC.c);
        s(waVarAC.d);
    }

    @Override // defpackage.wb
    public void X(RecyclerView recyclerView, wj wjVar) {
    }

    public void l(wj wjVar, ws wsVar, uf ufVar, int i) {
    }
}
