package defpackage;

import java.security.GeneralSecurityException;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eqxl {
    public static final erfi a;
    public static final erff b;
    public static final erei c;
    public static final eref d;
    private static final erwn e;

    static {
        erwn erwnVarB = ergh.b("type.googleapis.com/google.crypto.tink.AesGcmKey");
        e = erwnVarB;
        a = new erfg(equk.class, erfw.class, new erfh() { // from class: eqxh
            @Override // defpackage.erfh
            public final erga a(eqst eqstVar) throws GeneralSecurityException {
                equk equkVar = (equk) eqstVar;
                eqxl.c(equkVar);
                ermg ermgVar = (ermg) ermh.a.createBuilder();
                ermgVar.copyOnWrite();
                ((ermh) ermgVar.instance).b = "type.googleapis.com/google.crypto.tink.AesGcmKey";
                erjr erjrVar = (erjr) erjs.a.createBuilder();
                int i = equkVar.a;
                erjrVar.copyOnWrite();
                ((erjs) erjrVar.instance).b = i;
                evqs byteString = ((erjs) erjrVar.build()).toByteString();
                ermgVar.copyOnWrite();
                ((ermh) ermgVar.instance).c = byteString;
                ermy ermyVarB = eqxl.b(equkVar.d);
                ermgVar.copyOnWrite();
                ((ermh) ermgVar.instance).d = ermyVarB.a();
                return erfw.b((ermh) ermgVar.build());
            }
        });
        b = new erfd(erwnVarB, erfw.class, new erfe() { // from class: eqxi
            @Override // defpackage.erfe
            public final eqst a(erga ergaVar) throws GeneralSecurityException {
                erfi erfiVar = eqxl.a;
                erfw erfwVar = (erfw) ergaVar;
                ermh ermhVar = erfwVar.b;
                if (!ermhVar.b.equals("type.googleapis.com/google.crypto.tink.AesGcmKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to AesGcmProtoSerialization.parseParameters: ".concat(String.valueOf(erfwVar.b.b)));
                }
                try {
                    evqs evqsVar = ermhVar.c;
                    evrr evrrVar = evrr.a;
                    evuq evuqVar = evuq.a;
                    erjs erjsVar = (erjs) evsn.parseFrom(erjs.a, evqsVar, evrr.a);
                    if (erjsVar.c != 0) {
                        throw new GeneralSecurityException("Only version 0 parameters are accepted");
                    }
                    equi equiVar = new equi();
                    equiVar.c(erjsVar.b);
                    equiVar.b();
                    equiVar.d();
                    ermy ermyVarB = ermy.b(erfwVar.b.d);
                    if (ermyVarB == null) {
                        ermyVarB = ermy.UNRECOGNIZED;
                    }
                    equiVar.a = eqxl.a(ermyVarB);
                    return equiVar.a();
                } catch (evtj e2) {
                    throw new GeneralSecurityException("Parsing AesGcmParameters failed: ", e2);
                }
            }
        });
        c = new ereg(equd.class, erfv.class, new ereh() { // from class: eqxj
            @Override // defpackage.ereh
            public final erga a(eqsg eqsgVar) {
                equd equdVar = (equd) eqsgVar;
                equk equkVar = equdVar.a;
                eqxl.c(equkVar);
                erjp erjpVar = (erjp) erjq.a.createBuilder();
                evqs evqsVarX = evqs.x(equdVar.b.d());
                erjpVar.copyOnWrite();
                ((erjq) erjpVar.instance).c = evqsVarX;
                evqs byteString = ((erjq) erjpVar.build()).toByteString();
                equj equjVar = equkVar.d;
                return erfv.a("type.googleapis.com/google.crypto.tink.AesGcmKey", byteString, 3, eqxl.b(equjVar), equdVar.d);
            }
        });
        d = new ered(erwnVarB, erfv.class, new eree() { // from class: eqxk
            @Override // defpackage.eree
            public final eqsg a(erga ergaVar) throws GeneralSecurityException {
                erfi erfiVar = eqxl.a;
                if (!((erfv) ergaVar).a.equals("type.googleapis.com/google.crypto.tink.AesGcmKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to AesGcmProtoSerialization.parseKey");
                }
                try {
                    evqs evqsVar = ((erfv) ergaVar).c;
                    evrr evrrVar = evrr.a;
                    evuq evuqVar = evuq.a;
                    erjq erjqVar = (erjq) evsn.parseFrom(erjq.a, evqsVar, evrr.a);
                    if (erjqVar.b != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    equi equiVar = new equi();
                    equiVar.c(erjqVar.c.d());
                    equiVar.b();
                    equiVar.d();
                    equiVar.a = eqxl.a(((erfv) ergaVar).d);
                    return equc.a(equiVar.a(), erwp.c(erjqVar.c.I()), ((erfv) ergaVar).e);
                } catch (evtj unused) {
                    throw new GeneralSecurityException("Parsing AesGcmKey failed");
                }
            }
        });
    }

    public static equj a(ermy ermyVar) throws GeneralSecurityException {
        int iOrdinal = ermyVar.ordinal();
        if (iOrdinal == 1) {
            return equj.a;
        }
        if (iOrdinal != 2) {
            if (iOrdinal == 3) {
                return equj.c;
            }
            if (iOrdinal != 4) {
                throw new GeneralSecurityException(a.U(ermyVar, "Unable to parse OutputPrefixType: "));
            }
        }
        return equj.b;
    }

    public static ermy b(equj equjVar) throws GeneralSecurityException {
        if (equj.a.equals(equjVar)) {
            return ermy.TINK;
        }
        if (equj.b.equals(equjVar)) {
            return ermy.CRUNCHY;
        }
        if (equj.c.equals(equjVar)) {
            return ermy.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(String.valueOf(equjVar))));
    }

    public static void c(equk equkVar) {
        int i = equkVar.c;
        int i2 = equkVar.b;
    }
}
