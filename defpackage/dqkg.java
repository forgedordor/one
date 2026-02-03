package defpackage;

import com.google.common.util.concurrent.SettableFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dqkg implements Runnable {
    final Runnable a = this;
    final /* synthetic */ Runnable b;
    final /* synthetic */ SettableFuture c;
    final /* synthetic */ dqki d;
    final /* synthetic */ long e;
    final /* synthetic */ TimeUnit f;
    final /* synthetic */ dqkk g;

    public dqkg(dqkk dqkkVar, Runnable runnable, SettableFuture settableFuture, dqki dqkiVar, long j, TimeUnit timeUnit) {
        this.b = runnable;
        this.c = settableFuture;
        this.d = dqkiVar;
        this.e = j;
        this.f = timeUnit;
        this.g = dqkkVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        final Runnable runnable = this.b;
        final SettableFuture settableFuture = this.c;
        final dqki dqkiVar = this.d;
        final long j = this.e;
        final TimeUnit timeUnit = this.f;
        this.g.execute(new Runnable() { // from class: dqkf
            @Override // java.lang.Runnable
            public final void run() {
                long j2 = j;
                dqkg dqkgVar = this.a;
                Runnable runnable2 = runnable;
                SettableFuture settableFuture2 = settableFuture;
                dqki dqkiVar2 = dqkiVar;
                TimeUnit timeUnit2 = timeUnit;
                try {
                    runnable2.run();
                    if (settableFuture2.isDone()) {
                        return;
                    }
                    eosb eosbVarSchedule = dqkgVar.g.a.schedule(dqkgVar.a, j2, timeUnit2);
                    dqkiVar2.a = eosbVarSchedule;
                    if (dqkiVar2.isDone()) {
                        eosbVarSchedule.cancel(false);
                    }
                } catch (Throwable th) {
                    settableFuture2.setException(th);
                }
            }
        });
    }
}
