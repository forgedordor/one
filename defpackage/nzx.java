package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class nzx implements nzw {
    private final nnu a;
    private final nox b;
    private final nzz c;
    private final mau d;
    private final int e;
    private long f;
    private int g;
    private long h;

    public nzx(nnu nnuVar, nox noxVar, nzz nzzVar, String str, int i) throws mby {
        this.a = nnuVar;
        this.b = noxVar;
        this.c = nzzVar;
        int i2 = nzzVar.b * nzzVar.e;
        int i3 = nzzVar.d;
        int i4 = i2 / 8;
        if (i3 != i4) {
            throw new mby(a.s(i3, i4, "Expected block size: ", "; got: "), null, true, 1);
        }
        int i5 = nzzVar.c * i4;
        int i6 = i5 * 8;
        int iMax = Math.max(i4, i5 / 10);
        this.e = iMax;
        mat matVar = new mat();
        matVar.a("audio/wav");
        matVar.c(str);
        matVar.h = i6;
        matVar.i = i6;
        matVar.n = iMax;
        matVar.E = nzzVar.b;
        matVar.F = nzzVar.c;
        matVar.G = i;
        this.d = new mau(matVar);
    }

    @Override // defpackage.nzw
    public final void a(int i, long j) {
        this.a.w(new oac(this.c, 1, i, j));
        nox noxVar = this.b;
        noxVar.i(this.d);
        noxVar.v();
    }

    @Override // defpackage.nzw
    public final void b(long j) {
        this.f = j;
        this.g = 0;
        this.h = 0L;
    }

    @Override // defpackage.nzw
    public final boolean c(nns nnsVar, long j) {
        int i;
        int i2;
        long j2 = j;
        while (j2 > 0 && (i = this.g) < (i2 = this.e)) {
            int iE = this.b.e(nnsVar, (int) Math.min(i2 - i, j2), true);
            if (iE == -1) {
                j2 = 0;
            } else {
                this.g += iE;
                j2 -= iE;
            }
        }
        nzz nzzVar = this.c;
        int i3 = this.g;
        int i4 = nzzVar.d;
        int i5 = i3 / i4;
        if (i5 > 0) {
            long jY = this.f + mgb.y(this.h, 1000000L, nzzVar.c);
            int i6 = i5 * i4;
            int i7 = this.g - i6;
            this.b.o(jY, 1, i6, i7, null);
            this.h += i5;
            this.g = i7;
        }
        return j2 <= 0;
    }
}
