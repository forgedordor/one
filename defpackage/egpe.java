package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.SettableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class egpe {
    public final egpb a;
    public final SettableFuture d;
    private final Executor f;
    public final AtomicLong b = new AtomicLong(b(Integer.MIN_VALUE, Integer.MIN_VALUE));
    public final AtomicReference c = new AtomicReference(null);
    private final AtomicReference e = new AtomicReference(null);

    public egpe(eooy eooyVar, Executor executor) {
        eoqg eoqgVar = eoqg.a;
        this.f = new eoss(eoqgVar);
        SettableFuture settableFutureCreate = SettableFuture.create();
        this.d = settableFutureCreate;
        egpb egpbVar = new egpb(eooyVar, executor);
        this.a = egpbVar;
        settableFutureCreate.b(egpbVar, eoqgVar);
    }

    public static int a(long j) {
        return (int) (j >>> 32);
    }

    public static long b(int i, int i2) {
        return (i2 & 4294967295L) | (i << 32);
    }

    public final ListenableFuture c() {
        AtomicLong atomicLong;
        long j;
        final int iA;
        SettableFuture settableFuture = this.d;
        if (settableFuture.isDone()) {
            return settableFuture;
        }
        do {
            atomicLong = this.b;
            j = atomicLong.get();
            iA = a(j);
        } while (!atomicLong.compareAndSet(j, b(iA, ((int) j) + 1)));
        AtomicReference atomicReference = this.e;
        final SettableFuture settableFutureCreate = SettableFuture.create();
        ListenableFuture listenableFuture = (ListenableFuture) atomicReference.getAndSet(settableFutureCreate);
        settableFutureCreate.o(listenableFuture == null ? eork.n(eiid.c(new eooy() { // from class: egoy
            @Override // defpackage.eooy
            public final ListenableFuture a() {
                return this.a.d(iA);
            }
        }), eoqg.a) : eooh.g(listenableFuture, Throwable.class, eiid.d(new eooz() { // from class: egoz
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                return this.a.d(iA);
            }
        }), this.f));
        final egpc egpcVar = new egpc(this, iA);
        settableFutureCreate.b(new Runnable() { // from class: egpa
            @Override // java.lang.Runnable
            public final void run() {
                egpc egpcVar2 = egpcVar;
                SettableFuture settableFuture2 = settableFutureCreate;
                try {
                    Object objQ = eork.q(settableFuture2);
                    SettableFuture settableFuture3 = this.a.d;
                    settableFuture3.set(objQ);
                    egpcVar2.o(settableFuture3);
                } catch (Throwable unused) {
                    egpcVar2.o(settableFuture2);
                }
            }
        }, eoqg.a);
        return egpcVar;
    }

    public final ListenableFuture d(int i) {
        AtomicReference atomicReference;
        egpd egpdVar;
        AtomicLong atomicLong = this.b;
        if (a(atomicLong.get()) > i) {
            return eork.g();
        }
        egpd egpdVar2 = new egpd(i);
        do {
            atomicReference = this.c;
            egpdVar = (egpd) atomicReference.get();
            if (egpdVar != null && egpdVar.a > i) {
                return eork.g();
            }
        } while (!egox.a(atomicReference, egpdVar, egpdVar2));
        if (a(atomicLong.get()) > i) {
            egpdVar2.cancel(true);
            egox.a(atomicReference, egpdVar2, null);
            return egpdVar2;
        }
        egpb egpbVar = this.a;
        eooy eooyVar = egpbVar.a;
        Executor executor = egpbVar.b;
        if (eooyVar == null || executor == null) {
            egpdVar2.o(this.d);
            return egpdVar2;
        }
        egpdVar2.o(eork.n(eiid.c(eooyVar), executor));
        return egpdVar2;
    }

    public final boolean e() {
        return this.d.isDone();
    }
}
