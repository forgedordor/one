package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nyt implements nyf {
    private String f;
    private nox g;
    private boolean j;
    private int l;
    private int m;
    private int o;
    private int p;
    private int t;
    private boolean v;
    private final String a = "video/mp2t";
    private int e = 0;
    private final mfr b = new mfr(new byte[15], 2);
    private final mfq c = new mfq();
    private final mfr d = new mfr();
    private final nyu q = new nyu();
    private int r = -2147483647;
    private int s = -1;
    private long u = -1;
    private boolean k = true;
    private boolean n = true;
    private double h = -9.223372036854776E18d;
    private double i = -9.223372036854776E18d;

    private static final void f(mfr mfrVar, mfr mfrVar2, boolean z) {
        int i = mfrVar.b;
        int iMin = Math.min(mfrVar.a(), mfrVar2.a());
        mfrVar.F(mfrVar2.a, mfrVar2.b, iMin);
        mfrVar2.L(iMin);
        if (z) {
            mfrVar.K(i);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0395  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x03c8  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x0364 A[SYNTHETIC] */
    @Override // defpackage.nyf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(defpackage.mfr r26) throws defpackage.mby {
        /*
            Method dump skipped, instructions count: 1276
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nyt.a(mfr):void");
    }

    @Override // defpackage.nyf
    public final void b(nnu nnuVar, nzq nzqVar) {
        nzqVar.c();
        this.f = nzqVar.b();
        this.g = nnuVar.p(nzqVar.a(), 1);
    }

    @Override // defpackage.nyf
    public final void d(long j, int i) {
        this.l = i;
        if (!this.k && (this.p != 0 || !this.n)) {
            this.j = true;
        }
        if (j != -9223372036854775807L) {
            double d = j;
            if (this.j) {
                this.i = d;
            } else {
                this.h = d;
            }
        }
    }

    @Override // defpackage.nyf
    public final void e() {
        this.e = 0;
        this.m = 0;
        this.b.G(2);
        this.o = 0;
        this.p = 0;
        this.r = -2147483647;
        this.s = -1;
        this.t = 0;
        this.u = -1L;
        this.v = false;
        this.j = false;
        this.n = true;
        this.k = true;
        this.h = -9.223372036854776E18d;
        this.i = -9.223372036854776E18d;
    }

    @Override // defpackage.nyf
    public final void c(boolean z) {
    }
}
