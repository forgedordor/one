package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dkwa {
    public final iyl a;
    public final iyl b;
    public final iyl c;
    public final iyl d;
    public final List e;
    public final iyl f;

    public dkwa(iyl iylVar, iyl iylVar2, iyl iylVar3, iyl iylVar4, List list, iyl iylVar5) {
        this.a = iylVar;
        this.b = iylVar2;
        this.c = iylVar3;
        this.d = iylVar4;
        this.e = list;
        this.f = iylVar5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dkwa)) {
            return false;
        }
        dkwa dkwaVar = (dkwa) obj;
        return fdbq.f(this.a, dkwaVar.a) && fdbq.f(this.b, dkwaVar.b) && fdbq.f(this.c, dkwaVar.c) && fdbq.f(this.d, dkwaVar.d) && fdbq.f(this.e, dkwaVar.e) && fdbq.f(this.f, dkwaVar.f);
    }

    public final int hashCode() {
        int iHashCode = (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
        iyl iylVar = this.d;
        return (((((iHashCode * 31) + (iylVar == null ? 0 : iylVar.hashCode())) * 31) + this.e.hashCode()) * 31) + this.f.hashCode();
    }

    public final String toString() {
        return "RichCardPlaceables(spacer=" + this.a + ", title=" + this.b + ", desc=" + this.c + ", seeMore=" + this.d + ", actions=" + this.e + ", bottomSpacer=" + this.f + ")";
    }
}
