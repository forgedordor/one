package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes4.dex */
class dshu implements ejvr {
    @Override // defpackage.ejvr
    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        evkw evkwVar = (evkw) obj;
        etob etobVar = (etob) etoc.b.createBuilder();
        if ((evkwVar.c & 1) != 0) {
            eybm eybmVar = evkwVar.d;
            if (eybmVar == null) {
                eybmVar = eybm.a;
            }
            etobVar.copyOnWrite();
            etoc etocVar = (etoc) etobVar.instance;
            eybmVar.getClass();
            etocVar.d = eybmVar;
            etocVar.c |= 1;
        }
        if ((evkwVar.c & 2) != 0) {
            eybm eybmVar2 = evkwVar.e;
            if (eybmVar2 == null) {
                eybmVar2 = eybm.a;
            }
            etobVar.copyOnWrite();
            etoc etocVar2 = (etoc) etobVar.instance;
            eybmVar2.getClass();
            etocVar2.e = eybmVar2;
            etocVar2.c |= 2;
        }
        evsz evszVar = new evsz(evkwVar.f, evkw.a);
        etobVar.copyOnWrite();
        etoc etocVar3 = (etoc) etobVar.instance;
        evsx evsxVar = etocVar3.f;
        if (!evsxVar.c()) {
            etocVar3.f = evsn.mutableCopy(evsxVar);
        }
        Iterator<T> it = evszVar.iterator();
        while (it.hasNext()) {
            etocVar3.f.h(((eybe) it.next()).a());
        }
        return (etoc) etobVar.build();
    }
}
