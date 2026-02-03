package defpackage;

import com.google.android.ims.rcsservice.events.Event;
import j$.util.concurrent.ConcurrentLinkedQueue;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Queue;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dfed implements dfec {
    private final ConcurrentLinkedQueue a = new ConcurrentLinkedQueue();

    @Override // defpackage.dfec
    public final Event a(int i) {
        Iterator it = this.a.iterator();
        Event event = null;
        while (it.hasNext()) {
            Event event2 = (Event) it.next();
            if (event2.h == i) {
                event = event2;
            }
        }
        return event;
    }

    @Override // defpackage.dfec
    public final /* synthetic */ List b() {
        throw new UnsupportedOperationException("List is not available");
    }

    @Override // defpackage.dfec
    public final Queue c() {
        return this.a;
    }

    @Override // defpackage.dfec
    public final void d(int i) {
        ArrayList arrayList = new ArrayList();
        ConcurrentLinkedQueue concurrentLinkedQueue = this.a;
        Iterator it = concurrentLinkedQueue.iterator();
        while (it.hasNext()) {
            Event event = (Event) it.next();
            if (event.h == i) {
                arrayList.add(event);
            }
        }
        concurrentLinkedQueue.removeAll(arrayList);
    }

    @Override // defpackage.dfec
    public final void e(Event event) {
        this.a.add(event);
    }
}
