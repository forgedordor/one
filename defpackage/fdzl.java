package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final /* synthetic */ class fdzl {
    public static final int a(String str, int i, int i2, int i3) {
        return (int) b(str, i, i2, i3);
    }

    public static final long b(String str, long j, long j2, long j3) {
        String strA = fdzk.a(str);
        if (strA == null) {
            return j;
        }
        Long lH = fdgn.h(strA);
        if (lH == null) {
            throw new IllegalStateException(a.d(strA, str, "System property '", "' has unrecognized value '", "'"));
        }
        long jLongValue = lH.longValue();
        if (j2 <= jLongValue && jLongValue <= j3) {
            return jLongValue;
        }
        throw new IllegalStateException("System property '" + str + "' should be in range " + j2 + ".." + j3 + ", but is '" + jLongValue + "'");
    }

    public static final boolean c(String str, boolean z) {
        String strA = fdzk.a(str);
        return strA != null ? Boolean.parseBoolean(strA) : z;
    }
}
