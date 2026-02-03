package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dgj implements ddz {
    private final ddz a;
    private final long b;

    public dgj(ddz ddzVar, long j) {
        this.a = ddzVar;
        this.b = j;
    }

    @Override // defpackage.ddz
    public final diw a(dib dibVar) {
        return new dgk(this.a.a(dibVar), this.b);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof dgj)) {
            return false;
        }
        dgj dgjVar = (dgj) obj;
        return dgjVar.b == this.b && fdbq.f(dgjVar.a, this.a);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        long j = this.b;
        return iHashCode + ((int) (j ^ (j >>> 32)));
    }
}
