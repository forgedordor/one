package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class egxf extends egxh {
    public final Object a;
    public final egxi b;

    public egxf(Object obj, egxi egxiVar) {
        this.a = obj;
        this.b = egxiVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof egxf)) {
            return false;
        }
        egxf egxfVar = (egxf) obj;
        return fdbq.f(this.a, egxfVar.a) && fdbq.f(this.b, egxfVar.b);
    }

    public final int hashCode() {
        Object obj = this.a;
        int iHashCode = obj == null ? 0 : obj.hashCode();
        egxi egxiVar = this.b;
        return (iHashCode * 31) + (egxiVar != null ? egxiVar.hashCode() : 0);
    }

    public final String toString() {
        return "Rereading(staleResponse=" + this.a + ", cause=" + this.b + ")";
    }
}
