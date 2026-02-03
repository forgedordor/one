package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class diys {
    public final String a;
    public final fdae b;
    private final djrr c = null;

    public diys(String str, fdae fdaeVar) {
        this.a = str;
        this.b = fdaeVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof diys)) {
            return false;
        }
        diys diysVar = (diys) obj;
        if (!fdbq.f(this.a, diysVar.a)) {
            return false;
        }
        djrr djrrVar = diysVar.c;
        return fdbq.f(this.b, diysVar.b);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 961) + this.b.hashCode();
    }

    public final String toString() {
        return "CardstoneButtonUiData(text=" + this.a + ", icon=null, onClick=" + this.b + ")";
    }
}
