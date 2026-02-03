package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ytl implements angr {
    final /* synthetic */ ytm a;

    public ytl(ytm ytmVar) {
        this.a = ytmVar;
    }

    @Override // defpackage.angr
    public final /* synthetic */ anhj a() {
        return angq.a(this);
    }

    @Override // defpackage.angr
    public final /* synthetic */ anhj b(aoer aoerVar) {
        return angq.b(this, aoerVar);
    }

    @Override // defpackage.angr
    public final /* synthetic */ anho c(aoer aoerVar) {
        return angq.c(this, aoerVar);
    }

    @Override // defpackage.angr
    public final ekgb d() {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.a.a.iterator();
        while (it.hasNext()) {
            angr angrVarI = ((ajlt) it.next()).i();
            Iterable iterableD = angrVarI != null ? angrVarI.d() : null;
            if (iterableD == null) {
                iterableD = fcvo.a;
            }
            fcva.y(arrayList, iterableD);
        }
        return ekfv.a(arrayList);
    }
}
