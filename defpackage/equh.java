package defpackage;

import java.security.GeneralSecurityException;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class equh {
    public static final erfp a = new erfn(equd.class, eqrz.class, new erfo() { // from class: eque
        @Override // defpackage.erfo
        public final Object a(eqsg eqsgVar) {
            equd equdVar = (equd) eqsgVar;
            equk equkVar = equdVar.a;
            return new erum(equdVar.b.d(), equdVar.c);
        }
    });
    public static final eqsh b;
    public static final eret c;
    public static final erer d;
    public static final int e;

    static {
        erjq.a.getParserForType();
        b = new erel("type.googleapis.com/google.crypto.tink.AesGcmKey", eqrz.class, 3);
        c = new eret() { // from class: equf
        };
        d = new erer() { // from class: equg
            @Override // defpackage.erer
            public final eqsg a(eqst eqstVar, Integer num) throws GeneralSecurityException {
                equk equkVar = (equk) eqstVar;
                int i = equkVar.a;
                erfp erfpVar = equh.a;
                if (i != 24) {
                    return equc.a(equkVar, erwp.b(i), num);
                }
                throw new GeneralSecurityException("192 bit AES GCM Parameters are not valid");
            }
        };
        e = 2;
    }
}
