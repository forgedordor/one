package defpackage;

import java.security.GeneralSecurityException;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class erob {
    public static final erog a(eroe eroeVar, eroc erocVar, erod erodVar, erof erofVar) throws GeneralSecurityException {
        if (erocVar == null) {
            throw new GeneralSecurityException("EC curve type is not set");
        }
        if (erocVar == eroc.a && erodVar != erod.a) {
            throw new GeneralSecurityException("NIST_P256 requires SHA256");
        }
        if (erocVar == eroc.b && erodVar != erod.b && erodVar != erod.c) {
            throw new GeneralSecurityException("NIST_P384 requires SHA384 or SHA512");
        }
        if (erocVar != eroc.c || erodVar == erod.c) {
            return new erog(eroeVar, erocVar, erodVar, erofVar);
        }
        throw new GeneralSecurityException("NIST_P521 requires SHA512");
    }
}
