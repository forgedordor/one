package defpackage;

import java.security.GeneralSecurityException;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eqvo {
    public static final erfi a;
    public static final erff b;
    public static final erei c;
    public static final eref d;
    private static final erwn e;

    static {
        erwn erwnVarB = ergh.b("type.googleapis.com/google.crypto.tink.KmsAeadKey");
        e = erwnVarB;
        a = new erfg(eqvj.class, erfw.class, new erfh() { // from class: eqvk
            @Override // defpackage.erfh
            public final erga a(eqst eqstVar) throws GeneralSecurityException {
                eqvj eqvjVar = (eqvj) eqstVar;
                erfi erfiVar = eqvo.a;
                ermg ermgVar = (ermg) ermh.a.createBuilder();
                ermgVar.copyOnWrite();
                ((ermh) ermgVar.instance).b = "type.googleapis.com/google.crypto.tink.KmsAeadKey";
                erms ermsVar = (erms) ermt.a.createBuilder();
                String str = eqvjVar.a;
                ermsVar.copyOnWrite();
                ermt ermtVar = (ermt) ermsVar.instance;
                str.getClass();
                ermtVar.b = str;
                evqs byteString = ((ermt) ermsVar.build()).toByteString();
                ermgVar.copyOnWrite();
                ((ermh) ermgVar.instance).c = byteString;
                ermy ermyVarB = eqvo.b(eqvjVar.b);
                ermgVar.copyOnWrite();
                ((ermh) ermgVar.instance).d = ermyVarB.a();
                return erfw.b((ermh) ermgVar.build());
            }
        });
        b = new erfd(erwnVarB, erfw.class, new erfe() { // from class: eqvl
            @Override // defpackage.erfe
            public final eqst a(erga ergaVar) throws GeneralSecurityException {
                erfi erfiVar = eqvo.a;
                erfw erfwVar = (erfw) ergaVar;
                ermh ermhVar = erfwVar.b;
                if (!ermhVar.b.equals("type.googleapis.com/google.crypto.tink.KmsAeadKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to LegacyKmsAeadProtoSerialization.parseParameters: ".concat(String.valueOf(erfwVar.b.b)));
                }
                try {
                    evqs evqsVar = ermhVar.c;
                    evrr evrrVar = evrr.a;
                    evuq evuqVar = evuq.a;
                    String str = ((ermt) evsn.parseFrom(ermt.a, evqsVar, evrr.a)).b;
                    ermy ermyVarB = ermy.b(erfwVar.b.d);
                    if (ermyVarB == null) {
                        ermyVarB = ermy.UNRECOGNIZED;
                    }
                    return new eqvj(str, eqvo.a(ermyVarB));
                } catch (evtj e2) {
                    throw new GeneralSecurityException("Parsing KmsAeadKeyFormat failed: ", e2);
                }
            }
        });
        c = new ereg(eqvh.class, erfv.class, new ereh() { // from class: eqvm
            @Override // defpackage.ereh
            public final erga a(eqsg eqsgVar) {
                eqvh eqvhVar = (eqvh) eqsgVar;
                erfi erfiVar = eqvo.a;
                ermq ermqVar = (ermq) ermr.a.createBuilder();
                erms ermsVar = (erms) ermt.a.createBuilder();
                eqvj eqvjVar = eqvhVar.a;
                String str = eqvjVar.a;
                ermsVar.copyOnWrite();
                ermt ermtVar = (ermt) ermsVar.instance;
                str.getClass();
                ermtVar.b = str;
                ermt ermtVar2 = (ermt) ermsVar.build();
                ermqVar.copyOnWrite();
                ermr ermrVar = (ermr) ermqVar.instance;
                ermtVar2.getClass();
                ermrVar.d = ermtVar2;
                ermrVar.b |= 1;
                return erfv.a("type.googleapis.com/google.crypto.tink.KmsAeadKey", ((ermr) ermqVar.build()).toByteString(), 6, eqvo.b(eqvjVar.b), eqvhVar.c);
            }
        });
        d = new ered(erwnVarB, erfv.class, new eree() { // from class: eqvn
            @Override // defpackage.eree
            public final eqsg a(erga ergaVar) throws GeneralSecurityException {
                erfi erfiVar = eqvo.a;
                if (!((erfv) ergaVar).a.equals("type.googleapis.com/google.crypto.tink.KmsAeadKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to LegacyKmsAeadProtoSerialization.parseKey");
                }
                try {
                    evqs evqsVar = ((erfv) ergaVar).c;
                    evrr evrrVar = evrr.a;
                    evuq evuqVar = evuq.a;
                    ermr ermrVar = (ermr) evsn.parseFrom(ermr.a, evqsVar, evrr.a);
                    if (ermrVar.c == 0) {
                        ermt ermtVar = ermrVar.d;
                        if (ermtVar == null) {
                            ermtVar = ermt.a;
                        }
                        return eqvh.d(new eqvj(ermtVar.b, eqvo.a(((erfv) ergaVar).d)), ((erfv) ergaVar).e);
                    }
                    throw new GeneralSecurityException("KmsAeadKey are only accepted with version 0, got " + String.valueOf(ermrVar));
                } catch (evtj e2) {
                    throw new GeneralSecurityException("Parsing KmsAeadKey failed: ", e2);
                }
            }
        });
    }

    public static eqvi a(ermy ermyVar) throws GeneralSecurityException {
        int iOrdinal = ermyVar.ordinal();
        if (iOrdinal == 1) {
            return eqvi.a;
        }
        if (iOrdinal == 3) {
            return eqvi.b;
        }
        throw new GeneralSecurityException(a.U(ermyVar, "Unable to parse OutputPrefixType: "));
    }

    public static ermy b(eqvi eqviVar) throws GeneralSecurityException {
        if (eqvi.a.equals(eqviVar)) {
            return ermy.TINK;
        }
        if (eqvi.b.equals(eqviVar)) {
            return ermy.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(eqviVar.c));
    }
}
