package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class divb implements divd {
    public final djrr a;
    public final dkeg b;
    public final dkeg c;
    public final dkeg d;
    public final boolean e;

    public divb() {
        this(null, null, null, null, false, 31);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof divb)) {
            return false;
        }
        divb divbVar = (divb) obj;
        return this.a == divbVar.a && fdbq.f(this.b, divbVar.b) && fdbq.f(this.c, divbVar.c) && fdbq.f(this.d, divbVar.d) && this.e == divbVar.e;
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
        return "GaiaOptInContentItemUiData(headerIcon=" + this.a + ", header=" + this.b + ", body=" + this.c + ", bodyExtension=" + this.d + ", isFooter=" + this.e + ")";
    }

    public /* synthetic */ divb(djrr djrrVar, dkeg dkegVar, dkeg dkegVar2, dkeg dkegVar3, boolean z, int i) {
        this.a = 1 == (i & 1) ? null : djrrVar;
        this.b = (i & 2) != 0 ? null : dkegVar;
        this.c = (i & 4) != 0 ? null : dkegVar2;
        this.d = (i & 8) != 0 ? null : dkegVar3;
        this.e = ((i & 16) == 0) & z;
    }
}
