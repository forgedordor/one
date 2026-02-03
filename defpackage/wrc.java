package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wrc {
    public final vvw a;
    public final vwf b;

    public wrc(vvw vvwVar, vwf vwfVar) {
        this.a = vvwVar;
        this.b = vwfVar;
        if (vvwVar == null && vwfVar == null) {
            throw new wqv();
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wrc)) {
            return false;
        }
        wrc wrcVar = (wrc) obj;
        return fdbq.f(this.a, wrcVar.a) && fdbq.f(this.b, wrcVar.b);
    }

    public final int hashCode() {
        vvw vvwVar = this.a;
        int iHashCode = vvwVar == null ? 0 : vvwVar.hashCode();
        vwf vwfVar = this.b;
        return (iHashCode * 31) + (vwfVar != null ? vwfVar.hashCode() : 0);
    }

    public final String toString() {
        return "IncomingState(draft=" + this.a + ", input=" + this.b + ")";
    }
}
