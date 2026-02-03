package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class diwu {
    public final int a;
    public final ije b;
    public final String c;
    public final djrr d;
    public final ije e;
    public final ije f;
    public final ije g;
    public final fdae h;

    public diwu(int i, ije ijeVar, String str, djrr djrrVar, ije ijeVar2, ije ijeVar3, ije ijeVar4, fdae fdaeVar) {
        djrrVar.getClass();
        this.a = i;
        this.b = ijeVar;
        this.c = str;
        this.d = djrrVar;
        this.e = ijeVar2;
        this.f = ijeVar3;
        this.g = ijeVar4;
        this.h = fdaeVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof diwu)) {
            return false;
        }
        diwu diwuVar = (diwu) obj;
        return this.a == diwuVar.a && fdbq.f(this.b, diwuVar.b) && fdbq.f(this.c, diwuVar.c) && this.d == diwuVar.d && fdbq.f(this.e, diwuVar.e) && fdbq.f(this.f, diwuVar.f) && fdbq.f(this.g, diwuVar.g) && fdbq.f(this.h, diwuVar.h);
    }

    public final int hashCode() {
        return (((((((((((((this.a * 31) + fctr.a(this.b.i)) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + fctr.a(this.e.i)) * 31) + fctr.a(this.f.i)) * 31) + fctr.a(this.g.i)) * 31) + this.h.hashCode();
    }

    public final String toString() {
        return "CountBadgedIconButtonUiData(count=" + this.a + ", badgeTextColor=" + this.b + ", contentDescription=" + this.c + ", icon=" + this.d + ", iconTint=" + this.e + ", buttonColor=" + this.f + ", badgeColor=" + this.g + ", onClick=" + this.h + ")";
    }
}
