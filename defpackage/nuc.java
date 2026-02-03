package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class nuc implements nui {
    public final long a;
    public final long b;
    public final num c;
    public long d;
    private final nuh e;
    private int f;
    private long g;
    private long h;
    private long i;
    private long j;
    private long k;
    private long l;

    public nuc(num numVar, long j, long j2, long j3, long j4, boolean z) {
        mee.a(j >= 0 && j2 > j);
        this.c = numVar;
        this.a = j;
        this.b = j2;
        if (j3 == j2 - j || z) {
            this.d = j4;
            this.f = 4;
        } else {
            this.f = 0;
        }
        this.e = new nuh();
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00bf A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00c0  */
    @Override // defpackage.nui
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long a(defpackage.nns r29) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 343
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nuc.a(nns):long");
    }

    @Override // defpackage.nui
    public final /* bridge */ /* synthetic */ noq b() {
        if (this.d != 0) {
            return new nub(this);
        }
        return null;
    }

    @Override // defpackage.nui
    public final void c(long j) {
        this.h = mgb.s(j, 0L, this.d - 1);
        this.f = 2;
        this.i = this.a;
        this.j = this.b;
        this.k = 0L;
        this.l = this.d;
    }
}
