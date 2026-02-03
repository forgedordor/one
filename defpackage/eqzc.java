package defpackage;

import java.security.GeneralSecurityException;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eqzc {
    public static final eqzd a(eqzk eqzkVar, erwp erwpVar, Integer num) throws GeneralSecurityException {
        erwn erwnVarB;
        if (eqzkVar == null) {
            throw new IllegalArgumentException("Cannot build without parameters and/or key material");
        }
        if (eqzkVar.a != erwpVar.a()) {
            throw new GeneralSecurityException("Key size mismatch");
        }
        if (eqzkVar.a() && num == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (!eqzkVar.a() && num != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        eqzj eqzjVar = eqzkVar.b;
        if (eqzjVar == eqzj.c) {
            erwnVarB = erfc.a;
        } else if (eqzjVar == eqzj.b) {
            erwnVarB = erfc.a(num.intValue());
        } else {
            if (eqzjVar != eqzj.a) {
                throw new IllegalStateException("Unknown AesSivParameters.Variant: ".concat(String.valueOf(String.valueOf(eqzjVar))));
            }
            erwnVarB = erfc.b(num.intValue());
        }
        return new eqzd(eqzkVar, erwpVar, erwnVarB, num);
    }
}
