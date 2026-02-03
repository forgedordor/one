package defpackage;

import java.security.GeneralSecurityException;
import java.security.spec.ECPoint;
import java.security.spec.EllipticCurve;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eram extends erbt {
    public final erak a;
    public final ECPoint b;
    public final erwn c;
    public final erwn d;
    public final Integer e;

    private eram(erak erakVar, ECPoint eCPoint, erwn erwnVar, erwn erwnVar2, Integer num) {
        this.a = erakVar;
        this.b = eCPoint;
        this.c = erwnVar;
        this.d = erwnVar2;
        this.e = num;
    }

    public static eram c(erak erakVar, erwn erwnVar, Integer num) throws GeneralSecurityException {
        if (!erakVar.b.equals(erag.d)) {
            throw new GeneralSecurityException("createForCurveX25519 may only be called with parameters for curve X25519");
        }
        eraj erajVar = erakVar.e;
        g(erajVar, num);
        if (erwnVar.a() == 32) {
            return new eram(erakVar, null, erwnVar, f(erajVar, num), num);
        }
        throw new GeneralSecurityException("Encoded public point byte length for X25519 curve must be 32");
    }

    public static eram d(erak erakVar, ECPoint eCPoint, Integer num) throws GeneralSecurityException {
        EllipticCurve curve;
        erag eragVar = erakVar.b;
        if (eragVar.equals(erag.d)) {
            throw new GeneralSecurityException("createForNistCurve may only be called with parameters for NIST curve");
        }
        eraj erajVar = erakVar.e;
        g(erajVar, num);
        if (eragVar == erag.a) {
            curve = erdw.a.getCurve();
        } else if (eragVar == erag.b) {
            curve = erdw.b.getCurve();
        } else {
            if (eragVar != erag.c) {
                throw new IllegalArgumentException("Unable to determine NIST curve type for ".concat(String.valueOf(String.valueOf(eragVar))));
            }
            curve = erdw.c.getCurve();
        }
        erdw.f(eCPoint, curve);
        return new eram(erakVar, eCPoint, null, f(erajVar, num), num);
    }

    private static erwn f(eraj erajVar, Integer num) {
        if (erajVar == eraj.c) {
            return erfc.a;
        }
        if (num == null) {
            throw new IllegalStateException("idRequirement must be non-null for EciesParameters.Variant: ".concat(String.valueOf(String.valueOf(erajVar))));
        }
        if (erajVar == eraj.b) {
            return erfc.a(num.intValue());
        }
        if (erajVar == eraj.a) {
            return erfc.b(num.intValue());
        }
        throw new IllegalStateException("Unknown EciesParameters.Variant: ".concat(String.valueOf(String.valueOf(erajVar))));
    }

    private static void g(eraj erajVar, Integer num) throws GeneralSecurityException {
        eraj erajVar2 = eraj.c;
        if (!erajVar.equals(erajVar2) && num == null) {
            throw new GeneralSecurityException(a.I(erajVar, "'idRequirement' must be non-null for ", " variant."));
        }
        if (erajVar.equals(erajVar2) && num != null) {
            throw new GeneralSecurityException("'idRequirement' must be null for NO_PREFIX variant.");
        }
    }

    @Override // defpackage.erbt, defpackage.eqsg
    public final /* synthetic */ eqst a() {
        return this.a;
    }

    @Override // defpackage.eqsg
    public final Integer b() {
        return this.e;
    }

    @Override // defpackage.erbt
    public final erwn e() {
        return this.d;
    }
}
