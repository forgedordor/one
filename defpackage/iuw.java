package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class iuw implements iva {
    @Override // defpackage.iva
    public final long a(long j, long j2) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j2 >> 32)) / Float.intBitsToFloat((int) (j >> 32));
        long jFloatToRawIntBits = Float.floatToRawIntBits(fIntBitsToFloat);
        long jFloatToRawIntBits2 = Float.floatToRawIntBits(fIntBitsToFloat);
        int i = iza.a;
        return (jFloatToRawIntBits2 & 4294967295L) | (jFloatToRawIntBits << 32);
    }
}
