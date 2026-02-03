package defpackage;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ersf {
    public static final erfi a;
    public static final erff b;
    public static final erei c;
    public static final eref d;
    public static final erei e;
    public static final eref f;
    public static final erdy g;
    public static final erdy h;
    private static final erwn i;
    private static final erwn j;

    static {
        erwn erwnVarB = ergh.b("type.googleapis.com/google.crypto.tink.RsaSsaPssPrivateKey");
        i = erwnVarB;
        erwn erwnVarB2 = ergh.b("type.googleapis.com/google.crypto.tink.RsaSsaPssPublicKey");
        j = erwnVarB2;
        a = new erfg(erqj.class, erfw.class, new erfh() { // from class: errz
            @Override // defpackage.erfh
            public final erga a(eqst eqstVar) {
                erqj erqjVar = (erqj) eqstVar;
                erfi erfiVar = ersf.a;
                ermg ermgVar = (ermg) ermh.a.createBuilder();
                ermgVar.copyOnWrite();
                ((ermh) ermgVar.instance).b = "type.googleapis.com/google.crypto.tink.RsaSsaPssPrivateKey";
                ernj ernjVar = (ernj) ernk.a.createBuilder();
                ernm ernmVarA = ersf.a(erqjVar);
                ernjVar.copyOnWrite();
                ernk ernkVar = (ernk) ernjVar.instance;
                ernmVarA.getClass();
                ernkVar.c = ernmVarA;
                ernkVar.b |= 1;
                int i2 = erqjVar.b;
                ernjVar.copyOnWrite();
                ((ernk) ernjVar.instance).d = i2;
                evqs evqsVarC = ersf.c(erqjVar.c);
                ernjVar.copyOnWrite();
                ((ernk) ernjVar.instance).e = evqsVarC;
                evqs byteString = ((ernk) ernjVar.build()).toByteString();
                ermgVar.copyOnWrite();
                ((ermh) ermgVar.instance).c = byteString;
                ermy ermyVar = (ermy) ersf.g.a(erqjVar.d);
                ermgVar.copyOnWrite();
                ((ermh) ermgVar.instance).d = ermyVar.a();
                return erfw.b((ermh) ermgVar.build());
            }
        });
        b = new erfd(erwnVarB, erfw.class, new erfe() { // from class: ersa
            @Override // defpackage.erfe
            public final eqst a(erga ergaVar) throws GeneralSecurityException {
                erfi erfiVar = ersf.a;
                erfw erfwVar = (erfw) ergaVar;
                ermh ermhVar = erfwVar.b;
                if (!ermhVar.b.equals("type.googleapis.com/google.crypto.tink.RsaSsaPssPrivateKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to RsaSsaPssProtoSerialization.parseParameters: ".concat(String.valueOf(erfwVar.b.b)));
                }
                try {
                    evqs evqsVar = ermhVar.c;
                    evrr evrrVar = evrr.a;
                    evuq evuqVar = evuq.a;
                    ernk ernkVar = (ernk) evsn.parseFrom(ernk.a, evqsVar, evrr.a);
                    BigInteger bigInteger = erqj.a;
                    erqg erqgVar = new erqg();
                    erdy erdyVar = ersf.h;
                    ernm ernmVar = ernkVar.c;
                    if (ernmVar == null) {
                        ernmVar = ernm.a;
                    }
                    erlk erlkVarB = erlk.b(ernmVar.b);
                    if (erlkVarB == null) {
                        erlkVarB = erlk.UNRECOGNIZED;
                    }
                    erqgVar.b = (erqh) erdyVar.b(erlkVarB);
                    ernm ernmVar2 = ernkVar.c;
                    if (ernmVar2 == null) {
                        ernmVar2 = ernm.a;
                    }
                    erlk erlkVarB2 = erlk.b(ernmVar2.c);
                    if (erlkVarB2 == null) {
                        erlkVarB2 = erlk.UNRECOGNIZED;
                    }
                    erqgVar.c = (erqh) erdyVar.b(erlkVarB2);
                    erqgVar.a = ersf.d(ernkVar.e);
                    erqgVar.b(ernkVar.d);
                    ernm ernmVar3 = ernkVar.c;
                    if (ernmVar3 == null) {
                        ernmVar3 = ernm.a;
                    }
                    erqgVar.c(ernmVar3.d);
                    erdy erdyVar2 = ersf.g;
                    ermy ermyVarB = ermy.b(erfwVar.b.d);
                    if (ermyVarB == null) {
                        ermyVarB = ermy.UNRECOGNIZED;
                    }
                    erqgVar.d = (erqi) erdyVar2.b(ermyVarB);
                    return erqgVar.a();
                } catch (evtj e2) {
                    throw new GeneralSecurityException("Parsing RsaSsaPssParameters failed: ", e2);
                }
            }
        });
        c = new ereg(erqn.class, erfv.class, new ereh() { // from class: ersb
            @Override // defpackage.ereh
            public final erga a(eqsg eqsgVar) {
                erqn erqnVar = (erqn) eqsgVar;
                return erfv.a("type.googleapis.com/google.crypto.tink.RsaSsaPssPublicKey", ersf.b(erqnVar).toByteString(), 5, (ermy) ersf.g.a(erqnVar.a.d), erqnVar.d);
            }
        });
        d = new ered(erwnVarB2, erfv.class, new eree() { // from class: ersc
            @Override // defpackage.eree
            public final eqsg a(erga ergaVar) throws GeneralSecurityException {
                erfi erfiVar = ersf.a;
                erfv erfvVar = (erfv) ergaVar;
                if (!erfvVar.a.equals("type.googleapis.com/google.crypto.tink.RsaSsaPssPublicKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to RsaSsaPssProtoSerialization.parsePublicKey: ".concat(String.valueOf(erfvVar.a)));
                }
                try {
                    evqs evqsVar = ((erfv) ergaVar).c;
                    evrr evrrVar = evrr.a;
                    evuq evuqVar = evuq.a;
                    ernq ernqVar = (ernq) evsn.parseFrom(ernq.a, evqsVar, evrr.a);
                    if (ernqVar.c != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    BigInteger bigIntegerD = ersf.d(ernqVar.e);
                    int iBitLength = bigIntegerD.bitLength();
                    BigInteger bigInteger = erqj.a;
                    erqg erqgVar = new erqg();
                    erdy erdyVar = ersf.h;
                    ernm ernmVar = ernqVar.d;
                    if (ernmVar == null) {
                        ernmVar = ernm.a;
                    }
                    erlk erlkVarB = erlk.b(ernmVar.b);
                    if (erlkVarB == null) {
                        erlkVarB = erlk.UNRECOGNIZED;
                    }
                    erqgVar.b = (erqh) erdyVar.b(erlkVarB);
                    ernm ernmVar2 = ernqVar.d;
                    if (ernmVar2 == null) {
                        ernmVar2 = ernm.a;
                    }
                    erlk erlkVarB2 = erlk.b(ernmVar2.c);
                    if (erlkVarB2 == null) {
                        erlkVarB2 = erlk.UNRECOGNIZED;
                    }
                    erqgVar.c = (erqh) erdyVar.b(erlkVarB2);
                    erqgVar.a = ersf.d(ernqVar.f);
                    erqgVar.b(iBitLength);
                    ernm ernmVar3 = ernqVar.d;
                    if (ernmVar3 == null) {
                        ernmVar3 = ernm.a;
                    }
                    erqgVar.c(ernmVar3.d);
                    erqgVar.d = (erqi) ersf.g.b(((erfv) ergaVar).d);
                    return erqm.a(erqgVar.a(), bigIntegerD, ((erfv) ergaVar).e);
                } catch (evtj | IllegalArgumentException unused) {
                    throw new GeneralSecurityException("Parsing RsaSsaPssPublicKey failed");
                }
            }
        });
        e = new ereg(erql.class, erfv.class, new ereh() { // from class: ersd
            @Override // defpackage.ereh
            public final erga a(eqsg eqsgVar) {
                erql erqlVar = (erql) eqsgVar;
                erfi erfiVar = ersf.a;
                ernn ernnVar = (ernn) erno.a.createBuilder();
                ernnVar.copyOnWrite();
                ((erno) ernnVar.instance).c = 0;
                ernq ernqVarB = ersf.b(erqlVar.a);
                ernnVar.copyOnWrite();
                erno ernoVar = (erno) ernnVar.instance;
                ernqVarB.getClass();
                ernoVar.d = ernqVarB;
                ernoVar.b |= 1;
                evqs evqsVarF = ersf.f(erqlVar.b);
                ernnVar.copyOnWrite();
                ((erno) ernnVar.instance).e = evqsVarF;
                evqs evqsVarF2 = ersf.f(erqlVar.c);
                ernnVar.copyOnWrite();
                ((erno) ernnVar.instance).f = evqsVarF2;
                evqs evqsVarF3 = ersf.f(erqlVar.d);
                ernnVar.copyOnWrite();
                ((erno) ernnVar.instance).g = evqsVarF3;
                evqs evqsVarF4 = ersf.f(erqlVar.e);
                ernnVar.copyOnWrite();
                ((erno) ernnVar.instance).h = evqsVarF4;
                evqs evqsVarF5 = ersf.f(erqlVar.f);
                ernnVar.copyOnWrite();
                ((erno) ernnVar.instance).i = evqsVarF5;
                evqs evqsVarF6 = ersf.f(erqlVar.g);
                ernnVar.copyOnWrite();
                ((erno) ernnVar.instance).j = evqsVarF6;
                return erfv.a("type.googleapis.com/google.crypto.tink.RsaSsaPssPrivateKey", ((erno) ernnVar.build()).toByteString(), 4, (ermy) ersf.g.a(erqlVar.a().d), erqlVar.b());
            }
        });
        f = new ered(erwnVarB, erfv.class, new eree() { // from class: erse
            @Override // defpackage.eree
            public final eqsg a(erga ergaVar) throws GeneralSecurityException {
                erfi erfiVar = ersf.a;
                erfv erfvVar = (erfv) ergaVar;
                if (!erfvVar.a.equals("type.googleapis.com/google.crypto.tink.RsaSsaPssPrivateKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to RsaSsaPssProtoSerialization.parsePrivateKey: ".concat(String.valueOf(erfvVar.a)));
                }
                try {
                    evqs evqsVar = ((erfv) ergaVar).c;
                    evrr evrrVar = evrr.a;
                    evuq evuqVar = evuq.a;
                    erno ernoVar = (erno) evsn.parseFrom(erno.a, evqsVar, evrr.a);
                    if (ernoVar.c != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    ernq ernqVar = ernoVar.d;
                    if (ernqVar == null) {
                        ernqVar = ernq.a;
                    }
                    if (ernqVar.c != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    BigInteger bigIntegerD = ersf.d(ernqVar.e);
                    int iBitLength = bigIntegerD.bitLength();
                    BigInteger bigIntegerD2 = ersf.d(ernqVar.f);
                    BigInteger bigInteger = erqj.a;
                    erqg erqgVar = new erqg();
                    erdy erdyVar = ersf.h;
                    ernm ernmVar = ernqVar.d;
                    if (ernmVar == null) {
                        ernmVar = ernm.a;
                    }
                    erlk erlkVarB = erlk.b(ernmVar.b);
                    if (erlkVarB == null) {
                        erlkVarB = erlk.UNRECOGNIZED;
                    }
                    erqgVar.b = (erqh) erdyVar.b(erlkVarB);
                    ernm ernmVar2 = ernqVar.d;
                    if (ernmVar2 == null) {
                        ernmVar2 = ernm.a;
                    }
                    erlk erlkVarB2 = erlk.b(ernmVar2.c);
                    if (erlkVarB2 == null) {
                        erlkVarB2 = erlk.UNRECOGNIZED;
                    }
                    erqgVar.c = (erqh) erdyVar.b(erlkVarB2);
                    erqgVar.a = bigIntegerD2;
                    erqgVar.b(iBitLength);
                    ernm ernmVar3 = ernqVar.d;
                    if (ernmVar3 == null) {
                        ernmVar3 = ernm.a;
                    }
                    erqgVar.c(ernmVar3.d);
                    erqgVar.d = (erqi) ersf.g.b(((erfv) ergaVar).d);
                    erqn erqnVarA = erqm.a(erqgVar.a(), bigIntegerD, ((erfv) ergaVar).e);
                    erqk erqkVar = new erqk();
                    erqkVar.a = erqnVarA;
                    erqkVar.c(ersf.e(ernoVar.f), ersf.e(ernoVar.g));
                    erqkVar.b = ersf.e(ernoVar.e);
                    erqkVar.b(ersf.e(ernoVar.h), ersf.e(ernoVar.i));
                    erqkVar.c = ersf.e(ernoVar.j);
                    return erqkVar.a();
                } catch (evtj | IllegalArgumentException unused) {
                    throw new GeneralSecurityException("Parsing RsaSsaPssPrivateKey failed");
                }
            }
        });
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        erdx.b(ermy.RAW, erqi.d, map, map2);
        erdx.b(ermy.TINK, erqi.a, map, map2);
        erdx.b(ermy.CRUNCHY, erqi.b, map, map2);
        erdx.b(ermy.LEGACY, erqi.c, map, map2);
        g = erdx.a(map, map2);
        HashMap map3 = new HashMap();
        HashMap map4 = new HashMap();
        erdx.b(erlk.SHA256, erqh.a, map3, map4);
        erdx.b(erlk.SHA384, erqh.b, map3, map4);
        erdx.b(erlk.SHA512, erqh.c, map3, map4);
        h = erdx.a(map3, map4);
    }

    public static ernm a(erqj erqjVar) {
        ernl ernlVar = (ernl) ernm.a.createBuilder();
        erdy erdyVar = h;
        erlk erlkVar = (erlk) erdyVar.a(erqjVar.e);
        ernlVar.copyOnWrite();
        ((ernm) ernlVar.instance).b = erlkVar.a();
        erlk erlkVar2 = (erlk) erdyVar.a(erqjVar.f);
        ernlVar.copyOnWrite();
        ((ernm) ernlVar.instance).c = erlkVar2.a();
        ernlVar.copyOnWrite();
        ((ernm) ernlVar.instance).d = erqjVar.g;
        return (ernm) ernlVar.build();
    }

    public static ernq b(erqn erqnVar) {
        ernp ernpVar = (ernp) ernq.a.createBuilder();
        erqj erqjVar = erqnVar.a;
        ernm ernmVarA = a(erqjVar);
        ernpVar.copyOnWrite();
        ernq ernqVar = (ernq) ernpVar.instance;
        ernmVarA.getClass();
        ernqVar.d = ernmVarA;
        ernqVar.b |= 1;
        evqs evqsVarC = c(erqnVar.b);
        ernpVar.copyOnWrite();
        ((ernq) ernpVar.instance).e = evqsVarC;
        evqs evqsVarC2 = c(erqjVar.c);
        ernpVar.copyOnWrite();
        ((ernq) ernpVar.instance).f = evqsVarC2;
        ernpVar.copyOnWrite();
        ((ernq) ernpVar.instance).c = 0;
        return (ernq) ernpVar.build();
    }

    public static evqs c(BigInteger bigInteger) {
        return evqs.x(erdk.a(bigInteger));
    }

    public static BigInteger d(evqs evqsVar) {
        return new BigInteger(1, evqsVar.I());
    }

    public static erwo e(evqs evqsVar) {
        return new erwo(new BigInteger(1, evqsVar.I()));
    }

    public static evqs f(erwo erwoVar) {
        return c(erwoVar.a);
    }
}
