package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dfa implements dez {
    private final float a;
    private final float b;

    public dfa() {
        this(null);
    }

    @Override // defpackage.dez
    public final float a() {
        return this.a;
    }

    @Override // defpackage.dez
    public final float b(float f, float f2) {
        float fAbs = Math.abs(f2);
        float f3 = this.a;
        if (fAbs <= f3) {
            return f;
        }
        double dAbs = Math.abs(f3 / f2);
        float f4 = this.b;
        double d = f4;
        float f5 = f2 / f4;
        return (f - f5) + (f5 * ((float) Math.exp((d * ((Math.log(dAbs) / d) * 1000.0d)) / 1000.0d)));
    }

    @Override // defpackage.dez
    public final float c(long j, float f, float f2) {
        float f3 = f2 / this.b;
        return (f - f3) + (f3 * ((float) Math.exp(((j / 1000000) * r0) / 1000.0f)));
    }

    @Override // defpackage.dez
    public final long d(float f) {
        return ((long) ((((float) Math.log(this.a / Math.abs(f))) * 1000.0f) / this.b)) * 1000000;
    }

    @Override // defpackage.dez
    public final float e(long j, float f) {
        return f * ((float) Math.exp(((j / 1000000) / 1000.0f) * this.b));
    }

    public dfa(byte[] bArr) {
        this.a = Math.max(1.0E-7f, Math.abs(0.1f));
        this.b = Math.max(1.0E-4f, 1.0f) * (-4.2f);
    }
}
