package defpackage;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.spec.ECParameterSpec;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eroh {
    public static final eroi a(erok erokVar, erwo erwoVar) throws GeneralSecurityException {
        BigInteger bigInteger = erwoVar.a;
        ECParameterSpec eCParameterSpec = erokVar.a.b.e;
        BigInteger order = eCParameterSpec.getOrder();
        if (bigInteger.signum() <= 0 || bigInteger.compareTo(order) >= 0) {
            throw new GeneralSecurityException("Invalid private value");
        }
        if (erdw.e(bigInteger, eCParameterSpec).equals(erokVar.b)) {
            return new eroi(erokVar, erwoVar);
        }
        throw new GeneralSecurityException("Invalid private value");
    }
}
