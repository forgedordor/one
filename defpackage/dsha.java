package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes4.dex */
class dsha implements ejvr {
    @Override // defpackage.ejvr
    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        etmx etmxVar = (etmx) etmy.b.createBuilder();
        Iterator<T> it = new evsz(((evne) obj).c, evne.a).iterator();
        while (it.hasNext()) {
            Object objApply = dsir.a.apply((evnq) it.next());
            etmxVar.copyOnWrite();
            etmy etmyVar = (etmy) etmxVar.instance;
            objApply.getClass();
            evsx evsxVar = etmyVar.c;
            if (!evsxVar.c()) {
                etmyVar.c = evsn.mutableCopy(evsxVar);
            }
            etmyVar.c.h(((etgd) objApply).a());
        }
        return (etmy) etmxVar.build();
    }
}
