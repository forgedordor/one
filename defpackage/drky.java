package defpackage;

import com.google.common.util.concurrent.SettableFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class drky implements Runnable {
    final /* synthetic */ Runnable a;
    final /* synthetic */ SettableFuture b;
    final /* synthetic */ drla c;
    final /* synthetic */ long d;
    final /* synthetic */ TimeUnit e;
    final /* synthetic */ drlb f;

    public drky(drlb drlbVar, Runnable runnable, SettableFuture settableFuture, drla drlaVar, long j, TimeUnit timeUnit) {
        this.a = runnable;
        this.b = settableFuture;
        this.c = drlaVar;
        this.d = j;
        this.e = timeUnit;
        this.f = drlbVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        final Runnable runnable = this.a;
        final SettableFuture settableFuture = this.b;
        final drla drlaVar = this.c;
        final long j = this.d;
        final TimeUnit timeUnit = this.e;
        this.f.execute(new Runnable() { // from class: drkx
            @Override // java.lang.Runnable
            public final void run() {
                drky drkyVar = this.a;
                long j2 = j;
                Runnable runnable2 = runnable;
                SettableFuture settableFuture2 = settableFuture;
                drla drlaVar2 = drlaVar;
                TimeUnit timeUnit2 = timeUnit;
                try {
                    runnable2.run();
                    if (settableFuture2.isDone()) {
                        return;
                    }
                    eosb eosbVarSchedule = drkyVar.f.a.schedule(drkyVar, j2, timeUnit2);
                    drlaVar2.a = eosbVarSchedule;
                    if (drlaVar2.isDone()) {
                        eosbVarSchedule.cancel(false);
                    }
                } catch (Throwable th) {
                    settableFuture2.setException(th);
                }
            }
        });
    }
}
