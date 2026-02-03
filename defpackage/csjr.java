package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class csjr {
    public final String a;
    public final float b;

    public csjr(String str, float f) {
        this.a = str;
        this.b = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof csjr)) {
            return false;
        }
        csjr csjrVar = (csjr) obj;
        return fdbq.f(this.a, csjrVar.a) && Float.compare(this.b, csjrVar.b) == 0;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + Float.floatToIntBits(this.b);
    }

    public final String toString() {
        return "ClassScore(category=" + this.a + ", score=" + this.b + ")";
    }
}
