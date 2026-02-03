package defpackage;

import java.math.BigInteger;
import java.security.SecureRandom;

/* compiled from: PG */
/* loaded from: classes6.dex */
public abstract class fflf extends ffli {
    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0033  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected fflf(java.math.BigInteger r5) {
        /*
            r4 = this;
            fflv r0 = defpackage.fflw.a
            int r0 = r5.bitLength()
            int r1 = r5.signum()
            if (r1 <= 0) goto L3d
            r1 = 2
            if (r0 < r1) goto L3d
            r2 = 3
            if (r0 >= r2) goto L33
            java.math.BigInteger r0 = defpackage.ffwm.a
            int r0 = r5.bitLength()
            r3 = 31
            if (r0 > r3) goto L2b
            int r0 = r5.intValue()
            if (r0 == r1) goto L28
            if (r0 == r2) goto L25
            goto L33
        L25:
            fflv r5 = defpackage.fflw.b
            goto L39
        L28:
            fflv r5 = defpackage.fflw.a
            goto L39
        L2b:
            java.lang.ArithmeticException r5 = new java.lang.ArithmeticException
            java.lang.String r0 = "BigInteger out of int range"
            r5.<init>(r0)
            throw r5
        L33:
            fflz r0 = new fflz
            r0.<init>(r5)
            r5 = r0
        L39:
            r4.<init>(r5)
            return
        L3d:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "'characteristic' must be >= 2"
            r5.<init>(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fflf.<init>(java.math.BigInteger):void");
    }

    private static BigInteger i(SecureRandom secureRandom, BigInteger bigInteger) {
        while (true) {
            BigInteger bigIntegerA = ffwm.a(bigInteger.bitLength(), secureRandom);
            if (bigIntegerA.signum() > 0 && bigIntegerA.compareTo(bigInteger) < 0) {
                return bigIntegerA;
            }
        }
    }

    @Override // defpackage.ffli
    public final ffln a(SecureRandom secureRandom) {
        BigInteger bigIntegerB = this.d.b();
        return d(i(secureRandom, bigIntegerB)).i(d(i(secureRandom, bigIntegerB)));
    }
}
