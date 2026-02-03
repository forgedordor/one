package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dpgj {
    public final CharSequence a;
    public final long b;

    public dpgj(CharSequence charSequence, long j) {
        this.a = charSequence;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dpgj)) {
            return false;
        }
        dpgj dpgjVar = (dpgj) obj;
        if (!fdbq.f(this.a, dpgjVar.a)) {
            return false;
        }
        long j = this.b;
        long j2 = dpgjVar.b;
        long j3 = ije.a;
        return fcts.a(j, j2);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        long j = ije.a;
        return iHashCode + fctr.a(this.b);
    }

    public final String toString() {
        return "TextPlaceholder(value=" + ((Object) this.a) + ", color=" + ije.g(this.b) + ")";
    }
}
