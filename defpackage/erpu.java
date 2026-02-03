package defpackage;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class erpu {
    private static final BigInteger d;
    private static final BigInteger e;
    private Integer f = null;
    public BigInteger a = erpx.a;
    public erpv b = null;
    public erpw c = erpw.d;

    static {
        BigInteger bigIntegerValueOf = BigInteger.valueOf(2L);
        d = bigIntegerValueOf;
        e = bigIntegerValueOf.pow(256);
    }

    public final erpx a() throws GeneralSecurityException {
        Integer num = this.f;
        if (num == null) {
            throw new GeneralSecurityException("key size is not set");
        }
        if (this.a == null) {
            throw new GeneralSecurityException("publicExponent is not set");
        }
        if (this.b == null) {
            throw new GeneralSecurityException("hash type is not set");
        }
        if (this.c == null) {
            throw new GeneralSecurityException("variant is not set");
        }
        if (num.intValue() < 2048) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size in bytes %d; must be at least 2048 bits", this.f));
        }
        BigInteger bigInteger = this.a;
        int iCompareTo = bigInteger.compareTo(erpx.a);
        if (iCompareTo != 0) {
            if (iCompareTo < 0) {
                throw new InvalidAlgorithmParameterException("Public exponent must be at least 65537.");
            }
            if (bigInteger.mod(d).equals(BigInteger.ZERO)) {
                throw new InvalidAlgorithmParameterException("Invalid public exponent");
            }
            if (bigInteger.compareTo(e) > 0) {
                throw new InvalidAlgorithmParameterException("Public exponent cannot be larger than 2^256.");
            }
        }
        return new erpx(this.f.intValue(), this.a, this.c, this.b);
    }

    public final void b(int i) {
        this.f = Integer.valueOf(i);
    }
}
