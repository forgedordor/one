package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dazq {
    public final int a;
    public final boolean b;

    public dazq(int i, boolean z) {
        this.a = i;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dazq)) {
            return false;
        }
        dazq dazqVar = (dazq) obj;
        return this.a == dazqVar.a && this.b == dazqVar.b;
    }

    public final int hashCode() {
        return (this.a * 31) + (true != this.b ? 1237 : 1231);
    }

    public final String toString() {
        return "FeatureImage(painter=" + this.a + ", tint=" + this.b + ")";
    }
}
