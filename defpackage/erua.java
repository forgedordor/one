package defpackage;

import java.security.GeneralSecurityException;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class erua {
    public static final erfi a;
    public static final erff b;
    public static final erei c;
    public static final eref d;
    private static final erwn e;

    static {
        erwn erwnVarB = ergh.b("type.googleapis.com/google.crypto.tink.AesGcmHkdfStreamingKey");
        e = erwnVarB;
        a = new erfg(ersx.class, erfw.class, new erfh() { // from class: ertw
            @Override // defpackage.erfh
            public final erga a(eqst eqstVar) throws GeneralSecurityException {
                ersx ersxVar = (ersx) eqstVar;
                erfi erfiVar = erua.a;
                ermg ermgVar = (ermg) ermh.a.createBuilder();
                ermgVar.copyOnWrite();
                ((ermh) ermgVar.instance).b = "type.googleapis.com/google.crypto.tink.AesGcmHkdfStreamingKey";
                erjl erjlVar = (erjl) erjm.a.createBuilder();
                int iD = ersxVar.d();
                erjlVar.copyOnWrite();
                ((erjm) erjlVar.instance).e = iD;
                erjo erjoVarA = erua.a(ersxVar);
                erjlVar.copyOnWrite();
                erjm erjmVar = (erjm) erjlVar.instance;
                erjoVarA.getClass();
                erjmVar.d = erjoVarA;
                erjmVar.b |= 1;
                evqs byteString = ((erjm) erjlVar.build()).toByteString();
                ermgVar.copyOnWrite();
                ((ermh) ermgVar.instance).c = byteString;
                ermy ermyVar = ermy.RAW;
                ermgVar.copyOnWrite();
                ((ermh) ermgVar.instance).d = ermyVar.a();
                return erfw.b((ermh) ermgVar.build());
            }
        });
        b = new erfd(erwnVarB, erfw.class, new erfe() { // from class: ertx
            @Override // defpackage.erfe
            public final eqst a(erga ergaVar) throws GeneralSecurityException {
                erfi erfiVar = erua.a;
                erfw erfwVar = (erfw) ergaVar;
                ermh ermhVar = erfwVar.b;
                if (!ermhVar.b.equals("type.googleapis.com/google.crypto.tink.AesGcmHkdfStreamingKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to AesGcmHkdfStreamingParameters.parseParameters: ".concat(String.valueOf(erfwVar.b.b)));
                }
                try {
                    evqs evqsVar = ermhVar.c;
                    evrr evrrVar = evrr.a;
                    evuq evuqVar = evuq.a;
                    erjm erjmVar = (erjm) evsn.parseFrom(erjm.a, evqsVar, evrr.a);
                    if (erjmVar.c != 0) {
                        throw new GeneralSecurityException("Only version 0 parameters are accepted");
                    }
                    erjo erjoVar = erjmVar.d;
                    if (erjoVar == null) {
                        erjoVar = erjo.a;
                    }
                    return erua.b(erjoVar, erjmVar.e);
                } catch (evtj e2) {
                    throw new GeneralSecurityException("Parsing AesGcmHkdfStreamingParameters failed: ", e2);
                }
            }
        });
        c = new ereg(ersp.class, erfv.class, new ereh() { // from class: erty
            @Override // defpackage.ereh
            public final erga a(eqsg eqsgVar) throws GeneralSecurityException {
                ersp erspVar = (ersp) eqsgVar;
                erfi erfiVar = erua.a;
                erjj erjjVar = (erjj) erjk.a.createBuilder();
                evqs evqsVarX = evqs.x(erspVar.b.d());
                erjjVar.copyOnWrite();
                ((erjk) erjjVar.instance).e = evqsVarX;
                erjo erjoVarA = erua.a(erspVar.a);
                erjjVar.copyOnWrite();
                erjk erjkVar = (erjk) erjjVar.instance;
                erjoVarA.getClass();
                erjkVar.d = erjoVarA;
                erjkVar.b |= 1;
                return erfv.a("type.googleapis.com/google.crypto.tink.AesGcmHkdfStreamingKey", ((erjk) erjjVar.build()).toByteString(), 3, ermy.RAW, null);
            }
        });
        d = new ered(erwnVarB, erfv.class, new eree() { // from class: ertz
            @Override // defpackage.eree
            public final eqsg a(erga ergaVar) throws GeneralSecurityException {
                erfi erfiVar = erua.a;
                if (!((erfv) ergaVar).a.equals("type.googleapis.com/google.crypto.tink.AesGcmHkdfStreamingKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to AesGcmHkdfStreamingParameters.parseParameters");
                }
                try {
                    evqs evqsVar = ((erfv) ergaVar).c;
                    evrr evrrVar = evrr.a;
                    evuq evuqVar = evuq.a;
                    erjk erjkVar = (erjk) evsn.parseFrom(erjk.a, evqsVar, evrr.a);
                    if (erjkVar.c != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    erjo erjoVar = erjkVar.d;
                    if (erjoVar == null) {
                        erjoVar = erjo.a;
                    }
                    return ersp.c(erua.b(erjoVar, erjkVar.e.d()), erwp.c(erjkVar.e.I()));
                } catch (evtj unused) {
                    throw new GeneralSecurityException("Parsing AesGcmHkdfStreamingKey failed");
                }
            }
        });
    }

    public static erjo a(ersx ersxVar) throws GeneralSecurityException {
        erlk erlkVar;
        erjn erjnVar = (erjn) erjo.a.createBuilder();
        int iB = ersxVar.b();
        erjnVar.copyOnWrite();
        ((erjo) erjnVar.instance).b = iB;
        int iC = ersxVar.c();
        erjnVar.copyOnWrite();
        ((erjo) erjnVar.instance).c = iC;
        ersw erswVar = ersw.a;
        ersw erswVar2 = ersxVar.a;
        if (erswVar.equals(erswVar2)) {
            erlkVar = erlk.SHA1;
        } else if (ersw.b.equals(erswVar2)) {
            erlkVar = erlk.SHA256;
        } else {
            if (!ersw.c.equals(erswVar2)) {
                throw new GeneralSecurityException("Unable to serialize HashType ".concat(String.valueOf(String.valueOf(erswVar2))));
            }
            erlkVar = erlk.SHA512;
        }
        erjnVar.copyOnWrite();
        ((erjo) erjnVar.instance).d = erlkVar.a();
        return (erjo) erjnVar.build();
    }

    public static ersx b(erjo erjoVar, int i) throws GeneralSecurityException {
        ersw erswVar;
        ersv ersvVar = new ersv();
        ersvVar.d(i);
        ersvVar.c(erjoVar.c);
        ersvVar.b(erjoVar.b);
        erlk erlkVarB = erlk.b(erjoVar.d);
        if (erlkVarB == null) {
            erlkVarB = erlk.UNRECOGNIZED;
        }
        int iOrdinal = erlkVarB.ordinal();
        if (iOrdinal == 1) {
            erswVar = ersw.a;
        } else if (iOrdinal == 3) {
            erswVar = ersw.b;
        } else {
            if (iOrdinal != 4) {
                throw new GeneralSecurityException("Unable to parse HashType: " + erlkVarB.a());
            }
            erswVar = ersw.c;
        }
        ersvVar.a = erswVar;
        return ersvVar.a();
    }
}
