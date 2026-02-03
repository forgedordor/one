package defpackage;

import java.security.GeneralSecurityException;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eqtp {
    public static final erfp a = new erfn(eqtl.class, eqrz.class, new erfo() { // from class: eqtm
        @Override // defpackage.erfo
        public final Object a(eqsg eqsgVar) {
            return ervb.c((eqtl) eqsgVar);
        }
    });
    public static final eqsh b;
    public static final eret c;
    public static final erer d;
    public static final int e;

    static {
        erio.a.getParserForType();
        b = new erel("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey", eqrz.class, 3);
        c = new eret() { // from class: eqtn
        };
        d = new erer() { // from class: eqto
            @Override // defpackage.erer
            public final eqsg a(eqst eqstVar, Integer num) throws GeneralSecurityException {
                eqtt eqttVar = (eqtt) eqstVar;
                int i = eqttVar.a;
                erfp erfpVar = eqtp.a;
                if (i == 16 || i == 32) {
                    return eqtk.a(eqttVar, erwp.b(i), erwp.b(eqttVar.b), num);
                }
                throw new GeneralSecurityException("AES key size must be 16 or 32 bytes");
            }
        };
        e = 2;
    }
}
