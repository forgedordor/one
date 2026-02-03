package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eoel extends evsf implements evui {
    public eoel() {
        super(eoem.a);
    }

    public final void a(Iterable iterable) {
        copyOnWrite();
        eoem eoemVar = (eoem) this.instance;
        eoem eoemVar2 = eoem.a;
        evsx evsxVar = eoemVar.h;
        if (!evsxVar.c()) {
            eoemVar.h = evsn.mutableCopy(evsxVar);
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            eoemVar.h.h(((eofd) it.next()).a());
        }
    }
}
