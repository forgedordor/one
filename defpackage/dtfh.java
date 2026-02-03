package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dtfh {
    public static final gjk a(long j, long j2, hml hmlVar, int i) {
        hmlVar.v(1183243193);
        if ((i & 1) != 0) {
            j = dtdu.c(26, hmlVar);
        }
        long j3 = j;
        if ((i & 2) != 0) {
            j2 = dtdu.a(j3, hmlVar);
        }
        long jC = dtdu.c(18, hmlVar);
        long jF = ijg.f(ije.d(jC), ije.c(jC), ije.b(jC), 0.1f, ije.f(jC));
        long jC2 = dtdu.c(18, hmlVar);
        long jF2 = ijg.f(ije.d(jC2), ije.c(jC2), ije.b(jC2), 0.38f, ije.f(jC2));
        gjk gjkVarC = gjm.b(glz.a(hmlVar)).c(j3, j2, jF, jF2);
        ((hmw) hmlVar).ab();
        return gjkVarC;
    }

    public static final gjk b(long j, long j2, long j3, hml hmlVar, int i) {
        hmlVar.v(518957819);
        if ((i & 1) != 0) {
            j = ije.g;
        }
        long j4 = j;
        if ((i & 2) != 0) {
            j2 = ((ije) hmlVar.e(gea.a)).i;
        }
        long j5 = j2;
        long j6 = (i & 4) != 0 ? ije.g : 0L;
        if ((i & 8) != 0) {
            j3 = ijg.f(ije.d(j5), ije.c(j5), ije.b(j5), 0.38f, ije.f(j5));
        }
        gjk gjkVarD = gjm.d(j4, j5, j6, j3, hmlVar, 0);
        ((hmw) hmlVar).ab();
        return gjkVarD;
    }
}
