package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
final class nmg {
    public static nmf a(byte[] bArr, int i) {
        ArrayList arrayListC;
        int iE;
        mfr mfrVar = new mfr(bArr);
        try {
            mfrVar.L(4);
            iE = mfrVar.e();
            mfrVar.K(0);
        } catch (ArrayIndexOutOfBoundsException unused) {
        }
        if (iE == 1886547818) {
            mfrVar.L(8);
            int i2 = mfrVar.b;
            int i3 = mfrVar.c;
            while (i2 < i3) {
                int iE2 = mfrVar.e() + i2;
                if (iE2 > i2 && iE2 <= i3) {
                    int iE3 = mfrVar.e();
                    if (iE3 != 2037673328 && iE3 != 1836279920) {
                        mfrVar.K(iE2);
                        i2 = iE2;
                    }
                    mfrVar.J(iE2);
                    arrayListC = c(mfrVar);
                    break;
                }
                break;
            }
            arrayListC = null;
        } else {
            arrayListC = c(mfrVar);
        }
        if (arrayListC != null) {
            int size = arrayListC.size();
            if (size == 1) {
                nmd nmdVar = (nmd) arrayListC.get(0);
                return new nmf(nmdVar, nmdVar, i);
            }
            if (size == 2) {
                return new nmf((nmd) arrayListC.get(0), (nmd) arrayListC.get(1), i);
            }
        }
        return null;
    }

    private static int b(int i) {
        return (i >> 1) ^ (-(i & 1));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x018b A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r1v10, types: [nmd] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.util.ArrayList c(defpackage.mfr r28) {
        /*
            Method dump skipped, instructions count: 426
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nmg.c(mfr):java.util.ArrayList");
    }
}
