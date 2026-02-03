package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class daxu {
    public final String a;
    public final String b;
    public final String c;
    public final daxs d;
    public final fdae e;
    public final fdae f;
    public final daxt g;
    public final ctcj h;

    public daxu(String str, String str2, String str3, daxs daxsVar, fdae fdaeVar, fdae fdaeVar2, daxt daxtVar, ctcj ctcjVar) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = daxsVar;
        this.e = fdaeVar;
        this.f = fdaeVar2;
        this.g = daxtVar;
        this.h = ctcjVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof daxu)) {
            return false;
        }
        daxu daxuVar = (daxu) obj;
        return fdbq.f(this.a, daxuVar.a) && fdbq.f(this.b, daxuVar.b) && fdbq.f(this.c, daxuVar.c) && fdbq.f(this.d, daxuVar.d) && fdbq.f(this.e, daxuVar.e) && fdbq.f(this.f, daxuVar.f) && fdbq.f(this.g, daxuVar.g) && this.h == daxuVar.h;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        return ((((((((((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + this.f.hashCode()) * 31) + this.g.hashCode()) * 31) + this.h.hashCode();
    }

    public final String toString() {
        return "WelcomeAccountScreenUiData(title=" + this.a + ", subtitle=" + this.b + ", profileSharingPreference=" + this.c + ", profileSharingMenuUiData=" + this.d + ", onEditPhoto=" + this.e + ", onEditName=" + this.f + ", flags=" + this.g + ", welcomeFlow=" + this.h + ")";
    }
}
