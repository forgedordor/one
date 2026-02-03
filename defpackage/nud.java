package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class nud implements nui {
    private final noc b;
    private final nob c;
    public long a = -1;
    private long d = -1;

    public nud(noc nocVar, nob nobVar) {
        this.b = nocVar;
        this.c = nobVar;
    }

    @Override // defpackage.nui
    public final long a(nns nnsVar) {
        long j = this.d;
        if (j < 0) {
            return -1L;
        }
        this.d = -1L;
        return -(j + 2);
    }

    @Override // defpackage.nui
    public final noq b() {
        mee.c(this.a != -1);
        return new noa(this.b, this.a);
    }

    @Override // defpackage.nui
    public final void c(long j) {
        long[] jArr = this.c.a;
        this.d = jArr[mgb.al(jArr, j, true)];
    }
}
