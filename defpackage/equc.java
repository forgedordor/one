package defpackage;

import java.security.GeneralSecurityException;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class equc {
    public static final equd a(equk equkVar, erwp erwpVar, Integer num) throws GeneralSecurityException {
        erwn erwnVarB;
        if (equkVar == null) {
            throw new GeneralSecurityException("Cannot build without parameters and/or key material");
        }
        if (equkVar.a != erwpVar.a()) {
            throw new GeneralSecurityException("Key size mismatch");
        }
        if (equkVar.a() && num == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (!equkVar.a() && num != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        equj equjVar = equkVar.d;
        if (equjVar == equj.c) {
            erwnVarB = erfc.a;
        } else if (equjVar == equj.b) {
            erwnVarB = erfc.a(num.intValue());
        } else {
            if (equjVar != equj.a) {
                throw new IllegalStateException("Unknown AesGcmParameters.Variant: ".concat(String.valueOf(String.valueOf(equjVar))));
            }
            erwnVarB = erfc.b(num.intValue());
        }
        return new equd(equkVar, erwpVar, erwnVarB, num);
    }
}
