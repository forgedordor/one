package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vwb implements vwf {
    public final vvy a;
    public final String b;

    public vwb() {
        this((vvy) null, 3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vwb)) {
            return false;
        }
        vwb vwbVar = (vwb) obj;
        return this.a == vwbVar.a && fdbq.f(this.b, vwbVar.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "Emotive(screen=" + this.a + ", initialSearchTerm=" + this.b + ")";
    }

    public vwb(vvy vvyVar, String str) {
        vvyVar.getClass();
        this.a = vvyVar;
        this.b = str;
    }

    public /* synthetic */ vwb(vvy vvyVar, int i) {
        this((i & 1) != 0 ? vwh.a : vvyVar, (String) null);
    }
}
