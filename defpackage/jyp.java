package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jyp {
    public static final long a(int i, int i2) {
        if (i < 0 || i2 < 0) {
            kfq.b("start and end cannot be negative. [start: " + i + ", end: " + i2 + ']');
        }
        return (i2 & 4294967295L) | (i << 32);
    }

    public static final long b(long j, int i) {
        int iA = jyo.a(j);
        if (iA < 0) {
            iA = 0;
        }
        if (iA > i) {
            iA = i;
        }
        int iE = jyo.e(j);
        int i2 = iE >= 0 ? iE : 0;
        if (i2 <= i) {
            i = i2;
        }
        return (i == jyo.e(j) && iA == jyo.a(j)) ? j : a(i, iA);
    }
}
