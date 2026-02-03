package com.google.android.apps.messaging.shared.datamodel.action.execution;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.Debug;
import android.os.IBinder;
import android.os.PowerManager;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import com.google.common.util.concurrent.ListenableFuture;
import defpackage.aipo;
import defpackage.aymh;
import defpackage.aymp;
import defpackage.aymq;
import defpackage.aymr;
import defpackage.ayne;
import defpackage.aynl;
import defpackage.aynm;
import defpackage.ayoe;
import defpackage.ayoi;
import defpackage.ayoo;
import defpackage.ccze;
import defpackage.cczn;
import defpackage.cczv;
import defpackage.cdag;
import defpackage.cqaz;
import defpackage.cqbd;
import defpackage.cqbi;
import defpackage.cqce;
import defpackage.cqdy;
import defpackage.csq;
import defpackage.dzfh;
import defpackage.dzua;
import defpackage.dzuc;
import defpackage.ekrd;
import defpackage.ekrw;
import defpackage.eksq;
import defpackage.eosc;
import defpackage.eoss;
import defpackage.fcsu;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ActionExecutorImpl implements aymh, aymp, aynm {
    public static final cczv a = cdag.c(cdag.b, "action_runnable_primes_timer_ratio", 1.0d);
    public static final cqce b = cqce.g("BugleDataModel", "ActionExecutorImpl");
    public final Context c;
    public final aipo d;
    public final dzuc e;
    public final eosc f;
    public final Queue g;
    public final cqbi h;
    public final cqbi i;
    public final fcsu j;
    public final fcsu k;
    public final fcsu l;
    public final Map m;
    public final AtomicInteger n;
    public final AtomicInteger o;
    public final Runnable p;
    public final ayoo q;
    private final Intent r;
    private final cqdy s;
    private boolean t;

    /* compiled from: PG */
    public static final class EmptyService extends Service {
        @Override // android.app.Service
        public final IBinder onBind(Intent intent) {
            return null;
        }

        @Override // android.app.Service
        public final void onDestroy() {
            ActionExecutorImpl.b.m("ActionExecutor Empty Service destroyed.");
        }

        @Override // android.app.Service
        public final int onStartCommand(Intent intent, int i, int i2) {
            ActionExecutorImpl.b.m("ActionExecutor Empty Service started.");
            return super.onStartCommand(intent, i, i2);
        }
    }

    public ActionExecutorImpl(Context context, aipo aipoVar, cczn ccznVar, dzuc dzucVar, eosc eoscVar, fcsu fcsuVar, fcsu fcsuVar2, ayoo ayooVar, fcsu fcsuVar3) {
        cqdy cqdyVar = new cqdy();
        final PriorityQueue priorityQueue = new PriorityQueue(11, new ayne());
        this.n = new AtomicInteger(0);
        this.o = new AtomicInteger(0);
        this.t = false;
        ccznVar.a();
        this.c = context;
        this.d = aipoVar;
        this.r = new Intent(context, (Class<?>) EmptyService.class);
        this.s = cqdyVar;
        this.e = dzucVar;
        this.g = priorityQueue;
        this.f = eoscVar;
        this.m = new csq();
        this.p = new Runnable() { // from class: aync
            @Override // java.lang.Runnable
            public final void run() {
                aynl aynlVar;
                Queue queue = priorityQueue;
                synchronized (this.a.m) {
                    aynlVar = (aynl) queue.poll();
                }
                aynlVar.getClass();
                aynlVar.run();
            }
        };
        eoss eossVar = new eoss(eoscVar);
        eoss eossVar2 = new eoss(eoscVar);
        this.h = new cqbi(eossVar);
        this.i = new cqbi(eossVar2);
        this.j = fcsuVar;
        this.k = fcsuVar2;
        this.q = ayooVar;
        this.l = fcsuVar3;
    }

    private final ListenableFuture j(aymr aymrVar, Action action, boolean z, boolean z2) {
        synchronized (this.m) {
            boolean z3 = true;
            if (!this.t) {
                try {
                    b.m("Starting ActionService");
                    Context context = this.c;
                    Intent intent = this.r;
                    context.startService(intent);
                    this.t = true;
                    cqdy cqdyVar = this.s;
                    synchronized (cqdyVar.b) {
                        if (cqdyVar.e == null) {
                            cqdyVar.e = ((PowerManager) context.getSystemService("power")).newWakeLock(1, cqdyVar.c);
                        }
                    }
                    cqdyVar.e.acquire();
                    intent.putExtra("pid", cqdyVar.d);
                } catch (IllegalStateException e) {
                    z3 = false;
                    if (z2) {
                        cqbd cqbdVarE = b.e();
                        cqbdVarE.I("Action started execution, but we can't guarantee it will complete, the app may be killed.");
                        cqbdVarE.A("Action", action);
                        cqbdVarE.s(e);
                    }
                }
            }
            if (z && !z3) {
                return null;
            }
            this.m.put(Integer.valueOf(aymrVar.a), aymrVar);
            aymrVar.e = this;
            return aymrVar.b(action);
        }
    }

    @Override // defpackage.aymh
    public final ListenableFuture a(aymr aymrVar, Action action) {
        ListenableFuture listenableFutureJ = j(aymrVar, action, false, !aymrVar.g);
        listenableFutureJ.getClass();
        return listenableFutureJ;
    }

    @Override // defpackage.aymh
    public final ListenableFuture b(aymr aymrVar, Action action) {
        return j(aymrVar, action, true, false);
    }

    @Override // defpackage.aymh
    public final void c(int i) {
        Map map = this.m;
        synchronized (map) {
            if (((aymr) map.get(Integer.valueOf(i))) == null) {
                cqbd cqbdVarE = b.e();
                cqbdVarE.I("Tried to cancel job");
                cqbdVarE.G(i);
                cqbdVarE.I("that can't be found. already finished?");
                cqbdVarE.r();
            }
        }
    }

    @Override // defpackage.aynm
    public final void d(String str, Action action) {
        cqbd cqbdVarC = b.c();
        cqbdVarC.I(str);
        cqbdVarC.v(action.getClass().getSimpleName());
        cqbdVarC.r();
    }

    /* JADX WARN: Type inference failed for: r5v2, types: [aymp, aynm] */
    @Override // defpackage.aynm
    public final void e(Action action, aymr aymrVar) {
        aymq aymqVar;
        List<Action> list = action.w;
        action.w = new ArrayList();
        aymr aymrVar2 = action.x;
        if (aymrVar2 == null || (aymrVar2.c() && ((Boolean) ccze.x.e()).booleanValue())) {
            ayoo ayooVar = this.q;
            ArrayList arrayList = new ArrayList(list);
            ayoe ayoeVar = (ayoe) ayooVar.a.b();
            ayoeVar.getClass();
            new DeferBackgroundWorkAction(ayoeVar, arrayList).x(127, 0L);
        } else {
            for (Action action2 : list) {
                if (aymrVar2.c()) {
                    cqbd cqbdVarA = b.a();
                    cqbdVarA.I("Adding");
                    cqbdVarA.I(action2.u);
                    cqbdVarA.I("background work for");
                    cqbdVarA.I(aymrVar2.b);
                    cqbdVarA.r();
                }
                aymrVar2.d.add(action2);
                action2.y(aymrVar2);
                cqaz.l(aymrVar2.e);
                ?? r5 = aymrVar2.e;
                if (r5 != 0) {
                    ActionExecutorImpl actionExecutorImpl = (ActionExecutorImpl) r5;
                    ayoi ayoiVar = new ayoi(aymrVar2, action2, r5, actionExecutorImpl.f, actionExecutorImpl.j, actionExecutorImpl.k, actionExecutorImpl.l);
                    ayoiVar.c(actionExecutorImpl.d.a("Bugle.DataModel.ActionBreakdown.BackgroundQueue.Latency", action2.y, action2.u));
                    synchronized (actionExecutorImpl.m) {
                        ((ActionExecutorImpl) r5).i.a(ayoiVar);
                    }
                    actionExecutorImpl.d("ACTION_BACKGROUND_QUEUED_", action2);
                }
            }
        }
        this.o.decrementAndGet();
        List list2 = aymrVar.d;
        list2.remove(action);
        if (list2.isEmpty() && (aymqVar = aymrVar.c) != null) {
            aymqVar.a();
        }
        if (list2.isEmpty()) {
            Map map = this.m;
            synchronized (map) {
                map.remove(Integer.valueOf(aymrVar.a));
                if (map.isEmpty() && this.t) {
                    cqdy cqdyVar = this.s;
                    Intent intent = this.r;
                    if (cqdyVar.d == intent.getIntExtra("pid", -1)) {
                        try {
                            cqdyVar.e.release();
                        } catch (RuntimeException unused) {
                            ekrw ekrwVarI = cqdy.a.i();
                            ekrwVarI.X(eksq.a, "BugleDataModel");
                            ekrd ekrdVar = (ekrd) ((ekrd) ekrwVarI).h("com/google/android/apps/messaging/shared/util/common/WakeLockHelper", "release", 96, "WakeLockHelper.java");
                            String action3 = intent.getAction();
                            PowerManager.WakeLock wakeLock = cqdyVar.e;
                            ekrdVar.K("KeepAliveService.onHandleIntent exit crash %s %s opcode: %d wakeLock: %s isHeld: %s", intent, action3, 0, wakeLock, wakeLock == null ? "(null)" : Boolean.valueOf(wakeLock.isHeld()));
                            if (!Debug.isDebuggerConnected()) {
                                cqaz.c("WakeLock no longer held at end of handler");
                            }
                        }
                    }
                    b.m("Stopping ActionService");
                    this.c.stopService(this.r);
                    this.t = false;
                }
            }
        }
        i();
    }

    @Override // defpackage.aynm
    public final void f(aynl aynlVar, String str) {
        i();
        this.o.incrementAndGet();
        Action action = aynlVar.f;
        aynlVar.c(this.d.a(str, action.y, action.u));
        synchronized (this.m) {
            this.g.add(aynlVar);
            this.h.a(this.p);
        }
    }

    @Override // defpackage.aynm
    public final void g(Optional optional, final dzfh dzfhVar, final dzua dzuaVar) {
        optional.ifPresent(new Consumer() { // from class: aynd
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void z(Object obj) {
                this.a.e.f((dzub) obj, dzfhVar, null, dzuaVar);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
    }

    @Override // defpackage.aynm
    public final void h(String str, String str2) {
        this.d.m(str, str2);
    }

    public final void i() {
        this.o.get();
    }
}
