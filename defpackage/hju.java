package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class hju implements ltu {
    final /* synthetic */ float[] a;

    public hju(float[] fArr) {
        this.a = fArr;
    }

    @Override // defpackage.ltu
    public final long a(float f, float f2) {
        long jA = iju.a(this.a, (Float.floatToRawIntBits(f2) & 4294967295L) | (Float.floatToRawIntBits(f) << 32));
        return csy.a(Float.intBitsToFloat((int) (jA >> 32)), Float.intBitsToFloat((int) (jA & 4294967295L)));
    }
}
