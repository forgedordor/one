package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dile implements dilh {
    public final String a;
    public final String b;
    private final boolean c;
    private final String d;

    public /* synthetic */ dile(String str, String str2, String str3, int i) {
        this.a = str;
        this.b = (i & 2) != 0 ? null : str2;
        this.c = false;
        this.d = str3;
    }

    @Override // defpackage.dilm
    public final String e() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dile)) {
            return false;
        }
        dile dileVar = (dile) obj;
        if (!fdbq.f(this.a, dileVar.a) || !fdbq.f(this.b, dileVar.b)) {
            return false;
        }
        boolean z = dileVar.c;
        return fdbq.f(this.d, dileVar.d);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        return ((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + 1237) * 31) + this.d.hashCode();
    }

    public final String toString() {
        return "Error(title=" + this.a + ", subtitle=" + this.b + ", isIconHighlighted=false, contentDescription=" + this.d + ")";
    }
}
