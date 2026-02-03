package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ntv {
    private static final int[] a = {1769172845, 1769172786, 1769172787, 1769172788, 1769172789, 1769172790, 1769172793, 1635148593, 1752589105, 1751479857, 1635135537, 1836069937, 1836069938, 862401121, 862401122, 862417462, 862417718, 862414134, 862414646, 1295275552, 1295270176, 1714714144, 1801741417, 1295275600, 1903435808, 1297305174, 1684175153, 1769172332, 1885955686};

    public static nou a(nns nnsVar, boolean z, boolean z2) {
        nou nouVar;
        long j;
        mfr mfrVar;
        int i;
        int i2;
        int[] iArr;
        long jD = nnsVar.d();
        long j2 = -1;
        long j3 = 4096;
        if (jD != -1 && jD <= 4096) {
            j3 = jD;
        }
        mfr mfrVar2 = new mfr(64);
        int i3 = (int) j3;
        int i4 = 0;
        int i5 = 0;
        boolean z3 = false;
        while (i5 < i3) {
            mfrVar2.G(8);
            boolean z4 = true;
            if (!nnsVar.n(mfrVar2.a, i4, 8, true)) {
                break;
            }
            long jR = mfrVar2.r();
            int iE = mfrVar2.e();
            if (jR == 1) {
                j = j2;
                nnsVar.i(mfrVar2.a, 8, 8);
                i = 16;
                mfrVar2.J(16);
                jR = mfrVar2.q();
                mfrVar = mfrVar2;
            } else {
                j = j2;
                if (jR == 0) {
                    long jD2 = nnsVar.d();
                    if (jD2 != j) {
                        jR = (jD2 - nnsVar.e()) + 8;
                    }
                }
                mfrVar = mfrVar2;
                i = 8;
            }
            long j4 = jR;
            nouVar = null;
            long j5 = i;
            if (j4 >= j5) {
                i5 += i;
                if (iE == 1836019574) {
                    i3 += (int) j4;
                    if (jD != -1 && i3 > jD) {
                        i3 = (int) jD;
                    }
                    mfrVar2 = mfrVar;
                    j2 = j;
                    i4 = 0;
                } else {
                    if (iE == 1836019558 || iE == 1836475768) {
                        i4 = 1;
                        break;
                    }
                    z3 |= !(iE != 1835295092);
                    long j6 = jD;
                    if ((i5 + j4) - j5 >= i3) {
                        i4 = 0;
                        break;
                    }
                    int i6 = (int) (j4 - j5);
                    i5 += i6;
                    if (iE != 1718909296) {
                        i2 = 0;
                        if (i6 != 0) {
                            nnsVar.g(i6);
                        }
                    } else if (i6 >= 8) {
                        mfrVar.G(i6);
                        i2 = 0;
                        nnsVar.i(mfrVar.a, 0, i6);
                        boolean zB = b(mfrVar.e(), z2) | z3;
                        mfrVar.L(4);
                        int iA = mfrVar.a() / 4;
                        if (!zB && iA > 0) {
                            iArr = new int[iA];
                            int i7 = 0;
                            while (true) {
                                if (i7 >= iA) {
                                    z4 = zB;
                                    break;
                                }
                                int iE2 = mfrVar.e();
                                iArr[i7] = iE2;
                                if (b(iE2, z2)) {
                                    break;
                                }
                                i7++;
                            }
                        } else {
                            z4 = zB;
                            iArr = null;
                        }
                        if (!z4) {
                            return new nua(iArr);
                        }
                        z3 = z4;
                    }
                    i4 = i2;
                    mfrVar2 = mfrVar;
                    j2 = j;
                    jD = j6;
                }
            }
            return new nss();
        }
        nouVar = null;
        return !z3 ? ntq.a : z != i4 ? i4 != 0 ? ntk.a : ntk.b : nouVar;
    }

    private static boolean b(int i, boolean z) {
        if ((i >>> 8) == 3368816) {
            return true;
        }
        if (i == 1751476579) {
            if (z) {
                return true;
            }
            i = 1751476579;
        }
        int[] iArr = a;
        for (int i2 = 0; i2 < 29; i2++) {
            if (iArr[i2] == i) {
                return true;
            }
        }
        return false;
    }
}
