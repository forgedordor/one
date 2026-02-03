package defpackage;

import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;
import j$.util.function.Function$CC;
import java.util.Map;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class casr extends cmwg {
    final /* synthetic */ fcsu a;
    final /* synthetic */ fcsu b;
    final /* synthetic */ fcsu c;
    final /* synthetic */ fcsu d;
    final /* synthetic */ fcsu e;
    final /* synthetic */ eosc f;

    public casr(fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4, fcsu fcsuVar5, eosc eoscVar) {
        this.a = fcsuVar;
        this.b = fcsuVar2;
        this.c = fcsuVar3;
        this.d = fcsuVar4;
        this.e = fcsuVar5;
        this.f = eoscVar;
    }

    @Override // defpackage.cohg
    public final eieu a() {
        return eiiy.k("GwqWorkerStartupTask");
    }

    @Override // defpackage.cmwg
    public final eiju b() {
        final fcsu fcsuVar = this.a;
        final fcsu fcsuVar2 = this.b;
        final fcsu fcsuVar3 = this.c;
        final fcsu fcsuVar4 = this.d;
        final fcsu fcsuVar5 = this.e;
        return eijx.f(new Runnable() { // from class: casq
            @Override // java.lang.Runnable
            public final void run() {
                fcsu fcsuVar6 = fcsuVar;
                byfv byfvVar = (byfv) fcsuVar6.b();
                eieu eieuVarK = eiiy.k("WorkerDatabaseOperations#clearAllInFlightWorkItems");
                try {
                    cqaz.h();
                    byfvVar.d.e();
                    eieuVarK.close();
                    final int iA = aypc.a();
                    eieu eieuVarK2 = eiiy.k("WorkerDatabaseOperations#decrementRetryCountOfMaxRetriedBackupWork");
                    try {
                        ecem.b();
                        String[] strArr = bprf.a;
                        bprc bprcVar = new bprc();
                        bprcVar.ap("decrementRetryCountOfMaxRetriedBackupWork");
                        bprcVar.a.put("retry_count", Integer.valueOf(iA - 1));
                        bprcVar.d(new Function() { // from class: byfr
                            @Override // java.util.function.Function
                            /* renamed from: andThen */
                            public final /* synthetic */ Function mo536andThen(Function function) {
                                return Function$CC.$default$andThen(this, function);
                            }

                            @Override // java.util.function.Function
                            public final Object apply(Object obj) {
                                bpre bpreVar = (bpre) obj;
                                cqce cqceVar = byfv.a;
                                bpreVar.k(32, 64, 128);
                                bpreVar.g(iA);
                                return bpreVar;
                            }

                            public final /* synthetic */ Function compose(Function function) {
                                return Function$CC.$default$compose(this, function);
                            }
                        });
                        bprcVar.a().e();
                        fcsu fcsuVar7 = fcsuVar3;
                        fcsu fcsuVar8 = fcsuVar2;
                        eieuVarK2.close();
                        ((casm) fcsuVar8.b()).a.set(new casp(fcsuVar7));
                        if (((Boolean) bxig.a.e()).booleanValue()) {
                            bxig bxigVar = (bxig) fcsuVar4.b();
                            if (bxigVar.d.compareAndSet(false, true)) {
                                ((eksl) ((eksl) bxig.b.h()).h("com/google/android/apps/messaging/shared/datamodel/observer/TableContentChangeObserver", ConversationSuggestion.SUGGESTION_PROPERTY_CALENDAR_START_TIME, 129, "TableContentChangeObserver.java")).q("Starts to observe table change.");
                                ((brdp) bxigVar.e.get()).M(new bxic(bxigVar));
                                ((bosz) bxigVar.f.get()).M(new bxhw(bxigVar));
                                ((bsbm) bxigVar.g.get()).M(new bxif(bxigVar));
                                ((bpzr) bxigVar.h.get()).M(new bxhz(bxigVar));
                            } else {
                                ((eksl) ((eksl) bxig.b.j()).h("com/google/android/apps/messaging/shared/datamodel/observer/TableContentChangeObserver", ConversationSuggestion.SUGGESTION_PROPERTY_CALENDAR_START_TIME, 126, "TableContentChangeObserver.java")).q("Already started table content change observer.");
                            }
                        }
                        ((axpa) fcsuVar7.b()).b().E(Action.t);
                        final int iA2 = aypc.a();
                        eieuVarK2 = eiiy.k("WorkerDatabaseOperations#getNbrOfWorkItemsExceedingMaxRetry");
                        try {
                            cqaz.h();
                            csq csqVar = new csq();
                            bpra bpraVarA = bprf.a();
                            bpraVarA.A("getNbrOfWorkItemsExceedingMaxRetry");
                            Function function = new Function() { // from class: byfi
                                @Override // java.util.function.Function
                                /* renamed from: andThen */
                                public final /* synthetic */ Function mo536andThen(Function function2) {
                                    return Function$CC.$default$andThen(this, function2);
                                }

                                @Override // java.util.function.Function
                                public final Object apply(Object obj) {
                                    cqce cqceVar = byfv.a;
                                    return ((bpqd) obj).b;
                                }

                                public final /* synthetic */ Function compose(Function function2) {
                                    return Function$CC.$default$compose(this, function2);
                                }
                            };
                            bpqd bpqdVar = bprf.c;
                            bpqe[] bpqeVarArr = {(bpqe) function.apply(bpqdVar)};
                            int iIntValue = bprf.c().intValue();
                            if (((Integer) bprf.b.getOrDefault(bpqeVarArr[0].toString(), -1)).intValue() > iIntValue) {
                                dqru.x("columnReference.toString()", iIntValue);
                            }
                            bpraVarA.m(bpqeVarArr);
                            bpraVarA.n(new dqxm("COUNT(*)"), "row_count_expression");
                            bpraVarA.d(new Function() { // from class: byfj
                                @Override // java.util.function.Function
                                /* renamed from: andThen */
                                public final /* synthetic */ Function mo536andThen(Function function2) {
                                    return Function$CC.$default$andThen(this, function2);
                                }

                                @Override // java.util.function.Function
                                public final Object apply(Object obj) {
                                    bpre bpreVar = (bpre) obj;
                                    cqce cqceVar = byfv.a;
                                    bpreVar.g(iA2);
                                    return bpreVar;
                                }

                                public final /* synthetic */ Function compose(Function function2) {
                                    return Function$CC.$default$compose(this, function2);
                                }
                            });
                            bpraVarA.w(bpqdVar.b);
                            bpqf bpqfVar = (bpqf) bpraVarA.b().p();
                            while (bpqfVar.moveToNext()) {
                                try {
                                    csqVar.put(Integer.valueOf(bpqfVar.c()), Integer.valueOf(Integer.parseInt(bpqfVar.de("row_count_expression"))));
                                } finally {
                                }
                            }
                            bpqfVar.close();
                            eieuVarK2.close();
                            for (Map.Entry entry : csqVar.entrySet()) {
                                fcsu fcsuVar9 = fcsuVar5;
                                if ((((Integer) entry.getKey()).intValue() & 1) == 1) {
                                    ((ains) fcsuVar9.b()).d("Bugle.GW.Icing.Indexing.Failed", ((Integer) entry.getValue()).intValue());
                                } else if ((((Integer) entry.getKey()).intValue() & 2) == 2) {
                                    ((ains) fcsuVar9.b()).d("Bugle.GW.Run.All.Annotator.Failed", ((Integer) entry.getValue()).intValue());
                                } else if ((((Integer) entry.getKey()).intValue() & 4) == 4) {
                                    ((ains) fcsuVar9.b()).d("Bugle.GW.Address.Annotation.Post.Process.Failed", ((Integer) entry.getValue()).intValue());
                                } else if ((((Integer) entry.getKey()).intValue() & 8) == 8) {
                                    ((ains) fcsuVar9.b()).d("Bugle.GW.Link.Annotation.Post.Process.Failed", ((Integer) entry.getValue()).intValue());
                                } else if ((((Integer) entry.getKey()).intValue() & 16) == 16) {
                                    ((ains) fcsuVar9.b()).d("Bugle.GW.RCS.Flags.Worker.Failed", ((Integer) entry.getValue()).intValue());
                                } else {
                                    ((ains) fcsuVar9.b()).d("Bugle.GW.Unknown.Worker.Failed", ((Integer) entry.getValue()).intValue());
                                }
                            }
                        } finally {
                        }
                    } finally {
                    }
                } finally {
                    try {
                        eieuVarK.close();
                    } catch (Throwable th) {
                        th.addSuppressed(th);
                    }
                }
            }
        }, this.f);
    }

    @Override // defpackage.cmwz
    public final boolean c() {
        return true;
    }
}
