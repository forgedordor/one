package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dpov {
    public final djrr a;
    public final String b;
    public final fdae c;

    public dpov(djrr djrrVar, String str, fdae fdaeVar) {
        djrrVar.getClass();
        str.getClass();
        fdaeVar.getClass();
        this.a = djrrVar;
        this.b = str;
        this.c = fdaeVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dpov)) {
            return false;
        }
        dpov dpovVar = (dpov) obj;
        return this.a == dpovVar.a && fdbq.f(this.b, dpovVar.b) && fdbq.f(this.c, dpovVar.c);
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "ToolbarAction(icon=" + this.a + ", title=" + this.b + ", onClick=" + this.c + ")";
    }
}
