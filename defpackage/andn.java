package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class andn {
    public final long a;
    public final long b;

    public andn(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof andn)) {
            return false;
        }
        andn andnVar = (andn) obj;
        return this.a == andnVar.a && this.b == andnVar.b;
    }

    public final int hashCode() {
        return (andm.a(this.a) * 31) + andm.a(this.b);
    }

    public final String toString() {
        return "PlaceholdersCount(itemsBefore=" + this.a + ", itemsAfter=" + this.b + ")";
    }
}
