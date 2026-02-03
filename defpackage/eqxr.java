package defpackage;

import java.security.GeneralSecurityException;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eqxr {
    public static final erfi a;
    public static final erff b;
    public static final erei c;
    public static final eref d;
    private static final erwn e;

    static {
        erwn erwnVarB = ergh.b("type.googleapis.com/google.crypto.tink.AesGcmSivKey");
        e = erwnVarB;
        a = new erfg(equt.class, erfw.class, new erfh() { // from class: eqxn
            @Override // defpackage.erfh
            public final erga a(eqst eqstVar) throws GeneralSecurityException {
                equt equtVar = (equt) eqstVar;
                erfi erfiVar = eqxr.a;
                ermg ermgVar = (ermg) ermh.a.createBuilder();
                ermgVar.copyOnWrite();
                ((ermh) ermgVar.instance).b = "type.googleapis.com/google.crypto.tink.AesGcmSivKey";
                erjv erjvVar = (erjv) erjw.a.createBuilder();
                int i = equtVar.a;
                erjvVar.copyOnWrite();
                ((erjw) erjvVar.instance).b = i;
                evqs byteString = ((erjw) erjvVar.build()).toByteString();
                ermgVar.copyOnWrite();
                ((ermh) ermgVar.instance).c = byteString;
                ermy ermyVarB = eqxr.b(equtVar.b);
                ermgVar.copyOnWrite();
                ((ermh) ermgVar.instance).d = ermyVarB.a();
                return erfw.b((ermh) ermgVar.build());
            }
        });
        b = new erfd(erwnVarB, erfw.class, new erfe() { // from class: eqxo
            @Override // defpackage.erfe
            public final eqst a(erga ergaVar) throws GeneralSecurityException {
                erfi erfiVar = eqxr.a;
                erfw erfwVar = (erfw) ergaVar;
                ermh ermhVar = erfwVar.b;
                if (!ermhVar.b.equals("type.googleapis.com/google.crypto.tink.AesGcmSivKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to AesGcmSivProtoSerialization.parseParameters: ".concat(String.valueOf(erfwVar.b.b)));
                }
                try {
                    evqs evqsVar = ermhVar.c;
                    evrr evrrVar = evrr.a;
                    evuq evuqVar = evuq.a;
                    erjw erjwVar = (erjw) evsn.parseFrom(erjw.a, evqsVar, evrr.a);
                    if (erjwVar.c != 0) {
                        throw new GeneralSecurityException("Only version 0 parameters are accepted");
                    }
                    equr equrVar = new equr();
                    equrVar.b(erjwVar.b);
                    ermy ermyVarB = ermy.b(erfwVar.b.d);
                    if (ermyVarB == null) {
                        ermyVarB = ermy.UNRECOGNIZED;
                    }
                    equrVar.a = eqxr.a(ermyVarB);
                    return equrVar.a();
                } catch (evtj e2) {
                    throw new GeneralSecurityException("Parsing AesGcmSivParameters failed: ", e2);
                }
            }
        });
        c = new ereg(equm.class, erfv.class, new ereh() { // from class: eqxp
            @Override // defpackage.ereh
            public final erga a(eqsg eqsgVar) {
                equm equmVar = (equm) eqsgVar;
                erfi erfiVar = eqxr.a;
                erjt erjtVar = (erjt) erju.a.createBuilder();
                evqs evqsVarX = evqs.x(equmVar.b.d());
                erjtVar.copyOnWrite();
                ((erju) erjtVar.instance).c = evqsVarX;
                evqs byteString = ((erju) erjtVar.build()).toByteString();
                equs equsVar = equmVar.a.b;
                return erfv.a("type.googleapis.com/google.crypto.tink.AesGcmSivKey", byteString, 3, eqxr.b(equsVar), equmVar.d);
            }
        });
        d = new ered(erwnVarB, erfv.class, new eree() { // from class: eqxq
            @Override // defpackage.eree
            public final eqsg a(erga ergaVar) throws GeneralSecurityException {
                erfi erfiVar = eqxr.a;
                if (!((erfv) ergaVar).a.equals("type.googleapis.com/google.crypto.tink.AesGcmSivKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to AesGcmSivProtoSerialization.parseKey");
                }
                try {
                    evqs evqsVar = ((erfv) ergaVar).c;
                    evrr evrrVar = evrr.a;
                    evuq evuqVar = evuq.a;
                    erju erjuVar = (erju) evsn.parseFrom(erju.a, evqsVar, evrr.a);
                    if (erjuVar.b != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    equr equrVar = new equr();
                    equrVar.b(erjuVar.c.d());
                    equrVar.a = eqxr.a(((erfv) ergaVar).d);
                    return equl.a(equrVar.a(), erwp.c(erjuVar.c.I()), ((erfv) ergaVar).e);
                } catch (evtj unused) {
                    throw new GeneralSecurityException("Parsing AesGcmSivKey failed");
                }
            }
        });
    }

    public static equs a(ermy ermyVar) throws GeneralSecurityException {
        int iOrdinal = ermyVar.ordinal();
        if (iOrdinal == 1) {
            return equs.a;
        }
        if (iOrdinal != 2) {
            if (iOrdinal == 3) {
                return equs.c;
            }
            if (iOrdinal != 4) {
                throw new GeneralSecurityException(a.U(ermyVar, "Unable to parse OutputPrefixType: "));
            }
        }
        return equs.b;
    }

    public static ermy b(equs equsVar) throws GeneralSecurityException {
        if (equs.a.equals(equsVar)) {
            return ermy.TINK;
        }
        if (equs.b.equals(equsVar)) {
            return ermy.CRUNCHY;
        }
        if (equs.c.equals(equsVar)) {
            return ermy.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(String.valueOf(equsVar))));
    }
}
