package defpackage;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.spec.ECPoint;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class errc {
    public static final erfi a;
    public static final erff b;
    public static final erei c;
    public static final eref d;
    public static final erei e;
    public static final eref f;
    private static final erwn g;
    private static final erwn h;

    static {
        erwn erwnVarB = ergh.b("type.googleapis.com/google.crypto.tink.EcdsaPrivateKey");
        g = erwnVarB;
        erwn erwnVarB2 = ergh.b("type.googleapis.com/google.crypto.tink.EcdsaPublicKey");
        h = erwnVarB2;
        a = new erfg(erog.class, erfw.class, new erfh() { // from class: erqw
            @Override // defpackage.erfh
            public final erga a(eqst eqstVar) throws GeneralSecurityException {
                erog erogVar = (erog) eqstVar;
                erfi erfiVar = errc.a;
                ermg ermgVar = (ermg) ermh.a.createBuilder();
                ermgVar.copyOnWrite();
                ((ermh) ermgVar.instance).b = "type.googleapis.com/google.crypto.tink.EcdsaPrivateKey";
                erkg erkgVar = (erkg) erkh.a.createBuilder();
                erkj erkjVarB = errc.b(erogVar);
                erkgVar.copyOnWrite();
                erkh erkhVar = (erkh) erkgVar.instance;
                erkjVarB.getClass();
                erkhVar.c = erkjVarB;
                erkhVar.b |= 1;
                evqs byteString = ((erkh) erkgVar.build()).toByteString();
                ermgVar.copyOnWrite();
                ((ermh) ermgVar.instance).c = byteString;
                ermy ermyVarD = errc.d(erogVar.d);
                ermgVar.copyOnWrite();
                ((ermh) ermgVar.instance).d = ermyVarD.a();
                return erfw.b((ermh) ermgVar.build());
            }
        });
        b = new erfd(erwnVarB, erfw.class, new erfe() { // from class: erqx
            @Override // defpackage.erfe
            public final eqst a(erga ergaVar) throws GeneralSecurityException {
                erfi erfiVar = errc.a;
                erfw erfwVar = (erfw) ergaVar;
                ermh ermhVar = erfwVar.b;
                if (!ermhVar.b.equals("type.googleapis.com/google.crypto.tink.EcdsaPrivateKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to EcdsaProtoSerialization.parseParameters: ".concat(String.valueOf(erfwVar.b.b)));
                }
                try {
                    evqs evqsVar = ermhVar.c;
                    evrr evrrVar = evrr.a;
                    evuq evuqVar = evuq.a;
                    erkh erkhVar = (erkh) evsn.parseFrom(erkh.a, evqsVar, evrr.a);
                    erkj erkjVar = erkhVar.c;
                    if (erkjVar == null) {
                        erkjVar = erkj.a;
                    }
                    erlk erlkVarB = erlk.b(erkjVar.b);
                    if (erlkVarB == null) {
                        erlkVarB = erlk.UNRECOGNIZED;
                    }
                    erod erodVarF = errc.f(erlkVarB);
                    erkj erkjVar2 = erkhVar.c;
                    if (erkjVar2 == null) {
                        erkjVar2 = erkj.a;
                    }
                    int iB = erko.b(erkjVar2.d);
                    if (iB == 0) {
                        iB = 1;
                    }
                    eroe eroeVarH = errc.h(iB);
                    erkj erkjVar3 = erkhVar.c;
                    if (erkjVar3 == null) {
                        erkjVar3 = erkj.a;
                    }
                    erlh erlhVarB = erlh.b(erkjVar3.c);
                    if (erlhVarB == null) {
                        erlhVarB = erlh.UNRECOGNIZED;
                    }
                    eroc erocVarE = errc.e(erlhVarB);
                    ermy ermyVarB = ermy.b(erfwVar.b.d);
                    if (ermyVarB == null) {
                        ermyVarB = ermy.UNRECOGNIZED;
                    }
                    return erob.a(eroeVarH, erocVarE, erodVarF, errc.g(ermyVarB));
                } catch (evtj e2) {
                    throw new GeneralSecurityException("Parsing EcdsaParameters failed: ", e2);
                }
            }
        });
        c = new ereg(erok.class, erfv.class, new ereh() { // from class: erqy
            @Override // defpackage.ereh
            public final erga a(eqsg eqsgVar) {
                erok erokVar = (erok) eqsgVar;
                evqs byteString = errc.c(erokVar).toByteString();
                erof erofVar = erokVar.a.d;
                return erfv.a("type.googleapis.com/google.crypto.tink.EcdsaPublicKey", byteString, 5, errc.d(erofVar), erokVar.d);
            }
        });
        d = new ered(erwnVarB2, erfv.class, new eree() { // from class: erqz
            @Override // defpackage.eree
            public final eqsg a(erga ergaVar) throws GeneralSecurityException {
                erfi erfiVar = errc.a;
                erfv erfvVar = (erfv) ergaVar;
                if (!erfvVar.a.equals("type.googleapis.com/google.crypto.tink.EcdsaPublicKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to EcdsaProtoSerialization.parsePublicKey: ".concat(String.valueOf(erfvVar.a)));
                }
                try {
                    evqs evqsVar = ((erfv) ergaVar).c;
                    evrr evrrVar = evrr.a;
                    evuq evuqVar = evuq.a;
                    erkn erknVar = (erkn) evsn.parseFrom(erkn.a, evqsVar, evrr.a);
                    if (erknVar.c != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    erkj erkjVar = erknVar.d;
                    if (erkjVar == null) {
                        erkjVar = erkj.a;
                    }
                    erlk erlkVarB = erlk.b(erkjVar.b);
                    if (erlkVarB == null) {
                        erlkVarB = erlk.UNRECOGNIZED;
                    }
                    erod erodVarF = errc.f(erlkVarB);
                    erkj erkjVar2 = erknVar.d;
                    if (erkjVar2 == null) {
                        erkjVar2 = erkj.a;
                    }
                    int iB = erko.b(erkjVar2.d);
                    if (iB == 0) {
                        iB = 1;
                    }
                    eroe eroeVarH = errc.h(iB);
                    erkj erkjVar3 = erknVar.d;
                    if (erkjVar3 == null) {
                        erkjVar3 = erkj.a;
                    }
                    erlh erlhVarB = erlh.b(erkjVar3.c);
                    if (erlhVarB == null) {
                        erlhVarB = erlh.UNRECOGNIZED;
                    }
                    return eroj.a(erob.a(eroeVarH, errc.e(erlhVarB), erodVarF, errc.g(((erfv) ergaVar).d)), new ECPoint(new BigInteger(1, erknVar.e.I()), new BigInteger(1, erknVar.f.I())), ((erfv) ergaVar).e);
                } catch (evtj | IllegalArgumentException unused) {
                    throw new GeneralSecurityException("Parsing EcdsaPublicKey failed");
                }
            }
        });
        e = new ereg(eroi.class, erfv.class, new ereh() { // from class: erra
            @Override // defpackage.ereh
            public final erga a(eqsg eqsgVar) throws GeneralSecurityException {
                eroi eroiVar = (eroi) eqsgVar;
                erfi erfiVar = errc.a;
                int iA = errc.a(eroiVar.a().b);
                erkk erkkVar = (erkk) erkl.a.createBuilder();
                erkn erknVarC = errc.c(eroiVar.a);
                erkkVar.copyOnWrite();
                erkl erklVar = (erkl) erkkVar.instance;
                erknVarC.getClass();
                erklVar.d = erknVarC;
                erklVar.b |= 1;
                evqs evqsVarX = evqs.x(erdk.b(eroiVar.b.a, iA));
                erkkVar.copyOnWrite();
                ((erkl) erkkVar.instance).e = evqsVarX;
                return erfv.a("type.googleapis.com/google.crypto.tink.EcdsaPrivateKey", ((erkl) erkkVar.build()).toByteString(), 4, errc.d(eroiVar.a().d), eroiVar.b());
            }
        });
        f = new ered(erwnVarB, erfv.class, new eree() { // from class: errb
            @Override // defpackage.eree
            public final eqsg a(erga ergaVar) throws GeneralSecurityException {
                erfi erfiVar = errc.a;
                erfv erfvVar = (erfv) ergaVar;
                if (!erfvVar.a.equals("type.googleapis.com/google.crypto.tink.EcdsaPrivateKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to EcdsaProtoSerialization.parsePrivateKey: ".concat(String.valueOf(erfvVar.a)));
                }
                try {
                    evqs evqsVar = ((erfv) ergaVar).c;
                    evrr evrrVar = evrr.a;
                    evuq evuqVar = evuq.a;
                    erkl erklVar = (erkl) evsn.parseFrom(erkl.a, evqsVar, evrr.a);
                    if (erklVar.c != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    erkn erknVar = erklVar.d;
                    if (erknVar == null) {
                        erknVar = erkn.a;
                    }
                    if (erknVar.c != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    erkj erkjVar = erknVar.d;
                    if (erkjVar == null) {
                        erkjVar = erkj.a;
                    }
                    erlk erlkVarB = erlk.b(erkjVar.b);
                    if (erlkVarB == null) {
                        erlkVarB = erlk.UNRECOGNIZED;
                    }
                    erod erodVarF = errc.f(erlkVarB);
                    erkj erkjVar2 = erknVar.d;
                    if (erkjVar2 == null) {
                        erkjVar2 = erkj.a;
                    }
                    int iB = erko.b(erkjVar2.d);
                    if (iB == 0) {
                        iB = 1;
                    }
                    eroe eroeVarH = errc.h(iB);
                    erkj erkjVar3 = erknVar.d;
                    if (erkjVar3 == null) {
                        erkjVar3 = erkj.a;
                    }
                    erlh erlhVarB = erlh.b(erkjVar3.c);
                    if (erlhVarB == null) {
                        erlhVarB = erlh.UNRECOGNIZED;
                    }
                    return eroh.a(eroj.a(erob.a(eroeVarH, errc.e(erlhVarB), erodVarF, errc.g(((erfv) ergaVar).d)), new ECPoint(new BigInteger(1, erknVar.e.I()), new BigInteger(1, erknVar.f.I())), ((erfv) ergaVar).e), new erwo(new BigInteger(1, erklVar.e.I())));
                } catch (evtj | IllegalArgumentException unused) {
                    throw new GeneralSecurityException("Parsing EcdsaPrivateKey failed");
                }
            }
        });
    }

    public static int a(eroc erocVar) throws GeneralSecurityException {
        if (eroc.a.equals(erocVar)) {
            return 33;
        }
        if (eroc.b.equals(erocVar)) {
            return 49;
        }
        if (eroc.c.equals(erocVar)) {
            return 67;
        }
        throw new GeneralSecurityException("Unable to serialize CurveType ".concat(erocVar.d));
    }

    public static erkj b(erog erogVar) throws GeneralSecurityException {
        erlk erlkVar;
        erlh erlhVar;
        int i;
        erki erkiVar = (erki) erkj.a.createBuilder();
        erod erodVar = erogVar.c;
        if (erod.a.equals(erodVar)) {
            erlkVar = erlk.SHA256;
        } else if (erod.b.equals(erodVar)) {
            erlkVar = erlk.SHA384;
        } else {
            if (!erod.c.equals(erodVar)) {
                throw new GeneralSecurityException("Unable to serialize HashType ".concat(erodVar.d));
            }
            erlkVar = erlk.SHA512;
        }
        erkiVar.copyOnWrite();
        ((erkj) erkiVar.instance).b = erlkVar.a();
        eroc erocVar = erogVar.b;
        if (eroc.a.equals(erocVar)) {
            erlhVar = erlh.NIST_P256;
        } else if (eroc.b.equals(erocVar)) {
            erlhVar = erlh.NIST_P384;
        } else {
            if (!eroc.c.equals(erocVar)) {
                throw new GeneralSecurityException("Unable to serialize CurveType ".concat(erocVar.d));
            }
            erlhVar = erlh.NIST_P521;
        }
        erkiVar.copyOnWrite();
        ((erkj) erkiVar.instance).c = erlhVar.a();
        eroe eroeVar = erogVar.a;
        if (eroe.a.equals(eroeVar)) {
            i = 3;
        } else {
            if (!eroe.b.equals(eroeVar)) {
                throw new GeneralSecurityException("Unable to serialize SignatureEncoding ".concat(eroeVar.c));
            }
            i = 4;
        }
        erkiVar.copyOnWrite();
        ((erkj) erkiVar.instance).d = erko.a(i);
        return (erkj) erkiVar.build();
    }

    public static erkn c(erok erokVar) throws GeneralSecurityException {
        erog erogVar = erokVar.a;
        int iA = a(erogVar.b);
        erkm erkmVar = (erkm) erkn.a.createBuilder();
        erkj erkjVarB = b(erogVar);
        erkmVar.copyOnWrite();
        erkn erknVar = (erkn) erkmVar.instance;
        erkjVarB.getClass();
        erknVar.d = erkjVarB;
        erknVar.b |= 1;
        ECPoint eCPoint = erokVar.b;
        evqs evqsVarX = evqs.x(erdk.b(eCPoint.getAffineX(), iA));
        erkmVar.copyOnWrite();
        ((erkn) erkmVar.instance).e = evqsVarX;
        evqs evqsVarX2 = evqs.x(erdk.b(eCPoint.getAffineY(), iA));
        erkmVar.copyOnWrite();
        ((erkn) erkmVar.instance).f = evqsVarX2;
        return (erkn) erkmVar.build();
    }

    public static ermy d(erof erofVar) throws GeneralSecurityException {
        if (erof.a.equals(erofVar)) {
            return ermy.TINK;
        }
        if (erof.b.equals(erofVar)) {
            return ermy.CRUNCHY;
        }
        if (erof.d.equals(erofVar)) {
            return ermy.RAW;
        }
        if (erof.c.equals(erofVar)) {
            return ermy.LEGACY;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(erofVar.e));
    }

    public static eroc e(erlh erlhVar) throws GeneralSecurityException {
        int iOrdinal = erlhVar.ordinal();
        if (iOrdinal == 1) {
            return eroc.a;
        }
        if (iOrdinal == 2) {
            return eroc.b;
        }
        if (iOrdinal == 3) {
            return eroc.c;
        }
        throw new GeneralSecurityException("Unable to parse EllipticCurveType: " + erlhVar.a());
    }

    public static erod f(erlk erlkVar) throws GeneralSecurityException {
        int iOrdinal = erlkVar.ordinal();
        if (iOrdinal == 2) {
            return erod.b;
        }
        if (iOrdinal == 3) {
            return erod.a;
        }
        if (iOrdinal == 4) {
            return erod.c;
        }
        throw new GeneralSecurityException("Unable to parse HashType: " + erlkVar.a());
    }

    public static erof g(ermy ermyVar) throws GeneralSecurityException {
        int iOrdinal = ermyVar.ordinal();
        if (iOrdinal == 1) {
            return erof.a;
        }
        if (iOrdinal == 2) {
            return erof.c;
        }
        if (iOrdinal == 3) {
            return erof.d;
        }
        if (iOrdinal == 4) {
            return erof.b;
        }
        throw new GeneralSecurityException(a.U(ermyVar, "Unable to parse OutputPrefixType: "));
    }

    public static eroe h(int i) throws GeneralSecurityException {
        int i2 = i - 2;
        if (i2 == 1) {
            return eroe.a;
        }
        if (i2 == 2) {
            return eroe.b;
        }
        throw new GeneralSecurityException("Unable to parse EcdsaSignatureEncoding: " + erko.a(i));
    }
}
