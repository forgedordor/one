package defpackage;

import com.google.android.ims.rcsservice.events.Event;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dfee implements dfec {
    private final CopyOnWriteArrayList a = new CopyOnWriteArrayList();

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
    public final List b() {
        return this.a;
    }

    @Override // defpackage.dfec
    public final /* synthetic */ Queue c() {
        throw new UnsupportedOperationException("Queue is not available");
    }

    @Override // defpackage.dfec
    public final void d(int i) {
        ArrayList arrayList = new ArrayList();
        CopyOnWriteArrayList copyOnWriteArrayList = this.a;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            Event event = (Event) it.next();
            if (event.h == i) {
                arrayList.add(event);
            }
        }
        copyOnWriteArrayList.removeAll(arrayList);
    }

    @Override // defpackage.dfec
    public final void e(Event event) {
        this.a.add(event);
    }
}
