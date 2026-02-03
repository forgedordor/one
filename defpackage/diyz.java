package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class diyz {
    public final String a;
    private final djrr b = null;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof diyz)) {
            return false;
        }
        diyz diyzVar = (diyz) obj;
        if (!fdbq.f(this.a, diyzVar.a)) {
            return false;
        }
        djrr djrrVar = diyzVar.b;
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode() * 31;
    }

    public final String toString() {
        return "CardstoneTitle(title=" + this.a + ", icon=null)";
    }
}
