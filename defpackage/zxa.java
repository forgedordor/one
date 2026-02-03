package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zxa {
    public final aahn a;
    public final yen b;
    public final vrs c;
    public final fdvc d;
    public final fduj e;
    public final fdpl f;
    public final xup g;
    public final fdpl h;
    public final fdvc i;
    public final fdav j;
    public final fdap k;
    public final fdae l;
    public final boolean m;
    public final fdvc n;
    public final fdpl o;
    public final fdvc p;
    public final boolean q = true;
    public final zwz r;
    public final zyh s;

    public zxa(aahn aahnVar, yen yenVar, vrs vrsVar, fdvc fdvcVar, fduj fdujVar, fdpl fdplVar, xup xupVar, fdpl fdplVar2, fdvc fdvcVar2, fdav fdavVar, fdap fdapVar, fdae fdaeVar, boolean z, fdvc fdvcVar3, zyh zyhVar, fdpl fdplVar3, fdvc fdvcVar4, zwz zwzVar) {
        this.a = aahnVar;
        this.b = yenVar;
        this.c = vrsVar;
        this.d = fdvcVar;
        this.e = fdujVar;
        this.f = fdplVar;
        this.g = xupVar;
        this.h = fdplVar2;
        this.i = fdvcVar2;
        this.j = fdavVar;
        this.k = fdapVar;
        this.l = fdaeVar;
        this.m = z;
        this.n = fdvcVar3;
        this.s = zyhVar;
        this.o = fdplVar3;
        this.p = fdvcVar4;
        this.r = zwzVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zxa)) {
            return false;
        }
        zxa zxaVar = (zxa) obj;
        if (!fdbq.f(this.a, zxaVar.a) || !fdbq.f(this.b, zxaVar.b) || !fdbq.f(this.c, zxaVar.c) || !fdbq.f(this.d, zxaVar.d) || !fdbq.f(this.e, zxaVar.e) || !fdbq.f(this.f, zxaVar.f) || !fdbq.f(this.g, zxaVar.g) || !fdbq.f(this.h, zxaVar.h) || !fdbq.f(this.i, zxaVar.i) || !fdbq.f(this.j, zxaVar.j) || !fdbq.f(this.k, zxaVar.k) || !fdbq.f(this.l, zxaVar.l) || this.m != zxaVar.m || !fdbq.f(this.n, zxaVar.n) || !fdbq.f(this.s, zxaVar.s) || !fdbq.f(this.o, zxaVar.o) || !fdbq.f(this.p, zxaVar.p)) {
            return false;
        }
        boolean z = zxaVar.q;
        return fdbq.f(this.r, zxaVar.r);
    }

    public final int hashCode() {
        int iHashCode = (((((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + this.f.hashCode();
        xup xupVar = this.g;
        int iHashCode2 = ((((((((((((((((iHashCode * 31) + (xupVar == null ? 0 : xupVar.hashCode())) * 31) + this.h.hashCode()) * 31) + this.i.hashCode()) * 31) + this.j.hashCode()) * 31) + this.k.hashCode()) * 31) + this.l.hashCode()) * 31) + zwx.a(this.m)) * 31) + this.n.hashCode()) * 31;
        zyh zyhVar = this.s;
        int iHashCode3 = (iHashCode2 + (zyhVar == null ? 0 : zyhVar.hashCode())) * 31;
        fdpl fdplVar = this.o;
        return ((((((iHashCode3 + (fdplVar != null ? fdplVar.hashCode() : 0)) * 31) + this.p.hashCode()) * 31) + zwx.a(true)) * 31) + this.r.hashCode();
    }

    public final String toString() {
        return "ConversationScreenUiData(topContentUiData=" + this.a + ", pagedMessageListUiData=" + this.b + ", bottomContentUiData=" + this.c + ", popupUiDataFlow=" + this.d + ", snackbarUiDataFlow=" + this.e + ", mlsWatermarkTopPaddingFlow=" + this.f + ", mlsWatermarkUiData=" + this.g + ", bottomContentHeightFlow=" + this.h + ", effectUiDataFlow=" + this.i + ", onLayoutRectUpdated=" + this.j + ", onZoomEvent=" + this.k + ", onEffectFinished=" + this.l + ", useSamsungColors=" + this.m + ", miniConversationDetailsUiDataFlow=" + this.n + ", backgroundLoader=" + this.s + ", projectorUiDataFlow=" + this.o + ", themeUiDataFlow=" + this.p + ", pinTopBar=true, flags=" + this.r + ")";
    }
}
