package defpackage;

import java.security.GeneralSecurityException;
import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class erie {
    public static final erdy a;
    public static final erdy b;
    public static final erfi c;
    public static final erff d;
    public static final erei e;
    public static final eref f;
    private static final erwn g;

    static {
        erwn erwnVarB = ergh.b("type.googleapis.com/google.crypto.tink.HmacKey");
        g = erwnVarB;
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        erdx.b(ermy.RAW, erhd.d, map, map2);
        erdx.b(ermy.TINK, erhd.a, map, map2);
        erdx.b(ermy.LEGACY, erhd.c, map, map2);
        erdx.b(ermy.CRUNCHY, erhd.b, map, map2);
        a = erdx.a(map, map2);
        HashMap map3 = new HashMap();
        HashMap map4 = new HashMap();
        erdx.b(erlk.SHA1, erhc.a, map3, map4);
        erdx.b(erlk.SHA224, erhc.b, map3, map4);
        erdx.b(erlk.SHA256, erhc.c, map3, map4);
        erdx.b(erlk.SHA384, erhc.d, map3, map4);
        erdx.b(erlk.SHA512, erhc.e, map3, map4);
        b = erdx.a(map3, map4);
        c = new erfg(erhe.class, erfw.class, new erfh() { // from class: eria
            @Override // defpackage.erfh
            public final erga a(eqst eqstVar) {
                erhe erheVar = (erhe) eqstVar;
                erdy erdyVar = erie.a;
                ermg ermgVar = (ermg) ermh.a.createBuilder();
                ermgVar.copyOnWrite();
                ((ermh) ermgVar.instance).b = "type.googleapis.com/google.crypto.tink.HmacKey";
                erln erlnVar = (erln) erlo.a.createBuilder();
                erlq erlqVarA = erie.a(erheVar);
                erlnVar.copyOnWrite();
                erlo erloVar = (erlo) erlnVar.instance;
                erlqVarA.getClass();
                erloVar.c = erlqVarA;
                erloVar.b |= 1;
                int i = erheVar.a;
                erlnVar.copyOnWrite();
                ((erlo) erlnVar.instance).d = i;
                evqs byteString = ((erlo) erlnVar.build()).toByteString();
                ermgVar.copyOnWrite();
                ((ermh) ermgVar.instance).c = byteString;
                ermy ermyVar = (ermy) erie.a.a(erheVar.c);
                ermgVar.copyOnWrite();
                ((ermh) ermgVar.instance).d = ermyVar.a();
                return erfw.b((ermh) ermgVar.build());
            }
        });
        d = new erfd(erwnVarB, erfw.class, new erfe() { // from class: erib
            @Override // defpackage.erfe
            public final eqst a(erga ergaVar) throws GeneralSecurityException {
                erdy erdyVar = erie.a;
                erfw erfwVar = (erfw) ergaVar;
                ermh ermhVar = erfwVar.b;
                if (!ermhVar.b.equals("type.googleapis.com/google.crypto.tink.HmacKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to HmacProtoSerialization.parseParameters: ".concat(String.valueOf(erfwVar.b.b)));
                }
                try {
                    evqs evqsVar = ermhVar.c;
                    evrr evrrVar = evrr.a;
                    evuq evuqVar = evuq.a;
                    erlo erloVar = (erlo) evsn.parseFrom(erlo.a, evqsVar, evrr.a);
                    if (erloVar.e != 0) {
                        throw new GeneralSecurityException("Parsing HmacParameters failed: unknown Version " + erloVar.e);
                    }
                    erhb erhbVar = new erhb();
                    erhbVar.b(erloVar.d);
                    erlq erlqVar = erloVar.c;
                    if (erlqVar == null) {
                        erlqVar = erlq.a;
                    }
                    erhbVar.c(erlqVar.c);
                    erdy erdyVar2 = erie.b;
                    erlq erlqVar2 = erloVar.c;
                    if (erlqVar2 == null) {
                        erlqVar2 = erlq.a;
                    }
                    erlk erlkVarB = erlk.b(erlqVar2.b);
                    if (erlkVarB == null) {
                        erlkVarB = erlk.UNRECOGNIZED;
                    }
                    erhbVar.a = (erhc) erdyVar2.b(erlkVarB);
                    erdy erdyVar3 = erie.a;
                    ermy ermyVarB = ermy.b(erfwVar.b.d);
                    if (ermyVarB == null) {
                        ermyVarB = ermy.UNRECOGNIZED;
                    }
                    erhbVar.b = (erhd) erdyVar3.b(ermyVarB);
                    return erhbVar.a();
                } catch (evtj e2) {
                    throw new GeneralSecurityException("Parsing HmacParameters failed: ", e2);
                }
            }
        });
        e = new ereg(ergv.class, erfv.class, new ereh() { // from class: eric
            @Override // defpackage.ereh
            public final erga a(eqsg eqsgVar) {
                ergv ergvVar = (ergv) eqsgVar;
                erdy erdyVar = erie.a;
                erll erllVar = (erll) erlm.a.createBuilder();
                erhe erheVar = ergvVar.a;
                erlq erlqVarA = erie.a(erheVar);
                erllVar.copyOnWrite();
                erlm erlmVar = (erlm) erllVar.instance;
                erlqVarA.getClass();
                erlmVar.d = erlqVarA;
                erlmVar.b |= 1;
                evqs evqsVarX = evqs.x(ergvVar.b.d());
                erllVar.copyOnWrite();
                ((erlm) erllVar.instance).e = evqsVarX;
                return erfv.a("type.googleapis.com/google.crypto.tink.HmacKey", ((erlm) erllVar.build()).toByteString(), 3, (ermy) erie.a.a(erheVar.c), ergvVar.d);
            }
        });
        f = new ered(erwnVarB, erfv.class, new eree() { // from class: erid
            @Override // defpackage.eree
            public final eqsg a(erga ergaVar) throws GeneralSecurityException {
                erdy erdyVar = erie.a;
                if (!((erfv) ergaVar).a.equals("type.googleapis.com/google.crypto.tink.HmacKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to HmacProtoSerialization.parseKey");
                }
                try {
                    evqs evqsVar = ((erfv) ergaVar).c;
                    evrr evrrVar = evrr.a;
                    evuq evuqVar = evuq.a;
                    erlm erlmVar = (erlm) evsn.parseFrom(erlm.a, evqsVar, evrr.a);
                    if (erlmVar.c != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    erhb erhbVar = new erhb();
                    erhbVar.b(erlmVar.e.d());
                    erlq erlqVar = erlmVar.d;
                    if (erlqVar == null) {
                        erlqVar = erlq.a;
                    }
                    erhbVar.c(erlqVar.c);
                    erdy erdyVar2 = erie.b;
                    erlq erlqVar2 = erlmVar.d;
                    if (erlqVar2 == null) {
                        erlqVar2 = erlq.a;
                    }
                    erlk erlkVarB = erlk.b(erlqVar2.b);
                    if (erlkVarB == null) {
                        erlkVarB = erlk.UNRECOGNIZED;
                    }
                    erhbVar.a = (erhc) erdyVar2.b(erlkVarB);
                    erhbVar.b = (erhd) erie.a.b(((erfv) ergaVar).d);
                    return ergu.a(erhbVar.a(), erwp.c(erlmVar.e.I()), ((erfv) ergaVar).e);
                } catch (evtj | IllegalArgumentException unused) {
                    throw new GeneralSecurityException("Parsing HmacKey failed");
                }
            }
        });
    }

    public static erlq a(erhe erheVar) {
        erlp erlpVar = (erlp) erlq.a.createBuilder();
        erlpVar.copyOnWrite();
        ((erlq) erlpVar.instance).c = erheVar.b;
        erlk erlkVar = (erlk) b.a(erheVar.d);
        erlpVar.copyOnWrite();
        ((erlq) erlpVar.instance).b = erlkVar.a();
        return (erlq) erlpVar.build();
    }
}
