package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fgoa extends fgov {
    protected final fgnt a;

    public fgoa(fgnt fgntVar) {
        super(fgmu.f, 31556952000L);
        this.a = fgntVar;
    }

    @Override // defpackage.fgoo, defpackage.fgms
    public final int a(long j) {
        return this.a.Y(j);
    }

    @Override // defpackage.fgoo, defpackage.fgms
    public final int c() {
        return 292278993;
    }

    @Override // defpackage.fgms
    public final int d() {
        return -292275054;
    }

    @Override // defpackage.fgoo, defpackage.fgms
    public final long e(long j, int i) {
        if (i == 0) {
            return j;
        }
        int iA = a(j);
        int i2 = iA + i;
        if ((iA ^ i2) >= 0 || (iA ^ i) < 0) {
            return h(j, i2);
        }
        throw new ArithmeticException(a.s(i, iA, "The calculation caused an overflow: ", " + "));
    }

    @Override // defpackage.fgoo, defpackage.fgms
    public final long f(long j) {
        return j - g(j);
    }

    @Override // defpackage.fgoo, defpackage.fgms
    public final long g(long j) {
        return this.a.ac(a(j));
    }

    @Override // defpackage.fgoo, defpackage.fgms
    public final long h(long j, int i) {
        fgot.c(this, i, -292275054, 292278993);
        return this.a.ae(j, i);
    }

    @Override // defpackage.fgms
    public final long j(long j, int i) {
        fgot.c(this, i, -292275055, 292278994);
        return this.a.ae(j, i);
    }

    @Override // defpackage.fgoo, defpackage.fgms
    public final fgna r() {
        return this.a.c;
    }

    @Override // defpackage.fgms
    public final fgna s() {
        return null;
    }

    @Override // defpackage.fgoo, defpackage.fgms
    public final boolean t(long j) {
        return this.a.ag(a(j));
    }

    @Override // defpackage.fgov
    public final long x(long j, long j2) {
        return e(j, fgot.a(j2));
    }

    @Override // defpackage.fgms
    public final void v() {
    }
}
