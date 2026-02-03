package defpackage;

import java.math.BigDecimal;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ekyp {
    public static int a(ekyj ekyjVar, ekyj ekyjVar2) {
        double dA = ekyjVar.a(ekyjVar2);
        if (dA > 4.057643110400022E-16d) {
            return 1;
        }
        return dA < -4.057643110400022E-16d ? -1 : 0;
    }

    public static int b(ekyj ekyjVar, ekyj ekyjVar2, ekyj ekyjVar3) {
        double d;
        double dSqrt;
        ekyj ekyjVar4 = ekyjVar;
        ekyj ekyjVar5 = ekyjVar3;
        int i = 0;
        if (!ekyjVar.p(ekyjVar2) && !ekyjVar2.p(ekyjVar3) && !ekyjVar5.p(ekyjVar4)) {
            ekyj ekyjVarN = ekyj.n(ekyjVar2, ekyjVar4);
            ekyj ekyjVarN2 = ekyj.n(ekyjVar5, ekyjVar2);
            ekyj ekyjVarN3 = ekyj.n(ekyjVar4, ekyjVar5);
            double dE = ekyjVarN.e();
            double dE2 = ekyjVarN2.e();
            double dE3 = ekyjVarN3.e();
            if (dE >= dE2 && dE >= dE3) {
                d = -ekyj.f(ekyjVar5, ekyjVarN3, ekyjVarN2);
                dSqrt = Math.sqrt(dE3 * dE2);
            } else if (dE2 >= dE3) {
                d = -ekyj.f(ekyjVar4, ekyjVarN, ekyjVarN3);
                dSqrt = Math.sqrt(dE * dE3);
            } else {
                d = -ekyj.f(ekyjVar2, ekyjVarN2, ekyjVarN);
                dSqrt = Math.sqrt(dE2 * dE);
            }
            double d2 = dSqrt * 7.176703675781937E-16d;
            int i2 = ekyq.a;
            int i3 = 1;
            if (d > d2) {
                i = 1;
            } else if (d < (-d2)) {
                i = -1;
            }
            if (i == 0) {
                int iA = ekxc.a(ekyjVar, ekyjVar2, ekyjVar3);
                if (iA != 0) {
                    return iA;
                }
                int iCompareTo = ekyjVar.compareTo(ekyjVar2);
                int i4 = iCompareTo <= 0 ? 1 : -1;
                ekyj ekyjVar6 = iCompareTo > 0 ? ekyjVar4 : ekyjVar2;
                if (iCompareTo > 0) {
                    ekyjVar4 = ekyjVar2;
                }
                if (ekyjVar6.compareTo(ekyjVar5) > 0) {
                    i4 = -i4;
                } else {
                    ekyj ekyjVar7 = ekyjVar6;
                    ekyjVar6 = ekyjVar5;
                    ekyjVar5 = ekyjVar7;
                }
                if (ekyjVar4.compareTo(ekyjVar5) > 0) {
                    i4 = -i4;
                    ekyj ekyjVar8 = ekyjVar5;
                    ekyjVar5 = ekyjVar4;
                    ekyjVar4 = ekyjVar8;
                }
                if (!ekyjVar4.p(ekyjVar4) || !ekyjVar5.p(ekyjVar5) || !ekyjVar6.p(ekyjVar6)) {
                    return -i4;
                }
                ekwx ekwxVar = new ekwx(ekyjVar4);
                ekwx ekwxVar2 = new ekwx(ekyjVar5);
                ekwx ekwxVar3 = new ekwx(ekyjVar6);
                ekwx ekwxVarA = ekwxVar2.a(ekwxVar3);
                BigDecimal bigDecimal = ekwxVarA.a;
                BigDecimal bigDecimal2 = ekwxVar.a;
                BigDecimal bigDecimal3 = ekwxVarA.b;
                BigDecimal bigDecimal4 = ekwxVar.b;
                BigDecimal bigDecimalAdd = bigDecimal.multiply(bigDecimal2).add(bigDecimal3.multiply(bigDecimal4));
                BigDecimal bigDecimal5 = ekwxVarA.c;
                BigDecimal bigDecimal6 = ekwxVar.c;
                int iSignum = bigDecimalAdd.add(bigDecimal5.multiply(bigDecimal6)).signum();
                if (iSignum != 0) {
                    return i4 * iSignum;
                }
                int iSignum2 = bigDecimal5.signum();
                if (iSignum2 == 0 && (iSignum2 = bigDecimal3.signum()) == 0 && (iSignum2 = bigDecimal.signum()) == 0) {
                    BigDecimal bigDecimal7 = ekwxVar3.a;
                    BigDecimal bigDecimal8 = ekwxVar3.b;
                    int iSignum3 = bigDecimal7.multiply(bigDecimal4).subtract(bigDecimal8.multiply(bigDecimal2)).signum();
                    if (iSignum3 == 0 && (iSignum3 = bigDecimal7.signum()) == 0) {
                        int i5 = -bigDecimal8.signum();
                        if (i5 != 0) {
                            i3 = i5;
                        } else {
                            BigDecimal bigDecimal9 = ekwxVar3.c;
                            int iSignum4 = bigDecimal9.multiply(bigDecimal2).subtract(bigDecimal7.multiply(bigDecimal6)).signum();
                            if (iSignum4 == 0 && (iSignum4 = bigDecimal9.signum()) == 0) {
                                BigDecimal bigDecimal10 = ekwxVar2.b;
                                BigDecimal bigDecimal11 = ekwxVar2.a;
                                int iSignum5 = bigDecimal2.multiply(bigDecimal10).subtract(bigDecimal4.multiply(bigDecimal11)).signum();
                                if (iSignum5 != 0) {
                                    i3 = iSignum5;
                                } else {
                                    int iSignum6 = -bigDecimal11.signum();
                                    if (iSignum6 != 0 || (iSignum6 = bigDecimal10.signum()) != 0 || (iSignum6 = bigDecimal2.signum()) != 0) {
                                        i3 = iSignum6;
                                    }
                                }
                            } else {
                                i3 = iSignum4;
                            }
                        }
                    } else {
                        i3 = iSignum3;
                    }
                } else {
                    i3 = iSignum2;
                }
                return i4 * i3;
            }
        }
        return i;
    }
}
