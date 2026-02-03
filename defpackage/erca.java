package defpackage;

import java.security.GeneralSecurityException;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class erca {
    public static final byte[] a = new byte[0];

    public static erbz a(erak erakVar) throws GeneralSecurityException {
        eqst eqstVar = erakVar.f;
        if (eqstVar instanceof equk) {
            return new erbx((equk) eqstVar);
        }
        if (eqstVar instanceof eqtt) {
            return new erbw((eqtt) eqstVar);
        }
        if (eqstVar instanceof eqzk) {
            return new erby((eqzk) eqstVar);
        }
        throw new GeneralSecurityException("Unsupported DEM parameters: ".concat(String.valueOf(String.valueOf(eqstVar))));
    }
}
