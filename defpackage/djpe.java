package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class djpe {
    public final String a;
    public final boolean b;
    public final fdae c;

    public djpe(String str, boolean z, fdae fdaeVar) {
        this.a = str;
        this.b = z;
        this.c = fdaeVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof djpe)) {
            return false;
        }
        djpe djpeVar = (djpe) obj;
        return fdbq.f(this.a, djpeVar.a) && this.b == djpeVar.b && fdbq.f(this.c, djpeVar.c);
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + (true != this.b ? 1237 : 1231)) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "ExpandableListButtonUiData(text=" + this.a + ", isListExpanded=" + this.b + ", onClick=" + this.c + ")";
    }
}
