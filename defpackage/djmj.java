package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class djmj implements djmy {
    public final String a;
    public final List b;
    public final djrr c;
    public final String d;
    public final boolean e;
    public final boolean f;
    public final dktq g;
    public final dktq h;
    public final fdae i;

    public djmj(String str, List list, djrr djrrVar, String str2, boolean z, boolean z2, dktq dktqVar, dktq dktqVar2, fdae fdaeVar) {
        list.getClass();
        fdaeVar.getClass();
        this.a = str;
        this.b = list;
        this.c = djrrVar;
        this.d = str2;
        this.e = z;
        this.f = z2;
        this.g = dktqVar;
        this.h = dktqVar2;
        this.i = fdaeVar;
    }

    @Override // defpackage.djmy
    public final /* synthetic */ djmy a(boolean z, fdae fdaeVar) {
        return djmg.a(this, z, fdaeVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof djmj)) {
            return false;
        }
        djmj djmjVar = (djmj) obj;
        return fdbq.f(this.a, djmjVar.a) && fdbq.f(this.b, djmjVar.b) && this.c == djmjVar.c && fdbq.f(this.d, djmjVar.d) && this.e == djmjVar.e && this.f == djmjVar.f && fdbq.f(this.g, djmjVar.g) && fdbq.f(this.h, djmjVar.h) && fdbq.f(this.i, djmjVar.i);
    }

    public final int hashCode() {
        int iHashCode = (this.a.hashCode() * 31) + this.b.hashCode();
        djrr djrrVar = this.c;
        int iHashCode2 = ((iHashCode * 31) + (djrrVar == null ? 0 : djrrVar.hashCode())) * 31;
        String str = this.d;
        int iHashCode3 = (((((((iHashCode2 + (str == null ? 0 : str.hashCode())) * 31) + djmh.a(this.e)) * 31) + djmh.a(this.f)) * 31) + this.g.hashCode()) * 31;
        dktq dktqVar = this.h;
        return ((iHashCode3 + (dktqVar != null ? dktqVar.hashCode() : 0)) * 31) + this.i.hashCode();
    }

    public final String toString() {
        return "Alert(body=" + this.a + ", bodyAnnotations=" + this.b + ", icon=" + this.c + ", title=" + this.d + ", selectableText=" + this.e + ", isError=" + this.f + ", confirmButton=" + this.g + ", dismissButton=" + this.h + ", onDismissRequest=" + this.i + ")";
    }

    public /* synthetic */ djmj(String str, List list, djrr djrrVar, String str2, boolean z, boolean z2, dktq dktqVar, dktq dktqVar2, fdae fdaeVar, int i) {
        this(str, (i & 2) != 0 ? fcvo.a : list, (i & 4) != 0 ? null : djrrVar, (i & 8) != 0 ? null : str2, ((i & 16) == 0) & z, ((i & 32) == 0) & z2, dktqVar, (i & 128) != 0 ? null : dktqVar2, (i & 256) != 0 ? new fdae() { // from class: djmi
            @Override // defpackage.fdae
            public final Object invoke() {
                return fctx.a;
            }
        } : fdaeVar);
    }
}
