package defpackage;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.PersistableBundle;
import com.android.vcard.VCardConfig;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import com.google.android.apps.messaging.shared.datamodel.action.execution.ActionJobService;
import com.google.android.apps.messaging.shared.datamodel.action.execution.ActionWorkManagerScheduler;
import com.google.android.apps.messaging.shared.datamodel.action.execution.PendingActionReceiver;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.SettableFuture;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ayns implements aymn {
    public static final cczi b = cdag.h(cdag.b, "pwqSchedulingWaitsForAllActions", false);
    private static final cqce d = cqce.g("BugleAction", "ActionSchedulerImpl");
    public final fcsu c;
    private final Context e;
    private final fcsu f;
    private final fcsu g;
    private final fcsu h;
    private final cogw i;

    public ayns(Context context, fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4, cogw cogwVar) {
        this.e = context;
        this.c = fcsuVar;
        this.f = fcsuVar2;
        this.g = fcsuVar3;
        this.h = fcsuVar4;
        this.i = cogwVar;
    }

    private final ListenableFuture k(Action action, Action action2, int i) {
        aymr aymrVar;
        ListenableFuture listenableFutureB = null;
        if (action2 != null && (aymrVar = action2.x) != null && (aymrVar.f == null || !action.fT())) {
            if (aymrVar.c()) {
                cqbd cqbdVarC = d.c();
                cqbdVarC.I("Adding");
                cqbdVarC.I(action.u);
                cqbdVarC.I("after");
                cqbdVarC.I(action2.u);
                cqbdVarC.I("for");
                cqbdVarC.I(aymrVar.b);
                cqbdVarC.r();
            }
            listenableFutureB = aymrVar.b(action);
        }
        if (listenableFutureB != null) {
            return listenableFutureB;
        }
        ListenableFuture listenableFutureB2 = ((aymh) this.c.b()).b(new aymr(action.u, i, null, null, false), action);
        if (listenableFutureB2 != null) {
            return listenableFutureB2;
        }
        cqbd cqbdVarC2 = d.c();
        cqbdVarC2.I(action);
        cqbdVarC2.I("deferred since it was started from unsafe context");
        cqbdVarC2.r();
        g(action, i, 1L);
        return eork.g();
    }

    @Override // defpackage.aymn
    public final PendingIntent a(Context context, Action action, int i, boolean z, Uri uri) {
        return PendingActionReceiver.l(context, action, i, z, VCardConfig.FLAG_CONVERT_PHONETIC_NAME_STRINGS, uri, (ayoe) this.f.b());
    }

    @Override // defpackage.aymn
    public final eiju b(final Action action) {
        if (!((Boolean) b.e()).booleanValue()) {
            return eiju.g(j(action));
        }
        final AtomicReference atomicReference = new AtomicReference();
        return eiju.g(kol.a(new koi() { // from class: aynr
            @Override // defpackage.koi
            public final Object a(final kog kogVar) {
                final AtomicReference atomicReference2 = atomicReference;
                aymq aymqVar = new aymq() { // from class: aynq
                    @Override // defpackage.aymq
                    public final void a() {
                        cczi ccziVar = ayns.b;
                        AtomicReference atomicReference3 = atomicReference2;
                        boolean zIsCancelled = ((ListenableFuture) atomicReference3.get()).isCancelled();
                        kog kogVar2 = kogVar;
                        if (zIsCancelled) {
                            kogVar2.d();
                        }
                        try {
                            kogVar2.b(eork.q((Future) atomicReference3.get()));
                        } catch (Throwable th) {
                            kogVar2.c(th);
                        }
                    }
                };
                Action action2 = action;
                atomicReference2.set(((aymh) this.a.c.b()).a(new aymr(action2.u, aymr.a(action2), aymqVar, null, true), action2));
                return "Start" + action2.c() + "FromPWQ";
            }
        }));
    }

    @Override // defpackage.aymn
    public final ListenableFuture c(Action action, cldb cldbVar, int i) {
        if (cldbVar == null) {
            return k(action, null, i);
        }
        final SettableFuture settableFutureCreate = SettableFuture.create();
        aymq aymqVar = new aymq() { // from class: aynp
            @Override // defpackage.aymq
            public final void a() {
                cczi ccziVar = ayns.b;
                settableFutureCreate.set(null);
            }
        };
        String str = action.u;
        aymr aymrVar = new aymr(str, i, aymqVar, cldbVar, true);
        aymrVar.b = cldbVar.toString();
        ((aymh) this.c.b()).a(aymrVar, action);
        cldbVar.q(str, settableFutureCreate);
        return settableFutureCreate;
    }

    @Override // defpackage.aymn
    public final ListenableFuture d(Action action) {
        return ((Boolean) b.e()).booleanValue() ? b(action) : j(action);
    }

    @Override // defpackage.aymn
    public final ListenableFuture e(Action action) {
        return k(action, null, aymr.a(action));
    }

    @Override // defpackage.aymn
    public final void f(Action action, int i) {
        if (((Boolean) ccze.y.e()).booleanValue()) {
            qbq.a(((ActionWorkManagerScheduler) this.h.b()).c).b(Integer.toString(i));
        }
        JobScheduler jobScheduler = (JobScheduler) ((aynh) this.g.b()).b.getSystemService(JobScheduler.class);
        jobScheduler.getClass();
        jobScheduler.cancel(i);
        Context context = this.e;
        ayoe ayoeVar = (ayoe) this.f.b();
        if (PendingActionReceiver.l(context, action, i, false, 536870912, null, ayoeVar) != null) {
            ((AlarmManager) context.getSystemService("alarm")).cancel(PendingActionReceiver.l(context, action, i, false, VCardConfig.FLAG_REFRAIN_QP_TO_NAME_PROPERTIES, null, ayoeVar));
        }
    }

    @Override // defpackage.aymn
    public final void g(final Action action, int i, long j) {
        if (j <= 0) {
            k(action, null, i);
            return;
        }
        if (((Boolean) ccze.y.e()).booleanValue()) {
            ActionWorkManagerScheduler actionWorkManagerScheduler = (ActionWorkManagerScheduler) this.h.b();
            ayoe ayoeVar = (ayoe) actionWorkManagerScheduler.b.b();
            final pzn pznVar = new pzn();
            pznVar.e("bundle_action_name", action.getClass().getName());
            pznVar.e("bundle_action_key", action.u);
            if (((aooq) ayoeVar.b.b()).a()) {
                action.v.j().flatMap(new Function() { // from class: aynt
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) throws IOException {
                        PersistableBundle persistableBundle = (PersistableBundle) obj;
                        if (!craf.d) {
                            return Optional.empty();
                        }
                        evqs evqsVar = evqs.b;
                        evqr evqrVar = new evqr();
                        try {
                            persistableBundle.writeToStream(evqrVar);
                            return Optional.of(evqrVar.b().I());
                        } catch (IOException e) {
                            cqbd cqbdVarE = ayoe.a.e();
                            cqbdVarE.I("IOException serializing PersistableBundle");
                            cqbdVarE.s(e);
                            return Optional.empty();
                        }
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                }).ifPresentOrElse(new Consumer() { // from class: aynv
                    @Override // java.util.function.Consumer
                    /* renamed from: accept */
                    public final void z(Object obj) {
                        pznVar.d("persistable_bundle_action_params_serialized", (byte[]) obj);
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                }, new Runnable() { // from class: aynw
                    @Override // java.lang.Runnable
                    public final void run() {
                        pznVar.e("bundle_action_serialized_params", ayoe.e(action.v));
                    }
                });
            } else {
                pznVar.e("bundle_action_serialized_params", ayoe.e(action.v));
            }
            pzs pzsVarA = pznVar.a();
            long jMin = Math.min(j, aymn.a);
            qau qauVar = new qau(ActionWorkManagerScheduler.ActionWorker.class);
            qauVar.h(j, TimeUnit.MILLISECONDS);
            qauVar.f(pza.b, jMin, TimeUnit.MILLISECONDS);
            qauVar.j(pzsVarA);
            qbq.a(actionWorkManagerScheduler.c).g(Integer.toString(i), pzz.c, (qav) qauVar.b());
            return;
        }
        if (!action.fT()) {
            Context context = this.e;
            ((AlarmManager) context.getSystemService("alarm")).set(2, this.i.a() + j, PendingActionReceiver.l(context, action, i, false, VCardConfig.FLAG_REFRAIN_QP_TO_NAME_PROPERTIES, null, (ayoe) this.f.b()));
            return;
        }
        aynh aynhVar = (aynh) this.g.b();
        ayoe ayoeVar2 = (ayoe) this.f.b();
        Context context2 = aynhVar.b;
        JobScheduler jobScheduler = (JobScheduler) context2.getSystemService(JobScheduler.class);
        jobScheduler.getClass();
        ComponentName componentName = new ComponentName(context2, (Class<?>) ActionJobService.class);
        final PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putString("bundle_action_name", action.getClass().getName());
        persistableBundle.putString("bundle_action_key", action.u);
        aymo aymoVar = action.v;
        persistableBundle.putString("bundle_action_serialized_params", ayoe.e(aymoVar));
        if (((aooq) ayoeVar2.b.b()).a()) {
            aymoVar.j().ifPresent(new Consumer() { // from class: aynx
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void z(Object obj) {
                    persistableBundle.putPersistableBundle("persistable_bundle_action_params", (PersistableBundle) obj);
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
        }
        try {
            if (jobScheduler.schedule(new JobInfo.Builder(i, componentName).setExtras(persistableBundle).setMinimumLatency(j).setOverrideDeadline(j + Math.min(j, aymn.a)).build()) != 1) {
                throw new IllegalArgumentException("Invalid parameter was supplied. This can occur if the run-time for your job is too short, or perhaps the system can't resolve the requisite JobService in your package.");
            }
        } catch (IllegalStateException e) {
            StringBuilder sb = new StringBuilder("failed to schedule job: ");
            sb.append(action.getClass().getName());
            List<JobInfo> allPendingJobs = jobScheduler.getAllPendingJobs();
            if (allPendingJobs == null || allPendingJobs.isEmpty()) {
                aynh.a.n("Failed to retrieve JobScheduler pending jobs. Cancelling everything");
                jobScheduler.cancelAll();
                allPendingJobs = Collections.EMPTY_LIST;
            }
            HashMap map = new HashMap();
            int i2 = 0;
            for (JobInfo jobInfo : allPendingJobs) {
                Action actionD = ayoeVar2.d(jobInfo.getExtras());
                String name = actionD != null ? actionD.getClass().getName() : "unknown";
                AtomicInteger atomicInteger = (AtomicInteger) map.get(name);
                if (atomicInteger == null) {
                    map.put(name, new AtomicInteger(1));
                } else {
                    atomicInteger.incrementAndGet();
                }
                if (actionD != null) {
                    jobScheduler.cancel(jobInfo.getId());
                    i2++;
                }
            }
            cqce cqceVar = aynh.a;
            cqbd cqbdVarB = cqceVar.b();
            cqbdVarB.I("Dropped");
            cqbdVarB.G(i2);
            cqbdVarB.I("excess jobs.");
            cqbdVarB.r();
            ((ains) aynhVar.c.b()).g("Bugle.DataModel.Scheduler.DroppedExcessJobs.Count", i2);
            for (Map.Entry entry : map.entrySet()) {
                sb.append("\n  ");
                sb.append((String) entry.getKey());
                sb.append(": ");
                sb.append(((AtomicInteger) entry.getValue()).get());
            }
            cqceVar.o(sb.toString(), e);
            throw e;
        }
    }

    @Override // defpackage.aymn
    public final void h(Action action, Action action2) {
        k(action, action2, aymr.a(action)).isCancelled();
    }

    @Override // defpackage.aymn
    public final ayno i(final Action action, long j) {
        Runnable runnableK = eiid.k(new Runnable() { // from class: aynn
            @Override // java.lang.Runnable
            public final void run() {
                this.a.j(action);
            }
        });
        Handler handler = new Handler(Looper.getMainLooper());
        handler.postDelayed(runnableK, j);
        return new ayno(handler, runnableK);
    }

    final ListenableFuture j(Action action) {
        return ((aymh) this.c.b()).a(new aymr(action.u, aymr.a(action), null, null, false), action);
    }
}
