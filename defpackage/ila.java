package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ila {
    public static final long a(float f, float f2) {
        long jFloatToRawIntBits = Float.floatToRawIntBits(f);
        long jFloatToRawIntBits2 = Float.floatToRawIntBits(f2);
        long j = ikz.a;
        return (jFloatToRawIntBits2 & 4294967295L) | (jFloatToRawIntBits << 32);
    }
}
