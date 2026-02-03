package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ibq {
    public final int a;
    public final Integer b;

    public ibq(int i, Integer num) {
        this.a = i;
        this.b = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ibq)) {
            return false;
        }
        ibq ibqVar = (ibq) obj;
        return this.a == ibqVar.a && fdbq.f(this.b, ibqVar.b);
    }

    public final int hashCode() {
        Integer num = this.b;
        return (this.a * 31) + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        return "ObjectLocation(group=" + this.a + ", dataOffset=" + this.b + ')';
    }
}
