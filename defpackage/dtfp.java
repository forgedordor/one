package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dtfp {
    public static final gku a(long j, hml hmlVar, int i) {
        long j2;
        hmlVar.v(408210655);
        long jC = (i & 1) != 0 ? dtdu.c(35, hmlVar) : j;
        long jC2 = dtdu.c(18, hmlVar);
        long jC3 = dtdu.c(19, hmlVar);
        long jC4 = dtdu.c(19, hmlVar);
        long jC5 = dtdu.c(19, hmlVar);
        long jC6 = dtdu.c(19, hmlVar);
        long jC7 = dtdu.c(18, hmlVar);
        long jF = ijg.f(ije.d(jC7), ije.c(jC7), ije.b(jC7), 0.38f, ije.f(jC7));
        long j3 = jC;
        long jC8 = dtdu.c(18, hmlVar);
        long jF2 = ijg.f(ije.d(jC8), ije.c(jC8), ije.b(jC8), 0.38f, ije.f(jC8));
        long jC9 = dtdu.c(18, hmlVar);
        long jF3 = ijg.f(ije.d(jC9), ije.c(jC9), ije.b(jC9), 0.38f, ije.f(jC9));
        gda gdaVarA = glz.a(hmlVar);
        gku gkuVar = gdaVarA.Y;
        if (gkuVar == null) {
            long jF4 = gdd.f(gdaVarA, 35);
            long jF5 = gdd.f(gdaVarA, 18);
            long jF6 = gdd.f(gdaVarA, 19);
            long jF7 = gdd.f(gdaVarA, 19);
            long jF8 = gdd.f(gdaVarA, 19);
            long jF9 = gdd.f(gdaVarA, 19);
            j2 = jF3;
            long jF10 = gdd.f(gdaVarA, 18);
            long jF11 = ijg.f(ije.d(jF10), ije.c(jF10), ije.b(jF10), 0.38f, ije.f(jF10));
            long jF12 = gdd.f(gdaVarA, 18);
            long jF13 = ijg.f(ije.d(jF12), ije.c(jF12), ije.b(jF12), 0.38f, ije.f(jF12));
            long jF14 = gdd.f(gdaVarA, 18);
            gkuVar = new gku(jF4, jF5, jF6, jF7, jF8, jF9, jF11, jF13, ijg.f(ije.d(jF14), ije.c(jF14), ije.b(jF14), 0.38f, ije.f(jF14)));
            gdaVarA.Y = gkuVar;
        } else {
            j2 = jF3;
        }
        long j4 = j3 != 16 ? j3 : gkuVar.a;
        if (jC2 == 16) {
            jC2 = gkuVar.b;
        }
        long j5 = jC2;
        long j6 = jC3 == 16 ? gkuVar.c : jC3;
        if (jC4 == 16) {
            jC4 = gkuVar.d;
        }
        long j7 = jC4;
        if (jC5 == 16) {
            jC5 = gkuVar.e;
        }
        long j8 = jC5;
        if (jC6 == 16) {
            jC6 = gkuVar.f;
        }
        long j9 = jC6;
        if (jF == 16) {
            jF = gkuVar.g;
        }
        gku gkuVar2 = new gku(j4, j5, j6, j7, j8, j9, jF, jF2 != 16 ? jF2 : gkuVar.h, j2 != 16 ? j2 : gkuVar.i);
        ((hmw) hmlVar).ab();
        return gkuVar2;
    }
}
