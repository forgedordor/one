package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.BlockingQueue;

/* compiled from: PG */
/* loaded from: classes.dex */
final class rab {
    public final Map a = new HashMap();
    public final qzg b;
    private final qzb c;
    private final BlockingQueue d;

    public rab(qzb qzbVar, BlockingQueue blockingQueue, qzg qzgVar) {
        this.b = qzgVar;
        this.c = qzbVar;
        this.d = blockingQueue;
    }

    public final synchronized void a(qzo qzoVar) {
        Map map = this.a;
        String str = qzoVar.b;
        List list = (List) map.remove(str);
        if (list == null || list.isEmpty()) {
            return;
        }
        if (raa.b) {
            raa.d("%d waiting requests for cacheKey=%s; resend to network", Integer.valueOf(list.size()), str);
        }
        qzo qzoVar2 = (qzo) list.remove(0);
        map.put(str, list);
        qzoVar2.l(this);
        try {
            this.d.put(qzoVar2);
        } catch (InterruptedException e) {
            raa.b("Couldn't add request to queue. %s", e.toString());
            Thread.currentThread().interrupt();
            this.c.a();
        }
    }

    final synchronized boolean b(qzo qzoVar) {
        Map map = this.a;
        String str = qzoVar.b;
        if (!map.containsKey(str)) {
            map.put(str, null);
            qzoVar.l(this);
            if (raa.b) {
                raa.a("new request, sending to network %s", str);
            }
            return false;
        }
        List arrayList = (List) map.get(str);
        if (arrayList == null) {
            arrayList = new ArrayList();
        }
        qzoVar.d("waiting-for-response");
        arrayList.add(qzoVar);
        map.put(str, arrayList);
        if (raa.b) {
            raa.a("Request for cacheKey=%s is in flight, putting on hold.", str);
        }
        return true;
    }
}
