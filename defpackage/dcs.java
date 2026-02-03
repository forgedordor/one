package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dcs {
    private static final dgi a = dea.b(0.0f, 0.0f, null, 7);

    public static final ddp a(long j) {
        return new ddp(new ije(j), (dib) cys.a.invoke(ije.f(j)), null, 12);
    }

    public static final hsf b(long j, ddz ddzVar, hml hmlVar, int i, int i2) {
        if ((i2 & 2) != 0) {
            ddzVar = a;
        }
        ddz ddzVar2 = ddzVar;
        boolean zD = hmlVar.D(ije.f(j));
        Object objF = hmlVar.f();
        if (zD || objF == hmk.a) {
            objF = cys.a.invoke(ije.f(j));
            hmlVar.y(objF);
        }
        return ddu.a(new ije(j), (dib) objF, ddzVar2, null, null, hmlVar, (i & 14) | ((i << 3) & 896) | (57344 & (i << 6)), 8);
    }
}
