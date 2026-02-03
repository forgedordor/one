package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ltp {
    public final ltb a;
    public float b;
    public float c;
    final /* synthetic */ ltq d;
    private final float e;

    public ltp(ltq ltqVar, ltb ltbVar, float f, float f2) {
        ltbVar.getClass();
        this.d = ltqVar;
        this.a = ltbVar;
        if (f2 < f) {
            throw new IllegalArgumentException("endOutlineProgress is expected to be equal or greater than startOutlineProgress");
        }
        this.e = ltm.b(ltbVar);
        this.b = f;
        this.c = f2;
    }

    public final fcti a(float f) {
        float fE = fddu.e(f, this.b, this.c);
        float f2 = this.c;
        float f3 = this.b;
        ltb ltbVar = this.a;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (ltm.a(ltbVar, ((fE - f3) / (f2 - f3)) * this.e) >> 32));
        if (fIntBitsToFloat < 0.0f || fIntBitsToFloat > 1.0f) {
            throw new IllegalArgumentException("Cubic cut point is expected to be between 0 and 1");
        }
        ltq ltqVar = this.d;
        fcti fctiVarK = ltbVar.k(fIntBitsToFloat);
        return new fcti(new ltp(ltqVar, (ltb) fctiVarK.a, this.b, fE), new ltp(ltqVar, (ltb) fctiVarK.b, fE, this.c));
    }

    public final String toString() {
        return "MeasuredCubic(outlineProgress=[" + this.b + " .. " + this.c + "], size=" + this.e + ", cubic=" + this.a + ')';
    }
}
