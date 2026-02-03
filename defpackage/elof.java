package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class elof extends evsf implements evui {
    public elof() {
        super(elpg.b);
    }

    public final void a(Iterable iterable) {
        copyOnWrite();
        elpg elpgVar = (elpg) this.instance;
        evsy evsyVar = elpg.a;
        evsx evsxVar = elpgVar.X;
        if (!evsxVar.c()) {
            elpgVar.X = evsn.mutableCopy(evsxVar);
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            elpgVar.X.h(((elns) it.next()).C);
        }
    }

    public final void b(elyw elywVar) {
        copyOnWrite();
        elpg elpgVar = (elpg) this.instance;
        elyy elyyVar = (elyy) elywVar.build();
        evsy evsyVar = elpg.a;
        elyyVar.getClass();
        elpgVar.a();
        elpgVar.V.add(elyyVar);
    }
}
