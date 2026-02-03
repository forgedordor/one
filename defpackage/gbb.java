package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gbb {
    public static final gba a(long j, long j2, long j3, long j4, hml hmlVar) {
        gda gdaVarA = glz.a(hmlVar);
        gba gbaVar = gdaVarA.N;
        if (gbaVar == null) {
            long jF = gdd.f(gdaVarA, 39);
            long jA = gdd.a(gdaVarA, gdd.f(gdaVarA, 39));
            long jF2 = gdd.f(gdaVarA, 44);
            long jH = ijg.h(ijg.f(ije.d(jF2), ije.c(jF2), ije.b(jF2), 0.38f, ije.f(jF2)), gdd.f(gdaVarA, 39));
            long jA2 = gdd.a(gdaVarA, gdd.f(gdaVarA, 39));
            gba gbaVar2 = new gba(jF, jA, jH, ijg.f(ije.d(jA2), ije.c(jA2), ije.b(jA2), 0.38f, ije.f(jA2)));
            gdaVarA.N = gbaVar2;
            gbaVar = gbaVar2;
        }
        return new gba(j != 16 ? j : gbaVar.a, j2 != 16 ? j2 : gbaVar.b, j3 != 16 ? j3 : gbaVar.c, j4 != 16 ? j4 : gbaVar.d);
    }
}
