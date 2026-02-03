package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hwg {
    public static final hwg a = new hwg(0, 0, new Object[0]);
    public Object[] b;
    private int c;
    private int d;
    private final hwt e;

    public hwg(int i, int i2, Object[] objArr, hwt hwtVar) {
        this.c = i;
        this.d = i2;
        this.e = hwtVar;
        this.b = objArr;
    }

    private final int n() {
        if (this.d == 0) {
            return this.b.length >> 1;
        }
        int iBitCount = Integer.bitCount(this.c);
        int length = this.b.length;
        for (int i = iBitCount + iBitCount; i < length; i++) {
            iBitCount += i(i).n();
        }
        return iBitCount;
    }

    private final hwg o(int i, Object obj, Object obj2, int i2, Object obj3, Object obj4, int i3, hwt hwtVar) {
        if (i3 > 30) {
            return new hwg(0, 0, new Object[]{obj, obj2, obj3, obj4}, hwtVar);
        }
        int iA = hwk.a(i, i3);
        int iA2 = hwk.a(i2, i3);
        if (iA == iA2) {
            return new hwg(0, 1 << iA, new Object[]{o(i, obj, obj2, i2, obj3, obj4, i3 + 5, hwtVar)}, hwtVar);
        }
        Object[] objArr = new Object[4];
        if (iA < iA2) {
            objArr[0] = obj;
            objArr[1] = obj2;
            objArr[2] = obj3;
            objArr[3] = obj4;
        } else {
            objArr[0] = obj3;
            objArr[1] = obj4;
            objArr[2] = obj;
            objArr[3] = obj2;
        }
        return new hwg((1 << iA) | (1 << iA2), 0, objArr, hwtVar);
    }

    private final hwg p(int i, hvr hvrVar) {
        hvrVar.g(hvrVar.b() - 1);
        hvrVar.c = v(i);
        Object[] objArr = this.b;
        if (objArr.length == 2) {
            return null;
        }
        if (this.e != hvrVar.a) {
            return new hwg(0, 0, hwk.c(objArr, i), hvrVar.a);
        }
        this.b = hwk.c(objArr, i);
        return this;
    }

    private final hwg q(int i, int i2, hvr hvrVar) {
        hvrVar.g(hvrVar.b() - 1);
        hvrVar.c = v(i);
        Object[] objArr = this.b;
        if (objArr.length == 2) {
            return null;
        }
        if (this.e != hvrVar.a) {
            return new hwg(i2 ^ this.c, this.d, hwk.c(objArr, i), hvrVar.a);
        }
        this.b = hwk.c(objArr, i);
        this.c ^= i2;
        return this;
    }

    private final hwg r(hwg hwgVar, hwg hwgVar2, int i, int i2, hwt hwtVar) {
        if (hwgVar2 != null) {
            return (this.e == hwtVar || hwgVar != hwgVar2) ? s(i, hwgVar2, hwtVar) : this;
        }
        Object[] objArr = this.b;
        if (objArr.length == 1) {
            return null;
        }
        if (this.e != hwtVar) {
            return new hwg(this.c, i2 ^ this.d, hwk.d(objArr, i), hwtVar);
        }
        this.b = hwk.d(objArr, i);
        this.d ^= i2;
        return this;
    }

    private final hwg s(int i, hwg hwgVar, hwt hwtVar) {
        Object[] objArr = this.b;
        int length = objArr.length;
        if (length == 1) {
            if (hwgVar.b.length == 2 && hwgVar.d == 0) {
                hwgVar.c = this.d;
                return hwgVar;
            }
            length = 1;
        }
        if (this.e == hwtVar) {
            objArr[i] = hwgVar;
            return this;
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, length);
        objArrCopyOf.getClass();
        objArrCopyOf[i] = hwgVar;
        return new hwg(this.c, this.d, objArrCopyOf, hwtVar);
    }

    private final hwg t(int i, int i2, hwg hwgVar) {
        Object[] objArr = hwgVar.b;
        if (objArr.length != 2 || hwgVar.d != 0) {
            Object[] objArr2 = this.b;
            Object[] objArrCopyOf = Arrays.copyOf(objArr2, objArr2.length);
            objArrCopyOf.getClass();
            objArrCopyOf[i] = hwgVar;
            return new hwg(this.c, this.d, objArrCopyOf);
        }
        if (this.b.length == 1) {
            hwgVar.c = this.d;
            return hwgVar;
        }
        int iB = b(i2);
        Object[] objArr3 = this.b;
        Object obj = objArr[0];
        Object obj2 = objArr[1];
        int length = objArr3.length;
        Object[] objArrCopyOf2 = Arrays.copyOf(objArr3, length + 1);
        objArrCopyOf2.getClass();
        fcur.n(objArrCopyOf2, objArrCopyOf2, i + 2, i + 1, length);
        fcur.n(objArrCopyOf2, objArrCopyOf2, iB + 2, iB, i);
        objArrCopyOf2[iB] = obj;
        objArrCopyOf2[iB + 1] = obj2;
        return new hwg(this.c ^ i2, i2 ^ this.d, objArrCopyOf2);
    }

    private final Object u(int i) {
        return this.b[i];
    }

    private final Object v(int i) {
        return this.b[i + 1];
    }

    private final boolean w(Object obj) {
        fddo fddoVarQ = fddu.q(fddu.r(0, this.b.length), 2);
        int i = fddoVarQ.a;
        int i2 = fddoVarQ.b;
        int i3 = fddoVarQ.c;
        if ((i3 > 0 && i <= i2) || (i3 < 0 && i2 <= i)) {
            while (!fdbq.f(obj, this.b[i])) {
                if (i != i2) {
                    i += i3;
                }
            }
            return true;
        }
        return false;
    }

    private final boolean x(hwg hwgVar) {
        if (this == hwgVar) {
            return true;
        }
        if (this.d != hwgVar.d || this.c != hwgVar.c) {
            return false;
        }
        int length = this.b.length;
        for (int i = 0; i < length; i++) {
            if (this.b[i] != hwgVar.b[i]) {
                return false;
            }
        }
        return true;
    }

    private final boolean y(int i) {
        return (i & this.d) != 0;
    }

    private final Object[] z(int i, int i2, int i3, Object obj, Object obj2, int i4, hwt hwtVar) {
        Object objU = u(i);
        hwg hwgVarO = o(objU != null ? objU.hashCode() : 0, objU, v(i), i3, obj, obj2, i4 + 5, hwtVar);
        int iC = c(i2);
        int i5 = iC + 1;
        Object[] objArr = this.b;
        int length = objArr.length;
        Object[] objArr2 = new Object[length - 1];
        fcur.x(objArr, objArr2, 0, i, 6);
        fcur.n(objArr, objArr2, i, i + 2, i5);
        objArr2[iC - 1] = hwgVarO;
        fcur.n(objArr, objArr2, iC, i5, length);
        return objArr2;
    }

    public final int a() {
        return Integer.bitCount(this.c);
    }

    public final int b(int i) {
        int iBitCount = Integer.bitCount((i - 1) & this.c);
        return iBitCount + iBitCount;
    }

    public final int c(int i) {
        return (this.b.length - 1) - Integer.bitCount((i - 1) & this.d);
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00d0, code lost:
    
        if (r13 == null) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00d9, code lost:
    
        if (r13 == null) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00dc, code lost:
    
        r13.a = t(r11, r4, r13.a);
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00e4, code lost:
    
        return r13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.hwf d(int r11, java.lang.Object r12, java.lang.Object r13, int r14) {
        /*
            Method dump skipped, instructions count: 255
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hwg.d(int, java.lang.Object, java.lang.Object, int):hwf");
    }

    public final hwg e(int i, Object obj, Object obj2, int i2, hvr hvrVar) {
        hvr hvrVar2;
        hwg hwgVarE;
        int iA = 1 << hwk.a(i, i2);
        if (m(iA)) {
            int iB = b(iA);
            if (!fdbq.f(obj, u(iB))) {
                hvrVar.g(hvrVar.b() + 1);
                hwt hwtVar = hvrVar.a;
                if (this.e != hwtVar) {
                    return new hwg(this.c ^ iA, this.d | iA, z(iB, iA, i, obj, obj2, i2, hwtVar), hwtVar);
                }
                this.b = z(iB, iA, i, obj, obj2, i2, hwtVar);
                this.c ^= iA;
                this.d |= iA;
                return this;
            }
            hvrVar.c = v(iB);
            if (v(iB) == obj2) {
                return this;
            }
            int i3 = iB + 1;
            if (this.e == hvrVar.a) {
                this.b[i3] = obj2;
                return this;
            }
            hvrVar.d++;
            Object[] objArr = this.b;
            Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
            objArrCopyOf.getClass();
            objArrCopyOf[i3] = obj2;
            return new hwg(this.c, this.d, objArrCopyOf, hvrVar.a);
        }
        if (!y(iA)) {
            hvrVar.g(hvrVar.b() + 1);
            hwt hwtVar2 = hvrVar.a;
            int iB2 = b(iA);
            if (this.e != hwtVar2) {
                return new hwg(this.c | iA, this.d, hwk.b(this.b, iB2, obj, obj2), hwtVar2);
            }
            this.b = hwk.b(this.b, iB2, obj, obj2);
            this.c |= iA;
            return this;
        }
        int iC = c(iA);
        hwg hwgVarI = i(iC);
        if (i2 == 30) {
            fddo fddoVarQ = fddu.q(fddu.r(0, hwgVarI.b.length), 2);
            int i4 = fddoVarQ.a;
            int i5 = fddoVarQ.b;
            int i6 = fddoVarQ.c;
            if ((i6 <= 0 || i4 > i5) && (i6 >= 0 || i5 > i4)) {
                hvrVar.g(hvrVar.b() + 1);
                hwgVarE = new hwg(0, 0, hwk.b(hwgVarI.b, 0, obj, obj2), hvrVar.a);
                hvrVar2 = hvrVar;
            } else {
                while (!fdbq.f(obj, hwgVarI.u(i4))) {
                    if (i4 == i5) {
                        hvrVar.g(hvrVar.b() + 1);
                        hwgVarE = new hwg(0, 0, hwk.b(hwgVarI.b, 0, obj, obj2), hvrVar.a);
                        break;
                    }
                    i4 += i6;
                }
                int i7 = i4 + 1;
                hvrVar.c = hwgVarI.v(i4);
                if (hwgVarI.e == hvrVar.a) {
                    hwgVarI.b[i7] = obj2;
                    hvrVar2 = hvrVar;
                    hwgVarE = hwgVarI;
                } else {
                    hvrVar.d++;
                    Object[] objArr2 = hwgVarI.b;
                    Object[] objArrCopyOf2 = Arrays.copyOf(objArr2, objArr2.length);
                    objArrCopyOf2.getClass();
                    objArrCopyOf2[i7] = obj2;
                    hwgVarE = new hwg(0, 0, objArrCopyOf2, hvrVar.a);
                    hvrVar2 = hvrVar;
                }
            }
        } else {
            hvrVar2 = hvrVar;
            hwgVarE = hwgVarI.e(i, obj, obj2, i2 + 5, hvrVar2);
        }
        return hwgVarI != hwgVarE ? s(iC, hwgVarE, hvrVar2.a) : this;
    }

    public final hwg f(hwg hwgVar, int i, hwq hwqVar, hvr hvrVar) {
        hwg hwgVar2;
        hvr hvrVar2;
        Object[] objArr;
        int i2;
        hwg hwgVarO;
        int i3;
        int iHashCode;
        hvr hvrVar3 = hvrVar;
        if (this == hwgVar) {
            hwqVar.a += n();
            return this;
        }
        int i4 = 0;
        if (i > 30) {
            hwt hwtVar = hvrVar3.a;
            Object[] objArr2 = this.b;
            Object[] objArrCopyOf = Arrays.copyOf(objArr2, objArr2.length + hwgVar.b.length);
            objArrCopyOf.getClass();
            int length = this.b.length;
            fddo fddoVarQ = fddu.q(fddu.r(0, hwgVar.b.length), 2);
            int i5 = fddoVarQ.a;
            int i6 = fddoVarQ.b;
            int i7 = fddoVarQ.c;
            if ((i7 > 0 && i5 <= i6) || (i7 < 0 && i6 <= i5)) {
                while (true) {
                    if (w(hwgVar.b[i5])) {
                        hwqVar.a++;
                    } else {
                        Object[] objArr3 = hwgVar.b;
                        objArrCopyOf[length] = objArr3[i5];
                        objArrCopyOf[length + 1] = objArr3[i5 + 1];
                        length += 2;
                    }
                    if (i5 == i6) {
                        break;
                    }
                    i5 += i7;
                }
            }
            if (length != this.b.length) {
                if (length != hwgVar.b.length) {
                    if (length == objArrCopyOf.length) {
                        return new hwg(0, 0, objArrCopyOf, hwtVar);
                    }
                    Object[] objArrCopyOf2 = Arrays.copyOf(objArrCopyOf, length);
                    objArrCopyOf2.getClass();
                    return new hwg(0, 0, objArrCopyOf2, hwtVar);
                }
            }
            return this;
        }
        int i8 = this.d | hwgVar.d;
        int i9 = this.c;
        int i10 = hwgVar.c;
        int i11 = i9 ^ i10;
        int i12 = i9 & i10;
        int i13 = (~i8) & i11;
        while (i12 != 0) {
            int iLowestOneBit = Integer.lowestOneBit(i12);
            if (fdbq.f(u(b(iLowestOneBit)), hwgVar.u(hwgVar.b(iLowestOneBit)))) {
                i13 |= iLowestOneBit;
            } else {
                i8 |= iLowestOneBit;
            }
            i12 ^= iLowestOneBit;
        }
        if ((i8 & i13) != 0) {
            hpq.b("Check failed.");
        }
        if (fdbq.f(this.e, hvrVar3.a) && this.c == i13 && this.d == i8) {
            hwgVar2 = this;
        } else {
            int iBitCount = Integer.bitCount(i13);
            hwgVar2 = new hwg(i13, i8, new Object[iBitCount + iBitCount + Integer.bitCount(i8)]);
        }
        int i14 = i8;
        int i15 = 0;
        while (i14 != 0) {
            int iLowestOneBit2 = Integer.lowestOneBit(i14);
            Object[] objArr4 = hwgVar2.b;
            int length2 = (objArr4.length - 1) - i15;
            if (y(iLowestOneBit2)) {
                hwgVarO = i(c(iLowestOneBit2));
                if (hwgVar.y(iLowestOneBit2)) {
                    hwgVarO = hwgVarO.f(hwgVar.i(hwgVar.c(iLowestOneBit2)), i + 5, hwqVar, hvrVar3);
                    hvrVar2 = hvrVar3;
                } else {
                    if (hwgVar.m(iLowestOneBit2)) {
                        int i16 = i + 5;
                        int iB = hwgVar.b(iLowestOneBit2);
                        Object objU = hwgVar.u(iB);
                        Object objV = hwgVar.v(iB);
                        int iB2 = hvrVar3.b();
                        if (objU != null) {
                            i3 = iB2;
                            iHashCode = objU.hashCode();
                        } else {
                            int i17 = i4;
                            i3 = iB2;
                            iHashCode = i17;
                        }
                        hwgVarO = hwgVarO.e(iHashCode, objU, objV, i16, hvrVar3);
                        if (hvrVar.b() == i3) {
                            hwqVar.a++;
                        }
                    }
                    hvrVar2 = hvrVar;
                }
            } else if (hwgVar.y(iLowestOneBit2)) {
                hwgVarO = hwgVar.i(hwgVar.c(iLowestOneBit2));
                if (m(iLowestOneBit2)) {
                    int i18 = i + 5;
                    int iB3 = b(iLowestOneBit2);
                    Object objU2 = u(iB3);
                    if (hwgVarO.l(objU2 != null ? objU2.hashCode() : 0, objU2, i18)) {
                        hwqVar.a++;
                    } else {
                        hvrVar3 = hvrVar;
                        hwgVarO = hwgVarO.e(objU2 != null ? objU2.hashCode() : 0, objU2, v(iB3), i18, hvrVar3);
                        hvrVar2 = hvrVar3;
                    }
                }
                hvrVar2 = hvrVar;
            } else {
                hvrVar2 = hvrVar;
                int i19 = i + 5;
                int iB4 = b(iLowestOneBit2);
                Object objU3 = u(iB4);
                Object objV2 = v(iB4);
                int iB5 = hwgVar.b(iLowestOneBit2);
                Object objU4 = hwgVar.u(iB5);
                objArr = objArr4;
                i2 = iLowestOneBit2;
                hwgVarO = o(objU3 != null ? objU3.hashCode() : 0, objU3, objV2, objU4 != null ? objU4.hashCode() : 0, objU4, hwgVar.v(iB5), i19, hvrVar2.a);
                objArr[length2] = hwgVarO;
                i14 ^= i2;
                i15++;
                hvrVar3 = hvrVar2;
                i4 = 0;
            }
            i2 = iLowestOneBit2;
            objArr = objArr4;
            objArr[length2] = hwgVarO;
            i14 ^= i2;
            i15++;
            hvrVar3 = hvrVar2;
            i4 = 0;
        }
        int i20 = 0;
        while (i13 != 0) {
            int i21 = i20 + i20;
            int i22 = i21 + 1;
            int iLowestOneBit3 = Integer.lowestOneBit(i13);
            if (hwgVar.m(iLowestOneBit3)) {
                int iB6 = hwgVar.b(iLowestOneBit3);
                hwgVar2.b[i21] = hwgVar.u(iB6);
                hwgVar2.b[i22] = hwgVar.v(iB6);
                if (m(iLowestOneBit3)) {
                    hwqVar.a++;
                }
            } else {
                int iB7 = b(iLowestOneBit3);
                hwgVar2.b[i21] = u(iB7);
                hwgVar2.b[i22] = v(iB7);
            }
            i13 ^= iLowestOneBit3;
            i20++;
        }
        if (!x(hwgVar2)) {
            return hwgVar.x(hwgVar2) ? hwgVar : hwgVar2;
        }
        return this;
    }

    public final hwg g(int i, Object obj, int i2, hvr hvrVar) {
        hwg hwgVarG;
        hwg hwgVar;
        int iA = 1 << hwk.a(i, i2);
        if (m(iA)) {
            int iB = b(iA);
            if (fdbq.f(obj, u(iB))) {
                return q(iB, iA, hvrVar);
            }
        } else if (y(iA)) {
            int iC = c(iA);
            hwg hwgVarI = i(iC);
            if (i2 == 30) {
                fddo fddoVarQ = fddu.q(fddu.r(0, hwgVarI.b.length), 2);
                int i3 = fddoVarQ.a;
                int i4 = fddoVarQ.b;
                int i5 = fddoVarQ.c;
                if ((i5 > 0 && i3 <= i4) || (i5 < 0 && i4 <= i3)) {
                    while (!fdbq.f(obj, hwgVarI.u(i3))) {
                        if (i3 != i4) {
                            i3 += i5;
                        }
                    }
                    hwgVarG = hwgVarI.p(i3, hvrVar);
                }
                hwgVar = hwgVarI;
                return r(hwgVarI, hwgVar, iC, iA, hvrVar.a);
            }
            hwgVarG = hwgVarI.g(i, obj, i2 + 5, hvrVar);
            hwgVar = hwgVarG;
            return r(hwgVarI, hwgVar, iC, iA, hvrVar.a);
        }
        return this;
    }

    public final hwg h(int i, Object obj, Object obj2, int i2, hvr hvrVar) {
        hwg hwgVar;
        int iA = 1 << hwk.a(i, i2);
        if (m(iA)) {
            int iB = b(iA);
            if (fdbq.f(obj, u(iB)) && fdbq.f(obj2, v(iB))) {
                return q(iB, iA, hvrVar);
            }
        } else if (y(iA)) {
            int iC = c(iA);
            hwg hwgVarI = i(iC);
            if (i2 == 30) {
                fddo fddoVarQ = fddu.q(fddu.r(0, hwgVarI.b.length), 2);
                int i3 = fddoVarQ.a;
                int i4 = fddoVarQ.b;
                int i5 = fddoVarQ.c;
                if ((i5 <= 0 || i3 > i4) && (i5 >= 0 || i4 > i3)) {
                    hwgVar = hwgVarI;
                } else {
                    while (true) {
                        if (!fdbq.f(obj, hwgVarI.u(i3)) || !fdbq.f(obj2, hwgVarI.v(i3))) {
                            if (i3 == i4) {
                                break;
                            }
                            i3 += i5;
                        } else {
                            hwg hwgVarP = hwgVarI.p(i3, hvrVar);
                            hwgVar = hwgVarI;
                            hwgVarI = hwgVarP;
                            break;
                        }
                    }
                    hwgVar = hwgVarI;
                }
            } else {
                hwgVar = hwgVarI;
                hwgVarI = hwgVar.h(i, obj, obj2, i2 + 5, hvrVar);
            }
            hwg hwgVar2 = hwgVarI;
            return r(hwgVar, hwgVar2, iC, iA, hvrVar.a);
        }
        return this;
    }

    public final hwg i(int i) {
        Object obj = this.b[i];
        obj.getClass();
        return (hwg) obj;
    }

    public final hwg j(int i, Object obj, int i2) {
        hwg hwgVarJ;
        int iA = 1 << hwk.a(i, i2);
        if (m(iA)) {
            int iB = b(iA);
            if (fdbq.f(obj, u(iB))) {
                Object[] objArr = this.b;
                if (objArr.length == 2) {
                    return null;
                }
                return new hwg(this.c ^ iA, this.d, hwk.c(objArr, iB));
            }
        } else if (y(iA)) {
            int iC = c(iA);
            hwg hwgVarI = i(iC);
            if (i2 == 30) {
                fddo fddoVarQ = fddu.q(fddu.r(0, hwgVarI.b.length), 2);
                int i3 = fddoVarQ.a;
                int i4 = fddoVarQ.b;
                int i5 = fddoVarQ.c;
                if ((i5 <= 0 || i3 > i4) && (i5 >= 0 || i4 > i3)) {
                    hwgVarJ = hwgVarI;
                    break;
                }
                while (!fdbq.f(obj, hwgVarI.u(i3))) {
                    if (i3 == i4) {
                        hwgVarJ = hwgVarI;
                        break;
                    }
                    i3 += i5;
                }
                Object[] objArr2 = hwgVarI.b;
                hwgVarJ = objArr2.length == 2 ? null : new hwg(0, 0, hwk.c(objArr2, i3));
            } else {
                hwgVarJ = hwgVarI.j(i, obj, i2 + 5);
            }
            if (hwgVarJ == null) {
                Object[] objArr3 = this.b;
                if (objArr3.length == 1) {
                    return null;
                }
                return new hwg(this.c, iA ^ this.d, hwk.d(objArr3, iC));
            }
            if (hwgVarI != hwgVarJ) {
                return t(iC, iA, hwgVarJ);
            }
        }
        return this;
    }

    public final Object k(int i, Object obj, int i2) {
        int iA = 1 << hwk.a(i, i2);
        if (m(iA)) {
            int iB = b(iA);
            if (fdbq.f(obj, u(iB))) {
                return v(iB);
            }
            return null;
        }
        if (!y(iA)) {
            return null;
        }
        hwg hwgVarI = i(c(iA));
        if (i2 != 30) {
            return hwgVarI.k(i, obj, i2 + 5);
        }
        fddo fddoVarQ = fddu.q(fddu.r(0, hwgVarI.b.length), 2);
        int i3 = fddoVarQ.a;
        int i4 = fddoVarQ.b;
        int i5 = fddoVarQ.c;
        if ((i5 > 0 && i3 <= i4) || (i5 < 0 && i4 <= i3)) {
            while (!fdbq.f(obj, hwgVarI.u(i3))) {
                if (i3 != i4) {
                    i3 += i5;
                }
            }
            return hwgVarI.v(i3);
        }
        return null;
    }

    public final boolean l(int i, Object obj, int i2) {
        int iA = 1 << hwk.a(i, i2);
        if (m(iA)) {
            return fdbq.f(obj, u(b(iA)));
        }
        if (!y(iA)) {
            return false;
        }
        hwg hwgVarI = i(c(iA));
        return i2 == 30 ? hwgVarI.w(obj) : hwgVarI.l(i, obj, i2 + 5);
    }

    public final boolean m(int i) {
        return (i & this.c) != 0;
    }

    public hwg(int i, int i2, Object[] objArr) {
        this(i, i2, objArr, null);
    }
}
