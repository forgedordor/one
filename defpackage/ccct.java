package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class ccct {
    public final evqs a;

    public ccct(evqs evqsVar) {
        this.a = evqsVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ccct) && fdbq.f(this.a, ((ccct) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "CpimPayload(payload=" + this.a + ")";
    }
}
