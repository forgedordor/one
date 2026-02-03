package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hld implements hjl {
    private final int a;
    private final icc b;

    public hld(icc iccVar, int i) {
        this.b = iccVar;
        this.a = i;
    }

    @Override // defpackage.hjl
    public final int a(kjd kjdVar, long j, int i) {
        int i2 = (int) (j & 4294967295L);
        int i3 = this.a;
        return i >= i2 - (i3 + i3) ? ibw.n.a(i, i2) : fddu.i(this.b.a(i, i2), i3, (i2 - i3) - i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hld)) {
            return false;
        }
        hld hldVar = (hld) obj;
        return fdbq.f(this.b, hldVar.b) && this.a == hldVar.a;
    }

    public final int hashCode() {
        return (this.b.hashCode() * 31) + this.a;
    }

    public final String toString() {
        return "Vertical(alignment=" + this.b + ", margin=" + this.a + ')';
    }
}
