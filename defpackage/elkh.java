package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class elkh extends evsf implements evui {
    public elkh() {
        super(elki.a);
    }

    public final void a(Iterable iterable) {
        copyOnWrite();
        elki elkiVar = (elki) this.instance;
        elki elkiVar2 = elki.a;
        evsx evsxVar = elkiVar.E;
        if (!evsxVar.c()) {
            elkiVar.E = evsn.mutableCopy(evsxVar);
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            elkiVar.E.h(((elns) it.next()).C);
        }
    }
}
