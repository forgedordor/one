package defpackage;

import com.google.common.util.concurrent.SettableFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ejtz implements Runnable {
    final /* synthetic */ SettableFuture a;
    final /* synthetic */ Runnable b;
    final /* synthetic */ AtomicReference c;
    final /* synthetic */ eosd d;
    final /* synthetic */ long e;
    final /* synthetic */ long f;
    final /* synthetic */ diep g;

    public ejtz(SettableFuture settableFuture, Runnable runnable, AtomicReference atomicReference, eosd eosdVar, long j, long j2, diep diepVar) {
        this.a = settableFuture;
        this.b = runnable;
        this.c = atomicReference;
        this.d = eosdVar;
        this.e = j;
        this.f = j2;
        this.g = diepVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            SettableFuture settableFuture = this.a;
            if (settableFuture.isDone()) {
                return;
            }
            this.b.run();
            SettableFuture settableFutureCreate = SettableFuture.create();
            this.c.set(settableFutureCreate);
            if (settableFuture.isDone()) {
                return;
            }
            eosd eosdVar = this.d;
            long j = this.e;
            long j2 = this.f;
            long jA = this.g.a();
            settableFutureCreate.o(eosdVar.schedule(this, jA < j ? (j + j2) - jA : j2 - ((jA - j) % j2), TimeUnit.MILLISECONDS));
        } catch (Throwable th) {
            this.a.setException(th);
        }
    }

    public final String toString() {
        return this.b.toString();
    }
}
