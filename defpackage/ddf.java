package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ddf {
    public final fdap a;
    public final dew b;

    public ddf(fdap fdapVar, dew dewVar) {
        this.a = fdapVar;
        this.b = dewVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ddf)) {
            return false;
        }
        ddf ddfVar = (ddf) obj;
        return fdbq.f(this.a, ddfVar.a) && fdbq.f(this.b, ddfVar.b);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "Slide(slideOffset=" + this.a + ", animationSpec=" + this.b + ')';
    }
}
