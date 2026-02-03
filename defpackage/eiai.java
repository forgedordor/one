package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eiai {
    public final diep a;
    private final eosd b;

    public eiai(diep diepVar, eosd eosdVar) {
        this.a = diepVar;
        this.b = eosdVar;
    }

    public final ListenableFuture a(eooy eooyVar, ekhx ekhxVar) {
        eosd eosdVar;
        final long jA = this.a.a();
        HashSet<eiag> hashSet = new HashSet();
        Iterator<E> it = ekhxVar.iterator();
        while (true) {
            eosdVar = this.b;
            if (!it.hasNext()) {
                break;
            }
            final eiah eiahVar = (eiah) it.next();
            eiahVar.getClass();
            ListenableFuture listenableFutureI = eika.i(eiid.c(new eooy() { // from class: eiad
                @Override // defpackage.eooy
                public final ListenableFuture a() {
                    return eiahVar.b();
                }
            }), eosdVar);
            egoc.d("com/google/apps/tiktok/sync/monitoring/FutureMonitor", "reportStarts", 130, listenableFutureI, "Future Monitor failed", new Object[0]);
            hashSet.add(new eiaa(eiahVar, listenableFutureI));
        }
        eooy eooyVarC = eiid.c(eooyVar);
        eoqg eoqgVar = eoqg.a;
        final ListenableFuture listenableFutureI2 = eika.i(eooyVarC, eoqgVar);
        final ListenableFuture listenableFutureA = egot.a(listenableFutureI2, eiid.l(new Callable() { // from class: eiab
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return Long.valueOf(this.a.a.a() - jA);
            }
        }), eoqgVar);
        HashSet hashSet2 = new HashSet();
        for (final eiag eiagVar : hashSet) {
            ListenableFuture listenableFutureB = eika.b(eiagVar.b(), listenableFutureA, listenableFutureI2).b(new eooy() { // from class: eiae
                @Override // defpackage.eooy
                public final ListenableFuture a() {
                    eiag eiagVar2 = eiagVar;
                    eork.q(eiagVar2.b());
                    Long l = (Long) eork.q(listenableFutureA);
                    return eiagVar2.a().a(listenableFutureI2, l.longValue());
                }
            }, eosdVar);
            egoc.d("com/google/apps/tiktok/sync/monitoring/FutureMonitor", "reportFinishes", 155, listenableFutureB, "Future Monitor failed", new Object[0]);
            hashSet2.add(listenableFutureB);
        }
        return eika.b(listenableFutureI2, eork.p(eork.j(eork.a(hashSet2).a(eiid.l(new Callable() { // from class: eiaf
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return null;
            }
        }), eoqgVar)), 10L, TimeUnit.SECONDS, eosdVar)).b(eiid.c(new eooy() { // from class: eiac
            @Override // defpackage.eooy
            public final ListenableFuture a() {
                return listenableFutureI2;
            }
        }), eoqgVar);
    }
}
