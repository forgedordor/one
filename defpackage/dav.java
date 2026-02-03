package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dav {
    public final float a;
    public final float b;
    private final kio c;

    public dav(float f, kio kioVar) {
        this.a = f;
        this.c = kioVar;
        float fEd = kioVar.ed();
        float f2 = daw.a;
        this.b = fEd * 386.0878f * 160.0f * 0.84f;
    }

    public final double a(float f) {
        int i = cwj.a;
        return Math.log((Math.abs(f) * 0.35f) / (this.a * this.b));
    }

    public final dau b(float f) {
        double dA = a(f);
        double d = daw.a;
        double d2 = (-1.0d) + d;
        return new dau(f, (float) (this.a * this.b * Math.exp((d / d2) * dA)), (long) (Math.exp(dA / d2) * 1000.0d));
    }
}
