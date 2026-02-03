package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cmoi {
    private static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/sms/EarlySendCache");
    private final fcsu b;
    private final ConcurrentHashMap c;

    public cmoi(fcsu fcsuVar) {
        fcsuVar.getClass();
        this.b = fcsuVar;
        this.c = new ConcurrentHashMap();
    }

    public final eiju a(basd basdVar, Executor executor, final fdae fdaeVar) {
        executor.getClass();
        eiju eijuVarB = b(basdVar);
        final fdap fdapVar = new fdap() { // from class: cmog
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                return fdaeVar.invoke();
            }
        };
        return eijuVarB.h(new ejvr() { // from class: cmoh
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                return fdapVar.invoke(obj);
            }
        }, executor);
    }

    public final eiju b(basd basdVar) {
        fdkf fdkfVarC = c(basdVar);
        eiju eijuVarA = fdkfVarC != null ? auvw.a(fdkfVarC) : null;
        if (eijuVarA != null) {
            return eijuVarA;
        }
        ((ekrd) a.e().h("com/google/android/apps/messaging/shared/sms/EarlySendCache", "getSaveFuture", 84, "EarlySendCache.kt")).t("No save future found for %s", String.valueOf(basdVar));
        eiju eijuVarE = eijx.e(null);
        eijuVarE.getClass();
        return eijuVarE;
    }

    public final fdkf c(basd basdVar) {
        if (basdVar == null) {
            return null;
        }
        ConcurrentHashMap concurrentHashMap = this.c;
        fdkf fdkfVar = (fdkf) concurrentHashMap.get(basdVar);
        if (fdkfVar != null && fdkfVar.y()) {
            concurrentHashMap.remove(basdVar, fdkfVar);
        }
        return fdkfVar;
    }

    public final void d(basd basdVar, ListenableFuture listenableFuture) {
        basdVar.getClass();
        this.c.put(basdVar, auvw.e(listenableFuture));
    }

    public final void e(basd basdVar, int i) {
        if (!basd.l(basdVar) || b(basdVar).isDone()) {
            return;
        }
        ((ains) this.b.b()).e("Bugle.EarlySend.SaveNotFinished.Count", i - 1);
    }
}
