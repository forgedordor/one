package defpackage;

import android.content.Context;
import androidx.car.app.hardware.info.EnergyProfile;
import com.google.android.apps.messaging.shared.datamodel.workqueue.WorkQueueWorkerShim;
import j$.time.Duration;
import j$.util.Map;
import j$.util.Optional;
import j$.util.function.Function$CC;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cbdd implements cbcz {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/datamodel/workqueue/WorkQueueSchedulerImpl");
    private final Context b;
    private final cogw c;
    private final eosc d;
    private final fcsu e;
    private final fcsu f;
    private final cbku g;
    private final askm h;
    private final Map i = new HashMap();
    private final Object j = new Object();

    public cbdd(Context context, cogw cogwVar, eosc eoscVar, fcsu fcsuVar, fcsu fcsuVar2, cbku cbkuVar, askm askmVar) {
        this.b = context;
        this.c = cogwVar;
        this.d = eoscVar;
        this.e = fcsuVar;
        this.f = fcsuVar2;
        this.g = cbkuVar;
        this.h = askmVar;
    }

    @Override // defpackage.cbcz
    public final eiju a(cbdg cbdgVar) {
        String str;
        String str2;
        String str3;
        String strQ = cbdgVar.q();
        String strR = cbdgVar.r();
        ekrw ekrwVarG = a.g();
        ekrz ekrzVar = eksq.a;
        ekrwVarG.X(ekrzVar, "BugleWorkQueue");
        ekrd ekrdVar = (ekrd) ekrwVarG;
        ekrdVar.X(cbpp.c, Long.valueOf(cbdgVar.m()));
        ekrdVar.X(cbpp.d, strR);
        ((ekrd) ekrdVar.h("com/google/android/apps/messaging/shared/datamodel/workqueue/WorkQueueSchedulerImpl", "launchExecutorAndWorkManager", 86, "WorkQueueSchedulerImpl.java")).q("launchExecutorAndWorkManager");
        if (cbdgVar.s().getTime() == 0) {
            cazg cazgVarC = ((cbaz) this.f.b()).c(strR);
            if (this.h.a()) {
                cbku cbkuVar = this.g;
                caxn caxnVar = new caxn(strQ, strR);
                caya cayaVarA = cazgVarC.a();
                cayaVarA.m();
                ekrg ekrgVar = cbku.a;
                str2 = "com/google/android/apps/messaging/shared/datamodel/workqueue/WorkQueueSchedulerImpl";
                ekrw ekrwVarG2 = ekrgVar.g();
                ekrwVarG2.X(ekrzVar, "BugleWorkQueue");
                ekrd ekrdVar2 = (ekrd) ekrwVarG2;
                str3 = "WorkQueueSchedulerImpl.java";
                ekrz ekrzVar2 = cbpp.g;
                str = strR;
                caze cazeVar = ((caxl) cayaVarA).b;
                ekrdVar2.X(ekrzVar2, cazeVar);
                ((ekrd) ekrdVar2.h("com/google/android/apps/messaging/shared/datamodel/workqueue/WorkQueueWorkerExecutor", "launch", 55, "WorkQueueWorkerExecutor.java")).q("launchExecutorAndWorkManager");
                if (cazeVar != caze.WORKMANAGER_ONLY) {
                    ekrw ekrwVarG3 = ekrgVar.g();
                    ekrwVarG3.X(ekrzVar, "BugleWorkQueue");
                    ekrd ekrdVar3 = (ekrd) ekrwVarG3;
                    String str4 = caxnVar.a;
                    ekrdVar3.X(cbpp.b, str4);
                    ((ekrd) ekrdVar3.h("com/google/android/apps/messaging/shared/datamodel/workqueue/WorkQueueWorkerExecutor", "submit", 67, "WorkQueueWorkerExecutor.java")).q("submit to executor");
                    ((cbbj) cbkuVar.c.b()).b(str4);
                    cbkuVar.a(((cbkt) cbkuVar.b.b()).a("Executor", caxnVar), cayaVarA, cazeVar);
                }
            } else {
                str = strR;
                str2 = "com/google/android/apps/messaging/shared/datamodel/workqueue/WorkQueueSchedulerImpl";
                str3 = "WorkQueueSchedulerImpl.java";
                cbku cbkuVar2 = this.g;
                caya cayaVarA2 = cazgVarC.a();
                cayaVarA2.m();
                ekrg ekrgVar2 = cbku.a;
                ekrw ekrwVarG4 = ekrgVar2.g();
                ekrwVarG4.X(ekrzVar, "BugleWorkQueue");
                ekrd ekrdVar4 = (ekrd) ekrwVarG4;
                ekrz ekrzVar3 = cbpp.g;
                caze cazeVar2 = ((caxl) cayaVarA2).b;
                ekrdVar4.X(ekrzVar3, cazeVar2);
                ((ekrd) ekrdVar4.h("com/google/android/apps/messaging/shared/datamodel/workqueue/WorkQueueWorkerExecutor", "launch", 42, "WorkQueueWorkerExecutor.java")).q("launchExecutorAndWorkManager");
                if (cazeVar2 != caze.WORKMANAGER_ONLY) {
                    ekrw ekrwVarG5 = ekrgVar2.g();
                    ekrwVarG5.X(ekrzVar, "BugleWorkQueue");
                    ekrd ekrdVar5 = (ekrd) ekrwVarG5;
                    ekrdVar5.X(cbpp.b, strQ);
                    ((ekrd) ekrdVar5.h("com/google/android/apps/messaging/shared/datamodel/workqueue/WorkQueueWorkerExecutor", "submit", 73, "WorkQueueWorkerExecutor.java")).q("submit to executor");
                    ((cbbj) cbkuVar2.c.b()).b(strQ);
                    cbkuVar2.a(((cbkt) cbkuVar2.b.b()).b("Executor", strQ), cayaVarA2, cazeVar2);
                }
            }
        } else {
            str = strR;
            str2 = "com/google/android/apps/messaging/shared/datamodel/workqueue/WorkQueueSchedulerImpl";
            str3 = "WorkQueueSchedulerImpl.java";
        }
        try {
            return b(cbdgVar);
        } catch (cayx e) {
            ekrw ekrwVarI = a.i();
            ekrwVarI.X(eksq.a, "BugleWorkQueue");
            ekrd ekrdVar6 = (ekrd) ekrwVarI;
            ekrdVar6.X(cbpp.d, str);
            ((ekrd) ekrdVar6.h(str2, "launchExecutorAndWorkManager", EnergyProfile.EVCONNECTOR_TYPE_OTHER, str3)).q("dropping work due to scheduling exception");
            throw new IllegalStateException("found invalid row", e);
        }
    }

    @Override // defpackage.cbcz
    public final eiju b(final cbdg cbdgVar) {
        String str;
        final String strQ = cbdgVar.q();
        if (strQ == null) {
            throw new cayx();
        }
        final String strR = cbdgVar.r();
        try {
            caya cayaVarA = ((cbaz) this.f.b()).c(strR).a();
            qau qauVar = new qau(WorkQueueWorkerShim.class);
            qauVar.d(strQ);
            if (cbdgVar.s().getTime() > 0) {
                Duration durationOfMillis = Duration.ofMillis(cbdgVar.s().getTime() - this.c.f().toEpochMilli());
                if (durationOfMillis.toMillis() > 0) {
                    qauVar.i(durationOfMillis);
                }
            }
            if (this.h.a()) {
                pzn pznVar = new pzn();
                pznVar.e("worker_type", strQ);
                pznVar.e("handler_name", strR);
                qauVar.j(pznVar.a());
            } else {
                pzn pznVar2 = new pzn();
                pznVar2.e("worker_type", strQ);
                qauVar.j(pznVar2.a());
            }
            caxl caxlVar = (caxl) cayaVarA;
            pzj pzjVar = caxlVar.a;
            if (pzjVar != null) {
                qauVar.g(pzjVar);
            }
            if (pzjVar == null || !pzjVar.d) {
                qauVar.f(caxlVar.f, caxlVar.e, TimeUnit.MILLISECONDS);
            }
            final qav qavVar = (qav) qauVar.b();
            if (cbdgVar.s().getTime() == 0) {
                if (d(strQ, cbcy.SCHEDULED, qavVar.a)) {
                    ekrw ekrwVarG = a.g();
                    ekrwVarG.X(eksq.a, "BugleWorkQueue");
                    ekrd ekrdVar = (ekrd) ekrwVarG;
                    ekrdVar.X(cbpp.c, Long.valueOf(cbdgVar.m()));
                    ekrdVar.X(cbpp.b, strQ);
                    ekrdVar.X(cbpp.d, strR);
                    ((ekrd) ekrdVar.h("com/google/android/apps/messaging/shared/datamodel/workqueue/WorkQueueSchedulerImpl", "launchToWorkManager", 219, "WorkQueueSchedulerImpl.java")).q("skipping wm scheduling");
                    String[] strArr = cbfi.a;
                    cbff cbffVar = new cbff();
                    cbffVar.ap("launchToWorkManager");
                    cbffVar.d();
                    cbffVar.c(cbdgVar.m());
                    return eijx.e(qba.a);
                }
            }
            ekrw ekrwVarG2 = a.g();
            ekrwVarG2.X(eksq.a, "BugleWorkQueue");
            ekrd ekrdVar2 = (ekrd) ekrwVarG2;
            ekrdVar2.X(cbpp.c, Long.valueOf(cbdgVar.m()));
            ekrdVar2.X(cbpp.b, strQ);
            ekrdVar2.X(cbpp.d, strR);
            ((ekrd) ekrdVar2.h("com/google/android/apps/messaging/shared/datamodel/workqueue/WorkQueueSchedulerImpl", "launchToWorkManager", 233, "WorkQueueSchedulerImpl.java")).q("scheduling in wm");
            cbbj cbbjVar = (cbbj) this.e.b();
            synchronized (cbbjVar.d) {
                try {
                    cbbjVar.e.add(new cbbi(cbbjVar.b.f().toEpochMilli(), 4, cbdgVar));
                } catch (Throwable th) {
                    th = th;
                    while (true) {
                        try {
                            throw th;
                        } catch (Throwable th2) {
                            th = th2;
                        }
                    }
                }
            }
            qbr qbrVarA = qbq.a(this.b);
            if (cbdgVar.s().getTime() == 0) {
                str = "";
            } else {
                str = "-" + cbdgVar.s().getTime();
            }
            eiju eijuVarG = eiju.g(((qbb) qbrVarA.j(strQ.concat(str), pzz.d, qavVar).a()).c);
            String[] strArr2 = cbfi.a;
            cbff cbffVar2 = new cbff();
            cbffVar2.ap("WorkQueueSchedulerImpl#launchToWorkManager1");
            Optional optionalOf = Optional.of(qavVar.a);
            int iIntValue = cbfi.c().intValue();
            int iIntValue2 = cbfi.c().intValue();
            if (iIntValue2 < 46060) {
                dqru.x("workmanager_id", iIntValue2);
            }
            if (iIntValue >= 46060) {
                cbffVar2.a.put("workmanager_id", basg.b(optionalOf));
            }
            cbffVar2.c(cbdgVar.m());
            return eijuVarG.h(new ejvr() { // from class: cbda
                @Override // defpackage.ejvr
                public final Object apply(Object obj) {
                    qay qayVar = (qay) obj;
                    ekrw ekrwVarG3 = cbdd.a.g();
                    ekrwVarG3.X(eksq.a, "BugleWorkQueue");
                    ekrd ekrdVar3 = (ekrd) ekrwVarG3;
                    cbdg cbdgVar2 = cbdgVar;
                    ekrdVar3.X(cbpp.c, Long.valueOf(cbdgVar2.m()));
                    ekrz ekrzVar = cbpp.b;
                    String str2 = strQ;
                    ekrdVar3.X(ekrzVar, str2);
                    ekrdVar3.X(cbpp.d, strR);
                    ((ekrd) ekrdVar3.h("com/google/android/apps/messaging/shared/datamodel/workqueue/WorkQueueSchedulerImpl", "launchToWorkManager", 262, "WorkQueueSchedulerImpl.java")).q("confirmed from wm");
                    String[] strArr3 = cbfi.a;
                    cbff cbffVar3 = new cbff();
                    cbffVar3.ap("WorkQueueSchedulerImpl#launchToWorkManager2");
                    cbffVar3.d();
                    cbffVar3.c(cbdgVar2.m());
                    this.a.d(str2, cbcy.PERSISTED, qavVar.a);
                    return qayVar;
                }
            }, this.d);
        } catch (IllegalArgumentException e) {
            throw new cayx(e);
        }
    }

    @Override // defpackage.cbcz
    public final /* synthetic */ Optional c(cbdg cbdgVar) {
        return Optional.empty();
    }

    @Override // defpackage.cbcz
    public final boolean d(String str, cbcy cbcyVar, UUID uuid) {
        synchronized (this.j) {
            Map map = (Map) Map.EL.computeIfAbsent(this.i, str, new Function() { // from class: cbdb
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return new HashMap();
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            ekrw ekrwVarG = a.g();
            ekrwVarG.X(eksq.a, "BugleWorkQueue");
            ekrd ekrdVar = (ekrd) ekrwVarG;
            ekrdVar.X(cbpp.b, str);
            ekrdVar.X(cbpp.e, uuid);
            ekrdVar.X(cbpp.f, cbcyVar);
            ((ekrd) ekrdVar.h("com/google/android/apps/messaging/shared/datamodel/workqueue/WorkQueueSchedulerImpl", "getAndSetScheduledInWorkManager", 120, "WorkQueueSchedulerImpl.java")).q("set execution state");
            cbcy cbcyVar2 = cbcy.SCHEDULED;
            boolean z = map.containsValue(cbcyVar2) || map.containsValue(cbcy.PERSISTED);
            if (z && cbcyVar == cbcyVar2) {
                return true;
            }
            cbcy cbcyVar3 = (cbcy) Map.EL.computeIfAbsent(map, uuid, new Function() { // from class: cbdc
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return cbcy.NOT_SCHEDULED;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            int iOrdinal = cbcyVar.ordinal();
            if (iOrdinal == 0) {
                map.remove(uuid);
            } else if (iOrdinal != 1) {
                if (iOrdinal == 2 && cbcyVar3 == cbcyVar2) {
                    map.put(uuid, cbcy.PERSISTED);
                }
            } else if (cbcyVar3 == cbcy.NOT_SCHEDULED) {
                map.put(uuid, cbcyVar2);
            }
            return z;
        }
    }
}
