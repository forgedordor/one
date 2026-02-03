package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dzr {
    private final dwm a;
    private long b;

    public dzr(dwm dwmVar, long j) {
        this.a = dwmVar;
        this.b = j;
    }

    public final float a(long j) {
        return Float.intBitsToFloat((int) (this.a == dwm.b ? j >> 32 : j & 4294967295L));
    }

    public final long b(ise iseVar, float f) {
        long jE = ihs.e(this.b, ihs.d(iseVar.c, iseVar.g));
        this.b = jE;
        dwm dwmVar = this.a;
        if ((dwmVar == null ? ihs.a(jE) : Math.abs(a(jE))) < f) {
            return 9205357640488583168L;
        }
        if (dwmVar == null) {
            long j = this.b;
            return ihs.d(this.b, ihs.f(ihs.c(j, ihs.a(j)), f));
        }
        float fA = a(this.b) - (Math.signum(a(this.b)) * f);
        long j2 = this.b;
        dwm dwmVar2 = dwm.b;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (dwmVar == dwmVar2 ? j2 & 4294967295L : j2 >> 32));
        if (dwmVar == dwmVar2) {
            return (Float.floatToRawIntBits(fA) << 32) | (Float.floatToRawIntBits(fIntBitsToFloat) & 4294967295L);
        }
        return (Float.floatToRawIntBits(fIntBitsToFloat) << 32) | (Float.floatToRawIntBits(fA) & 4294967295L);
    }

    public final void c() {
        this.b = 0L;
    }
}
