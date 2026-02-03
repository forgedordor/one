package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eilv extends eimk {
    public final long a;
    public final ejwi b;

    public eilv(long j, ejwi ejwiVar) {
        this.a = j;
        this.b = ejwiVar;
    }

    @Override // defpackage.eimk
    public final long a() {
        return this.a;
    }

    @Override // defpackage.eimk
    public final ejwi b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof eimk) {
            eimk eimkVar = (eimk) obj;
            if (this.a == eimkVar.a() && this.b.equals(eimkVar.b())) {
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
        return "ParentInfo{ancestorRegionId=" + this.a + ", asyncInfo=" + this.b.toString() + "}";
    }
}
