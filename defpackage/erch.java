package defpackage;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.spec.ECPoint;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class erch {
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
        erwn erwnVarB = ergh.b("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey");
        h = erwnVarB;
        erwn erwnVarB2 = ergh.b("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPublicKey");
        i = erwnVarB2;
        a = new erfg(erak.class, erfw.class, new erfh() { // from class: ercb
            @Override // defpackage.erfh
            public final erga a(eqst eqstVar) throws GeneralSecurityException {
                erak erakVar = (erak) eqstVar;
                erfi erfiVar = erch.a;
                ermg ermgVar = (ermg) ermh.a.createBuilder();
                ermgVar.copyOnWrite();
                ((ermh) ermgVar.instance).b = "type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey";
                erkr erkrVar = (erkr) erks.a.createBuilder();
                erku erkuVarC = erch.c(erakVar);
                erkrVar.copyOnWrite();
                erks erksVar = (erks) erkrVar.instance;
                erkuVarC.getClass();
                erksVar.c = erkuVarC;
                erksVar.b |= 1;
                evqs byteString = ((erks) erkrVar.build()).toByteString();
                ermgVar.copyOnWrite();
                ((ermh) ermgVar.instance).c = byteString;
                ermy ermyVar = (ermy) erch.g.a(erakVar.e);
                ermgVar.copyOnWrite();
                ((ermh) ermgVar.instance).d = ermyVar.a();
                return erfw.b((ermh) ermgVar.build());
            }
        });
        b = new erfd(erwnVarB, erfw.class, new erfe() { // from class: ercc
            @Override // defpackage.erfe
            public final eqst a(erga ergaVar) throws GeneralSecurityException {
                erfi erfiVar = erch.a;
                erfw erfwVar = (erfw) ergaVar;
                ermh ermhVar = erfwVar.b;
                if (!ermhVar.b.equals("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to EciesProtoSerialization.parseParameters: ".concat(String.valueOf(erfwVar.b.b)));
                }
                try {
                    evqs evqsVar = ermhVar.c;
                    evrr evrrVar = evrr.a;
                    evuq evuqVar = evuq.a;
                    erks erksVar = (erks) evsn.parseFrom(erks.a, evqsVar, evrr.a);
                    ermy ermyVarB = ermy.b(erfwVar.b.d);
                    if (ermyVarB == null) {
                        ermyVarB = ermy.UNRECOGNIZED;
                    }
                    erku erkuVar = erksVar.c;
                    if (erkuVar == null) {
                        erkuVar = erku.a;
                    }
                    return erch.b(ermyVarB, erkuVar);
                } catch (evtj e2) {
                    throw new GeneralSecurityException("Parsing EciesParameters failed: ", e2);
                }
            }
        });
        c = new ereg(eram.class, erfv.class, new ereh() { // from class: ercd
            @Override // defpackage.ereh
            public final erga a(eqsg eqsgVar) {
                eram eramVar = (eram) eqsgVar;
                return erfv.a("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPublicKey", erch.d(eramVar).toByteString(), 5, (ermy) erch.g.a(eramVar.a.e), eramVar.e);
            }
        });
        d = new ered(erwnVarB2, erfv.class, new eree() { // from class: erce
            @Override // defpackage.eree
            public final eqsg a(erga ergaVar) throws GeneralSecurityException {
                erfi erfiVar = erch.a;
                erfv erfvVar = (erfv) ergaVar;
                if (!erfvVar.a.equals("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPublicKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to EciesProtoSerialization.parsePublicKey: ".concat(String.valueOf(erfvVar.a)));
                }
                try {
                    evqs evqsVar = ((erfv) ergaVar).c;
                    evrr evrrVar = evrr.a;
                    evuq evuqVar = evuq.a;
                    erky erkyVar = (erky) evsn.parseFrom(erky.a, evqsVar, evrr.a);
                    if (erkyVar.c != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    ermy ermyVar = ((erfv) ergaVar).d;
                    erku erkuVar = erkyVar.d;
                    if (erkuVar == null) {
                        erkuVar = erku.a;
                    }
                    erak erakVarB = erch.b(ermyVar, erkuVar);
                    if (!erakVarB.b.equals(erag.d)) {
                        return eram.d(erakVarB, new ECPoint(new BigInteger(1, erkyVar.e.I()), new BigInteger(1, erkyVar.f.I())), ((erfv) ergaVar).e);
                    }
                    if (erkyVar.f.H()) {
                        return eram.c(erakVarB, erwn.b(erkyVar.e.I()), ((erfv) ergaVar).e);
                    }
                    throw new GeneralSecurityException("Y must be empty for X25519 points");
                } catch (evtj | IllegalArgumentException unused) {
                    throw new GeneralSecurityException("Parsing EcdsaPublicKey failed");
                }
            }
        });
        e = new ereg(eral.class, erfv.class, new ereh() { // from class: ercf
            @Override // defpackage.ereh
            public final erga a(eqsg eqsgVar) throws GeneralSecurityException {
                eral eralVar = (eral) eqsgVar;
                erfi erfiVar = erch.a;
                erkv erkvVar = (erkv) erkw.a.createBuilder();
                erkvVar.copyOnWrite();
                ((erkw) erkvVar.instance).c = 0;
                erky erkyVarD = erch.d(eralVar.a);
                erkvVar.copyOnWrite();
                erkw erkwVar = (erkw) erkvVar.instance;
                erkyVarD.getClass();
                erkwVar.d = erkyVarD;
                erkwVar.b |= 1;
                if (eralVar.a().b.equals(erag.d)) {
                    evqs evqsVarX = evqs.x(eralVar.c.d());
                    erkvVar.copyOnWrite();
                    ((erkw) erkvVar.instance).e = evqsVarX;
                } else {
                    evqs evqsVarX2 = evqs.x(erdk.b(eralVar.b.a, erch.a(eralVar.a().b)));
                    erkvVar.copyOnWrite();
                    ((erkw) erkvVar.instance).e = evqsVarX2;
                }
                return erfv.a("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey", ((erkw) erkvVar.build()).toByteString(), 4, (ermy) erch.g.a(eralVar.a().e), eralVar.b());
            }
        });
        f = new ered(erwnVarB, erfv.class, new eree() { // from class: ercg
            @Override // defpackage.eree
            public final eqsg a(erga ergaVar) throws GeneralSecurityException {
                erfi erfiVar = erch.a;
                erfv erfvVar = (erfv) ergaVar;
                if (!erfvVar.a.equals("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to EciesProtoSerialization.parsePrivateKey: ".concat(String.valueOf(erfvVar.a)));
                }
                try {
                    evqs evqsVar = ((erfv) ergaVar).c;
                    evrr evrrVar = evrr.a;
                    evuq evuqVar = evuq.a;
                    erkw erkwVar = (erkw) evsn.parseFrom(erkw.a, evqsVar, evrr.a);
                    if (erkwVar.c != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    erky erkyVar = erkwVar.d;
                    if (erkyVar == null) {
                        erkyVar = erky.a;
                    }
                    if (erkyVar.c != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    ermy ermyVar = ((erfv) ergaVar).d;
                    erku erkuVar = erkyVar.d;
                    if (erkuVar == null) {
                        erkuVar = erku.a;
                    }
                    erak erakVarB = erch.b(ermyVar, erkuVar);
                    if (!erakVarB.b.equals(erag.d)) {
                        return eral.e(eram.d(erakVarB, new ECPoint(new BigInteger(1, erkyVar.e.I()), new BigInteger(1, erkyVar.f.I())), ((erfv) ergaVar).e), new erwo(new BigInteger(1, erkwVar.e.I())));
                    }
                    eram eramVarC = eram.c(erakVarB, erwn.b(erkyVar.e.I()), ((erfv) ergaVar).e);
                    erwp erwpVarC = erwp.c(erkwVar.e.I());
                    erwn erwnVar = eramVarC.c;
                    if (erwnVar == null) {
                        throw new GeneralSecurityException("ECIES private key for X25519 curve cannot be constructed with NIST-curve public key");
                    }
                    byte[] bArrD = erwpVarC.d();
                    byte[] bArrC = erwnVar.c();
                    if (bArrD.length != 32) {
                        throw new GeneralSecurityException("Private key bytes length for X25519 curve must be 32");
                    }
                    if (Arrays.equals(erwl.c(bArrD), bArrC)) {
                        return new eral(eramVarC, null, erwpVarC);
                    }
                    throw new GeneralSecurityException("Invalid private key for public key.");
                } catch (evtj | IllegalArgumentException unused) {
                    throw new GeneralSecurityException("Parsing EcdsaPrivateKey failed");
                }
            }
        });
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        erdx.b(ermy.RAW, eraj.c, map, map2);
        erdx.b(ermy.TINK, eraj.a, map, map2);
        erdx.b(ermy.LEGACY, eraj.b, map, map2);
        erdx.b(ermy.CRUNCHY, eraj.b, map, map2);
        g = erdx.a(map, map2);
        HashMap map3 = new HashMap();
        HashMap map4 = new HashMap();
        erdx.b(erlk.SHA1, erah.a, map3, map4);
        erdx.b(erlk.SHA224, erah.b, map3, map4);
        erdx.b(erlk.SHA256, erah.c, map3, map4);
        erdx.b(erlk.SHA384, erah.d, map3, map4);
        erdx.b(erlk.SHA512, erah.e, map3, map4);
        j = erdx.a(map3, map4);
        HashMap map5 = new HashMap();
        HashMap map6 = new HashMap();
        erdx.b(erlh.NIST_P256, erag.a, map5, map6);
        erdx.b(erlh.NIST_P384, erag.b, map5, map6);
        erdx.b(erlh.NIST_P521, erag.c, map5, map6);
        erdx.b(erlh.CURVE25519, erag.d, map5, map6);
        k = erdx.a(map5, map6);
        HashMap map7 = new HashMap();
        HashMap map8 = new HashMap();
        erdx.b(erkf.UNCOMPRESSED, erai.b, map7, map8);
        erdx.b(erkf.COMPRESSED, erai.a, map7, map8);
        erdx.b(erkf.DO_NOT_USE_CRUNCHY_UNCOMPRESSED, erai.c, map7, map8);
        l = erdx.a(map7, map8);
    }

    public static int a(erag eragVar) throws GeneralSecurityException {
        if (erag.a.equals(eragVar)) {
            return 33;
        }
        if (erag.b.equals(eragVar)) {
            return 49;
        }
        if (erag.c.equals(eragVar)) {
            return 67;
        }
        throw new GeneralSecurityException("Unable to serialize CurveType ".concat(String.valueOf(String.valueOf(eragVar))));
    }

    public static erak b(ermy ermyVar, erku erkuVar) throws GeneralSecurityException {
        ermh ermhVar = ermh.a;
        ermg ermgVar = (ermg) ermhVar.createBuilder();
        erkq erkqVar = erkuVar.d;
        if (erkqVar == null) {
            erkqVar = erkq.a;
        }
        ermh ermhVar2 = erkqVar.c;
        if (ermhVar2 == null) {
            ermhVar2 = ermhVar;
        }
        String str = ermhVar2.b;
        ermgVar.copyOnWrite();
        ermh ermhVar3 = (ermh) ermgVar.instance;
        str.getClass();
        ermhVar3.b = str;
        ermy ermyVar2 = ermy.RAW;
        ermgVar.copyOnWrite();
        ((ermh) ermgVar.instance).d = ermyVar2.a();
        erkq erkqVar2 = erkuVar.d;
        if (erkqVar2 == null) {
            erkqVar2 = erkq.a;
        }
        ermh ermhVar4 = erkqVar2.c;
        if (ermhVar4 != null) {
            ermhVar = ermhVar4;
        }
        evqs evqsVar = ermhVar.c;
        ermgVar.copyOnWrite();
        ermh ermhVar5 = (ermh) ermgVar.instance;
        evqsVar.getClass();
        ermhVar5.c = evqsVar;
        ermh ermhVar6 = (ermh) ermgVar.build();
        Set set = erak.a;
        eraf erafVar = new eraf();
        erafVar.d = (eraj) g.b(ermyVar);
        erdy erdyVar = k;
        erla erlaVar = erkuVar.c;
        if (erlaVar == null) {
            erlaVar = erla.a;
        }
        erlh erlhVarB = erlh.b(erlaVar.b);
        if (erlhVarB == null) {
            erlhVarB = erlh.UNRECOGNIZED;
        }
        erafVar.a = (erag) erdyVar.b(erlhVarB);
        erdy erdyVar2 = j;
        erla erlaVar2 = erkuVar.c;
        if (erlaVar2 == null) {
            erlaVar2 = erla.a;
        }
        erlk erlkVarB = erlk.b(erlaVar2.c);
        if (erlkVarB == null) {
            erlkVarB = erlk.UNRECOGNIZED;
        }
        erafVar.b = (erah) erdyVar2.b(erlkVarB);
        erafVar.b(eqta.a(ermhVar6.toByteArray()));
        erla erlaVar3 = erkuVar.c;
        if (erlaVar3 == null) {
            erlaVar3 = erla.a;
        }
        erwn erwnVarB = erwn.b(erlaVar3.d.I());
        if (erwnVarB.a() == 0) {
            erafVar.e = null;
        } else {
            erafVar.e = erwnVarB;
        }
        erla erlaVar4 = erkuVar.c;
        if (erlaVar4 == null) {
            erlaVar4 = erla.a;
        }
        erlh erlhVarB2 = erlh.b(erlaVar4.b);
        if (erlhVarB2 == null) {
            erlhVarB2 = erlh.UNRECOGNIZED;
        }
        if (erlhVarB2.equals(erlh.CURVE25519)) {
            erkf erkfVarB = erkf.b(erkuVar.e);
            if (erkfVarB == null) {
                erkfVarB = erkf.UNRECOGNIZED;
            }
            if (!erkfVarB.equals(erkf.COMPRESSED)) {
                throw new GeneralSecurityException("For CURVE25519 EcPointFormat must be compressed");
            }
        } else {
            erdy erdyVar3 = l;
            erkf erkfVarB2 = erkf.b(erkuVar.e);
            if (erkfVarB2 == null) {
                erkfVarB2 = erkf.UNRECOGNIZED;
            }
            erafVar.c = (erai) erdyVar3.b(erkfVarB2);
        }
        return erafVar.a();
    }

    public static erku c(erak erakVar) throws GeneralSecurityException {
        erkz erkzVar = (erkz) erla.a.createBuilder();
        erlh erlhVar = (erlh) k.a(erakVar.b);
        erkzVar.copyOnWrite();
        ((erla) erkzVar.instance).b = erlhVar.a();
        erlk erlkVar = (erlk) j.a(erakVar.c);
        erkzVar.copyOnWrite();
        ((erla) erkzVar.instance).c = erlkVar.a();
        erwn erwnVar = erakVar.g;
        if (erwnVar != null && erwnVar.a() > 0) {
            evqs evqsVarX = evqs.x(erwnVar.c());
            erkzVar.copyOnWrite();
            ((erla) erkzVar.instance).d = evqsVarX;
        }
        erla erlaVar = (erla) erkzVar.build();
        try {
            byte[] bArrB = eqta.b(erakVar.f);
            evrr evrrVar = evrr.a;
            evuq evuqVar = evuq.a;
            evrr evrrVar2 = evrr.a;
            ermh ermhVar = ermh.a;
            ermh ermhVar2 = (ermh) evsn.parseFrom(ermhVar, bArrB, evrrVar2);
            erkp erkpVar = (erkp) erkq.a.createBuilder();
            ermg ermgVar = (ermg) ermhVar.createBuilder();
            String str = ermhVar2.b;
            ermgVar.copyOnWrite();
            ermh ermhVar3 = (ermh) ermgVar.instance;
            str.getClass();
            ermhVar3.b = str;
            ermy ermyVar = ermy.TINK;
            ermgVar.copyOnWrite();
            ((ermh) ermgVar.instance).d = ermyVar.a();
            evqs evqsVar = ermhVar2.c;
            ermgVar.copyOnWrite();
            ermh ermhVar4 = (ermh) ermgVar.instance;
            evqsVar.getClass();
            ermhVar4.c = evqsVar;
            ermh ermhVar5 = (ermh) ermgVar.build();
            erkpVar.copyOnWrite();
            erkq erkqVar = (erkq) erkpVar.instance;
            ermhVar5.getClass();
            erkqVar.c = ermhVar5;
            erkqVar.b |= 1;
            erkq erkqVar2 = (erkq) erkpVar.build();
            erai eraiVar = erakVar.d;
            if (eraiVar == null) {
                eraiVar = erai.a;
            }
            erkt erktVar = (erkt) erku.a.createBuilder();
            erktVar.copyOnWrite();
            erku erkuVar = (erku) erktVar.instance;
            erlaVar.getClass();
            erkuVar.c = erlaVar;
            erkuVar.b |= 1;
            erktVar.copyOnWrite();
            erku erkuVar2 = (erku) erktVar.instance;
            erkqVar2.getClass();
            erkuVar2.d = erkqVar2;
            erkuVar2.b |= 2;
            erkf erkfVar = (erkf) l.a(eraiVar);
            erktVar.copyOnWrite();
            ((erku) erktVar.instance).e = erkfVar.a();
            return (erku) erktVar.build();
        } catch (evtj e2) {
            throw new GeneralSecurityException("Parsing EciesParameters failed: ", e2);
        }
    }

    public static erky d(eram eramVar) throws GeneralSecurityException {
        erak erakVar = eramVar.a;
        erag eragVar = erakVar.b;
        if (eragVar.equals(erag.d)) {
            erkx erkxVar = (erkx) erky.a.createBuilder();
            erkxVar.copyOnWrite();
            ((erky) erkxVar.instance).c = 0;
            erku erkuVarC = c(erakVar);
            erkxVar.copyOnWrite();
            erky erkyVar = (erky) erkxVar.instance;
            erkuVarC.getClass();
            erkyVar.d = erkuVarC;
            erkyVar.b |= 1;
            evqs evqsVarX = evqs.x(eramVar.c.c());
            erkxVar.copyOnWrite();
            ((erky) erkxVar.instance).e = evqsVarX;
            evqs evqsVar = evqs.b;
            erkxVar.copyOnWrite();
            erky erkyVar2 = (erky) erkxVar.instance;
            evqsVar.getClass();
            erkyVar2.f = evqsVar;
            return (erky) erkxVar.build();
        }
        int iA = a(eragVar);
        ECPoint eCPoint = eramVar.b;
        if (eCPoint == null) {
            throw new GeneralSecurityException("NistCurvePoint was null for NIST curve");
        }
        erkx erkxVar2 = (erkx) erky.a.createBuilder();
        erkxVar2.copyOnWrite();
        ((erky) erkxVar2.instance).c = 0;
        erku erkuVarC2 = c(erakVar);
        erkxVar2.copyOnWrite();
        erky erkyVar3 = (erky) erkxVar2.instance;
        erkuVarC2.getClass();
        erkyVar3.d = erkuVarC2;
        erkyVar3.b |= 1;
        evqs evqsVarX2 = evqs.x(erdk.b(eCPoint.getAffineX(), iA));
        erkxVar2.copyOnWrite();
        ((erky) erkxVar2.instance).e = evqsVarX2;
        evqs evqsVarX3 = evqs.x(erdk.b(eCPoint.getAffineY(), iA));
        erkxVar2.copyOnWrite();
        ((erky) erkxVar2.instance).f = evqsVarX3;
        return (erky) erkxVar2.build();
    }
}
