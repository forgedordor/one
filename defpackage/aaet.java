package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aaet implements dktt {
    public final djrr a;
    public final String b;
    public final String c;
    public final List d;
    public final String e;
    public final List f;
    public final List g;
    public final fdae h;
    public final fdae i;
    public final aaes j;

    public aaet(djrr djrrVar, String str, String str2, List list, String str3, List list2, List list3, fdae fdaeVar, fdae fdaeVar2, aaes aaesVar) {
        djrrVar.getClass();
        list3.getClass();
        this.a = djrrVar;
        this.b = str;
        this.c = str2;
        this.d = list;
        this.e = str3;
        this.f = list2;
        this.g = list3;
        this.h = fdaeVar;
        this.i = fdaeVar2;
        this.j = aaesVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aaet)) {
            return false;
        }
        aaet aaetVar = (aaet) obj;
        return this.a == aaetVar.a && fdbq.f(this.b, aaetVar.b) && fdbq.f(this.c, aaetVar.c) && fdbq.f(this.d, aaetVar.d) && fdbq.f(this.e, aaetVar.e) && fdbq.f(this.f, aaetVar.f) && fdbq.f(this.g, aaetVar.g) && fdbq.f(this.h, aaetVar.h) && fdbq.f(this.i, aaetVar.i) && fdbq.f(this.j, aaetVar.j);
    }

    public final int hashCode() {
        int iHashCode = (((((((((((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + this.f.hashCode()) * 31) + this.g.hashCode()) * 31) + this.h.hashCode()) * 31) + this.i.hashCode();
        aaes aaesVar = this.j;
        return (iHashCode * 31) + (aaesVar == null ? 0 : aaesVar.hashCode());
    }

    public final String toString() {
        return "SpeedBumpScreenUiData(headerIcon=" + this.a + ", title=" + this.b + ", subtitle=" + this.c + ", subtitleAnnotations=" + this.d + ", intro=" + this.e + ", infoItems=" + this.f + ", helpItems=" + this.g + ", onBack=" + this.h + ", onContinue=" + this.i + ", bottomSheetUiData=" + this.j + ")";
    }
}
