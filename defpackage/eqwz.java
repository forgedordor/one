package defpackage;

import java.security.GeneralSecurityException;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eqwz {
    public static final erfi a;
    public static final erff b;
    public static final erei c;
    public static final eref d;
    private static final erwn e;

    static {
        erwn erwnVarB = ergh.b("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey");
        e = erwnVarB;
        a = new erfg(eqtt.class, erfw.class, new erfh() { // from class: eqwv
            @Override // defpackage.erfh
            public final erga a(eqst eqstVar) throws GeneralSecurityException {
                eqtt eqttVar = (eqtt) eqstVar;
                erfi erfiVar = eqwz.a;
                ermg ermgVar = (ermg) ermh.a.createBuilder();
                ermgVar.copyOnWrite();
                ((ermh) ermgVar.instance).b = "type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey";
                erip eripVar = (erip) eriq.a.createBuilder();
                eriz erizVar = (eriz) erja.a.createBuilder();
                erjb erjbVar = (erjb) erjc.a.createBuilder();
                int i = eqttVar.c;
                erjbVar.copyOnWrite();
                ((erjc) erjbVar.instance).b = i;
                erjc erjcVar = (erjc) erjbVar.build();
                erizVar.copyOnWrite();
                erja erjaVar = (erja) erizVar.instance;
                erjcVar.getClass();
                erjaVar.c = erjcVar;
                erjaVar.b |= 1;
                int i2 = eqttVar.a;
                erizVar.copyOnWrite();
                ((erja) erizVar.instance).d = i2;
                erja erjaVar2 = (erja) erizVar.build();
                eripVar.copyOnWrite();
                eriq eriqVar = (eriq) eripVar.instance;
                erjaVar2.getClass();
                eriqVar.c = erjaVar2;
                eriqVar.b |= 1;
                erln erlnVar = (erln) erlo.a.createBuilder();
                erlq erlqVarC = eqwz.c(eqttVar);
                erlnVar.copyOnWrite();
                erlo erloVar = (erlo) erlnVar.instance;
                erlqVarC.getClass();
                erloVar.c = erlqVarC;
                erloVar.b |= 1;
                int i3 = eqttVar.b;
                erlnVar.copyOnWrite();
                ((erlo) erlnVar.instance).d = i3;
                erlo erloVar2 = (erlo) erlnVar.build();
                eripVar.copyOnWrite();
                eriq eriqVar2 = (eriq) eripVar.instance;
                erloVar2.getClass();
                eriqVar2.d = erloVar2;
                eriqVar2.b |= 2;
                evqs byteString = ((eriq) eripVar.build()).toByteString();
                ermgVar.copyOnWrite();
                ((ermh) ermgVar.instance).c = byteString;
                ermy ermyVarD = eqwz.d(eqttVar.e);
                ermgVar.copyOnWrite();
                ((ermh) ermgVar.instance).d = ermyVarD.a();
                return erfw.b((ermh) ermgVar.build());
            }
        });
        b = new erfd(erwnVarB, erfw.class, new erfe() { // from class: eqww
            @Override // defpackage.erfe
            public final eqst a(erga ergaVar) throws GeneralSecurityException {
                erfi erfiVar = eqwz.a;
                erfw erfwVar = (erfw) ergaVar;
                ermh ermhVar = erfwVar.b;
                if (!ermhVar.b.equals("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to AesCtrHmacAeadProtoSerialization.parseParameters: ".concat(String.valueOf(erfwVar.b.b)));
                }
                try {
                    evqs evqsVar = ermhVar.c;
                    evrr evrrVar = evrr.a;
                    evuq evuqVar = evuq.a;
                    eriq eriqVar = (eriq) evsn.parseFrom(eriq.a, evqsVar, evrr.a);
                    erlo erloVar = eriqVar.d;
                    if (erloVar == null) {
                        erloVar = erlo.a;
                    }
                    if (erloVar.e != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    eqtq eqtqVar = new eqtq();
                    erja erjaVar = eriqVar.c;
                    if (erjaVar == null) {
                        erjaVar = erja.a;
                    }
                    eqtqVar.b(erjaVar.d);
                    erlo erloVar2 = eriqVar.d;
                    if (erloVar2 == null) {
                        erloVar2 = erlo.a;
                    }
                    eqtqVar.c(erloVar2.d);
                    erja erjaVar2 = eriqVar.c;
                    if (erjaVar2 == null) {
                        erjaVar2 = erja.a;
                    }
                    erjc erjcVar = erjaVar2.c;
                    if (erjcVar == null) {
                        erjcVar = erjc.a;
                    }
                    eqtqVar.d(erjcVar.b);
                    erlo erloVar3 = eriqVar.d;
                    if (erloVar3 == null) {
                        erloVar3 = erlo.a;
                    }
                    erlq erlqVar = erloVar3.c;
                    if (erlqVar == null) {
                        erlqVar = erlq.a;
                    }
                    eqtqVar.e(erlqVar.c);
                    erlo erloVar4 = eriqVar.d;
                    if (erloVar4 == null) {
                        erloVar4 = erlo.a;
                    }
                    erlq erlqVar2 = erloVar4.c;
                    if (erlqVar2 == null) {
                        erlqVar2 = erlq.a;
                    }
                    erlk erlkVarB = erlk.b(erlqVar2.b);
                    if (erlkVarB == null) {
                        erlkVarB = erlk.UNRECOGNIZED;
                    }
                    eqtqVar.a = eqwz.a(erlkVarB);
                    ermy ermyVarB = ermy.b(erfwVar.b.d);
                    if (ermyVarB == null) {
                        ermyVarB = ermy.UNRECOGNIZED;
                    }
                    eqtqVar.b = eqwz.b(ermyVarB);
                    return eqtqVar.a();
                } catch (evtj e2) {
                    throw new GeneralSecurityException("Parsing AesCtrHmacAeadParameters failed: ", e2);
                }
            }
        });
        c = new ereg(eqtl.class, erfv.class, new ereh() { // from class: eqwx
            @Override // defpackage.ereh
            public final erga a(eqsg eqsgVar) throws GeneralSecurityException {
                eqtl eqtlVar = (eqtl) eqsgVar;
                erfi erfiVar = eqwz.a;
                erin erinVar = (erin) erio.a.createBuilder();
                erix erixVar = (erix) eriy.a.createBuilder();
                erjb erjbVar = (erjb) erjc.a.createBuilder();
                eqtt eqttVar = eqtlVar.a;
                int i = eqttVar.c;
                erjbVar.copyOnWrite();
                ((erjc) erjbVar.instance).b = i;
                erjc erjcVar = (erjc) erjbVar.build();
                erixVar.copyOnWrite();
                eriy eriyVar = (eriy) erixVar.instance;
                erjcVar.getClass();
                eriyVar.d = erjcVar;
                eriyVar.b |= 1;
                evqs evqsVarX = evqs.x(eqtlVar.b.d());
                erixVar.copyOnWrite();
                ((eriy) erixVar.instance).e = evqsVarX;
                eriy eriyVar2 = (eriy) erixVar.build();
                erinVar.copyOnWrite();
                erio erioVar = (erio) erinVar.instance;
                eriyVar2.getClass();
                erioVar.d = eriyVar2;
                erioVar.b |= 1;
                erll erllVar = (erll) erlm.a.createBuilder();
                erlq erlqVarC = eqwz.c(eqttVar);
                erllVar.copyOnWrite();
                erlm erlmVar = (erlm) erllVar.instance;
                erlqVarC.getClass();
                erlmVar.d = erlqVarC;
                erlmVar.b |= 1;
                evqs evqsVarX2 = evqs.x(eqtlVar.c.d());
                erllVar.copyOnWrite();
                ((erlm) erllVar.instance).e = evqsVarX2;
                erlm erlmVar2 = (erlm) erllVar.build();
                erinVar.copyOnWrite();
                erio erioVar2 = (erio) erinVar.instance;
                erlmVar2.getClass();
                erioVar2.e = erlmVar2;
                erioVar2.b |= 2;
                return erfv.a("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey", ((erio) erinVar.build()).toByteString(), 3, eqwz.d(eqttVar.e), eqtlVar.e);
            }
        });
        d = new ered(erwnVarB, erfv.class, new eree() { // from class: eqwy
            @Override // defpackage.eree
            public final eqsg a(erga ergaVar) throws GeneralSecurityException {
                erfi erfiVar = eqwz.a;
                if (!((erfv) ergaVar).a.equals("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to AesCtrHmacAeadProtoSerialization.parseKey");
                }
                try {
                    evqs evqsVar = ((erfv) ergaVar).c;
                    evrr evrrVar = evrr.a;
                    evuq evuqVar = evuq.a;
                    erio erioVar = (erio) evsn.parseFrom(erio.a, evqsVar, evrr.a);
                    if (erioVar.c != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    eriy eriyVar = erioVar.d;
                    if (eriyVar == null) {
                        eriyVar = eriy.a;
                    }
                    if (eriyVar.c != 0) {
                        throw new GeneralSecurityException("Only version 0 keys inner AES CTR keys are accepted");
                    }
                    erlm erlmVar = erioVar.e;
                    if (erlmVar == null) {
                        erlmVar = erlm.a;
                    }
                    if (erlmVar.c != 0) {
                        throw new GeneralSecurityException("Only version 0 keys inner HMAC keys are accepted");
                    }
                    eqtq eqtqVar = new eqtq();
                    eriy eriyVar2 = erioVar.d;
                    if (eriyVar2 == null) {
                        eriyVar2 = eriy.a;
                    }
                    eqtqVar.b(eriyVar2.e.d());
                    erlm erlmVar2 = erioVar.e;
                    if (erlmVar2 == null) {
                        erlmVar2 = erlm.a;
                    }
                    eqtqVar.c(erlmVar2.e.d());
                    eriy eriyVar3 = erioVar.d;
                    if (eriyVar3 == null) {
                        eriyVar3 = eriy.a;
                    }
                    erjc erjcVar = eriyVar3.d;
                    if (erjcVar == null) {
                        erjcVar = erjc.a;
                    }
                    eqtqVar.d(erjcVar.b);
                    erlm erlmVar3 = erioVar.e;
                    if (erlmVar3 == null) {
                        erlmVar3 = erlm.a;
                    }
                    erlq erlqVar = erlmVar3.d;
                    if (erlqVar == null) {
                        erlqVar = erlq.a;
                    }
                    eqtqVar.e(erlqVar.c);
                    erlm erlmVar4 = erioVar.e;
                    if (erlmVar4 == null) {
                        erlmVar4 = erlm.a;
                    }
                    erlq erlqVar2 = erlmVar4.d;
                    if (erlqVar2 == null) {
                        erlqVar2 = erlq.a;
                    }
                    erlk erlkVarB = erlk.b(erlqVar2.b);
                    if (erlkVarB == null) {
                        erlkVarB = erlk.UNRECOGNIZED;
                    }
                    eqtqVar.a = eqwz.a(erlkVarB);
                    eqtqVar.b = eqwz.b(((erfv) ergaVar).d);
                    eqtt eqttVarA = eqtqVar.a();
                    eriy eriyVar4 = erioVar.d;
                    if (eriyVar4 == null) {
                        eriyVar4 = eriy.a;
                    }
                    erwp erwpVarC = erwp.c(eriyVar4.e.I());
                    erlm erlmVar5 = erioVar.e;
                    if (erlmVar5 == null) {
                        erlmVar5 = erlm.a;
                    }
                    return eqtk.a(eqttVarA, erwpVarC, erwp.c(erlmVar5.e.I()), ((erfv) ergaVar).e);
                } catch (evtj unused) {
                    throw new GeneralSecurityException("Parsing AesCtrHmacAeadKey failed");
                }
            }
        });
    }

    public static eqtr a(erlk erlkVar) throws GeneralSecurityException {
        int iOrdinal = erlkVar.ordinal();
        if (iOrdinal == 1) {
            return eqtr.a;
        }
        if (iOrdinal == 2) {
            return eqtr.d;
        }
        if (iOrdinal == 3) {
            return eqtr.c;
        }
        if (iOrdinal == 4) {
            return eqtr.e;
        }
        if (iOrdinal == 5) {
            return eqtr.b;
        }
        throw new GeneralSecurityException("Unable to parse HashType: " + erlkVar.a());
    }

    public static eqts b(ermy ermyVar) throws GeneralSecurityException {
        int iOrdinal = ermyVar.ordinal();
        if (iOrdinal == 1) {
            return eqts.a;
        }
        if (iOrdinal != 2) {
            if (iOrdinal == 3) {
                return eqts.c;
            }
            if (iOrdinal != 4) {
                throw new GeneralSecurityException(a.U(ermyVar, "Unable to parse OutputPrefixType: "));
            }
        }
        return eqts.b;
    }

    public static erlq c(eqtt eqttVar) throws GeneralSecurityException {
        erlk erlkVar;
        erlp erlpVar = (erlp) erlq.a.createBuilder();
        erlpVar.copyOnWrite();
        ((erlq) erlpVar.instance).c = eqttVar.d;
        eqtr eqtrVar = eqtr.a;
        eqtr eqtrVar2 = eqttVar.f;
        if (eqtrVar.equals(eqtrVar2)) {
            erlkVar = erlk.SHA1;
        } else if (eqtr.b.equals(eqtrVar2)) {
            erlkVar = erlk.SHA224;
        } else if (eqtr.c.equals(eqtrVar2)) {
            erlkVar = erlk.SHA256;
        } else if (eqtr.d.equals(eqtrVar2)) {
            erlkVar = erlk.SHA384;
        } else {
            if (!eqtr.e.equals(eqtrVar2)) {
                throw new GeneralSecurityException("Unable to serialize HashType ".concat(String.valueOf(String.valueOf(eqtrVar2))));
            }
            erlkVar = erlk.SHA512;
        }
        erlpVar.copyOnWrite();
        ((erlq) erlpVar.instance).b = erlkVar.a();
        return (erlq) erlpVar.build();
    }

    public static ermy d(eqts eqtsVar) throws GeneralSecurityException {
        if (eqts.a.equals(eqtsVar)) {
            return ermy.TINK;
        }
        if (eqts.b.equals(eqtsVar)) {
            return ermy.CRUNCHY;
        }
        if (eqts.c.equals(eqtsVar)) {
            return ermy.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(String.valueOf(eqtsVar))));
    }
}
