package defpackage;

/* compiled from: PG */
@fdac
/* loaded from: classes.dex */
public final class ihz {
    public final long a;

    public static final float a(long j) {
        return Float.intBitsToFloat((int) (j & 4294967295L));
    }

    public static final float b(long j) {
        return Math.min(Float.intBitsToFloat((int) ((j >> 32) & 2147483647L)), Float.intBitsToFloat((int) (j & 2147483647L)));
    }

    public static final float c(long j) {
        return Float.intBitsToFloat((int) (j >> 32));
    }

    public static String d(long j) {
        if (j == 9205357640488583168L) {
            return "Size.Unspecified";
        }
        return "Size(" + iho.a(Float.intBitsToFloat((int) (j >> 32))) + ", " + iho.a(Float.intBitsToFloat((int) (j & 4294967295L))) + ')';
    }

    public static boolean e(long j, Object obj) {
        return (obj instanceof ihz) && j == ((ihz) obj).a;
    }

    public static final boolean f(long j, long j2) {
        return j == j2;
    }

    public static final boolean g(long j) {
        long j2 = (~(-(((-9223372034707292160L) & j) >>> 31))) & j;
        return (((j2 & 4294967295L) & (j2 >>> 32)) == 0) | (j == 9205357640488583168L);
    }

    public final boolean equals(Object obj) {
        return e(this.a, obj);
    }

    public final int hashCode() {
        return ihy.a(this.a);
    }

    public final String toString() {
        return d(this.a);
    }
}
