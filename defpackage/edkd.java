package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class edkd extends ediv {
    private final long a;
    private final String b;

    public edkd(long j, String str) {
        this.a = j;
        if (str == null) {
            throw new NullPointerException("Null name");
        }
        this.b = str;
    }

    @Override // defpackage.ediv
    public final long a() {
        return this.a;
    }

    @Override // defpackage.ediv
    public final String b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ediv) {
            ediv edivVar = (ediv) obj;
            if (this.a == edivVar.a() && this.b.equals(edivVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.a;
        return ((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        return "ArtInterest{id=" + this.a + ", name=" + this.b + "}";
    }
}
