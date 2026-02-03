package defpackage;

/* compiled from: PG */
@fdac
/* loaded from: classes.dex */
public final class ikz {
    public static final long a = ila.a(0.5f, 0.5f);
    public final long b;

    public static final float a(long j) {
        return Float.intBitsToFloat((int) (j >> 32));
    }

    public static final float b(long j) {
        return Float.intBitsToFloat((int) (j & 4294967295L));
    }

    public static String c(long j) {
        return "TransformOrigin(packedValue=" + j + ')';
    }

    public static final boolean d(long j, long j2) {
        return j == j2;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof ikz) && this.b == ((ikz) obj).b;
    }

    public final int hashCode() {
        return iky.a(this.b);
    }

    public final String toString() {
        return c(this.b);
    }
}
