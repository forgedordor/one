package defpackage;

import com.google.android.ims.rcsservice.events.Event;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cleb {
    private final Map a = new ConcurrentHashMap();

    public final synchronized void a(Event event) {
        Set set = (Set) this.a.get(Integer.valueOf(event.g));
        if (set != null) {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                ((efav) it.next()).b(event);
            }
        }
    }
}
