package defpackage;

import j$.util.Collection;
import j$.util.Optional;
import j$.util.function.Function$CC;
import j$.util.stream.Collectors;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class axiu implements Executor {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/datamodel/DepthMeasuredDatabaseWriteExecutor");
    final Executor b;
    final AtomicInteger c = new AtomicInteger();
    public final axir d;
    private final int e;

    public axiu(Executor executor, Optional optional, axir axirVar) {
        this.b = executor;
        this.e = ((Integer) optional.orElse(4)).intValue();
        this.d = axirVar;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(final Runnable runnable) {
        final axit axitVar;
        ekgb ekgbVarN;
        int iIncrementAndGet = this.c.incrementAndGet();
        ejwl.l(iIncrementAndGet > 0);
        axir axirVar = this.d;
        if (((Boolean) axirVar.a.get()).booleanValue()) {
            axit axitVar2 = new axit();
            synchronized (axirVar.c) {
                axirVar.b.add(axitVar2);
            }
            axitVar = axitVar2;
        } else {
            axitVar = null;
        }
        if (iIncrementAndGet > this.e) {
            ekrg ekrgVar = a;
            ekrw ekrwVarI = ekrgVar.i();
            ekrz ekrzVar = eksq.a;
            ekrwVarI.X(ekrzVar, "BugleDatabase");
            ekrd ekrdVar = (ekrd) ekrwVarI;
            ekrdVar.Z(eksk.FULL);
            ((ekrd) ekrdVar.h("com/google/android/apps/messaging/shared/datamodel/DepthMeasuredDatabaseWriteExecutor", "execute", 69, "DepthMeasuredDatabaseWriteExecutor.java")).w("Deep work queue for database write!  queueDepth = %d currentTrace = %s", iIncrementAndGet, eiiy.d());
            axir axirVar2 = this.d;
            if (((Boolean) axirVar2.a.get()).booleanValue()) {
                axiq axiqVar = new axiq(axirVar2.d);
                try {
                    if (axiqVar.a != null) {
                        synchronized (axirVar2.c) {
                            ekgbVarN = ekgb.n(axirVar2.b);
                        }
                        for (Map.Entry entry : ((Map) Collection.EL.stream(ekgbVarN).collect(Collectors.groupingBy(Function$CC.identity(), new Supplier() { // from class: axio
                            @Override // java.util.function.Supplier
                            public final Object get() {
                                return new HashMap();
                            }
                        }, Collectors.counting()))).entrySet()) {
                            String strA = ((axit) entry.getKey()).a();
                            String str = ((axit) entry.getKey()).a;
                            Long l = (Long) entry.getValue();
                            ekrw ekrwVarI2 = a.i();
                            ekrwVarI2.X(eksq.a, "BugleDatabase");
                            ((ekrd) ((ekrd) ekrwVarI2).h("com/google/android/apps/messaging/shared/datamodel/DepthMeasuredDatabaseWriteExecutor$DebugHelper", "writeQueuedDebugHelperDataToLogger", 165, "DepthMeasuredDatabaseWriteExecutor.java")).I("Enqueued count, stack, trace: %d\r\n%s\r\n%s", l, strA, str);
                        }
                    } else {
                        ekrw ekrwVarI3 = ekrgVar.i();
                        ekrwVarI3.X(ekrzVar, "BugleDatabase");
                        ((ekrd) ((ekrd) ekrwVarI3).h("com/google/android/apps/messaging/shared/datamodel/DepthMeasuredDatabaseWriteExecutor$DebugHelper", "writeQueuedDebugHelperDataToLogger", 141, "DepthMeasuredDatabaseWriteExecutor.java")).q("Skipping simultaneous debug logging.");
                    }
                    axiqVar.close();
                } catch (Throwable th) {
                    try {
                        axiqVar.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
        }
        auvh.h(eijx.f(new Runnable() { // from class: axin
            @Override // java.lang.Runnable
            public final void run() {
                axiu axiuVar = this.a;
                Runnable runnable2 = runnable;
                axit axitVar3 = axitVar;
                try {
                    runnable2.run();
                } finally {
                    ejwl.l(axiuVar.c.decrementAndGet() >= 0);
                    axiuVar.d.a(axitVar3);
                }
            }
        }, this.b));
    }
}
