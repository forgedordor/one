package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class djts {
    public final Integer a;
    public final Integer b;

    public djts(Integer num, Integer num2) {
        this.a = num;
        this.b = num2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof djts)) {
            return false;
        }
        djts djtsVar = (djts) obj;
        return fdbq.f(this.a, djtsVar.a) && fdbq.f(this.b, djtsVar.b);
    }

    public final int hashCode() {
        Integer num = this.a;
        int iHashCode = num == null ? 0 : num.hashCode();
        Integer num2 = this.b;
        return (iHashCode * 31) + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        return "Size(width=" + this.a + ", height=" + this.b + ")";
    }
}
