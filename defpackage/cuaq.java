package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cuaq implements cubn {
    private final String a;
    private final fdae b;
    private final fctc c;

    public cuaq(String str, fdae fdaeVar) {
        this.a = str;
        this.b = fdaeVar;
        this.c = fctd.b(3, fdaeVar);
    }

    @Override // defpackage.cubn
    public final ctzh a() {
        return (ctzh) this.c.a();
    }

    @Override // defpackage.cubn
    public final String b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cuaq)) {
            return false;
        }
        cuaq cuaqVar = (cuaq) obj;
        return fdbq.f(this.a, cuaqVar.a) && fdbq.f(this.b, cuaqVar.b);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "LazyContactSuggestionsRowUiData(key=" + this.a + ", initializer=" + this.b + ")";
    }
}
