package androidx.compose.foundation.lazy.layout;

import defpackage.cuz;
import defpackage.cva;
import defpackage.cvp;
import defpackage.cvs;
import defpackage.ens;
import defpackage.ent;
import defpackage.enu;
import defpackage.enz;
import defpackage.eou;
import defpackage.eqr;
import defpackage.fdbq;
import defpackage.icr;
import defpackage.ics;
import defpackage.ini;
import defpackage.jbp;
import defpackage.jdy;
import defpackage.kjb;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class LazyLayoutItemAnimator {
    public final List a;
    public jbp b;
    public final ics c;
    private final cuz d;
    private int e;
    private final cva f;
    private final List g;
    private final List h;
    private final List i;
    private final List j;
    private eqr k;

    /* compiled from: PG */
    private static final class DisplayingDisappearingItemsElement extends jdy<ent> {
        private final LazyLayoutItemAnimator a;

        public DisplayingDisappearingItemsElement(LazyLayoutItemAnimator lazyLayoutItemAnimator) {
            this.a = lazyLayoutItemAnimator;
        }

        @Override // defpackage.jdy
        public final /* bridge */ /* synthetic */ icr d() {
            return new ent(this.a);
        }

        @Override // defpackage.jdy
        public final /* bridge */ /* synthetic */ void e(icr icrVar) {
            ent entVar = (ent) icrVar;
            LazyLayoutItemAnimator lazyLayoutItemAnimator = entVar.a;
            LazyLayoutItemAnimator lazyLayoutItemAnimator2 = this.a;
            if (fdbq.f(lazyLayoutItemAnimator, lazyLayoutItemAnimator2) || !entVar.s.C) {
                return;
            }
            entVar.a.c();
            lazyLayoutItemAnimator2.b = entVar;
            entVar.a = lazyLayoutItemAnimator2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof DisplayingDisappearingItemsElement) && fdbq.f(this.a, ((DisplayingDisappearingItemsElement) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "DisplayingDisappearingItemsElement(animator=" + this.a + ')';
        }
    }

    public LazyLayoutItemAnimator() {
        long[] jArr = cvp.a;
        this.d = new cuz((byte[]) null);
        int i = cvs.a;
        this.f = new cva((byte[]) null);
        this.g = new ArrayList();
        this.h = new ArrayList();
        this.i = new ArrayList();
        this.j = new ArrayList();
        this.a = new ArrayList();
        this.c = new DisplayingDisappearingItemsElement(this);
    }

    static /* synthetic */ void d(LazyLayoutItemAnimator lazyLayoutItemAnimator, eou eouVar, int i) {
        Object objF = lazyLayoutItemAnimator.d.f(eouVar.h());
        objF.getClass();
        j(eouVar, i, (enu) objF);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0057  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void f() {
        /*
            r17 = this;
            r0 = r17
            cuz r1 = r0.d
            boolean r2 = r1.k()
            if (r2 == 0) goto L5f
            java.lang.Object[] r2 = r1.c
            long[] r3 = r1.a
            int r4 = r3.length
            int r4 = r4 + (-2)
            if (r4 < 0) goto L5c
            r5 = 0
            r6 = r5
        L15:
            r7 = r3[r6]
            long r9 = ~r7
            r11 = 7
            long r9 = r9 << r11
            long r9 = r9 & r7
            r11 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r9 = r9 & r11
            int r9 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r9 == 0) goto L57
            int r9 = r6 - r4
            r10 = r5
        L28:
            int r11 = ~r9
            int r11 = r11 >>> 31
            r12 = 8
            int r11 = 8 - r11
            if (r10 >= r11) goto L55
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r7
            r15 = 128(0x80, double:6.32E-322)
            int r11 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r11 >= 0) goto L51
            int r11 = r6 << 3
            int r11 = r11 + r10
            r11 = r2[r11]
            enu r11 = (defpackage.enu) r11
            ens[] r11 = r11.a
            int r13 = r11.length
            r14 = r5
        L45:
            if (r14 >= r13) goto L51
            r15 = r11[r14]
            if (r15 == 0) goto L4e
            r15.d()
        L4e:
            int r14 = r14 + 1
            goto L45
        L51:
            long r7 = r7 >> r12
            int r10 = r10 + 1
            goto L28
        L55:
            if (r11 != r12) goto L5c
        L57:
            if (r6 == r4) goto L5c
            int r6 = r6 + 1
            goto L15
        L5c:
            r1.d()
        L5f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator.f():void");
    }

    private final void g(Object obj) {
        ens[] ensVarArr;
        enu enuVar = (enu) this.d.b(obj);
        if (enuVar == null || (ensVarArr = enuVar.a) == null) {
            return;
        }
        for (ens ensVar : ensVarArr) {
            if (ensVar != null) {
                ensVar.d();
            }
        }
    }

    private static final boolean h(eou eouVar) {
        int iD = eouVar.d();
        for (int i = 0; i < iD; i++) {
            if (enz.a(eouVar.i(i)) != null) {
                return true;
            }
        }
        return false;
    }

    private static final int i(eou eouVar) {
        long jG = eouVar.g(0);
        return eouVar.m() ? kjb.b(jG) : kjb.a(jG);
    }

    private static final void j(eou eouVar, int i, enu enuVar) {
        int i2 = 0;
        long jG = eouVar.g(0);
        long jG2 = eouVar.m() ? kjb.g(jG, 0, i, 1) : kjb.g(jG, i, 0, 2);
        ens[] ensVarArr = enuVar.a;
        int length = ensVarArr.length;
        int i3 = 0;
        while (i2 < length) {
            ens ensVar = ensVarArr[i2];
            int i4 = i3 + 1;
            if (ensVar != null) {
                ensVar.b = kjb.d(jG2, kjb.c(eouVar.g(i3), jG));
            }
            i2++;
            i3 = i4;
        }
    }

    private final void k(eou eouVar) {
        Object objF = this.d.f(eouVar.h());
        objF.getClass();
        ens[] ensVarArr = ((enu) objF).a;
        int length = ensVarArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            ens ensVar = ensVarArr[i];
            int i3 = i2 + 1;
            if (ensVar != null) {
                ensVar.b = eouVar.g(i2);
            }
            i++;
            i2 = i3;
        }
    }

    private static final int l(int[] iArr, eou eouVar) {
        int iB = eouVar.b();
        int iE = eouVar.e() + iB;
        int iMax = 0;
        while (iB < iE) {
            int iC = iArr[iB] + eouVar.c();
            iArr[iB] = iC;
            iMax = Math.max(iMax, iC);
            iB++;
        }
        return iMax;
    }

    public final long a() {
        List list = this.a;
        int size = list.size();
        long jMax = 0;
        for (int i = 0; i < size; i++) {
            ens ensVar = (ens) list.get(i);
            ini iniVar = ensVar.d;
            if (iniVar != null) {
                jMax = (Math.max((int) (jMax & 4294967295L), kjb.b(ensVar.b) + ((int) (iniVar.n & 4294967295L))) & 4294967295L) | (Math.max((int) (jMax >> 32), kjb.a(ensVar.b) + ((int) (iniVar.n >> 32))) << 32);
            }
        }
        return jMax;
    }

    public final ens b(Object obj, int i) {
        ens[] ensVarArr;
        enu enuVar = (enu) this.d.f(obj);
        if (enuVar == null || (ensVarArr = enuVar.a) == null) {
            return null;
        }
        return ensVarArr[i];
    }

    public final void c() {
        f();
        this.k = null;
        this.e = -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0161  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(int r38, int r39, int r40, java.util.List r41, defpackage.eqr r42, defpackage.eox r43, boolean r44, boolean r45, int r46, boolean r47, int r48, int r49, defpackage.fdjx r50, defpackage.iie r51) {
        /*
            Method dump skipped, instructions count: 1252
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator.e(int, int, int, java.util.List, eqr, eox, boolean, boolean, int, boolean, int, int, fdjx, iie):void");
    }
}
