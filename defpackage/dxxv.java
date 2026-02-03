package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dxxv extends dxxu {
    private final Object a;
    private final String b;
    private final String c;
    private final String d;
    private final String e;
    private final String f;
    private final dxxo g;

    public dxxv(Object obj, String str, String str2, String str3, String str4, String str5, dxxo dxxoVar) {
        this.a = obj;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = dxxoVar;
    }

    @Override // defpackage.dxxu
    public final dxxo a() {
        return this.g;
    }

    @Override // defpackage.dxxu
    public final Object c() {
        return this.a;
    }

    @Override // defpackage.dxxu
    public final String d() {
        return this.b;
    }

    @Override // defpackage.dxxu
    public final String e() {
        return this.f;
    }

    public final boolean equals(Object obj) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        if (obj == this) {
            return true;
        }
        if (obj instanceof dxxu) {
            dxxu dxxuVar = (dxxu) obj;
            if (this.a.equals(dxxuVar.c()) && ((str = this.b) != null ? str.equals(dxxuVar.d()) : dxxuVar.d() == null) && ((str2 = this.c) != null ? str2.equals(dxxuVar.f()) : dxxuVar.f() == null) && ((str3 = this.d) != null ? str3.equals(dxxuVar.h()) : dxxuVar.h() == null) && ((str4 = this.e) != null ? str4.equals(dxxuVar.g()) : dxxuVar.g() == null) && ((str5 = this.f) != null ? str5.equals(dxxuVar.e()) : dxxuVar.e() == null)) {
                dxxuVar.i();
                dxxo dxxoVar = this.g;
                if (dxxoVar != null ? dxxoVar.equals(dxxuVar.a()) : dxxuVar.a() == null) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // defpackage.dxxu
    public final String f() {
        return this.c;
    }

    @Override // defpackage.dxxu
    public final String g() {
        return this.e;
    }

    @Override // defpackage.dxxu
    public final String h() {
        return this.d;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() ^ 1000003;
        String str = this.b;
        int iHashCode2 = ((iHashCode * 1000003) ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.c;
        int iHashCode3 = (iHashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.d;
        int iHashCode4 = (iHashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        String str4 = this.e;
        int iHashCode5 = (iHashCode4 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
        String str5 = this.f;
        int iHashCode6 = (((iHashCode5 ^ (str5 == null ? 0 : str5.hashCode())) * 1000003) ^ 1231) * 1000003;
        dxxo dxxoVar = this.g;
        return iHashCode6 ^ (dxxoVar != null ? dxxoVar.hashCode() : 0);
    }

    public final String toString() {
        dxxo dxxoVar = this.g;
        return "AccountSnapshot{account=" + this.a.toString() + ", accountName=" + this.b + ", displayName=" + this.c + ", givenName=" + this.d + ", familyName=" + this.e + ", avatarUrl=" + this.f + ", isMetadataAvailable=true, gaiaAccountData=" + String.valueOf(dxxoVar) + "}";
    }

    @Override // defpackage.dxxu
    public final void i() {
    }
}
