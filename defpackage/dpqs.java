package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dpqs {
    public final dppy a;
    public final float b;

    public dpqs(dppy dppyVar, float f) {
        this.a = dppyVar;
        this.b = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dpqs)) {
            return false;
        }
        dpqs dpqsVar = (dpqs) obj;
        return fdbq.f(this.a, dpqsVar.a) && Float.compare(this.b, dpqsVar.b) == 0;
    }

    public final int hashCode() {
        dppy dppyVar = this.a;
        return ((dppyVar == null ? 0 : dppyVar.hashCode()) * 31) + Float.floatToIntBits(this.b);
    }

    public final String toString() {
        return "WeightedPage(uiData=" + this.a + ", weight=" + this.b + ")";
    }
}
