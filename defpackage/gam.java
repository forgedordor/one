package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gam {
    public static final egc a;
    public static final egc b;
    public static final float c;
    public static final float d;
    public static final float e;
    private static final float f;

    static {
        egd egdVar = new egd(24.0f, 8.0f, 24.0f, 8.0f);
        a = egdVar;
        new egd(16.0f, 8.0f, 24.0f, 8.0f);
        f = 12.0f;
        b = new egd(12.0f, egdVar.a, 12.0f, egdVar.b);
        new egd(12.0f, egdVar.a, 16.0f, egdVar.b);
        c = 58.0f;
        d = 40.0f;
        e = 8.0f;
    }

    public static final gal a(gda gdaVar) {
        gal galVar = gdaVar.K;
        if (galVar != null) {
            return galVar;
        }
        long jF = gdd.f(gdaVar, 26);
        long jF2 = gdd.f(gdaVar, 10);
        long jF3 = gdd.f(gdaVar, 18);
        long jF4 = ijg.f(ije.d(jF3), ije.c(jF3), ije.b(jF3), 0.1f, ije.f(jF3));
        long jF5 = gdd.f(gdaVar, 19);
        gal galVar2 = new gal(jF, jF2, jF4, ijg.f(ije.d(jF5), ije.c(jF5), ije.b(jF5), 0.38f, ije.f(jF5)));
        gdaVar.K = galVar2;
        return galVar2;
    }

    public static final gal b(gda gdaVar) {
        gal galVar = gdaVar.M;
        if (galVar != null) {
            return galVar;
        }
        long j = ije.g;
        long jF = gdd.f(gdaVar, 26);
        long jF2 = gdd.f(gdaVar, 19);
        gal galVar2 = new gal(j, jF, j, ijg.f(ije.d(jF2), ije.c(jF2), ije.b(jF2), 0.38f, ije.f(jF2)));
        gdaVar.M = galVar2;
        return galVar2;
    }

    public static final gal c(long j, long j2, long j3, long j4, hml hmlVar, int i) {
        if ((i & 1) != 0) {
            j = ije.h;
        }
        long j5 = j;
        if ((i & 2) != 0) {
            j2 = ije.h;
        }
        long j6 = j2;
        if ((i & 4) != 0) {
            j3 = ije.h;
        }
        return a(glz.a(hmlVar)).a(j5, j6, j3, (i & 8) != 0 ? ije.h : j4);
    }

    public static final gaq d(float f2, float f3, float f4, float f5, int i) {
        if ((i & 8) != 0) {
            f5 = 1.0f;
        }
        if ((i & 4) != 0) {
            f4 = 0.0f;
        }
        if ((i & 2) != 0) {
            f3 = 0.0f;
        }
        if (1 == (i & 1)) {
            f2 = 0.0f;
        }
        return new gaq(f2, f3, f4, f5);
    }

    public static final gal e(long j, long j2, hml hmlVar, int i) {
        if ((i & 1) != 0) {
            j = ije.h;
        }
        long j3 = j;
        long j4 = ije.h;
        return b(glz.a(hmlVar)).a(j3, j2, j4, j4);
    }
}
