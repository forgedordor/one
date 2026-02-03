package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cils {
    private final cilq a;

    public cils(cilq cilqVar) {
        this.a = cilqVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cils) && fdbq.f(this.a, ((cils) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Success(draftMentions=" + this.a + ")";
    }
}
