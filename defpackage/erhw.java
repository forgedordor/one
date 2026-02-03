package defpackage;

import java.security.GeneralSecurityException;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class erhw {
    public static final erfi a;
    public static final erff b;
    public static final erei c;
    public static final eref d;
    private static final erwn e;

    static {
        erwn erwnVarB = ergh.b("type.googleapis.com/google.crypto.tink.AesCmacKey");
        e = erwnVarB;
        a = new erfg(ergq.class, erfw.class, new erfh() { // from class: erhs
            @Override // defpackage.erfh
            public final erga a(eqst eqstVar) throws GeneralSecurityException {
                ergq ergqVar = (ergq) eqstVar;
                erfi erfiVar = erhw.a;
                ermg ermgVar = (ermg) ermh.a.createBuilder();
                ermgVar.copyOnWrite();
                ((ermh) ermgVar.instance).b = "type.googleapis.com/google.crypto.tink.AesCmacKey";
                erij erijVar = (erij) erik.a.createBuilder();
                erim erimVarB = erhw.b(ergqVar);
                erijVar.copyOnWrite();
                erik erikVar = (erik) erijVar.instance;
                erimVarB.getClass();
                erikVar.d = erimVarB;
                erikVar.b |= 1;
                int i = ergqVar.a;
                erijVar.copyOnWrite();
                ((erik) erijVar.instance).c = i;
                evqs byteString = ((erik) erijVar.build()).toByteString();
                ermgVar.copyOnWrite();
                ((ermh) ermgVar.instance).c = byteString;
                ermy ermyVarC = erhw.c(ergqVar.c);
                ermgVar.copyOnWrite();
                ((ermh) ermgVar.instance).d = ermyVarC.a();
                return erfw.b((ermh) ermgVar.build());
            }
        });
        b = new erfd(erwnVarB, erfw.class, new erfe() { // from class: erht
            @Override // defpackage.erfe
            public final eqst a(erga ergaVar) throws GeneralSecurityException {
                erfi erfiVar = erhw.a;
                erfw erfwVar = (erfw) ergaVar;
                ermh ermhVar = erfwVar.b;
                if (!ermhVar.b.equals("type.googleapis.com/google.crypto.tink.AesCmacKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to AesCmacProtoSerialization.parseParameters: ".concat(String.valueOf(erfwVar.b.b)));
                }
                try {
                    evqs evqsVar = ermhVar.c;
                    evrr evrrVar = evrr.a;
                    evuq evuqVar = evuq.a;
                    erik erikVar = (erik) evsn.parseFrom(erik.a, evqsVar, evrr.a);
                    ergo ergoVar = new ergo();
                    ergoVar.b(erikVar.c);
                    erim erimVar = erikVar.d;
                    if (erimVar == null) {
                        erimVar = erim.a;
                    }
                    ergoVar.c(erimVar.b);
                    ermy ermyVarB = ermy.b(erfwVar.b.d);
                    if (ermyVarB == null) {
                        ermyVarB = ermy.UNRECOGNIZED;
                    }
                    ergoVar.a = erhw.a(ermyVarB);
                    return ergoVar.a();
                } catch (evtj e2) {
                    throw new GeneralSecurityException("Parsing AesCmacParameters failed: ", e2);
                }
            }
        });
        c = new ereg(ergj.class, erfv.class, new ereh() { // from class: erhu
            @Override // defpackage.ereh
            public final erga a(eqsg eqsgVar) {
                ergj ergjVar = (ergj) eqsgVar;
                erfi erfiVar = erhw.a;
                erih erihVar = (erih) erii.a.createBuilder();
                ergq ergqVar = ergjVar.a;
                erim erimVarB = erhw.b(ergqVar);
                erihVar.copyOnWrite();
                erii eriiVar = (erii) erihVar.instance;
                erimVarB.getClass();
                eriiVar.e = erimVarB;
                eriiVar.b |= 1;
                evqs evqsVarX = evqs.x(ergjVar.b.d());
                erihVar.copyOnWrite();
                ((erii) erihVar.instance).d = evqsVarX;
                return erfv.a("type.googleapis.com/google.crypto.tink.AesCmacKey", ((erii) erihVar.build()).toByteString(), 3, erhw.c(ergqVar.c), ergjVar.d);
            }
        });
        d = new ered(erwnVarB, erfv.class, new eree() { // from class: erhv
            @Override // defpackage.eree
            public final eqsg a(erga ergaVar) throws GeneralSecurityException {
                erfi erfiVar = erhw.a;
                if (!((erfv) ergaVar).a.equals("type.googleapis.com/google.crypto.tink.AesCmacKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to AesCmacProtoSerialization.parseKey");
                }
                try {
                    evqs evqsVar = ((erfv) ergaVar).c;
                    evrr evrrVar = evrr.a;
                    evuq evuqVar = evuq.a;
                    erii eriiVar = (erii) evsn.parseFrom(erii.a, evqsVar, evrr.a);
                    if (eriiVar.c != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    ergo ergoVar = new ergo();
                    ergoVar.b(eriiVar.d.d());
                    erim erimVar = eriiVar.e;
                    if (erimVar == null) {
                        erimVar = erim.a;
                    }
                    ergoVar.c(erimVar.b);
                    ergoVar.a = erhw.a(((erfv) ergaVar).d);
                    return ergi.a(ergoVar.a(), erwp.c(eriiVar.d.I()), ((erfv) ergaVar).e);
                } catch (evtj | IllegalArgumentException unused) {
                    throw new GeneralSecurityException("Parsing AesCmacKey failed");
                }
            }
        });
    }

    public static ergp a(ermy ermyVar) throws GeneralSecurityException {
        int iOrdinal = ermyVar.ordinal();
        if (iOrdinal == 1) {
            return ergp.a;
        }
        if (iOrdinal == 2) {
            return ergp.c;
        }
        if (iOrdinal == 3) {
            return ergp.d;
        }
        if (iOrdinal == 4) {
            return ergp.b;
        }
        throw new GeneralSecurityException(a.U(ermyVar, "Unable to parse OutputPrefixType: "));
    }

    public static erim b(ergq ergqVar) {
        eril erilVar = (eril) erim.a.createBuilder();
        erilVar.copyOnWrite();
        ((erim) erilVar.instance).b = ergqVar.b;
        return (erim) erilVar.build();
    }

    public static ermy c(ergp ergpVar) throws GeneralSecurityException {
        if (ergp.a.equals(ergpVar)) {
            return ermy.TINK;
        }
        if (ergp.b.equals(ergpVar)) {
            return ermy.CRUNCHY;
        }
        if (ergp.d.equals(ergpVar)) {
            return ermy.RAW;
        }
        if (ergp.c.equals(ergpVar)) {
            return ermy.LEGACY;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(String.valueOf(ergpVar))));
    }
}
