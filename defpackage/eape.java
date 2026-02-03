package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class eape extends eatp {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final Double f;
    public final eapr g;
    public final String h;
    public final String i;

    public eape(String str, String str2, String str3, String str4, String str5, Double d, eapr eaprVar, String str6, String str7) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = d;
        if (eaprVar == null) {
            throw new NullPointerException("Null authorAttribution");
        }
        this.g = eaprVar;
        if (str6 == null) {
            throw new NullPointerException("Null attribution");
        }
        this.h = str6;
        this.i = str7;
    }

    @Override // defpackage.eatp
    public final eapr a() {
        return this.g;
    }

    @Override // defpackage.eatp
    public final Double b() {
        return this.f;
    }

    @Override // defpackage.eatp
    public final String c() {
        return this.h;
    }

    @Override // defpackage.eatp
    public final String d() {
        return this.d;
    }

    @Override // defpackage.eatp
    public final String e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof eatp) {
            eatp eatpVar = (eatp) obj;
            String str2 = this.a;
            if (str2 != null ? str2.equals(eatpVar.g()) : eatpVar.g() == null) {
                String str3 = this.b;
                if (str3 != null ? str3.equals(eatpVar.h()) : eatpVar.h() == null) {
                    String str4 = this.c;
                    if (str4 != null ? str4.equals(eatpVar.i()) : eatpVar.i() == null) {
                        String str5 = this.d;
                        if (str5 != null ? str5.equals(eatpVar.d()) : eatpVar.d() == null) {
                            String str6 = this.e;
                            if (str6 != null ? str6.equals(eatpVar.e()) : eatpVar.e() == null) {
                                if (this.f.equals(eatpVar.b()) && this.g.equals(eatpVar.a()) && this.h.equals(eatpVar.c()) && ((str = this.i) != null ? str.equals(eatpVar.f()) : eatpVar.f() == null)) {
                                    return true;
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // defpackage.eatp
    public final String f() {
        return this.i;
    }

    @Override // defpackage.eatp
    public final String g() {
        return this.a;
    }

    @Override // defpackage.eatp
    public final String h() {
        return this.b;
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.b;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        int i = iHashCode ^ 1000003;
        String str3 = this.c;
        int iHashCode3 = ((((i * 1000003) ^ iHashCode2) * 1000003) ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        String str4 = this.d;
        int iHashCode4 = (iHashCode3 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
        String str5 = this.e;
        int iHashCode5 = (((((((iHashCode4 ^ (str5 == null ? 0 : str5.hashCode())) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.g.hashCode()) * 1000003) ^ this.h.hashCode()) * 1000003;
        String str6 = this.i;
        return iHashCode5 ^ (str6 != null ? str6.hashCode() : 0);
    }

    @Override // defpackage.eatp
    public final String i() {
        return this.c;
    }

    public final String toString() {
        return "Review{relativePublishTimeDescription=" + this.a + ", text=" + this.b + ", textLanguageCode=" + this.c + ", originalText=" + this.d + ", originalTextLanguageCode=" + this.e + ", rating=" + this.f + ", authorAttribution=" + this.g.toString() + ", attribution=" + this.h + ", publishTime=" + this.i + "}";
    }
}
