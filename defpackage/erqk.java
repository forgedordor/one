package defpackage;

import java.math.BigInteger;
import java.security.GeneralSecurityException;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class erqk {
    public erqn a = null;
    public erwo b = null;
    private erwo d = null;
    private erwo e = null;
    private erwo f = null;
    private erwo g = null;
    public erwo c = null;

    public final erql a() throws GeneralSecurityException {
        erwo erwoVar;
        erwo erwoVar2;
        erqn erqnVar = this.a;
        if (erqnVar == null) {
            throw new GeneralSecurityException("Cannot build without a RSA SSA PKCS1 public key");
        }
        erwo erwoVar3 = this.d;
        if (erwoVar3 == null || (erwoVar = this.e) == null) {
            throw new GeneralSecurityException("Cannot build without prime factors");
        }
        erwo erwoVar4 = this.b;
        if (erwoVar4 == null) {
            throw new GeneralSecurityException("Cannot build without private exponent");
        }
        erwo erwoVar5 = this.f;
        if (erwoVar5 == null || (erwoVar2 = this.g) == null) {
            throw new GeneralSecurityException("Cannot build without prime exponents");
        }
        erwo erwoVar6 = this.c;
        if (erwoVar6 == null) {
            throw new GeneralSecurityException("Cannot build without CRT coefficient");
        }
        erqj erqjVar = erqnVar.a;
        BigInteger bigInteger = erqnVar.b;
        BigInteger bigInteger2 = erwoVar4.a;
        BigInteger bigInteger3 = erwoVar3.a;
        if (!bigInteger3.isProbablePrime(10)) {
            throw new GeneralSecurityException("p is not a prime");
        }
        BigInteger bigInteger4 = erwoVar.a;
        if (!bigInteger4.isProbablePrime(10)) {
            throw new GeneralSecurityException("q is not a prime");
        }
        if (!bigInteger3.multiply(bigInteger4).equals(bigInteger)) {
            throw new GeneralSecurityException("Prime p times prime q is not equal to the public key's modulus");
        }
        BigInteger bigInteger5 = erqjVar.c;
        BigInteger bigIntegerSubtract = bigInteger3.subtract(BigInteger.ONE);
        BigInteger bigIntegerSubtract2 = bigInteger4.subtract(BigInteger.ONE);
        if (!bigInteger5.multiply(bigInteger2).mod(bigIntegerSubtract.divide(bigIntegerSubtract.gcd(bigIntegerSubtract2)).multiply(bigIntegerSubtract2)).equals(BigInteger.ONE)) {
            throw new GeneralSecurityException("D is invalid.");
        }
        if (!bigInteger5.multiply(erwoVar5.a).mod(bigIntegerSubtract).equals(BigInteger.ONE)) {
            throw new GeneralSecurityException("dP is invalid.");
        }
        if (!bigInteger5.multiply(erwoVar2.a).mod(bigIntegerSubtract2).equals(BigInteger.ONE)) {
            throw new GeneralSecurityException("dQ is invalid.");
        }
        if (bigInteger4.multiply(erwoVar6.a).mod(bigInteger3).equals(BigInteger.ONE)) {
            return new erql(this.a, this.d, this.e, this.b, this.f, this.g, this.c);
        }
        throw new GeneralSecurityException("qInv is invalid.");
    }

    public final void b(erwo erwoVar, erwo erwoVar2) {
        this.f = erwoVar;
        this.g = erwoVar2;
    }

    public final void c(erwo erwoVar, erwo erwoVar2) {
        this.d = erwoVar;
        this.e = erwoVar2;
    }
}
