package defpackage;

import com.google.common.util.concurrent.SettableFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dxgq implements Runnable {
    final Runnable a = this;
    final /* synthetic */ Runnable b;
    final /* synthetic */ SettableFuture c;
    final /* synthetic */ dxgs d;
    final /* synthetic */ long e;
    final /* synthetic */ TimeUnit f;
    final /* synthetic */ dxgu g;

    public dxgq(dxgu dxguVar, Runnable runnable, SettableFuture settableFuture, dxgs dxgsVar, long j, TimeUnit timeUnit) {
        this.b = runnable;
        this.c = settableFuture;
        this.d = dxgsVar;
        this.e = j;
        this.f = timeUnit;
        this.g = dxguVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        final Runnable runnable = this.b;
        final SettableFuture settableFuture = this.c;
        final dxgs dxgsVar = this.d;
        final long j = this.e;
        final TimeUnit timeUnit = this.f;
        this.g.execute(new Runnable() { // from class: dxgp
            @Override // java.lang.Runnable
            public final void run() {
                long j2 = j;
                dxgq dxgqVar = this.a;
                Runnable runnable2 = runnable;
                SettableFuture settableFuture2 = settableFuture;
                dxgs dxgsVar2 = dxgsVar;
                TimeUnit timeUnit2 = timeUnit;
                try {
                    runnable2.run();
                    if (settableFuture2.isDone()) {
                        return;
                    }
                    eosb eosbVarSchedule = dxgqVar.g.a.schedule(dxgqVar.a, j2, timeUnit2);
                    dxgsVar2.a = eosbVarSchedule;
                    if (dxgsVar2.isDone()) {
                        eosbVarSchedule.cancel(false);
                    }
                } catch (Throwable th) {
                    settableFuture2.setException(th);
                }
            }
        });
    }
}
