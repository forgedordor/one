package defpackage;

import java.security.GeneralSecurityException;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eqvp extends eqtd {
    public final eqvs a;
    public final erwn b;
    public final Integer c;

    private eqvp(eqvs eqvsVar, erwn erwnVar, Integer num) {
        this.a = eqvsVar;
        this.b = erwnVar;
        this.c = num;
    }

    public static eqvp d(eqvs eqvsVar, Integer num) throws GeneralSecurityException {
        erwn erwnVarB;
        eqvr eqvrVar = eqvsVar.a;
        if (eqvrVar == eqvr.b) {
            if (num != null) {
                throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
            }
            erwnVarB = erfc.a;
        } else {
            if (eqvrVar != eqvr.a) {
                throw new GeneralSecurityException("Unknown Variant: ".concat(eqvrVar.c));
            }
            if (num == null) {
                throw new GeneralSecurityException("For given Variant TINK the value of idRequirement must be non-null");
            }
            erwnVarB = erfc.b(num.intValue());
        }
        return new eqvp(eqvsVar, erwnVarB, num);
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
        return this.b;
    }
}
