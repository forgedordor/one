package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class avog extends awcf {
    public final String a;
    public final String b;
    private final String c;
    private final awcg d;
    private final emtz e;
    private final emuf f;

    public avog(String str, String str2, String str3, awcg awcgVar, emtz emtzVar, emuf emufVar) {
        if (str == null) {
            throw new NullPointerException("Null deviceCountry");
        }
        this.c = str;
        this.a = str2;
        this.b = str3;
        this.d = awcgVar;
        this.e = emtzVar;
        this.f = emufVar;
    }

    @Override // defpackage.awcf
    public final awcg a() {
        return this.d;
    }

    @Override // defpackage.awcf
    public final emtz b() {
        return this.e;
    }

    @Override // defpackage.awcf
    public final emuf c() {
        return this.f;
    }

    @Override // defpackage.awcf
    public final String d() {
        return this.c;
    }

    @Override // defpackage.awcf
    public final String e() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        awcg awcgVar;
        emtz emtzVar;
        emuf emufVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof awcf) {
            awcf awcfVar = (awcf) obj;
            if (this.c.equals(awcfVar.d()) && this.a.equals(awcfVar.f()) && this.b.equals(awcfVar.e()) && ((awcgVar = this.d) != null ? awcgVar.equals(awcfVar.a()) : awcfVar.a() == null) && ((emtzVar = this.e) != null ? emtzVar.equals(awcfVar.b()) : awcfVar.b() == null) && ((emufVar = this.f) != null ? emufVar.equals(awcfVar.c()) : awcfVar.c() == null)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.awcf
    public final String f() {
        return this.a;
    }

    public final int hashCode() {
        int iHashCode = ((((this.c.hashCode() ^ 1000003) * 1000003) ^ this.a.hashCode()) * 1000003) ^ this.b.hashCode();
        awcg awcgVar = this.d;
        int iHashCode2 = ((iHashCode * 1000003) ^ (awcgVar == null ? 0 : awcgVar.hashCode())) * 1000003;
        emtz emtzVar = this.e;
        int iHashCode3 = (iHashCode2 ^ (emtzVar == null ? 0 : emtzVar.hashCode())) * 1000003;
        emuf emufVar = this.f;
        return iHashCode3 ^ (emufVar != null ? emufVar.hashCode() : 0);
    }

    public final String toString() {
        emuf emufVar = this.f;
        emtz emtzVar = this.e;
        return "AnonymizedDestination{deviceCountry=" + this.c + ", rawAnonymizedWithExplicitCountryCode=" + this.a + ", rawAnonymizedWithAnonymizedCountryCode=" + this.b + ", phoneAnonymizationResult=" + String.valueOf(this.d) + ", anonymizedBotInfo=" + String.valueOf(emtzVar) + ", anonymizedRcsGroupInfo=" + String.valueOf(emufVar) + "}";
    }
}
