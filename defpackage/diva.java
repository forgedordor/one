package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class diva implements divg {
    public final String a;
    public final Integer b;
    public final Integer c;
    public final String d;
    public final String e;
    public final String f;
    public final dktq g;
    public final dktq h;
    public final List i;
    public final List j;
    public final ibx l;
    public final dlbr m;
    public final diuz n;
    private final List q;
    private final fdae t;
    private final String p = null;
    private final boolean r = true;
    public final int o = 1;
    public final int k = 5;
    private final boolean s = true;

    public /* synthetic */ diva(String str, Integer num, Integer num2, String str2, String str3, String str4, dktq dktqVar, dktq dktqVar2, List list, List list2, List list3, ibx ibxVar, dlbr dlbrVar, diuz diuzVar, fdae fdaeVar) {
        this.a = str;
        this.b = num;
        this.c = num2;
        this.d = str2;
        this.e = str3;
        this.f = str4;
        this.g = dktqVar;
        this.h = dktqVar2;
        this.i = list;
        this.j = list2;
        this.q = list3;
        this.l = ibxVar;
        this.m = dlbrVar;
        this.n = diuzVar;
        this.t = fdaeVar;
    }

    @Override // defpackage.divg
    public final divg a(fdae fdaeVar) {
        return new diva(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.q, this.l, this.m, this.n, fdaeVar);
    }

    @Override // defpackage.divg
    public final fdae b() {
        return this.t;
    }

    @Override // defpackage.divg
    public final boolean c() {
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof diva)) {
            return false;
        }
        diva divaVar = (diva) obj;
        if (!fdbq.f(this.a, divaVar.a) || !fdbq.f(this.b, divaVar.b) || !fdbq.f(this.c, divaVar.c) || !fdbq.f(this.d, divaVar.d) || !fdbq.f(this.e, divaVar.e) || !fdbq.f(this.f, divaVar.f) || !fdbq.f(this.g, divaVar.g) || !fdbq.f(this.h, divaVar.h) || !fdbq.f(this.i, divaVar.i) || !fdbq.f(this.j, divaVar.j)) {
            return false;
        }
        String str = divaVar.p;
        if (!fdbq.f(null, null) || !fdbq.f(this.q, divaVar.q)) {
            return false;
        }
        boolean z = divaVar.r;
        int i = divaVar.o;
        int i2 = divaVar.k;
        if (!khk.b(5, 5) || !fdbq.f(this.l, divaVar.l) || !fdbq.f(this.m, divaVar.m) || !fdbq.f(this.n, divaVar.n)) {
            return false;
        }
        boolean z2 = divaVar.s;
        return fdbq.f(this.t, divaVar.t);
    }

    public final int hashCode() {
        return (((((((((((((((((((((((((((((((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + this.f.hashCode()) * 31) + this.g.hashCode()) * 31) + this.h.hashCode()) * 31) + 1) * 31) + this.j.hashCode()) * 961) + 1) * 31) + 1231) * 31) + 1) * 31) + 5) * 31) + this.l.hashCode()) * 31) + this.m.hashCode()) * 31) + this.n.hashCode()) * 31) + 1231) * 31) + this.t.hashCode();
    }

    public final String toString() {
        return "GaiaOptIn(title=" + this.a + ", titleHighlightStart=" + this.b + ", titleHighlightEnd=" + this.c + ", accountName=" + this.d + ", accountAvatarUri=" + this.e + ", headerIconUri=" + this.f + ", confirmButton=" + this.g + ", denyButton=" + this.h + ", items=" + this.i + ", itemsV2=" + this.j + ", body=null, bodyAnnotations=" + this.q + ", useEqualButtons=true, buttonLayout=HORIZONTAL_EDGES, bodyAnnotationTextAlign=" + khk.a(5) + ", bodyAnnotationAlignment=" + this.l + ", scrollToBottomUiData=" + this.m + ", flags=" + this.n + ", includeScrim=true, onDismiss=" + this.t + ")";
    }
}
