package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class csxu {
    public final String a;
    public final long b;

    public csxu(String str, long j) {
        this.a = str;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof csxu)) {
            return false;
        }
        csxu csxuVar = (csxu) obj;
        return fdbq.f(this.a, csxuVar.a) && this.b == csxuVar.b;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        long j = this.b;
        return iHashCode + ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        return "CallLogEntry(destination=" + this.a + ", timestampMillis=" + this.b + ")";
    }
}
