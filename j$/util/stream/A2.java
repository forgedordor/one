package j$.util.stream;

import j$.util.Spliterator;

/* loaded from: classes9.dex */
public abstract class A2 {
    public static long a(long j, long j2, long j3) {
        if (j >= 0) {
            return Math.max(-1L, Math.min(j - j2, j3));
        }
        return -1L;
    }

    public static Spliterator b(EnumC0099j3 enumC0099j3, Spliterator spliterator, long j, long j2) {
        long jC = c(j, j2);
        int i = AbstractC0172y2.a[enumC0099j3.ordinal()];
        if (i == 1) {
            return new C3(spliterator, j, jC);
        }
        if (i == 2) {
            return new C0178z3((Spliterator.OfInt) spliterator, j, jC);
        }
        if (i == 3) {
            return new A3((Spliterator.OfLong) spliterator, j, jC);
        }
        if (i == 4) {
            return new C0173y3((Spliterator.OfDouble) spliterator, j, jC);
        }
        throw new IllegalStateException("Unknown shape ".concat(String.valueOf(enumC0099j3)));
    }

    public static long c(long j, long j2) {
        long j3 = j2 >= 0 ? j + j2 : Long.MAX_VALUE;
        if (j3 >= 0) {
            return j3;
        }
        return Long.MAX_VALUE;
    }

    public static int d(long j) {
        return (j != -1 ? EnumC0094i3.u : 0) | EnumC0094i3.t;
    }

    public static C0167x2 e(AbstractC0164x abstractC0164x, long j, long j2) {
        if (j >= 0) {
            return new C0167x2(abstractC0164x, d(j2), j, j2);
        }
        throw new IllegalArgumentException("Skip must be non-negative: " + j);
    }

    public static C0147t2 f(AbstractC0066d0 abstractC0066d0, long j, long j2) {
        if (j >= 0) {
            return new C0147t2(abstractC0066d0, d(j2), j, j2);
        }
        throw new IllegalArgumentException("Skip must be non-negative: " + j);
    }

    public static C0157v2 g(AbstractC0111m0 abstractC0111m0, long j, long j2) {
        if (j >= 0) {
            return new C0157v2(abstractC0111m0, d(j2), j, j2);
        }
        throw new IllegalArgumentException("Skip must be non-negative: " + j);
    }

    public static C0137r2 h(AbstractC0093i2 abstractC0093i2, long j, long j2) {
        if (j >= 0) {
            return new C0137r2(abstractC0093i2, d(j2), j, j2);
        }
        throw new IllegalArgumentException("Skip must be non-negative: " + j);
    }
}
