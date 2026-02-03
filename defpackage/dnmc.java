package defpackage;

import java.util.Set;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dnmc extends dnme {
    private final dnjq a;
    private final Set b;

    public dnmc(dnjq dnjqVar) {
        this.a = dnjqVar;
        this.b = dnjqVar.b;
    }

    @Override // defpackage.dnmj
    public final /* synthetic */ dnjs a() {
        return this.a;
    }

    @Override // defpackage.dnme
    public final dnkc b(dnjw dnjwVar, dnjz dnjzVar) {
        dnjwVar.getClass();
        dnjzVar.getClass();
        dnmm dnmmVar = dnmn.a;
        StringBuilder sb = dnmn.a.get();
        sb.append(dnjwVar.f.a());
        dnml dnmlVar = dnjzVar.h;
        if (dnmlVar != null) {
            sb.append(dnmlVar.a());
        }
        sb.append(dnkf.c.a());
        dnjq dnjqVar = this.a;
        sb.append(dnjqVar.a);
        sb.append(dnkf.d.a());
        return new dnkc(sb.toString(), dnjqVar, dnjwVar, dnjzVar);
    }

    @Override // defpackage.dnme
    public final Set c() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dnmc) && fdbq.f(this.a, ((dnmc) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "WithPersonComposedBase(base=" + this.a + ")";
    }
}
