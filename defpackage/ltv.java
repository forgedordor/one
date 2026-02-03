package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ltv {
    public final float a;
    public final lti b;

    public ltv(float f, lti ltiVar) {
        ltiVar.getClass();
        this.a = f;
        this.b = ltiVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ltv)) {
            return false;
        }
        ltv ltvVar = (ltv) obj;
        return Float.compare(this.a, ltvVar.a) == 0 && fdbq.f(this.b, ltvVar.b);
    }

    public final int hashCode() {
        return (Float.floatToIntBits(this.a) * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "ProgressableFeature(progress=" + this.a + ", feature=" + this.b + ')';
    }
}
