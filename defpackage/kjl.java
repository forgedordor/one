package defpackage;

/* compiled from: PG */
@fdac
/* loaded from: classes.dex */
public final class kjl {
    public final long b;
    private static final kjn[] c = {new kjn(0), new kjn(4294967296L), new kjn(8589934592L)};
    public static final long a = kjm.d(0, Float.NaN);

    public static final float a(long j) {
        return Float.intBitsToFloat((int) (j & 4294967295L));
    }

    public static final long b(long j) {
        return j & 1095216660480L;
    }

    public static final long c(long j) {
        return c[(int) (b(j) >>> 32)].a;
    }

    public static String d(long j) {
        long jC = c(j);
        if (kjn.b(jC, 0L)) {
            return "Unspecified";
        }
        if (kjn.b(jC, 4294967296L)) {
            return a(j) + ".sp";
        }
        if (!kjn.b(jC, 8589934592L)) {
            return "Invalid";
        }
        return a(j) + ".em";
    }

    public static final boolean e(long j, long j2) {
        return j == j2;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof kjl) && this.b == ((kjl) obj).b;
    }

    public final int hashCode() {
        return kjk.a(this.b);
    }

    public final String toString() {
        return d(this.b);
    }
}
