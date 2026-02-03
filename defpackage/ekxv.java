package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ekxv {
    public static final double a;
    public static final double b;

    static {
        double d = ekxm.a * 9.0d * 2.220446049250313E-16d;
        a = d;
        b = d + (ekxm.b * 3.0d * 2.220446049250313E-16d);
        double d2 = ekxm.c.c;
    }

    public static final double a(ekyj ekyjVar, ekyj ekyjVar2) {
        double d = ekyjVar.e - ekyjVar2.e;
        double d2 = ekyjVar.f - ekyjVar2.f;
        double d3 = ekyjVar.g - ekyjVar2.g;
        return (d * d) + (d2 * d2) + (d3 * d3);
    }

    static double b(double d, double d2, double d3, double d4, double d5) {
        return Math.abs(d2 - d) <= Math.abs(d3 - d) ? d4 + ((d5 - d4) * ((d - d2) / (d3 - d2))) : d5 + ((d4 - d5) * ((d - d3) / (d2 - d3)));
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0096  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static int c(defpackage.ekyj r25, defpackage.ekyj r26, defpackage.ekyj r27, defpackage.ekyj r28, defpackage.ekyj r29, double r30, defpackage.ekxg r32) {
        /*
            Method dump skipped, instructions count: 256
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ekxv.c(ekyj, ekyj, ekyj, ekyj, ekyj, double, ekxg):int");
    }

    public static boolean d(ekyj ekyjVar, ekyj ekyjVar2, int i, double d, ekxg ekxgVar, ekxg ekxgVar2) {
        if (ekzf.f(ekyjVar) == i && ekzf.f(ekyjVar2) == i) {
            ekzf.o(i, ekyjVar, ekxgVar);
            ekzf.o(i, ekyjVar2, ekxgVar2);
            return true;
        }
        ekyj ekyjVarJ = ekzf.j(i, ekzo.a(ekyjVar, ekyjVar2));
        ekyj ekyjVarJ2 = ekzf.j(i, ekyjVar);
        ekyj ekyjVarJ3 = ekzf.j(i, ekyjVar2);
        double d2 = d + 1.0d;
        double d3 = ekyjVarJ.e;
        ekyj ekyjVar3 = new ekyj(d2 * d3, d2 * ekyjVarJ.f, ekyjVarJ.g);
        double d4 = ekyjVar3.e;
        double d5 = ekyjVar3.f;
        double d6 = ekyjVar3.g;
        double dAbs = Math.abs(d4);
        double dAbs2 = Math.abs(d5);
        double dAbs3 = Math.abs(d6);
        if (dAbs2 >= dAbs3 - dAbs && dAbs >= dAbs3 - dAbs2) {
            ekyj ekyjVarM = ekyj.m(ekyjVarJ);
            ekyj ekyjVarJ4 = ekyj.j(ekyjVarM, ekyjVarJ2);
            ekyj ekyjVarJ5 = ekyj.j(ekyjVarJ3, ekyjVarM);
            if (c(ekyjVarJ3, ekyjVarJ2, ekyj.l(ekyjVar3), ekyjVarJ5, ekyjVarJ4, d2, ekxgVar) + c(ekyjVarJ2, ekyjVarJ3, ekyjVar3, ekyjVarJ4, ekyjVarJ5, d2, ekxgVar2) < 3) {
                return true;
            }
        }
        return false;
    }
}
