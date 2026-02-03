package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dtil {
    public static final ehc a(hml hmlVar) {
        hmlVar.v(1869139029);
        efr efrVar = new efr(ehv.g(hmlVar), 31);
        ((hmw) hmlVar).ab();
        return efrVar;
    }

    public static final hck b(long j, long j2, long j3, long j4, long j5, hml hmlVar, int i) {
        hmlVar.v(-391385678);
        long jC = (i & 1) != 0 ? dtdu.c(35, hmlVar) : j;
        long jC2 = (i & 2) != 0 ? dtdu.c(37, hmlVar) : j2;
        long jC3 = (i & 4) != 0 ? dtdu.c(18, hmlVar) : j3;
        long jC4 = (i & 8) != 0 ? dtdu.c(18, hmlVar) : j4;
        long jC5 = (i & 16) != 0 ? dtdu.c(19, hmlVar) : 0L;
        long jC6 = (i & 32) != 0 ? dtdu.c(19, hmlVar) : j5;
        gda gdaVarA = glz.a(hmlVar);
        hck hckVar = gdaVarA.R;
        if (hckVar == null) {
            hckVar = new hck(gdd.f(gdaVarA, 35), gdd.f(gdaVarA, 37), gdd.f(gdaVarA, 18), gdd.f(gdaVarA, 18), gdd.f(gdaVarA, 19), gdd.f(gdaVarA, 19));
            gdaVarA.R = hckVar;
        }
        if (jC == 16) {
            jC = hckVar.a;
        }
        long j6 = jC;
        if (jC2 == 16) {
            jC2 = hckVar.b;
        }
        long j7 = jC2;
        if (jC3 == 16) {
            jC3 = hckVar.c;
        }
        long j8 = jC3;
        if (jC4 == 16) {
            jC4 = hckVar.d;
        }
        long j9 = jC4;
        if (jC5 == 16) {
            jC5 = hckVar.e;
        }
        hck hckVar2 = new hck(j6, j7, j8, j9, jC5, jC6 != 16 ? jC6 : hckVar.f);
        hmlVar.o();
        return hckVar2;
    }
}
