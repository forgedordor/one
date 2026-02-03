package defpackage;

import j$.util.Optional;
import java.math.BigDecimal;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ekzo {
    public static ekyj a(ekyj ekyjVar, ekyj ekyjVar2) {
        Object objD;
        ekyj ekyjVarJ = ekyj.j(ekyj.i(ekyjVar2, ekyjVar), ekyj.n(ekyjVar2, ekyjVar));
        double dE = ekyjVarJ.e();
        double d = ekxm.d;
        Optional optionalEmpty = dE < d * d ? Optional.empty() : Optional.of(ekyjVarJ);
        if (optionalEmpty.isPresent()) {
            return (ekyj) optionalEmpty.get();
        }
        if (ekyjVar.p(ekyjVar2)) {
            objD = ekxm.c(ekyjVar);
        } else {
            Optional optionalC = c(ekyjVar, ekyjVar2);
            if (optionalC.isPresent()) {
                objD = optionalC.get();
            } else {
                ekwx ekwxVarA = new ekwx(ekyjVar).a(new ekwx(ekyjVar2));
                BigDecimal bigDecimal = ekwxVarA.a;
                BigDecimal bigDecimal2 = ekwxVarA.b;
                BigDecimal bigDecimal3 = ekwxVarA.c;
                ekyj ekyjVar3 = new ekyj(bigDecimal.doubleValue(), bigDecimal2.doubleValue(), bigDecimal3.doubleValue());
                if (!e(ekyjVar3)) {
                    int i = -ekzn.a(bigDecimal).scale();
                    int iPrecision = ekzn.a(bigDecimal).precision() - 1;
                    int i2 = -ekzn.a(bigDecimal2).scale();
                    int iPrecision2 = ekzn.a(bigDecimal2).precision() - 1;
                    int i3 = -ekzn.a(bigDecimal3).scale();
                    int iPrecision3 = ekzn.a(bigDecimal3).precision() - 1;
                    int iMax = bigDecimal.signum() != 0 ? Math.max(Integer.MIN_VALUE, i + iPrecision) : Integer.MIN_VALUE;
                    if (bigDecimal2.signum() != 0) {
                        iMax = Math.max(iMax, i2 + iPrecision2);
                    }
                    if (bigDecimal3.signum() != 0) {
                        iMax = Math.max(iMax, i3 + iPrecision3);
                    }
                    if (iMax == Integer.MIN_VALUE) {
                        ekyjVar3 = ekyj.a;
                    } else {
                        int i4 = (-iMax) - 1;
                        ekyjVar3 = new ekyj(bigDecimal.scaleByPowerOfTen(i4).doubleValue(), bigDecimal2.scaleByPowerOfTen(i4).doubleValue(), bigDecimal3.scaleByPowerOfTen(i4).doubleValue());
                    }
                }
                Optional optionalEmpty2 = ekyjVar3.p(ekyj.a) ? Optional.empty() : Optional.of(ekyjVar3);
                objD = optionalEmpty2.isPresent() ? optionalEmpty2.get() : ekyjVar.q(ekyjVar2) ? d(b(ekyjVar, ekyjVar2)) : ekyj.l(d(b(ekyjVar2, ekyjVar)));
            }
        }
        return (ekyj) objD;
    }

    static ekyj b(ekyj ekyjVar, ekyj ekyjVar2) {
        double d = ekyjVar2.e;
        if (d != 0.0d || ekyjVar2.f != 0.0d) {
            return new ekyj(-ekyjVar2.f, d, 0.0d);
        }
        double d2 = ekyjVar2.g;
        if (d2 == 0.0d) {
            double d3 = ekyjVar.e;
            if (d3 != 0.0d || ekyjVar.f != 0.0d) {
                return new ekyj(ekyjVar.f, -d3, 0.0d);
            }
            d2 = 1.0d;
        }
        return new ekyj(d2, 0.0d, 0.0d);
    }

    static Optional c(ekyj ekyjVar, ekyj ekyjVar2) {
        try {
            ekyj ekyjVarI = ekyj.i(ekyjVar, ekyjVar2);
            ekyj ekyjVarN = ekyj.n(ekyjVar2, ekyjVar);
            double d = ekyjVarI.f;
            double d2 = ekyjVarN.g;
            ekxh ekxhVarC = ekxh.c(d, d2);
            double d3 = ekyjVarI.g;
            double d4 = ekyjVarN.f;
            ekxh ekxhVarD = ekxhVarC.d(ekxh.c(d3, d4));
            double d5 = ekyjVarN.e;
            ekxh ekxhVarC2 = ekxh.c(d3, d5);
            double d6 = ekyjVarI.e;
            ekyj ekyjVar3 = new ekyj(ekxhVarD.doubleValue(), ekxhVarC2.d(ekxh.c(d6, d2)).doubleValue(), ekxh.c(d6, d4).d(ekxh.c(d, d5)).doubleValue());
            if (!e(ekyjVar3)) {
                double d7 = ekyjVar3.e;
                double dAbs = Math.abs(d7);
                double d8 = ekyjVar3.f;
                double dAbs2 = Math.abs(d8);
                double d9 = ekyjVar3.g;
                double dA = eomv.a(dAbs, dAbs2, Math.abs(d9));
                ekyjVar3 = new ekyj(d7 / dA, d8 / dA, d9 / dA);
            }
            if (!ekyjVar3.p(ekyj.a) && e(ekyjVar3)) {
                return Optional.of(ekyjVar3);
            }
            return Optional.empty();
        } catch (ArithmeticException unused) {
            return Optional.empty();
        }
    }

    private static ekyj d(ekyj ekyjVar) {
        return e(ekyjVar) ? ekyjVar : ekyj.k(ekyjVar, Math.pow(2.0d, (-1) - Math.getExponent(eomv.a(Math.abs(ekyjVar.e), Math.abs(ekyjVar.f), Math.abs(ekyjVar.g)))));
    }

    private static boolean e(ekyj ekyjVar) {
        return eomv.a(Math.abs(ekyjVar.e), Math.abs(ekyjVar.f), Math.abs(ekyjVar.g)) >= Math.pow(2.0d, -242.0d);
    }
}
