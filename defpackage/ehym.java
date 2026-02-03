package defpackage;

import android.content.Context;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.SettableFuture;
import j$.util.Collection;
import j$.util.Map;
import j$.util.function.Function$CC;
import j$.util.function.Predicate$CC;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Function;
import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ehym implements ehwx {
    public static final ekrg a = ekrg.c("com/google/apps/tiktok/sync/impl/SyncManagerImpl");
    public final diep b;
    public final eosd c;
    public final eosc d;
    public final egoc e;
    public final ehxh f;
    public final Map g;
    public final ListenableFuture h;
    public final Object i = new Object();
    public final csq j;
    public final Map k;
    public final Map l;
    private final Context m;
    private final ebbw n;
    private final ejwi o;
    private final boolean p;
    private final ehyu q;
    private final AtomicReference r;
    private final eiao s;

    /* compiled from: PG */
    interface a {
        Map hf();
    }

    /* compiled from: PG */
    interface b {
        eiao hR();
    }

    public ehym(diep diepVar, Context context, eosd eosdVar, eosc eoscVar, ebbw ebbwVar, egoc egocVar, ejwi ejwiVar, ejwi ejwiVar2, ehxh ehxhVar, Map map, Map map2, Map map3, eiao eiaoVar, ehyu ehyuVar) {
        csq csqVar = new csq();
        this.j = csqVar;
        this.k = new csq();
        this.l = new csq();
        this.r = new AtomicReference();
        this.b = diepVar;
        this.m = context;
        this.c = eosdVar;
        this.d = eoscVar;
        this.n = ebbwVar;
        this.e = egocVar;
        this.o = ejwiVar;
        Boolean bool = false;
        this.p = ((Boolean) ejwiVar2.e(bool)).booleanValue();
        this.f = ehxhVar;
        this.g = map3;
        this.s = eiaoVar;
        bool.getClass();
        ejwl.m(map2.isEmpty(), "SyncletBindings cannot be bound outside of account scope without @ApplicationSynclet.");
        this.h = ehxhVar.c();
        HashMap map4 = new HashMap();
        for (Map.Entry entry : ((ekgp) map).entrySet()) {
            ehwf ehwfVarA = ehwf.a((String) entry.getKey());
            eibb eibbVar = (eibb) eibc.a.createBuilder();
            eiba eibaVar = ehwfVarA.a;
            eibbVar.copyOnWrite();
            eibc eibcVar = (eibc) eibbVar.instance;
            eibaVar.getClass();
            eibcVar.c = eibaVar;
            eibcVar.b |= 1;
            r(new ehyr((eibc) eibbVar.build()), entry, map4);
        }
        csqVar.putAll(map4);
        this.q = ehyuVar;
        String strA = ebbu.a(context);
        int iIndexOf = strA.indexOf(58);
        if (iIndexOf == -1) {
            return;
        }
        strA.substring(iIndexOf + 1);
    }

    static /* synthetic */ void l(ListenableFuture listenableFuture) {
        try {
            eork.q(listenableFuture);
        } catch (CancellationException e) {
            ((ekrd) ((ekrd) ((ekrd) a.i()).g(e)).h("com/google/apps/tiktok/sync/impl/SyncManagerImpl", "finishScheduleListener", (char) 679, "SyncManagerImpl.java")).q("The sync scheduling future was cancelled. This should never happen.");
        } catch (ExecutionException e2) {
            ((ekrd) ((ekrd) ((ekrd) a.i()).g(e2)).h("com/google/apps/tiktok/sync/impl/SyncManagerImpl", "finishScheduleListener", (char) 677, "SyncManagerImpl.java")).q("Error scheduling next sync wakeup");
        }
    }

    static /* synthetic */ void m(ListenableFuture listenableFuture) {
        try {
            eork.q(listenableFuture);
        } catch (CancellationException | ExecutionException e) {
            if (e.getCause() instanceof TimeoutException) {
                ((ekrd) ((ekrd) ((ekrd) a.j()).g(e)).h("com/google/apps/tiktok/sync/impl/SyncManagerImpl", "onAccountsChanged", (char) 780, "SyncManagerImpl.java")).q("Timeout updating accounts in sync. Some accounts may not sync correctly.");
            } else {
                ((ekrd) ((ekrd) ((ekrd) a.i()).g(e)).h("com/google/apps/tiktok/sync/impl/SyncManagerImpl", "onAccountsChanged", (char) 784, "SyncManagerImpl.java")).q("Updating sync accounts failed. Some accounts may not sync correctly.");
            }
        }
    }

    private final ListenableFuture p() {
        return eika.j(((egcd) ((ejwt) this.o).a).g(), new ejvr() { // from class: ehyd
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                HashSet hashSet = new HashSet();
                for (egbe egbeVar : (List) obj) {
                    if (!egbeVar.b().k.equals("incognito")) {
                        hashSet.add(egbeVar.a());
                    }
                }
                return hashSet;
            }
        }, this.c);
    }

    private final ListenableFuture q() {
        AtomicReference atomicReference;
        SettableFuture settableFutureCreate = SettableFuture.create();
        while (true) {
            atomicReference = this.r;
            if (atomicReference.compareAndSet(null, settableFutureCreate)) {
                settableFutureCreate.o(eika.j(p(), new ejvr() { // from class: ehyk
                    @Override // defpackage.ejvr
                    public final Object apply(Object obj) {
                        this.a.k((Set) obj);
                        return null;
                    }
                }, this.c));
                break;
            }
            if (atomicReference.get() != null) {
                break;
            }
        }
        return eork.j((ListenableFuture) atomicReference.get());
    }

    private static final void r(ehyr ehyrVar, Map.Entry entry, Map map) {
        try {
            ehwk ehwkVar = (ehwk) ((fcsu) entry.getValue()).b();
            if (ehwkVar.c()) {
                map.put(ehyrVar, ehwkVar);
            }
        } catch (RuntimeException e) {
            ((ekrd) ((ekrd) ((ekrd) a.i()).g(e)).h("com/google/apps/tiktok/sync/impl/SyncManagerImpl", "safePutBindingEntry", 895, "SyncManagerImpl.java")).t("Error accessing SyncletBinding for key %s. Its Synclet will be skipped", new esvh(esvg.NO_USER_DATA, entry.getKey()));
        }
    }

    @Override // defpackage.ehwx
    public final ListenableFuture a() {
        ((ekrd) ((ekrd) a.h()).h("com/google/apps/tiktok/sync/impl/SyncManagerImpl", "poke", 581, "SyncManagerImpl.java")).q("#poke(). Scheduling workers.");
        return this.s.a(g(eork.i(ekon.a)), new eooz() { // from class: eiaj
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                return ((eiaq) obj).a();
            }
        });
    }

    @Override // defpackage.ehwx
    public final ListenableFuture b() {
        ((ekrd) ((ekrd) a.h()).h("com/google/apps/tiktok/sync/impl/SyncManagerImpl", "sync", 197, "SyncManagerImpl.java")).q("#sync(). Running Synclets and scheduling next sync.");
        final long epochMilli = this.b.f().toEpochMilli();
        final ehxh ehxhVar = this.f;
        ListenableFuture listenableFutureA = this.s.a(eijy.b(ehxhVar.d.submit(eiid.l(new Callable() { // from class: ehxf
            @Override // java.util.concurrent.Callable
            public final Object call() {
                eiay eiayVar = eiay.a;
                ehxh ehxhVar2 = ehxhVar;
                ehxhVar2.b.writeLock().lock();
                long j = epochMilli;
                try {
                    try {
                        eiay eiayVarA = ehxhVar2.a();
                        eiax eiaxVar = (eiax) eiayVarA.toBuilder();
                        eiaxVar.copyOnWrite();
                        eiay eiayVar2 = (eiay) eiaxVar.instance;
                        eiayVar2.b |= 2;
                        eiayVar2.e = j;
                        try {
                            ehxhVar2.e((eiay) eiaxVar.build());
                        } catch (IOException e) {
                            ((ekrd) ((ekrd) ((ekrd) ehxh.a.j()).g(e)).h("com/google/apps/tiktok/sync/impl/SyncManagerDataStore", "getLastWakeupAndSetNewWakeup", 539, "SyncManagerDataStore.java")).q("Error writing sync data file. Cannot update last wakeup.");
                        }
                        ehxhVar2.b.writeLock().unlock();
                        int i = eiayVarA.b;
                        if ((i & 2) != 0) {
                            return Long.valueOf(eiayVarA.e);
                        }
                        if ((i & 1) != 0) {
                            return Long.valueOf(eiayVarA.c);
                        }
                        return -1L;
                    } catch (IOException e2) {
                        ejxy.e(e2);
                        throw new RuntimeException(e2);
                    }
                } catch (Throwable th) {
                    ehxhVar2.b.writeLock().unlock();
                    throw th;
                }
            }
        })), new eooy() { // from class: ehxr
            @Override // defpackage.eooy
            public final ListenableFuture a() {
                final ehym ehymVar = this.a;
                return ehymVar.g(eika.k(ehymVar.h, new eooz() { // from class: ehxw
                    @Override // defpackage.eooz
                    public final ListenableFuture a(Object obj) {
                        final long jLongValue = ((Long) obj).longValue();
                        final csq csqVar = new csq();
                        final csq csqVar2 = new csq();
                        final ehym ehymVar2 = ehymVar;
                        final long epochMilli2 = ehymVar2.b.f().toEpochMilli();
                        ListenableFuture listenableFutureJ = ehymVar2.j(ehymVar2.f.b());
                        ejvr ejvrVar = new ejvr() { // from class: ehxq
                            @Override // defpackage.ejvr
                            public final Object apply(Object obj2) {
                                Map map;
                                ehxq ehxqVar = this;
                                ehym ehymVar3 = ehymVar2;
                                Object obj3 = ehymVar3.i;
                                Map map2 = (Map) obj2;
                                Map map3 = csqVar2;
                                long j = jLongValue;
                                synchronized (obj3) {
                                    Iterator it = ehymVar3.j.entrySet().iterator();
                                    while (true) {
                                        boolean zHasNext = it.hasNext();
                                        map = csqVar;
                                        if (zHasNext) {
                                            Map.Entry entry = (Map.Entry) it.next();
                                            ehyr ehyrVar = (ehyr) entry.getKey();
                                            Map map4 = ehymVar3.k;
                                            if (map4.containsKey(ehyrVar) || !ehymVar3.o()) {
                                                ehxqVar = this;
                                            } else {
                                                Map map5 = ehymVar3.l;
                                                Long lValueOf = Long.valueOf(j);
                                                long jMax = Math.max(((Long) Map.EL.getOrDefault(map5, ehyrVar, lValueOf)).longValue(), ((Long) Map.EL.getOrDefault(map2, ehyrVar, lValueOf)).longValue());
                                                ehwf ehwfVar = ((ehyr) entry.getKey()).b;
                                                ehwb ehwbVarD = ((ehwk) entry.getValue()).d();
                                                java.util.Map map6 = map2;
                                                long j2 = j;
                                                long j3 = ((ehvx) ehwbVarD).a;
                                                long j4 = epochMilli2;
                                                if (jMax + j3 <= j4) {
                                                    Iterator<E> it2 = ((ekgp) ((ehvx) ehwbVarD).c).entrySet().iterator();
                                                    while (true) {
                                                        if (!it2.hasNext()) {
                                                            SettableFuture settableFutureCreate = SettableFuture.create();
                                                            map4.put(ehyrVar, settableFutureCreate);
                                                            map.put(ehyrVar, settableFutureCreate);
                                                            break;
                                                        }
                                                        Map.Entry entry2 = (Map.Entry) it2.next();
                                                        ehwd ehwdVar = (ehwd) entry2.getValue();
                                                        long jA = ehwdVar.a();
                                                        long j5 = j4 - jMax;
                                                        long jA2 = ehwdVar.a() + j3;
                                                        if (jA == -1 || j5 <= jA2) {
                                                            ehwe ehweVar = (ehwe) entry2.getKey();
                                                            if (!map3.containsKey(ehweVar)) {
                                                                map3.put(ehweVar, Boolean.valueOf(((ehwl) ((fcsu) ehymVar3.g.get(ehweVar)).b()).a()));
                                                            }
                                                            if (!((Boolean) map3.get(ehweVar)).booleanValue()) {
                                                                ((ekrd) ((ekrd) ehym.a.f()).h("com/google/apps/tiktok/sync/impl/SyncManagerImpl", "shouldSync", 567, "SyncManagerImpl.java")).t("Skipping synclet %s due to unsatisfied constraint", ehwfVar);
                                                                break;
                                                            }
                                                        }
                                                    }
                                                }
                                                ehxqVar = this;
                                                map2 = map6;
                                                j = j2;
                                            }
                                        }
                                    }
                                }
                                return map;
                            }
                        };
                        eosd eosdVar = ehymVar2.c;
                        return eika.k(eika.j(listenableFutureJ, ejvrVar, eosdVar), new eooz() { // from class: ehxv
                            @Override // defpackage.eooz
                            public final ListenableFuture a(Object obj2) {
                                return ehymVar2.i((java.util.Map) obj2);
                            }
                        }, eosdVar);
                    }
                }, ehymVar.c));
            }
        }, this.c), new eooz() { // from class: eial
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                return ((eiaq) obj).b();
            }
        });
        listenableFutureA.b(new Runnable() { // from class: ehxt
            @Override // java.lang.Runnable
            public final void run() {
                ((ekrd) ((ekrd) ehym.a.h()).h("com/google/apps/tiktok/sync/impl/SyncManagerImpl", "sync", 208, "SyncManagerImpl.java")).q("#sync() complete");
            }
        }, eoqg.a);
        return listenableFutureA;
    }

    final ListenableFuture c() {
        return eika.k(j(this.h), new eooz() { // from class: ehya
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                final ehym ehymVar = this.a;
                final Long l = (Long) obj;
                return eika.j(ehymVar.f.b(), new ejvr() { // from class: ehxs
                    @Override // defpackage.ejvr
                    public final Object apply(Object obj2) {
                        Long l2 = l;
                        java.util.Map map = (java.util.Map) obj2;
                        ehym ehymVar2 = ehymVar;
                        synchronized (ehymVar2.i) {
                            for (ehyr ehyrVar : ehymVar2.j.keySet()) {
                                if (!map.containsKey(ehyrVar)) {
                                    map.put(ehyrVar, l2);
                                }
                            }
                        }
                        return map;
                    }
                }, ehymVar.c);
            }
        }, this.c);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final /* synthetic */ ListenableFuture d(ListenableFuture listenableFuture, final java.util.Map map) {
        Throwable th;
        boolean zBooleanValue;
        final ehwk ehwkVar;
        try {
            zBooleanValue = ((Boolean) eork.q(listenableFuture)).booleanValue();
            th = null;
        } catch (CancellationException | ExecutionException e) {
            th = e;
            zBooleanValue = false;
        }
        if (!zBooleanValue) {
            ((ekrd) ((ekrd) ((ekrd) a.j()).g(th)).h("com/google/apps/tiktok/sync/impl/SyncManagerImpl", "syncInternal", (char) 333, "SyncManagerImpl.java")).q("Failed preparing sync datastore for sync. Aborting sync attempt.");
            long epochMilli = this.b.f().toEpochMilli();
            ArrayList arrayList = new ArrayList(map.size());
            Iterator it = map.keySet().iterator();
            while (it.hasNext()) {
                arrayList.add(this.f.d((ehyr) it.next(), epochMilli, false));
            }
            return eijy.a(eork.e(arrayList), new Callable() { // from class: ehxn
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    java.util.Map map2 = map;
                    ehym ehymVar = this.a;
                    synchronized (ehymVar.i) {
                        Iterator it2 = map2.keySet().iterator();
                        while (it2.hasNext()) {
                        }
                    }
                    return null;
                }
            }, this.c);
        }
        ejwl.l(q().isDone());
        ArrayList arrayList2 = new ArrayList();
        for (Map.Entry entry : map.entrySet()) {
            final ehyr ehyrVar = (ehyr) entry.getKey();
            final SettableFuture settableFuture = (SettableFuture) entry.getValue();
            StringBuilder sb = new StringBuilder("Synclet: ");
            ehwf ehwfVar = ehyrVar.b;
            sb.append(ehwfVar.b());
            if (ehyrVar.a()) {
                sb.append(" ");
                sb.append(((efwq) ehyrVar.c).a);
            }
            eiez eiezVarF = eiey.a;
            if (ehyrVar.a()) {
                eiex eiexVarC = eiezVarF.c();
                efwp.a(eiexVarC, ehyrVar.c);
                eiezVarF = ((eiez) eiexVarC).f();
            }
            eieu eieuVarJ = eiiy.j(sb.toString(), eiezVarF);
            try {
                synchronized (this.i) {
                    ehwkVar = (ehwk) this.j.get(ehyrVar);
                }
                if (ehwkVar == null) {
                    settableFuture.cancel(false);
                } else {
                    eooy eooyVar = new eooy() { // from class: ehxu
                        @Override // defpackage.eooy
                        public final ListenableFuture a() {
                            final ehyr ehyrVar2 = ehyrVar;
                            final ehwk ehwkVar2 = ehwkVar;
                            eooy eooyVar2 = new eooy() { // from class: ehyc
                                @Override // defpackage.eooy
                                public final ListenableFuture a() {
                                    ((ekrd) ((ekrd) ehym.a.h()).h("com/google/apps/tiktok/sync/impl/SyncManagerImpl", "runSynclet", 413, "SyncManagerImpl.java")).t("Starting synclet: %s", new esvh(esvg.NO_USER_DATA, ehyrVar2.b.b()));
                                    ehwk ehwkVar3 = ehwkVar2;
                                    ejwl.m(ehwkVar3.c(), "Synclet binding must be enabled to have a Synclet");
                                    ejwl.m(ehwkVar3.c(), "Synclet binding must be enabled to have a SyncletProvider");
                                    fcsu fcsuVarB = ehwkVar3.b();
                                    fcsuVarB.getClass();
                                    ehwh ehwhVar = (ehwh) fcsuVarB.b();
                                    ehwhVar.getClass();
                                    return ehwhVar.a();
                                }
                            };
                            ehym ehymVar = this.a;
                            return eork.p(eooq.f(eika.i(eooyVar2, ehymVar.d), new ejvt(null), eoqg.a), ((ehvx) ehwkVar2.d()).b, TimeUnit.MILLISECONDS, ehymVar.c);
                        }
                    };
                    eiao eiaoVarHR = ehyrVar.a() ? ((b) ehlh.a(this.m, b.class, ehyrVar.c)).hR() : this.s;
                    Set set = (Set) eiaoVarHR.b.b();
                    ekhv ekhvVarI = ekhx.i(set.size());
                    Iterator it2 = set.iterator();
                    while (it2.hasNext()) {
                        ekhvVarI.c(new eian((eiar) it2.next(), ehwfVar));
                    }
                    ListenableFuture listenableFutureA = eiaoVarHR.a.a(eooyVar, ekhvVarI.g());
                    egoc.d("com/google/apps/tiktok/sync/monitoring/SyncMonitoringDispatcherImpl", "startSyncletAndMonitorExecution", 99, listenableFutureA, "Synclet sync() failed for synckey: %s", new esvh(esvg.NO_USER_DATA, ehwfVar));
                    settableFuture.o(listenableFutureA);
                }
                eooy eooyVar2 = new eooy() { // from class: ehyb
                    @Override // defpackage.eooy
                    public final ListenableFuture a() {
                        return this.a.e(settableFuture, ehyrVar);
                    }
                };
                eosd eosdVar = this.c;
                final ListenableFuture listenableFutureB = eijy.b(settableFuture, eooyVar2, eosdVar);
                listenableFutureB.b(new Runnable() { // from class: ehxm
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.a.n(ehyrVar, listenableFutureB);
                    }
                }, eosdVar);
                eieuVarJ.b(listenableFutureB);
                eieuVarJ.close();
                arrayList2.add(listenableFutureB);
            } finally {
            }
        }
        return eooq.f(eork.o(arrayList2), new ejvt(null), eoqg.a);
    }

    public final /* synthetic */ ListenableFuture e(ListenableFuture listenableFuture, ehyr ehyrVar) {
        boolean z = false;
        try {
            eork.q(listenableFuture);
            z = true;
        } catch (CancellationException unused) {
        } catch (ExecutionException e) {
            if (e.getCause() instanceof TimeoutException) {
                ((ekrd) ((ekrd) ((ekrd) a.j()).g(e)).h("com/google/apps/tiktok/sync/impl/SyncManagerImpl", "writeResultToDatabase", 465, "SyncManagerImpl.java")).t("Sync cancelled from timeout and will be retried later: %s", ehyrVar.b.b());
            }
        }
        final long epochMilli = this.b.f().toEpochMilli();
        return eijy.a(this.f.d(ehyrVar, epochMilli, z), new Callable() { // from class: ehye
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return Long.valueOf(epochMilli);
            }
        }, this.c);
    }

    public final ListenableFuture f() {
        ((ekrd) ((ekrd) a.h()).h("com/google/apps/tiktok/sync/impl/SyncManagerImpl", "onAccountsChanged", 720, "SyncManagerImpl.java")).q("onAccountsChanged: Checking and maybe rescheduling synclet bindings");
        ejwl.m(true, "onAccountsChanged called without an AccountManager bound");
        final ListenableFuture listenableFutureJ = j(p());
        final ehxh ehxhVar = this.f;
        final ListenableFuture listenableFutureB = ehxhVar.d.submit(eiid.l(new Callable() { // from class: ehxb
            @Override // java.util.concurrent.Callable
            public final Object call() {
                ekhv ekhvVar = new ekhv();
                ehxh ehxhVar2 = ehxhVar;
                try {
                    Iterator<E> it = ehxhVar2.a().f.iterator();
                    while (it.hasNext()) {
                        ekhvVar.c(efwo.b(((Integer) it.next()).intValue()));
                    }
                    return ekhvVar.g();
                } catch (IOException e) {
                    ehxhVar2.f(e);
                    return ekhvVar.g();
                }
            }
        }));
        eijz eijzVarD = eika.d(listenableFutureJ, listenableFutureB);
        eooy eooyVar = new eooy() { // from class: ehyf
            @Override // defpackage.eooy
            public final ListenableFuture a() {
                Set set = (Set) eork.q(listenableFutureJ);
                Set set2 = (Set) eork.q(listenableFutureB);
                ekpf ekpfVarB = ekpg.b(set, set2);
                ekpf ekpfVarB2 = ekpg.b(set2, set);
                ehym ehymVar = this.a;
                ehymVar.k(ekpfVarB);
                final HashSet hashSet = new HashSet();
                Object obj = ehymVar.i;
                synchronized (obj) {
                    for (ehyr ehyrVar : ehymVar.j.keySet()) {
                        if (ekpfVarB2.contains(ehyrVar.c)) {
                            hashSet.add(ehyrVar);
                        }
                    }
                    synchronized (obj) {
                        Iterator it = hashSet.iterator();
                        while (it.hasNext()) {
                            ListenableFuture listenableFuture = (ListenableFuture) ehymVar.k.get((ehyr) it.next());
                            if (listenableFuture != null) {
                                listenableFuture.cancel(false);
                            }
                        }
                    }
                    if (!ekpfVarB.isEmpty() && ekpfVarB2.isEmpty()) {
                        return eorv.a;
                    }
                    ((ekrd) ((ekrd) ehym.a.h()).h("com/google/apps/tiktok/sync/impl/SyncManagerImpl", "onAccountsChanged", 745, "SyncManagerImpl.java")).q("Accounts did change. Rescheduling synclets.");
                    return eika.j(ehymVar.g(eork.i(ekon.a)), new ejvt(null), eoqg.a);
                }
                ehymVar.j.keySet().removeAll(hashSet);
                egoc egocVar = ehymVar.e;
                final ehxh ehxhVar2 = ehymVar.f;
                ListenableFuture listenableFutureSubmit = ehxhVar2.d.submit(new Callable() { // from class: ehxd
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        ehxh ehxhVar3 = ehxhVar2;
                        ehxhVar3.b.writeLock().lock();
                        Set set3 = hashSet;
                        try {
                            eiay eiayVarA = eiay.a;
                            try {
                                eiayVarA = ehxhVar3.a();
                            } catch (IOException e) {
                                if (!ehxhVar3.f(e)) {
                                    ((ekrd) ((ekrd) ((ekrd) ehxh.a.i()).g(e)).h("com/google/apps/tiktok/sync/impl/SyncManagerDataStore", "removeSyncRequests", 485, "SyncManagerDataStore.java")).q("Unable to read or clear store. Cannot remove account.");
                                }
                            }
                            eiax eiaxVar = (eiax) eiay.a.createBuilder();
                            eiaxVar.mergeFrom((eiax) eiayVarA);
                            eiaxVar.copyOnWrite();
                            ((eiay) eiaxVar.instance).d = eiay.emptyProtobufList();
                            for (eiaw eiawVar : eiayVarA.d) {
                                eibc eibcVar = eiawVar.c;
                                if (eibcVar == null) {
                                    eibcVar = eibc.a;
                                }
                                if (!set3.contains(new ehyr(eibcVar))) {
                                    eiaxVar.a(eiawVar);
                                }
                            }
                            try {
                                ehxhVar3.e((eiay) eiaxVar.build());
                            } catch (IOException e2) {
                                ((ekrd) ((ekrd) ((ekrd) ehxh.a.i()).g(e2)).h("com/google/apps/tiktok/sync/impl/SyncManagerDataStore", "removeSyncRequests", 505, "SyncManagerDataStore.java")).q("Error writing sync data file. Cannot remove account.");
                            }
                            ehxhVar3.b.writeLock().unlock();
                            return null;
                        } catch (Throwable th) {
                            ehxhVar3.b.writeLock().unlock();
                            throw th;
                        }
                    }
                });
                egocVar.h(listenableFutureSubmit);
                egoc.d("com/google/apps/tiktok/sync/impl/SyncManagerImpl", "removeAccounts", 815, listenableFutureSubmit, "Error removing accounts from sync. IDs: %s", ekpfVarB2);
                if (!ekpfVarB.isEmpty()) {
                }
                ((ekrd) ((ekrd) ehym.a.h()).h("com/google/apps/tiktok/sync/impl/SyncManagerImpl", "onAccountsChanged", 745, "SyncManagerImpl.java")).q("Accounts did change. Rescheduling synclets.");
                return eika.j(ehymVar.g(eork.i(ekon.a)), new ejvt(null), eoqg.a);
            }
        };
        eosd eosdVar = this.c;
        ListenableFuture listenableFutureB2 = eijzVarD.b(eooyVar, eosdVar);
        if (!this.p) {
            this.r.set(listenableFutureB2);
        }
        final ListenableFuture listenableFutureP = eork.p(listenableFutureB2, 10L, TimeUnit.SECONDS, eosdVar);
        eosa eosaVar = new eosa(eiid.k(new Runnable() { // from class: ehyg
            @Override // java.lang.Runnable
            public final void run() {
                ehym.m(listenableFutureP);
            }
        }));
        listenableFutureP.b(eosaVar, eoqg.a);
        return eosaVar;
    }

    public final ListenableFuture g(final ListenableFuture listenableFuture) {
        if (this.p) {
            return eork.b(listenableFuture, eork.j(eork.b(listenableFuture, this.h, q()).b(eiid.c(new eooy() { // from class: ehxo
                @Override // defpackage.eooy
                public final ListenableFuture a() {
                    ((ekrd) ((ekrd) ehym.a.h()).h("com/google/apps/tiktok/sync/impl/SyncManagerImpl", "scheduleNextSyncInline", 606, "SyncManagerImpl.java")).q("Scheduling next wakeup");
                    ehym ehymVar = this.a;
                    ListenableFuture listenableFutureH = ehymVar.h(listenableFuture, ((Long) eork.q(ehymVar.h)).longValue());
                    ehymVar.e.h(listenableFutureH);
                    listenableFutureH.b(new ehyl(listenableFutureH), ehymVar.c);
                    return listenableFutureH;
                }
            }), this.d))).a(eiid.l(new Callable() { // from class: ehxp
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return null;
                }
            }), eoqg.a);
        }
        ListenableFuture listenableFuture2 = this.h;
        eooz eoozVar = new eooz() { // from class: ehyh
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                final ehym ehymVar = this.a;
                final ListenableFuture listenableFuture3 = listenableFuture;
                final Long l = (Long) obj;
                return eijy.b(ehymVar.j(listenableFuture3), new eooy() { // from class: ehxl
                    @Override // defpackage.eooy
                    public final ListenableFuture a() {
                        ((ekrd) ((ekrd) ehym.a.h()).h("com/google/apps/tiktok/sync/impl/SyncManagerImpl", "scheduleNextSyncInParallel", 639, "SyncManagerImpl.java")).q("Completed sync. Scheduling next wakeup");
                        return ehymVar.h(listenableFuture3, l.longValue());
                    }
                }, ehymVar.c);
            }
        };
        eosd eosdVar = this.c;
        ListenableFuture listenableFutureJ = eork.j(eika.k(listenableFuture2, eoozVar, eosdVar));
        this.e.h(listenableFutureJ);
        listenableFutureJ.b(new ehyl(listenableFutureJ), eosdVar);
        return eooq.f(listenableFuture, eiid.a(new ejvr() { // from class: ehyi
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                return null;
            }
        }), eoqg.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v9, types: [java.util.Set] */
    public final ListenableFuture h(ListenableFuture listenableFuture, long j) {
        final HashMap map;
        ekon ekonVar = ekon.a;
        try {
            ekonVar = (Set) eork.q(listenableFuture);
        } catch (CancellationException | ExecutionException e) {
            ((ekrd) ((ekrd) ((ekrd) a.j()).g(e)).h("com/google/apps/tiktok/sync/impl/SyncManagerImpl", "scheduleNextSyncInner", (char) 662, "SyncManagerImpl.java")).q("Unable to determine attempted syncs. They will not be used to schedule the next sync.");
        }
        synchronized (this.i) {
            map = new HashMap(this.j);
        }
        Collection.EL.removeIf(map.entrySet(), new Predicate() { // from class: ehxx
            public final /* synthetic */ Predicate and(Predicate predicate) {
                return Predicate$CC.$default$and(this, predicate);
            }

            @Override // java.util.function.Predicate
            /* renamed from: negate */
            public final /* synthetic */ Predicate mo538negate() {
                return Predicate$CC.$default$negate(this);
            }

            public final /* synthetic */ Predicate or(Predicate predicate) {
                return Predicate$CC.$default$or(this, predicate);
            }

            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return !this.a.o();
            }
        });
        return eika.k(this.q.a(ekonVar, j, map), new eooz() { // from class: ehxy
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                ehym ehymVar = this.a;
                final Set setKeySet = map.keySet();
                final ehxh ehxhVar = ehymVar.f;
                return ehxhVar.d.submit(new Callable() { // from class: ehxc
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        ehxh ehxhVar2 = ehxhVar;
                        ehxhVar2.b.writeLock().lock();
                        Set<ehyr> set = setKeySet;
                        try {
                            eiay eiayVarA = eiay.a;
                            try {
                                eiayVarA = ehxhVar2.a();
                            } catch (IOException e2) {
                                if (!ehxhVar2.f(e2)) {
                                    ((ekrd) ((ekrd) ((ekrd) ehxh.a.i()).g(e2)).h("com/google/apps/tiktok/sync/impl/SyncManagerDataStore", "updateScheduledAccountIds", 444, "SyncManagerDataStore.java")).q("Unable to read or clear store, will not update scheduled account ids. ");
                                }
                            }
                            eiax eiaxVar = (eiax) eiayVarA.toBuilder();
                            eiaxVar.copyOnWrite();
                            ((eiay) eiaxVar.instance).f = eiay.emptyIntList();
                            TreeSet treeSet = new TreeSet();
                            for (ehyr ehyrVar : set) {
                                if (ehyrVar.a()) {
                                    treeSet.add(Integer.valueOf(((efwq) ehyrVar.c).a));
                                }
                            }
                            eiaxVar.copyOnWrite();
                            eiay eiayVar = (eiay) eiaxVar.instance;
                            evsx evsxVar = eiayVar.f;
                            if (!evsxVar.c()) {
                                eiayVar.f = evsn.mutableCopy(evsxVar);
                            }
                            evpz.addAll(treeSet, eiayVar.f);
                            try {
                                ehxhVar2.e((eiay) eiaxVar.build());
                            } catch (IOException e3) {
                                ((ekrd) ((ekrd) ((ekrd) ehxh.a.i()).g(e3)).h("com/google/apps/tiktok/sync/impl/SyncManagerDataStore", "updateScheduledAccountIds", 465, "SyncManagerDataStore.java")).q("Error writing scheduled account ids");
                            }
                            ehxhVar2.b.writeLock().unlock();
                            return null;
                        } catch (Throwable th) {
                            ehxhVar2.b.writeLock().unlock();
                            throw th;
                        }
                    }
                });
            }
        }, eoqg.a);
    }

    public final ListenableFuture i(final java.util.Map map) {
        ((ekrd) ((ekrd) a.h()).h("com/google/apps/tiktok/sync/impl/SyncManagerImpl", "syncInternal", 304, "SyncManagerImpl.java")).t("Running synclets: %s", Collection.EL.stream(map.keySet()).map(new Function() { // from class: ehxi
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((ehyr) obj).b.b();
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).toArray());
        if (map.isEmpty()) {
            return eork.i(ekon.a);
        }
        final ehxh ehxhVar = this.f;
        final Set setKeySet = map.keySet();
        final ListenableFuture listenableFutureH = eika.h(new Callable() { // from class: ehwz
            @Override // java.util.concurrent.Callable
            public final Object call() {
                boolean zValueOf;
                java.util.Collection<ehyr> collection;
                ehxh ehxhVar2 = ehxhVar;
                ehxhVar2.b.writeLock().lock();
                try {
                    eiay eiayVarA = eiay.a;
                    boolean z = false;
                    try {
                        eiayVarA = ehxhVar2.a();
                    } catch (IOException e) {
                        if (!ehxhVar2.f(e)) {
                            ((ekrd) ((ekrd) ((ekrd) ehxh.a.i()).g(e)).h("com/google/apps/tiktok/sync/impl/SyncManagerDataStore", "prepareForSync", 276, "SyncManagerDataStore.java")).q("Error, could not read or clear store. Aborting sync attempt.");
                            zValueOf = false;
                        }
                    }
                    eiax eiaxVar = (eiax) eiay.a.createBuilder();
                    eiaxVar.mergeFrom((eiax) eiayVarA);
                    eiaxVar.copyOnWrite();
                    ((eiay) eiaxVar.instance).d = eiay.emptyProtobufList();
                    diep diepVar = ehxhVar2.e;
                    long epochMilli = diepVar.f().toEpochMilli();
                    HashSet hashSet = new HashSet();
                    Iterator<E> it = eiayVarA.d.iterator();
                    while (true) {
                        boolean zHasNext = it.hasNext();
                        collection = setKeySet;
                        if (!zHasNext) {
                            break;
                        }
                        eiaw eiawVar = (eiaw) it.next();
                        eibc eibcVar = eiawVar.c;
                        if (eibcVar == null) {
                            eibcVar = eibc.a;
                        }
                        if (collection.contains(new ehyr(eibcVar))) {
                            eibc eibcVar2 = eiawVar.c;
                            if (eibcVar2 == null) {
                                eibcVar2 = eibc.a;
                            }
                            hashSet.add(new ehyr(eibcVar2));
                            eiav eiavVar = (eiav) eiawVar.toBuilder();
                            eiavVar.copyOnWrite();
                            eiaw eiawVar2 = (eiaw) eiavVar.instance;
                            eiawVar2.b |= 4;
                            eiawVar2.e = epochMilli;
                            eiaxVar.a((eiaw) eiavVar.build());
                        } else {
                            eiaxVar.a(eiawVar);
                        }
                    }
                    for (ehyr ehyrVar : collection) {
                        if (!hashSet.contains(ehyrVar)) {
                            eiav eiavVar2 = (eiav) eiaw.a.createBuilder();
                            eibc eibcVar3 = ehyrVar.a;
                            eiavVar2.copyOnWrite();
                            eiaw eiawVar3 = (eiaw) eiavVar2.instance;
                            eibcVar3.getClass();
                            eiawVar3.c = eibcVar3;
                            eiawVar3.b |= 1;
                            long j = ehxhVar2.g;
                            eiavVar2.copyOnWrite();
                            eiaw eiawVar4 = (eiaw) eiavVar2.instance;
                            eiawVar4.b |= 2;
                            eiawVar4.d = j;
                            eiavVar2.copyOnWrite();
                            eiaw eiawVar5 = (eiaw) eiavVar2.instance;
                            eiawVar5.b |= 4;
                            eiawVar5.e = epochMilli;
                            eiavVar2.copyOnWrite();
                            eiaw eiawVar6 = (eiaw) eiavVar2.instance;
                            eiawVar6.b |= 8;
                            eiawVar6.f = 0;
                            eiaxVar.a((eiaw) eiavVar2.build());
                        }
                    }
                    if (eiayVarA.c < 0) {
                        long epochMilli2 = ehxhVar2.g;
                        if (epochMilli2 < 0) {
                            epochMilli2 = diepVar.f().toEpochMilli();
                            ehxhVar2.g = epochMilli2;
                        }
                        eiaxVar.copyOnWrite();
                        eiay eiayVar = (eiay) eiaxVar.instance;
                        eiayVar.b |= 1;
                        eiayVar.c = epochMilli2;
                    }
                    try {
                        ehxhVar2.e((eiay) eiaxVar.build());
                        ehxhVar2.f.set(true);
                        z = true;
                    } catch (IOException unused) {
                    } catch (Throwable th) {
                        ehxhVar2.f.set(true);
                        throw th;
                    }
                    zValueOf = Boolean.valueOf(z);
                    return zValueOf;
                } finally {
                    ehxhVar2.b.writeLock().unlock();
                }
            }
        }, ehxhVar.d);
        ListenableFuture listenableFutureJ = j(listenableFutureH);
        eooy eooyVar = new eooy() { // from class: ehxj
            @Override // defpackage.eooy
            public final ListenableFuture a() {
                return this.a.d(listenableFutureH, map);
            }
        };
        eosd eosdVar = this.c;
        ListenableFuture listenableFutureB = eijy.b(listenableFutureJ, eooyVar, eosdVar);
        egoc egocVar = this.e;
        map.getClass();
        ListenableFuture listenableFutureA = eijy.a(listenableFutureB, new Callable() { // from class: ehxk
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return map.keySet();
            }
        }, eosdVar);
        egocVar.h(listenableFutureA);
        return listenableFutureA;
    }

    public final ListenableFuture j(final ListenableFuture listenableFuture) {
        return eika.k(q(), new eooz() { // from class: ehxz
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                return listenableFuture;
            }
        }, eoqg.a);
    }

    public final void k(Set set) {
        synchronized (this.i) {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                efwo efwoVar = (efwo) it.next();
                csq csqVar = this.j;
                HashMap map = new HashMap();
                for (Map.Entry entry : ((ekgp) ((a) ehlh.a(this.m, a.class, efwoVar)).hf()).entrySet()) {
                    ehwf ehwfVarA = ehwf.a((String) entry.getKey());
                    int iA = efwoVar.a();
                    eibb eibbVar = (eibb) eibc.a.createBuilder();
                    eiba eibaVar = ehwfVarA.a;
                    eibbVar.copyOnWrite();
                    eibc eibcVar = (eibc) eibbVar.instance;
                    eibaVar.getClass();
                    eibcVar.c = eibaVar;
                    eibcVar.b |= 1;
                    eibbVar.copyOnWrite();
                    eibc eibcVar2 = (eibc) eibbVar.instance;
                    eibcVar2.b |= 2;
                    eibcVar2.d = iA;
                    r(new ehyr((eibc) eibbVar.build()), entry, map);
                }
                csqVar.putAll(map);
            }
        }
    }

    public final /* synthetic */ void n(ehyr ehyrVar, ListenableFuture listenableFuture) {
        synchronized (this.i) {
            try {
                this.l.put(ehyrVar, (Long) eork.q(listenableFuture));
            } catch (CancellationException | ExecutionException unused) {
            }
        }
    }

    public final boolean o() {
        return this.n.a();
    }
}
