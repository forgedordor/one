package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aabu implements divg {
    public final String a;
    public final String b;
    public final List c;
    public final fdvc d;
    public final List e;
    public final Integer f;
    public final djwc g;
    public final Integer h;
    public final dkep i;
    public final dktq j;
    public final boolean k;
    public final fdae l;
    private final dktq m;
    private final boolean n;

    public aabu(String str, String str2, List list, fdvc fdvcVar, List list2, Integer num, djwc djwcVar, Integer num2, dkep dkepVar, dktq dktqVar, boolean z, boolean z2, fdae fdaeVar) {
        djwcVar.getClass();
        dkepVar.getClass();
        this.a = str;
        this.b = str2;
        this.c = list;
        this.d = fdvcVar;
        this.e = list2;
        this.f = num;
        this.g = djwcVar;
        this.h = num2;
        this.i = dkepVar;
        this.j = dktqVar;
        this.m = null;
        this.k = z;
        this.n = z2;
        this.l = fdaeVar;
    }

    public static /* synthetic */ aabu d(aabu aabuVar, String str, String str2, List list, fdvc fdvcVar, List list2, Integer num, djwc djwcVar, Integer num2, dkep dkepVar, dktq dktqVar, boolean z, boolean z2, fdae fdaeVar, int i) {
        if ((i & 1) != 0) {
            str = aabuVar.a;
        }
        String str3 = str;
        String str4 = (i & 2) != 0 ? aabuVar.b : str2;
        List list3 = (i & 4) != 0 ? aabuVar.c : list;
        fdvc fdvcVar2 = (i & 8) != 0 ? aabuVar.d : fdvcVar;
        List list4 = (i & 16) != 0 ? aabuVar.e : list2;
        Integer num3 = (i & 32) != 0 ? aabuVar.f : num;
        djwc djwcVar2 = (i & 64) != 0 ? aabuVar.g : djwcVar;
        Integer num4 = (i & 128) != 0 ? aabuVar.h : num2;
        dkep dkepVar2 = (i & 256) != 0 ? aabuVar.i : dkepVar;
        dktq dktqVar2 = (i & 512) != 0 ? aabuVar.j : dktqVar;
        if ((i & 1024) != 0) {
            dktq dktqVar3 = aabuVar.m;
        }
        boolean z3 = (i & 2048) != 0 ? aabuVar.k : z;
        boolean z4 = (i & 4096) != 0 ? aabuVar.n : z2;
        fdae fdaeVar2 = (i & 8192) != 0 ? aabuVar.l : fdaeVar;
        str3.getClass();
        list3.getClass();
        fdvcVar2.getClass();
        list4.getClass();
        djwcVar2.getClass();
        dkepVar2.getClass();
        fdaeVar2.getClass();
        return new aabu(str3, str4, list3, fdvcVar2, list4, num3, djwcVar2, num4, dkepVar2, dktqVar2, z3, z4, fdaeVar2);
    }

    @Override // defpackage.divg
    public final divg a(fdae fdaeVar) {
        return d(this, this.a, this.b, this.c, this.d, this.e, this.f, this.g, null, this.i, this.j, this.k, this.n, fdaeVar, 128);
    }

    @Override // defpackage.divg
    public final fdae b() {
        return this.l;
    }

    @Override // defpackage.divg
    public final boolean c() {
        return this.n;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aabu)) {
            return false;
        }
        aabu aabuVar = (aabu) obj;
        if (!fdbq.f(this.a, aabuVar.a) || !fdbq.f(this.b, aabuVar.b) || !fdbq.f(this.c, aabuVar.c) || !fdbq.f(this.d, aabuVar.d) || !fdbq.f(this.e, aabuVar.e) || !fdbq.f(this.f, aabuVar.f) || !fdbq.f(this.g, aabuVar.g) || !fdbq.f(this.h, aabuVar.h) || !fdbq.f(this.i, aabuVar.i) || !fdbq.f(this.j, aabuVar.j)) {
            return false;
        }
        dktq dktqVar = aabuVar.m;
        return fdbq.f(null, null) && this.k == aabuVar.k && this.n == aabuVar.n && fdbq.f(this.l, aabuVar.l);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        int iHashCode2 = (((((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31;
        Integer num = this.f;
        int iHashCode3 = (((iHashCode2 + (num == null ? 0 : num.hashCode())) * 31) + this.g.hashCode()) * 31;
        Integer num2 = this.h;
        int iHashCode4 = (((iHashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31) + this.i.hashCode()) * 31;
        dktq dktqVar = this.j;
        return ((((((iHashCode4 + (dktqVar != null ? dktqVar.hashCode() : 0)) * 961) + aabs.a(this.k)) * 31) + aabs.a(this.n)) * 31) + this.l.hashCode();
    }

    public final String toString() {
        return "ChatbotUnsubscribeBottomSheetUiData(title=" + this.a + ", body=" + this.b + ", bodyAnnotations=" + this.c + ", selectedReasonIndexFlow=" + this.d + ", listItems=" + this.e + ", spamReasonIndex=" + this.f + ", spamCheckbox=" + this.g + ", otherReasonIndex=" + this.h + ", otherReasonTextInput=" + this.i + ", confirmButton=" + this.j + ", denyButton=null, showCloseButton=" + this.k + ", includeScrim=" + this.n + ", onDismiss=" + this.l + ")";
    }
}
