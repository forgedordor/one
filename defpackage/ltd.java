package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ltd {
    public final float a;
    public final ltv b;
    public final ltv c;

    public ltd(float f, ltv ltvVar, ltv ltvVar2) {
        ltvVar.getClass();
        ltvVar2.getClass();
        this.a = f;
        this.b = ltvVar;
        this.c = ltvVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ltd)) {
            return false;
        }
        ltd ltdVar = (ltd) obj;
        return Float.compare(this.a, ltdVar.a) == 0 && fdbq.f(this.b, ltdVar.b) && fdbq.f(this.c, ltdVar.c);
    }

    public final int hashCode() {
        return (((Float.floatToIntBits(this.a) * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "DistanceVertex(distance=" + this.a + ", f1=" + this.b + ", f2=" + this.c + ')';
    }
}
