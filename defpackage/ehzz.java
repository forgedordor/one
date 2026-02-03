package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ehzz implements ehyu {
    public static final ekrg a = ekrg.c("com/google/apps/tiktok/sync/impl/workmanager/SyncWorkManagerPeriodicScheduler");
    public final egsh b;
    public final Executor c;
    private final ehyw d;
    private final Boolean e = false;
    private final Boolean f;

    public ehzz(egsh egshVar, ehyw ehywVar, Executor executor, Boolean bool) {
        this.b = egshVar;
        this.d = ehywVar;
        this.c = executor;
        this.f = bool;
    }

    public static pzj b(Set set) {
        pzh pzhVar = new pzh();
        pzhVar.a = set.contains(ehwe.ON_CHARGER);
        if (set.contains(ehwe.ON_NETWORK_UNMETERED)) {
            pzhVar.c(3);
        } else if (set.contains(ehwe.ON_NETWORK_CONNECTED)) {
            pzhVar.c(2);
        }
        return pzhVar.a();
    }

    static String d(pzj pzjVar, ejwi ejwiVar) {
        StringBuilder sb = new StringBuilder(egsd.a("SyncPeriodicTask", ejwiVar));
        if (pzjVar.c) {
            sb.append("_charging");
        }
        int i = pzjVar.j;
        if (i == 3) {
            sb.append("_unmetered");
        } else if (i == 2) {
            sb.append("_connected");
        }
        return sb.toString();
    }

    @Override // defpackage.ehyu
    public final ListenableFuture a(Set set, long j, Map map) {
        if (!this.f.booleanValue()) {
            return eorv.a;
        }
        ((ekrd) ((ekrd) a.h()).h("com/google/apps/tiktok/sync/impl/workmanager/SyncWorkManagerPeriodicScheduler", "scheduleNextSyncSystemWakeup", 85, "SyncWorkManagerPeriodicScheduler.java")).q("Scheduling next periodic WorkManager workers");
        return eooq.g(this.d.a(set, j, map), eiid.d(new eooz() { // from class: ehzv
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                final ehzz ehzzVar;
                Map map2 = (Map) obj;
                ArrayList arrayList = new ArrayList();
                Iterator it = map2.entrySet().iterator();
                while (true) {
                    ehzzVar = this.a;
                    if (!it.hasNext()) {
                        break;
                    }
                    final ehyt ehytVar = (ehyt) ((Map.Entry) it.next()).getValue();
                    egsh egshVar = ehzzVar.b;
                    pzj pzjVarB = ehzz.b(ehytVar.c());
                    String strD = ehzz.d(ehzz.b(ehytVar.c()), ehzzVar.c());
                    long jA = ehytVar.a();
                    ejwi ejwiVarC = ehzzVar.c();
                    ekrg ekrgVar = ehzo.a;
                    egsj egsjVarN = egsn.n(ehzo.class);
                    ((egrx) egsjVarN).d = ejwi.j(Long.valueOf(jA));
                    egsjVarN.e(new egrz(ehzo.b, ejud.a));
                    egsjVarN.g(new egsb(strD, pzy.c));
                    egsjVarN.d(pzjVarB);
                    egsjVarN.f(new ekph(ehzo.e(ejwiVarC)));
                    arrayList.add(eooq.f(egshVar.c(egsjVarN.h()), eiid.a(new ejvr() { // from class: ehzu
                        @Override // defpackage.ejvr
                        public final Object apply(Object obj2) {
                            ekrd ekrdVar = (ekrd) ((ekrd) ehzz.a.e()).h("com/google/apps/tiktok/sync/impl/workmanager/SyncWorkManagerPeriodicScheduler", "scheduleWorker", 180, "SyncWorkManagerPeriodicScheduler.java");
                            ehyt ehytVar2 = ehytVar;
                            ekrdVar.C("Scheduled worker: %s at %s", ehytVar2.c(), ehytVar2.a());
                            return null;
                        }
                    }), eoqg.a));
                }
                Set setKeySet = map2.keySet();
                final HashSet hashSet = new HashSet();
                Iterator it2 = setKeySet.iterator();
                while (it2.hasNext()) {
                    hashSet.add(ehzz.b((Set) it2.next()));
                }
                arrayList.add(eooq.g(ehzzVar.b.e(ehzo.e(ehzzVar.c())), eiid.d(new eooz() { // from class: ehzw
                    @Override // defpackage.eooz
                    public final ListenableFuture a(Object obj2) {
                        ArrayList arrayList2 = new ArrayList();
                        HashSet hashSet2 = new HashSet();
                        for (qbp qbpVar : (List) obj2) {
                            if (qbpVar.b == qbo.a) {
                                hashSet2.add(qbpVar.d);
                            }
                        }
                        ekqg ekqgVarListIterator = ekhx.o(hashSet2).listIterator();
                        while (ekqgVarListIterator.hasNext()) {
                            Set set2 = hashSet;
                            pzj pzjVar = (pzj) ekqgVarListIterator.next();
                            if (!set2.contains(pzjVar)) {
                                ehzz ehzzVar2 = ehzzVar;
                                arrayList2.add(eooq.f(ehzzVar2.b.a(ehzz.d(pzjVar, ehzzVar2.c())), new ejvt(null), eoqg.a));
                            }
                        }
                        return eork.a(arrayList2).a(eiid.l(new Callable() { // from class: ehzy
                            @Override // java.util.concurrent.Callable
                            public final Object call() {
                                return null;
                            }
                        }), eoqg.a);
                    }
                }), ehzzVar.c));
                return eork.c(arrayList).a(eiid.l(new Callable() { // from class: ehzx
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        ((ekrd) ((ekrd) ehzz.a.h()).h("com/google/apps/tiktok/sync/impl/workmanager/SyncWorkManagerPeriodicScheduler", "scheduleNextSyncSystemWakeup", 104, "SyncWorkManagerPeriodicScheduler.java")).q("Successfully scheduled next periodic workers");
                        return null;
                    }
                }), eoqg.a);
            }
        }), this.c);
    }

    final ejwi c() {
        this.e.booleanValue();
        return ejud.a;
    }
}
