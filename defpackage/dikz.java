package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dikz implements dilc {
    public final String a;
    public final String b;
    private final String c;

    public dikz(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    @Override // defpackage.dilm
    public final String e() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dikz)) {
            return false;
        }
        dikz dikzVar = (dikz) obj;
        return fdbq.f(this.a, dikzVar.a) && fdbq.f(this.b, dikzVar.b) && fdbq.f(this.c, dikzVar.c);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        return ((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "Error(title=" + this.a + ", subtitle=" + this.b + ", contentDescription=" + this.c + ")";
    }

    public /* synthetic */ dikz(String str, String str2) {
        this(str, null, str2);
    }
}
