package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class egxe extends egxh {
    public final egxi a;

    public egxe(egxi egxiVar) {
        this.a = egxiVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof egxe) && fdbq.f(this.a, ((egxe) obj).a);
    }

    public final int hashCode() {
        egxi egxiVar = this.a;
        if (egxiVar == null) {
            return 0;
        }
        return egxiVar.hashCode();
    }

    public final String toString() {
        return "Reading(cause=" + this.a + ")";
    }
}
