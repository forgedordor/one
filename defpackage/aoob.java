package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class aoob implements aooe {
    public final aooa a;

    public aoob(aooa aooaVar) {
        this.a = aooaVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof aoob) && fdbq.f(this.a, ((aoob) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Error(reason=" + this.a + ")";
    }
}
