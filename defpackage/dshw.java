package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes4.dex */
abstract class dshw implements ejvr {
    public abstract void a(evkx evkxVar, etol etolVar);

    @Override // defpackage.ejvr
    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        evkx evkxVar = (evkx) obj;
        etol etolVar = (etol) etom.a.createBuilder();
        b(evkxVar, etolVar);
        if ((evkxVar.b & 4) != 0) {
            int i = evkxVar.e;
            etolVar.copyOnWrite();
            etom etomVar = (etom) etolVar.instance;
            etomVar.b |= 2;
            etomVar.d = i;
        }
        if ((evkxVar.b & 2) != 0) {
            boolean z = evkxVar.d;
            etolVar.copyOnWrite();
            etom etomVar2 = (etom) etolVar.instance;
            etomVar2.b |= 4;
            etomVar2.e = z;
        }
        a(evkxVar, etolVar);
        Iterator<E> it = evkxVar.g.iterator();
        while (it.hasNext()) {
            Object objApply = dsjx.a.apply((evkw) it.next());
            etolVar.copyOnWrite();
            etom etomVar3 = (etom) etolVar.instance;
            objApply.getClass();
            evtg evtgVar = etomVar3.h;
            if (!evtgVar.c()) {
                etomVar3.h = evsn.mutableCopy(evtgVar);
            }
            etomVar3.h.add(objApply);
        }
        if ((evkxVar.b & 16) != 0) {
            ejvj ejvjVar = dsjx.c;
            evkp evkpVarB = evkp.b(evkxVar.h);
            if (evkpVarB == null) {
                evkpVarB = evkp.DASHER_DEVICE_FILTER_UNSPECIFIED;
            }
            etok etokVar = (etok) ejvjVar.fM(evkpVarB);
            etolVar.copyOnWrite();
            etom etomVar4 = (etom) etolVar.instance;
            etomVar4.i = etokVar.c;
            etomVar4.b |= 64;
        }
        return (etom) etolVar.build();
    }

    public abstract void b(evkx evkxVar, etol etolVar);
}
