package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ive implements iva {
    private final float a = 1.0f;

    @Override // defpackage.iva
    public final long a(long j, long j2) {
        long jFloatToRawIntBits = Float.floatToRawIntBits(1.0f);
        long jFloatToRawIntBits2 = Float.floatToRawIntBits(1.0f);
        int i = iza.a;
        return (jFloatToRawIntBits << 32) | (4294967295L & jFloatToRawIntBits2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ive)) {
            return false;
        }
        float f = ((ive) obj).a;
        return Float.compare(1.0f, 1.0f) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(1.0f);
    }

    public final String toString() {
        return "FixedScale(value=1.0)";
    }
}
