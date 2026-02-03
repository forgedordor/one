package com.google.android.apps.messaging.shared.datamodel.action;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.ArrayMap;
import com.google.android.apps.messaging.shared.datamodel.action.GenericWorkerQueueAction;
import com.google.android.apps.messaging.shared.datamodel.action.common.ThrottledAction;
import com.google.common.util.concurrent.ListenableFuture;
import defpackage.auwa;
import defpackage.axoz;
import defpackage.axpa;
import defpackage.aypc;
import defpackage.bppd;
import defpackage.bpqf;
import defpackage.bpqx;
import defpackage.bpra;
import defpackage.bprd;
import defpackage.bpre;
import defpackage.bprf;
import defpackage.byfb;
import defpackage.byfc;
import defpackage.byfd;
import defpackage.byfv;
import defpackage.cczv;
import defpackage.cdag;
import defpackage.cogw;
import defpackage.cqaz;
import defpackage.cqbd;
import defpackage.cqce;
import defpackage.csr;
import defpackage.css;
import defpackage.ecem;
import defpackage.eieu;
import defpackage.eiiy;
import defpackage.eiju;
import defpackage.eijx;
import defpackage.ejvr;
import defpackage.ejxr;
import defpackage.ekgb;
import defpackage.ekoe;
import defpackage.elgm;
import defpackage.eooy;
import defpackage.eooz;
import defpackage.eoqg;
import defpackage.eosc;
import defpackage.eygg;
import defpackage.fcsu;
import j$.util.Collection;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntFunction;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class GenericWorkerQueueAction extends ThrottledAction {
    public final Context i;
    public final fcsu j;
    public final fcsu k;
    public final eosc l;
    public final eygg m;
    public final cogw n;
    public final ekgb o;
    private Collection p;
    private Collection q;
    public static final Object a = new Object();
    public static final Set b = new css();
    public static final Map c = new ArrayMap();
    public static final cqce d = cqce.g("BugleJobs", "GenericWorkerQueueAction");
    static final cczv e = cdag.p(144800135);
    static final cczv f = cdag.p(150235497);
    static final cczv g = cdag.n(153002503);
    static final cczv h = cdag.q(162272678, "enable_propagating_async_work_future");
    public static final Parcelable.Creator<ThrottledAction> CREATOR = new axoz();

    /* compiled from: PG */
    public interface a {
        axpa hK();
    }

    public GenericWorkerQueueAction(Context context, fcsu fcsuVar, fcsu fcsuVar2, byfd byfdVar, eosc eoscVar, eygg eyggVar, cogw cogwVar) {
        super(elgm.GENERIC_WORKER_QUEUE_ACTION);
        this.i = context;
        this.j = fcsuVar;
        this.k = fcsuVar2;
        this.l = eoscVar;
        this.m = eyggVar;
        this.n = cogwVar;
        this.o = byfdVar.a();
        M();
    }

    private final void M() {
        this.p = new ArrayList();
        this.q = new ArrayList();
        ekgb ekgbVar = this.o;
        if (ekgbVar == null || ekgbVar.isEmpty()) {
            return;
        }
        int i = ((ekoe) ekgbVar).c;
        for (int i2 = 0; i2 < i; i2++) {
            byfc byfcVar = (byfc) ekgbVar.get(i2);
            if (byfcVar instanceof byfb) {
                this.q.add((byfb) byfcVar);
            } else {
                this.p.add(byfcVar);
            }
        }
    }

    public static void n(ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (!b.add(((bppd) it.next()).q())) {
                it.remove();
            }
        }
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.ThrottledAction, com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final eieu a() {
        return eiiy.k("GenericWorkerQueueAction");
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final String c() {
        return "Bugle.DataModel.Action.GenericWorkerQueueAction.ExecuteAction.Latency";
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action, android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.ThrottledAction
    public final int f() {
        return 302;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.ThrottledAction
    public final long g() {
        return 50L;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.ThrottledAction
    public final String h() {
        return "GenericWorkerQueueAction";
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.ThrottledAction
    public final eiju k() {
        final ArrayList arrayList;
        bprd bprdVar;
        ecem.b();
        synchronized (a) {
            fcsu fcsuVar = this.k;
            ((byfv) fcsuVar.b()).b();
            final byfv byfvVar = (byfv) fcsuVar.b();
            final int iA = aypc.a();
            cqaz.h();
            arrayList = new ArrayList((List) byfvVar.c.c("WorkerDatabaseOperations#getNextGenericWorkerQueueBatch", new ejxr() { // from class: byfk
                @Override // defpackage.ejxr
                public final Object get() {
                    bpra bpraVarA = bprf.a();
                    bpraVarA.A("+getNextGenericWorkerQueueBatch");
                    byfv byfvVar2 = byfvVar;
                    bpre bpreVarA = byfvVar2.a(iA);
                    bpreVarA.f(byfvVar2.b.f().toEpochMilli());
                    bpraVarA.k(new bprd(bpreVarA));
                    bpraVarA.c(new bpqx(bprf.c.g));
                    bpraVarA.y(10);
                    final ekgb ekgbVarZ = bpraVarA.b().z();
                    if (!ekgbVarZ.isEmpty()) {
                        bprc bprcVar = new bprc();
                        bprcVar.ap("getNextGenericWorkerQueueBatch");
                        bprcVar.ak();
                        bprcVar.c(true);
                        bprcVar.d(new Function() { // from class: byfg
                            @Override // java.util.function.Function
                            /* renamed from: andThen */
                            public final /* synthetic */ Function mo536andThen(Function function) {
                                return Function$CC.$default$andThen(this, function);
                            }

                            @Override // java.util.function.Function
                            public final Object apply(Object obj) {
                                bpre bpreVar = (bpre) obj;
                                cqce cqceVar = byfv.a;
                                bpreVar.c((String[]) Collection.EL.stream(ekgbVarZ).map(new byff()).toArray(new IntFunction() { // from class: byfm
                                    @Override // java.util.function.IntFunction
                                    public final Object apply(int i) {
                                        cqce cqceVar2 = byfv.a;
                                        return new String[i];
                                    }
                                }));
                                return bpreVar;
                            }

                            public final /* synthetic */ Function compose(Function function) {
                                return Function$CC.$default$compose(this, function);
                            }
                        });
                        bprcVar.a().e();
                    }
                    return ekgbVarZ;
                }
            }));
            n(arrayList);
        }
        if (!arrayList.isEmpty()) {
            cqbd cqbdVarC = d.c();
            cqbdVarC.I("Work found");
            cqbdVarC.r();
            if (((Boolean) h.e()).booleanValue()) {
                return eijx.h(new eooy() { // from class: axos
                    @Override // defpackage.eooy
                    public final ListenableFuture a() {
                        return this.a.l(arrayList);
                    }
                }, m()).h(new ejvr() { // from class: axot
                    @Override // defpackage.ejvr
                    public final Object apply(Object obj) {
                        cqbd cqbdVarD = GenericWorkerQueueAction.d.d();
                        cqbdVarD.I("Work done");
                        cqbdVarD.r();
                        return null;
                    }
                }, eoqg.a);
            }
            auwa.a(new Runnable() { // from class: axou
                @Override // java.lang.Runnable
                public final void run() {
                    this.a.l(arrayList).k(auvh.c(new Consumer() { // from class: axoq
                        @Override // java.util.function.Consumer
                        /* renamed from: accept */
                        public final void z(Object obj) {
                            cqbd cqbdVarD = GenericWorkerQueueAction.d.d();
                            cqbdVarD.I("Work done");
                            cqbdVarD.r();
                        }

                        public final /* synthetic */ Consumer andThen(Consumer consumer) {
                            return Consumer$CC.$default$andThen(this, consumer);
                        }
                    }), eoqg.a);
                }
            }, m());
        } else if (((Boolean) e.e()).booleanValue()) {
            if (((Boolean) f.e()).booleanValue()) {
                bpre bpreVarA = ((byfv) this.k.b()).a(aypc.a());
                bpreVarA.e();
                bprdVar = new bprd(bpreVarA);
            } else {
                String[] strArr = bprf.a;
                bpre bpreVar = new bpre();
                bpreVar.e();
                bpreVar.d(false);
                bpreVar.i(aypc.a());
                bprdVar = new bprd(bpreVar);
            }
            bpra bpraVarA = bprf.a();
            bpraVarA.A("+scheduleFutureWorkItemsIfAny");
            bpraVarA.k(bprdVar);
            bpraVarA.c(new bpqx(bprf.c.i));
            bpraVarA.y(1);
            bpqf bpqfVar = (bpqf) bpraVarA.b().p();
            try {
                if (bpqfVar.moveToFirst()) {
                    bppd bppdVar = (bppd) bpqfVar.cQ();
                    bppdVar.aA(8, "next_execute_timestamp");
                    long j = bppdVar.i;
                    cogw cogwVar = this.n;
                    long epochMilli = (j - cogwVar.f().toEpochMilli()) + 10;
                    d.p(String.format(Locale.US, "Found next future work at timestamp %d, scheduling in %d", Long.valueOf(j), Long.valueOf(epochMilli)));
                    new GenericWorkerQueueAction(this.i, this.j, this.k, new byfd() { // from class: axoo
                        @Override // defpackage.byfd
                        public final ekgb a() {
                            return this.a.o;
                        }
                    }, this.l, this.m, cogwVar).w(Math.max(epochMilli, 0L));
                } else {
                    cqbd cqbdVarC2 = d.c();
                    cqbdVarC2.I("Bailing early, no work found, no failed work found");
                    cqbdVarC2.r();
                }
                bpqfVar.close();
            } finally {
            }
        }
        return eijx.e(null);
    }

    public final eiju l(final List list) {
        Map mapB;
        ecem.b();
        HashMap map = new HashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            map.put(((bppd) it.next()).q(), eijx.e(true));
        }
        for (byfb byfbVar : this.q) {
            Set setC = byfbVar.c(list);
            if (!setC.isEmpty()) {
                try {
                    mapB = byfbVar.b(list);
                } catch (Exception e2) {
                    d.s("Couldn't process batch.", e2);
                    mapB = null;
                }
                if (mapB != null) {
                    for (final Map.Entry entry : mapB.entrySet()) {
                        final String str = (String) entry.getKey();
                        eiju eijuVar = (eiju) map.get(str);
                        eooz eoozVar = new eooz() { // from class: axov
                            @Override // defpackage.eooz
                            public final ListenableFuture a(Object obj) {
                                Object obj2 = GenericWorkerQueueAction.a;
                                return ((Boolean) obj).booleanValue() ? (ListenableFuture) entry.getValue() : eijx.e(false);
                            }
                        };
                        eoqg eoqgVar = eoqg.a;
                        map.put(str, eijuVar.i(eoozVar, eoqgVar).e(Exception.class, new ejvr() { // from class: axow
                            @Override // defpackage.ejvr
                            public final Object apply(Object obj) {
                                cqbd cqbdVarE = GenericWorkerQueueAction.d.e();
                                cqbdVarE.I("BatchWorker failed to process workItem: ");
                                cqbdVarE.I(str);
                                cqbdVarE.s((Exception) obj);
                                return false;
                            }
                        }, eoqgVar));
                    }
                } else {
                    csr csrVar = new csr((css) setC);
                    while (csrVar.hasNext()) {
                        map.put((String) csrVar.next(), eijx.e(false));
                    }
                }
            }
        }
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            final bppd bppdVar = (bppd) it2.next();
            eiju eijuVarI = (eiju) map.get(bppdVar.q());
            cqbd cqbdVarD = d.d();
            cqbdVarD.I("Processing workitem for ");
            cqbdVarD.I(bppdVar.r());
            cqbdVarD.I(" - ");
            cqbdVarD.G(bppdVar.m());
            cqbdVarD.I(" in generic worker queue.");
            cqbdVarD.r();
            for (final byfc byfcVar : this.p) {
                eijuVarI = eijuVarI.i(new eooz() { // from class: axox
                    @Override // defpackage.eooz
                    public final ListenableFuture a(Object obj) {
                        Boolean bool = (Boolean) obj;
                        Object obj2 = GenericWorkerQueueAction.a;
                        if (bool.booleanValue()) {
                            bppd bppdVar2 = bppdVar;
                            byfc byfcVar2 = byfcVar;
                            if (byfcVar2.d(bppdVar2)) {
                                return byfcVar2.a(bppdVar2);
                            }
                        }
                        return eijx.e(bool);
                    }
                }, m());
            }
            ejvr ejvrVar = new ejvr() { // from class: axok
                @Override // defpackage.ejvr
                public final Object apply(Object obj) {
                    cqbd cqbdVarE = GenericWorkerQueueAction.d.e();
                    cqbdVarE.I("Couldn't process item: ");
                    cqbdVarE.I(bppdVar.q());
                    cqbdVarE.s((Exception) obj);
                    return false;
                }
            };
            eoqg eoqgVar2 = eoqg.a;
            map.put(bppdVar.q(), eijuVarI.e(Exception.class, ejvrVar, eoqgVar2).h(new ejvr() { // from class: axol
                /* JADX WARN: Removed duplicated region for block: B:40:0x0186  */
                @Override // defpackage.ejvr
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object apply(java.lang.Object r13) {
                    /*
                        Method dump skipped, instructions count: 409
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: defpackage.axol.apply(java.lang.Object):java.lang.Object");
                }
            }, m()).e(Exception.class, new ejvr() { // from class: axom
                @Override // defpackage.ejvr
                public final Object apply(Object obj) {
                    cqbd cqbdVarE = GenericWorkerQueueAction.d.e();
                    cqbdVarE.I("Couldn't re-enqueue or delete item: ");
                    cqbdVarE.I(bppdVar.q());
                    cqbdVarE.s((Exception) obj);
                    return false;
                }
            }, eoqgVar2));
        }
        return eijx.l(map.values()).a(new Callable() { // from class: axon
            @Override // java.util.concurrent.Callable
            public final Object call() {
                List list2 = list;
                synchronized (GenericWorkerQueueAction.a) {
                    Iterator it3 = list2.iterator();
                    while (it3.hasNext()) {
                        GenericWorkerQueueAction.b.remove(((bppd) it3.next()).q());
                    }
                }
                if (list2.isEmpty()) {
                    return null;
                }
                final GenericWorkerQueueAction genericWorkerQueueAction = this.a;
                cqbd cqbdVarC = GenericWorkerQueueAction.d.c();
                cqbdVarC.I("Rescheduling immediately to continue processing since we didn't yet reach the end.");
                cqbdVarC.r();
                byfd byfdVar = new byfd() { // from class: axor
                    @Override // defpackage.byfd
                    public final ekgb a() {
                        return genericWorkerQueueAction.o;
                    }
                };
                Context context = genericWorkerQueueAction.i;
                eosc eoscVar = genericWorkerQueueAction.l;
                new GenericWorkerQueueAction(context, genericWorkerQueueAction.j, genericWorkerQueueAction.k, byfdVar, eoscVar, genericWorkerQueueAction.m, genericWorkerQueueAction.n).w(1L);
                return null;
            }
        }, m());
    }

    public final Executor m() {
        return ((Boolean) g.e()).booleanValue() ? (Executor) this.m.b() : this.l;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.ThrottledAction, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C(parcel, i);
    }

    public GenericWorkerQueueAction(Context context, fcsu fcsuVar, fcsu fcsuVar2, byfd byfdVar, eosc eoscVar, eygg eyggVar, cogw cogwVar, Parcel parcel) {
        super(parcel, elgm.GENERIC_WORKER_QUEUE_ACTION);
        this.i = context;
        this.j = fcsuVar;
        this.k = fcsuVar2;
        this.l = eoscVar;
        this.m = eyggVar;
        this.n = cogwVar;
        this.o = byfdVar.a();
        M();
    }
}
