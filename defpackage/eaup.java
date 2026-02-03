package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class eaup extends eavr {
    public final deem a;
    public final List b;
    public final List c;
    public final String d;

    public eaup(deem deemVar, List list, List list2, String str) {
        this.a = deemVar;
        this.b = list;
        this.c = list2;
        this.d = str;
    }

    @Override // defpackage.eanv
    public final deem a() {
        return this.a;
    }

    @Override // defpackage.eavr
    public final String b() {
        return this.d;
    }

    @Override // defpackage.eavr
    public final List c() {
        return this.b;
    }

    @Override // defpackage.eavr
    public final List d() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof eavr) {
            eavr eavrVar = (eavr) obj;
            deem deemVar = this.a;
            if (deemVar != null ? deemVar.equals(eavrVar.a()) : eavrVar.a() == null) {
                eavrVar.f();
                eavrVar.g();
                eavrVar.h();
                eavrVar.i();
                eavrVar.j();
                eavrVar.o();
                if (this.b.equals(eavrVar.c()) && this.c.equals(eavrVar.d())) {
                    eavrVar.k();
                    eavrVar.l();
                    eavrVar.r();
                    if (this.d.equals(eavrVar.b())) {
                        eavrVar.e();
                        eavrVar.m();
                        eavrVar.n();
                        eavrVar.q();
                        eavrVar.p();
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        deem deemVar = this.a;
        return (((((((((((((((deemVar == null ? 0 : deemVar.hashCode()) ^ 1000003) * 272515929) ^ 1237) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 583896283) ^ 1237) * 1000003) ^ this.d.hashCode()) * 1525764945) ^ 1237) * 1000003) ^ 1237;
    }

    public final String toString() {
        List list = this.c;
        List list2 = this.b;
        return "SearchByTextRequest{cancellationToken=" + String.valueOf(this.a) + ", includedType=null, locationBias=null, locationRestriction=null, maxResultCount=null, minRating=null, openNow=false, placeFields=" + list2.toString() + ", priceLevels=" + list.toString() + ", rankPreference=null, regionCode=null, strictTypeFiltering=false, textQuery=" + this.d + ", evSearchOptions=null, routingParameters=null, searchAlongRouteParameters=null, routingSummariesIncluded=false, pureServiceAreaBusinessesIncluded=false}";
    }

    @Override // defpackage.eavr
    public final void e() {
    }

    @Override // defpackage.eavr
    public final void f() {
    }

    @Override // defpackage.eavr
    public final void g() {
    }

    @Override // defpackage.eavr
    public final void h() {
    }

    @Override // defpackage.eavr
    public final void i() {
    }

    @Override // defpackage.eavr
    public final void j() {
    }

    @Override // defpackage.eavr
    public final void k() {
    }

    @Override // defpackage.eavr
    public final void l() {
    }

    @Override // defpackage.eavr
    public final void m() {
    }

    @Override // defpackage.eavr
    public final void n() {
    }

    @Override // defpackage.eavr
    public final void o() {
    }

    @Override // defpackage.eavr
    public final void p() {
    }

    @Override // defpackage.eavr
    public final void q() {
    }

    @Override // defpackage.eavr
    public final void r() {
    }
}
