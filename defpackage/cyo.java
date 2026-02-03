package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cyo {
    public final iby a;
    public final fdap b;
    public final dew c;
    public final boolean d;

    public cyo(iby ibyVar, fdap fdapVar, dew dewVar, boolean z) {
        this.a = ibyVar;
        this.b = fdapVar;
        this.c = dewVar;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cyo)) {
            return false;
        }
        cyo cyoVar = (cyo) obj;
        return fdbq.f(this.a, cyoVar.a) && fdbq.f(this.b, cyoVar.b) && fdbq.f(this.c, cyoVar.c) && this.d == cyoVar.d;
    }

    public final int hashCode() {
        return (((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + (true != this.d ? 1237 : 1231);
    }

    public final String toString() {
        return "ChangeSize(alignment=" + this.a + ", size=" + this.b + ", animationSpec=" + this.c + ", clip=" + this.d + ')';
    }
}
