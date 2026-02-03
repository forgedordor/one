package com.google.android.apps.messaging.shared.datamodel.workqueue;

import android.content.Context;
import androidx.work.WorkerParameters;
import com.google.android.apps.messaging.shared.datamodel.workqueue.WorkQueueWorkerShim;
import com.google.common.util.concurrent.ListenableFuture;
import defpackage.askm;
import defpackage.caxn;
import defpackage.cbbi;
import defpackage.cbbj;
import defpackage.cbcy;
import defpackage.cbcz;
import defpackage.cbkt;
import defpackage.ehli;
import defpackage.eigp;
import defpackage.eiiy;
import defpackage.eiju;
import defpackage.eijx;
import defpackage.ejvr;
import defpackage.ekrg;
import defpackage.eoqg;
import defpackage.eygg;
import defpackage.pzs;
import defpackage.qao;
import defpackage.qaq;
import j$.util.function.Function$CC;
import java.util.Date;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class WorkQueueWorkerShim extends qaq {
    public static final ekrg e = ekrg.c("com/google/android/apps/messaging/shared/datamodel/workqueue/WorkQueueWorkerShim");
    public final eygg f;
    private final eygg g;
    private final eigp h;
    private final cbbj i;
    private final askm j;

    /* compiled from: PG */
    public interface a {
        askm az();

        eigp b();

        cbbj bO();

        eygg eR();

        eygg eS();
    }

    public WorkQueueWorkerShim(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        a aVar = (a) ehli.a(context, a.class);
        this.g = aVar.eS();
        this.h = aVar.b();
        this.f = aVar.eR();
        this.i = aVar.bO();
        this.j = aVar.az();
    }

    private static String c(pzs pzsVar, String str, String str2) {
        String strD = pzsVar.d(str);
        return strD == null ? str2 : strD;
    }

    @Override // defpackage.qaq
    public final /* synthetic */ ListenableFuture b() {
        AutoCloseable autoCloseableK;
        pzs pzsVarF = f();
        cbbj cbbjVar = this.i;
        synchronized (cbbjVar.d) {
            cbbjVar.e.add(new cbbi(cbbjVar.b.f().toEpochMilli(), 2, pzsVarF));
        }
        pzs pzsVarF2 = f();
        if (pzsVarF2 == null) {
            return eijx.e(new qao());
        }
        try {
            autoCloseableK = this.h.c("WorkQueueWorkerShim#startWork", "com/google/android/apps/messaging/shared/datamodel/workqueue/WorkQueueWorkerShim", "getRootOrSpanTrace", 63);
        } catch (IllegalStateException unused) {
            eiiy.e();
            autoCloseableK = eiiy.k("WorkQueueWorkerShim#startWork");
        }
        try {
            final String strC = c(pzsVarF2, "worker_type", "__UNKNOWN_TYPE");
            ((cbcz) this.f.b()).d(strC, cbcy.NOT_SCHEDULED, g());
            eiju eijuVarH = (this.j.a() ? ((cbkt) this.g.b()).a("WorkManager", new caxn(c(pzsVarF2, "worker_type", "__UNKNOWN_TYPE"), c(pzsVarF2, "handler_name", "__UNKNOWN_HANDLER"))) : ((cbkt) this.g.b()).b("WorkManager", c(pzsVarF2, "worker_type", "__UNKNOWN_TYPE"))).h(new ejvr() { // from class: cbmi
                @Override // defpackage.ejvr
                public final Object apply(Object obj) {
                    qao qaoVar;
                    cbks cbksVar = (cbks) obj;
                    ekrw ekrwVarG = WorkQueueWorkerShim.e.g();
                    ekrwVarG.X(eksq.a, "BugleWorkQueue");
                    ekrd ekrdVar = (ekrd) ((ekrd) ekrwVarG).h("com/google/android/apps/messaging/shared/datamodel/workqueue/WorkQueueWorkerShim", "startWork", 87, "WorkQueueWorkerShim.java");
                    final String str = strC;
                    ekrdVar.D("completed work for %s; retry status is %s", str, cbksVar);
                    WorkQueueWorkerShim workQueueWorkerShim = this.a;
                    if (cbksVar != cbks.CONTINUE) {
                        return cbksVar == cbks.RETRY ? new qan() : new qao();
                    }
                    cbfd cbfdVarA = cbfi.a();
                    cbfdVarA.A("recordWorkManagerWorkStarted");
                    cbfdVarA.e(new Function() { // from class: cbmj
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo536andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj2) {
                            cbfh cbfhVar = (cbfh) obj2;
                            cbfhVar.g(str);
                            Date date = new Date(0L);
                            int iIntValue = cbfi.c().intValue();
                            if (iIntValue < 46070) {
                                dqru.x("minimum_start_time", iIntValue);
                            }
                            cbfhVar.ap(new dqpj("work_queue.minimum_start_time", 1, Long.valueOf(barp.a(date))));
                            return cbfhVar;
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    });
                    cbei cbeiVar = (cbei) cbfdVarA.b().p();
                    try {
                        cbdg cbdgVar = (cbdg) cbeiVar.cS();
                        if (cbdgVar == null) {
                            qaoVar = new qao();
                        } else {
                            try {
                                ((cbcz) workQueueWorkerShim.f.b()).b(cbdgVar);
                                qaoVar = new qao();
                            } catch (cayx e2) {
                                throw new AssertionError("Unhandled exception", e2);
                            }
                        }
                        cbeiVar.close();
                        return qaoVar;
                    } catch (Throwable th) {
                        try {
                            cbeiVar.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                }
            }, eoqg.a);
            autoCloseableK.close();
            return eijuVarH;
        } catch (Throwable th) {
            try {
                autoCloseableK.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
