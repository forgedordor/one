package defpackage;

import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dtak {
    public final Map a = new HashMap();
    public final dsvd b;

    public dtak(dsvd dsvdVar) {
        this.b = dsvdVar;
    }

    public final dsvd a(Object obj, dsuy dsuyVar) {
        Map map = this.a;
        ejwl.l(map.get(obj) == null);
        dsvd dsvdVar = this.b;
        dsvd dsvdVarE = dsuyVar.e(dsvdVar.e);
        dtal dtalVar = new dtal(dsvdVarE);
        dsvdVarE.f = dtalVar;
        dtalVar.l();
        map.put(obj, dsvdVarE);
        dsvdVar.f.e(dsvdVarE);
        return dsvdVarE;
    }

    public final dsvd b(Object obj) {
        dsvd dsvdVar = (dsvd) this.a.get(obj);
        if (dsvdVar == null) {
            dsvd dsvdVar2 = this.b;
            dsvdVar2.e.d(new NullPointerException(a.b(obj, "Synthetic container did not have specified child ve with id=", "\nThis points to a likely instrumentation error.")));
        }
        return dsvdVar;
    }

    @Deprecated
    public final dtaj c(int i) {
        return new dtaj(this, dsvc.a(i));
    }
}
