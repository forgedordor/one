package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class grb {
    public static final hpt a = new hnz(hsi.a, new fdae() { // from class: gra
        @Override // defpackage.fdae
        public final Object invoke() {
            hpt hptVar = grb.a;
            return new gqy(ije.h);
        }
    });
    private static final grd b;
    private static final grd c;

    static {
        long j = ije.h;
        b = new grd(true, Float.NaN, j);
        c = new grd(false, Float.NaN, j);
    }

    public static /* synthetic */ dnk a(boolean z, float f, long j, int i) {
        if ((i & 4) != 0) {
            j = ije.h;
        }
        if ((i & 2) != 0) {
            f = Float.NaN;
        }
        int i2 = (z ? 1 : 0) | (i & 1);
        if (kir.b(f, Float.NaN) && fcts.a(j, ije.h)) {
            return i2 != 0 ? b : c;
        }
        return new grd(1 == i2, f, j);
    }
}
