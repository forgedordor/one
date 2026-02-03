package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ekxm {
    public static final double a = 1.0d / Math.sqrt(2.0d);
    public static final double b = Math.sqrt(2.0d);
    public static final ekxi c;
    public static final double d;
    public static final ekyj e;
    private static final int[] f;
    private static final int[][] g;
    private static final ekyj[] h;

    static {
        double dSqrt = Math.sqrt(3.0d);
        ekxi ekxiVar = new ekxi(8.881784197001252E-16d);
        c = ekxiVar;
        d = ((32.0d * dSqrt) * 1.1102230246251565E-16d) / ((ekxiVar.c / 1.1102230246251565E-16d) - ((dSqrt + dSqrt) + 1.0d));
        e = new ekyj(-0.00999946643502502d, 0.002592454260932412d, 0.999946643502502d);
        f = new int[]{1, 0, 0, 3};
        g = new int[][]{new int[]{0, 1, 3, 2}, new int[]{0, 2, 3, 1}, new int[]{3, 2, 0, 1}, new int[]{3, 1, 0, 2}};
        h = new ekyj[]{new ekyj(1.0d, 0.0053d, 0.00457d), new ekyj(0.012d, 1.0d, 0.00457d), new ekyj(0.012d, 0.0053d, 1.0d)};
    }

    public static int a(int i, int i2) {
        return g[i][i2];
    }

    public static int b(int i) {
        boolean z = false;
        if (i >= 0 && i < 4) {
            z = true;
        }
        ejwl.a(z);
        return f[i];
    }

    public static ekyj c(ekyj ekyjVar) {
        int iH = ekyj.h(ekyjVar.e, ekyjVar.f, ekyjVar.g) - 1;
        if (iH < 0) {
            iH = 2;
        }
        return ekyj.m(ekyj.j(ekyjVar, h[iH]));
    }

    public static boolean d(ekyj ekyjVar) {
        return Math.abs(ekyjVar.e() + (-1.0d)) <= 1.1102230246251565E-15d;
    }
}
