package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class koy {
    public final Object a;
    public final int b;
    private final kpu c;

    public koy(Object obj, int i, kpu kpuVar) {
        this.a = obj;
        this.b = i;
        this.c = kpuVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof koy)) {
            return false;
        }
        koy koyVar = (koy) obj;
        return fdbq.f(this.a, koyVar.a) && this.b == koyVar.b && fdbq.f(this.c, koyVar.c);
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + this.b) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "HorizontalAnchor(id=" + this.a + ", index=" + this.b + ", reference=" + this.c + ')';
    }
}
