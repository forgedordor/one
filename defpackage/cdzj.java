package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cdzj implements cdzm {
    public final String a;
    private final int b;
    private final fgle c;
    private final fgle d;

    public cdzj(int i, fgle fgleVar, fgle fgleVar2, String str) {
        this.b = i;
        this.c = fgleVar;
        this.d = fgleVar2;
        this.a = str;
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
        if (!(obj instanceof cdzj)) {
            return false;
        }
        cdzj cdzjVar = (cdzj) obj;
        return this.b == cdzjVar.b && fdbq.f(this.c, cdzjVar.c) && fdbq.f(this.d, cdzjVar.d) && fdbq.f(this.a, cdzjVar.a);
    }

    public final int hashCode() {
        int iHashCode = (this.b * 31) + this.c.hashCode();
        fgle fgleVar = this.d;
        return (((iHashCode * 31) + (fgleVar == null ? 0 : fgleVar.hashCode())) * 31) + this.a.hashCode();
    }

    public final String toString() {
        return "Image(startPosition=" + this.b + ", node=" + this.c + ", closingChild=" + this.d + ", url=" + this.a + ")";
    }
}
