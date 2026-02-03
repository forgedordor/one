package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cbte extends cbtf {
    public final eyfn a;

    public cbte(eyfn eyfnVar) {
        eyfnVar.getClass();
        this.a = eyfnVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cbte) && fdbq.f(this.a, ((cbte) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Scytale(fileEncryptionMetadata=" + this.a + ")";
    }
}
