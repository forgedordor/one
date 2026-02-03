package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class koz {
    public final Object a;
    public final int b;
    private final kpu c;

    public koz(Object obj, int i, kpu kpuVar) {
        this.a = obj;
        this.b = i;
        this.c = kpuVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof koz)) {
            return false;
        }
        koz kozVar = (koz) obj;
        return fdbq.f(this.a, kozVar.a) && this.b == kozVar.b && fdbq.f(this.c, kozVar.c);
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + this.b) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "VerticalAnchor(id=" + this.a + ", index=" + this.b + ", reference=" + this.c + ')';
    }
}
