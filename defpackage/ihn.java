package defpackage;

/* compiled from: PG */
@fdac
/* loaded from: classes.dex */
public final class ihn {
    public static String a(long j) {
        int i = (int) (4294967295L & j);
        int i2 = (int) (j >> 32);
        if (Float.intBitsToFloat(i2) == Float.intBitsToFloat(i)) {
            return "CornerRadius.circular(" + iho.a(Float.intBitsToFloat(i2)) + ')';
        }
        return "CornerRadius.elliptical(" + iho.a(Float.intBitsToFloat(i2)) + ", " + iho.a(Float.intBitsToFloat(i)) + ')';
    }

    public static final boolean b(long j, long j2) {
        return j == j2;
    }

    public final boolean equals(Object obj) {
        throw null;
    }

    public final int hashCode() {
        throw null;
    }

    public final String toString() {
        throw null;
    }
}
