package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class djhz implements djia {
    public final dkri a;
    public final String b;
    public final fdae c;

    public djhz(dkri dkriVar, String str, fdae fdaeVar) {
        this.a = dkriVar;
        this.b = str;
        this.c = fdaeVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof djhz)) {
            return false;
        }
        djhz djhzVar = (djhz) obj;
        return fdbq.f(this.a, djhzVar.a) && fdbq.f(this.b, djhzVar.b) && fdbq.f(this.c, djhzVar.c);
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "Participant(monogram=" + this.a + ", text=" + this.b + ", onClick=" + this.c + ")";
    }
}
