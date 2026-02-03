package defpackage;

import java.math.BigInteger;
import java.security.GeneralSecurityException;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class erqm {
    public static final erqn a(erqj erqjVar, BigInteger bigInteger, Integer num) throws GeneralSecurityException {
        erwn erwnVarA;
        if (erqjVar == null) {
            throw new GeneralSecurityException("Cannot build without parameters");
        }
        if (bigInteger == null) {
            throw new GeneralSecurityException("Cannot build without modulus");
        }
        int i = erqjVar.b;
        int iBitLength = bigInteger.bitLength();
        if (iBitLength != i) {
            throw new GeneralSecurityException(a.s(i, iBitLength, "Got modulus size ", ", but parameters requires modulus size "));
        }
        if (erqjVar.a() && num == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (!erqjVar.a() && num != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        erqi erqiVar = erqjVar.d;
        if (erqiVar == erqi.d) {
            erwnVarA = erfc.a;
        } else if (erqiVar == erqi.c || erqiVar == erqi.b) {
            erwnVarA = erfc.a(num.intValue());
        } else {
            if (erqiVar != erqi.a) {
                throw new IllegalStateException("Unknown RsaSsaPssParameters.Variant: ".concat(String.valueOf(String.valueOf(erqiVar))));
            }
            erwnVarA = erfc.b(num.intValue());
        }
        return new erqn(erqjVar, bigInteger, erwnVarA, num);
    }
}
