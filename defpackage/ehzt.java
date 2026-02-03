package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ehzt implements ehyu {
    public static final ekrg a = ekrg.c("com/google/apps/tiktok/sync/impl/workmanager/SyncWorkManagerOneTimeScheduler");
    public final egsh b;
    public final diep c;
    private final ehyw d;
    private final Executor e;
    private final Boolean f = false;
    private final Boolean g;

    public ehzt(egsh egshVar, ehyw ehywVar, diep diepVar, Executor executor, Boolean bool) {
        this.b = egshVar;
        this.d = ehywVar;
        this.c = diepVar;
        this.e = executor;
        this.g = bool;
    }

    @Override // defpackage.ehyu
    public final ListenableFuture a(Set set, long j, Map map) {
        if (!this.g.booleanValue()) {
            return eorv.a;
        }
        ((ekrd) ((ekrd) a.h()).h("com/google/apps/tiktok/sync/impl/workmanager/SyncWorkManagerOneTimeScheduler", "scheduleNextSyncSystemWakeup", 83, "SyncWorkManagerOneTimeScheduler.java")).q("Scheduling next onetime WorkManager workers");
        return eooq.g(this.d.a(set, j, map), eiid.d(new eooz() { // from class: ehzq
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                Map map2 = (Map) obj;
                if (map2.isEmpty()) {
                    return eorv.a;
                }
                ArrayList arrayList = new ArrayList();
                Iterator it = map2.entrySet().iterator();
                while (it.hasNext()) {
                    ehzt ehztVar = this.a;
                    final ehyt ehytVar = (ehyt) ((Map.Entry) it.next()).getValue();
                    boolean z = false;
                    boolean z2 = false;
                    boolean z3 = false;
                    for (ehwe ehweVar : ehytVar.c()) {
                        boolean z4 = true;
                        z |= ehweVar == ehwe.ON_CHARGER;
                        z3 |= ehweVar == ehwe.ON_NETWORK_CONNECTED;
                        if (ehweVar != ehwe.ON_NETWORK_UNMETERED) {
                            z4 = false;
                        }
                        z2 |= z4;
                    }
                    pzh pzhVar = new pzh();
                    pzhVar.a = z;
                    if (z2) {
                        pzhVar.c(3);
                    } else if (z3) {
                        pzhVar.c(2);
                    }
                    pzj pzjVarA = pzhVar.a();
                    Set setC = ehytVar.c();
                    StringBuilder sb = new StringBuilder(egsd.a("SyncTask", ehztVar.b()));
                    Iterator it2 = new TreeSet(setC).iterator();
                    while (it2.hasNext()) {
                        sb.append(((ehwe) it2.next()).d);
                        sb.append('_');
                    }
                    String string = sb.toString();
                    egsa egsaVar = new egsa(Math.max(0L, ehytVar.a() - ehztVar.c.f().toEpochMilli()), TimeUnit.MILLISECONDS);
                    ehztVar.b();
                    egsj egsjVarN = egsn.n(ehze.class);
                    ((egrx) egsjVarN).c = egsaVar;
                    egsjVarN.g(new egsb(string, pzy.a));
                    egsjVarN.d(pzjVarA);
                    egsjVarN.f(new ekph("com.google.apps.tiktok.sync.impl.workmanager.SyncWorker"));
                    arrayList.add(eooq.f(ehztVar.b.c(egsjVarN.h()), eiid.a(new ejvr() { // from class: ehzs
                        @Override // defpackage.ejvr
                        public final Object apply(Object obj2) {
                            ekrd ekrdVar = (ekrd) ((ekrd) ehzt.a.e()).h("com/google/apps/tiktok/sync/impl/workmanager/SyncWorkManagerOneTimeScheduler", "scheduleWorker", 120, "SyncWorkManagerOneTimeScheduler.java");
                            ehyt ehytVar2 = ehytVar;
                            ekrdVar.C("Scheduled worker: %s at %s", ehytVar2.c(), ehytVar2.a());
                            return null;
                        }
                    }), eoqg.a));
                }
                return eork.c(arrayList).a(eiid.l(new Callable() { // from class: ehzr
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        ((ekrd) ((ekrd) ehzt.a.h()).h("com/google/apps/tiktok/sync/impl/workmanager/SyncWorkManagerOneTimeScheduler", "scheduleNextSyncSystemWakeup", 102, "SyncWorkManagerOneTimeScheduler.java")).q("Successfully scheduled next onetime workers");
                        return null;
                    }
                }), eoqg.a);
            }
        }), this.e);
    }

    final ejwi b() {
        this.f.booleanValue();
        return ejud.a;
    }
}
