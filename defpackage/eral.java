package defpackage;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eral extends erbs {
    public final eram a;
    public final erwo b;
    public final erwp c;

    public eral(eram eramVar, erwo erwoVar, erwp erwpVar) {
        this.a = eramVar;
        this.b = erwoVar;
        this.c = erwpVar;
    }

    public static eral e(eram eramVar, erwo erwoVar) throws GeneralSecurityException {
        ECPoint eCPoint = eramVar.b;
        if (eCPoint == null) {
            throw new GeneralSecurityException("ECIES private key for NIST curve cannot be constructed with X25519-curve public key");
        }
        BigInteger bigInteger = erwoVar.a;
        erag eragVar = eramVar.a.b;
        BigInteger order = h(eragVar).getOrder();
        if (bigInteger.signum() <= 0 || bigInteger.compareTo(order) >= 0) {
            throw new GeneralSecurityException("Invalid private value");
        }
        if (erdw.e(bigInteger, h(eragVar)).equals(eCPoint)) {
            return new eral(eramVar, erwoVar, null);
        }
        throw new GeneralSecurityException("Invalid private value");
    }

    private static ECParameterSpec h(erag eragVar) {
        if (eragVar == erag.a) {
            return erdw.a;
        }
        if (eragVar == erag.b) {
            return erdw.b;
        }
        if (eragVar == erag.c) {
            return erdw.c;
        }
        throw new IllegalArgumentException("Unable to determine NIST curve type for ".concat(String.valueOf(String.valueOf(eragVar))));
    }

    @Override // defpackage.erbs, defpackage.eqsu
    public final /* synthetic */ eqsg c() {
        return this.a;
    }

    @Override // defpackage.erbs, defpackage.eqsg
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final erak a() {
        return this.a.a;
    }

    @Override // defpackage.erbs
    public final /* synthetic */ erbt f() {
        return this.a;
    }
}
