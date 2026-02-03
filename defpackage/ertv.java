package defpackage;

import java.security.GeneralSecurityException;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ertv {
    public static final erfi a;
    public static final erff b;
    public static final erei c;
    public static final eref d;
    private static final erwn e;

    static {
        erwn erwnVarB = ergh.b("type.googleapis.com/google.crypto.tink.AesCtrHmacStreamingKey");
        e = erwnVarB;
        a = new erfg(erso.class, erfw.class, new erfh() { // from class: ertr
            @Override // defpackage.erfh
            public final erga a(eqst eqstVar) throws GeneralSecurityException {
                erso ersoVar = (erso) eqstVar;
                erfi erfiVar = ertv.a;
                ermg ermgVar = (ermg) ermh.a.createBuilder();
                ermgVar.copyOnWrite();
                ((ermh) ermgVar.instance).b = "type.googleapis.com/google.crypto.tink.AesCtrHmacStreamingKey";
                erit eritVar = (erit) eriu.a.createBuilder();
                int iE = ersoVar.e();
                eritVar.copyOnWrite();
                ((eriu) eritVar.instance).d = iE;
                eriw eriwVarA = ertv.a(ersoVar);
                eritVar.copyOnWrite();
                eriu eriuVar = (eriu) eritVar.instance;
                eriwVarA.getClass();
                eriuVar.c = eriwVarA;
                eriuVar.b |= 1;
                evqs byteString = ((eriu) eritVar.build()).toByteString();
                ermgVar.copyOnWrite();
                ((ermh) ermgVar.instance).c = byteString;
                ermy ermyVar = ermy.RAW;
                ermgVar.copyOnWrite();
                ((ermh) ermgVar.instance).d = ermyVar.a();
                return erfw.b((ermh) ermgVar.build());
            }
        });
        b = new erfd(erwnVarB, erfw.class, new erfe() { // from class: erts
            @Override // defpackage.erfe
            public final eqst a(erga ergaVar) throws GeneralSecurityException {
                erfi erfiVar = ertv.a;
                erfw erfwVar = (erfw) ergaVar;
                ermh ermhVar = erfwVar.b;
                if (!ermhVar.b.equals("type.googleapis.com/google.crypto.tink.AesCtrHmacStreamingKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to AesCtrHmacStreamingParameters.parseParameters: ".concat(String.valueOf(erfwVar.b.b)));
                }
                try {
                    evqs evqsVar = ermhVar.c;
                    evrr evrrVar = evrr.a;
                    evuq evuqVar = evuq.a;
                    eriu eriuVar = (eriu) evsn.parseFrom(eriu.a, evqsVar, evrr.a);
                    eriw eriwVar = eriuVar.c;
                    if (eriwVar == null) {
                        eriwVar = eriw.a;
                    }
                    return ertv.b(eriwVar, eriuVar.d);
                } catch (evtj e2) {
                    throw new GeneralSecurityException("Parsing AesCtrHmacStreamingParameters failed: ", e2);
                }
            }
        });
        c = new ereg(ersi.class, erfv.class, new ereh() { // from class: ertt
            @Override // defpackage.ereh
            public final erga a(eqsg eqsgVar) throws GeneralSecurityException {
                ersi ersiVar = (ersi) eqsgVar;
                erfi erfiVar = ertv.a;
                erir erirVar = (erir) eris.a.createBuilder();
                evqs evqsVarX = evqs.x(ersiVar.b.d());
                erirVar.copyOnWrite();
                ((eris) erirVar.instance).e = evqsVarX;
                eriw eriwVarA = ertv.a(ersiVar.a);
                erirVar.copyOnWrite();
                eris erisVar = (eris) erirVar.instance;
                eriwVarA.getClass();
                erisVar.d = eriwVarA;
                erisVar.b |= 1;
                return erfv.a("type.googleapis.com/google.crypto.tink.AesCtrHmacStreamingKey", ((eris) erirVar.build()).toByteString(), 3, ermy.RAW, null);
            }
        });
        d = new ered(erwnVarB, erfv.class, new eree() { // from class: ertu
            @Override // defpackage.eree
            public final eqsg a(erga ergaVar) throws GeneralSecurityException {
                erfi erfiVar = ertv.a;
                if (!((erfv) ergaVar).a.equals("type.googleapis.com/google.crypto.tink.AesCtrHmacStreamingKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to AesCtrHmacStreamingParameters.parseParameters");
                }
                try {
                    evqs evqsVar = ((erfv) ergaVar).c;
                    evrr evrrVar = evrr.a;
                    evuq evuqVar = evuq.a;
                    eris erisVar = (eris) evsn.parseFrom(eris.a, evqsVar, evrr.a);
                    if (erisVar.c != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    eriw eriwVar = erisVar.d;
                    if (eriwVar == null) {
                        eriwVar = eriw.a;
                    }
                    return ersi.c(ertv.b(eriwVar, erisVar.e.d()), erwp.c(erisVar.e.I()));
                } catch (evtj unused) {
                    throw new GeneralSecurityException("Parsing AesCtrHmacStreamingKey failed");
                }
            }
        });
    }

    public static eriw a(erso ersoVar) throws GeneralSecurityException {
        eriv erivVar = (eriv) eriw.a.createBuilder();
        int iB = ersoVar.b();
        erivVar.copyOnWrite();
        ((eriw) erivVar.instance).c = iB;
        int iC = ersoVar.c();
        erivVar.copyOnWrite();
        ((eriw) erivVar.instance).d = iC;
        erlk erlkVarC = c(ersoVar.a);
        erivVar.copyOnWrite();
        ((eriw) erivVar.instance).e = erlkVarC.a();
        erlp erlpVar = (erlp) erlq.a.createBuilder();
        erlk erlkVarC2 = c(ersoVar.b);
        erlpVar.copyOnWrite();
        ((erlq) erlpVar.instance).b = erlkVarC2.a();
        int iD = ersoVar.d();
        erlpVar.copyOnWrite();
        ((erlq) erlpVar.instance).c = iD;
        erivVar.copyOnWrite();
        eriw eriwVar = (eriw) erivVar.instance;
        erlq erlqVar = (erlq) erlpVar.build();
        erlqVar.getClass();
        eriwVar.f = erlqVar;
        eriwVar.b |= 1;
        return (eriw) erivVar.build();
    }

    public static erso b(eriw eriwVar, int i) {
        ersm ersmVar = new ersm();
        ersmVar.d(i);
        ersmVar.c(eriwVar.d);
        ersmVar.b(eriwVar.c);
        erlk erlkVarB = erlk.b(eriwVar.e);
        if (erlkVarB == null) {
            erlkVarB = erlk.UNRECOGNIZED;
        }
        ersmVar.a = d(erlkVarB);
        erlq erlqVar = eriwVar.f;
        if (erlqVar == null) {
            erlqVar = erlq.a;
        }
        erlk erlkVarB2 = erlk.b(erlqVar.b);
        if (erlkVarB2 == null) {
            erlkVarB2 = erlk.UNRECOGNIZED;
        }
        ersmVar.b = d(erlkVarB2);
        erlq erlqVar2 = eriwVar.f;
        if (erlqVar2 == null) {
            erlqVar2 = erlq.a;
        }
        ersmVar.c = Integer.valueOf(erlqVar2.c);
        return ersmVar.a();
    }

    private static erlk c(ersn ersnVar) throws GeneralSecurityException {
        if (ersn.a.equals(ersnVar)) {
            return erlk.SHA1;
        }
        if (ersn.b.equals(ersnVar)) {
            return erlk.SHA256;
        }
        if (ersn.c.equals(ersnVar)) {
            return erlk.SHA512;
        }
        throw new GeneralSecurityException("Unable to serialize HashType ".concat(String.valueOf(String.valueOf(ersnVar))));
    }

    private static ersn d(erlk erlkVar) throws GeneralSecurityException {
        int iOrdinal = erlkVar.ordinal();
        if (iOrdinal == 1) {
            return ersn.a;
        }
        if (iOrdinal == 3) {
            return ersn.b;
        }
        if (iOrdinal == 4) {
            return ersn.c;
        }
        throw new GeneralSecurityException("Unable to parse HashType: " + erlkVar.a());
    }
}
