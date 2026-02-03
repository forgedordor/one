package android.support.v7.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import com.android.vcard.VCardConfig;
import defpackage.a;
import defpackage.lhd;
import defpackage.lhf;
import defpackage.lhg;
import defpackage.tw;
import defpackage.tz;
import defpackage.ua;
import defpackage.ub;
import defpackage.uf;
import defpackage.ug;
import defpackage.uh;
import defpackage.vo;
import defpackage.wb;
import defpackage.wc;
import defpackage.wj;
import defpackage.ws;
import j$.util.DesugarCollections;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public class GridLayoutManager extends LinearLayoutManager {
    private static final Set J = DesugarCollections.unmodifiableSet(new HashSet(Arrays.asList(17, 66, 33, 130)));
    private int K;
    boolean a;
    public int b;
    int[] c;
    View[] d;
    final SparseIntArray e;
    final SparseIntArray f;
    public ub g;
    final Rect h;
    int i;
    int j;

    public GridLayoutManager(int i) {
        this.a = false;
        this.b = -1;
        this.e = new SparseIntArray();
        this.f = new SparseIntArray();
        this.g = new tz();
        this.h = new Rect();
        this.K = -1;
        this.i = -1;
        this.j = -1;
        r(i);
    }

    private final int bD(int i) {
        if (this.k == 0) {
            RecyclerView recyclerView = this.u;
            return bF(recyclerView.e, recyclerView.N, i);
        }
        RecyclerView recyclerView2 = this.u;
        return bG(recyclerView2.e, recyclerView2.N, i);
    }

    private final int bE(int i) {
        if (this.k == 1) {
            RecyclerView recyclerView = this.u;
            return bF(recyclerView.e, recyclerView.N, i);
        }
        RecyclerView recyclerView2 = this.u;
        return bG(recyclerView2.e, recyclerView2.N, i);
    }

    private final int bF(wj wjVar, ws wsVar, int i) {
        if (!wsVar.g) {
            return this.g.c(i, this.b);
        }
        int iA = wjVar.a(i);
        if (iA != -1) {
            return this.g.c(iA, this.b);
        }
        Log.w("GridLayoutManager", a.g(i, "Cannot find span size for pre layout position. "));
        return 0;
    }

    private final int bG(wj wjVar, ws wsVar, int i) {
        if (!wsVar.g) {
            return this.g.a(i, this.b);
        }
        int i2 = this.f.get(i, -1);
        if (i2 != -1) {
            return i2;
        }
        int iA = wjVar.a(i);
        if (iA != -1) {
            return this.g.a(iA, this.b);
        }
        Log.w("GridLayoutManager", a.g(i, "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:"));
        return 0;
    }

    private final int bH(wj wjVar, ws wsVar, int i) {
        if (!wsVar.g) {
            return this.g.b(i);
        }
        int i2 = this.e.get(i, -1);
        if (i2 != -1) {
            return i2;
        }
        int iA = wjVar.a(i);
        if (iA != -1) {
            return this.g.b(iA);
        }
        Log.w("GridLayoutManager", a.g(i, "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:"));
        return 1;
    }

    private final Set bI(int i) {
        return bK(bD(i), i);
    }

    private final Set bJ(int i) {
        return bK(bE(i), i);
    }

    private final Set bK(int i, int i2) {
        HashSet hashSet = new HashSet();
        RecyclerView recyclerView = this.u;
        int iBH = bH(recyclerView.e, recyclerView.N, i2);
        for (int i3 = i; i3 < i + iBH; i3++) {
            hashSet.add(Integer.valueOf(i3));
        }
        return hashSet;
    }

    private final void bL(int i) {
        int i2;
        int length;
        int[] iArr = this.c;
        int i3 = this.b;
        int i4 = i3 + 1;
        if (iArr == null || (length = iArr.length) != i4 || iArr[length - 1] != i) {
            iArr = new int[i4];
        }
        int i5 = 0;
        iArr[0] = 0;
        int i6 = i / i3;
        int i7 = i % i3;
        int i8 = 0;
        for (int i9 = 1; i9 <= i3; i9++) {
            i5 += i7;
            if (i5 <= 0 || i3 - i5 >= i7) {
                i2 = i6;
            } else {
                i2 = i6 + 1;
                i5 -= i3;
            }
            i8 += i2;
            iArr[i9] = i8;
        }
        this.c = iArr;
    }

    private final void bM() {
        View[] viewArr = this.d;
        if (viewArr != null) {
            if (viewArr.length == this.b) {
                return;
            }
        }
        this.d = new View[this.b];
    }

    private final void bN(View view, int i, boolean z) {
        int iAt;
        int iAt2;
        ua uaVar = (ua) view.getLayoutParams();
        Rect rect = uaVar.d;
        int i2 = rect.top + rect.bottom + uaVar.topMargin + uaVar.bottomMargin;
        int i3 = rect.left + rect.right + uaVar.leftMargin + uaVar.rightMargin;
        int iC = c(uaVar.a, uaVar.b);
        if (this.k == 1) {
            iAt2 = at(iC, i, i3, uaVar.width, false);
            iAt = at(this.l.k(), this.G, i2, uaVar.height, true);
        } else {
            int iAt3 = at(iC, i, i2, uaVar.height, false);
            int iAt4 = at(this.l.k(), this.F, i3, uaVar.width, true);
            iAt = iAt3;
            iAt2 = iAt4;
        }
        bO(view, iAt2, iAt, z);
    }

    private final void bO(View view, int i, int i2, boolean z) {
        boolean zBn;
        wc wcVar = (wc) view.getLayoutParams();
        if (z) {
            zBn = true;
            if (this.B && wb.bk(view.getMeasuredWidth(), i, wcVar.width) && wb.bk(view.getMeasuredHeight(), i2, wcVar.height)) {
                zBn = false;
            }
        } else {
            zBn = bn(view, i, i2, wcVar);
        }
        if (zBn) {
            view.measure(i, i2);
        }
    }

    private final void bP() {
        int iAy;
        int iAB;
        if (this.k == 1) {
            iAy = this.H - aA();
            iAB = az();
        } else {
            iAy = this.I - ay();
            iAB = aB();
        }
        bL(iAy - iAB);
    }

    @Override // defpackage.wb
    public final void A(int i, int i2) {
        this.g.e();
        this.g.d();
    }

    @Override // defpackage.wb
    public final void B(int i, int i2) {
        this.g.e();
        this.g.d();
    }

    @Override // defpackage.wb
    public final int bS(wj wjVar, ws wsVar) {
        if (this.k == 1) {
            return Math.min(this.b, au());
        }
        if (wsVar.a() <= 0) {
            return 0;
        }
        return bF(wjVar, wsVar, wsVar.a() - 1) + 1;
    }

    @Override // defpackage.wb
    public final int bT(wj wjVar, ws wsVar) {
        if (this.k == 0) {
            return Math.min(this.b, au());
        }
        if (wsVar.a() <= 0) {
            return 0;
        }
        return bF(wjVar, wsVar, wsVar.a() - 1) + 1;
    }

    @Override // defpackage.wb
    public final wc bU(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new ua((ViewGroup.MarginLayoutParams) layoutParams) : new ua(layoutParams);
    }

    final int c(int i, int i2) {
        if (this.k != 1 || !ah()) {
            int[] iArr = this.c;
            return iArr[i2 + i] - iArr[i];
        }
        int[] iArr2 = this.c;
        int i3 = this.b - i;
        return iArr2[i3] - iArr2[i3 - i2];
    }

    @Override // android.support.v7.widget.LinearLayoutManager, defpackage.wb
    public final int d(int i, wj wjVar, ws wsVar) {
        bP();
        bM();
        return super.d(i, wjVar, wsVar);
    }

    @Override // android.support.v7.widget.LinearLayoutManager, defpackage.wb
    public final int e(int i, wj wjVar, ws wsVar) {
        bP();
        bM();
        return super.e(i, wjVar, wsVar);
    }

    @Override // android.support.v7.widget.LinearLayoutManager, defpackage.wb
    public final wc f() {
        return this.k == 0 ? new ua(-2, -1) : new ua(-1, -2);
    }

    @Override // defpackage.wb
    public final wc h(Context context, AttributeSet attributeSet) {
        return new ua(context, attributeSet);
    }

    @Override // android.support.v7.widget.LinearLayoutManager
    public final View i(wj wjVar, ws wsVar, boolean z, boolean z2) {
        int i;
        int iAs;
        int i2;
        int iAs2 = as();
        if (z2) {
            i = -1;
            iAs = as() - 1;
            i2 = -1;
        } else {
            i = iAs2;
            iAs = 0;
            i2 = 1;
        }
        int iA = wsVar.a();
        W();
        int iJ = this.l.j();
        int iF = this.l.f();
        View view = null;
        View view2 = null;
        while (iAs != i) {
            View viewAE = aE(iAs);
            int iBu = bu(viewAE);
            if (iBu >= 0 && iBu < iA && bG(wjVar, wsVar, iBu) == 0) {
                if (((wc) viewAE.getLayoutParams()).c()) {
                    if (view2 == null) {
                        view2 = viewAE;
                    }
                } else {
                    if (this.l.d(viewAE) < iF && this.l.a(viewAE) >= iJ) {
                        return viewAE;
                    }
                    if (view == null) {
                        view = viewAE;
                    }
                }
            }
            iAs += i2;
        }
        return view != null ? view : view2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:56:0x00cd, code lost:
    
        if (r13 == (r2 > r11)) goto L51;
     */
    @Override // android.support.v7.widget.LinearLayoutManager, defpackage.wb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View j(android.view.View r23, int r24, defpackage.wj r25, defpackage.ws r26) {
        /*
            Method dump skipped, instructions count: 296
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.GridLayoutManager.j(android.view.View, int, wj, ws):android.view.View");
    }

    @Override // android.support.v7.widget.LinearLayoutManager
    public final void k(wj wjVar, ws wsVar, uh uhVar, ug ugVar) {
        int i;
        int i2;
        int i3;
        int iC;
        int iC2;
        int iAz;
        int i4;
        int iAt;
        int iAt2;
        boolean z;
        View viewA;
        int i5 = this.l.i();
        int i6 = as() > 0 ? this.c[this.b] : 0;
        boolean z2 = i5 != 1073741824;
        if (z2) {
            bP();
        }
        int i7 = uhVar.e;
        int iBG = this.b;
        if (i7 != 1) {
            iBG = bG(wjVar, wsVar, uhVar.d) + bH(wjVar, wsVar, uhVar.d);
        }
        int i8 = 0;
        while (i8 < this.b && uhVar.d(wsVar) && iBG > 0) {
            int i9 = uhVar.d;
            int iBH = bH(wjVar, wsVar, i9);
            if (iBH > this.b) {
                throw new IllegalArgumentException("Item at position " + i9 + " requires " + iBH + " spans but GridLayoutManager has only " + this.b + " spans.");
            }
            iBG -= iBH;
            if (iBG < 0 || (viewA = uhVar.a(wjVar)) == null) {
                break;
            }
            this.d[i8] = viewA;
            i8++;
        }
        if (i8 == 0) {
            ugVar.b = true;
            return;
        }
        if (i7 == 1) {
            i3 = 1;
            i2 = i8;
            i = 0;
        } else {
            i = i8 - 1;
            i2 = -1;
            i3 = -1;
        }
        int i10 = 0;
        while (i != i2) {
            View view = this.d[i];
            ua uaVar = (ua) view.getLayoutParams();
            int iBH2 = bH(wjVar, wsVar, bu(view));
            uaVar.b = iBH2;
            uaVar.a = i10;
            i10 += iBH2;
            i += i3;
        }
        float f = 0.0f;
        int i11 = 0;
        for (int i12 = 0; i12 < i8; i12++) {
            View view2 = this.d[i12];
            if (uhVar.l != null) {
                z = false;
                if (i7 == 1) {
                    aG(view2);
                } else {
                    aH(view2, 0);
                }
            } else if (i7 == 1) {
                aI(view2);
                z = false;
            } else {
                z = false;
                aJ(view2, 0);
            }
            aK(view2, this.h);
            bN(view2, i5, z);
            int iB = this.l.b(view2);
            if (iB > i11) {
                i11 = iB;
            }
            float fC = this.l.c(view2) / ((ua) view2.getLayoutParams()).b;
            if (fC > f) {
                f = fC;
            }
        }
        if (z2) {
            bL(Math.max(Math.round(f * this.b), i6));
            i11 = 0;
            for (int i13 = 0; i13 < i8; i13++) {
                View view3 = this.d[i13];
                bN(view3, 1073741824, true);
                int iB2 = this.l.b(view3);
                if (iB2 > i11) {
                    i11 = iB2;
                }
            }
        }
        for (int i14 = 0; i14 < i8; i14++) {
            View view4 = this.d[i14];
            if (this.l.b(view4) != i11) {
                ua uaVar2 = (ua) view4.getLayoutParams();
                Rect rect = uaVar2.d;
                int i15 = rect.top + rect.bottom + uaVar2.topMargin + uaVar2.bottomMargin;
                int i16 = rect.left + rect.right + uaVar2.leftMargin + uaVar2.rightMargin;
                int iC3 = c(uaVar2.a, uaVar2.b);
                if (this.k == 1) {
                    iAt2 = at(iC3, 1073741824, i16, uaVar2.width, false);
                    iAt = View.MeasureSpec.makeMeasureSpec(i11 - i15, 1073741824);
                } else {
                    int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i11 - i16, 1073741824);
                    iAt = at(iC3, 1073741824, i15, uaVar2.height, false);
                    iAt2 = iMakeMeasureSpec;
                }
                bO(view4, iAt2, iAt, true);
            }
        }
        ugVar.a = i11;
        if (this.k == 1) {
            if (uhVar.f == -1) {
                int i17 = uhVar.b;
                i4 = i17 - i11;
                iC2 = i17;
            } else {
                i4 = uhVar.b;
                iC2 = i4 + i11;
            }
            iAz = 0;
            iC = 0;
        } else {
            if (uhVar.f == -1) {
                int i18 = uhVar.b;
                iAz = i18 - i11;
                iC2 = 0;
                iC = i18;
            } else {
                int i19 = uhVar.b;
                iC = i19 + i11;
                iC2 = 0;
                iAz = i19;
            }
            i4 = iC2;
        }
        for (int i20 = 0; i20 < i8; i20++) {
            View view5 = this.d[i20];
            ua uaVar3 = (ua) view5.getLayoutParams();
            if (this.k != 1) {
                int iAB = aB() + this.c[uaVar3.a];
                i4 = iAB;
                iC2 = this.l.c(view5) + iAB;
            } else if (ah()) {
                int iAz2 = az() + this.c[this.b - uaVar3.a];
                iC = iAz2;
                iAz = iAz2 - this.l.c(view5);
            } else {
                iAz = az() + this.c[uaVar3.a];
                iC = this.l.c(view5) + iAz;
            }
            bx(view5, iAz, i4, iC, iC2);
            if (uaVar3.c() || uaVar3.b()) {
                ugVar.c = true;
            }
            ugVar.d = view5.hasFocusable() | ugVar.d;
        }
        Arrays.fill(this.d, (Object) null);
    }

    @Override // android.support.v7.widget.LinearLayoutManager
    public final void l(wj wjVar, ws wsVar, uf ufVar, int i) {
        bP();
        if (wsVar.a() > 0 && !wsVar.g) {
            int iBG = bG(wjVar, wsVar, ufVar.b);
            if (i == 1) {
                while (iBG > 0) {
                    int i2 = ufVar.b;
                    if (i2 <= 0) {
                        break;
                    }
                    int i3 = i2 - 1;
                    ufVar.b = i3;
                    iBG = bG(wjVar, wsVar, i3);
                }
            } else {
                int iA = wsVar.a() - 1;
                int i4 = ufVar.b;
                while (i4 < iA) {
                    int i5 = i4 + 1;
                    int iBG2 = bG(wjVar, wsVar, i5);
                    if (iBG2 <= iBG) {
                        break;
                    }
                    i4 = i5;
                    iBG = iBG2;
                }
                ufVar.b = i4;
            }
        }
        bM();
    }

    @Override // android.support.v7.widget.LinearLayoutManager, defpackage.wb
    public final void m(wj wjVar, ws wsVar, lhg lhgVar) {
        super.m(wjVar, wsVar, lhgVar);
        lhgVar.s(GridView.class.getName());
        vo voVar = this.u.n;
        if (voVar == null || voVar.a() <= 1) {
            return;
        }
        lhgVar.i(lhd.n);
    }

    @Override // defpackage.wb
    public final void n(wj wjVar, ws wsVar, View view, lhg lhgVar) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof ua)) {
            super.aT(view, lhgVar);
            return;
        }
        ua uaVar = (ua) layoutParams;
        int iBF = bF(wjVar, wsVar, uaVar.a());
        if (this.k == 0) {
            lhgVar.v(lhf.a(uaVar.a, uaVar.b, iBF, 1, false));
        } else {
            lhgVar.v(lhf.a(iBF, 1, uaVar.a, uaVar.b, false));
        }
    }

    @Override // android.support.v7.widget.LinearLayoutManager, defpackage.wb
    public final void o(wj wjVar, ws wsVar) {
        if (wsVar.g) {
            int iAs = as();
            for (int i = 0; i < iAs; i++) {
                ua uaVar = (ua) aE(i).getLayoutParams();
                int iA = uaVar.a();
                this.e.put(iA, uaVar.b);
                this.f.put(iA, uaVar.a);
            }
        }
        super.o(wjVar, wsVar);
        this.e.clear();
        this.f.clear();
    }

    @Override // android.support.v7.widget.LinearLayoutManager, defpackage.wb
    public final void p(ws wsVar) {
        View viewT;
        super.p(wsVar);
        this.a = false;
        int i = this.K;
        if (i == -1 || (viewT = T(i)) == null) {
            return;
        }
        viewT.sendAccessibilityEvent(VCardConfig.FLAG_APPEND_TYPE_PARAM);
        this.K = -1;
    }

    @Override // defpackage.wb
    public final void q(Rect rect, int i, int i2) {
        int iAr;
        int iAr2;
        if (this.c == null) {
            super.q(rect, i, i2);
        }
        int iAz = az() + aA();
        int iAB = aB() + ay();
        if (this.k == 1) {
            iAr2 = ar(i2, rect.height() + iAB, aw());
            iAr = ar(i, this.c[r7.length - 1] + iAz, ax());
        } else {
            iAr = ar(i, rect.width() + iAz, ax());
            iAr2 = ar(i2, this.c[r5.length - 1] + iAB, aw());
        }
        bf(iAr, iAr2);
    }

    public final void r(int i) {
        if (i == this.b) {
            return;
        }
        this.a = true;
        if (i <= 0) {
            throw new IllegalArgumentException(a.g(i, "Span count should be at least 1. Provided "));
        }
        this.b = i;
        this.g.e();
        bb();
    }

    @Override // android.support.v7.widget.LinearLayoutManager
    public final void s(boolean z) {
        if (z) {
            throw new UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
        }
        super.s(false);
    }

    @Override // defpackage.wb
    public final boolean t(wc wcVar) {
        return wcVar instanceof ua;
    }

    /* JADX WARN: Removed duplicated region for block: B:113:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0259 A[EDGE_INSN: B:195:0x0259->B:153:0x0259 BREAK  A[LOOP:2: B:117:0x019c->B:126:0x01c6, LOOP_LABEL: LOOP:2: B:117:0x019c->B:126:0x01c6], EDGE_INSN: B:201:0x0259->B:153:0x0259 BREAK  A[LOOP:5: B:135:0x01fe->B:146:0x022d, LOOP_LABEL: LOOP:5: B:135:0x01fe->B:146:0x022d]] */
    /* JADX WARN: Removed duplicated region for block: B:155:0x025c  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0268  */
    @Override // android.support.v7.widget.LinearLayoutManager, defpackage.wb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean u(int r12, android.os.Bundle r13) {
        /*
            Method dump skipped, instructions count: 696
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.GridLayoutManager.u(int, android.os.Bundle):boolean");
    }

    @Override // android.support.v7.widget.LinearLayoutManager, defpackage.wb
    public final boolean v() {
        return this.r == null && !this.a;
    }

    @Override // android.support.v7.widget.LinearLayoutManager
    public final void w(ws wsVar, uh uhVar, tw twVar) {
        int iB = this.b;
        for (int i = 0; i < this.b && uhVar.d(wsVar) && iB > 0; i++) {
            int i2 = uhVar.d;
            twVar.a(i2, Math.max(0, uhVar.g));
            iB -= this.g.b(i2);
            uhVar.d += uhVar.e;
        }
    }

    @Override // defpackage.wb
    public final void x(int i, int i2) {
        this.g.e();
        this.g.d();
    }

    @Override // defpackage.wb
    public final void y() {
        this.g.e();
        this.g.d();
    }

    @Override // defpackage.wb
    public final void z(int i, int i2) {
        this.g.e();
        this.g.d();
    }

    public GridLayoutManager(int i, int i2) {
        super(i2);
        this.a = false;
        this.b = -1;
        this.e = new SparseIntArray();
        this.f = new SparseIntArray();
        this.g = new tz();
        this.h = new Rect();
        this.K = -1;
        this.i = -1;
        this.j = -1;
        r(i);
    }

    public GridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.a = false;
        this.b = -1;
        this.e = new SparseIntArray();
        this.f = new SparseIntArray();
        this.g = new tz();
        this.h = new Rect();
        this.K = -1;
        this.i = -1;
        this.j = -1;
        r(aC(context, attributeSet, i, i2).b);
    }
}
