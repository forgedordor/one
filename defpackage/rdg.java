package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class rdg {
    public final rdx a;
    public final ics b;

    public rdg(rdx rdxVar, ics icsVar) {
        icsVar.getClass();
        this.a = rdxVar;
        this.b = icsVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rdg)) {
            return false;
        }
        rdg rdgVar = (rdg) obj;
        return fdbq.f(this.a, rdgVar.a) && fdbq.f(this.b, rdgVar.b);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "SizeAndModifier(size=" + this.a + ", modifier=" + this.b + ")";
    }
}
