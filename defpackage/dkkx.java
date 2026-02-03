package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dkkx implements dkky {
    public final djrr a;
    public final String b;
    private final String c;

    public /* synthetic */ dkkx(djrr djrrVar, String str, int i) {
        djrrVar.getClass();
        this.a = djrrVar;
        this.c = null;
        this.b = (i & 4) != 0 ? null : str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dkkx)) {
            return false;
        }
        dkkx dkkxVar = (dkkx) obj;
        if (this.a != dkkxVar.a) {
            return false;
        }
        String str = dkkxVar.c;
        return fdbq.f(null, null) && fdbq.f(this.b, dkkxVar.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 961;
        String str = this.b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "MetatextIconItemUiData(icon=" + this.a + ", iconContentDescription=null, colorIdentifier=" + this.b + ")";
    }
}
