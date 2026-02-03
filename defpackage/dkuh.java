package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dkuh {
    public final String a;
    public final dkul b;
    public final fdae c;

    public dkuh(String str, dkul dkulVar, fdae fdaeVar) {
        this.a = str;
        this.b = dkulVar;
        this.c = fdaeVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dkuh)) {
            return false;
        }
        dkuh dkuhVar = (dkuh) obj;
        return fdbq.f(this.a, dkuhVar.a) && fdbq.f(this.b, dkuhVar.b) && fdbq.f(this.c, dkuhVar.c);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        dkul dkulVar = this.b;
        return ((iHashCode + (dkulVar == null ? 0 : dkulVar.hashCode())) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "RichCardAction(text=" + this.a + ", icon=" + this.b + ", onClick=" + this.c + ")";
    }
}
