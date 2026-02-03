package defpackage;

import java.security.GeneralSecurityException;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ergu {
    public static final ergv a(erhe erheVar, erwp erwpVar, Integer num) throws GeneralSecurityException {
        erwn erwnVarA;
        if (erheVar == null) {
            throw new GeneralSecurityException("Cannot build without parameters and/or key material");
        }
        if (erheVar.a != erwpVar.a()) {
            throw new GeneralSecurityException("Key size mismatch");
        }
        if (erheVar.a() && num == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (!erheVar.a() && num != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        erhd erhdVar = erheVar.c;
        if (erhdVar == erhd.d) {
            erwnVarA = erfc.a;
        } else if (erhdVar == erhd.c || erhdVar == erhd.b) {
            erwnVarA = erfc.a(num.intValue());
        } else {
            if (erhdVar != erhd.a) {
                throw new IllegalStateException("Unknown HmacParameters.Variant: ".concat(String.valueOf(String.valueOf(erhdVar))));
            }
            erwnVarA = erfc.b(num.intValue());
        }
        return new ergv(erheVar, erwpVar, erwnVarA, num);
    }
}
