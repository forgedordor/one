package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class afvo implements afwv {
    private final String a;
    private final fdae b;
    private final fctc c;

    public afvo(String str, fdae fdaeVar) {
        this.a = str;
        this.b = fdaeVar;
        this.c = fctd.b(3, fdaeVar);
    }

    @Override // defpackage.afwv
    public final afvc a() {
        return (afvc) this.c.a();
    }

    @Override // defpackage.afwv
    public final String b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof afvo)) {
            return false;
        }
        afvo afvoVar = (afvo) obj;
        return fdbq.f(this.a, afvoVar.a) && fdbq.f(this.b, afvoVar.b);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "LazySuggestionsRowUiData(key=" + this.a + ", initializer=" + this.b + ")";
    }
}
