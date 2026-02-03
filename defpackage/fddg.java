package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fddg {
    public static final int a(int i) {
        return 31 - Integer.numberOfLeadingZeros(i);
    }

    public static final int b(int i, int i2) {
        return (i >>> (32 - i2)) & ((-i2) >> 31);
    }

    public static final String c(Object obj, Object obj2) {
        return a.j(obj2, obj, "Random range is empty: [", ", ", ").");
    }

    public static final fddf d(long j) {
        return new fddh((int) j, (int) (j >> 32));
    }
}
