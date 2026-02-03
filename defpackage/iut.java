package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class iut implements iva {
    @Override // defpackage.iva
    public final long a(long j, long j2) {
        float fMax = Math.max(Float.intBitsToFloat((int) (j2 >> 32)) / Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j2 & 4294967295L)) / Float.intBitsToFloat((int) (j & 4294967295L)));
        long jFloatToRawIntBits = Float.floatToRawIntBits(fMax);
        long jFloatToRawIntBits2 = Float.floatToRawIntBits(fMax);
        int i = iza.a;
        return (jFloatToRawIntBits << 32) | (jFloatToRawIntBits2 & 4294967295L);
    }
}
