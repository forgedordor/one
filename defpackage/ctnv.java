package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ctnv {
    public final ajou a;
    public final int b;

    public ctnv(ajou ajouVar, int i) {
        this.a = ajouVar;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ctnv)) {
            return false;
        }
        ctnv ctnvVar = (ctnv) obj;
        return fdbq.f(this.a, ctnvVar.a) && this.b == ctnvVar.b;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b;
    }

    public final String toString() {
        return "PagedContactEntry(entry=" + this.a + ", position=" + this.b + ")";
    }
}
