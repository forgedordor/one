package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ibf {
    public final ibr a;
    public final Integer b;

    public ibf(ibr ibrVar, Integer num) {
        this.a = ibrVar;
        this.b = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ibf)) {
            return false;
        }
        ibf ibfVar = (ibf) obj;
        return fdbq.f(this.a, ibfVar.a) && fdbq.f(this.b, ibfVar.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        Integer num = this.b;
        return iHashCode + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        return "ComposeStackTraceFrame(sourceInfo=" + this.a + ", groupOffset=" + this.b + ')';
    }
}
