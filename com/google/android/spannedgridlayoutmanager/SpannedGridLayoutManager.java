package com.google.android.spannedgridlayoutmanager;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import defpackage.dmyg;
import defpackage.dsts;
import defpackage.efvc;
import defpackage.efvd;
import defpackage.efve;
import defpackage.efvf;
import defpackage.efvg;
import defpackage.efvh;
import defpackage.efvi;
import defpackage.va;
import defpackage.vb;
import defpackage.vc;
import defpackage.wb;
import defpackage.wc;
import defpackage.wj;
import defpackage.ws;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes5.dex */
public class SpannedGridLayoutManager extends wb {
    private int J;
    private boolean K;
    public efvi a;
    public efvd b;
    int[] c;
    public int d;
    public int e;
    public int f;
    int g;
    final ArrayList h;
    final ArrayList i;
    final ArrayList j;
    final ArrayList k;
    vc l;
    vc m;
    public dmyg n;
    private int o;
    private boolean p;
    private final Rect q;
    private final efvg r;
    private final efvh s;

    public SpannedGridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) throws Resources.NotFoundException {
        int[] iArr;
        this.g = 0;
        this.q = new Rect();
        this.r = new efvg();
        this.s = new efvh(this);
        this.h = new ArrayList();
        this.i = new ArrayList();
        this.j = new ArrayList();
        this.k = new ArrayList();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, dsts.a, i, i2);
        int i3 = typedArrayObtainStyledAttributes.getInt(2, 1);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(1, -1);
        float[] fArr = null;
        if (resourceId != -1) {
            TypedArray typedArrayObtainTypedArray = context.getResources().obtainTypedArray(resourceId);
            iArr = new int[i3];
            for (int i4 = 0; i4 < i3; i4++) {
                iArr[i4] = typedArrayObtainTypedArray.getDimensionPixelSize(i4, 0);
            }
            typedArrayObtainTypedArray.recycle();
        } else {
            iArr = null;
        }
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(3, -1);
        if (resourceId2 != -1) {
            TypedArray typedArrayObtainTypedArray2 = context.getResources().obtainTypedArray(resourceId2);
            fArr = new float[i3];
            for (int i5 = 0; i5 < i3; i5++) {
                fArr[i5] = typedArrayObtainTypedArray2.getFloat(i5, 1.0f);
            }
            typedArrayObtainTypedArray2.recycle();
        }
        this.b = new efvd(i3, fArr, iArr);
        int i6 = typedArrayObtainStyledAttributes.getInt(0, 1);
        typedArrayObtainStyledAttributes.recycle();
        O(i6);
        bC();
    }

    private final int L() {
        int[] iArr = this.c;
        return iArr[this.b.a] - iArr[0];
    }

    private final efvh M(int i, int i2, boolean z) {
        efvh efvhVar = this.s;
        efvhVar.d = i;
        efvhVar.e = i2;
        efvhVar.f = z;
        efvhVar.g = false;
        efvhVar.c = z ? this.o : this.f;
        efvhVar.h = false;
        return efvhVar;
    }

    private final void N(efvh efvhVar) {
        int iIntValue;
        int iIntValue2;
        int i;
        boolean z = true;
        boolean zA = true;
        while (true) {
            if (efvhVar.e <= 0 && !efvhVar.h) {
                return;
            }
            if (efvhVar.f && efvhVar.i.e >= efvhVar.b.a() - 1) {
                return;
            }
            if ((!efvhVar.f && efvhVar.i.d <= 0) || !zA) {
                return;
            }
            efvg efvgVar = this.r;
            int i2 = 0;
            efvgVar.a = 0;
            efvgVar.b = z;
            int iA = this.a.a(efvhVar.c);
            int iB = this.a.b(efvhVar.c);
            int i3 = iB - iA;
            int iD = this.a.d(iA);
            int iMax = 0;
            for (int i4 = iA; i4 <= iB; i4++) {
                iMax = Math.max(iMax, (this.a.d(i4) - iD) + this.a.e(i4).b);
            }
            int i5 = i3 + 1;
            ArrayList arrayList = this.h;
            ab(arrayList, i5);
            ArrayList arrayList2 = this.j;
            ab(arrayList2, i5);
            ArrayList arrayList3 = this.i;
            ab(arrayList3, i5);
            ArrayList arrayList4 = this.k;
            ab(arrayList4, iMax + 1);
            View[] viewArr = new View[i5];
            int i6 = 0;
            while (i2 < i5) {
                int i7 = i2 + iA;
                int i8 = i5;
                View viewC = efvhVar.a.c(i7);
                efvf efvfVar = (efvf) viewC.getLayoutParams();
                ArrayList arrayList5 = arrayList;
                efvgVar.b = efvgVar.b && !efvfVar.c();
                efve efveVarE = this.a.e(i7);
                viewArr[i2] = viewC;
                int[] iArr = this.c;
                int i9 = efveVarE.c;
                ArrayList arrayList6 = arrayList4;
                int i10 = iD;
                ArrayList arrayList7 = arrayList2;
                int i11 = iB;
                ArrayList arrayList8 = arrayList3;
                P(viewC, efvfVar, iArr[i9 + efveVarE.d] - iArr[i9], this.J == 1 ? efvfVar.height : efvfVar.width, 0);
                arrayList8.set(i2, Integer.valueOf(this.l.b(viewC)));
                arrayList5.set(i2, 0);
                arrayList7.set(i2, Integer.valueOf(efveVarE.b));
                i2++;
                i5 = i8;
                arrayList4 = arrayList6;
                arrayList3 = arrayList8;
                arrayList = arrayList5;
                arrayList2 = arrayList7;
                i3 = i3;
                iD = i10;
                iB = i11;
                iA = iA;
                z = true;
                viewArr = viewArr;
            }
            boolean z2 = z;
            View[] viewArr2 = viewArr;
            int i12 = iA;
            int i13 = iB;
            int i14 = i3;
            int i15 = iD;
            int i16 = i5;
            ArrayList arrayList9 = arrayList;
            ArrayList arrayList10 = arrayList2;
            ArrayList arrayList11 = arrayList3;
            ArrayList arrayList12 = arrayList4;
            for (int i17 = 0; i17 < iMax; i17++) {
                arrayList12.set(i17, null);
            }
            int i18 = 0;
            while (i18 < iMax) {
                int i19 = -1;
                int i20 = -1;
                int i21 = i6;
                while (i21 < i16) {
                    efve efveVarE2 = this.a.e(i21 + i12);
                    Integer num = (Integer) arrayList10.get(i21);
                    if (num.intValue() > 0) {
                        int iIntValue3 = ((Integer) arrayList11.get(i21)).intValue() / num.intValue();
                        int i22 = efveVarE2.b;
                        i = i18;
                        int i23 = i6;
                        while (i23 < i22) {
                            int i24 = i23;
                            int i25 = (i24 + efveVarE2.a) - i15;
                            if (arrayList12.get(i25) == null && iIntValue3 > i20) {
                                i19 = i25;
                                i20 = iIntValue3;
                            }
                            i23 = i24 + 1;
                        }
                    } else {
                        i = i18;
                    }
                    i21++;
                    i18 = i;
                }
                int i26 = i18;
                arrayList12.set(i19, Integer.valueOf(i20));
                int i27 = i19 + i15;
                int i28 = i6;
                while (i28 < i16) {
                    efve efveVarE3 = this.a.e(i28 + i12);
                    int i29 = efveVarE3.a;
                    if (i29 <= i27 && i29 + efveVarE3.b > i27) {
                        arrayList10.set(i28, Integer.valueOf(((Integer) arrayList10.get(i28)).intValue() - 1));
                        arrayList11.set(i28, Integer.valueOf(Math.max(i6, ((Integer) arrayList11.get(i28)).intValue() - i20)));
                        arrayList9.set(i28, Integer.valueOf(((Integer) arrayList9.get(i28)).intValue() + i20));
                    }
                    i28++;
                    i6 = 0;
                }
                i18 = i26 + 1;
                i6 = 0;
            }
            if (efvhVar.f) {
                int i30 = efvhVar.d;
                int i31 = 0;
                while (i31 < iMax) {
                    int iIntValue4 = ((Integer) arrayList12.get(i31)).intValue() + i30;
                    arrayList12.set(i31, Integer.valueOf(i30));
                    i31++;
                    i30 = iIntValue4;
                }
                arrayList12.set(iMax, Integer.valueOf(i30));
                for (int i32 = 0; i32 < i16; i32++) {
                    efve efveVarE4 = this.a.e(i32 + i12);
                    int iIntValue5 = ((Integer) arrayList12.get(efveVarE4.a - i15)).intValue();
                    View view = viewArr2[i32];
                    if (efvhVar.g) {
                        aG(view);
                    } else {
                        aI(view);
                    }
                    J(efveVarE4, view, ((Integer) arrayList9.get(i32)).intValue(), iIntValue5, true);
                }
                iIntValue = ((Integer) arrayList12.get(iMax)).intValue();
                iIntValue2 = efvhVar.d;
            } else {
                int iIntValue6 = efvhVar.d;
                while (iMax > 0) {
                    arrayList12.set(iMax, Integer.valueOf(iIntValue6));
                    iMax--;
                    iIntValue6 -= ((Integer) arrayList12.get(iMax)).intValue();
                }
                arrayList12.set(0, Integer.valueOf(iIntValue6));
                for (int i33 = i14; i33 >= 0; i33--) {
                    efve efveVarE5 = this.a.e(i33 + i12);
                    int iIntValue7 = ((Integer) arrayList12.get((efveVarE5.a + efveVarE5.b) - i15)).intValue();
                    View view2 = viewArr2[i33];
                    if (efvhVar.g) {
                        aH(view2, 0);
                    } else {
                        aJ(view2, 0);
                    }
                    J(efveVarE5, view2, ((Integer) arrayList9.get(i33)).intValue(), iIntValue7, false);
                }
                iIntValue = efvhVar.d;
                iIntValue2 = ((Integer) arrayList12.get(0)).intValue();
            }
            efvgVar.a = iIntValue - iIntValue2;
            if (!efvhVar.g) {
                if (i12 < this.d) {
                    this.d = i12;
                    this.f = this.a.d(i12);
                }
                if (i13 > this.e) {
                    this.e = i13;
                    this.o = this.a.d(i13);
                }
            }
            if (efvgVar.b) {
                efvhVar.e -= efvgVar.a;
            }
            int i34 = efvgVar.a;
            if (efvhVar.f) {
                efvhVar.d += i34;
            } else {
                efvhVar.d -= i34;
            }
            zA = efvhVar.a();
            z = z2;
        }
    }

    private final void O(int i) {
        this.J = i;
        if (i == 1) {
            this.l = new vb(this);
            this.m = new va(this);
        } else {
            this.l = new va(this);
            this.m = new vb(this);
        }
    }

    private final void P(View view, efvf efvfVar, int i, int i2, int i3) {
        int iAt;
        int iAt2;
        if (this.J == 1) {
            iAt2 = at(i, 1073741824, 0, efvfVar.width, false);
            iAt = at(this.I, i3, 0, i2, true);
        } else {
            int iAt3 = at(i, 1073741824, 0, efvfVar.height, false);
            int iAt4 = at(this.H, i3, 0, i2, true);
            iAt = iAt3;
            iAt2 = iAt4;
        }
        Rect rect = this.q;
        aK(view, rect);
        view.measure(ac(iAt2, efvfVar.leftMargin + rect.left, efvfVar.rightMargin + rect.right), ac(iAt, efvfVar.topMargin + rect.top, efvfVar.bottomMargin + rect.bottom));
    }

    private final void R(int i, wj wjVar) {
        int iA = this.a.a(i);
        int iB = this.a.b(i);
        for (int i2 = iB; i2 >= iA; i2--) {
            aZ(i2 - this.d, wjVar);
        }
        if (i == this.f) {
            int i3 = iB + 1;
            this.d = i3;
            this.f = this.a.d(i3);
        }
        if (i == this.o) {
            int i4 = iA - 1;
            this.e = i4;
            this.o = this.a.d(i4);
        }
    }

    private final void S() {
        int iA = this.a.a(this.f);
        this.d = iA;
        this.o = this.f;
        this.e = iA;
    }

    private final void V(wj wjVar, ws wsVar) {
        efvh efvhVar = this.s;
        efvhVar.a = wjVar;
        efvhVar.b = wsVar;
    }

    private final boolean W() {
        if (as() == 0) {
            return false;
        }
        return this.l.d(aE(this.a.a(this.f) - this.d)) < this.l.j();
    }

    private static final void ab(ArrayList arrayList, int i) {
        arrayList.ensureCapacity(i);
        for (int size = arrayList.size(); size < i; size++) {
            arrayList.add(null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x000d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final int ac(int r2, int r3, int r4) {
        /*
            if (r3 != 0) goto L5
            if (r4 == 0) goto L13
            r3 = 0
        L5:
            int r0 = android.view.View.MeasureSpec.getMode(r2)
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 == r1) goto L14
            r1 = 1073741824(0x40000000, float:2.0)
            if (r0 != r1) goto L13
            r0 = r1
            goto L14
        L13:
            return r2
        L14:
            int r2 = android.view.View.MeasureSpec.getSize(r2)
            int r2 = r2 - r3
            int r2 = r2 - r4
            int r2 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.spannedgridlayoutmanager.SpannedGridLayoutManager.ac(int, int, int):int");
    }

    @Override // defpackage.wb
    public final int C(ws wsVar) {
        return this.J == 1 ? l() : c();
    }

    @Override // defpackage.wb
    public final int D(ws wsVar) {
        return this.J == 1 ? r() : i();
    }

    @Override // defpackage.wb
    public final int E(ws wsVar) {
        return this.J == 1 ? s() : k();
    }

    @Override // defpackage.wb
    public final int F(ws wsVar) {
        return this.J == 1 ? c() : l();
    }

    @Override // defpackage.wb
    public final int G(ws wsVar) {
        return this.J == 1 ? i() : r();
    }

    @Override // defpackage.wb
    public final int H(ws wsVar) {
        return this.J == 1 ? k() : s();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final int I(int r4) {
        /*
            r3 = this;
            int r0 = r3.as()
            if (r0 == 0) goto L2d
            if (r4 != 0) goto L9
            goto L2d
        L9:
            int r0 = r3.s()
            if (r4 >= 0) goto L17
            int r1 = r3.g
            int r2 = r4 + r1
            if (r2 >= 0) goto L17
            int r4 = -r1
            goto L21
        L17:
            if (r4 <= 0) goto L21
            int r1 = r3.g
            int r2 = r4 + r1
            if (r2 <= r0) goto L21
            int r4 = r0 - r1
        L21:
            int r0 = r3.g
            int r0 = r0 + r4
            r3.g = r0
            vc r0 = r3.m
            int r1 = -r4
            r0.n(r1)
            return r4
        L2d:
            r4 = 0
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.spannedgridlayoutmanager.SpannedGridLayoutManager.I(int):int");
    }

    final void J(efve efveVar, View view, int i, int i2, boolean z) {
        int iB;
        efvf efvfVar = (efvf) view.getLayoutParams();
        int[] iArr = this.c;
        int i3 = efveVar.c;
        int i4 = efveVar.d;
        P(view, efvfVar, iArr[i3 + i4] - iArr[i3], i, 1073741824);
        int i5 = this.c[i3] - this.g;
        int iC = this.l.c(view) + i5;
        if (z) {
            iB = this.l.b(view) + i2;
        } else {
            iB = i2;
            i2 -= this.l.b(view);
        }
        if (this.J != 1) {
            bw(view, i2 + efvfVar.getMarginStart(), i5 - efvfVar.bottomMargin, iB + efvfVar.getMarginStart(), iC - efvfVar.bottomMargin);
        } else if (av() == 1) {
            int i6 = this.c[r0.length - 1];
            bw(view, i6 - (iC + efvfVar.getMarginEnd()), i2 + efvfVar.topMargin, i6 - (i5 + efvfVar.getMarginEnd()), iB + efvfVar.topMargin);
        } else {
            bw(view, i5 + efvfVar.getMarginStart(), i2 + efvfVar.topMargin, iC + efvfVar.getMarginStart(), iB + efvfVar.topMargin);
        }
        efvfVar.a = i4;
        efvfVar.b = efveVar.b;
    }

    final boolean K() {
        return as() > 0 && L() > this.m.k();
    }

    @Override // defpackage.wb
    public final View T(int i) {
        int i2 = this.d;
        if (i < i2 || i > this.e) {
            return null;
        }
        return aE(i - i2);
    }

    @Override // defpackage.wb
    public final void aa(int i) {
        if (i >= au()) {
            i = au() - 1;
        }
        this.f = this.a.d(i);
        S();
        this.p = true;
        aV();
        bb();
    }

    @Override // defpackage.wb
    public boolean ae() {
        if (this.J == 1) {
            return K();
        }
        return true;
    }

    @Override // defpackage.wb
    public final boolean af() {
        if (this.J == 1) {
            return true;
        }
        return K();
    }

    @Override // defpackage.wb
    public final void aq(RecyclerView recyclerView, int i) {
        if (i >= au()) {
            i = au() - 1;
        }
        efvc efvcVar = new efvc(this, recyclerView.getContext());
        efvcVar.g = i;
        bi(efvcVar);
    }

    @Override // defpackage.wb
    public final wc bU(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new efvf((ViewGroup.MarginLayoutParams) layoutParams) : new efvf(layoutParams);
    }

    @Override // defpackage.wb
    public final void bz() {
        aV();
        this.a = null;
        this.d = 0;
        this.f = 0;
        this.e = 0;
        this.o = 0;
        this.p = false;
        this.g = 0;
    }

    final int c() {
        int iB = 0;
        if (this.K && W()) {
            int i = this.f;
            iB = (this.a.b(i) - this.a.a(i)) + 1;
        }
        return as() - iB;
    }

    @Override // defpackage.wb
    public final int d(int i, wj wjVar, ws wsVar) {
        return this.J == 1 ? I(i) : w(i, wjVar, wsVar);
    }

    @Override // defpackage.wb
    public final int e(int i, wj wjVar, ws wsVar) {
        return this.J == 1 ? w(i, wjVar, wsVar) : I(i);
    }

    @Override // defpackage.wb
    public final wc f() {
        return new efvf();
    }

    @Override // defpackage.wb
    public final wc h(Context context, AttributeSet attributeSet) {
        return new efvf(context, attributeSet);
    }

    final int i() {
        if (as() == 0) {
            return 0;
        }
        if (this.K && W()) {
            int iC = this.a.c(this.f);
            if (this.a.f(iC)) {
                return this.a.a(iC);
            }
        }
        return this.d;
    }

    final int k() {
        efvi efviVar = this.a;
        if (efviVar == null) {
            return 0;
        }
        return efviVar.a;
    }

    final int l() {
        return this.m.k();
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00d2  */
    @Override // defpackage.wb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void o(defpackage.wj r11, defpackage.ws r12) {
        /*
            Method dump skipped, instructions count: 355
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.spannedgridlayoutmanager.SpannedGridLayoutManager.o(wj, ws):void");
    }

    final int r() {
        if (as() == 0) {
            return 0;
        }
        return this.g;
    }

    final int s() {
        if (as() == 0) {
            return 0;
        }
        return L() - this.m.k();
    }

    @Override // defpackage.wb
    public final boolean t(wc wcVar) {
        return wcVar instanceof efvf;
    }

    @Override // defpackage.wb
    public final boolean v() {
        return true;
    }

    final int w(int i, wj wjVar, ws wsVar) {
        if (as() == 0 || i == 0) {
            return 0;
        }
        V(wjVar, wsVar);
        int iD = this.l.d(aE(0));
        if (i < 0) {
            if (this.f == 0) {
                i = Math.max(i, -(this.l.j() - iD));
            }
            int i2 = iD - i;
            if (i2 > 0) {
                efvh efvhVarM = M(iD, i2, false);
                if (efvhVarM.a()) {
                    N(efvhVarM);
                    i = Math.max(i, efvhVarM.e + i);
                }
            }
            int iD2 = this.l.d(aE(this.a.a(this.o) - this.d));
            while (iD2 - i > this.l.k()) {
                R(this.o, wjVar);
                iD2 = this.l.d(aE(this.a.a(this.o) - this.d));
            }
        } else {
            int iA = this.l.a(aE(as() - 1));
            if (this.e == au() - 1) {
                i = Math.min(i, Math.max(iA - this.l.f(), 0));
            }
            int i3 = iA - i;
            if (i3 < this.l.k()) {
                efvh efvhVarM2 = M(this.l.a(aE(as() - 1)), this.l.k() - i3, true);
                if (efvhVarM2.a()) {
                    N(efvhVarM2);
                    i = Math.min(i, i - efvhVarM2.e);
                }
            }
            int iA2 = this.l.a(aE(this.a.b(this.f) - this.d));
            while (iA2 - i < 0) {
                R(this.f, wjVar);
                iA2 = this.l.a(aE(this.a.b(this.f) - this.d));
            }
        }
        this.l.n(-i);
        return i;
    }

    public SpannedGridLayoutManager(dmyg dmygVar, boolean z) {
        this.g = 0;
        this.q = new Rect();
        this.r = new efvg();
        this.s = new efvh(this);
        this.h = new ArrayList();
        this.i = new ArrayList();
        this.j = new ArrayList();
        this.k = new ArrayList();
        this.n = dmygVar;
        this.b = new efvd();
        bC();
        O(1);
        this.K = z;
    }
}
