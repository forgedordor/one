package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class andk {
    public final ekgb a;
    public final long b;
    public final long c;
    private final fdap d;

    public andk(ekgb ekgbVar, long j, long j2, fdap fdapVar) {
        ekgbVar.getClass();
        this.a = ekgbVar;
        this.b = j;
        this.c = j2;
        this.d = fdapVar;
    }

    public final int a(ajly ajlyVar) {
        if (ajlyVar instanceof aneb) {
            return a(((aneb) ajlyVar).a);
        }
        if (!(ajlyVar instanceof ancx)) {
            return andl.a(this.a, ajlyVar, this.d);
        }
        return Math.max(Math.min((int) (((ancx) ajlyVar).a() - this.b), this.a.size()), 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof andk)) {
            return false;
        }
        andk andkVar = (andk) obj;
        return fdbq.f(this.a, andkVar.a) && this.b == andkVar.b && this.c == andkVar.c && fdbq.f(this.d, andkVar.d);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        fdap fdapVar = this.d;
        return ((((iHashCode + andj.a(this.b)) * 31) + andj.a(this.c)) * 31) + fdapVar.hashCode();
    }

    public final String toString() {
        return "PagingResultsImpl(data=" + this.a + ", itemsBefore=" + this.b + ", itemsAfter=" + this.c + ", createPagingKey=" + this.d + ")";
    }
}
