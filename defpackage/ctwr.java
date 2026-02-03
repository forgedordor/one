package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ctwr {
    public final boolean a;
    public final cudh b;
    public final ctjv c;
    public final fdpl d;
    public final fdvc e;
    public final ctpi f;
    public final fdvc g;
    public final cubq h;
    public final fdvc i;
    public final fduj j;
    public final ctwq k;

    public ctwr(boolean z, cudh cudhVar, ctjv ctjvVar, fdpl fdplVar, fdvc fdvcVar, ctpi ctpiVar, fdvc fdvcVar2, cubq cubqVar, fdvc fdvcVar3, fduj fdujVar, ctwq ctwqVar) {
        fdvcVar.getClass();
        fdvcVar2.getClass();
        cubqVar.getClass();
        this.a = z;
        this.b = cudhVar;
        this.c = ctjvVar;
        this.d = fdplVar;
        this.e = fdvcVar;
        this.f = ctpiVar;
        this.g = fdvcVar2;
        this.h = cubqVar;
        this.i = fdvcVar3;
        this.j = fdujVar;
        this.k = ctwqVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ctwr)) {
            return false;
        }
        ctwr ctwrVar = (ctwr) obj;
        return this.a == ctwrVar.a && fdbq.f(this.b, ctwrVar.b) && fdbq.f(this.c, ctwrVar.c) && fdbq.f(this.d, ctwrVar.d) && fdbq.f(this.e, ctwrVar.e) && fdbq.f(this.f, ctwrVar.f) && fdbq.f(this.g, ctwrVar.g) && fdbq.f(this.h, ctwrVar.h) && fdbq.f(this.i, ctwrVar.i) && fdbq.f(this.j, ctwrVar.j) && fdbq.f(this.k, ctwrVar.k);
    }

    public final int hashCode() {
        int iHashCode = ((true != this.a ? 1237 : 1231) * 31) + this.b.hashCode();
        ctjv ctjvVar = this.c;
        int iHashCode2 = ((iHashCode * 31) + (ctjvVar == null ? 0 : ctjvVar.hashCode())) * 31;
        fdpl fdplVar = this.d;
        return ((((((((((((((iHashCode2 + (fdplVar != null ? fdplVar.hashCode() : 0)) * 31) + this.e.hashCode()) * 31) + this.f.hashCode()) * 31) + this.g.hashCode()) * 31) + this.h.hashCode()) * 31) + this.i.hashCode()) * 31) + this.j.hashCode()) * 31) + this.k.hashCode();
    }

    public final String toString() {
        return "StartChatScreenUiData(isGroupRenameMode=" + this.a + ", topAppBarUiData=" + this.b + ", contactListUiData=" + this.c + ", contactListUiDataFlow=" + this.d + ", extendedFabUiData=" + this.e + ", destinationsDialogUiData=" + this.f + ", groupNameUiData=" + this.g + ", toastUiData=" + this.h + ", popupUiDataFlow=" + this.i + ", snackbarUiDataFlow=" + this.j + ", flags=" + this.k + ")";
    }
}
