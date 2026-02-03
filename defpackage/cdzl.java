package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cdzl implements cdzm {
    public final int a;
    public final dijs b;
    private final fgle c;
    private final fgle d;
    private final String e;

    public /* synthetic */ cdzl(int i, dijs dijsVar, fgle fgleVar, fgle fgleVar2) {
        dijsVar.getClass();
        this.a = i;
        this.b = dijsVar;
        this.c = fgleVar;
        this.d = fgleVar2;
        this.e = null;
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
        if (!(obj instanceof cdzl)) {
            return false;
        }
        cdzl cdzlVar = (cdzl) obj;
        if (this.a != cdzlVar.a || this.b != cdzlVar.b || !fdbq.f(this.c, cdzlVar.c) || !fdbq.f(this.d, cdzlVar.d)) {
            return false;
        }
        String str = cdzlVar.e;
        return fdbq.f(null, null);
    }

    public final int hashCode() {
        int iHashCode = (((this.a * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
        fgle fgleVar = this.d;
        return ((iHashCode * 31) + (fgleVar == null ? 0 : fgleVar.hashCode())) * 31;
    }

    public final String toString() {
        return "Standard(startPosition=" + this.a + ", type=" + this.b + ", node=" + this.c + ", closingChild=" + this.d + ", embeddedText=null)";
    }
}
