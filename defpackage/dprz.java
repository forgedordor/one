package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dprz {
    public final String a;
    public final dojr b;
    public final fdae c;
    public final String d;
    public final boolean e;
    public final boolean f;
    public final dike g;

    public /* synthetic */ dprz(String str, dojr dojrVar, fdae fdaeVar, String str2, boolean z, boolean z2, dike dikeVar, int i) {
        this.a = str;
        this.b = dojrVar;
        this.c = (i & 4) != 0 ? null : fdaeVar;
        this.d = (i & 8) != 0 ? null : str2;
        this.e = ((i & 16) == 0) & z;
        this.f = ((i & 32) == 0) & z2;
        this.g = (i & 64) != 0 ? null : dikeVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dprz)) {
            return false;
        }
        dprz dprzVar = (dprz) obj;
        return fdbq.f(this.a, dprzVar.a) && fdbq.f(this.b, dprzVar.b) && fdbq.f(this.c, dprzVar.c) && fdbq.f(this.d, dprzVar.d) && this.e == dprzVar.e && this.f == dprzVar.f && fdbq.f(this.g, dprzVar.g);
    }

    public final int hashCode() {
        int iHashCode = (this.a.hashCode() * 31) + this.b.hashCode();
        fdae fdaeVar = this.c;
        int iHashCode2 = ((iHashCode * 31) + (fdaeVar == null ? 0 : fdaeVar.hashCode())) * 31;
        String str = this.d;
        int iHashCode3 = (((((iHashCode2 + (str == null ? 0 : str.hashCode())) * 31) + dpry.a(this.e)) * 31) + dpry.a(this.f)) * 31;
        dike dikeVar = this.g;
        return iHashCode3 + (dikeVar != null ? dikeVar.hashCode() : 0);
    }

    public final String toString() {
        return "LocalImageRendererUiAdapterArgs(id=" + this.a + ", attachment=" + this.b + ", onDeleteButtonClick=" + this.c + ", contentDescription=" + this.d + ", canToggleFocusMode=" + this.e + ", canZoom=" + this.f + ", renderListener=" + this.g + ")";
    }
}
