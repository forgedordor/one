package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
abstract class num {
    public nox c;
    public nnu d;
    public nui e;
    public long f;
    public long g;
    public long h;
    public int i;
    public int j;
    public long l;
    public boolean m;
    public boolean n;
    public final nug b = new nug();
    public nuk k = new nuk();

    protected abstract long a(mfr mfrVar);

    protected void b(boolean z) {
        int i;
        if (z) {
            this.k = new nuk();
            this.g = 0L;
            i = 0;
        } else {
            i = 1;
        }
        this.i = i;
        this.f = -1L;
        this.h = 0L;
    }

    protected abstract boolean c(mfr mfrVar, long j, nuk nukVar);

    protected final long e(long j) {
        return (j * 1000000) / this.j;
    }

    protected final long f(long j) {
        return (this.j * j) / 1000000;
    }

    protected void g(long j) {
        this.h = j;
    }
}
