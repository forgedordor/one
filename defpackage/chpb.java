package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class chpb {
    public final chpq a;
    public final boolean b;
    public final String c;
    public final String d;
    public final String e;
    private final String f;
    private final String g;
    private final String h;

    public chpb() {
        this(null, null, null, null, false, 31);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof chpb)) {
            return false;
        }
        chpb chpbVar = (chpb) obj;
        return fdbq.f(this.f, chpbVar.f) && fdbq.f(this.g, chpbVar.g) && fdbq.f(this.h, chpbVar.h) && this.a == chpbVar.a && this.b == chpbVar.b;
    }

    public final int hashCode() {
        String str = this.f;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.g;
        int iHashCode2 = ((iHashCode * 31) + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.h;
        return ((((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31) + this.a.hashCode()) * 31) + (true != this.b ? 1237 : 1231);
    }

    public final String toString() {
        return "DefaultProfileName(defaultFirstName=" + this.f + ", defaultLastName=" + this.g + ", defaultDisplayName=" + this.h + ", source=" + this.a + ", hasName=" + this.b + ")";
    }

    public /* synthetic */ chpb(String str, String str2, String str3, chpq chpqVar, boolean z, int i) {
        chpqVar = (i & 8) != 0 ? chpq.PROFILE_PEOPLE_SHARING_SOURCE : chpqVar;
        int i2 = i & 2;
        int i3 = i & 1;
        String str4 = null;
        str3 = (i & 4) != 0 ? null : str3;
        str2 = i2 != 0 ? null : str2;
        str = 1 == i3 ? null : str;
        boolean z2 = (i & 16) == 0;
        chpqVar.getClass();
        this.f = str;
        this.g = str2;
        this.h = str3;
        this.a = chpqVar;
        this.b = z & z2;
        this.c = (str == null || str.length() == 0) ? null : str;
        this.d = (str2 == null || str2.length() == 0) ? null : str2;
        if (str3 != null && str3.length() != 0) {
            str4 = str3;
        }
        this.e = str4;
    }
}
