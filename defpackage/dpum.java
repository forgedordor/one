package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dpum {
    public final fdae a;
    public final fdap b;

    public dpum(fdae fdaeVar, fdap fdapVar) {
        this.a = fdaeVar;
        this.b = fdapVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dpum)) {
            return false;
        }
        dpum dpumVar = (dpum) obj;
        return fdbq.f(this.a, dpumVar.a) && fdbq.f(this.b, dpumVar.b);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "RenderingHeightController(get=" + this.a + ", set=" + this.b + ")";
    }
}
