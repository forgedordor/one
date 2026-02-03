package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class egxb extends egxh {
    public final egxi a;

    public egxb(egxi egxiVar) {
        this.a = egxiVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof egxb) && fdbq.f(this.a, ((egxb) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Failed(cause=" + this.a + ")";
    }
}
