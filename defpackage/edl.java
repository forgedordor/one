package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class edl {
    private static final ixm a = new edn(ecr.c, ibw.j);

    public static final ixm a(ecq ecqVar, ibx ibxVar, hml hmlVar, int i) {
        if (fdbq.f(ecqVar, ecr.c) && fdbq.f(ibxVar, ibw.j)) {
            hmlVar.v(-1446570776);
            hmlVar.o();
            return a;
        }
        hmlVar.v(-1446516929);
        boolean z = ((((i & 14) ^ 6) > 4 && hmlVar.D(ecqVar)) || (i & 6) == 4) | ((((i & 112) ^ 48) > 32 && hmlVar.D(ibxVar)) || (i & 48) == 32);
        Object objF = hmlVar.f();
        if (z || objF == hmk.a) {
            objF = new edn(ecqVar, ibxVar);
            hmlVar.y(objF);
        }
        edn ednVar = (edn) objF;
        hmlVar.o();
        return ednVar;
    }
}
