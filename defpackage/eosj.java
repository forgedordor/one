package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eosj {
    public static eosc a(ExecutorService executorService) {
        return executorService instanceof eosc ? (eosc) executorService : executorService instanceof ScheduledExecutorService ? new eosi((ScheduledExecutorService) executorService) : new eosf(executorService);
    }

    public static eosd b(ScheduledExecutorService scheduledExecutorService) {
        return scheduledExecutorService instanceof eosd ? (eosd) scheduledExecutorService : new eosi(scheduledExecutorService);
    }

    static Executor c(final Executor executor, final eooi eooiVar) {
        executor.getClass();
        return executor == eoqg.a ? executor : new Executor() { // from class: eose
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                eosj.d(executor, eooiVar, runnable);
            }
        };
    }

    static /* synthetic */ void d(Executor executor, eooi eooiVar, Runnable runnable) {
        try {
            executor.execute(runnable);
        } catch (RejectedExecutionException e) {
            eooiVar.setException(e);
        }
    }
}
