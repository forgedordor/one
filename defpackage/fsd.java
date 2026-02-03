package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fsd {
    public static final hpt a = new hnz(hsi.a, new fdae() { // from class: fsc
        @Override // defpackage.fdae
        public final Object invoke() {
            hpt hptVar = fsd.a;
            return new fsb(ije.h);
        }
    });
    public static final fwx b;
    public static final fwx c;
    public static final fwx d;
    private static final fsf e;
    private static final fsf f;

    static {
        long j = ije.h;
        e = new fsf(true, Float.NaN, j);
        f = new fsf(false, Float.NaN, j);
        b = new fwx(0.16f, 0.24f, 0.08f, 0.24f);
        c = new fwx(0.08f, 0.12f, 0.04f, 0.12f);
        d = new fwx(0.08f, 0.12f, 0.04f, 0.1f);
    }

    public static /* synthetic */ dnk a(boolean z, float f2, int i) {
        int i2 = i & 2;
        long j = ije.h;
        if (i2 != 0) {
            f2 = Float.NaN;
        }
        boolean zB = kir.b(f2, Float.NaN);
        int i3 = (z ? 1 : 0) | (i & 1);
        if (zB && fcts.a(j, j)) {
            return i3 != 0 ? e : f;
        }
        return new fsf(1 == i3, f2, j);
    }
}
