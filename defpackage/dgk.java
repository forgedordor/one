package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dgk implements diw {
    private final diw a;
    private final long b;

    public dgk(diw diwVar, long j) {
        this.a = diwVar;
        this.b = j;
    }

    @Override // defpackage.diw
    public final long a(deh dehVar, deh dehVar2, deh dehVar3) {
        return this.a.a(dehVar, dehVar2, dehVar3) + this.b;
    }

    @Override // defpackage.diw
    public final /* synthetic */ deh b(deh dehVar, deh dehVar2, deh dehVar3) {
        return div.a(this, dehVar, dehVar2, dehVar3);
    }

    @Override // defpackage.diw
    public final deh c(long j, deh dehVar, deh dehVar2, deh dehVar3) {
        long j2 = this.b;
        return j < j2 ? dehVar : this.a.c(j - j2, dehVar, dehVar2, dehVar3);
    }

    @Override // defpackage.diw
    public final deh d(long j, deh dehVar, deh dehVar2, deh dehVar3) {
        long j2 = this.b;
        return j < j2 ? dehVar3 : this.a.d(j - j2, dehVar, dehVar2, dehVar3);
    }

    @Override // defpackage.diw
    public final boolean e() {
        return this.a.e();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof dgk)) {
            return false;
        }
        dgk dgkVar = (dgk) obj;
        return dgkVar.b == this.b && fdbq.f(dgkVar.a, this.a);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        long j = this.b;
        return iHashCode + ((int) (j ^ (j >>> 32)));
    }
}
