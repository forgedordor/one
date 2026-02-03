package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cwbj {
    public final String a;
    public final String b;
    public final String c;
    public final cwbi d;
    private final boolean e = true;

    public cwbj(String str, String str2, String str3, cwbi cwbiVar) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = cwbiVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cwbj)) {
            return false;
        }
        cwbj cwbjVar = (cwbj) obj;
        if (!fdbq.f(this.a, cwbjVar.a) || !fdbq.f(this.b, cwbjVar.b) || !fdbq.f(this.c, cwbjVar.c)) {
            return false;
        }
        boolean z = cwbjVar.e;
        return fdbq.f(this.d, cwbjVar.d);
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.b;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        int i = iHashCode * 31;
        String str3 = this.c;
        return ((((((i + iHashCode2) * 31) + (str3 != null ? str3.hashCode() : 0)) * 31) + 1231) * 31) + this.d.hashCode();
    }

    public final String toString() {
        return "TitleUiData(title=" + this.a + ", subtitle=" + this.b + ", displayDestination=" + this.c + ", enableCopyTitleToClipBoard=true, flags=" + this.d + ")";
    }
}
