package defpackage;

import java.security.GeneralSecurityException;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eqwo extends eqtd {
    public final eqwu a;
    public final erwp b;
    public final erwn c;
    public final Integer d;

    private eqwo(eqwu eqwuVar, erwp erwpVar, erwn erwnVar, Integer num) {
        this.a = eqwuVar;
        this.b = erwpVar;
        this.c = erwnVar;
        this.d = num;
    }

    public static eqwo d(eqwt eqwtVar, erwp erwpVar, Integer num) throws GeneralSecurityException {
        erwn erwnVarB;
        eqwt eqwtVar2 = eqwt.c;
        if (eqwtVar != eqwtVar2 && num == null) {
            throw new GeneralSecurityException("For given Variant " + eqwtVar.d + " the value of idRequirement must be non-null");
        }
        if (eqwtVar == eqwtVar2 && num != null) {
            throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
        }
        if (erwpVar.a() != 32) {
            throw new GeneralSecurityException("XChaCha20Poly1305 key must be constructed with key of length 32 bytes, not " + erwpVar.a());
        }
        eqwu eqwuVar = new eqwu(eqwtVar);
        eqwt eqwtVar3 = eqwuVar.a;
        if (eqwtVar3 == eqwtVar2) {
            erwnVarB = erfc.a;
        } else if (eqwtVar3 == eqwt.b) {
            erwnVarB = erfc.a(num.intValue());
        } else {
            if (eqwtVar3 != eqwt.a) {
                throw new IllegalStateException("Unknown Variant: ".concat(eqwtVar3.d));
            }
            erwnVarB = erfc.b(num.intValue());
        }
        return new eqwo(eqwuVar, erwpVar, erwnVarB, num);
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
