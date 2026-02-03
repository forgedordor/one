package defpackage;

import java.security.GeneralSecurityException;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eqxe {
    public static final erfi a;
    public static final erff b;
    public static final erei c;
    public static final eref d;
    private static final erwn e;

    static {
        erwn erwnVarB = ergh.b("type.googleapis.com/google.crypto.tink.AesEaxKey");
        e = erwnVarB;
        a = new erfg(equb.class, erfw.class, new erfh() { // from class: eqxa
            @Override // defpackage.erfh
            public final erga a(eqst eqstVar) throws GeneralSecurityException {
                equb equbVar = (equb) eqstVar;
                erfi erfiVar = eqxe.a;
                ermg ermgVar = (ermg) ermh.a.createBuilder();
                ermgVar.copyOnWrite();
                ((ermh) ermgVar.instance).b = "type.googleapis.com/google.crypto.tink.AesEaxKey";
                erjf erjfVar = (erjf) erjg.a.createBuilder();
                erji erjiVarB = eqxe.b(equbVar);
                erjfVar.copyOnWrite();
                erjg erjgVar = (erjg) erjfVar.instance;
                erjiVarB.getClass();
                erjgVar.c = erjiVarB;
                erjgVar.b |= 1;
                int i = equbVar.a;
                erjfVar.copyOnWrite();
                ((erjg) erjfVar.instance).d = i;
                evqs byteString = ((erjg) erjfVar.build()).toByteString();
                ermgVar.copyOnWrite();
                ((ermh) ermgVar.instance).c = byteString;
                ermy ermyVarC = eqxe.c(equbVar.d);
                ermgVar.copyOnWrite();
                ((ermh) ermgVar.instance).d = ermyVarC.a();
                return erfw.b((ermh) ermgVar.build());
            }
        });
        b = new erfd(erwnVarB, erfw.class, new erfe() { // from class: eqxb
            @Override // defpackage.erfe
            public final eqst a(erga ergaVar) throws GeneralSecurityException {
                erfi erfiVar = eqxe.a;
                erfw erfwVar = (erfw) ergaVar;
                ermh ermhVar = erfwVar.b;
                if (!ermhVar.b.equals("type.googleapis.com/google.crypto.tink.AesEaxKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to AesEaxProtoSerialization.parseParameters: ".concat(String.valueOf(erfwVar.b.b)));
                }
                try {
                    evqs evqsVar = ermhVar.c;
                    evrr evrrVar = evrr.a;
                    evuq evuqVar = evuq.a;
                    erjg erjgVar = (erjg) evsn.parseFrom(erjg.a, evqsVar, evrr.a);
                    eqtz eqtzVar = new eqtz();
                    eqtzVar.c(erjgVar.d);
                    erji erjiVar = erjgVar.c;
                    if (erjiVar == null) {
                        erjiVar = erji.a;
                    }
                    eqtzVar.b(erjiVar.b);
                    eqtzVar.d();
                    ermy ermyVarB = ermy.b(erfwVar.b.d);
                    if (ermyVarB == null) {
                        ermyVarB = ermy.UNRECOGNIZED;
                    }
                    eqtzVar.a = eqxe.a(ermyVarB);
                    return eqtzVar.a();
                } catch (evtj e2) {
                    throw new GeneralSecurityException("Parsing AesEaxParameters failed: ", e2);
                }
            }
        });
        c = new ereg(eqtv.class, erfv.class, new ereh() { // from class: eqxc
            @Override // defpackage.ereh
            public final erga a(eqsg eqsgVar) {
                eqtv eqtvVar = (eqtv) eqsgVar;
                erfi erfiVar = eqxe.a;
                erjd erjdVar = (erjd) erje.a.createBuilder();
                equb equbVar = eqtvVar.a;
                erji erjiVarB = eqxe.b(equbVar);
                erjdVar.copyOnWrite();
                erje erjeVar = (erje) erjdVar.instance;
                erjiVarB.getClass();
                erjeVar.d = erjiVarB;
                erjeVar.b |= 1;
                evqs evqsVarX = evqs.x(eqtvVar.b.d());
                erjdVar.copyOnWrite();
                ((erje) erjdVar.instance).e = evqsVarX;
                return erfv.a("type.googleapis.com/google.crypto.tink.AesEaxKey", ((erje) erjdVar.build()).toByteString(), 3, eqxe.c(equbVar.d), eqtvVar.d);
            }
        });
        d = new ered(erwnVarB, erfv.class, new eree() { // from class: eqxd
            @Override // defpackage.eree
            public final eqsg a(erga ergaVar) throws GeneralSecurityException {
                erfi erfiVar = eqxe.a;
                if (!((erfv) ergaVar).a.equals("type.googleapis.com/google.crypto.tink.AesEaxKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to AesEaxProtoSerialization.parseKey");
                }
                try {
                    evqs evqsVar = ((erfv) ergaVar).c;
                    evrr evrrVar = evrr.a;
                    evuq evuqVar = evuq.a;
                    erje erjeVar = (erje) evsn.parseFrom(erje.a, evqsVar, evrr.a);
                    if (erjeVar.c != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    eqtz eqtzVar = new eqtz();
                    eqtzVar.c(erjeVar.e.d());
                    erji erjiVar = erjeVar.d;
                    if (erjiVar == null) {
                        erjiVar = erji.a;
                    }
                    eqtzVar.b(erjiVar.b);
                    eqtzVar.d();
                    eqtzVar.a = eqxe.a(((erfv) ergaVar).d);
                    return eqtu.a(eqtzVar.a(), erwp.c(erjeVar.e.I()), ((erfv) ergaVar).e);
                } catch (evtj unused) {
                    throw new GeneralSecurityException("Parsing AesEaxcKey failed");
                }
            }
        });
    }

    public static equa a(ermy ermyVar) throws GeneralSecurityException {
        int iOrdinal = ermyVar.ordinal();
        if (iOrdinal == 1) {
            return equa.a;
        }
        if (iOrdinal != 2) {
            if (iOrdinal == 3) {
                return equa.c;
            }
            if (iOrdinal != 4) {
                throw new GeneralSecurityException(a.U(ermyVar, "Unable to parse OutputPrefixType: "));
            }
        }
        return equa.b;
    }

    public static erji b(equb equbVar) {
        int i = equbVar.c;
        erjh erjhVar = (erjh) erji.a.createBuilder();
        erjhVar.copyOnWrite();
        ((erji) erjhVar.instance).b = equbVar.b;
        return (erji) erjhVar.build();
    }

    public static ermy c(equa equaVar) throws GeneralSecurityException {
        if (equa.a.equals(equaVar)) {
            return ermy.TINK;
        }
        if (equa.b.equals(equaVar)) {
            return ermy.CRUNCHY;
        }
        if (equa.c.equals(equaVar)) {
            return ermy.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(String.valueOf(equaVar))));
    }
}
