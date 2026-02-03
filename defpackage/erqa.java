package defpackage;

import java.math.BigInteger;
import java.security.GeneralSecurityException;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class erqa {
    public static final erqb a(erpx erpxVar, BigInteger bigInteger, Integer num) throws GeneralSecurityException {
        erwn erwnVarA;
        if (erpxVar == null) {
            throw new GeneralSecurityException("Cannot build without parameters");
        }
        if (bigInteger == null) {
            throw new GeneralSecurityException("Cannot build without modulus");
        }
        int i = erpxVar.b;
        int iBitLength = bigInteger.bitLength();
        if (iBitLength != i) {
            throw new GeneralSecurityException(a.s(i, iBitLength, "Got modulus size ", ", but parameters requires modulus size "));
        }
        if (erpxVar.a() && num == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (!erpxVar.a() && num != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        erpw erpwVar = erpxVar.d;
        if (erpwVar == erpw.d) {
            erwnVarA = erfc.a;
        } else if (erpwVar == erpw.c || erpwVar == erpw.b) {
            erwnVarA = erfc.a(num.intValue());
        } else {
            if (erpwVar != erpw.a) {
                throw new IllegalStateException("Unknown RsaSsaPkcs1Parameters.Variant: ".concat(String.valueOf(String.valueOf(erpwVar))));
            }
            erwnVarA = erfc.b(num.intValue());
        }
        return new erqb(erpxVar, bigInteger, erwnVarA, num);
    }
}
