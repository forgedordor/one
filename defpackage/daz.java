package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class daz {
    public final float a;
    public final long b;
    public final dew c;

    public daz(float f, long j, dew dewVar) {
        this.a = f;
        this.b = j;
        this.c = dewVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof daz)) {
            return false;
        }
        daz dazVar = (daz) obj;
        return Float.compare(this.a, dazVar.a) == 0 && ikz.d(this.b, dazVar.b) && fdbq.f(this.c, dazVar.c);
    }

    public final int hashCode() {
        int iFloatToIntBits = Float.floatToIntBits(this.a) * 31;
        long j = ikz.a;
        return ((iFloatToIntBits + iky.a(this.b)) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "Scale(scale=" + this.a + ", transformOrigin=" + ((Object) ikz.c(this.b)) + ", animationSpec=" + this.c + ')';
    }
}
