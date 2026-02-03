package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dpnu {
    public final dpmg a;
    public final fdlr b;

    public dpnu(dpmg dpmgVar, fdlr fdlrVar) {
        this.a = dpmgVar;
        this.b = fdlrVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dpnu)) {
            return false;
        }
        dpnu dpnuVar = (dpnu) obj;
        return fdbq.f(this.a, dpnuVar.a) && fdbq.f(this.b, dpnuVar.b);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "ActiveProjection(projection=" + this.a + ", job=" + this.b + ")";
    }
}
