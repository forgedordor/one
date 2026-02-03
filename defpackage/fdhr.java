package defpackage;

/* compiled from: PG */
@fdac
/* loaded from: classes6.dex */
public final class fdhr implements Comparable {
    private final long a;

    public static long b(long j) {
        int i = fdhq.a;
        long jB = fdhq.b();
        fdhl fdhlVar = fdhl.a;
        fdhlVar.getClass();
        return (((-1) + j) | 1) == Long.MAX_VALUE ? fdhi.m(fdhp.a(j)) : fdhp.b(jB, j, fdhlVar);
    }

    public static final long c(long j, long j2) {
        int i = fdhq.a;
        fdhl fdhlVar = fdhl.a;
        fdhlVar.getClass();
        if (((j2 - 1) | 1) != Long.MAX_VALUE) {
            return (((-1) + j) | 1) == Long.MAX_VALUE ? fdhp.a(j) : fdhp.b(j, j2, fdhlVar);
        }
        if (j != j2) {
            return fdhi.m(fdhp.a(j2));
        }
        long j3 = fdhi.a;
        return 0L;
    }

    public final long a() {
        return b(this.a);
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        fdhr fdhrVar = (fdhr) obj;
        fdhrVar.getClass();
        long jC = c(this.a, fdhrVar.a);
        long j = fdhi.a;
        return fdhi.a(jC, 0L);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof fdhr) && this.a == ((fdhr) obj).a;
    }

    public final int hashCode() {
        long j = this.a;
        return (int) (j ^ (j >>> 32));
    }

    public final String toString() {
        return "ValueTimeMark(reading=" + this.a + ")";
    }
}
