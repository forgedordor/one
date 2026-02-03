package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cdzk implements cdzm {
    public final int a;
    public final String b;
    private final fgle c;
    private final fgle d;

    public cdzk(int i, fgle fgleVar, fgle fgleVar2, String str) {
        this.a = i;
        this.c = fgleVar;
        this.d = fgleVar2;
        this.b = str;
    }

    @Override // defpackage.cdzm
    public final fgle a() {
        return this.d;
    }

    @Override // defpackage.cdzm
    public final fgle b() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cdzk)) {
            return false;
        }
        cdzk cdzkVar = (cdzk) obj;
        return this.a == cdzkVar.a && fdbq.f(this.c, cdzkVar.c) && fdbq.f(this.d, cdzkVar.d) && fdbq.f(this.b, cdzkVar.b);
    }

    public final int hashCode() {
        int iHashCode = (this.a * 31) + this.c.hashCode();
        fgle fgleVar = this.d;
        return (((iHashCode * 31) + (fgleVar == null ? 0 : fgleVar.hashCode())) * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "Link(startPosition=" + this.a + ", node=" + this.c + ", closingChild=" + this.d + ", embeddedText=" + this.b + ")";
    }
}
