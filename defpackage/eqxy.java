package defpackage;

import java.security.GeneralSecurityException;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eqxy {
    public static final erfi a;
    public static final erff b;
    public static final erei c;
    public static final eref d;
    private static final erwn e;

    static {
        erwn erwnVarB = ergh.b("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key");
        e = erwnVarB;
        a = new erfg(equz.class, erfw.class, new erfh() { // from class: eqxu
            @Override // defpackage.erfh
            public final erga a(eqst eqstVar) throws GeneralSecurityException {
                erfi erfiVar = eqxy.a;
                ermg ermgVar = (ermg) ermh.a.createBuilder();
                ermgVar.copyOnWrite();
                ((ermh) ermgVar.instance).b = "type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key";
                evqs byteString = erke.a.toByteString();
                ermgVar.copyOnWrite();
                ((ermh) ermgVar.instance).c = byteString;
                ermy ermyVarB = eqxy.b(((equz) eqstVar).a);
                ermgVar.copyOnWrite();
                ((ermh) ermgVar.instance).d = ermyVarB.a();
                return erfw.b((ermh) ermgVar.build());
            }
        });
        b = new erfd(erwnVarB, erfw.class, new erfe() { // from class: eqxv
            @Override // defpackage.erfe
            public final eqst a(erga ergaVar) throws GeneralSecurityException {
                erfi erfiVar = eqxy.a;
                erfw erfwVar = (erfw) ergaVar;
                ermh ermhVar = erfwVar.b;
                if (!ermhVar.b.equals("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key")) {
                    throw new IllegalArgumentException("Wrong type URL in call to ChaCha20Poly1305ProtoSerialization.parseParameters: ".concat(String.valueOf(erfwVar.b.b)));
                }
                try {
                    evqs evqsVar = ermhVar.c;
                    evrr evrrVar = evrr.a;
                    evuq evuqVar = evuq.a;
                    ermy ermyVarB = ermy.b(erfwVar.b.d);
                    if (ermyVarB == null) {
                        ermyVarB = ermy.UNRECOGNIZED;
                    }
                    return new equz(eqxy.a(ermyVarB));
                } catch (evtj e2) {
                    throw new GeneralSecurityException("Parsing ChaCha20Poly1305Parameters failed: ", e2);
                }
            }
        });
        c = new ereg(equu.class, erfv.class, new ereh() { // from class: eqxw
            @Override // defpackage.ereh
            public final erga a(eqsg eqsgVar) {
                equu equuVar = (equu) eqsgVar;
                erfi erfiVar = eqxy.a;
                erkb erkbVar = (erkb) erkc.a.createBuilder();
                evqs evqsVarX = evqs.x(equuVar.b.d());
                erkbVar.copyOnWrite();
                ((erkc) erkbVar.instance).c = evqsVarX;
                evqs byteString = ((erkc) erkbVar.build()).toByteString();
                equy equyVar = equuVar.a.a;
                return erfv.a("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key", byteString, 3, eqxy.b(equyVar), equuVar.d);
            }
        });
        d = new ered(erwnVarB, erfv.class, new eree() { // from class: eqxx
            @Override // defpackage.eree
            public final eqsg a(erga ergaVar) throws GeneralSecurityException {
                erfi erfiVar = eqxy.a;
                if (!((erfv) ergaVar).a.equals("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key")) {
                    throw new IllegalArgumentException("Wrong type URL in call to ChaCha20Poly1305ProtoSerialization.parseKey");
                }
                try {
                    evqs evqsVar = ((erfv) ergaVar).c;
                    evrr evrrVar = evrr.a;
                    evuq evuqVar = evuq.a;
                    erkc erkcVar = (erkc) evsn.parseFrom(erkc.a, evqsVar, evrr.a);
                    if (erkcVar.b == 0) {
                        return equu.d(eqxy.a(((erfv) ergaVar).d), erwp.c(erkcVar.c.I()), ((erfv) ergaVar).e);
                    }
                    throw new GeneralSecurityException("Only version 0 keys are accepted");
                } catch (evtj unused) {
                    throw new GeneralSecurityException("Parsing ChaCha20Poly1305Key failed");
                }
            }
        });
    }

    public static equy a(ermy ermyVar) throws GeneralSecurityException {
        int iOrdinal = ermyVar.ordinal();
        if (iOrdinal == 1) {
            return equy.a;
        }
        if (iOrdinal != 2) {
            if (iOrdinal == 3) {
                return equy.c;
            }
            if (iOrdinal != 4) {
                throw new GeneralSecurityException(a.U(ermyVar, "Unable to parse OutputPrefixType: "));
            }
        }
        return equy.b;
    }

    public static ermy b(equy equyVar) throws GeneralSecurityException {
        if (equy.a.equals(equyVar)) {
            return ermy.TINK;
        }
        if (equy.b.equals(equyVar)) {
            return ermy.CRUNCHY;
        }
        if (equy.c.equals(equyVar)) {
            return ermy.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(equyVar.d));
    }
}
