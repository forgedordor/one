package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dkcd implements djvp {
    public final String a;
    public final String b;
    public final boolean c;
    public final boolean d;
    public final fdae e;
    public final dlcr f;

    public dkcd(dlcr dlcrVar, String str, String str2, boolean z, boolean z2, fdae fdaeVar) {
        this.f = dlcrVar;
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = z2;
        this.e = fdaeVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dkcd)) {
            return false;
        }
        dkcd dkcdVar = (dkcd) obj;
        return fdbq.f(this.f, dkcdVar.f) && fdbq.f(this.a, dkcdVar.a) && fdbq.f(this.b, dkcdVar.b) && this.c == dkcdVar.c && this.d == dkcdVar.d && fdbq.f(this.e, dkcdVar.e);
    }

    public final int hashCode() {
        int iHashCode = (((this.f.hashCode() * 31) + this.a.hashCode()) * 31) + this.b.hashCode();
        fdae fdaeVar = this.e;
        return (((((iHashCode * 31) + dkcc.a(this.c)) * 31) + dkcc.a(this.d)) * 31) + fdaeVar.hashCode();
    }

    public final String toString() {
        return "SimRadioButtonListItemUiData(simIconUiData=" + this.f + ", title=" + this.a + ", subtitle=" + this.b + ", isSelected=" + this.c + ", isDefault=" + this.d + ", onClick=" + this.e + ")";
    }
}
