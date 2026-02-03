package defpackage;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nir {
    public final CopyOnWriteArrayList a = new CopyOnWriteArrayList();

    public final void a(nis nisVar) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.a;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            niq niqVar = (niq) it.next();
            if (niqVar.b == nisVar) {
                niqVar.c = true;
                copyOnWriteArrayList.remove(niqVar);
            }
        }
    }
}
