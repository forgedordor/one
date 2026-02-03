package defpackage;

import java.security.GeneralSecurityException;
import java.security.KeyPair;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ercu {
    public static final erfp a = new erfn(erat.class, eqse.class, new erfo() { // from class: ercr
        @Override // defpackage.erfo
        public final Object a(eqsg eqsgVar) {
            return ercl.b((erat) eqsgVar);
        }
    });
    public static final erfp b = new erfn(erbb.class, eqsf.class, new erfo() { // from class: ercs
        @Override // defpackage.erfo
        public final Object a(eqsg eqsgVar) {
            return ercm.b((erbb) eqsgVar);
        }
    });
    public static final eqsh c;
    public static final erer d;
    public static final erek e;

    static {
        erlz.a.getParserForType();
        e = new erek("type.googleapis.com/google.crypto.tink.HpkePrivateKey", eqse.class);
        ermb.a.getParserForType();
        c = new erel("type.googleapis.com/google.crypto.tink.HpkePublicKey", eqsf.class, 5);
        d = new erer() { // from class: erct
            @Override // defpackage.erer
            public final eqsg a(eqst eqstVar, Integer num) throws GeneralSecurityException {
                erux eruxVar;
                erwp erwpVarC;
                erwn erwnVarB;
                eras erasVar = (eras) eqstVar;
                eraq eraqVar = erasVar.a;
                erfp erfpVar = ercu.a;
                if (eraqVar.equals(eraq.f)) {
                    byte[] bArrB = erwl.b();
                    erwpVarC = erwp.c(bArrB);
                    erwnVarB = erwn.b(erwl.c(bArrB));
                } else {
                    eraq eraqVar2 = eraq.a;
                    if (!eraqVar.equals(eraqVar2) && !eraqVar.equals(eraq.b) && !eraqVar.equals(eraq.c)) {
                        throw new GeneralSecurityException("Unknown KEM ID");
                    }
                    byte[] bArr = ercv.a;
                    if (eraqVar == eraqVar2) {
                        eruxVar = erux.NIST_P256;
                    } else if (eraqVar == eraq.b) {
                        eruxVar = erux.NIST_P384;
                    } else {
                        if (eraqVar != eraq.c) {
                            throw new GeneralSecurityException("Unrecognized NIST HPKE KEM identifier");
                        }
                        eruxVar = erux.NIST_P521;
                    }
                    KeyPair keyPairB = erva.b(eruxVar);
                    erwn erwnVarB2 = erwn.b(erva.j(eruxVar, eruz.UNCOMPRESSED, ((ECPublicKey) keyPairB.getPublic()).getW()));
                    erwpVarC = erwp.c(erdk.b(((ECPrivateKey) keyPairB.getPrivate()).getS(), ercv.a(eraqVar)));
                    erwnVarB = erwnVarB2;
                }
                return erat.e(erbb.c(erasVar, erwnVarB, num), erwpVarC);
            }
        };
    }
}
