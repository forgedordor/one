package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dazr {
    public final int a;
    public final dazq b;

    public dazr(int i, dazq dazqVar) {
        this.a = i;
        this.b = dazqVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dazr)) {
            return false;
        }
        dazr dazrVar = (dazr) obj;
        return this.a == dazrVar.a && fdbq.f(this.b, dazrVar.b);
    }

    public final int hashCode() {
        return (this.a * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "FeatureUiData(description=" + this.a + ", image=" + this.b + ")";
    }
}
