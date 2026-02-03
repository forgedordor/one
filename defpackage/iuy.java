package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class iuy implements iva {
    @Override // defpackage.iva
    public final long a(long j, long j2) {
        long jFloatToRawIntBits;
        long jFloatToRawIntBits2;
        if (Float.intBitsToFloat((int) (j >> 32)) > Float.intBitsToFloat((int) (j2 >> 32)) || Float.intBitsToFloat((int) (j & 4294967295L)) > Float.intBitsToFloat((int) (j2 & 4294967295L))) {
            float fA = ivb.a(j, j2);
            long jFloatToRawIntBits3 = Float.floatToRawIntBits(fA);
            long jFloatToRawIntBits4 = Float.floatToRawIntBits(fA);
            jFloatToRawIntBits = jFloatToRawIntBits3 << 32;
            jFloatToRawIntBits2 = jFloatToRawIntBits4 & 4294967295L;
            int i = iza.a;
        } else {
            jFloatToRawIntBits = Float.floatToRawIntBits(1.0f) << 32;
            jFloatToRawIntBits2 = Float.floatToRawIntBits(1.0f) & 4294967295L;
            int i2 = iza.a;
        }
        return jFloatToRawIntBits | jFloatToRawIntBits2;
    }
}
