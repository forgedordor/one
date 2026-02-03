package defpackage;

import java.security.GeneralSecurityException;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eqvg {
    public static final eqsh a;
    public static final erer b;
    public static final erfp c;

    static {
        ermv.a.getParserForType();
        a = new erel("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey", eqrz.class, 3);
        b = new erer() { // from class: eqve
            @Override // defpackage.erer
            public final eqsg a(eqst eqstVar, Integer num) {
                eqsh eqshVar = eqvg.a;
                return eqvp.d((eqvs) eqstVar, num);
            }
        };
        c = new erfn(eqvp.class, eqrz.class, new erfo() { // from class: eqvf
            @Override // defpackage.erfo
            public final Object a(eqsg eqsgVar) throws GeneralSecurityException {
                eqvp eqvpVar = (eqvp) eqsgVar;
                eqvs eqvsVar = eqvpVar.a;
                String str = eqvsVar.b;
                eqtf eqtfVar = eqvsVar.c;
                eqsh eqshVar = eqvg.a;
                eqrz eqrzVarA = eqsr.a(str).a(str);
                int i = eqvd.a;
                try {
                    byte[] bArrB = eqta.b(eqtfVar);
                    evrr evrrVar = evrr.a;
                    evuq evuqVar = evuq.a;
                    return eqyi.c(new eqvd((ermh) evsn.parseFrom(ermh.a, bArrB, evrr.a), eqrzVarA), eqvpVar.b);
                } catch (evtj e) {
                    throw new GeneralSecurityException(e);
                }
            }
        });
    }
}
