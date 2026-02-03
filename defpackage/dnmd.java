package defpackage;

import java.util.EnumSet;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dnmd extends dnme {
    private final dnjr a;
    private final EnumSet b;

    public dnmd(dnjr dnjrVar) {
        this.a = dnjrVar;
        fctc fctcVar = dnjw.a;
        this.b = dnjv.a();
    }

    @Override // defpackage.dnmj
    public final /* synthetic */ dnjs a() {
        return this.a;
    }

    @Override // defpackage.dnme
    public final dnkc b(dnjw dnjwVar, dnjz dnjzVar) {
        CharSequence string;
        dnjwVar.getClass();
        dnjzVar.getClass();
        dnml dnmlVar = dnjzVar.h;
        if (dnmlVar == null && dnjwVar.e == null) {
            string = this.a.a;
        } else {
            StringBuilder sb = new StringBuilder(this.a.a);
            if (dnmlVar != null) {
                sb.append(dnmlVar.a());
            }
            dnml dnmlVar2 = dnjwVar.e;
            if (dnmlVar2 != null) {
                sb.append(dnkf.c.a());
                sb.append(dnmlVar2.a());
                sb.append(dnkf.d.a());
            }
            string = sb.toString();
        }
        return new dnkc(string, this.a, dnjwVar, dnjzVar);
    }

    @Override // defpackage.dnme
    public final /* synthetic */ Set c() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dnmd) && fdbq.f(this.a, ((dnmd) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "WithPlainBase(base=" + this.a + ")";
    }
}
