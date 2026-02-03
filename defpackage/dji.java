package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dji implements diw {
    private final int a;
    private final djb b;
    private final long c;
    private final long d;

    public dji(int i, djb djbVar, long j) {
        this.a = i;
        this.b = djbVar;
        if (i <= 0) {
            throw new IllegalArgumentException("Iterations count can't be less than 1");
        }
        this.c = (djbVar.f() + djbVar.g()) * 1000000;
        this.d = j * 1000000;
    }

    private final long f(long j) {
        long j2 = j + this.d;
        if (j2 <= 0) {
            return 0L;
        }
        long j3 = this.c;
        return j2 - (Math.min(j2 / j3, this.a - 1) * j3);
    }

    private final deh g(long j, deh dehVar, deh dehVar2, deh dehVar3) {
        long j2 = this.d;
        long j3 = j + j2;
        long j4 = this.c;
        return j3 > j4 ? d(j4 - j2, dehVar, dehVar2, dehVar3) : dehVar2;
    }

    @Override // defpackage.diw
    public final long a(deh dehVar, deh dehVar2, deh dehVar3) {
        return (this.a * this.c) - this.d;
    }

    @Override // defpackage.diw
    public final /* synthetic */ deh b(deh dehVar, deh dehVar2, deh dehVar3) {
        return div.a(this, dehVar, dehVar2, dehVar3);
    }

    @Override // defpackage.diw
    public final deh c(long j, deh dehVar, deh dehVar2, deh dehVar3) {
        return this.b.c(f(j), dehVar, dehVar2, g(j, dehVar, dehVar3, dehVar2));
    }

    @Override // defpackage.diw
    public final deh d(long j, deh dehVar, deh dehVar2, deh dehVar3) {
        return this.b.d(f(j), dehVar, dehVar2, g(j, dehVar, dehVar3, dehVar2));
    }

    @Override // defpackage.diw
    public final /* synthetic */ boolean e() {
        return false;
    }
}
