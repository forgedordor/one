package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nmy implements noq {
    public final nnb a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    private final long f;

    public nmy(nnb nnbVar, long j, long j2, long j3, long j4, long j5) {
        this.a = nnbVar;
        this.f = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.e = j5;
    }

    @Override // defpackage.noq
    public final noo b(long j) {
        nor norVar = new nor(j, nna.a(this.a.a(j), 0L, this.b, this.c, this.d, this.e));
        return new noo(norVar, norVar);
    }

    @Override // defpackage.noq
    public final long w() {
        return this.f;
    }

    @Override // defpackage.noq
    public final boolean y() {
        return true;
    }
}
