package defpackage;

import android.text.TextUtils;
import j$.time.Duration;
import j$.time.Instant;
import j$.util.Optional;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cfhm implements cfgx {
    public static final cczi a = cdag.c(cdag.b, "ditto_bind_retry_timeout_exponent", 2.0d);
    static final cczi b = cdag.e(cdag.b, "max_foreground_bind_retry_exponent", 3);
    public static final ekrg c = ekrg.c("com/google/android/apps/messaging/shared/net/handler/bindhandler/BindHandlerImpl");
    static final Duration d = Duration.ofSeconds(10);
    public final cedp A;
    public final Optional B;
    public final Optional C;
    public final Duration D;
    public final Duration E;
    public final int F;
    public final boolean G;
    public final boolean H;
    public final fcsu I;
    public final int J;
    private final eosc K;
    private final int L;
    public final cepf e;
    public final fcsu f;
    public final fcsu g;
    public final cogw h;
    public final eigp i;
    public final fcsu j;
    public cfhl m;
    public ScheduledFuture o;
    public ScheduledFuture p;
    public ScheduledFuture q;
    public ScheduledFuture t;
    public final fcsu u;
    public final ains v;
    public final fcsu w;
    public final eosd x;
    public final cenj y;
    public final cfrl z;
    public final AtomicInteger k = new AtomicInteger();
    public final AtomicBoolean l = new AtomicBoolean(false);
    public final Object n = new Object();
    public Instant r = Instant.MAX;
    public Set s = new HashSet();

    public cfhm(cenj cenjVar, fcsu fcsuVar, fcsu fcsuVar2, ains ainsVar, fcsu fcsuVar3, eosd eosdVar, eosc eoscVar, fcsu fcsuVar4, cogw cogwVar, eigp eigpVar, fcsu fcsuVar5, fcsu fcsuVar6, cfrl cfrlVar, cepf cepfVar, cedp cedpVar, int i, Optional optional, Optional optional2, Duration duration, Duration duration2, int i2, int i3, boolean z, boolean z2) {
        this.f = fcsuVar;
        this.e = cepfVar;
        this.y = cenjVar;
        this.u = fcsuVar2;
        this.v = ainsVar;
        this.w = fcsuVar3;
        this.x = eosdVar;
        this.K = eoscVar;
        this.g = fcsuVar4;
        this.h = cogwVar;
        this.i = eigpVar;
        this.j = fcsuVar5;
        this.z = cfrlVar;
        this.A = cedpVar;
        this.J = i;
        this.B = optional;
        this.C = optional2;
        this.E = duration2;
        this.D = duration;
        this.L = i2;
        this.F = i3;
        this.G = z;
        this.H = z2;
        this.I = fcsuVar6;
    }

    private final void l() {
        synchronized (this.n) {
            ScheduledFuture scheduledFuture = this.q;
            if (scheduledFuture != null && !scheduledFuture.isDone()) {
                this.q.cancel(false);
                this.q = null;
            }
        }
    }

    private final void m() {
        synchronized (this.n) {
            this.r = Instant.MAX;
            ScheduledFuture scheduledFuture = this.p;
            if (scheduledFuture != null && !scheduledFuture.isDone()) {
                this.p.cancel(false);
                this.p = null;
            }
        }
    }

    @Override // defpackage.cfgx
    public final eiju a() {
        ekrw ekrwVarH = c.h();
        ekrwVarH.X(eksq.a, "BugleNetwork");
        ((ekrd) ((ekrd) ekrwVarH).h("com/google/android/apps/messaging/shared/net/handler/bindhandler/BindHandlerImpl", "startIfNotStarted", 232, "BindHandlerImpl.java")).t("%s BindHandler: Start a new bind session and stream immediately, if it is not currently started.", emjc.a(this.J));
        this.k.set(0);
        return e(true);
    }

    @Override // defpackage.cfgx
    public final void b() {
        eijx.g(new Callable() { // from class: cfhc
            @Override // java.util.concurrent.Callable
            public final Object call() {
                ekrw ekrwVarH = cfhm.c.h();
                ekrwVarH.X(eksq.a, "BugleNetwork");
                ekrd ekrdVar = (ekrd) ((ekrd) ekrwVarH).h("com/google/android/apps/messaging/shared/net/handler/bindhandler/BindHandlerImpl", "onAppBackgroundingInternal", 376, "BindHandlerImpl.java");
                cfhm cfhmVar = this.a;
                ekrdVar.t("%s BindHandler: App backgrounded. Refresh the idle timer.", emjc.a(cfhmVar.J));
                synchronized (cfhmVar.n) {
                    ScheduledFuture scheduledFuture = cfhmVar.p;
                    if (scheduledFuture != null && !scheduledFuture.isDone()) {
                        cfhmVar.h();
                    }
                }
                return null;
            }
        }, this.K);
    }

    @Override // defpackage.cfgx
    public final void c() {
        synchronized (this.n) {
            ekrw ekrwVarH = c.h();
            ekrwVarH.X(eksq.a, "BugleNetwork");
            ((ekrd) ((ekrd) ekrwVarH).h("com/google/android/apps/messaging/shared/net/handler/bindhandler/BindHandlerImpl", "stop", 464, "BindHandlerImpl.java")).t("%s BindHandler: Stopping the bind session because stop() is explicitly called.", emjc.a(this.J));
            cfhl cfhlVar = this.m;
            if (cfhlVar != null) {
                cfhlVar.e();
            }
            j();
        }
    }

    @Override // defpackage.cfgx
    public final eiju d(final String str) {
        return (!this.C.isPresent() || TextUtils.isEmpty(str)) ? a() : a().h(new ejvr() { // from class: cfhg
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                ekrg ekrgVar = cfhm.c;
                ekrw ekrwVarE = ekrgVar.e();
                ekrz ekrzVar = eksq.a;
                ekrwVarE.X(ekrzVar, "BugleNetwork");
                ekrd ekrdVar = (ekrd) ((ekrd) ekrwVarE).h("com/google/android/apps/messaging/shared/net/handler/bindhandler/BindHandlerImpl", "scheduleMessageIdCheck", 253, "BindHandlerImpl.java");
                cfhm cfhmVar = this.a;
                int i = cfhmVar.J;
                String strA = emjc.a(i);
                String str2 = str;
                ekrdVar.D("%s BindHandler: add message ID to check: %s", strA, str2);
                synchronized (cfhmVar.n) {
                    cfhmVar.s.add(str2);
                    if (cfhmVar.t == null) {
                        ekrw ekrwVarH = ekrgVar.h();
                        ekrwVarH.X(ekrzVar, "BugleNetwork");
                        ((ekrd) ((ekrd) ekrwVarH).h("com/google/android/apps/messaging/shared/net/handler/bindhandler/BindHandlerImpl", "scheduleMessageIdCheck", 261, "BindHandlerImpl.java")).t("%s BindHandler: scheduling a pull", emjc.a(i));
                        cfhmVar.t = cfhmVar.x.schedule(new cfhb(cfhmVar), ((Integer) cefs.s.e()).intValue(), TimeUnit.SECONDS);
                    }
                }
                ((ains) cfhmVar.w.b()).e("Bugle.Ditto.Binding.TicklePulling.Counts", 1);
                return null;
            }
        }, this.x);
    }

    public final eiju e(final boolean z) {
        eiju eijuVarL;
        if (this.l.getAndSet(false)) {
            ekrw ekrwVarH = c.h();
            ekrwVarH.X(eksq.a, "BugleNetwork");
            ((ekrd) ((ekrd) ekrwVarH).h("com/google/android/apps/messaging/shared/net/handler/bindhandler/BindHandlerImpl", "startStreamIfNotStarted", 384, "BindHandlerImpl.java")).t("%s BindHandler: Forcing a RegisterRefresh due to a previous Unauthenticated error", emjc.a(this.J));
            eijuVarL = this.A.m(cedo.FORCE_REFRESH);
        } else {
            eijuVarL = this.A.l();
        }
        return eijuVarL.h(new ejvr() { // from class: cfha
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                ezns eznsVar = (ezns) obj;
                cfhm cfhmVar = this.a;
                synchronized (cfhmVar.n) {
                    if (cfhmVar.m == null) {
                        ekrg ekrgVar = cfhm.c;
                        ekrw ekrwVarH2 = ekrgVar.h();
                        ekrz ekrzVar = eksq.a;
                        ekrwVarH2.X(ekrzVar, "BugleNetwork");
                        ekrd ekrdVar = (ekrd) ((ekrd) ekrwVarH2).h("com/google/android/apps/messaging/shared/net/handler/bindhandler/BindHandlerImpl", "startStreamIfNotStarted", 402, "BindHandlerImpl.java");
                        int i = cfhmVar.J;
                        ekrdVar.t("%s BindHandler: Starting new receiveMessages", emjc.a(i));
                        cfhmVar.m = new cfhl(cfhmVar);
                        cfhl cfhlVar = cfhmVar.m;
                        String strK = cfhmVar.A.k();
                        ezpo ezpoVarB = cfhmVar.G ? cfhmVar.y.b(strK) : cfhmVar.y.a(strK);
                        evqs evqsVar = eznsVar.b;
                        ezpoVarB.copyOnWrite();
                        ezpp ezppVar = (ezpp) ezpoVarB.instance;
                        ezpp ezppVar2 = ezpp.a;
                        evqsVar.getClass();
                        ezppVar.f = evqsVar;
                        ezkk ezkkVar = (ezkk) ezkl.a.createBuilder();
                        ezkkVar.copyOnWrite();
                        ezkl ezklVar = (ezkl) ezkkVar.instance;
                        ezpp ezppVar3 = (ezpp) ezpoVarB.build();
                        ezppVar3.getClass();
                        ezklVar.c = ezppVar3;
                        ezklVar.b |= 1;
                        if (((asem) cfhmVar.I.b()).a()) {
                            Duration duration = cfhmVar.D;
                            if (!duration.equals(cfgy.a)) {
                                Duration duration2 = cfhm.d;
                                if (duration.compareTo(duration2) < 0 || duration.compareTo(cfhmVar.E) >= 0) {
                                    ekrw ekrwVarJ = ekrgVar.j();
                                    ekrwVarJ.X(ekrzVar, "BugleNetwork");
                                    ((ekrd) ((ekrd) ekrwVarJ).h("com/google/android/apps/messaging/shared/net/handler/bindhandler/BindHandlerImpl", "buildReceiveMessagesRequest", 443, "BindHandlerImpl.java")).J("%s BindHandler: Ignoring out of bounds value %s for the pong interval [%s, %s)", emjc.a(i), duration, duration2, cfhmVar.E);
                                } else {
                                    ezjy ezjyVar = (ezjy) ezjz.a.createBuilder();
                                    long seconds = duration.toSeconds();
                                    ezjyVar.copyOnWrite();
                                    ((ezjz) ezjyVar.instance).b = seconds;
                                    ezkkVar.copyOnWrite();
                                    ezkl ezklVar2 = (ezkl) ezkkVar.instance;
                                    ezjz ezjzVar = (ezjz) ezjyVar.build();
                                    ezjzVar.getClass();
                                    ezklVar2.d = ezjzVar;
                                    ezklVar2.b |= 4;
                                }
                            }
                        }
                        ezkl ezklVar3 = (ezkl) ezkkVar.build();
                        ekrw ekrwVarE = ekrgVar.e();
                        ekrwVarE.X(ekrzVar, "BugleNetwork");
                        ekrd ekrdVar2 = (ekrd) ((ekrd) ekrwVarE).h("com/google/android/apps/messaging/shared/net/handler/bindhandler/BindHandlerImpl", "startStreamIfNotStarted", 407, "BindHandlerImpl.java");
                        String strA = emjc.a(i);
                        ezpp ezppVar4 = ezklVar3.c;
                        if (ezppVar4 == null) {
                            ezppVar4 = ezpp.a;
                        }
                        ekrdVar2.D("%s BindHandler: starting rpc receiveMessages. requestId: %s", strA, ezppVar4.c);
                        cfhmVar.e.f(ezklVar3, cfhlVar);
                    }
                    if (z) {
                        ScheduledFuture scheduledFuture = cfhmVar.p;
                        cfhmVar.h();
                        Optional optional = cfhmVar.B;
                        if (optional.isPresent() && scheduledFuture == null) {
                            ekrw ekrwVarH3 = cfhm.c.h();
                            ekrwVarH3.X(eksq.a, "BugleNetwork");
                            ((ekrd) ((ekrd) ekrwVarH3).h("com/google/android/apps/messaging/shared/net/handler/bindhandler/BindHandlerImpl", "startStreamIfNotStarted", 417, "BindHandlerImpl.java")).t("%s BindHandler: Notifying listener that a bind session has started.", emjc.a(cfhmVar.J));
                            ((cfho) optional.get()).b();
                        }
                    }
                }
                return null;
            }
        }, this.K);
    }

    public final void f() {
        synchronized (this.n) {
            if (this.t == null) {
                ekrw ekrwVarJ = c.j();
                ekrwVarJ.X(eksq.a, "BugleNetwork");
                ((ekrd) ((ekrd) ekrwVarJ).h("com/google/android/apps/messaging/shared/net/handler/bindhandler/BindHandlerImpl", "completeOrRescheduleMessageIdCheckCallback", 346, "BindHandlerImpl.java")).q("Future is null in completeOrRescheduleMessageIdCheckCallback");
            }
            if (this.s.isEmpty()) {
                ekrw ekrwVarE = c.e();
                ekrwVarE.X(eksq.a, "BugleNetwork");
                ((ekrd) ((ekrd) ekrwVarE).h("com/google/android/apps/messaging/shared/net/handler/bindhandler/BindHandlerImpl", "completeOrRescheduleMessageIdCheckCallback", 349, "BindHandlerImpl.java")).q("Will not reschedule pull because there is no more ID to check");
                this.t = null;
            } else {
                ekrw ekrwVarH = c.h();
                ekrwVarH.X(eksq.a, "BugleNetwork");
                ((ekrd) ((ekrd) ekrwVarH).h("com/google/android/apps/messaging/shared/net/handler/bindhandler/BindHandlerImpl", "completeOrRescheduleMessageIdCheckCallback", 352, "BindHandlerImpl.java")).t("%s BindHandler: rescheduling a pull", emjc.a(this.J));
                this.t = this.x.schedule(new cfhb(this), ((Integer) cefs.s.e()).intValue(), TimeUnit.SECONDS);
            }
        }
    }

    public final void g() {
        synchronized (this.n) {
            l();
            this.q = this.x.schedule(new Runnable() { // from class: cfhh
                @Override // java.lang.Runnable
                public final void run() {
                    cfhm cfhmVar = this.a;
                    synchronized (cfhmVar.n) {
                        ekrg ekrgVar = cfhm.c;
                        ekrw ekrwVarJ = ekrgVar.j();
                        ekrz ekrzVar = eksq.a;
                        ekrwVarJ.X(ekrzVar, "BugleNetwork");
                        ((ekrd) ((ekrd) ekrwVarJ).h("com/google/android/apps/messaging/shared/net/handler/bindhandler/BindHandlerImpl", "triggerBindingWatchdog", 524, "BindHandlerImpl.java")).t("%s BindHandler: BindingWatchdog triggered.", emjc.a(cfhmVar.J));
                        cfhmVar.q = null;
                        cfhl cfhlVar = cfhmVar.m;
                        if (cfhlVar != null && cfhlVar.a != null) {
                            ekrw ekrwVarH = ekrgVar.h();
                            ekrwVarH.X(ekrzVar, "BugleNetwork");
                            ((ekrd) ((ekrd) ekrwVarH).h("com/google/android/apps/messaging/shared/net/handler/bindhandler/BindHandlerImpl$ReceiveMessagesResponseObserver", "watchdogTimeout", 725, "BindHandlerImpl.java")).t("%s BindHandler: Cancelling stream due to pong timeout, will trigger onError and may retry", emjc.a(cfhlVar.b.J));
                            cfhlVar.a.d("Watchdog triggered", new cfhk());
                        }
                    }
                }
            }, this.E.toSeconds(), TimeUnit.SECONDS);
        }
    }

    public final void h() {
        synchronized (this.n) {
            m();
            Instant instantF = this.h.f();
            long j = this.L;
            this.r = instantF.plus(Duration.ofSeconds(j));
            this.p = this.x.schedule(new Runnable() { // from class: cfgz
                @Override // java.lang.Runnable
                public final void run() {
                    this.a.k();
                }
            }, j, TimeUnit.SECONDS);
        }
    }

    public final void i() {
        synchronized (this.n) {
            if (this.m != null) {
                ekrw ekrwVarH = c.h();
                ekrwVarH.X(eksq.a, "BugleNetwork");
                ((ekrd) ((ekrd) ekrwVarH).h("com/google/android/apps/messaging/shared/net/handler/bindhandler/BindHandlerImpl", "shutdownStream", 477, "BindHandlerImpl.java")).t("%s BindHandler: Shutting down response observer", emjc.a(this.J));
                this.m = null;
                l();
            }
        }
    }

    public final void j() {
        synchronized (this.n) {
            i();
            m();
            Optional optional = this.B;
            if (optional.isPresent()) {
                ekrw ekrwVarH = c.h();
                ekrwVarH.X(eksq.a, "BugleNetwork");
                ((ekrd) ((ekrd) ekrwVarH).h("com/google/android/apps/messaging/shared/net/handler/bindhandler/BindHandlerImpl", "shutdownStreamAndSession", 491, "BindHandlerImpl.java")).t("%s BindHandler: Notifying listener that a bind session has ended.", emjc.a(this.J));
                ((cfho) optional.get()).a();
            }
            ScheduledFuture scheduledFuture = this.t;
            if (scheduledFuture != null && !scheduledFuture.isDone()) {
                this.t.cancel(false);
            }
            this.t = null;
        }
    }

    public final void k() {
        synchronized (this.n) {
            ekrg ekrgVar = c;
            ekrw ekrwVarE = ekrgVar.e();
            ekrz ekrzVar = eksq.a;
            ekrwVarE.X(ekrzVar, "BugleNetwork");
            ekrd ekrdVar = (ekrd) ((ekrd) ekrwVarE).h("com/google/android/apps/messaging/shared/net/handler/bindhandler/BindHandlerImpl", "triggerIdleWatchdog", 564, "BindHandlerImpl.java");
            int i = this.J;
            ekrdVar.t("%s BindHandler: IdleWatchdog triggered.", emjc.a(i));
            if (((cqba) this.g.b()).a) {
                ekrw ekrwVarH = ekrgVar.h();
                ekrwVarH.X(ekrzVar, "BugleNetwork");
                ((ekrd) ((ekrd) ekrwVarH).h("com/google/android/apps/messaging/shared/net/handler/bindhandler/BindHandlerImpl", "triggerIdleWatchdog", 567, "BindHandlerImpl.java")).t("%s BindHandler: Idle watchdog is triggered but app is still in the foreground. Extend the time.", emjc.a(i));
                h();
                return;
            }
            ekrw ekrwVarH2 = ekrgVar.h();
            ekrwVarH2.X(ekrzVar, "BugleNetwork");
            ((ekrd) ((ekrd) ekrwVarH2).h("com/google/android/apps/messaging/shared/net/handler/bindhandler/BindHandlerImpl", "triggerIdleWatchdog", 575, "BindHandlerImpl.java")).t("%s BindHandler: Idle watchdog is triggered and app is in background. Close the stream and session.", emjc.a(i));
            cfhl cfhlVar = this.m;
            if (cfhlVar != null) {
                cfhlVar.e();
            }
            j();
        }
    }
}
