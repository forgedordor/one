package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cpld extends cplh {
    public final Long a;
    public final Long b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;

    public cpld(Long l, Long l2, String str, String str2, String str3, String str4) {
        this.a = l;
        this.b = l2;
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = str4;
    }

    @Override // defpackage.cplh
    public final Long a() {
        return this.b;
    }

    @Override // defpackage.cplh
    public final Long b() {
        return this.a;
    }

    @Override // defpackage.cplh
    public final String c() {
        return this.d;
    }

    @Override // defpackage.cplh
    public final String d() {
        return this.e;
    }

    @Override // defpackage.cplh
    public final String e() {
        return this.f;
    }

    public final boolean equals(Object obj) {
        String str;
        String str2;
        String str3;
        String str4;
        if (obj == this) {
            return true;
        }
        if (obj instanceof cplh) {
            cplh cplhVar = (cplh) obj;
            if (this.a.equals(cplhVar.b()) && this.b.equals(cplhVar.a()) && ((str = this.c) != null ? str.equals(cplhVar.f()) : cplhVar.f() == null) && ((str2 = this.d) != null ? str2.equals(cplhVar.c()) : cplhVar.c() == null) && ((str3 = this.e) != null ? str3.equals(cplhVar.d()) : cplhVar.d() == null) && ((str4 = this.f) != null ? str4.equals(cplhVar.e()) : cplhVar.e() == null)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.cplh
    public final String f() {
        return this.c;
    }

    public final int hashCode() {
        int iHashCode = ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
        String str = this.c;
        int iHashCode2 = ((iHashCode * 1000003) ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.d;
        int iHashCode3 = (iHashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.e;
        int iHashCode4 = (iHashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        String str4 = this.f;
        return iHashCode4 ^ (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        return "Event{startTime=" + this.a + ", endTime=" + this.b + ", summary=" + this.c + ", description=" + this.d + ", location=" + this.e + ", rrule=" + this.f + "}";
    }
}
