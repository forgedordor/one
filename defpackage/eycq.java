package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
class eycq implements eycb {
    private final eycb a;
    private final long b;
    private final long c;
    private long d;
    private long e;

    public eycq(eycb eycbVar, long j) {
        if (eycbVar.c() < Long.MAX_VALUE) {
            ejwl.a(j <= eycbVar.c() - (eycbVar.d() - eycbVar.b()));
        }
        this.a = eycbVar;
        this.b = eycbVar.d();
        this.c = j;
    }

    @Override // defpackage.eycb
    public final synchronized int a(byte[] bArr, int i, int i2) {
        int iA;
        ejwl.b(65536 - i >= i2, "Cannot read into a buffer smaller than given length");
        int iMin = (int) Math.min(i2, this.c - this.d);
        long j = this.b;
        long j2 = this.d + j;
        eycb eycbVar = this.a;
        if (j2 != eycbVar.d()) {
            eycbVar.h();
            for (long jB = (j - eycbVar.b()) + this.d; jB > 0; jB -= eycbVar.f(jB)) {
            }
        }
        iA = eycbVar.a(bArr, i, iMin);
        this.d += iA;
        return iA;
    }

    @Override // defpackage.eycb
    public final synchronized long b() {
        return this.e;
    }

    @Override // defpackage.eycb
    public final synchronized long c() {
        return Long.MAX_VALUE;
    }

    @Override // defpackage.eycb, java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        this.a.close();
    }

    @Override // defpackage.eycb
    public final synchronized long d() {
        return this.d;
    }

    @Override // defpackage.eycb
    public final synchronized long e() {
        return this.c;
    }

    @Override // defpackage.eycb
    public final synchronized long f(long j) {
        long jF;
        long jMin = Math.min(j, this.c - this.d);
        long j2 = this.b;
        long j3 = this.d + j2;
        eycb eycbVar = this.a;
        if (j3 != eycbVar.d()) {
            eycbVar.h();
            for (long jB = (j2 - eycbVar.b()) + this.d; jB > 0; jB -= eycbVar.f(jB)) {
            }
        }
        jF = eycbVar.f(jMin);
        this.d += jF;
        return jF;
    }

    @Override // defpackage.eycb
    public final synchronized void g() {
        this.e = this.d;
    }

    @Override // defpackage.eycb
    public final synchronized void h() {
        this.d = this.e;
    }

    @Override // defpackage.eycb
    public final synchronized boolean i() {
        return this.d < this.c;
    }
}
