package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class nzv implements nzw {
    private static final int[] a = {-1, -1, -1, -1, 2, 4, 6, 8, -1, -1, -1, -1, 2, 4, 6, 8};
    private static final int[] b = {7, 8, 9, 10, 11, 12, 13, 14, 16, 17, 19, 21, 23, 25, 28, 31, 34, 37, 41, 45, 50, 55, 60, 66, 73, 80, 88, 97, 107, 118, 130, 143, 157, 173, 190, 209, 230, 253, 279, 307, 337, 371, 408, 449, 494, 544, 598, 658, 724, 796, 876, 963, 1060, 1166, 1282, 1411, 1552, 1707, 1878, 2066, 2272, 2499, 2749, 3024, 3327, 3660, 4026, 4428, 4871, 5358, 5894, 6484, 7132, 7845, 8630, 9493, 10442, 11487, 12635, 13899, 15289, 16818, 18500, 20350, 22385, 24623, 27086, 29794, 32767};
    private final nnu c;
    private final nox d;
    private final nzz e;
    private final int f;
    private final byte[] g;
    private final mfr h;
    private final int i;
    private final mau j;
    private int k;
    private long l;
    private int m;
    private long n;

    public nzv(nnu nnuVar, nox noxVar, nzz nzzVar) throws mby {
        this.c = nnuVar;
        this.d = noxVar;
        this.e = nzzVar;
        int iMax = Math.max(1, nzzVar.c / 10);
        this.i = iMax;
        mfr mfrVar = new mfr(nzzVar.f);
        mfrVar.h();
        int iH = mfrVar.h();
        this.f = iH;
        int i = nzzVar.b;
        int i2 = (((nzzVar.d - (i * 4)) * 8) / (nzzVar.e * i)) + 1;
        if (iH != i2) {
            throw new mby(a.s(iH, i2, "Expected frames per block: ", "; got: "), null, true, 1);
        }
        int iC = mgb.c(iMax, iH);
        this.g = new byte[nzzVar.d * iC];
        this.h = new mfr(iC * (iH + iH) * i);
        int i3 = ((nzzVar.c * nzzVar.d) * 8) / iH;
        mat matVar = new mat();
        matVar.c("audio/raw");
        matVar.h = i3;
        matVar.i = i3;
        matVar.n = (iMax + iMax) * i;
        matVar.E = nzzVar.b;
        matVar.F = nzzVar.c;
        matVar.G = 2;
        this.j = new mau(matVar);
    }

    private final int d(int i) {
        int i2 = this.e.b;
        return i / (i2 + i2);
    }

    private final int e(int i) {
        return (i + i) * this.e.b;
    }

    private final void f(int i) {
        long jY = this.l + mgb.y(this.n, 1000000L, this.e.c);
        int iE = e(i);
        this.d.o(jY, 1, iE, this.m - iE, null);
        this.n += i;
        this.m -= iE;
    }

    @Override // defpackage.nzw
    public final void a(int i, long j) {
        this.c.w(new oac(this.e, this.f, i, j));
        nox noxVar = this.d;
        noxVar.i(this.j);
        noxVar.v();
    }

    @Override // defpackage.nzw
    public final void b(long j) {
        this.k = 0;
        this.l = j;
        this.m = 0;
        this.n = 0L;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0024  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x003b -> B:4:0x001f). Please report as a decompilation issue!!! */
    @Override // defpackage.nzw
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean c(defpackage.nns r27, long r28) {
        /*
            Method dump skipped, instructions count: 332
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nzv.c(nns, long):boolean");
    }
}
