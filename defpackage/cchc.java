package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cchc {
    public final evqs a;

    public cchc(evqs evqsVar) {
        evqsVar.getClass();
        this.a = evqsVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cchc) && fdbq.f(this.a, ((cchc) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "MlsMessage(bytes=" + this.a + ")";
    }
}
