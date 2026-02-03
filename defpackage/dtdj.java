package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dtdj {
    public static final gbf a(hml hmlVar) {
        hmlVar.v(-347913265);
        gbf gbfVar = new gbf(1.0f);
        ((hmw) hmlVar).ab();
        return gbfVar;
    }

    public static final gba b(long j, long j2, hml hmlVar, int i) {
        long jH;
        hmlVar.v(-860673981);
        if ((i & 1) != 0) {
            j = dtdu.c(39, hmlVar);
        }
        long j3 = j;
        if ((i & 2) != 0) {
            j2 = dtdu.a(j3, hmlVar);
        }
        long j4 = j2;
        long jC = dtdu.c(43, hmlVar);
        long jF = ijg.f(ije.d(jC), ije.c(jC), ije.b(jC), 0.38f, ije.f(jC));
        gda gdaVarA = glz.a(hmlVar);
        gdaVarA.getClass();
        if (kir.b(0.0f, 0.0f)) {
            jH = gdaVarA.p;
        } else {
            float fLog = (float) Math.log(1.0d);
            long j5 = gdaVarA.t;
            jH = ijg.h(ijg.f(ije.d(j5), ije.c(j5), ije.b(j5), ((fLog * 4.5f) + 2.0f) / 100.0f, ije.f(j5)), gdaVarA.p);
        }
        long jH2 = ijg.h(jF, jH);
        long jA = dtdu.a(j3, hmlVar);
        gba gbaVarA = gbb.a(j3, j4, jH2, ijg.f(ije.d(jA), ije.c(jA), ije.b(jA), 0.38f, ije.f(jA)), hmlVar);
        hmlVar.o();
        return gbaVarA;
    }
}
