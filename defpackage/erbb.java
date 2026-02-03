package defpackage;

import java.security.GeneralSecurityException;
import java.security.spec.EllipticCurve;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class erbb extends erbt {
    public final eras a;
    public final erwn b;
    public final erwn c;
    public final Integer d;

    private erbb(eras erasVar, erwn erwnVar, erwn erwnVar2, Integer num) {
        this.a = erasVar;
        this.b = erwnVar;
        this.c = erwnVar2;
        this.d = num;
    }

    public static erbb c(eras erasVar, erwn erwnVar, Integer num) throws GeneralSecurityException {
        EllipticCurve curve;
        erwn erwnVarB;
        erar erarVar = erar.c;
        erar erarVar2 = erasVar.d;
        if (!erarVar2.equals(erarVar) && num == null) {
            throw new GeneralSecurityException("'idRequirement' must be non-null for " + erarVar2.d + " variant.");
        }
        if (erarVar2.equals(erarVar) && num != null) {
            throw new GeneralSecurityException("'idRequirement' must be null for NO_PREFIX variant.");
        }
        eraq eraqVar = erasVar.a;
        int iA = erwnVar.a();
        String str = "Encoded public key byte length for " + eraqVar.toString() + " must be %d, not " + iA;
        eraq eraqVar2 = eraq.a;
        if (eraqVar == eraqVar2) {
            if (iA != 65) {
                throw new GeneralSecurityException(String.format(str, 65));
            }
        } else if (eraqVar == eraq.b) {
            if (iA != 97) {
                throw new GeneralSecurityException(String.format(str, 97));
            }
        } else if (eraqVar == eraq.c) {
            if (iA != 133) {
                throw new GeneralSecurityException(String.format(str, 133));
            }
        } else {
            if (eraqVar != eraq.f) {
                throw new GeneralSecurityException("Unable to validate public key length for ".concat(eraqVar.toString()));
            }
            if (iA != 32) {
                throw new GeneralSecurityException(String.format(str, 32));
            }
        }
        if (eraqVar == eraqVar2 || eraqVar == eraq.b || eraqVar == eraq.c) {
            if (eraqVar == eraqVar2) {
                curve = erdw.a.getCurve();
            } else if (eraqVar == eraq.b) {
                curve = erdw.b.getCurve();
            } else {
                if (eraqVar != eraq.c) {
                    throw new IllegalArgumentException("Unable to determine NIST curve type for ".concat(eraqVar.toString()));
                }
                curve = erdw.c.getCurve();
            }
            erdw.f(erva.h(curve, eruz.UNCOMPRESSED, erwnVar.c()), curve);
        }
        if (erarVar2 == erarVar) {
            erwnVarB = erfc.a;
        } else {
            if (num == null) {
                throw new IllegalStateException("idRequirement must be non-null for HpkeParameters.Variant ".concat(erarVar2.d));
            }
            if (erarVar2 == erar.b) {
                erwnVarB = erfc.a(num.intValue());
            } else {
                if (erarVar2 != erar.a) {
                    throw new IllegalStateException("Unknown HpkeParameters.Variant: ".concat(erarVar2.d));
                }
                erwnVarB = erfc.b(num.intValue());
            }
        }
        return new erbb(erasVar, erwnVar, erwnVarB, num);
    }

    @Override // defpackage.erbt, defpackage.eqsg
    public final /* synthetic */ eqst a() {
        return this.a;
    }

    @Override // defpackage.eqsg
    public final Integer b() {
        return this.d;
    }

    @Override // defpackage.erbt
    public final erwn e() {
        return this.c;
    }
}
