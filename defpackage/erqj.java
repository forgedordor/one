package defpackage;

import j$.util.Objects;
import java.math.BigInteger;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class erqj extends erqt {
    public static final BigInteger a = BigInteger.valueOf(65537);
    public final int b;
    public final BigInteger c;
    public final erqi d;
    public final erqh e;
    public final erqh f;
    public final int g;

    public erqj(int i, BigInteger bigInteger, erqi erqiVar, erqh erqhVar, erqh erqhVar2, int i2) {
        this.b = i;
        this.c = bigInteger;
        this.d = erqiVar;
        this.e = erqhVar;
        this.f = erqhVar2;
        this.g = i2;
    }

    @Override // defpackage.eqst
    public final boolean a() {
        return this.d != erqi.d;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof erqj)) {
            return false;
        }
        erqj erqjVar = (erqj) obj;
        return erqjVar.b == this.b && Objects.equals(erqjVar.c, this.c) && Objects.equals(erqjVar.d, this.d) && Objects.equals(erqjVar.e, this.e) && Objects.equals(erqjVar.f, this.f) && erqjVar.g == this.g;
    }

    public final int hashCode() {
        return Objects.hash(erqj.class, Integer.valueOf(this.b), this.c, this.d, this.e, this.f, Integer.valueOf(this.g));
    }

    public final String toString() {
        BigInteger bigInteger = this.c;
        erqh erqhVar = this.f;
        erqh erqhVar2 = this.e;
        return "RSA SSA PSS Parameters (variant: " + String.valueOf(this.d) + ", signature hashType: " + String.valueOf(erqhVar2) + ", mgf1 hashType: " + String.valueOf(erqhVar) + ", saltLengthBytes: " + this.g + ", publicExponent: " + String.valueOf(bigInteger) + ", and " + this.b + "-bit modulus)";
    }
}
