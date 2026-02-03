package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class baty extends baxq {
    private final bvea a;
    private final String b;
    private final String c;
    private final String d;
    private final String e;
    private final String f;
    private final String g;

    public baty(bvea bveaVar, String str, String str2, String str3, String str4, String str5, String str6) {
        if (bveaVar == null) {
            throw new NullPointerException("Null transportProtocol");
        }
        this.a = bveaVar;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = str6;
    }

    @Override // defpackage.baxq
    public final bvea a() {
        return this.a;
    }

    @Override // defpackage.baxq
    public final String b() {
        return this.c;
    }

    @Override // defpackage.baxq
    public final String c() {
        return this.b;
    }

    @Override // defpackage.baxq
    public final String d() {
        return this.e;
    }

    @Override // defpackage.baxq
    public final String e() {
        return this.g;
    }

    public final boolean equals(Object obj) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        if (obj == this) {
            return true;
        }
        if (obj instanceof baxq) {
            baxq baxqVar = (baxq) obj;
            if (this.a.equals(baxqVar.a()) && ((str = this.b) != null ? str.equals(baxqVar.c()) : baxqVar.c() == null) && ((str2 = this.c) != null ? str2.equals(baxqVar.b()) : baxqVar.b() == null) && ((str3 = this.d) != null ? str3.equals(baxqVar.g()) : baxqVar.g() == null) && ((str4 = this.e) != null ? str4.equals(baxqVar.d()) : baxqVar.d() == null) && ((str5 = this.f) != null ? str5.equals(baxqVar.f()) : baxqVar.f() == null) && ((str6 = this.g) != null ? str6.equals(baxqVar.e()) : baxqVar.e() == null)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.baxq
    public final String f() {
        return this.f;
    }

    @Override // defpackage.baxq
    public final String g() {
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
        int iHashCode6 = (iHashCode5 ^ (str5 == null ? 0 : str5.hashCode())) * 1000003;
        String str6 = this.g;
        return iHashCode6 ^ (str6 != null ? str6.hashCode() : 0);
    }

    public final String toString() {
        return "MessageSendReceiveAttemptRowInfo{transportProtocol=" + this.a.toString() + ", currentSimNetworkCountry=" + this.b + ", currentSimCountry=" + this.c + ", settingsCountry=" + this.d + ", defaultSmsSimCountry=" + this.e + ", localeCountry=" + this.f + ", defaultSmsSimNetworkCountry=" + this.g + "}";
    }
}
