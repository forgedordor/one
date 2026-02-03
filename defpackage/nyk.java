package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nyk implements nyf {
    private static final float[] a = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 1.0f};
    private final nzu b;
    private nyj g;
    private long h;
    private String i;
    private nox j;
    private boolean k;
    private final boolean[] d = new boolean[4];
    private final nyi e = new nyi();
    private long l = -9223372036854775807L;
    private final nyw f = new nyw(178);
    private final mfr c = new mfr();

    public nyk(nzu nzuVar) {
        this.b = nzuVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x013d  */
    @Override // defpackage.nyf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(defpackage.mfr r19) {
        /*
            Method dump skipped, instructions count: 605
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nyk.a(mfr):void");
    }

    @Override // defpackage.nyf
    public final void b(nnu nnuVar, nzq nzqVar) {
        nzqVar.c();
        this.i = nzqVar.b();
        this.j = nnuVar.p(nzqVar.a(), 2);
        this.g = new nyj(this.j);
        this.b.b(nnuVar, nzqVar);
    }

    @Override // defpackage.nyf
    public final void c(boolean z) {
        mee.g(this.g);
        if (z) {
            this.g.b(this.h, 0, this.k);
            this.g.c();
        }
    }

    @Override // defpackage.nyf
    public final void d(long j, int i) {
        this.l = j;
    }

    @Override // defpackage.nyf
    public final void e() {
        mgy.j(this.d);
        this.e.b();
        nyj nyjVar = this.g;
        if (nyjVar != null) {
            nyjVar.c();
        }
        this.f.b();
        this.h = 0L;
        this.l = -9223372036854775807L;
    }
}
