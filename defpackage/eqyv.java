package defpackage;

import java.security.GeneralSecurityException;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eqyv {
    public static final erfi a;
    public static final erff b;
    public static final erei c;
    public static final eref d;
    private static final erwn e;

    static {
        erwn erwnVarB = ergh.b("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key");
        e = erwnVarB;
        a = new erfg(eqwu.class, erfw.class, new erfh() { // from class: eqyr
            @Override // defpackage.erfh
            public final erga a(eqst eqstVar) throws GeneralSecurityException {
                erfi erfiVar = eqyv.a;
                ermg ermgVar = (ermg) ermh.a.createBuilder();
                ermgVar.copyOnWrite();
                ((ermh) ermgVar.instance).b = "type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key";
                evqs byteString = eroa.a.toByteString();
                ermgVar.copyOnWrite();
                ((ermh) ermgVar.instance).c = byteString;
                ermy ermyVarB = eqyv.b(((eqwu) eqstVar).a);
                ermgVar.copyOnWrite();
                ((ermh) ermgVar.instance).d = ermyVarB.a();
                return erfw.b((ermh) ermgVar.build());
            }
        });
        b = new erfd(erwnVarB, erfw.class, new erfe() { // from class: eqys
            @Override // defpackage.erfe
            public final eqst a(erga ergaVar) throws GeneralSecurityException {
                erfi erfiVar = eqyv.a;
                erfw erfwVar = (erfw) ergaVar;
                ermh ermhVar = erfwVar.b;
                if (!ermhVar.b.equals("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key")) {
                    throw new IllegalArgumentException("Wrong type URL in call to XChaCha20Poly1305ProtoSerialization.parseParameters: ".concat(String.valueOf(erfwVar.b.b)));
                }
                try {
                    evqs evqsVar = ermhVar.c;
                    evrr evrrVar = evrr.a;
                    evuq evuqVar = evuq.a;
                    if (((eroa) evsn.parseFrom(eroa.a, evqsVar, evrr.a)).b != 0) {
                        throw new GeneralSecurityException("Only version 0 parameters are accepted");
                    }
                    ermy ermyVarB = ermy.b(erfwVar.b.d);
                    if (ermyVarB == null) {
                        ermyVarB = ermy.UNRECOGNIZED;
                    }
                    return new eqwu(eqyv.a(ermyVarB));
                } catch (evtj e2) {
                    throw new GeneralSecurityException("Parsing XChaCha20Poly1305Parameters failed: ", e2);
                }
            }
        });
        c = new ereg(eqwo.class, erfv.class, new ereh() { // from class: eqyt
            @Override // defpackage.ereh
            public final erga a(eqsg eqsgVar) {
                eqwo eqwoVar = (eqwo) eqsgVar;
                erfi erfiVar = eqyv.a;
                ernx ernxVar = (ernx) erny.a.createBuilder();
                evqs evqsVarX = evqs.x(eqwoVar.b.d());
                ernxVar.copyOnWrite();
                ((erny) ernxVar.instance).c = evqsVarX;
                evqs byteString = ((erny) ernxVar.build()).toByteString();
                eqwt eqwtVar = eqwoVar.a.a;
                return erfv.a("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key", byteString, 3, eqyv.b(eqwtVar), eqwoVar.d);
            }
        });
        d = new ered(erwnVarB, erfv.class, new eree() { // from class: eqyu
            @Override // defpackage.eree
            public final eqsg a(erga ergaVar) throws GeneralSecurityException {
                erfi erfiVar = eqyv.a;
                if (!((erfv) ergaVar).a.equals("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key")) {
                    throw new IllegalArgumentException("Wrong type URL in call to XChaCha20Poly1305ProtoSerialization.parseKey");
                }
                try {
                    evqs evqsVar = ((erfv) ergaVar).c;
                    evrr evrrVar = evrr.a;
                    evuq evuqVar = evuq.a;
                    erny ernyVar = (erny) evsn.parseFrom(erny.a, evqsVar, evrr.a);
                    if (ernyVar.b == 0) {
                        return eqwo.d(eqyv.a(((erfv) ergaVar).d), erwp.c(ernyVar.c.I()), ((erfv) ergaVar).e);
                    }
                    throw new GeneralSecurityException("Only version 0 keys are accepted");
                } catch (evtj unused) {
                    throw new GeneralSecurityException("Parsing XChaCha20Poly1305Key failed");
                }
            }
        });
    }

    public static eqwt a(ermy ermyVar) throws GeneralSecurityException {
        int iOrdinal = ermyVar.ordinal();
        if (iOrdinal == 1) {
            return eqwt.a;
        }
        if (iOrdinal != 2) {
            if (iOrdinal == 3) {
                return eqwt.c;
            }
            if (iOrdinal != 4) {
                throw new GeneralSecurityException(a.U(ermyVar, "Unable to parse OutputPrefixType: "));
            }
        }
        return eqwt.b;
    }

    public static ermy b(eqwt eqwtVar) throws GeneralSecurityException {
        if (eqwt.a.equals(eqwtVar)) {
            return ermy.TINK;
        }
        if (eqwt.b.equals(eqwtVar)) {
            return ermy.CRUNCHY;
        }
        if (eqwt.c.equals(eqwtVar)) {
            return ermy.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(eqwtVar.d));
    }
}
