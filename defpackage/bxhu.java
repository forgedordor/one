package defpackage;

import java.io.Closeable;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes7.dex */
abstract class bxhu implements Closeable {
    private final Set a;
    private final eksp b;
    private final List c = new ArrayList();

    public bxhu(Set set, eksp ekspVar) {
        this.a = set;
        this.b = ekspVar;
    }

    public abstract int a();

    final void b() {
        List list = this.c;
        if (list.isEmpty()) {
            return;
        }
        ekqg ekqgVarListIterator = ((ekph) this.a).listIterator();
        while (ekqgVarListIterator.hasNext()) {
            bxhi bxhiVar = (bxhi) ekqgVarListIterator.next();
            bxhj bxhjVar = (bxhj) bxhk.a.createBuilder();
            bxhjVar.copyOnWrite();
            bxhk bxhkVar = (bxhk) bxhjVar.instance;
            evtg evtgVar = bxhkVar.c;
            if (!evtgVar.c()) {
                bxhkVar.c = evsn.mutableCopy(evtgVar);
            }
            evpz.addAll(list, bxhkVar.c);
            int iA = a();
            bxhjVar.copyOnWrite();
            ((bxhk) bxhjVar.instance).b = iA;
            bxhiVar.a((bxhk) bxhjVar.build());
        }
        list.clear();
    }

    final void c(int i, String str) {
        ekrw ekrwVarO = this.b.o();
        ekrwVarO.X(new ekrz("operation", String.class, false, false), i != 1 ? i != 2 ? "DELETE" : "UPDATE" : "INSERT");
        ekrwVarO.X(new ekrz("table_type", Integer.class, false, false), Integer.valueOf(a()));
        ekrwVarO.X(new ekrz("item_id", String.class, false, false), str);
        ekrwVarO.X(cqnc.S, "bxhu");
        ((eksl) ekrwVarO.h("com/google/android/apps/messaging/shared/datamodel/observer/TableContentChangeObserver$ClosableBatchScheduler", "queue", 446, "TableContentChangeObserver.java")).q("Change in transaction is observed. Queues work item.");
        List list = this.c;
        list.add(str);
        if (list.size() >= ((Integer) bxhi.a.e()).intValue()) {
            b();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        b();
    }
}
