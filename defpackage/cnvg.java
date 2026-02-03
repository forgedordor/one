package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cnvg {
    private final cobv a;
    private final int b;

    public cnvg(cobv cobvVar, int i) {
        cobvVar.getClass();
        this.a = cobvVar;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cnvg)) {
            return false;
        }
        cnvg cnvgVar = (cnvg) obj;
        return fdbq.f(this.a, cnvgVar.a) && this.b == cnvgVar.b;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SyncMerged(mergeDetails=");
        sb.append(this.a);
        sb.append(", mergeType=");
        sb.append((Object) (this.b != 1 ? "ACTIVE_SYNC" : "NEW_REQUEST"));
        sb.append(")");
        return sb.toString();
    }
}
