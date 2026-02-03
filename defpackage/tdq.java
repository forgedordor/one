package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tdq implements tds {
    public final djrr a;

    public tdq(djrr djrrVar) {
        djrrVar.getClass();
        this.a = djrrVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tdq) && this.a == ((tdq) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Icon(icon=" + this.a + ")";
    }
}
