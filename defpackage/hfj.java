package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hfj implements hjl {
    private final int a;
    private final icc b;
    private final icc c;

    public hfj(icc iccVar, icc iccVar2, int i) {
        this.b = iccVar;
        this.c = iccVar2;
        this.a = i;
    }

    @Override // defpackage.hjl
    public final int a(kjd kjdVar, long j, int i) {
        int iA = this.c.a(0, kjdVar.a());
        return kjdVar.c + iA + (-this.b.a(0, i)) + this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hfj)) {
            return false;
        }
        hfj hfjVar = (hfj) obj;
        return fdbq.f(this.b, hfjVar.b) && fdbq.f(this.c, hfjVar.c) && this.a == hfjVar.a;
    }

    public final int hashCode() {
        return (((this.b.hashCode() * 31) + this.c.hashCode()) * 31) + this.a;
    }

    public final String toString() {
        return "Vertical(menuAlignment=" + this.b + ", anchorAlignment=" + this.c + ", offset=" + this.a + ')';
    }
}
