package defpackage;

import java.security.GeneralSecurityException;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eqvx {
    public static final erfi a;
    public static final erff b;
    public static final erei c;
    public static final eref d;
    private static final erwn e;

    static {
        erwn erwnVarB = ergh.b("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey");
        e = erwnVarB;
        a = new erfg(eqvs.class, erfw.class, new erfh() { // from class: eqvt
            @Override // defpackage.erfh
            public final erga a(eqst eqstVar) throws GeneralSecurityException {
                eqvs eqvsVar = (eqvs) eqstVar;
                erfi erfiVar = eqvx.a;
                ermg ermgVar = (ermg) ermh.a.createBuilder();
                ermgVar.copyOnWrite();
                ((ermh) ermgVar.instance).b = "type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey";
                evqs byteString = eqvx.b(eqvsVar).toByteString();
                ermgVar.copyOnWrite();
                ((ermh) ermgVar.instance).c = byteString;
                ermy ermyVarC = eqvx.c(eqvsVar.a);
                ermgVar.copyOnWrite();
                ((ermh) ermgVar.instance).d = ermyVarC.a();
                return erfw.b((ermh) ermgVar.build());
            }
        });
        b = new erfd(erwnVarB, erfw.class, new erfe() { // from class: eqvu
            @Override // defpackage.erfe
            public final eqst a(erga ergaVar) throws GeneralSecurityException {
                erfi erfiVar = eqvx.a;
                erfw erfwVar = (erfw) ergaVar;
                ermh ermhVar = erfwVar.b;
                if (!ermhVar.b.equals("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to LegacyKmsEnvelopeAeadProtoSerialization.parseParameters: ".concat(String.valueOf(erfwVar.b.b)));
                }
                try {
                    evqs evqsVar = ermhVar.c;
                    evrr evrrVar = evrr.a;
                    evuq evuqVar = evuq.a;
                    ermx ermxVar = (ermx) evsn.parseFrom(ermx.a, evqsVar, evrr.a);
                    ermy ermyVarB = ermy.b(erfwVar.b.d);
                    if (ermyVarB == null) {
                        ermyVarB = ermy.UNRECOGNIZED;
                    }
                    return eqvx.a(ermxVar, ermyVarB);
                } catch (evtj e2) {
                    throw new GeneralSecurityException("Parsing KmsEnvelopeAeadKeyFormat failed: ", e2);
                }
            }
        });
        c = new ereg(eqvp.class, erfv.class, new ereh() { // from class: eqvv
            @Override // defpackage.ereh
            public final erga a(eqsg eqsgVar) throws GeneralSecurityException {
                eqvp eqvpVar = (eqvp) eqsgVar;
                erfi erfiVar = eqvx.a;
                ermu ermuVar = (ermu) ermv.a.createBuilder();
                eqvs eqvsVar = eqvpVar.a;
                ermx ermxVarB = eqvx.b(eqvsVar);
                ermuVar.copyOnWrite();
                ermv ermvVar = (ermv) ermuVar.instance;
                ermxVarB.getClass();
                ermvVar.d = ermxVarB;
                ermvVar.b |= 1;
                return erfv.a("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey", ((ermv) ermuVar.build()).toByteString(), 6, eqvx.c(eqvsVar.a), eqvpVar.c);
            }
        });
        d = new ered(erwnVarB, erfv.class, new eree() { // from class: eqvw
            @Override // defpackage.eree
            public final eqsg a(erga ergaVar) throws GeneralSecurityException {
                erfi erfiVar = eqvx.a;
                if (!((erfv) ergaVar).a.equals("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to LegacyKmsEnvelopeAeadProtoSerialization.parseKey");
                }
                try {
                    evqs evqsVar = ((erfv) ergaVar).c;
                    evrr evrrVar = evrr.a;
                    evuq evuqVar = evuq.a;
                    ermv ermvVar = (ermv) evsn.parseFrom(ermv.a, evqsVar, evrr.a);
                    if (ermvVar.c == 0) {
                        ermx ermxVar = ermvVar.d;
                        if (ermxVar == null) {
                            ermxVar = ermx.a;
                        }
                        return eqvp.d(eqvx.a(ermxVar, ((erfv) ergaVar).d), ((erfv) ergaVar).e);
                    }
                    throw new GeneralSecurityException("KmsEnvelopeAeadKeys are only accepted with version 0, got " + String.valueOf(ermvVar));
                } catch (evtj e2) {
                    throw new GeneralSecurityException("Parsing KmsEnvelopeAeadKey failed: ", e2);
                }
            }
        });
    }

    public static eqvs a(ermx ermxVar, ermy ermyVar) throws GeneralSecurityException {
        eqvq eqvqVar;
        eqvr eqvrVar;
        ermh ermhVar = ermh.a;
        ermg ermgVar = (ermg) ermhVar.createBuilder();
        ermh ermhVar2 = ermxVar.d;
        if (ermhVar2 == null) {
            ermhVar2 = ermhVar;
        }
        String str = ermhVar2.b;
        ermgVar.copyOnWrite();
        ermh ermhVar3 = (ermh) ermgVar.instance;
        str.getClass();
        ermhVar3.b = str;
        ermh ermhVar4 = ermxVar.d;
        if (ermhVar4 != null) {
            ermhVar = ermhVar4;
        }
        evqs evqsVar = ermhVar.c;
        ermgVar.copyOnWrite();
        ermh ermhVar5 = (ermh) ermgVar.instance;
        evqsVar.getClass();
        ermhVar5.c = evqsVar;
        ermy ermyVar2 = ermy.RAW;
        ermgVar.copyOnWrite();
        ((ermh) ermgVar.instance).d = ermyVar2.a();
        eqst eqstVarA = eqta.a(((ermh) ermgVar.build()).toByteArray());
        if (eqstVarA instanceof equk) {
            eqvqVar = eqvq.a;
        } else if (eqstVarA instanceof equz) {
            eqvqVar = eqvq.c;
        } else if (eqstVarA instanceof eqwu) {
            eqvqVar = eqvq.b;
        } else if (eqstVarA instanceof eqtt) {
            eqvqVar = eqvq.d;
        } else if (eqstVarA instanceof equb) {
            eqvqVar = eqvq.e;
        } else {
            if (!(eqstVarA instanceof equt)) {
                throw new GeneralSecurityException("Unsupported DEK parameters when parsing ".concat(eqstVarA.toString()));
            }
            eqvqVar = eqvq.f;
        }
        int iOrdinal = ermyVar.ordinal();
        if (iOrdinal == 1) {
            eqvrVar = eqvr.a;
        } else {
            if (iOrdinal != 3) {
                throw new GeneralSecurityException(a.U(ermyVar, "Unable to parse OutputPrefixType: "));
            }
            eqvrVar = eqvr.b;
        }
        String str2 = ermxVar.c;
        eqtf eqtfVar = (eqtf) eqstVarA;
        if (str2 == null) {
            throw new GeneralSecurityException("kekUri must be set");
        }
        if (eqtfVar.a()) {
            throw new GeneralSecurityException("dekParametersForNewKeys must not have ID Requirements");
        }
        if ((eqvqVar.equals(eqvq.a) && (eqtfVar instanceof equk)) || ((eqvqVar.equals(eqvq.c) && (eqtfVar instanceof equz)) || ((eqvqVar.equals(eqvq.b) && (eqtfVar instanceof eqwu)) || ((eqvqVar.equals(eqvq.d) && (eqtfVar instanceof eqtt)) || ((eqvqVar.equals(eqvq.e) && (eqtfVar instanceof equb)) || (eqvqVar.equals(eqvq.f) && (eqtfVar instanceof equt))))))) {
            return new eqvs(eqvrVar, str2, eqvqVar, eqtfVar);
        }
        throw new GeneralSecurityException("Cannot use parsing strategy " + eqvqVar.g + " when new keys are picked according to " + eqtfVar.toString() + ".");
    }

    public static ermx b(eqvs eqvsVar) throws GeneralSecurityException {
        byte[] bArrB = eqta.b(eqvsVar.c);
        try {
            evrr evrrVar = evrr.a;
            evuq evuqVar = evuq.a;
            ermh ermhVar = (ermh) evsn.parseFrom(ermh.a, bArrB, evrr.a);
            ermw ermwVar = (ermw) ermx.a.createBuilder();
            String str = eqvsVar.b;
            ermwVar.copyOnWrite();
            ((ermx) ermwVar.instance).c = str;
            ermwVar.copyOnWrite();
            ermx ermxVar = (ermx) ermwVar.instance;
            ermhVar.getClass();
            ermxVar.d = ermhVar;
            ermxVar.b |= 1;
            return (ermx) ermwVar.build();
        } catch (evtj e2) {
            throw new GeneralSecurityException("Parsing KmsEnvelopeAeadKeyFormat failed: ", e2);
        }
    }

    public static ermy c(eqvr eqvrVar) throws GeneralSecurityException {
        if (eqvr.a.equals(eqvrVar)) {
            return ermy.TINK;
        }
        if (eqvr.b.equals(eqvrVar)) {
            return ermy.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(eqvrVar.c));
    }
}
