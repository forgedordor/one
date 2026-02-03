package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ekzx {
    public final int a;
    public final int b;
    public final int c;
    public final double d;
    public final double e;
    public final double f;
    public final double g;
    public final ekyj h;
    public final ekyj i;

    public ekzx(int i, int i2, ekyj ekyjVar, ekyj ekyjVar2, ekxg ekxgVar, ekxg ekxgVar2) {
        this.a = i;
        this.b = i2;
        this.d = ekxgVar.a;
        this.e = ekxgVar.b;
        this.f = ekxgVar2.a;
        this.g = ekxgVar2.b;
        this.h = ekyjVar;
        this.i = ekyjVar2;
        double d = elaw.a;
        double dSqrt = Math.sqrt(ekyjVar.c(ekyjVar2));
        ekxl ekxlVar = ekzf.b;
        int iMax = 30;
        if (dSqrt > 0.0d) {
            int exponent = Math.getExponent(dSqrt / ekxlVar.a);
            int i3 = ekxlVar.b;
            iMax = Math.max(0, Math.min(30, -exponent));
        }
        this.c = iMax;
    }

    public final String toString() {
        return "shape " + this.a + " edge " + this.b;
    }
}
