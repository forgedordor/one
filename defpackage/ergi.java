package defpackage;

import java.security.GeneralSecurityException;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ergi {
    public static final ergj a(ergq ergqVar, erwp erwpVar, Integer num) throws GeneralSecurityException {
        erwn erwnVarA;
        if (ergqVar == null) {
            throw new GeneralSecurityException("Cannot build without parameters and/or key material");
        }
        if (ergqVar.a != erwpVar.a()) {
            throw new GeneralSecurityException("Key size mismatch");
        }
        if (ergqVar.a() && num == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (!ergqVar.a() && num != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        ergp ergpVar = ergqVar.c;
        if (ergpVar == ergp.d) {
            erwnVarA = erfc.a;
        } else if (ergpVar == ergp.c || ergpVar == ergp.b) {
            erwnVarA = erfc.a(num.intValue());
        } else {
            if (ergpVar != ergp.a) {
                throw new IllegalStateException("Unknown AesCmacParametersParameters.Variant: ".concat(String.valueOf(String.valueOf(ergpVar))));
            }
            erwnVarA = erfc.b(num.intValue());
        }
        return new ergj(ergqVar, erwpVar, erwnVarA, num);
    }
}
