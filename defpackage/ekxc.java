package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ekxc {
    public static int a(ekyj ekyjVar, ekyj ekyjVar2, ekyj ekyjVar3) {
        double d;
        try {
            double d2 = ekyjVar2.f;
            double d3 = ekyjVar3.g;
            ekxh ekxhVarC = ekxh.c(d2, d3);
            double d4 = ekyjVar2.g;
            double d5 = ekyjVar3.f;
            ekxh ekxhVarC2 = ekxh.c(d4, d5);
            double d6 = ekyjVar3.e;
            ekxh ekxhVarC3 = ekxh.c(d4, d6);
            double d7 = ekyjVar2.e;
            ekxh ekxhVarC4 = ekxh.c(d7, d3);
            ekxh ekxhVarC5 = ekxh.c(d7, d5);
            ekxh ekxhVarC6 = ekxh.c(d2, d6);
            d = ekxhVarC.d(ekxhVarC2).b(ekyjVar.e).a(ekxhVarC3.d(ekxhVarC4).b(ekyjVar.f)).a(ekxhVarC5.d(ekxhVarC6).b(ekyjVar.g)).a[r13.length - 1];
        } catch (ArithmeticException unused) {
        }
        if (d > 0.0d) {
            return 1;
        }
        return d < 0.0d ? -1 : 0;
    }

    public static double b(double d) {
        return Math.IEEEremainder(d, 6.283185307179586d);
    }
}
