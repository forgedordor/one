package defpackage;

import java.security.GeneralSecurityException;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eqtk {
    public static final eqtl a(eqtt eqttVar, erwp erwpVar, erwp erwpVar2, Integer num) throws GeneralSecurityException {
        erwn erwnVarB;
        if (eqttVar == null) {
            throw new GeneralSecurityException("Cannot build without parameters");
        }
        if (eqttVar.a != erwpVar.a()) {
            throw new GeneralSecurityException("AES key size mismatch");
        }
        if (eqttVar.b != erwpVar2.a()) {
            throw new GeneralSecurityException("HMAC key size mismatch");
        }
        if (eqttVar.a() && num == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (!eqttVar.a() && num != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        eqts eqtsVar = eqttVar.e;
        if (eqtsVar == eqts.c) {
            erwnVarB = erfc.a;
        } else if (eqtsVar == eqts.b) {
            erwnVarB = erfc.a(num.intValue());
        } else {
            if (eqtsVar != eqts.a) {
                throw new IllegalStateException("Unknown AesCtrHmacAeadParameters.Variant: ".concat(String.valueOf(String.valueOf(eqtsVar))));
            }
            erwnVarB = erfc.b(num.intValue());
        }
        return new eqtl(eqttVar, erwpVar, erwpVar2, erwnVarB, num);
    }
}
