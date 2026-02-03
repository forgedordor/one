package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ejmw extends ejne {
    private final euyi a;
    private final long b;

    public ejmw(euyi euyiVar, long j) {
        this.a = euyiVar;
        this.b = j;
    }

    @Override // defpackage.ejne
    public final long a() {
        return this.b;
    }

    @Override // defpackage.ejne
    public final euyi b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ejne) {
            ejne ejneVar = (ejne) obj;
            if (this.a.equals(ejneVar.b()) && this.b == ejneVar.a()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() ^ 1000003;
        long j = this.b;
        return (iHashCode * 1000003) ^ ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        return "TextClassifierResult{classificationResult=" + this.a.toString() + ", timestampMs=" + this.b + "}";
    }
}
