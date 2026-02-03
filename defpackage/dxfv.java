package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dxfv {
    public static final dxft a(List list, eksp ekspVar) {
        list.getClass();
        ekspVar.getClass();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            dxft dxftVar = (dxft) it.next();
            if (dxftVar instanceof dxfw) {
                ((eksl) ((eksl) ekspVar.j()).g(((dxfw) dxftVar).a())).q("Logging permanent failure in syncAllAccounts");
                arrayList.add(dxftVar);
            } else if (dxftVar instanceof dxfz) {
                ((eksl) ((eksl) ekspVar.j()).g(((dxfz) dxftVar).a())).q("Logging transient failure in syncAllAccounts");
                arrayList2.add(dxftVar);
            }
        }
        if (!arrayList.isEmpty()) {
            dxfw dxfwVar = (dxfw) fcva.N(arrayList);
            return new dxfp(dxfwVar.a(), dxfwVar.b());
        }
        if (arrayList2.isEmpty()) {
            return new dxfx(fctx.a);
        }
        dxfz dxfzVar = (dxfz) fcva.N(arrayList2);
        return new dxfq(dxfzVar.a(), dxfzVar.b());
    }

    public static final dxft b(Object obj) {
        Throwable thC = fctk.c(obj);
        return thC == null ? new dxfx(obj) : new dxfp(thC);
    }

    public static final dxft c(dxft dxftVar, fdap fdapVar) {
        dxftVar.getClass();
        if (dxftVar instanceof dxfx) {
            return new dxfx(fdapVar.invoke(((dxfx) dxftVar).a));
        }
        if (dxftVar instanceof dxfo) {
            return dxftVar;
        }
        throw new fctg();
    }

    public static final dxft d(Object obj) {
        Throwable thC = fctk.c(obj);
        return thC == null ? new dxfx(obj) : new dxfp(thC, 17);
    }
}
