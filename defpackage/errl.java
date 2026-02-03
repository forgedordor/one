package defpackage;

import java.security.GeneralSecurityException;
import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class errl {
    public static final erfi a;
    public static final erff b;
    public static final erei c;
    public static final eref d;
    public static final erei e;
    public static final eref f;
    public static final erdy g;
    private static final erwn h;
    private static final erwn i;

    static {
        erwn erwnVarB = ergh.b("type.googleapis.com/google.crypto.tink.Ed25519PrivateKey");
        h = erwnVarB;
        erwn erwnVarB2 = ergh.b("type.googleapis.com/google.crypto.tink.Ed25519PublicKey");
        i = erwnVarB2;
        a = new erfg(eroq.class, erfw.class, new erfh() { // from class: errf
            @Override // defpackage.erfh
            public final erga a(eqst eqstVar) {
                erfi erfiVar = errl.a;
                ermg ermgVar = (ermg) ermh.a.createBuilder();
                ermgVar.copyOnWrite();
                ((ermh) ermgVar.instance).b = "type.googleapis.com/google.crypto.tink.Ed25519PrivateKey";
                evqs byteString = erlc.a.toByteString();
                ermgVar.copyOnWrite();
                ((ermh) ermgVar.instance).c = byteString;
                ermy ermyVar = (ermy) errl.g.a(((eroq) eqstVar).a);
                ermgVar.copyOnWrite();
                ((ermh) ermgVar.instance).d = ermyVar.a();
                return erfw.b((ermh) ermgVar.build());
            }
        });
        b = new erfd(erwnVarB, erfw.class, new erfe() { // from class: errg
            @Override // defpackage.erfe
            public final eqst a(erga ergaVar) throws GeneralSecurityException {
                erfi erfiVar = errl.a;
                erfw erfwVar = (erfw) ergaVar;
                ermh ermhVar = erfwVar.b;
                if (!ermhVar.b.equals("type.googleapis.com/google.crypto.tink.Ed25519PrivateKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to Ed25519ProtoSerialization.parseParameters: ".concat(String.valueOf(erfwVar.b.b)));
                }
                try {
                    evqs evqsVar = ermhVar.c;
                    evrr evrrVar = evrr.a;
                    evuq evuqVar = evuq.a;
                    if (((erlc) evsn.parseFrom(erlc.a, evqsVar, evrr.a)).b != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    erdy erdyVar = errl.g;
                    ermy ermyVarB = ermy.b(ermhVar.d);
                    if (ermyVarB == null) {
                        ermyVarB = ermy.UNRECOGNIZED;
                    }
                    return new eroq((erop) erdyVar.b(ermyVarB));
                } catch (evtj e2) {
                    throw new GeneralSecurityException("Parsing Ed25519Parameters failed: ", e2);
                }
            }
        });
        c = new ereg(erox.class, erfv.class, new ereh() { // from class: errh
            @Override // defpackage.ereh
            public final erga a(eqsg eqsgVar) {
                erox eroxVar = (erox) eqsgVar;
                return erfv.a("type.googleapis.com/google.crypto.tink.Ed25519PublicKey", errl.a(eroxVar).toByteString(), 5, (ermy) errl.g.a(eroxVar.a.a), eroxVar.d);
            }
        });
        d = new ered(erwnVarB2, erfv.class, new eree() { // from class: erri
            @Override // defpackage.eree
            public final eqsg a(erga ergaVar) throws GeneralSecurityException {
                erfi erfiVar = errl.a;
                erfv erfvVar = (erfv) ergaVar;
                if (!erfvVar.a.equals("type.googleapis.com/google.crypto.tink.Ed25519PublicKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to Ed25519ProtoSerialization.parsePublicKey: ".concat(String.valueOf(erfvVar.a)));
                }
                try {
                    evqs evqsVar = ((erfv) ergaVar).c;
                    evrr evrrVar = evrr.a;
                    evuq evuqVar = evuq.a;
                    erlg erlgVar = (erlg) evsn.parseFrom(erlg.a, evqsVar, evrr.a);
                    if (erlgVar.b == 0) {
                        return erox.d((erop) errl.g.b(((erfv) ergaVar).d), erwn.b(erlgVar.c.I()), ((erfv) ergaVar).e);
                    }
                    throw new GeneralSecurityException("Only version 0 keys are accepted");
                } catch (evtj unused) {
                    throw new GeneralSecurityException("Parsing Ed25519PublicKey failed");
                }
            }
        });
        e = new ereg(eror.class, erfv.class, new ereh() { // from class: errj
            @Override // defpackage.ereh
            public final erga a(eqsg eqsgVar) {
                eror erorVar = (eror) eqsgVar;
                erfi erfiVar = errl.a;
                erld erldVar = (erld) erle.a.createBuilder();
                erlg erlgVarA = errl.a(erorVar.a);
                erldVar.copyOnWrite();
                erle erleVar = (erle) erldVar.instance;
                erlgVarA.getClass();
                erleVar.e = erlgVarA;
                erleVar.b |= 1;
                evqs evqsVarX = evqs.x(erorVar.b.d());
                erldVar.copyOnWrite();
                ((erle) erldVar.instance).d = evqsVarX;
                return erfv.a("type.googleapis.com/google.crypto.tink.Ed25519PrivateKey", ((erle) erldVar.build()).toByteString(), 4, (ermy) errl.g.a(erorVar.a().a), erorVar.b());
            }
        });
        f = new ered(erwnVarB, erfv.class, new eree() { // from class: errk
            @Override // defpackage.eree
            public final eqsg a(erga ergaVar) throws GeneralSecurityException {
                erfi erfiVar = errl.a;
                erfv erfvVar = (erfv) ergaVar;
                if (!erfvVar.a.equals("type.googleapis.com/google.crypto.tink.Ed25519PrivateKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to Ed25519ProtoSerialization.parsePrivateKey: ".concat(String.valueOf(erfvVar.a)));
                }
                try {
                    evqs evqsVar = ((erfv) ergaVar).c;
                    evrr evrrVar = evrr.a;
                    evuq evuqVar = evuq.a;
                    erle erleVar = (erle) evsn.parseFrom(erle.a, evqsVar, evrr.a);
                    if (erleVar.c != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    erlg erlgVar = erleVar.e;
                    if (erlgVar == null) {
                        erlgVar = erlg.a;
                    }
                    if (erlgVar.b == 0) {
                        return eror.f(erox.d((erop) errl.g.b(((erfv) ergaVar).d), erwn.b(erlgVar.c.I()), ((erfv) ergaVar).e), erwp.c(erleVar.d.I()));
                    }
                    throw new GeneralSecurityException("Only version 0 keys are accepted");
                } catch (evtj unused) {
                    throw new GeneralSecurityException("Parsing Ed25519PrivateKey failed");
                }
            }
        });
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        erdx.b(ermy.RAW, erop.d, map, map2);
        erdx.b(ermy.TINK, erop.a, map, map2);
        erdx.b(ermy.CRUNCHY, erop.b, map, map2);
        erdx.b(ermy.LEGACY, erop.c, map, map2);
        g = erdx.a(map, map2);
    }

    public static erlg a(erox eroxVar) {
        erlf erlfVar = (erlf) erlg.a.createBuilder();
        evqs evqsVarX = evqs.x(eroxVar.b.c());
        erlfVar.copyOnWrite();
        ((erlg) erlfVar.instance).c = evqsVarX;
        return (erlg) erlfVar.build();
    }
}
