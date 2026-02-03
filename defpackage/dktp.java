package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dktp implements dktc {
    public final dff a;
    private final long b;
    private final float c = 0.6f;

    public dktp(long j, dff dffVar) {
        this.b = j;
        this.a = dffVar;
    }

    @Override // defpackage.dktc
    public final float a(float f) {
        return f <= 0.6f ? kjx.b(0.0f, 1.0f, f / 0.6f) : kjx.b(1.0f, 0.0f, (f - 0.6f) / 0.39999998f);
    }

    @Override // defpackage.dktc
    public final dff b() {
        return this.a;
    }

    @Override // defpackage.dktc
    public final iiy c(float f, long j) {
        long j2 = this.b;
        List listG = fcva.g(new ije(ijg.f(ije.d(j2), ije.c(j2), ije.b(j2), 0.0f, ije.f(j2))), new ije(j2), new ije(ijg.f(ije.d(j2), ije.c(j2), ije.b(j2), 0.0f, ije.f(j2))));
        long jFloatToRawIntBits = Float.floatToRawIntBits(0.0f);
        long jFloatToRawIntBits2 = Float.floatToRawIntBits(0.0f);
        float fMax = Math.max(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L))) * f;
        return iix.c(listG, (jFloatToRawIntBits << 32) | (jFloatToRawIntBits2 & 4294967295L), fddu.c(fMax + fMax, 0.01f), 8);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dktp)) {
            return false;
        }
        dktp dktpVar = (dktp) obj;
        long j = this.b;
        long j2 = dktpVar.b;
        long j3 = ije.a;
        if (!fcts.a(j, j2) || !fdbq.f(this.a, dktpVar.a)) {
            return false;
        }
        float f = dktpVar.c;
        return Float.compare(0.6f, 0.6f) == 0;
    }

    public final int hashCode() {
        long j = ije.a;
        return (((fctr.a(this.b) * 31) + this.a.hashCode()) * 31) + Float.floatToIntBits(0.6f);
    }

    public final String toString() {
        return "Shimmer(highlightColor=" + ije.g(this.b) + ", animationSpec=" + this.a + ", progressForMaxAlpha=0.6)";
    }
}
