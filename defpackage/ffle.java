package defpackage;

import java.math.BigInteger;
import java.security.SecureRandom;

/* compiled from: PG */
/* loaded from: classes6.dex */
public abstract class ffle extends ffli {
    /* JADX WARN: Illegal instructions before constructor call */
    protected ffle(int i, int i2, int i3, int i4) {
        if (i > ffws.a("org.bouncycastle.ec.max_f2m_field_size", 1142)) {
            throw new IllegalArgumentException(a.g(i, "field size out of range: "));
        }
        int[] iArr = (i3 | i4) == 0 ? new int[]{0, i2, i} : new int[]{0, i2, i3, i4, i};
        fflv fflvVar = fflw.a;
        if (iArr[0] != 0) {
            throw new IllegalArgumentException("Irreducible polynomials in GF(2) must have constant term");
        }
        for (int i5 = 1; i5 < iArr.length; i5++) {
            if (iArr[i5] <= iArr[i5 - 1]) {
                throw new IllegalArgumentException("Polynomial exponents must be monotonically increasing");
            }
        }
        super(new ffly(fflw.a, new fflx(iArr)));
        if (ffws.c("org.bouncycastle.ec.disable")) {
            throw new UnsupportedOperationException("F2M disabled by \"org.bouncycastle.ec.disable\"");
        }
        if (ffws.c("org.bouncycastle.ec.disable_f2m")) {
            throw new UnsupportedOperationException("F2M disabled by \"org.bouncycastle.ec.disable_f2m\"");
        }
    }

    private static BigInteger i(SecureRandom secureRandom, int i) {
        BigInteger bigIntegerA;
        do {
            bigIntegerA = ffwm.a(i, secureRandom);
        } while (bigIntegerA.signum() <= 0);
        return bigIntegerA;
    }

    @Override // defpackage.ffli
    public final ffln a(SecureRandom secureRandom) {
        int iC = c();
        return d(i(secureRandom, iC)).i(d(i(secureRandom, iC)));
    }

    @Override // defpackage.ffli
    public final ffls b(BigInteger bigInteger, BigInteger bigInteger2) {
        ffln fflnVarD = d(bigInteger);
        ffln fflnVarD2 = d(bigInteger2);
        int i = this.i;
        if (i == 5 || i == 6) {
            if (!fflnVarD.s()) {
                fflnVarD2 = fflnVarD2.g(fflnVarD).e(fflnVarD);
            } else if (!fflnVarD2.n().equals(this.f)) {
                throw new IllegalArgumentException();
            }
        }
        return e(fflnVarD, fflnVarD2);
    }
}
