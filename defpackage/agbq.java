package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class agbq implements afzv {
    public final agbs a;

    public agbq(agbs agbsVar) {
        this.a = agbsVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof agbq) && fdbq.f(this.a, ((agbq) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Conversation(arguments=" + this.a + ")";
    }
}
