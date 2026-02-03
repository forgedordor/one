package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class anaz {
    public final int a;
    public final long b;
    public final andk c;

    public anaz(int i, long j, andk andkVar) {
        this.a = i;
        this.b = j;
        this.c = andkVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof anaz)) {
            return false;
        }
        anaz anazVar = (anaz) obj;
        return this.a == anazVar.a && this.b == anazVar.b && fdbq.f(this.c, anazVar.c);
    }

    public final int hashCode() {
        long j = this.b;
        return (((this.a * 31) + ((int) (j ^ (j >>> 32)))) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "CachedPagingResults(limit=" + this.a + ", version=" + this.b + ", pagingResults=" + this.c + ")";
    }
}
