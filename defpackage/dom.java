package defpackage;

/* compiled from: PG */
@fcsv
/* loaded from: classes.dex */
public final class dom {
    public final long a;
    public final egc b;

    public dom(long j, egc egcVar) {
        this.a = j;
        this.b = egcVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!fdbq.f(getClass(), obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        long j = this.a;
        dom domVar = (dom) obj;
        long j2 = domVar.a;
        long j3 = ije.a;
        return fcts.a(j, j2) && fdbq.f(this.b, domVar.b);
    }

    public final int hashCode() {
        long j = ije.a;
        return (fctr.a(this.a) * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "OverscrollConfiguration(glowColor=" + ((Object) ije.g(this.a)) + ", drawPadding=" + this.b + ')';
    }
}
