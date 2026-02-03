package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dpqk {
    public final Object a;
    public final float b;
    public final Object c;

    public dpqk(Object obj, float f, Object obj2) {
        this.a = obj;
        this.b = f;
        this.c = obj2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dpqk)) {
            return false;
        }
        dpqk dpqkVar = (dpqk) obj;
        return fdbq.f(this.a, dpqkVar.a) && Float.compare(this.b, dpqkVar.b) == 0 && fdbq.f(this.c, dpqkVar.c);
    }

    public final int hashCode() {
        Object obj = this.a;
        int iHashCode = ((obj == null ? 0 : obj.hashCode()) * 31) + Float.floatToIntBits(this.b);
        Object obj2 = this.c;
        return (iHashCode * 31) + (obj2 != null ? obj2.hashCode() : 0);
    }

    public final String toString() {
        return "PagingStateSnapshot(current=" + this.a + ", currentOffsetFraction=" + this.b + ", next=" + this.c + ")";
    }
}
