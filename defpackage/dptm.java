package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dptm {
    public final String a;
    public final doju b;
    public final fdae c;
    public final String d;
    public final boolean e;
    public final boolean f;
    public final dike g;
    private final fdae h;

    public /* synthetic */ dptm(String str, doju dojuVar, fdae fdaeVar, String str2, boolean z, boolean z2, dike dikeVar, int i) {
        this.a = str;
        this.b = dojuVar;
        this.c = (i & 4) != 0 ? null : fdaeVar;
        this.d = (i & 8) != 0 ? null : str2;
        this.e = ((i & 16) == 0) & z;
        this.h = null;
        this.f = ((i & 64) == 0) & z2;
        this.g = (i & 128) != 0 ? null : dikeVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dptm)) {
            return false;
        }
        dptm dptmVar = (dptm) obj;
        if (!fdbq.f(this.a, dptmVar.a) || !fdbq.f(this.b, dptmVar.b) || !fdbq.f(this.c, dptmVar.c) || !fdbq.f(this.d, dptmVar.d) || this.e != dptmVar.e) {
            return false;
        }
        fdae fdaeVar = dptmVar.h;
        return fdbq.f(null, null) && this.f == dptmVar.f && fdbq.f(this.g, dptmVar.g);
    }

    public final int hashCode() {
        int iHashCode = (this.a.hashCode() * 31) + this.b.hashCode();
        fdae fdaeVar = this.c;
        int iHashCode2 = ((iHashCode * 31) + (fdaeVar == null ? 0 : fdaeVar.hashCode())) * 31;
        String str = this.d;
        int iHashCode3 = (((((iHashCode2 + (str == null ? 0 : str.hashCode())) * 31) + dptl.a(this.e)) * 961) + dptl.a(this.f)) * 31;
        dike dikeVar = this.g;
        return iHashCode3 + (dikeVar != null ? dikeVar.hashCode() : 0);
    }

    public final String toString() {
        return "LocalVideoRendererUiAdapterArgs(id=" + this.a + ", attachment=" + this.b + ", onDeleteButtonClick=" + this.c + ", contentDescription=" + this.d + ", canToggleFocusMode=" + this.e + ", onTuneButtonClick=null, hideSeekBarWhenPaused=" + this.f + ", renderListener=" + this.g + ")";
    }
}
