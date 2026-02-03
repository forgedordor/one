package defpackage;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class erba {
    public static final erfi a;
    public static final erff b;
    public static final erei c;
    public static final eref d;
    public static final erei e;
    public static final eref f;
    public static final erdy g;
    private static final erwn h;
    private static final erwn i;
    private static final erdy j;
    private static final erdy k;
    private static final erdy l;

    static {
        erwn erwnVarB = ergh.b("type.googleapis.com/google.crypto.tink.HpkePrivateKey");
        h = erwnVarB;
        erwn erwnVarB2 = ergh.b("type.googleapis.com/google.crypto.tink.HpkePublicKey");
        i = erwnVarB2;
        a = new erfg(eras.class, erfw.class, new erfh() { // from class: erau
            @Override // defpackage.erfh
            public final erga a(eqst eqstVar) {
                eras erasVar = (eras) eqstVar;
                erfi erfiVar = erba.a;
                ermg ermgVar = (ermg) ermh.a.createBuilder();
                ermgVar.copyOnWrite();
                ((ermh) ermgVar.instance).b = "type.googleapis.com/google.crypto.tink.HpkePrivateKey";
                erlu erluVar = (erlu) erlv.a.createBuilder();
                erlx erlxVarB = erba.b(erasVar);
                erluVar.copyOnWrite();
                erlv erlvVar = (erlv) erluVar.instance;
                erlxVarB.getClass();
                erlvVar.c = erlxVarB;
                erlvVar.b |= 1;
                evqs byteString = ((erlv) erluVar.build()).toByteString();
                ermgVar.copyOnWrite();
                ((ermh) ermgVar.instance).c = byteString;
                ermy ermyVar = (ermy) erba.g.a(erasVar.d);
                ermgVar.copyOnWrite();
                ((ermh) ermgVar.instance).d = ermyVar.a();
                return erfw.b((ermh) ermgVar.build());
            }
        });
        b = new erfd(erwnVarB, erfw.class, new erfe() { // from class: erav
            @Override // defpackage.erfe
            public final eqst a(erga ergaVar) throws GeneralSecurityException {
                erfi erfiVar = erba.a;
                erfw erfwVar = (erfw) ergaVar;
                ermh ermhVar = erfwVar.b;
                if (!ermhVar.b.equals("type.googleapis.com/google.crypto.tink.HpkePrivateKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to HpkeProtoSerialization.parseParameters: ".concat(String.valueOf(erfwVar.b.b)));
                }
                try {
                    evqs evqsVar = ermhVar.c;
                    evrr evrrVar = evrr.a;
                    evuq evuqVar = evuq.a;
                    erlv erlvVar = (erlv) evsn.parseFrom(erlv.a, evqsVar, evrr.a);
                    ermy ermyVarB = ermy.b(erfwVar.b.d);
                    if (ermyVarB == null) {
                        ermyVarB = ermy.UNRECOGNIZED;
                    }
                    erlx erlxVar = erlvVar.c;
                    if (erlxVar == null) {
                        erlxVar = erlx.a;
                    }
                    return erba.a(ermyVarB, erlxVar);
                } catch (evtj e2) {
                    throw new GeneralSecurityException("Parsing HpkeParameters failed: ", e2);
                }
            }
        });
        c = new ereg(erbb.class, erfv.class, new ereh() { // from class: eraw
            @Override // defpackage.ereh
            public final erga a(eqsg eqsgVar) {
                erbb erbbVar = (erbb) eqsgVar;
                return erfv.a("type.googleapis.com/google.crypto.tink.HpkePublicKey", erba.c(erbbVar).toByteString(), 5, (ermy) erba.g.a(erbbVar.a.d), erbbVar.d);
            }
        });
        d = new ered(erwnVarB2, erfv.class, new eree() { // from class: erax
            @Override // defpackage.eree
            public final eqsg a(erga ergaVar) throws GeneralSecurityException {
                erfi erfiVar = erba.a;
                erfv erfvVar = (erfv) ergaVar;
                if (!erfvVar.a.equals("type.googleapis.com/google.crypto.tink.HpkePublicKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to HpkeProtoSerialization.parsePublicKey: ".concat(String.valueOf(erfvVar.a)));
                }
                try {
                    evqs evqsVar = ((erfv) ergaVar).c;
                    evrr evrrVar = evrr.a;
                    evuq evuqVar = evuq.a;
                    ermb ermbVar = (ermb) evsn.parseFrom(ermb.a, evqsVar, evrr.a);
                    if (ermbVar.c != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    ermy ermyVar = ((erfv) ergaVar).d;
                    erlx erlxVar = ermbVar.d;
                    if (erlxVar == null) {
                        erlxVar = erlx.a;
                    }
                    eras erasVarA = erba.a(ermyVar, erlxVar);
                    return erbb.c(erasVarA, erba.d(erasVarA.a, ermbVar.e.I()), ((erfv) ergaVar).e);
                } catch (evtj unused) {
                    throw new GeneralSecurityException("Parsing HpkePublicKey failed");
                }
            }
        });
        e = new ereg(erat.class, erfv.class, new ereh() { // from class: eray
            @Override // defpackage.ereh
            public final erga a(eqsg eqsgVar) {
                erat eratVar = (erat) eqsgVar;
                erfi erfiVar = erba.a;
                erly erlyVar = (erly) erlz.a.createBuilder();
                erlyVar.copyOnWrite();
                ((erlz) erlyVar.instance).c = 0;
                ermb ermbVarC = erba.c(eratVar.a);
                erlyVar.copyOnWrite();
                erlz erlzVar = (erlz) erlyVar.instance;
                ermbVarC.getClass();
                erlzVar.d = ermbVarC;
                erlzVar.b |= 1;
                evqs evqsVarX = evqs.x(eratVar.b.d());
                erlyVar.copyOnWrite();
                ((erlz) erlyVar.instance).e = evqsVarX;
                return erfv.a("type.googleapis.com/google.crypto.tink.HpkePrivateKey", ((erlz) erlyVar.build()).toByteString(), 4, (ermy) erba.g.a(eratVar.a().d), eratVar.b());
            }
        });
        f = new ered(erwnVarB, erfv.class, new eree() { // from class: eraz
            @Override // defpackage.eree
            public final eqsg a(erga ergaVar) throws GeneralSecurityException {
                erfi erfiVar = erba.a;
                erfv erfvVar = (erfv) ergaVar;
                if (!erfvVar.a.equals("type.googleapis.com/google.crypto.tink.HpkePrivateKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to HpkeProtoSerialization.parsePrivateKey: ".concat(String.valueOf(erfvVar.a)));
                }
                try {
                    evqs evqsVar = ((erfv) ergaVar).c;
                    evrr evrrVar = evrr.a;
                    evuq evuqVar = evuq.a;
                    erlz erlzVar = (erlz) evsn.parseFrom(erlz.a, evqsVar, evrr.a);
                    if (erlzVar.c != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    ermb ermbVar = erlzVar.d;
                    if (ermbVar == null) {
                        ermbVar = ermb.a;
                    }
                    if (ermbVar.c != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    ermy ermyVar = ((erfv) ergaVar).d;
                    erlx erlxVar = ermbVar.d;
                    if (erlxVar == null) {
                        erlxVar = erlx.a;
                    }
                    eras erasVarA = erba.a(ermyVar, erlxVar);
                    eraq eraqVar = erasVarA.a;
                    return erat.e(erbb.c(erasVarA, erba.d(eraqVar, ermbVar.e.I()), ((erfv) ergaVar).e), erwp.c(erdk.b(new BigInteger(1, erlzVar.e.I()), ercv.a(eraqVar))));
                } catch (evtj unused) {
                    throw new GeneralSecurityException("Parsing HpkePrivateKey failed");
                }
            }
        });
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        erdx.b(ermy.RAW, erar.c, map, map2);
        erdx.b(ermy.TINK, erar.a, map, map2);
        erdx.b(ermy.LEGACY, erar.b, map, map2);
        erdx.b(ermy.CRUNCHY, erar.b, map, map2);
        g = erdx.a(map, map2);
        HashMap map3 = new HashMap();
        HashMap map4 = new HashMap();
        erdx.b(erlt.DHKEM_P256_HKDF_SHA256, eraq.a, map3, map4);
        erdx.b(erlt.DHKEM_P384_HKDF_SHA384, eraq.b, map3, map4);
        erdx.b(erlt.DHKEM_P521_HKDF_SHA512, eraq.c, map3, map4);
        erdx.b(erlt.DHKEM_X25519_HKDF_SHA256, eraq.f, map3, map4);
        j = erdx.a(map3, map4);
        HashMap map5 = new HashMap();
        HashMap map6 = new HashMap();
        erdx.b(erls.HKDF_SHA256, erap.a, map5, map6);
        erdx.b(erls.HKDF_SHA384, erap.b, map5, map6);
        erdx.b(erls.HKDF_SHA512, erap.c, map5, map6);
        k = erdx.a(map5, map6);
        HashMap map7 = new HashMap();
        HashMap map8 = new HashMap();
        erdx.b(erlr.AES_128_GCM, eran.a, map7, map8);
        erdx.b(erlr.AES_256_GCM, eran.b, map7, map8);
        erdx.b(erlr.CHACHA20_POLY1305, eran.c, map7, map8);
        l = erdx.a(map7, map8);
    }

    public static eras a(ermy ermyVar, erlx erlxVar) {
        erar erarVar = (erar) g.b(ermyVar);
        erdy erdyVar = j;
        int i2 = erlxVar.b;
        erlr erlrVar = null;
        erlt erltVar = i2 != 0 ? i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? null : erlt.DHKEM_P521_HKDF_SHA512 : erlt.DHKEM_P384_HKDF_SHA384 : erlt.DHKEM_P256_HKDF_SHA256 : erlt.DHKEM_X25519_HKDF_SHA256 : erlt.KEM_UNKNOWN;
        if (erltVar == null) {
            erltVar = erlt.UNRECOGNIZED;
        }
        eraq eraqVar = (eraq) erdyVar.b(erltVar);
        erdy erdyVar2 = k;
        int i3 = erlxVar.c;
        erls erlsVar = i3 != 0 ? i3 != 1 ? i3 != 2 ? i3 != 3 ? null : erls.HKDF_SHA512 : erls.HKDF_SHA384 : erls.HKDF_SHA256 : erls.KDF_UNKNOWN;
        if (erlsVar == null) {
            erlsVar = erls.UNRECOGNIZED;
        }
        erap erapVar = (erap) erdyVar2.b(erlsVar);
        erdy erdyVar3 = l;
        int i4 = erlxVar.d;
        if (i4 == 0) {
            erlrVar = erlr.AEAD_UNKNOWN;
        } else if (i4 == 1) {
            erlrVar = erlr.AES_128_GCM;
        } else if (i4 == 2) {
            erlrVar = erlr.AES_256_GCM;
        } else if (i4 == 3) {
            erlrVar = erlr.CHACHA20_POLY1305;
        }
        if (erlrVar == null) {
            erlrVar = erlr.UNRECOGNIZED;
        }
        return new eras(eraqVar, erapVar, (eran) erdyVar3.b(erlrVar), erarVar);
    }

    public static erlx b(eras erasVar) {
        erlw erlwVar = (erlw) erlx.a.createBuilder();
        erlt erltVar = (erlt) j.a(erasVar.a);
        erlwVar.copyOnWrite();
        ((erlx) erlwVar.instance).b = erltVar.a();
        erls erlsVar = (erls) k.a(erasVar.b);
        erlwVar.copyOnWrite();
        ((erlx) erlwVar.instance).c = erlsVar.a();
        erlr erlrVar = (erlr) l.a(erasVar.c);
        erlwVar.copyOnWrite();
        ((erlx) erlwVar.instance).d = erlrVar.a();
        return (erlx) erlwVar.build();
    }

    public static ermb c(erbb erbbVar) {
        erma ermaVar = (erma) ermb.a.createBuilder();
        ermaVar.copyOnWrite();
        ((ermb) ermaVar.instance).c = 0;
        erlx erlxVarB = b(erbbVar.a);
        ermaVar.copyOnWrite();
        ermb ermbVar = (ermb) ermaVar.instance;
        erlxVarB.getClass();
        ermbVar.d = erlxVarB;
        ermbVar.b |= 1;
        evqs evqsVarX = evqs.x(erbbVar.b.c());
        ermaVar.copyOnWrite();
        ((ermb) ermaVar.instance).e = evqsVarX;
        return (ermb) ermaVar.build();
    }

    public static erwn d(eraq eraqVar, byte[] bArr) throws GeneralSecurityException {
        int i2;
        BigInteger bigInteger = new BigInteger(1, bArr);
        byte[] bArr2 = ercv.a;
        if (eraqVar == eraq.f) {
            i2 = 32;
        } else if (eraqVar == eraq.a) {
            i2 = 65;
        } else if (eraqVar == eraq.b) {
            i2 = 97;
        } else {
            if (eraqVar != eraq.c) {
                throw new GeneralSecurityException("Unrecognized HPKE KEM identifier");
            }
            i2 = 133;
        }
        return erwn.b(erdk.b(bigInteger, i2));
    }
}
