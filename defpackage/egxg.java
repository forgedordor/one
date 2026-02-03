package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class egxg extends egxh {
    public final Object a;
    public final egxi b;

    public egxg(Object obj, egxi egxiVar) {
        this.a = obj;
        this.b = egxiVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof egxg)) {
            return false;
        }
        egxg egxgVar = (egxg) obj;
        return fdbq.f(this.a, egxgVar.a) && fdbq.f(this.b, egxgVar.b);
    }

    public final int hashCode() {
        Object obj = this.a;
        return ((obj == null ? 0 : obj.hashCode()) * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "StaleRead(staleResponse=" + this.a + ", cause=" + this.b + ")";
    }
}
