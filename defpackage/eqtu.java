package defpackage;

import java.security.GeneralSecurityException;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eqtu {
    public static final eqtv a(equb equbVar, erwp erwpVar, Integer num) throws GeneralSecurityException {
        erwn erwnVarB;
        if (equbVar == null) {
            throw new GeneralSecurityException("Cannot build without parameters and/or key material");
        }
        if (equbVar.a != erwpVar.a()) {
            throw new GeneralSecurityException("Key size mismatch");
        }
        if (equbVar.a() && num == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (!equbVar.a() && num != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        equa equaVar = equbVar.d;
        if (equaVar == equa.c) {
            erwnVarB = erfc.a;
        } else if (equaVar == equa.b) {
            erwnVarB = erfc.a(num.intValue());
        } else {
            if (equaVar != equa.a) {
                throw new IllegalStateException("Unknown AesEaxParameters.Variant: ".concat(String.valueOf(String.valueOf(equaVar))));
            }
            erwnVarB = erfc.b(num.intValue());
        }
        return new eqtv(equbVar, erwpVar, erwnVarB, num);
    }
}
