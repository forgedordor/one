package defpackage;

import j$.util.Objects;
import java.security.GeneralSecurityException;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eqyp {
    public static final erfi a;
    public static final erff b;
    public static final erei c;
    public static final eref d;
    private static final erwn e;

    static {
        erwn erwnVarB = ergh.b("type.googleapis.com/google.crypto.tink.XAesGcmKey");
        e = erwnVarB;
        a = new erfg(eqwn.class, erfw.class, new erfh() { // from class: eqyl
            @Override // defpackage.erfh
            public final erga a(eqst eqstVar) throws GeneralSecurityException {
                eqwn eqwnVar = (eqwn) eqstVar;
                erfi erfiVar = eqyp.a;
                ermg ermgVar = (ermg) ermh.a.createBuilder();
                ermgVar.copyOnWrite();
                ((ermh) ermgVar.instance).b = "type.googleapis.com/google.crypto.tink.XAesGcmKey";
                ernt erntVar = (ernt) ernu.a.createBuilder();
                ernv ernvVar = (ernv) ernw.a.createBuilder();
                int i = eqwnVar.b;
                ernvVar.copyOnWrite();
                ((ernw) ernvVar.instance).b = i;
                ernw ernwVar = (ernw) ernvVar.build();
                erntVar.copyOnWrite();
                ernu ernuVar = (ernu) erntVar.instance;
                ernwVar.getClass();
                ernuVar.d = ernwVar;
                ernuVar.b |= 1;
                evqs byteString = ((ernu) erntVar.build()).toByteString();
                ermgVar.copyOnWrite();
                ((ermh) ermgVar.instance).c = byteString;
                ermy ermyVarB = eqyp.b(eqwnVar.a);
                ermgVar.copyOnWrite();
                ((ermh) ermgVar.instance).d = ermyVarB.a();
                return erfw.b((ermh) ermgVar.build());
            }
        });
        b = new erfd(erwnVarB, erfw.class, new erfe() { // from class: eqym
            @Override // defpackage.erfe
            public final eqst a(erga ergaVar) throws GeneralSecurityException {
                erfi erfiVar = eqyp.a;
                erfw erfwVar = (erfw) ergaVar;
                ermh ermhVar = erfwVar.b;
                if (!ermhVar.b.equals("type.googleapis.com/google.crypto.tink.XAesGcmKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to XAesGcmProtoSerialization.parseParameters: ".concat(String.valueOf(erfwVar.b.b)));
                }
                try {
                    evqs evqsVar = ermhVar.c;
                    evrr evrrVar = evrr.a;
                    evuq evuqVar = evuq.a;
                    ernu ernuVar = (ernu) evsn.parseFrom(ernu.a, evqsVar, evrr.a);
                    if (ernuVar.c != 0) {
                        throw new GeneralSecurityException("Only version 0 parameters are accepted");
                    }
                    ermy ermyVarB = ermy.b(erfwVar.b.d);
                    if (ermyVarB == null) {
                        ermyVarB = ermy.UNRECOGNIZED;
                    }
                    eqwm eqwmVarA = eqyp.a(ermyVarB);
                    ernw ernwVar = ernuVar.d;
                    if (ernwVar == null) {
                        ernwVar = ernw.a;
                    }
                    return eqwn.b(eqwmVarA, ernwVar.b);
                } catch (evtj e2) {
                    throw new GeneralSecurityException("Parsing XAesGcmParameters failed: ", e2);
                }
            }
        });
        c = new ereg(eqwi.class, erfv.class, new ereh() { // from class: eqyn
            @Override // defpackage.ereh
            public final erga a(eqsg eqsgVar) {
                eqwi eqwiVar = (eqwi) eqsgVar;
                erfi erfiVar = eqyp.a;
                ernr ernrVar = (ernr) erns.a.createBuilder();
                evqs evqsVarX = evqs.x(eqwiVar.b.d());
                ernrVar.copyOnWrite();
                ((erns) ernrVar.instance).e = evqsVarX;
                ernv ernvVar = (ernv) ernw.a.createBuilder();
                eqwn eqwnVar = eqwiVar.a;
                int i = eqwnVar.b;
                ernvVar.copyOnWrite();
                ((ernw) ernvVar.instance).b = i;
                ernw ernwVar = (ernw) ernvVar.build();
                ernrVar.copyOnWrite();
                erns ernsVar = (erns) ernrVar.instance;
                ernwVar.getClass();
                ernsVar.d = ernwVar;
                ernsVar.b |= 1;
                return erfv.a("type.googleapis.com/google.crypto.tink.XAesGcmKey", ((erns) ernrVar.build()).toByteString(), 3, eqyp.b(eqwnVar.a), eqwiVar.d);
            }
        });
        d = new ered(erwnVarB, erfv.class, new eree() { // from class: eqyo
            @Override // defpackage.eree
            public final eqsg a(erga ergaVar) throws GeneralSecurityException {
                erfi erfiVar = eqyp.a;
                if (!((erfv) ergaVar).a.equals("type.googleapis.com/google.crypto.tink.XAesGcmKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to XAesGcmProtoSerialization.parseKey");
                }
                try {
                    evqs evqsVar = ((erfv) ergaVar).c;
                    evrr evrrVar = evrr.a;
                    evuq evuqVar = evuq.a;
                    erns ernsVar = (erns) evsn.parseFrom(erns.a, evqsVar, evrr.a);
                    if (ernsVar.c != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    if (ernsVar.e.d() != 32) {
                        throw new GeneralSecurityException("Only 32 byte key size is accepted");
                    }
                    eqwm eqwmVarA = eqyp.a(((erfv) ergaVar).d);
                    ernw ernwVar = ernsVar.d;
                    if (ernwVar == null) {
                        ernwVar = ernw.a;
                    }
                    return eqwi.d(eqwn.b(eqwmVarA, ernwVar.b), erwp.c(ernsVar.e.I()), ((erfv) ergaVar).e);
                } catch (evtj unused) {
                    throw new GeneralSecurityException("Parsing XAesGcmKey failed");
                }
            }
        });
    }

    public static eqwm a(ermy ermyVar) throws GeneralSecurityException {
        int iOrdinal = ermyVar.ordinal();
        if (iOrdinal == 1) {
            return eqwm.a;
        }
        if (iOrdinal == 3) {
            return eqwm.b;
        }
        throw new GeneralSecurityException(a.U(ermyVar, "Unable to parse OutputPrefixType: "));
    }

    public static ermy b(eqwm eqwmVar) throws GeneralSecurityException {
        if (Objects.equals(eqwmVar, eqwm.a)) {
            return ermy.TINK;
        }
        if (Objects.equals(eqwmVar, eqwm.b)) {
            return ermy.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(eqwmVar.c));
    }
}
