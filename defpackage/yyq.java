package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class yyq {
    public final ajlt a;
    public final dkgv b;
    public final zqk c;
    public final angr d;
    public final boolean e;

    public yyq(ajlt ajltVar, dkgv dkgvVar, zqk zqkVar, angr angrVar, boolean z) {
        ajltVar.getClass();
        dkgvVar.getClass();
        this.a = ajltVar;
        this.b = dkgvVar;
        this.c = zqkVar;
        this.d = angrVar;
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yyq)) {
            return false;
        }
        yyq yyqVar = (yyq) obj;
        return fdbq.f(this.a, yyqVar.a) && this.b == yyqVar.b && fdbq.f(this.c, yyqVar.c) && fdbq.f(this.d, yyqVar.d) && this.e == yyqVar.e;
    }

    public final int hashCode() {
        int iHashCode = (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
        angr angrVar = this.d;
        return (((iHashCode * 31) + (angrVar == null ? 0 : angrVar.hashCode())) * 31) + (true != this.e ? 1237 : 1231);
    }

    public final String toString() {
        return "ReactionsBarArgs(message=" + this.a + ", horizontalAlignment=" + this.b + ", selectionData=" + this.c + ", existingReactions=" + this.d + ", isLatestIncoming=" + this.e + ")";
    }
}
