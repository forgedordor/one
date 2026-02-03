package defpackage;

import com.android.vcard.VCardConfig;
import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hre {
    public final hra a;
    public int[] b;
    public Object[] c;
    public ArrayList d;
    public HashMap e;
    public cuh f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;
    public int l;
    public int m;
    public int n;
    public int o;
    public cuh p;
    public int q;
    public int r;
    public int s;
    public boolean t;
    private final hog u;
    private final hog v;
    private final hog w;
    private cug x;

    public hre(hra hraVar) {
        this.a = hraVar;
        this.b = hraVar.a;
        this.c = hraVar.c;
        this.d = hraVar.h;
        this.e = hraVar.i;
        this.f = hraVar.j;
        int i = hraVar.b;
        this.g = i;
        this.h = (this.b.length / 5) - i;
        int i2 = hraVar.d;
        this.k = i2;
        this.l = this.c.length - i2;
        this.m = i;
        this.u = new hog();
        this.v = new hog();
        this.w = new hog();
        this.r = i;
        this.s = -1;
    }

    public static final int W(int i, int i2, int i3, int i4) {
        return i > i2 ? -(((i4 - i3) - i) + 1) : i;
    }

    public static /* synthetic */ void Y(hre hreVar) {
        int i = hreVar.s;
        int iH = hreVar.h(i) * 5;
        int[] iArr = hreVar.b;
        int i2 = iH + 1;
        int i3 = iArr[i2];
        if ((i3 & VCardConfig.FLAG_CONVERT_PHONETIC_NAME_STRINGS) != 0) {
            return;
        }
        int i4 = (i3 & (-134217729)) | VCardConfig.FLAG_CONVERT_PHONETIC_NAME_STRINGS;
        iArr[i2] = i4;
        if ((67108864 & i4) == 0) {
            hreVar.Q(hreVar.l(i));
        }
    }

    private final int ab(int[] iArr, int i) {
        return c(iArr, i) + Integer.bitCount(iArr[(i * 5) + 1] >> 29);
    }

    private final int ac(int[] iArr, int i) {
        return ad(iArr[(h(i) * 5) + 2]);
    }

    private final int ad(int i) {
        return i > -2 ? i : f() + i + 2;
    }

    private final int ae(int i, int i2) {
        return i < i2 ? i : -((f() - i) + 2);
    }

    private final void af() {
        this.v.d((e() - this.h) - this.r);
    }

    private final void ag(int i, Object obj, boolean z, Object obj2) {
        int iA;
        hog hogVar = this.w;
        int i2 = this.s;
        int i3 = this.n;
        hogVar.d(this.o);
        if (i3 > 0) {
            int i4 = this.q;
            int iC = c(this.b, h(i4));
            E(1);
            this.i = iC;
            this.j = iC;
            int iH = h(i4);
            Object obj3 = hmk.a;
            int i5 = obj != obj3 ? 1 : 0;
            int i6 = (z || obj2 == obj3) ? 0 : 1;
            int i7 = this.l;
            int i8 = this.k;
            int length = this.c.length;
            int iW = W(iC, i8, i7, length);
            if (iW >= 0 && this.m < i4) {
                iW = -(((length - i7) - iW) + 1);
            }
            int[] iArr = this.b;
            int i9 = this.s;
            int i10 = iH * 5;
            iArr[i10] = i;
            iArr[i10 + 1] = ((z ? 1 : 0) << 30) | (i5 << 29) | (i6 << 28);
            iArr[i10 + 2] = i9;
            iArr[i10 + 3] = 0;
            iArr[i10 + 4] = iW;
            int i11 = (z ? 1 : 0) + i5 + i6;
            if (i11 > 0) {
                F(i11, i4);
                Object[] objArr = this.c;
                int i12 = this.i;
                if (z) {
                    objArr[i12] = obj2;
                    i12++;
                }
                if (i5 != 0) {
                    objArr[i12] = obj;
                    i12++;
                }
                if (i6 != 0) {
                    objArr[i12] = obj2;
                    i12++;
                }
                this.i = i12;
            }
            this.o = 0;
            iA = i4 + 1;
            this.s = i4;
            this.q = iA;
            if (i2 >= 0 && t(i2) != null) {
                throw null;
            }
        } else {
            this.u.d(i2);
            af();
            int i13 = this.q;
            int iH2 = h(i13);
            if (!fdbq.f(obj2, hmk.a)) {
                if (z) {
                    R(this.q, obj2);
                } else {
                    P(obj2);
                }
            }
            this.i = n(this.b, iH2);
            this.j = c(this.b, h(this.q + 1));
            int[] iArr2 = this.b;
            this.o = iArr2[(iH2 * 5) + 1] & 67108863;
            this.s = i13;
            this.q = i13 + 1;
            iA = i13 + hrc.a(iArr2, iH2);
        }
        this.r = iA;
    }

    private static final int ah(int i, int i2, int i3) {
        return i < 0 ? (i3 - i2) + i + 1 : i;
    }

    private final void ai() {
        this.r = (e() - this.h) - this.v.b();
    }

    private final void aj(Object obj) {
        if (this.n > 0) {
            F(1, this.s);
        }
        Object[] objArr = this.c;
        int i = this.i;
        int i2 = i + 1;
        this.i = i2;
        Object obj2 = objArr[d(i)];
        if (i2 > this.j) {
            hmz.j("Writing to an invalid slot");
        }
        this.c[d(this.i - 1)] = obj;
    }

    public final void A(boolean z) {
        this.t = true;
        if (z && this.u.b == 0) {
            G(f());
            H(this.c.length - this.l, this.g);
            int i = this.k;
            fcur.d(this.c, null, i, this.l + i);
            I();
        }
        hra hraVar = this.a;
        int[] iArr = this.b;
        int i2 = this.g;
        Object[] objArr = this.c;
        int i3 = this.k;
        ArrayList arrayList = this.d;
        HashMap map = this.e;
        cuh cuhVar = this.f;
        if (!hraVar.f) {
            hpq.a("Unexpected writer close()");
        }
        hraVar.f = false;
        hraVar.g(iArr, i2, objArr, i3, arrayList, map, cuhVar);
    }

    public final void B() {
        if (this.n <= 0) {
            hpq.b("Unbalanced begin/end insert");
        }
        int i = this.n - 1;
        this.n = i;
        if (i == 0) {
            if (this.w.b != this.u.b) {
                hmz.j("startGroup/endGroup mismatch while inserting");
            }
            ai();
        }
    }

    public final void C(int i) {
        if (this.n > 0) {
            hmz.j("Cannot call ensureStarted() while inserting");
        }
        int i2 = this.s;
        if (i2 != i) {
            if (i < i2 || i >= this.r) {
                hmz.j(a.s(i2, i, "Started group at ", " must be a subgroup of the group at "));
            }
            int i3 = this.q;
            int i4 = this.i;
            int i5 = this.j;
            this.q = i;
            M();
            this.q = i3;
            this.i = i4;
            this.j = i5;
        }
    }

    public final void D(int i, int i2, int i3) {
        int iAe = ae(i, this.g);
        while (i3 < i2) {
            int[] iArr = this.b;
            iArr[(h(i3) * 5) + 2] = iAe;
            int iA = hrc.a(iArr, h(i3)) + i3;
            D(i3, iA, i3 + 1);
            i3 = iA;
        }
    }

    public final void E(int i) {
        if (i > 0) {
            int i2 = this.q;
            G(i2);
            int i3 = this.g;
            int i4 = this.h;
            int[] iArr = this.b;
            int length = iArr.length / 5;
            int i5 = length - i4;
            if (i4 < i) {
                int iMax = Math.max(Math.max(length + length, i5 + i), 32);
                int i6 = iMax * 5;
                int i7 = iMax - i5;
                int[] iArr2 = new int[i6];
                fcur.l(iArr, iArr2, 0, 0, i3 * 5);
                fcur.l(iArr, iArr2, (i3 + i7) * 5, (i4 + i3) * 5, length * 5);
                this.b = iArr2;
                i4 = i7;
            }
            int i8 = this.r;
            if (i8 >= i3) {
                this.r = i8 + i;
            }
            int i9 = i3 + i;
            this.g = i9;
            this.h = i4 - i;
            int iW = W(i5 > 0 ? b(i2 + i) : 0, this.m >= i3 ? this.k : 0, this.l, this.c.length);
            for (int i10 = i3; i10 < i9; i10++) {
                this.b[(i10 * 5) + 4] = iW;
            }
            int i11 = this.m;
            if (i11 >= i3) {
                this.m = i11 + i;
            }
        }
    }

    public final void F(int i, int i2) {
        if (i > 0) {
            H(this.i, i2);
            int i3 = this.k;
            int i4 = this.l;
            if (i4 < i) {
                Object[] objArr = this.c;
                int length = objArr.length;
                int i5 = length - i4;
                int iMax = Math.max(Math.max(length + length, i5 + i), 32);
                Object[] objArr2 = new Object[iMax];
                for (int i6 = 0; i6 < iMax; i6++) {
                    objArr2[i6] = null;
                }
                int i7 = iMax - i5;
                int i8 = i4 + i3;
                System.arraycopy(objArr, 0, objArr2, 0, i3);
                System.arraycopy(objArr, i8, objArr2, i3 + i7, length - i8);
                this.c = objArr2;
                i4 = i7;
            }
            int i9 = this.j;
            if (i9 >= i3) {
                this.j = i9 + i;
            }
            this.k = i3 + i;
            this.l = i4 - i;
        }
    }

    public final void G(int i) {
        hlv hlvVar;
        int i2;
        hlv hlvVar2;
        int i3;
        int i4;
        int i5 = this.h;
        int i6 = this.g;
        if (i6 != i) {
            if (!this.d.isEmpty()) {
                int iE = e() - this.h;
                if (i6 < i) {
                    for (int iB = hrc.b(this.d, i6, iE); iB < this.d.size() && (i3 = (hlvVar2 = (hlv) this.d.get(iB)).a) < 0 && (i4 = i3 + iE) < i; iB++) {
                        hlvVar2.a = i4;
                    }
                } else {
                    for (int iB2 = hrc.b(this.d, i, iE); iB2 < this.d.size() && (i2 = (hlvVar = (hlv) this.d.get(iB2)).a) >= 0; iB2++) {
                        hlvVar.a = -(iE - i2);
                    }
                }
            }
            if (i5 > 0) {
                int[] iArr = this.b;
                int i7 = i * 5;
                int i8 = i5 * 5;
                int i9 = i6 * 5;
                int i10 = i7 + i8;
                if (i < i6) {
                    fcur.l(iArr, iArr, i10, i7, i9);
                } else {
                    fcur.l(iArr, iArr, i9, i8 + i9, i10);
                }
            }
            if (i < i6) {
                i6 = i + i5;
            }
            int iE2 = e();
            if (i6 >= iE2) {
                hmz.j("Check failed");
            }
            while (i6 < iE2) {
                int i11 = (i6 * 5) + 2;
                int i12 = this.b[i11];
                int iAe = ae(ad(i12), i);
                if (iAe != i12) {
                    this.b[i11] = iAe;
                }
                i6++;
                if (i6 == i) {
                    i6 += i5;
                }
            }
        }
        this.g = i;
    }

    public final void H(int i, int i2) {
        int i3 = this.l;
        int i4 = this.k;
        int i5 = this.m;
        if (i4 != i) {
            Object[] objArr = this.c;
            if (i < i4) {
                System.arraycopy(objArr, i, objArr, i + i3, i4 - i);
            } else {
                int i6 = i4 + i3;
                System.arraycopy(objArr, i6, objArr, i4, (i + i3) - i6);
            }
        }
        int iMin = Math.min(i2 + 1, f());
        if (i5 != iMin) {
            int length = this.c.length - i3;
            if (iMin < i5) {
                int iH = h(iMin);
                int iH2 = h(i5);
                int i7 = this.g;
                while (iH < iH2) {
                    int i8 = (iH * 5) + 4;
                    int i9 = this.b[i8];
                    if (i9 < 0) {
                        hmz.j("Unexpected anchor value, expected a positive anchor");
                    }
                    this.b[i8] = -((length - i9) + 1);
                    iH++;
                    if (iH == i7) {
                        iH += this.h;
                    }
                }
            } else {
                int iH3 = h(i5);
                int iH4 = h(iMin);
                while (iH3 < iH4) {
                    int i10 = (iH3 * 5) + 4;
                    int i11 = this.b[i10];
                    if (i11 >= 0) {
                        hmz.j("Unexpected anchor value, expected a negative anchor");
                    }
                    this.b[i10] = i11 + length + 1;
                    iH3++;
                    if (iH3 == this.g) {
                        iH3 += this.h;
                    }
                }
            }
            this.m = iMin;
        }
        this.k = i;
    }

    public final void I() {
        int i;
        cug cugVar = this.x;
        if (cugVar != null) {
            while (hpr.c(cugVar)) {
                int iA = hpr.a(cugVar);
                int iH = h(iA) * 5;
                int iJ = iA + 1;
                int iJ2 = j(iA) + iA;
                while (true) {
                    if (iJ >= iJ2) {
                        i = 0;
                        break;
                    } else {
                        if ((this.b[(h(iJ) * 5) + 1] & 201326592) != 0) {
                            i = 1;
                            break;
                        }
                        iJ += j(iJ);
                    }
                }
                int[] iArr = this.b;
                int i2 = iH + 1;
                int i3 = iArr[i2];
                if (((67108864 & i3) != 0 ? 1 : 0) != i) {
                    iArr[i2] = (i << 26) | ((-67108865) & i3);
                    int iL = l(iA);
                    if (iL >= 0) {
                        hpr.b(cugVar, iL);
                    }
                }
            }
        }
    }

    public final void J(int i, int i2, int i3) {
        if (i2 > 0) {
            int i4 = this.l;
            int i5 = i + i2;
            H(i5, i3);
            this.k = i;
            this.l = i4 + i2;
            fcur.d(this.c, null, i, i5);
            int i6 = this.j;
            if (i6 >= i) {
                this.j = i6 - i2;
            }
        }
    }

    public final void K() {
        int i = this.r;
        this.q = i;
        this.i = c(this.b, h(i));
    }

    public final void L(int i, Object obj, Object obj2) {
        ag(i, obj, false, obj2);
    }

    public final void M() {
        if (this.n != 0) {
            hmz.j("Key must be supplied when inserting");
        }
        Object obj = hmk.a;
        ag(0, obj, false, obj);
    }

    public final void N(int i, Object obj) {
        ag(i, obj, false, hmk.a);
    }

    public final void O(int i, Object obj) {
        ag(i, obj, true, hmk.a);
    }

    public final void P(Object obj) {
        int iH = h(this.q);
        if ((this.b[(iH * 5) + 1] & VCardConfig.FLAG_REFRAIN_QP_TO_NAME_PROPERTIES) == 0) {
            hmz.j("Updating the data of a group that was not created with a data slot");
        }
        this.c[d(ab(this.b, iH))] = obj;
    }

    public final void Q(int i) {
        if (i >= 0) {
            cug cugVar = this.x;
            if (cugVar == null) {
                cugVar = new cug((byte[]) null);
                this.x = cugVar;
            }
            hpr.b(cugVar, i);
        }
    }

    public final void R(int i, Object obj) {
        int iH = h(i);
        int[] iArr = this.b;
        if (iH >= iArr.length || (iArr[(iH * 5) + 1] & 1073741824) == 0) {
            hmz.j(a.e(i, "Updating the node of a group at ", " that was not created with as a node group"));
        }
        this.c[d(c(this.b, iH))] = obj;
    }

    public final boolean S(int i, int i2) {
        int iE;
        int iJ;
        if (i2 == this.s) {
            iE = this.r;
        } else {
            hog hogVar = this.u;
            if (i2 > hogVar.a(0)) {
                iJ = j(i2);
            } else {
                int[] iArr = hogVar.a;
                int iMin = Math.min(iArr.length, hogVar.b);
                int i3 = 0;
                while (true) {
                    if (i3 >= iMin) {
                        i3 = -1;
                        break;
                    }
                    if (iArr[i3] == i2) {
                        break;
                    }
                    i3++;
                }
                if (i3 < 0) {
                    iJ = j(i2);
                } else {
                    iE = (e() - this.h) - this.v.a[i3];
                }
            }
            iE = iJ + i2;
        }
        return i > i2 && i < iE;
    }

    public final boolean T(int i) {
        return (this.b[(h(i) * 5) + 1] & 1073741824) != 0;
    }

    public final boolean U() {
        if (this.n != 0) {
            hmz.j("Cannot remove group while inserting");
        }
        int i = this.q;
        int i2 = this.i;
        int iC = c(this.b, h(i));
        int iM = m();
        if (t(this.s) != null && s(i) != null) {
            throw null;
        }
        cug cugVar = this.x;
        if (cugVar != null) {
            while (hpr.c(cugVar)) {
                if (cugVar.b == 0) {
                    cwh.d("IntList is empty.");
                }
                if (cugVar.a[0] < i) {
                    break;
                }
                hpr.a(cugVar);
            }
        }
        boolean zV = V(i, this.q - i);
        J(iC, this.i - iC, i - 1);
        this.q = i;
        this.i = i2;
        this.o -= iM;
        return zV;
    }

    public final boolean V(int i, int i2) {
        if (i2 > 0) {
            ArrayList arrayList = this.d;
            G(i);
            if (!arrayList.isEmpty()) {
                HashMap map = this.e;
                int i3 = i + i2;
                int iB = hrc.b(this.d, i3, e() - this.h);
                if (iB >= this.d.size()) {
                    iB--;
                }
                int i4 = iB + 1;
                int i5 = 0;
                while (iB >= 0) {
                    hlv hlvVar = (hlv) this.d.get(iB);
                    int iA = a(hlvVar);
                    if (iA < i) {
                        break;
                    }
                    if (iA < i3) {
                        hlvVar.a = Integer.MIN_VALUE;
                        if (map != null) {
                        }
                        if (i5 == 0) {
                            i5 = iB + 1;
                        }
                        i4 = iB;
                    }
                    iB--;
                }
                z = i4 < i5;
                if (z) {
                    this.d.subList(i4, i5).clear();
                }
            }
            this.g = i;
            this.h += i2;
            int i6 = this.m;
            if (i6 > i) {
                this.m = Math.max(i, i6 - i2);
            }
            int i7 = this.r;
            if (i7 >= this.g) {
                this.r = i7 - i2;
            }
            int i8 = this.s;
            if (i8 >= 0 && (this.b[(h(i8) * 5) + 1] & VCardConfig.FLAG_APPEND_TYPE_PARAM) != 0) {
                Q(i8);
            }
        }
        return z;
    }

    public final void X() {
        cuu cuuVar;
        int i = this.n;
        int i2 = this.q;
        int i3 = this.r;
        int i4 = this.s;
        int iH = h(i4);
        int i5 = i2 - i4;
        int i6 = this.o;
        int i7 = (iH * 5) + 1;
        int i8 = this.b[i7] & 1073741824;
        if (i > 0) {
            cuh cuhVar = this.p;
            if (cuhVar != null && (cuuVar = (cuu) cuhVar.a(i4)) != null) {
                Object[] objArr = cuuVar.b;
                int i9 = cuuVar.c;
                for (int i10 = 0; i10 < i9; i10++) {
                    aj(objArr[i10]);
                }
            }
            hrc.h(this.b, iH, i5);
            hrc.i(this.b, iH, i6);
            hog hogVar = this.w;
            if (i8 != 0) {
                i6 = 1;
            }
            this.o = hogVar.b() + i6;
            int iAc = ac(this.b, i4);
            this.s = iAc;
            int iF = iAc < 0 ? f() : h(iAc + 1);
            iC = iF >= 0 ? c(this.b, iF) : 0;
            this.i = iC;
            this.j = iC;
            return;
        }
        if (i2 != i3) {
            hmz.j("Expected to be at the end of a group");
        }
        int iA = hrc.a(this.b, iH);
        int[] iArr = this.b;
        int i11 = iArr[i7] & 67108863;
        hrc.h(iArr, iH, i5);
        hrc.i(this.b, iH, i6);
        int iB = this.u.b();
        ai();
        this.s = iB;
        int iAc2 = ac(this.b, i4);
        int iB2 = this.w.b();
        this.o = iB2;
        if (iAc2 == iB) {
            this.o = iB2 + (i8 == 0 ? i6 - i11 : 0);
            return;
        }
        int i12 = i5 - iA;
        int i13 = i8 != 0 ? 0 : i6 - i11;
        if (i12 != 0 || i13 != 0) {
            while (iAc2 != 0 && iAc2 != iB) {
                if (i13 == 0) {
                    if (i12 == 0) {
                        break;
                    } else {
                        i13 = 0;
                    }
                }
                int iH2 = h(iAc2);
                int i14 = (iH2 * 5) + 1;
                if (i12 != 0) {
                    hrc.h(this.b, iH2, hrc.a(this.b, iH2) + i12);
                }
                if (i13 != 0) {
                    int[] iArr2 = this.b;
                    hrc.i(iArr2, iH2, (iArr2[i14] & 67108863) + i13);
                }
                int[] iArr3 = this.b;
                if ((iArr3[i14] & 1073741824) != 0) {
                    i13 = 0;
                }
                iAc2 = ac(iArr3, iAc2);
            }
            iC = i13;
        }
        this.o += iC;
    }

    public final void Z(hra hraVar, int i) {
        hra hraVar2;
        int i2;
        if (this.n <= 0) {
            hmz.j("Check failed");
        }
        if (i == 0) {
            if (this.q == 0 && this.a.b == 0) {
                int iA = hrc.a(hraVar.a, 0);
                int i3 = hraVar.b;
                if (iA == i3) {
                    int[] iArr = this.b;
                    Object[] objArr = this.c;
                    ArrayList arrayList = this.d;
                    HashMap map = this.e;
                    cuh cuhVar = this.f;
                    int[] iArr2 = hraVar.a;
                    Object[] objArr2 = hraVar.c;
                    int i4 = hraVar.d;
                    HashMap map2 = hraVar.i;
                    cuh cuhVar2 = hraVar.j;
                    this.b = iArr2;
                    this.c = objArr2;
                    this.d = hraVar.h;
                    this.g = i3;
                    this.h = (iArr2.length / 5) - i3;
                    this.k = i4;
                    this.l = objArr2.length - i4;
                    this.m = i3;
                    this.e = map2;
                    this.f = cuhVar2;
                    hraVar.g(iArr, 0, objArr, 0, arrayList, map, cuhVar);
                    return;
                }
            }
            hraVar2 = hraVar;
            i2 = 0;
        } else {
            hraVar2 = hraVar;
            i2 = i;
        }
        hre hreVarD = hraVar2.d();
        try {
            hrd.a(hreVarD, i2, this, true, true, false);
            hreVarD.A(true);
        } catch (Throwable th) {
            hreVarD.A(false);
            throw th;
        }
    }

    public final int a(hlv hlvVar) {
        int i = hlvVar.a;
        return i < 0 ? f() + i : i;
    }

    public final void aa(Object obj) {
        if (this.n <= 0 || this.i == this.k) {
            aj(obj);
            return;
        }
        cuh cuhVar = this.p;
        byte[] bArr = null;
        if (cuhVar == null) {
            cuhVar = new cuh((byte[]) null);
        }
        this.p = cuhVar;
        int i = this.s;
        Object objA = cuhVar.a(i);
        if (objA == null) {
            objA = new cuu(bArr);
            cuhVar.f(i, objA);
        }
        ((cuu) objA).h(obj);
    }

    public final int b(int i) {
        return c(this.b, h(i));
    }

    public final int c(int[] iArr, int i) {
        return i >= e() ? this.c.length - this.l : ah(iArr[(i * 5) + 4], this.l, this.c.length);
    }

    public final int d(int i) {
        return i + (this.l * (i < this.k ? 0 : 1));
    }

    public final int e() {
        return this.b.length / 5;
    }

    public final int f() {
        return e() - this.h;
    }

    public final int g() {
        return this.c.length - this.l;
    }

    public final int h(int i) {
        return i + (this.h * (i < this.g ? 0 : 1));
    }

    public final int i(int i) {
        return this.b[h(i) * 5];
    }

    public final int j(int i) {
        return hrc.a(this.b, h(i));
    }

    public final int k(int i) {
        return this.b[(h(i) * 5) + 1] & 67108863;
    }

    public final int l(int i) {
        return ac(this.b, i);
    }

    public final int m() {
        int i = this.q;
        int iH = h(i);
        int iA = i + hrc.a(this.b, iH);
        this.q = iA;
        this.i = c(this.b, h(iA));
        int i2 = this.b[(iH * 5) + 1];
        if ((1073741824 & i2) != 0) {
            return 1;
        }
        return i2 & 67108863;
    }

    public final int n(int[] iArr, int i) {
        return i >= e() ? this.c.length - this.l : ah(hrc.e(iArr, i), this.l, this.c.length);
    }

    public final int o(int i, int i2) {
        int iN = n(this.b, h(i));
        int iC = c(this.b, h(i + 1));
        int i3 = iN + i2;
        if (i3 >= iN && i3 < iC) {
            return i3;
        }
        hmz.j(a.s(i, i2, "Write to an invalid slot index ", " for group "));
        return i3;
    }

    public final int p(int i) {
        return c(this.b, h(i + j(i)));
    }

    public final int q(int i) {
        return n(this.b, h(i));
    }

    public final hlv r(int i) {
        ArrayList arrayList = this.d;
        int iD = hrc.d(arrayList, i, f());
        if (iD >= 0) {
            return (hlv) arrayList.get(iD);
        }
        if (i > this.g) {
            i = -(f() - i);
        }
        hlv hlvVar = new hlv(i);
        arrayList.add(-(iD + 1), hlvVar);
        return hlvVar;
    }

    public final hlv s(int i) {
        if (i < 0 || i >= f()) {
            return null;
        }
        return hrc.f(this.d, i, f());
    }

    public final hof t(int i) {
        hlv hlvVarS;
        HashMap map = this.e;
        if (map == null || (hlvVarS = s(i)) == null) {
            return null;
        }
        return (hof) map.get(hlvVarS);
    }

    public final String toString() {
        return "SlotWriter(current = " + this.q + " end=" + this.r + " size = " + f() + " gap=" + this.g + '-' + (this.g + this.h) + ')';
    }

    public final Object u(int i) {
        int iH = h(i);
        int[] iArr = this.b;
        return (iArr[(iH * 5) + 1] & VCardConfig.FLAG_REFRAIN_QP_TO_NAME_PROPERTIES) != 0 ? this.c[ab(iArr, iH)] : hmk.a;
    }

    public final Object v(int i) {
        int iH = h(i);
        int[] iArr = this.b;
        if ((iArr[(iH * 5) + 1] & 536870912) != 0) {
            return this.c[hrc.c(iArr, iH)];
        }
        return null;
    }

    public final Object w(int i) {
        int iH = h(i);
        int[] iArr = this.b;
        if ((iArr[(iH * 5) + 1] & 1073741824) != 0) {
            return this.c[d(c(iArr, iH))];
        }
        return null;
    }

    public final Object x(int i, int i2, Object obj) {
        int iD = d(o(i, i2));
        Object[] objArr = this.c;
        Object obj2 = objArr[iD];
        objArr[iD] = obj;
        return obj2;
    }

    public final void y(int i) {
        if (i < 0) {
            hmz.j("Cannot seek backwards");
        }
        if (this.n > 0) {
            hpq.b("Cannot call seek() while inserting");
        }
        if (i == 0) {
            return;
        }
        int i2 = this.q + i;
        if (i2 < this.s || i2 > this.r) {
            hmz.j("Cannot seek outside the current group (" + this.s + '-' + this.r + ')');
        }
        this.q = i2;
        int iC = c(this.b, h(i2));
        this.i = iC;
        this.j = iC;
    }

    public final void z() {
        int i = this.n;
        this.n = i + 1;
        if (i == 0) {
            af();
        }
    }
}
