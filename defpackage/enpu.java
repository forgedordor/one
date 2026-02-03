package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class enpu extends evsf implements evui {
    public enpu() {
        super(enqw.a);
    }

    public final void a(Iterable iterable) {
        copyOnWrite();
        enqw enqwVar = (enqw) this.instance;
        enqw enqwVar2 = enqw.a;
        evsx evsxVar = enqwVar.f;
        if (!evsxVar.c()) {
            enqwVar.f = evsn.mutableCopy(evsxVar);
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            enqwVar.f.h(((enqm) it.next()).x);
        }
    }
}
