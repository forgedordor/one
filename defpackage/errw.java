package defpackage;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class errw {
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
        erwn erwnVarB = ergh.b("type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PrivateKey");
        i = erwnVarB;
        erwn erwnVarB2 = ergh.b("type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PublicKey");
        j = erwnVarB2;
        a = new erfg(erpx.class, erfw.class, new erfh() { // from class: errq
            @Override // defpackage.erfh
            public final erga a(eqst eqstVar) {
                erpx erpxVar = (erpx) eqstVar;
                erfi erfiVar = errw.a;
                ermg ermgVar = (ermg) ermh.a.createBuilder();
                ermgVar.copyOnWrite();
                ((ermh) ermgVar.instance).b = "type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PrivateKey";
                ernb ernbVar = (ernb) ernc.a.createBuilder();
                erne erneVarA = errw.a(erpxVar);
                ernbVar.copyOnWrite();
                ernc erncVar = (ernc) ernbVar.instance;
                erneVarA.getClass();
                erncVar.c = erneVarA;
                erncVar.b |= 1;
                int i2 = erpxVar.b;
                ernbVar.copyOnWrite();
                ((ernc) ernbVar.instance).d = i2;
                evqs evqsVarC = errw.c(erpxVar.c);
                ernbVar.copyOnWrite();
                ((ernc) ernbVar.instance).e = evqsVarC;
                evqs byteString = ((ernc) ernbVar.build()).toByteString();
                ermgVar.copyOnWrite();
                ((ermh) ermgVar.instance).c = byteString;
                ermy ermyVar = (ermy) errw.g.a(erpxVar.d);
                ermgVar.copyOnWrite();
                ((ermh) ermgVar.instance).d = ermyVar.a();
                return erfw.b((ermh) ermgVar.build());
            }
        });
        b = new erfd(erwnVarB, erfw.class, new erfe() { // from class: errr
            @Override // defpackage.erfe
            public final eqst a(erga ergaVar) throws GeneralSecurityException {
                erfi erfiVar = errw.a;
                erfw erfwVar = (erfw) ergaVar;
                ermh ermhVar = erfwVar.b;
                if (!ermhVar.b.equals("type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PrivateKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to RsaSsaPkcs1ProtoSerialization.parseParameters: ".concat(String.valueOf(erfwVar.b.b)));
                }
                try {
                    evqs evqsVar = ermhVar.c;
                    evrr evrrVar = evrr.a;
                    evuq evuqVar = evuq.a;
                    ernc erncVar = (ernc) evsn.parseFrom(ernc.a, evqsVar, evrr.a);
                    BigInteger bigInteger = erpx.a;
                    erpu erpuVar = new erpu();
                    erdy erdyVar = errw.h;
                    erne erneVar = erncVar.c;
                    if (erneVar == null) {
                        erneVar = erne.a;
                    }
                    erlk erlkVarB = erlk.b(erneVar.b);
                    if (erlkVarB == null) {
                        erlkVarB = erlk.UNRECOGNIZED;
                    }
                    erpuVar.b = (erpv) erdyVar.b(erlkVarB);
                    erpuVar.a = errw.d(erncVar.e);
                    erpuVar.b(erncVar.d);
                    erdy erdyVar2 = errw.g;
                    ermy ermyVarB = ermy.b(erfwVar.b.d);
                    if (ermyVarB == null) {
                        ermyVarB = ermy.UNRECOGNIZED;
                    }
                    erpuVar.c = (erpw) erdyVar2.b(ermyVarB);
                    return erpuVar.a();
                } catch (evtj e2) {
                    throw new GeneralSecurityException("Parsing RsaSsaPkcs1Parameters failed: ", e2);
                }
            }
        });
        c = new ereg(erqb.class, erfv.class, new ereh() { // from class: errs
            @Override // defpackage.ereh
            public final erga a(eqsg eqsgVar) {
                erqb erqbVar = (erqb) eqsgVar;
                return erfv.a("type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PublicKey", errw.b(erqbVar).toByteString(), 5, (ermy) errw.g.a(erqbVar.a.d), erqbVar.d);
            }
        });
        d = new ered(erwnVarB2, erfv.class, new eree() { // from class: errt
            @Override // defpackage.eree
            public final eqsg a(erga ergaVar) throws GeneralSecurityException {
                erfi erfiVar = errw.a;
                erfv erfvVar = (erfv) ergaVar;
                if (!erfvVar.a.equals("type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PublicKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to RsaSsaPkcs1ProtoSerialization.parsePublicKey: ".concat(String.valueOf(erfvVar.a)));
                }
                try {
                    evqs evqsVar = ((erfv) ergaVar).c;
                    evrr evrrVar = evrr.a;
                    evuq evuqVar = evuq.a;
                    erni erniVar = (erni) evsn.parseFrom(erni.a, evqsVar, evrr.a);
                    if (erniVar.c != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    BigInteger bigIntegerD = errw.d(erniVar.e);
                    int iBitLength = bigIntegerD.bitLength();
                    BigInteger bigInteger = erpx.a;
                    erpu erpuVar = new erpu();
                    erdy erdyVar = errw.h;
                    erne erneVar = erniVar.d;
                    if (erneVar == null) {
                        erneVar = erne.a;
                    }
                    erlk erlkVarB = erlk.b(erneVar.b);
                    if (erlkVarB == null) {
                        erlkVarB = erlk.UNRECOGNIZED;
                    }
                    erpuVar.b = (erpv) erdyVar.b(erlkVarB);
                    erpuVar.a = errw.d(erniVar.f);
                    erpuVar.b(iBitLength);
                    erpuVar.c = (erpw) errw.g.b(((erfv) ergaVar).d);
                    return erqa.a(erpuVar.a(), bigIntegerD, ((erfv) ergaVar).e);
                } catch (evtj | IllegalArgumentException unused) {
                    throw new GeneralSecurityException("Parsing RsaSsaPkcs1PublicKey failed");
                }
            }
        });
        e = new ereg(erpz.class, erfv.class, new ereh() { // from class: erru
            @Override // defpackage.ereh
            public final erga a(eqsg eqsgVar) {
                erpz erpzVar = (erpz) eqsgVar;
                erfi erfiVar = errw.a;
                ernf ernfVar = (ernf) erng.a.createBuilder();
                ernfVar.copyOnWrite();
                ((erng) ernfVar.instance).c = 0;
                erni erniVarB = errw.b(erpzVar.a);
                ernfVar.copyOnWrite();
                erng erngVar = (erng) ernfVar.instance;
                erniVarB.getClass();
                erngVar.d = erniVarB;
                erngVar.b |= 1;
                evqs evqsVarF = errw.f(erpzVar.b);
                ernfVar.copyOnWrite();
                ((erng) ernfVar.instance).e = evqsVarF;
                evqs evqsVarF2 = errw.f(erpzVar.c);
                ernfVar.copyOnWrite();
                ((erng) ernfVar.instance).f = evqsVarF2;
                evqs evqsVarF3 = errw.f(erpzVar.d);
                ernfVar.copyOnWrite();
                ((erng) ernfVar.instance).g = evqsVarF3;
                evqs evqsVarF4 = errw.f(erpzVar.e);
                ernfVar.copyOnWrite();
                ((erng) ernfVar.instance).h = evqsVarF4;
                evqs evqsVarF5 = errw.f(erpzVar.f);
                ernfVar.copyOnWrite();
                ((erng) ernfVar.instance).i = evqsVarF5;
                evqs evqsVarF6 = errw.f(erpzVar.g);
                ernfVar.copyOnWrite();
                ((erng) ernfVar.instance).j = evqsVarF6;
                return erfv.a("type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PrivateKey", ((erng) ernfVar.build()).toByteString(), 4, (ermy) errw.g.a(erpzVar.a().d), erpzVar.b());
            }
        });
        f = new ered(erwnVarB, erfv.class, new eree() { // from class: errv
            @Override // defpackage.eree
            public final eqsg a(erga ergaVar) throws GeneralSecurityException {
                erfi erfiVar = errw.a;
                erfv erfvVar = (erfv) ergaVar;
                if (!erfvVar.a.equals("type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PrivateKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to RsaSsaPkcs1ProtoSerialization.parsePrivateKey: ".concat(String.valueOf(erfvVar.a)));
                }
                try {
                    evqs evqsVar = ((erfv) ergaVar).c;
                    evrr evrrVar = evrr.a;
                    evuq evuqVar = evuq.a;
                    erng erngVar = (erng) evsn.parseFrom(erng.a, evqsVar, evrr.a);
                    if (erngVar.c != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    erni erniVar = erngVar.d;
                    if (erniVar == null) {
                        erniVar = erni.a;
                    }
                    if (erniVar.c != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    BigInteger bigIntegerD = errw.d(erniVar.e);
                    int iBitLength = bigIntegerD.bitLength();
                    BigInteger bigIntegerD2 = errw.d(erniVar.f);
                    BigInteger bigInteger = erpx.a;
                    erpu erpuVar = new erpu();
                    erdy erdyVar = errw.h;
                    erne erneVar = erniVar.d;
                    if (erneVar == null) {
                        erneVar = erne.a;
                    }
                    erlk erlkVarB = erlk.b(erneVar.b);
                    if (erlkVarB == null) {
                        erlkVarB = erlk.UNRECOGNIZED;
                    }
                    erpuVar.b = (erpv) erdyVar.b(erlkVarB);
                    erpuVar.a = bigIntegerD2;
                    erpuVar.b(iBitLength);
                    erpuVar.c = (erpw) errw.g.b(((erfv) ergaVar).d);
                    erqb erqbVarA = erqa.a(erpuVar.a(), bigIntegerD, ((erfv) ergaVar).e);
                    erpy erpyVar = new erpy();
                    erpyVar.a = erqbVarA;
                    erpyVar.c(errw.e(erngVar.f), errw.e(erngVar.g));
                    erpyVar.b = errw.e(erngVar.e);
                    erpyVar.b(errw.e(erngVar.h), errw.e(erngVar.i));
                    erpyVar.c = errw.e(erngVar.j);
                    return erpyVar.a();
                } catch (evtj | IllegalArgumentException unused) {
                    throw new GeneralSecurityException("Parsing RsaSsaPkcs1PrivateKey failed");
                }
            }
        });
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        erdx.b(ermy.RAW, erpw.d, map, map2);
        erdx.b(ermy.TINK, erpw.a, map, map2);
        erdx.b(ermy.CRUNCHY, erpw.b, map, map2);
        erdx.b(ermy.LEGACY, erpw.c, map, map2);
        g = erdx.a(map, map2);
        HashMap map3 = new HashMap();
        HashMap map4 = new HashMap();
        erdx.b(erlk.SHA256, erpv.a, map3, map4);
        erdx.b(erlk.SHA384, erpv.b, map3, map4);
        erdx.b(erlk.SHA512, erpv.c, map3, map4);
        h = erdx.a(map3, map4);
    }

    public static erne a(erpx erpxVar) {
        ernd erndVar = (ernd) erne.a.createBuilder();
        erlk erlkVar = (erlk) h.a(erpxVar.e);
        erndVar.copyOnWrite();
        ((erne) erndVar.instance).b = erlkVar.a();
        return (erne) erndVar.build();
    }

    public static erni b(erqb erqbVar) {
        ernh ernhVar = (ernh) erni.a.createBuilder();
        erpx erpxVar = erqbVar.a;
        erne erneVarA = a(erpxVar);
        ernhVar.copyOnWrite();
        erni erniVar = (erni) ernhVar.instance;
        erneVarA.getClass();
        erniVar.d = erneVarA;
        erniVar.b |= 1;
        evqs evqsVarC = c(erqbVar.b);
        ernhVar.copyOnWrite();
        ((erni) ernhVar.instance).e = evqsVarC;
        evqs evqsVarC2 = c(erpxVar.c);
        ernhVar.copyOnWrite();
        ((erni) ernhVar.instance).f = evqsVarC2;
        return (erni) ernhVar.build();
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
