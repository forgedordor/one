package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dkzs implements dkzw {
    public final djrr a;

    public dkzs(djrr djrrVar) {
        djrrVar.getClass();
        this.a = djrrVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dkzs) && this.a == ((dkzs) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Icon(icon=" + this.a + ")";
    }
}
