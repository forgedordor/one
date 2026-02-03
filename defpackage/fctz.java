package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fctz {
    public static final double a(long j) {
        return j + 0.0d;
    }

    public static final String b(long j, int i) {
        if (j >= 0) {
            String string = Long.toString(j, i);
            string.getClass();
            return string;
        }
        long j2 = i;
        long j3 = (j >>> 1) / j2;
        long j4 = j3 + j3;
        long j5 = j - (j4 * j2);
        if (j5 >= j2) {
            j4++;
            j5 -= j2;
        }
        String string2 = Long.toString(j4, i);
        string2.getClass();
        String string3 = Long.toString(j5, i);
        string3.getClass();
        return string2.concat(string3);
    }
}
