package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dsyi {
    private final Map a;
    private final evrr b = evrr.a();
    private final dswx c;

    public dsyi(Map map, dswx dswxVar) {
        this.a = map;
        this.c = dswxVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(evsi evsiVar, List list, evug evugVar, List list2) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            num.intValue();
            fcsu fcsuVar = (fcsu) this.a.get(num);
            dsyh dsyhVar = fcsuVar == null ? null : (dsyh) fcsuVar.b();
            if (dsyhVar != null) {
                evsl evslVarB = this.b.b((evsi) evsiVar.getDefaultInstanceForType(), num.intValue());
                if (evslVarB == null) {
                    this.c.a(new IllegalStateException("Extension with tag #" + num + " not found. Ensure " + String.valueOf(evsiVar.getClass()) + "is properly extended."));
                } else {
                    evsl evslVarCheckIsLite = evsn.checkIsLite(evslVarB);
                    evsiVar.d(evslVarCheckIsLite);
                    Object objL = evsiVar.r.l(evslVarCheckIsLite.d);
                    ListenableFuture listenableFutureA = dsyhVar.a((evuh) (objL == null ? evslVarCheckIsLite.b : evslVarCheckIsLite.c(objL)));
                    if (dsyh.b.equals(listenableFutureA)) {
                        continue;
                    } else if (evugVar != null) {
                        try {
                            ((dsyg) eork.q(listenableFutureA)).a(evugVar);
                        } catch (ExecutionException e) {
                            throw new RuntimeException(e);
                        }
                    } else {
                        list2.add(listenableFutureA);
                    }
                }
            }
        }
    }
}
