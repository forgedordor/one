package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ditm implements dito {
    public final djrr a;

    public ditm(djrr djrrVar) {
        this.a = djrrVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ditm) && this.a == ((ditm) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Icon(icon=" + this.a + ")";
    }
}
