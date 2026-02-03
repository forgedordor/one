package defpackage;

import java.security.GeneralSecurityException;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eqty {
    public static final erfp a = new erfn(eqtv.class, eqrz.class, new erfo() { // from class: eqtw
        @Override // defpackage.erfo
        public final Object a(eqsg eqsgVar) throws GeneralSecurityException {
            eqtv eqtvVar = (eqtv) eqsgVar;
            int i = erui.a;
            if (!eqza.a(1)) {
                throw new GeneralSecurityException("Can not use AES-EAX in FIPS-mode.");
            }
            return new erui(eqtvVar.b.d(), eqtvVar.a.b, eqtvVar.c.c());
        }
    });
    public static final eqsh b;
    public static final erer c;

    static {
        erje.a.getParserForType();
        b = new erel("type.googleapis.com/google.crypto.tink.AesEaxKey", eqrz.class, 3);
        c = new erer() { // from class: eqtx
            @Override // defpackage.erer
            public final eqsg a(eqst eqstVar, Integer num) throws GeneralSecurityException {
                equb equbVar = (equb) eqstVar;
                int i = equbVar.a;
                erfp erfpVar = eqty.a;
                if (i != 24) {
                    return eqtu.a(equbVar, erwp.b(i), num);
                }
                throw new GeneralSecurityException("192 bit AES GCM Parameters are not valid");
            }
        };
    }
}
