package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dkao implements djvp {
    public final dkpi a;
    public final String b;
    public final djzz c;
    public final String d;
    private final fdae e = null;

    public dkao(dkpi dkpiVar, String str, djzz djzzVar, String str2) {
        this.a = dkpiVar;
        this.b = str;
        this.c = djzzVar;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dkao)) {
            return false;
        }
        dkao dkaoVar = (dkao) obj;
        if (!fdbq.f(this.a, dkaoVar.a) || !fdbq.f(this.b, dkaoVar.b) || !fdbq.f(this.c, dkaoVar.c) || !fdbq.f(this.d, dkaoVar.d)) {
            return false;
        }
        fdae fdaeVar = dkaoVar.e;
        return fdbq.f(null, null);
    }

    public final int hashCode() {
        int iHashCode = (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
        String str = this.d;
        return ((iHashCode * 31) + (str == null ? 0 : str.hashCode())) * 31;
    }

    public final String toString() {
        return "ReactionListItemUiData(monogram=" + this.a + ", title=" + this.b + ", reaction=" + this.c + ", subtitle=" + this.d + ", onClick=null)";
    }
}
