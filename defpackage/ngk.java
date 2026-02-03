package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ngk implements ngc {
    public final ngc a;
    private final long b;

    public ngk(ngc ngcVar, long j) {
        this.a = ngcVar;
        this.b = j;
    }

    @Override // defpackage.ngc
    public final int a(msa msaVar, mix mixVar, int i) {
        int iA = this.a.a(msaVar, mixVar, i);
        if (iA != -4) {
            return iA;
        }
        mixVar.f += this.b;
        return -4;
    }

    @Override // defpackage.ngc
    public final int b(long j) {
        return this.a.b(j - this.b);
    }

    @Override // defpackage.ngc
    public final void c() {
        this.a.c();
    }

    @Override // defpackage.ngc
    public final boolean d() {
        return this.a.d();
    }
}
