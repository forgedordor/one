package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eims {
    public static long a(long j, long j2) {
        long j3 = (j ^ j2) & Long.MAX_VALUE;
        if (j3 == 0) {
            return 1L;
        }
        return j3;
    }

    public static long b(eiii eiiiVar) {
        return a(eiiiVar.c, eiiiVar.d);
    }
}
