package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nfv {
    public long a;
    public long b;
    public nio c;
    public nfv d;

    public nfv(long j) {
        c(j);
    }

    public final int a(long j) {
        long j2 = j - this.a;
        int i = this.c.b;
        return (int) j2;
    }

    public final nfv b() {
        this.c = null;
        nfv nfvVar = this.d;
        this.d = null;
        return nfvVar;
    }

    public final void c(long j) {
        mee.c(this.c == null);
        this.a = j;
        this.b = j + 65536;
    }
}
