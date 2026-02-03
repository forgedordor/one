package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fdhk {
    public static final long a(long j) {
        long j2 = fdhi.a;
        int i = fdhj.a;
        return j + j + 1;
    }

    public static final long b(long j) {
        if (j < -4611686018426L || j >= 4611686018427L) {
            return a(fddu.m(j, -4611686018427387903L, 4611686018427387903L));
        }
        long j2 = fdhi.a;
        int i = fdhj.a;
        long jD = d(j);
        return jD + jD;
    }

    public static final long c(long j) {
        if (j < -4611686018426999999L || j >= 4611686018427000000L) {
            return a(e(j));
        }
        long j2 = fdhi.a;
        int i = fdhj.a;
        return j + j;
    }

    public static final long d(long j) {
        return j * 1000000;
    }

    public static final long e(long j) {
        return j / 1000000;
    }

    public static final long f(int i, fdhl fdhlVar) {
        fdhlVar.getClass();
        long j = i;
        if (fdhlVar.compareTo(fdhl.d) > 0) {
            return g(j, fdhlVar);
        }
        long jC = fdhm.c(j, fdhlVar, fdhl.a);
        long j2 = fdhi.a;
        int i2 = fdhj.a;
        return jC + jC;
    }

    public static final long g(long j, fdhl fdhlVar) {
        fdhlVar.getClass();
        fdhl fdhlVar2 = fdhl.a;
        long jC = fdhm.c(4611686018426999999L, fdhlVar2, fdhlVar);
        if ((-jC) > j || j > jC) {
            return a(fddu.m(fdhm.b(j, fdhlVar, fdhl.c), -4611686018427387903L, 4611686018427387903L));
        }
        long jC2 = fdhm.c(j, fdhlVar, fdhlVar2);
        long j2 = fdhi.a;
        int i = fdhj.a;
        return jC2 + jC2;
    }
}
