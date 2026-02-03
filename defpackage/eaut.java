package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class eaut extends eavv {
    public final List a;
    public final List b;
    public final List c;
    public final List d;
    public final eask e;
    public final List f;
    public final deem g;

    public eaut(List list, List list2, List list3, List list4, eask easkVar, List list5, deem deemVar) {
        this.a = list;
        this.b = list2;
        this.c = list3;
        this.d = list4;
        this.e = easkVar;
        this.f = list5;
        this.g = deemVar;
    }

    @Override // defpackage.eavv, defpackage.eanv
    public final deem a() {
        return this.g;
    }

    @Override // defpackage.eavv
    public final eask b() {
        return this.e;
    }

    @Override // defpackage.eavv
    public final List c() {
        return this.d;
    }

    @Override // defpackage.eavv
    public final List d() {
        return this.b;
    }

    @Override // defpackage.eavv
    public final List e() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        deem deemVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof eavv) {
            eavv eavvVar = (eavv) obj;
            eavvVar.j();
            List list = this.a;
            if (list != null ? list.equals(eavvVar.f()) : eavvVar.f() == null) {
                List list2 = this.b;
                if (list2 != null ? list2.equals(eavvVar.d()) : eavvVar.d() == null) {
                    List list3 = this.c;
                    if (list3 != null ? list3.equals(eavvVar.e()) : eavvVar.e() == null) {
                        List list4 = this.d;
                        if (list4 != null ? list4.equals(eavvVar.c()) : eavvVar.c() == null) {
                            eavvVar.h();
                            if (this.e.equals(eavvVar.b()) && this.f.equals(eavvVar.g()) && ((deemVar = this.g) != null ? deemVar.equals(eavvVar.a()) : eavvVar.a() == null)) {
                                eavvVar.i();
                                eavvVar.k();
                                eavvVar.l();
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // defpackage.eavv
    public final List f() {
        return this.a;
    }

    @Override // defpackage.eavv
    public final List g() {
        return this.f;
    }

    public final int hashCode() {
        List list = this.a;
        int iHashCode = list == null ? 0 : list.hashCode();
        List list2 = this.b;
        int iHashCode2 = list2 == null ? 0 : list2.hashCode();
        int i = iHashCode ^ (-721379959);
        List list3 = this.c;
        int iHashCode3 = list3 == null ? 0 : list3.hashCode();
        int i2 = (i * 1000003) ^ iHashCode2;
        List list4 = this.d;
        int iHashCode4 = ((((((((i2 * 1000003) ^ iHashCode3) * 1000003) ^ (list4 == null ? 0 : list4.hashCode())) * (-721379959)) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003;
        deem deemVar = this.g;
        return ((iHashCode4 ^ (deemVar != null ? deemVar.hashCode() : 0)) * 583896283) ^ 1237;
    }

    public final String toString() {
        deem deemVar = this.g;
        List list = this.f;
        eask easkVar = this.e;
        List list2 = this.d;
        List list3 = this.c;
        List list4 = this.b;
        return "SearchNearbyRequest{regionCode=null, includedTypes=" + String.valueOf(this.a) + ", excludedTypes=" + String.valueOf(list4) + ", includedPrimaryTypes=" + String.valueOf(list3) + ", excludedPrimaryTypes=" + String.valueOf(list2) + ", maxResultCount=null, locationRestriction=" + easkVar.toString() + ", placeFields=" + list.toString() + ", cancellationToken=" + String.valueOf(deemVar) + ", rankPreference=null, routingParameters=null, routingSummariesIncluded=false}";
    }

    @Override // defpackage.eavv
    public final void h() {
    }

    @Override // defpackage.eavv
    public final void i() {
    }

    @Override // defpackage.eavv
    public final void j() {
    }

    @Override // defpackage.eavv
    public final void k() {
    }

    @Override // defpackage.eavv
    public final void l() {
    }
}
