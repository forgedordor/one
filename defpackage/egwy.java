package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class egwy extends egxa {
    public final eguz a;

    public egwy(eguz eguzVar) {
        this.a = eguzVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof egwy) && fdbq.f(this.a, ((egwy) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Complete(outcome=" + this.a + ")";
    }
}
