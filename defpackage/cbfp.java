package defpackage;

import androidx.work.WorkerParameters;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Optional;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cbfp implements egsc {
    public final fcsu b;
    private final cbmx d;
    private final cbmh e;
    private final egsh f;
    private final fdjx g;
    private static final ekrg c = ekrg.c("com/google/android/apps/messaging/shared/datamodel/workqueue/WorkQueueTikTokWorker");
    public static final cqce a = cqce.g("BugleWorkQueue", "WorkQueueTikTokWorker");

    public cbfp(cogw cogwVar, cbmx cbmxVar, cbmh cbmhVar, fcsu fcsuVar, egsh egshVar, fdjx fdjxVar) {
        cogwVar.getClass();
        cbmxVar.getClass();
        cbmhVar.getClass();
        fcsuVar.getClass();
        egshVar.getClass();
        fdjxVar.getClass();
        this.d = cbmxVar;
        this.e = cbmhVar;
        this.b = fcsuVar;
        this.f = egshVar;
        this.g = fdjxVar;
    }

    private final Object e(final WorkerParameters workerParameters, fcxy fcxyVar) {
        String[] strArr = cbjq.a;
        cbjf cbjfVar = new cbjf();
        cbjfVar.f("deleteAssociationsForQueues");
        cbjfVar.e();
        cbjfVar.c(new Function() { // from class: cbfl
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                cbjp cbjpVar = (cbjp) obj;
                cbjpVar.ap(new dqpj("work_queue_work_manager_ids.workmanager_id", 1, basg.b(Optional.of(workerParameters.a))));
                return cbjpVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        if (cbjfVar.d() != 0) {
            ekrw ekrwVarI = c.i();
            ekrwVarI.X(eksq.a, "BugleWorkQueue");
            ((ekrd) ekrwVarI.h("com/google/android/apps/messaging/shared/datamodel/workqueue/WorkQueueTikTokWorker", "completePeriodicJob", 109, "WorkQueueTikTokWorker.kt")).t("WorkQueueWorkManagerId row deleted by WorkQueueTikTokWorker. It should already have been deleted. WorkManager ID: %s", workerParameters.a);
        }
        Object objC = fdxs.c(this.f.b(workerParameters.a), fcxyVar);
        return objC == fcyl.a ? objC : fctx.a;
    }

    @Override // defpackage.egsp
    public final /* synthetic */ ListenableFuture a(WorkerParameters workerParameters) {
        return egso.a();
    }

    @Override // defpackage.egsc, defpackage.egsp
    public final ListenableFuture b(WorkerParameters workerParameters) {
        return auvw.c(this.g, fcyi.a, fdjz.a, new cbfm(this, workerParameters, null));
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x00e0, code lost:
    
        if (e(r11, r6) == r0) goto L45;
     */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00bd A[Catch: cblt -> 0x00c8, TRY_LEAVE, TryCatch #0 {cblt -> 0x00c8, blocks: (B:15:0x0034, B:20:0x0044, B:36:0x00b0, B:38:0x00bd, B:33:0x0097), top: B:48:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(androidx.work.WorkerParameters r11, defpackage.fcxy r12) {
        /*
            Method dump skipped, instructions count: 233
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cbfp.d(androidx.work.WorkerParameters, fcxy):java.lang.Object");
    }

    @Override // defpackage.egsp
    public final /* synthetic */ void c(egsf egsfVar) {
    }
}
