package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class egk {
    private static final ixm a = new egm(ecr.a, ibw.m);

    public static final ixm a(eci eciVar, icc iccVar, hml hmlVar, int i) {
        if (fdbq.f(eciVar, ecr.a) && fdbq.f(iccVar, ibw.m)) {
            hmlVar.v(-1073796759);
            hmlVar.o();
            return a;
        }
        hmlVar.v(-1073745888);
        boolean z = ((((i & 14) ^ 6) > 4 && hmlVar.D(eciVar)) || (i & 6) == 4) | ((((i & 112) ^ 48) > 32 && hmlVar.D(iccVar)) || (i & 48) == 32);
        Object objF = hmlVar.f();
        if (z || objF == hmk.a) {
            objF = new egm(eciVar, iccVar);
            hmlVar.y(objF);
        }
        egm egmVar = (egm) objF;
        hmlVar.o();
        return egmVar;
    }

    public static final long b(boolean z, int i, int i2, int i3) {
        return !z ? kim.d(i, i2, 0, i3) : kik.b(i, i2, 0, i3);
    }
}
