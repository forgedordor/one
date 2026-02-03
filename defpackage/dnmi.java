package defpackage;

import java.util.LinkedHashSet;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dnmi extends dnmj {
    private final dnjs a;

    public dnmi(dnjs dnjsVar) {
        this.a = dnjsVar;
    }

    @Override // defpackage.dnmj
    public final dnjs a() {
        return this.a;
    }

    public final dnkd b(dnjz dnjzVar) {
        String strA;
        dnmm dnmmVar = dnmn.a;
        StringBuilder sb = dnmn.a.get();
        dnjs dnjsVar = this.a;
        sb.append(((dnjr) dnjsVar).a);
        dnml dnmlVar = dnjzVar.h;
        if (dnmlVar != null && (strA = dnmlVar.a()) != null) {
            sb.append(strA);
        }
        return new dnkd(sb.toString(), dnjsVar, dnjzVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dnmi) && fdbq.f(this.a, ((dnmi) obj).a);
    }

    @Override // defpackage.dnmj
    public final Set f() {
        fctc fctcVar = dnjz.a;
        LinkedHashSet linkedHashSet = new LinkedHashSet(dnjy.a().size());
        for (dnjz dnjzVar : dnjy.a()) {
            dnjzVar.getClass();
            linkedHashSet.add(b(dnjzVar));
        }
        return linkedHashSet;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "SkinToneSet(base=" + this.a + ")";
    }
}
