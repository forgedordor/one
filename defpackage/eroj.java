package defpackage;

import java.security.GeneralSecurityException;
import java.security.spec.ECPoint;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eroj {
    public static final erok a(erog erogVar, ECPoint eCPoint, Integer num) throws GeneralSecurityException {
        erwn erwnVarA;
        if (erogVar == null) {
            throw new GeneralSecurityException("Cannot build without parameters");
        }
        if (eCPoint == null) {
            throw new GeneralSecurityException("Cannot build without public point");
        }
        erdw.f(eCPoint, erogVar.b.e.getCurve());
        if (erogVar.a() && num == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (!erogVar.a() && num != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        erof erofVar = erogVar.d;
        if (erofVar == erof.d) {
            erwnVarA = erfc.a;
        } else if (erofVar == erof.c || erofVar == erof.b) {
            erwnVarA = erfc.a(num.intValue());
        } else {
            if (erofVar != erof.a) {
                throw new IllegalStateException("Unknown EcdsaParameters.Variant: ".concat(erofVar.e));
            }
            erwnVarA = erfc.b(num.intValue());
        }
        return new erok(erogVar, eCPoint, erwnVarA, num);
    }
}
