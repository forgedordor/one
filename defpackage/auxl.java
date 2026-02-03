package defpackage;

import j$.time.Duration;
import j$.time.Instant;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class auxl {
    private static final eksp a = eksp.c("BugleDitto");
    private final eosd b;
    private final ains c;
    private final cogw d;
    private final long e;
    private final ConcurrentHashMap f;
    private final ConcurrentLinkedDeque g;
    private final AtomicBoolean h;
    private final Object i;

    public auxl(eosd eosdVar, ains ainsVar, cogw cogwVar, long j) {
        this.b = eosdVar;
        this.c = ainsVar;
        this.d = cogwVar;
        this.e = j;
        if (j <= 0) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        this.f = new ConcurrentHashMap();
        this.g = new ConcurrentLinkedDeque();
        this.h = new AtomicBoolean(false);
        this.i = new Object();
    }

    public final void a() {
        ConcurrentLinkedDeque concurrentLinkedDeque;
        ArrayList arrayList = new ArrayList();
        synchronized (this.i) {
            while (true) {
                concurrentLinkedDeque = this.g;
                if (!concurrentLinkedDeque.isEmpty()) {
                    Instant instant = ((auxn) concurrentLinkedDeque.getFirst()).c;
                    cogw cogwVar = this.d;
                    if (Duration.between(instant, Instant.ofEpochMilli(cogwVar.a())).compareTo(Duration.ofMillis(this.e)) < 0) {
                        break;
                    }
                    auxn auxnVar = (auxn) concurrentLinkedDeque.removeFirst();
                    AtomicInteger atomicInteger = auxnVar.b;
                    if (atomicInteger.get() == 0) {
                        this.f.remove(auxnVar.a);
                    } else {
                        arrayList.add(new auxi(atomicInteger.get(), auxnVar.d, auxnVar.e));
                        atomicInteger.set(0);
                        Instant instantOfEpochMilli = Instant.ofEpochMilli(cogwVar.a());
                        instantOfEpochMilli.getClass();
                        auxnVar.c = instantOfEpochMilli;
                        concurrentLinkedDeque.addLast(auxnVar);
                    }
                } else {
                    break;
                }
            }
            if (concurrentLinkedDeque.isEmpty()) {
                this.h.set(false);
            } else {
                Instant instantOfEpochMilli2 = Instant.ofEpochMilli(this.d.a());
                Instant instant2 = ((auxn) concurrentLinkedDeque.getFirst()).c;
                long j = this.e;
                auvh.h(this.b.schedule(new Runnable() { // from class: auxk
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.a.a();
                    }
                }, fddu.k(Duration.between(instantOfEpochMilli2, instant2.plus(Duration.ofMillis(j))).toMillis(), j), TimeUnit.MILLISECONDS));
            }
        }
        Iterator it = arrayList.iterator();
        it.getClass();
        while (it.hasNext()) {
            Object next = it.next();
            next.getClass();
            ains ainsVar = this.c;
            auxi auxiVar = (auxi) next;
            ainsVar.e("Bugle.InMemoryThrottler.DeduplicatedRequests.Count", auxiVar.a);
            ainsVar.g("Bugle.InMemoryThrottler.DebouncedRequest.Delay", Duration.between(auxiVar.b, Instant.ofEpochMilli(this.d.a())).toMillis());
            auxiVar.c.run();
        }
    }

    public final boolean b(String str, Runnable runnable) {
        Runnable runnable2;
        boolean z;
        auxn auxnVar;
        synchronized (this.i) {
            if (str == null) {
                runnable2 = runnable;
                z = true;
            } else if (str.length() == 0) {
                runnable2 = runnable;
                z = true;
            } else {
                ConcurrentHashMap concurrentHashMap = this.f;
                auxn auxnVar2 = (auxn) concurrentHashMap.get(str);
                a.n().D("Execution for tag [%s], number of requests deduplicated = [%s]", str, auxnVar2 != null ? Integer.valueOf(auxnVar2.b.incrementAndGet()) : null);
                if (concurrentHashMap.containsKey(str)) {
                    runnable2 = runnable;
                    auxn auxnVar3 = (auxn) concurrentHashMap.get(str);
                    if (auxnVar3 != null && auxnVar3.b.get() == 1 && (auxnVar = (auxn) concurrentHashMap.get(str)) != null) {
                        Instant instantOfEpochMilli = Instant.ofEpochMilli(this.d.a());
                        instantOfEpochMilli.getClass();
                        auxnVar.d = instantOfEpochMilli;
                    }
                    z = false;
                } else {
                    AtomicInteger atomicInteger = new AtomicInteger(0);
                    cogw cogwVar = this.d;
                    Instant instantOfEpochMilli2 = Instant.ofEpochMilli(cogwVar.a());
                    instantOfEpochMilli2.getClass();
                    Instant instantOfEpochMilli3 = Instant.ofEpochMilli(cogwVar.a());
                    instantOfEpochMilli3.getClass();
                    runnable2 = runnable;
                    auxn auxnVar4 = new auxn(str, atomicInteger, instantOfEpochMilli2, instantOfEpochMilli3, runnable2);
                    concurrentHashMap.put(str, auxnVar4);
                    this.g.addLast(auxnVar4);
                    z = true;
                }
            }
        }
        AtomicBoolean atomicBoolean = this.h;
        if (!atomicBoolean.get()) {
            auvh.h(this.b.schedule(new Runnable() { // from class: auxj
                @Override // java.lang.Runnable
                public final void run() {
                    this.a.a();
                }
            }, this.e, TimeUnit.MILLISECONDS));
            atomicBoolean.set(true);
        }
        if (!z) {
            return false;
        }
        this.c.g("Bugle.InMemoryThrottler.DebouncedRequest.Delay", 0L);
        runnable2.run();
        return true;
    }
}
