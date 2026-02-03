package defpackage;

import java.security.GeneralSecurityException;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class equl {
    public static final equm a(equt equtVar, erwp erwpVar, Integer num) throws GeneralSecurityException {
        erwn erwnVarB;
        if (equtVar == null) {
            throw new GeneralSecurityException("Cannot build without parameters and/or key material");
        }
        if (equtVar.a != erwpVar.a()) {
            throw new GeneralSecurityException("Key size mismatch");
        }
        if (equtVar.a() && num == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (!equtVar.a() && num != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        equs equsVar = equtVar.b;
        if (equsVar == equs.c) {
            erwnVarB = erfc.a;
        } else if (equsVar == equs.b) {
            erwnVarB = erfc.a(num.intValue());
        } else {
            if (equsVar != equs.a) {
                throw new IllegalStateException("Unknown AesGcmSivParameters.Variant: ".concat(String.valueOf(String.valueOf(equsVar))));
            }
            erwnVarB = erfc.b(num.intValue());
        }
        return new equm(equtVar, erwpVar, erwnVarB, num);
    }
}
