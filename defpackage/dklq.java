package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dklq implements dkky {
    public final dkri a;
    public final dklp b;

    public dklq(dkri dkriVar, dklp dklpVar) {
        this.a = dkriVar;
        this.b = dklpVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dklq)) {
            return false;
        }
        dklq dklqVar = (dklq) obj;
        return fdbq.f(this.a, dklqVar.a) && fdbq.f(this.b, dklqVar.b);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.a;
    }

    public final String toString() {
        return "MetatextMonogramItemUiData(monogram=" + this.a + ", flags=" + this.b + ")";
    }
}
