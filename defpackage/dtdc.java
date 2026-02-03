package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dtdc {
    public static final egc a;
    public static final egc b;
    public static final float c;
    public static final float d;
    private static final float e;

    static {
        egd egdVar = new egd(24.0f, 8.0f, 24.0f, 8.0f);
        a = egdVar;
        new egd(16.0f, 8.0f, 24.0f, 8.0f);
        e = 12.0f;
        b = new egd(12.0f, egdVar.a, 12.0f, egdVar.b);
        new egd(12.0f, egdVar.a, 16.0f, egdVar.b);
        c = 18.0f;
        d = 8.0f;
    }

    public static final ikp a(hml hmlVar) {
        hmlVar.v(2031760353);
        ikp ikpVarB = dtgs.b(7, hmlVar);
        ((hmw) hmlVar).ab();
        return ikpVarB;
    }

    public static final gal b(long j, long j2, hml hmlVar, int i) {
        hmlVar.v(-1814124481);
        if ((i & 1) != 0) {
            j = dtdu.c(26, hmlVar);
        }
        long j3 = j;
        if ((i & 2) != 0) {
            j2 = dtdu.c(10, hmlVar);
        }
        long jC = dtdu.c(18, hmlVar);
        long jF = ijg.f(ije.d(jC), ije.c(jC), ije.b(jC), 0.1f, ije.f(jC));
        long jC2 = dtdu.c(18, hmlVar);
        long jF2 = ijg.f(ije.d(jC2), ije.c(jC2), ije.b(jC2), 0.38f, ije.f(jC2));
        egc egcVar = gam.a;
        gal galVarC = gam.c(j3, j2, jF, jF2, hmlVar, 0);
        ((hmw) hmlVar).ab();
        return galVarC;
    }

    public static final gaq c(float f, hml hmlVar, int i) {
        hmlVar.v(1410833095);
        egc egcVar = gam.a;
        if (1 == (i & 1)) {
            f = 1.0f;
        }
        gaq gaqVarD = gam.d(f, 1.0f, 1.0f, 1.0f, 0);
        hmlVar.o();
        return gaqVarD;
    }

    public static final gal d(hml hmlVar) {
        hmlVar.v(-1496735361);
        long jC = dtdu.c(32, hmlVar);
        long jC2 = dtdu.c(15, hmlVar);
        long jC3 = dtdu.c(18, hmlVar);
        long jF = ijg.f(ije.d(jC3), ije.c(jC3), ije.b(jC3), 0.1f, ije.f(jC3));
        long jC4 = dtdu.c(18, hmlVar);
        long jF2 = ijg.f(ije.d(jC4), ije.c(jC4), ije.b(jC4), 0.38f, ije.f(jC4));
        egc egcVar = gam.a;
        gal galVarC = gam.c(jC, jC2, jF, jF2, hmlVar, 0);
        ((hmw) hmlVar).ab();
        return galVarC;
    }

    public static final gal e(long j, long j2, hml hmlVar, int i) {
        hmlVar.v(1137425277);
        if ((i & 1) != 0) {
            j = ije.g;
        }
        long j3 = j;
        if ((i & 2) != 0) {
            j2 = dtdu.c(19, hmlVar);
        }
        long j4 = ije.g;
        long jC = dtdu.c(18, hmlVar);
        long jF = ijg.f(ije.d(jC), ije.c(jC), ije.b(jC), 0.38f, ije.f(jC));
        egc egcVar = gam.a;
        gal galVarC = gam.c(j3, j2, j4, jF, hmlVar, 0);
        ((hmw) hmlVar).ab();
        return galVarC;
    }

    public static final gal f(long j, hml hmlVar, int i) {
        hmlVar.v(1389225298);
        long j2 = (i & 1) != 0 ? ije.g : 0L;
        if ((i & 2) != 0) {
            j = dtdu.c(26, hmlVar);
        }
        long j3 = j;
        long j4 = ije.g;
        long jC = dtdu.c(18, hmlVar);
        long jF = ijg.f(ije.d(jC), ije.c(jC), ije.b(jC), 0.38f, ije.f(jC));
        egc egcVar = gam.a;
        gal galVarC = gam.c(j2, j3, j4, jF, hmlVar, 0);
        ((hmw) hmlVar).ab();
        return galVarC;
    }
}
