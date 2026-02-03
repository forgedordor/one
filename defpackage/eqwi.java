package defpackage;

import java.security.GeneralSecurityException;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eqwi extends eqtd {
    public final eqwn a;
    public final erwp b;
    public final erwn c;
    public final Integer d;

    private eqwi(eqwn eqwnVar, erwp erwpVar, erwn erwnVar, Integer num) {
        this.a = eqwnVar;
        this.b = erwpVar;
        this.c = erwnVar;
        this.d = num;
    }

    public static eqwi d(eqwn eqwnVar, erwp erwpVar, Integer num) throws GeneralSecurityException {
        erwn erwnVarB;
        eqwm eqwmVar = eqwm.b;
        eqwm eqwmVar2 = eqwnVar.a;
        if (eqwmVar2 != eqwmVar && num == null) {
            throw new GeneralSecurityException("For given Variant " + eqwmVar2.c + " the value of idRequirement must be non-null");
        }
        if (eqwmVar2 == eqwmVar && num != null) {
            throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
        }
        if (erwpVar.a() != 32) {
            throw new GeneralSecurityException("XAesGcmKey key must be constructed with key of length 32 bytes, not " + erwpVar.a());
        }
        if (eqwmVar2 == eqwmVar) {
            erwnVarB = erfc.a;
        } else {
            if (eqwmVar2 != eqwm.a) {
                throw new IllegalStateException("Unknown Variant: ".concat(eqwmVar2.c));
            }
            erwnVarB = erfc.b(num.intValue());
        }
        return new eqwi(eqwnVar, erwpVar, erwnVarB, num);
    }

    @Override // defpackage.eqtd, defpackage.eqsg
    public final /* synthetic */ eqst a() {
        return this.a;
    }

    @Override // defpackage.eqsg
    public final Integer b() {
        throw null;
    }

    @Override // defpackage.eqtd
    public final erwn c() {
        return this.c;
    }
}
