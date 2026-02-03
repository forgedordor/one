package defpackage;

import android.util.Pair;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ntd {
    public static final /* synthetic */ int a = 0;
    private static final byte[] b = mgb.af("OpusHead");

    public static int a(int i) {
        return i & 16777215;
    }

    public static int b(int i) {
        return (i >> 24) & 255;
    }

    public static int c(mfr mfrVar) {
        mfrVar.K(16);
        return mfrVar.e();
    }

    public static mbt d(mfr mfrVar) {
        short sC = mfrVar.C();
        mfrVar.L(2);
        String strY = mfrVar.y(sC);
        int iMax = Math.max(strY.lastIndexOf(43), strY.lastIndexOf(45));
        try {
            return new mbt(new mgj(Float.parseFloat(strY.substring(0, iMax)), Float.parseFloat(strY.substring(iMax, strY.length() - 1))));
        } catch (IndexOutOfBoundsException | NumberFormatException unused) {
            return null;
        }
    }

    public static mgk e(mfr mfrVar) {
        long jQ;
        long jQ2;
        mfrVar.K(8);
        if (b(mfrVar.e()) == 0) {
            jQ = mfrVar.r();
            jQ2 = mfrVar.r();
        } else {
            jQ = mfrVar.q();
            jQ2 = mfrVar.q();
        }
        return new mgk(jQ, jQ2, mfrVar.r());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:114:0x02bd  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x02ff  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0348  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x034b  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0370  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x03a6  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x03b3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.ntz f(defpackage.ntw r43, defpackage.mgg r44, defpackage.nof r45) throws defpackage.mby {
        /*
            Method dump skipped, instructions count: 1605
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ntd.f(ntw, mgg, nof):ntz");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:543:0x0b10  */
    /* JADX WARN: Removed duplicated region for block: B:544:0x0b12  */
    /* JADX WARN: Removed duplicated region for block: B:600:0x0cdc  */
    /* JADX WARN: Removed duplicated region for block: B:601:0x0ce0  */
    /* JADX WARN: Removed duplicated region for block: B:611:0x0d3f  */
    /* JADX WARN: Removed duplicated region for block: B:612:0x0d69  */
    /* JADX WARN: Removed duplicated region for block: B:619:0x0d74 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:627:0x01cd A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01a7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.List g(defpackage.mgg r80, defpackage.nof r81, long r82, defpackage.mao r84, boolean r85, boolean r86, defpackage.ejvr r87) {
        /*
            Method dump skipped, instructions count: 3456
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ntd.g(mgg, nof, long, mao, boolean, boolean, ejvr):java.util.List");
    }

    public static void h(mfr mfrVar) {
        int i = mfrVar.b;
        mfrVar.L(4);
        if (mfrVar.e() != 1751411826) {
            i += 4;
        }
        mfrVar.K(i);
    }

    private static int i(mfr mfrVar) {
        int iJ = mfrVar.j();
        int i = iJ & 127;
        while ((iJ & 128) == 128) {
            iJ = mfrVar.j();
            i = (i << 7) | (iJ & 127);
        }
        return i;
    }

    private static Pair j(mfr mfrVar, int i, int i2) throws mby {
        Integer num;
        ntx ntxVar;
        Pair pairCreate;
        int i3;
        int i4;
        Integer num2;
        boolean z;
        int i5 = mfrVar.b;
        while (i5 - i < i2) {
            mfrVar.K(i5);
            int iE = mfrVar.e();
            nnv.b(iE > 0, "childAtomSize must be positive");
            if (mfrVar.e() == 1936289382) {
                int i6 = i5 + 8;
                int i7 = 0;
                int i8 = -1;
                Integer numValueOf = null;
                String strY = null;
                while (i6 - i5 < iE) {
                    mfrVar.K(i6);
                    int iE2 = mfrVar.e();
                    int iE3 = mfrVar.e();
                    if (iE3 == 1718775137) {
                        numValueOf = Integer.valueOf(mfrVar.e());
                    } else if (iE3 == 1935894637) {
                        mfrVar.L(4);
                        strY = mfrVar.y(4);
                    } else if (iE3 == 1935894633) {
                        i8 = i6;
                        i7 = iE2;
                    }
                    i6 += iE2;
                }
                byte[] bArr = null;
                if ("cenc".equals(strY) || "cbc1".equals(strY) || "cens".equals(strY) || "cbcs".equals(strY)) {
                    nnv.b(numValueOf != null, "frma atom is mandatory");
                    nnv.b(i8 != -1, "schi atom is mandatory");
                    int i9 = i8 + 8;
                    while (true) {
                        if (i9 - i8 >= i7) {
                            num = numValueOf;
                            ntxVar = null;
                            break;
                        }
                        mfrVar.K(i9);
                        int iE4 = mfrVar.e();
                        if (mfrVar.e() == 1952804451) {
                            int iB = b(mfrVar.e());
                            mfrVar.L(1);
                            if (iB == 0) {
                                mfrVar.L(1);
                                i4 = 0;
                                i3 = 0;
                            } else {
                                int iJ = mfrVar.j();
                                i3 = iJ & 15;
                                i4 = (iJ & 240) >> 4;
                            }
                            if (mfrVar.j() == 1) {
                                num2 = numValueOf;
                                z = true;
                            } else {
                                num2 = numValueOf;
                                z = false;
                            }
                            int iJ2 = mfrVar.j();
                            byte[] bArr2 = new byte[16];
                            mfrVar.F(bArr2, 0, 16);
                            if (z && iJ2 == 0) {
                                int iJ3 = mfrVar.j();
                                byte[] bArr3 = new byte[iJ3];
                                mfrVar.F(bArr3, 0, iJ3);
                                bArr = bArr3;
                            }
                            num = num2;
                            ntxVar = new ntx(z, strY, iJ2, bArr2, i4, i3, bArr);
                        } else {
                            i9 += iE4;
                        }
                    }
                    nnv.b(ntxVar != null, "tenc atom is mandatory");
                    String str = mgb.a;
                    pairCreate = Pair.create(num, ntxVar);
                } else {
                    pairCreate = null;
                }
                if (pairCreate != null) {
                    return pairCreate;
                }
            }
            i5 += iE;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0190  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static defpackage.mag k(defpackage.mfr r19) {
        /*
            Method dump skipped, instructions count: 411
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ntd.k(mfr):mag");
    }

    private static nst l(mfr mfrVar, int i) {
        mfrVar.K(i + 8);
        mfrVar.L(4);
        return new nst(mfrVar.r(), mfrVar.r());
    }

    private static nsv m(mfr mfrVar, int i) {
        mfrVar.K(i + 12);
        mfrVar.L(1);
        i(mfrVar);
        mfrVar.L(2);
        int iJ = mfrVar.j();
        if ((iJ & 128) != 0) {
            mfrVar.L(2);
        }
        if ((iJ & 64) != 0) {
            mfrVar.L(mfrVar.j());
        }
        if ((iJ & 32) != 0) {
            mfrVar.L(2);
        }
        mfrVar.L(1);
        i(mfrVar);
        String strE = mbw.e(mfrVar.j());
        if ("audio/mpeg".equals(strE) || "audio/vnd.dts".equals(strE) || "audio/vnd.dts.hd".equals(strE)) {
            return new nsv(strE, null, -1L, -1L);
        }
        mfrVar.L(4);
        long jR = mfrVar.r();
        long jR2 = mfrVar.r();
        mfrVar.L(1);
        int i2 = i(mfrVar);
        long j = jR2;
        byte[] bArr = new byte[i2];
        mfrVar.F(bArr, 0, i2);
        if (j <= 0) {
            j = -1;
        }
        return new nsv(strE, bArr, j, jR > 0 ? jR : -1L);
    }

    private static ByteBuffer n() {
        return ByteBuffer.allocate(25).order(ByteOrder.LITTLE_ENDIAN);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0459  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x0592 A[PHI: r10
      0x0592: PHI (r10v46 int) = (r10v33 int), (r10v29 int) binds: [B:361:0x06c0, B:258:0x058f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:303:0x0610  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:367:0x06d6  */
    /* JADX WARN: Removed duplicated region for block: B:380:0x0718  */
    /* JADX WARN: Removed duplicated region for block: B:383:0x0722  */
    /* JADX WARN: Removed duplicated region for block: B:398:0x0769  */
    /* JADX WARN: Removed duplicated region for block: B:428:0x07cf  */
    /* JADX WARN: Removed duplicated region for block: B:435:0x07e2  */
    /* JADX WARN: Removed duplicated region for block: B:481:0x09e8  */
    /* JADX WARN: Removed duplicated region for block: B:527:0x082e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0152  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void o(defpackage.mfr r40, int r41, int r42, int r43, int r44, java.lang.String r45, boolean r46, defpackage.mao r47, defpackage.nsz r48, int r49) throws defpackage.mby {
        /*
            Method dump skipped, instructions count: 2848
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ntd.o(mfr, int, int, int, int, java.lang.String, boolean, mao, nsz, int):void");
    }
}
