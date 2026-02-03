package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dkrl implements dkrn {
    public final djrr a;
    public final dkeg b;
    public final dkeg c;
    public final dkeg d;
    public final boolean e;

    public dkrl(djrr djrrVar, dkeg dkegVar, dkeg dkegVar2, dkeg dkegVar3, boolean z) {
        this.a = djrrVar;
        this.b = dkegVar;
        this.c = dkegVar2;
        this.d = dkegVar3;
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dkrl)) {
            return false;
        }
        dkrl dkrlVar = (dkrl) obj;
        return this.a == dkrlVar.a && fdbq.f(this.b, dkrlVar.b) && fdbq.f(this.c, dkrlVar.c) && fdbq.f(this.d, dkrlVar.d) && this.e == dkrlVar.e;
    }

    public final int hashCode() {
        djrr djrrVar = this.a;
        int iHashCode = djrrVar == null ? 0 : djrrVar.hashCode();
        dkeg dkegVar = this.b;
        int iHashCode2 = ((iHashCode * 31) + (dkegVar == null ? 0 : dkegVar.hashCode())) * 31;
        dkeg dkegVar2 = this.c;
        int iHashCode3 = (iHashCode2 + (dkegVar2 == null ? 0 : dkegVar2.hashCode())) * 31;
        dkeg dkegVar3 = this.d;
        return ((iHashCode3 + (dkegVar3 != null ? dkegVar3.hashCode() : 0)) * 31) + (true != this.e ? 1237 : 1231);
    }

    public final String toString() {
        return "GaiaSellPageContentItemUiData(headerIcon=" + this.a + ", header=" + this.b + ", body=" + this.c + ", bodyExtension=" + this.d + ", isFooter=" + this.e + ")";
    }
}
