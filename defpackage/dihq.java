package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dihq {
    public final String a;
    public final djrr b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final List g;
    public final boolean h;
    public final boolean i;
    public final fdae j;
    public final fdae k;

    public /* synthetic */ dihq(String str, djrr djrrVar, boolean z, boolean z2, boolean z3, boolean z4, List list, boolean z5, fdae fdaeVar, fdae fdaeVar2, int i) {
        List list2 = (i & 64) != 0 ? fcvo.a : list;
        int i2 = i & 16;
        int i3 = i & 4;
        int i4 = i & 2;
        boolean z6 = (!((i & 32) == 0)) | z4;
        boolean z7 = (!(i2 == 0)) | z3;
        boolean z8 = ((i & 8) == 0) & z2;
        boolean z9 = z & (i3 == 0);
        djrrVar = i4 != 0 ? null : djrrVar;
        boolean z10 = ((i & 128) == 0) & z5;
        boolean z11 = (i & 256) != 0;
        fdae fdaeVar3 = (i & 512) == 0 ? fdaeVar : null;
        str.getClass();
        list2.getClass();
        fdaeVar2.getClass();
        this.a = str;
        this.b = djrrVar;
        this.c = z9;
        this.d = z8;
        this.e = z7;
        this.f = z6;
        this.g = list2;
        this.h = z10;
        this.i = z11;
        this.j = fdaeVar3;
        this.k = fdaeVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dihq)) {
            return false;
        }
        dihq dihqVar = (dihq) obj;
        return fdbq.f(this.a, dihqVar.a) && this.b == dihqVar.b && this.c == dihqVar.c && this.d == dihqVar.d && this.e == dihqVar.e && this.f == dihqVar.f && fdbq.f(this.g, dihqVar.g) && this.h == dihqVar.h && this.i == dihqVar.i && fdbq.f(this.j, dihqVar.j) && fdbq.f(this.k, dihqVar.k);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        djrr djrrVar = this.b;
        int iHashCode2 = (((((((((((((((iHashCode + (djrrVar == null ? 0 : djrrVar.hashCode())) * 31) + dihp.a(this.c)) * 31) + dihp.a(this.d)) * 31) + dihp.a(this.e)) * 31) + dihp.a(this.f)) * 31) + this.g.hashCode()) * 31) + dihp.a(this.h)) * 31) + dihp.a(this.i)) * 31;
        fdae fdaeVar = this.j;
        return ((iHashCode2 + (fdaeVar != null ? fdaeVar.hashCode() : 0)) * 31) + this.k.hashCode();
    }

    public final String toString() {
        return "ActionUiData(title=" + this.a + ", icon=" + this.b + ", isIconBadged=" + this.c + ", pinToOverflowMenu=" + this.d + ", isVisible=" + this.e + ", canExecute=" + this.f + ", subActions=" + this.g + ", showIconsForSubActions=" + this.h + ", shouldTint=" + this.i + ", onResume=" + this.j + ", execute=" + this.k + ")";
    }
}
