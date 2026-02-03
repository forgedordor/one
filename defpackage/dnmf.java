package defpackage;

import java.util.EnumSet;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dnmf extends dnmg {
    private final dnjr a;
    private final EnumSet b;

    public dnmf(dnjr dnjrVar) {
        this.a = dnjrVar;
        fctc fctcVar = dnjw.a;
        this.b = dnjv.a();
    }

    @Override // defpackage.dnmj
    public final /* synthetic */ dnjs a() {
        return this.a;
    }

    @Override // defpackage.dnmg
    public final dnkb b(dnjw dnjwVar) {
        dnjwVar.getClass();
        dnmm dnmmVar = dnmn.a;
        StringBuilder sb = dnmn.a.get();
        dnjr dnjrVar = this.a;
        sb.append(dnjrVar.a);
        dnml dnmlVar = dnjwVar.e;
        if (dnmlVar != null) {
            sb.append(dnkf.c.a());
            sb.append(dnmlVar.a());
            sb.append(dnkf.d.a());
        }
        return new dnkb(sb.toString(), dnjrVar, dnjwVar);
    }

    @Override // defpackage.dnmg
    public final /* synthetic */ Set c() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dnmf) && fdbq.f(this.a, ((dnmf) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "WithPlainBase(base=" + this.a + ")";
    }
}
