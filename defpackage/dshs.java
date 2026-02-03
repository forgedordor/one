package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes4.dex */
class dshs implements ejvr {
    @Override // defpackage.ejvr
    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        etkn etknVar = (etkn) etko.a.createBuilder();
        Iterator<E> it = ((eviu) obj).b.iterator();
        while (it.hasNext()) {
            Object objApply = dsjt.a.apply((evix) it.next());
            etknVar.copyOnWrite();
            etko etkoVar = (etko) etknVar.instance;
            objApply.getClass();
            evtg evtgVar = etkoVar.b;
            if (!evtgVar.c()) {
                etkoVar.b = evsn.mutableCopy(evtgVar);
            }
            etkoVar.b.add(objApply);
        }
        return (etko) etknVar.build();
    }
}
