package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class iuu implements iva {
    @Override // defpackage.iva
    public final long a(long j, long j2) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j2 >> 32)) / Float.intBitsToFloat((int) (j >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j2 & 4294967295L)) / Float.intBitsToFloat((int) (j & 4294967295L));
        long jFloatToRawIntBits = Float.floatToRawIntBits(fIntBitsToFloat);
        long jFloatToRawIntBits2 = Float.floatToRawIntBits(fIntBitsToFloat2);
        int i = iza.a;
        return (jFloatToRawIntBits2 & 4294967295L) | (jFloatToRawIntBits << 32);
    }
}
