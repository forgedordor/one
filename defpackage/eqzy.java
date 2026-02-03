package defpackage;

import j$.util.DesugarCollections;
import java.security.GeneralSecurityException;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eqzy {
    public static final erfi a;
    public static final erff b;
    public static final erei c;
    public static final eref d;
    private static final erwn e;
    private static final Map f;
    private static final Map g;

    static {
        erwn erwnVarB = ergh.b("type.googleapis.com/google.crypto.tink.AesSivKey");
        e = erwnVarB;
        a = new erfg(eqzk.class, erfw.class, new erfh() { // from class: eqzu
            @Override // defpackage.erfh
            public final erga a(eqst eqstVar) throws GeneralSecurityException {
                eqzk eqzkVar = (eqzk) eqstVar;
                erfi erfiVar = eqzy.a;
                ermg ermgVar = (ermg) ermh.a.createBuilder();
                ermgVar.copyOnWrite();
                ((ermh) ermgVar.instance).b = "type.googleapis.com/google.crypto.tink.AesSivKey";
                erjz erjzVar = (erjz) erka.a.createBuilder();
                int i = eqzkVar.a;
                erjzVar.copyOnWrite();
                ((erka) erjzVar.instance).b = i;
                evqs byteString = ((erka) erjzVar.build()).toByteString();
                ermgVar.copyOnWrite();
                ((ermh) ermgVar.instance).c = byteString;
                ermy ermyVarB = eqzy.b(eqzkVar.b);
                ermgVar.copyOnWrite();
                ((ermh) ermgVar.instance).d = ermyVarB.a();
                return erfw.b((ermh) ermgVar.build());
            }
        });
        b = new erfd(erwnVarB, erfw.class, new erfe() { // from class: eqzv
            @Override // defpackage.erfe
            public final eqst a(erga ergaVar) throws GeneralSecurityException {
                erfi erfiVar = eqzy.a;
                erfw erfwVar = (erfw) ergaVar;
                ermh ermhVar = erfwVar.b;
                if (!ermhVar.b.equals("type.googleapis.com/google.crypto.tink.AesSivKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to AesSivParameters.parseParameters: ".concat(String.valueOf(erfwVar.b.b)));
                }
                try {
                    evqs evqsVar = ermhVar.c;
                    evrr evrrVar = evrr.a;
                    evuq evuqVar = evuq.a;
                    erka erkaVar = (erka) evsn.parseFrom(erka.a, evqsVar, evrr.a);
                    if (erkaVar.c != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    eqzi eqziVar = new eqzi();
                    eqziVar.b(erkaVar.b);
                    ermy ermyVarB = ermy.b(ermhVar.d);
                    if (ermyVarB == null) {
                        ermyVarB = ermy.UNRECOGNIZED;
                    }
                    eqziVar.a = eqzy.a(ermyVarB);
                    return eqziVar.a();
                } catch (evtj e2) {
                    throw new GeneralSecurityException("Parsing AesSivParameters failed: ", e2);
                }
            }
        });
        c = new ereg(eqzd.class, erfv.class, new ereh() { // from class: eqzw
            @Override // defpackage.ereh
            public final erga a(eqsg eqsgVar) {
                eqzd eqzdVar = (eqzd) eqsgVar;
                erfi erfiVar = eqzy.a;
                erjx erjxVar = (erjx) erjy.a.createBuilder();
                evqs evqsVarX = evqs.x(eqzdVar.b.d());
                erjxVar.copyOnWrite();
                ((erjy) erjxVar.instance).c = evqsVarX;
                evqs byteString = ((erjy) erjxVar.build()).toByteString();
                eqzj eqzjVar = eqzdVar.a.b;
                return erfv.a("type.googleapis.com/google.crypto.tink.AesSivKey", byteString, 3, eqzy.b(eqzjVar), eqzdVar.d);
            }
        });
        d = new ered(erwnVarB, erfv.class, new eree() { // from class: eqzx
            @Override // defpackage.eree
            public final eqsg a(erga ergaVar) throws GeneralSecurityException {
                erfi erfiVar = eqzy.a;
                if (!((erfv) ergaVar).a.equals("type.googleapis.com/google.crypto.tink.AesSivKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to AesSivParameters.parseParameters");
                }
                try {
                    evqs evqsVar = ((erfv) ergaVar).c;
                    evrr evrrVar = evrr.a;
                    evuq evuqVar = evuq.a;
                    erjy erjyVar = (erjy) evsn.parseFrom(erjy.a, evqsVar, evrr.a);
                    if (erjyVar.b != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    eqzi eqziVar = new eqzi();
                    eqziVar.b(erjyVar.c.d());
                    eqziVar.a = eqzy.a(((erfv) ergaVar).d);
                    return eqzc.a(eqziVar.a(), erwp.c(erjyVar.c.I()), ((erfv) ergaVar).e);
                } catch (evtj unused) {
                    throw new GeneralSecurityException("Parsing AesSivKey failed");
                }
            }
        });
        HashMap map = new HashMap();
        map.put(eqzj.c, ermy.RAW);
        map.put(eqzj.a, ermy.TINK);
        map.put(eqzj.b, ermy.CRUNCHY);
        f = DesugarCollections.unmodifiableMap(map);
        EnumMap enumMap = new EnumMap(ermy.class);
        enumMap.put((EnumMap) ermy.RAW, (ermy) eqzj.c);
        enumMap.put((EnumMap) ermy.TINK, (ermy) eqzj.a);
        enumMap.put((EnumMap) ermy.CRUNCHY, (ermy) eqzj.b);
        enumMap.put((EnumMap) ermy.LEGACY, (ermy) eqzj.b);
        g = DesugarCollections.unmodifiableMap(enumMap);
    }

    public static eqzj a(ermy ermyVar) throws GeneralSecurityException {
        Map map = g;
        if (map.containsKey(ermyVar)) {
            return (eqzj) map.get(ermyVar);
        }
        throw new GeneralSecurityException(a.U(ermyVar, "Unable to parse OutputPrefixType: "));
    }

    public static ermy b(eqzj eqzjVar) throws GeneralSecurityException {
        Map map = f;
        if (map.containsKey(eqzjVar)) {
            return (ermy) map.get(eqzjVar);
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(String.valueOf(eqzjVar))));
    }
}
