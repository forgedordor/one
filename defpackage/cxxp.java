package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cxxp {
    public final String a;
    public final hsf b;

    public cxxp(String str, hsf hsfVar) {
        hsfVar.getClass();
        this.a = str;
        this.b = hsfVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cxxp)) {
            return false;
        }
        cxxp cxxpVar = (cxxp) obj;
        return fdbq.f(this.a, cxxpVar.a) && fdbq.f(this.b, cxxpVar.b);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "OverviewCardRowData(label=" + this.a + ", valueState=" + this.b + ")";
    }
}
