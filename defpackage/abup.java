package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abup implements vwm {
    private final fcsu a;
    private final fcsu b;

    public abup(fcsu fcsuVar, fcsu fcsuVar2) {
        fcsuVar.getClass();
        fcsuVar2.getClass();
        this.a = fcsuVar;
        this.b = fcsuVar2;
    }

    @Override // defpackage.vwm
    public final void a(vvw vvwVar) {
        if (crbf.e()) {
            abvh abvhVar = (abvh) this.a.b();
            List<vvs> list = vvwVar.b;
            ArrayList arrayList = new ArrayList();
            for (vvs vvsVar : list) {
                vvr vvrVar = vvsVar instanceof vvr ? (vvr) vvsVar : null;
                if (vvrVar != null) {
                    arrayList.add(vvrVar);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : arrayList) {
                if (((vvr) obj).a instanceof dnvg) {
                    arrayList2.add(obj);
                }
            }
            abvhVar.c = arrayList2.size();
            ((dnwx) this.b.b()).d();
        }
    }
}
