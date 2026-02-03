package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class eaug extends eavg {
    public final List a;
    private final List b;
    private final deem c;

    public eaug(List list, List list2, deem deemVar) {
        this.b = list;
        this.a = list2;
        this.c = deemVar;
    }

    @Override // defpackage.eavg, defpackage.eanv
    public final deem a() {
        return this.c;
    }

    @Override // defpackage.eavg
    public final List b() {
        return this.b;
    }

    @Override // defpackage.eavg
    public final List c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof eavg) {
            eavg eavgVar = (eavg) obj;
            eavgVar.h();
            eavgVar.e();
            eavgVar.f();
            eavgVar.g();
            if (this.b.equals(eavgVar.b())) {
                eavgVar.j();
                eavgVar.k();
                if (this.a.equals(eavgVar.c())) {
                    eavgVar.d();
                    eavgVar.i();
                    eavgVar.l();
                    deem deemVar = this.c;
                    if (deemVar != null ? deemVar.equals(eavgVar.a()) : eavgVar.a() == null) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = ((this.b.hashCode() ^ (-429739981)) * 583896283) ^ this.a.hashCode();
        deem deemVar = this.c;
        return (((iHashCode * 583896283) ^ 1237) * 1000003) ^ (deemVar == null ? 0 : deemVar.hashCode());
    }

    public final String toString() {
        deem deemVar = this.c;
        List list = this.a;
        return "FindAutocompletePredictionsRequest{query=null, locationBias=null, locationRestriction=null, origin=null, countries=" + this.b.toString() + ", sessionToken=null, typeFilter=null, typesFilter=" + list.toString() + ", inputOffset=null, regionCode=null, pureServiceAreaBusinessesIncluded=false, cancellationToken=" + String.valueOf(deemVar) + "}";
    }

    @Override // defpackage.eavg
    public final void d() {
    }

    @Override // defpackage.eavg
    public final void e() {
    }

    @Override // defpackage.eavg
    public final void f() {
    }

    @Override // defpackage.eavg
    public final void g() {
    }

    @Override // defpackage.eavg
    public final void h() {
    }

    @Override // defpackage.eavg
    public final void i() {
    }

    @Override // defpackage.eavg
    public final void j() {
    }

    @Override // defpackage.eavg
    @Deprecated
    public final void k() {
    }

    @Override // defpackage.eavg
    public final void l() {
    }
}
