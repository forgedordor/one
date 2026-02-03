package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fdhp {
    public static final long a(long j) {
        return j < 0 ? fdhi.b : fdhi.a;
    }

    public static final long b(long j, long j2, fdhl fdhlVar) {
        long j3 = j - j2;
        if (((~(j3 ^ j2)) & (j3 ^ j)) >= 0) {
            return fdhk.g(j3, fdhlVar);
        }
        fdhl fdhlVar2 = fdhl.c;
        if (fdhlVar.compareTo(fdhlVar2) >= 0) {
            return fdhi.m(a(j3));
        }
        long jB = fdhm.b(1L, fdhlVar2, fdhlVar);
        long j4 = (j / jB) - (j2 / jB);
        long j5 = (j % jB) - (j2 % jB);
        long j6 = fdhi.a;
        return fdhi.j(fdhk.g(j4, fdhlVar2), fdhk.g(j5, fdhlVar));
    }
}
