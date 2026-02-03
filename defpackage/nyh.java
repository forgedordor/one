package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nyh implements nyf {
    private static final double[] a = {23.976023976023978d, 24.0d, 25.0d, 29.97002997002997d, 30.0d, 50.0d, 59.94005994005994d, 60.0d};
    private String b;
    private nox c;
    private final nzu d;
    private final String e;
    private final mfr f;
    private final nyw g;
    private final boolean[] h = new boolean[4];
    private final nyg i = new nyg();
    private long j;
    private boolean k;
    private boolean l;
    private long m;
    private long n;
    private long o;
    private long p;
    private boolean q;
    private boolean r;

    public nyh(nzu nzuVar, String str) {
        mfr mfrVar;
        this.d = nzuVar;
        this.e = str;
        if (nzuVar != null) {
            this.g = new nyw(178);
            mfrVar = new mfr();
        } else {
            mfrVar = null;
            this.g = null;
        }
        this.f = mfrVar;
        this.n = -9223372036854775807L;
        this.p = -9223372036854775807L;
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x010a  */
    @Override // defpackage.nyf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(defpackage.mfr r22) {
        /*
            Method dump skipped, instructions count: 512
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nyh.a(mfr):void");
    }

    @Override // defpackage.nyf
    public final void b(nnu nnuVar, nzq nzqVar) {
        nzqVar.c();
        this.b = nzqVar.b();
        this.c = nnuVar.p(nzqVar.a(), 2);
        nzu nzuVar = this.d;
        if (nzuVar != null) {
            nzuVar.b(nnuVar, nzqVar);
        }
    }

    @Override // defpackage.nyf
    public final void c(boolean z) {
        mee.g(this.c);
        if (z) {
            boolean z2 = this.q;
            long j = this.j - this.o;
            this.c.o(this.p, z2 ? 1 : 0, (int) j, 0, null);
        }
    }

    @Override // defpackage.nyf
    public final void d(long j, int i) {
        this.n = j;
    }

    @Override // defpackage.nyf
    public final void e() {
        mgy.j(this.h);
        nyg nygVar = this.i;
        nygVar.b = false;
        nygVar.c = 0;
        nygVar.d = 0;
        nyw nywVar = this.g;
        if (nywVar != null) {
            nywVar.b();
        }
        this.j = 0L;
        this.k = false;
        this.n = -9223372036854775807L;
        this.p = -9223372036854775807L;
    }
}
