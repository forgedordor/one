package defpackage;

import j$.util.Objects;
import java.math.BigInteger;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class erpx extends erqt {
    public static final BigInteger a = BigInteger.valueOf(65537);
    public final int b;
    public final BigInteger c;
    public final erpw d;
    public final erpv e;

    public erpx(int i, BigInteger bigInteger, erpw erpwVar, erpv erpvVar) {
        this.b = i;
        this.c = bigInteger;
        this.d = erpwVar;
        this.e = erpvVar;
    }

    @Override // defpackage.eqst
    public final boolean a() {
        return this.d != erpw.d;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof erpx)) {
            return false;
        }
        erpx erpxVar = (erpx) obj;
        return erpxVar.b == this.b && Objects.equals(erpxVar.c, this.c) && erpxVar.d == this.d && erpxVar.e == this.e;
    }

    public final int hashCode() {
        return Objects.hash(erpx.class, Integer.valueOf(this.b), this.c, this.d, this.e);
    }

    public final String toString() {
        BigInteger bigInteger = this.c;
        erpv erpvVar = this.e;
        return "RSA SSA PKCS1 Parameters (variant: " + String.valueOf(this.d) + ", hashType: " + String.valueOf(erpvVar) + ", publicExponent: " + String.valueOf(bigInteger) + ", and " + this.b + "-bit modulus)";
    }
}
