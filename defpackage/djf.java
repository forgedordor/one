package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class djf implements diw {
    private final djb a;
    private final long b;
    private final long c;
    private final int d;

    public djf(djb djbVar, int i, long j) {
        this.a = djbVar;
        this.d = i;
        this.b = (djbVar.f() + djbVar.g()) * 1000000;
        this.c = j * 1000000;
    }

    private final long f(long j) {
        long j2 = j + this.c;
        if (j2 <= 0) {
            return 0L;
        }
        long j3 = this.b;
        long j4 = j2 / j3;
        if (this.d != 1 && j4 % 2 != 0) {
            return ((j4 + 1) * j3) - j2;
        }
        Long.signum(j4);
        return j2 - (j4 * j3);
    }

    private final deh g(long j, deh dehVar, deh dehVar2, deh dehVar3) {
        long j2 = this.c;
        long j3 = j + j2;
        long j4 = this.b;
        return j3 > j4 ? this.a.d(j4 - j2, dehVar, dehVar3, dehVar2) : dehVar2;
    }

    @Override // defpackage.diw
    public final long a(deh dehVar, deh dehVar2, deh dehVar3) {
        return Long.MAX_VALUE;
    }

    @Override // defpackage.diw
    public final /* synthetic */ deh b(deh dehVar, deh dehVar2, deh dehVar3) {
        return div.a(this, dehVar, dehVar2, dehVar3);
    }

    @Override // defpackage.diw
    public final deh c(long j, deh dehVar, deh dehVar2, deh dehVar3) {
        return this.a.c(f(j), dehVar, dehVar2, g(j, dehVar, dehVar3, dehVar2));
    }

    @Override // defpackage.diw
    public final deh d(long j, deh dehVar, deh dehVar2, deh dehVar3) {
        return this.a.d(f(j), dehVar, dehVar2, g(j, dehVar, dehVar3, dehVar2));
    }

    @Override // defpackage.diw
    public final boolean e() {
        return true;
    }
}
