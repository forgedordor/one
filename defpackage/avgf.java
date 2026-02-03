package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class avgf {
    public final long a;
    public final String b;

    public avgf(long j, String str) {
        this.a = j;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof avgf)) {
            return false;
        }
        avgf avgfVar = (avgf) obj;
        return this.a == avgfVar.a && fdbq.f(this.b, avgfVar.b);
    }

    public final int hashCode() {
        long j = this.a;
        return (((int) (j ^ (j >>> 32))) * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "Cp2ThirdPartyService(rowId=" + this.a + ", mimeType=" + this.b + ")";
    }
}
