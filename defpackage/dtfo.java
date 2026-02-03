package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dtfo {
    public static final gru a(long j, long j2, long j3, long j4, hml hmlVar, int i) {
        long jF;
        long j5;
        long j6;
        hmlVar.v(1572031674);
        long j7 = (i & 1) != 0 ? ije.g : j;
        long jC = (i & 2) != 0 ? dtdu.c(19, hmlVar) : j2;
        long jC2 = (i & 4) != 0 ? dtdu.c(19, hmlVar) : 0L;
        long jC3 = (i & 8) != 0 ? dtdu.c(19, hmlVar) : 0L;
        long j8 = (i & 16) != 0 ? ije.g : j3;
        if ((i & 32) != 0) {
            long jC4 = dtdu.c(18, hmlVar);
            jF = ijg.f(ije.d(jC4), ije.c(jC4), ije.b(jC4), 0.38f, ije.f(jC4));
        } else {
            jF = j4;
        }
        long jC5 = dtdu.c(18, hmlVar);
        long jF2 = ijg.f(ije.d(jC5), ije.c(jC5), ije.b(jC5), 0.38f, ije.f(jC5));
        long jC6 = dtdu.c(18, hmlVar);
        long jF3 = ijg.f(ije.d(jC6), ije.c(jC6), ije.b(jC6), 0.38f, ije.f(jC6));
        long jC7 = dtdu.c(32, hmlVar);
        long jC8 = dtdu.c(18, hmlVar);
        long jF4 = ijg.f(ije.d(jC8), ije.c(jC8), ije.b(jC8), 0.12f, ije.f(jC8));
        long jC9 = dtdu.c(15, hmlVar);
        long jC10 = dtdu.c(26, hmlVar);
        long jC11 = dtdu.c(15, hmlVar);
        gda gdaVarA = glz.a(hmlVar);
        gru gruVar = gdaVarA.Q;
        if (gruVar == null) {
            long j9 = ije.g;
            long jF5 = gdd.f(gdaVarA, 19);
            long jF6 = gdd.f(gdaVarA, 19);
            long jF7 = gdd.f(gdaVarA, 19);
            long jF8 = gdd.f(gdaVarA, 18);
            long jF9 = ijg.f(ije.d(jF8), ije.c(jF8), ije.b(jF8), 0.38f, ije.f(jF8));
            long jF10 = gdd.f(gdaVarA, 18);
            long jF11 = ijg.f(ije.d(jF10), ije.c(jF10), ije.b(jF10), 0.38f, ije.f(jF10));
            long jF12 = gdd.f(gdaVarA, 18);
            long jF13 = ijg.f(ije.d(jF12), ije.c(jF12), ije.b(jF12), 0.38f, ije.f(jF12));
            long jF14 = gdd.f(gdaVarA, 32);
            long jF15 = gdd.f(gdaVarA, 18);
            gruVar = new gru(j9, jF5, jF6, jF7, j9, jF9, jF11, jF13, jF14, ijg.f(ije.d(jF15), ije.c(jF15), ije.b(jF15), 0.12f, ije.f(jF15)), gdd.f(gdaVarA, 15), gdd.f(gdaVarA, 26), gdd.f(gdaVarA, 15));
            gdaVarA.Q = gruVar;
            long j10 = jC2;
            j5 = jC3;
            j6 = j10;
            j7 = j7;
        } else {
            long j11 = jC2;
            j5 = jC3;
            j6 = j11;
        }
        gru gruVarA = gruVar.a(j7, jC, j6, j5, j8, jF, jF2, jF3, jC7, jF4, jC9, jC10, jC11);
        ((hmw) hmlVar).ab();
        return gruVarA;
    }
}
