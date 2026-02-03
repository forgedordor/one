package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ctnb implements ctmp {
    private final String a;
    private final fdae b;
    private final fctc c;

    public ctnb(String str, fdae fdaeVar) {
        str.getClass();
        this.a = str;
        this.b = fdaeVar;
        this.c = fctd.b(3, fdaeVar);
    }

    @Override // defpackage.ctmp
    public final ctmw a() {
        return (ctmw) this.c.a();
    }

    @Override // defpackage.ctmp
    public final String b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ctnb)) {
            return false;
        }
        ctnb ctnbVar = (ctnb) obj;
        return fdbq.f(this.a, ctnbVar.a) && fdbq.f(this.b, ctnbVar.b);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "LazyContactUiData(id=" + this.a + ", initializer=" + this.b + ")";
    }
}
