package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dtex {
    public static final gru a(long j, long j2, long j3, hml hmlVar, int i) {
        long jF;
        long jF2;
        long jF3;
        hmlVar.v(1329529049);
        long j4 = (i & 1) != 0 ? ije.g : 0L;
        long jC = (i & 2) != 0 ? dtdu.c(19, hmlVar) : 0L;
        long jC2 = (i & 4) != 0 ? dtdu.c(26, hmlVar) : 0L;
        long j5 = (i & 8) != 0 ? ije.g : 0L;
        if ((i & 16) != 0) {
            long jC3 = dtdu.c(18, hmlVar);
            jF = ijg.f(ije.d(jC3), ije.c(jC3), ije.b(jC3), 0.38f, ije.f(jC3));
        } else {
            jF = 0;
        }
        if ((i & 32) != 0) {
            long jC4 = dtdu.c(18, hmlVar);
            jF2 = ijg.f(ije.d(jC4), ije.c(jC4), ije.b(jC4), 0.38f, ije.f(jC4));
        } else {
            jF2 = 0;
        }
        long j6 = (i & 64) != 0 ? jF2 : 0L;
        long jC5 = (i & 128) != 0 ? dtdu.c(32, hmlVar) : j;
        if ((i & 256) != 0) {
            long jC6 = dtdu.c(18, hmlVar);
            jF3 = ijg.f(ije.d(jC6), ije.c(jC6), ije.b(jC6), 0.12f, ije.f(jC6));
        } else {
            jF3 = 0;
        }
        long jC7 = (i & 512) != 0 ? dtdu.c(15, hmlVar) : j2;
        long jC8 = (i & 1024) != 0 ? dtdu.c(15, hmlVar) : j3;
        gda gdaVarA = glz.a(hmlVar);
        gru gruVar = gdaVarA.P;
        if (gruVar == null) {
            long j7 = ije.g;
            long jF4 = gdd.f(gdaVarA, 19);
            long jF5 = gdd.f(gdaVarA, 26);
            long jF6 = gdd.f(gdaVarA, 19);
            long jF7 = gdd.f(gdaVarA, 18);
            long jF8 = ijg.f(ije.d(jF7), ije.c(jF7), ije.b(jF7), 0.38f, ije.f(jF7));
            long jF9 = gdd.f(gdaVarA, 18);
            long jF10 = ijg.f(ije.d(jF9), ije.c(jF9), ije.b(jF9), 0.38f, ije.f(jF9));
            long jF11 = gdd.f(gdaVarA, 18);
            long jF12 = ijg.f(ije.d(jF11), ije.c(jF11), ije.b(jF11), 0.38f, ije.f(jF11));
            long jF13 = gdd.f(gdaVarA, 32);
            long jF14 = gdd.f(gdaVarA, 18);
            gruVar = new gru(j7, jF4, jF5, jF6, j7, jF8, jF10, jF12, jF13, ijg.f(ije.d(jF14), ije.c(jF14), ije.b(jF14), 0.12f, ije.f(jF14)), gdd.f(gdaVarA, 15), gdd.f(gdaVarA, 15), gdd.f(gdaVarA, 15));
            gdaVarA.P = gruVar;
        }
        gru gruVarA = gruVar.a(j4, jC, jC2, jC2, j5, jF, jF2, j6, jC5, jF3, jC7, jC8, jC8);
        ((hmw) hmlVar).ab();
        return gruVarA;
    }
}
