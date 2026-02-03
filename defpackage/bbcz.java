package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bbcz {
    public static final bbcy a = new bbcy();
    public static final List b = fcva.ao(new fddl('A', 'Z'));
    public static final List c = fcva.g('(', ')', '-', ' ', '*', '#', '@', '_', '.', ',', ':', ',', '/', '+');
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final String j;
    public final String k;
    public final String l;
    public final String m;
    public final List n;
    public final List o;
    private final String p;
    private final String q;

    public bbcz(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, List list, List list2) {
        this.d = str;
        this.e = str2;
        this.f = str3;
        this.g = str4;
        this.h = str5;
        this.i = str6;
        this.p = str7;
        this.q = str8;
        this.j = str9;
        this.k = str10;
        this.l = str11;
        this.m = str12;
        this.n = list;
        this.o = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bbcz)) {
            return false;
        }
        bbcz bbczVar = (bbcz) obj;
        return fdbq.f(this.d, bbczVar.d) && fdbq.f(this.e, bbczVar.e) && fdbq.f(this.f, bbczVar.f) && fdbq.f(this.g, bbczVar.g) && fdbq.f(this.h, bbczVar.h) && fdbq.f(this.i, bbczVar.i) && fdbq.f(this.p, bbczVar.p) && fdbq.f(this.q, bbczVar.q) && fdbq.f(this.j, bbczVar.j) && fdbq.f(this.k, bbczVar.k) && fdbq.f(this.l, bbczVar.l) && fdbq.f(this.m, bbczVar.m) && fdbq.f(this.n, bbczVar.n) && fdbq.f(this.o, bbczVar.o);
    }

    public final int hashCode() {
        String str = this.d;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.e;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        int i = iHashCode * 31;
        String str3 = this.f;
        int iHashCode3 = (((i + iHashCode2) * 31) + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.g;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.h;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.i;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.p;
        int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.q;
        int iHashCode8 = (iHashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.j;
        int iHashCode9 = (iHashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.k;
        int iHashCode10 = (iHashCode9 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.l;
        int iHashCode11 = (iHashCode10 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.m;
        return ((((iHashCode11 + (str12 != null ? str12.hashCode() : 0)) * 31) + this.n.hashCode()) * 31) + this.o.hashCode();
    }

    public final String toString() {
        return "AnonymizedRoamingInvestigationValues(originalNormalizedDestination=" + this.d + ", originalSendDestination=" + this.e + ", updatedNormalizedDestination=" + this.f + ", updatedSendDestination=" + this.g + ", expectedNormalizedDestination=" + this.h + ", expectedSendDestination=" + this.i + ", telephonyCanonicalAddress=" + this.p + ", userInputNumber=" + this.q + ", localeCountryCode=" + this.j + ", deviceCountryCode=" + this.k + ", deviceCountryCodeDeprecated=" + this.l + ", settingsCountryCode=" + this.m + ", simCountryCodes=" + this.n + ", networkCountryCodes=" + this.o + ")";
    }
}
