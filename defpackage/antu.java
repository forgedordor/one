package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class antu {
    public final String a;
    public final String b;
    public final String c;

    public antu(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof antu)) {
            return false;
        }
        antu antuVar = (antu) obj;
        return fdbq.f(this.a, antuVar.a) && fdbq.f(this.b, antuVar.b) && fdbq.f(this.c, antuVar.c);
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.b;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        int i = iHashCode * 31;
        String str3 = this.c;
        return ((i + iHashCode2) * 31) + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        return "ProfileReceivingMetadata(profileAccessToken=" + this.a + ", personId=" + this.b + ", profileLastUpdatedServerTimestamp=" + this.c + ")";
    }
}
