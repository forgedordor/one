package defpackage;

import android.content.Context;
import com.google.common.util.concurrent.ListenableFuture;
import defpackage.cmwx;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cmwx implements cmwj {
    public static final cqce a = cqce.g("BugleStartup", "StartupHandler");
    public final AtomicBoolean b;
    public final eoqr c;
    public final Context d;
    public final ScheduledExecutorService e;
    public final ScheduledExecutorService f;
    public final eigp g;
    public final fcsu h;
    final cczi i;
    final cczv j;
    private final AtomicBoolean k = new AtomicBoolean(false);
    private final AtomicBoolean l;
    private final AtomicBoolean m;
    private final Executor n;
    private final fcsu o;
    private final fcsu p;

    /* compiled from: PG */
    interface a {
        fcsu hE();
    }

    public cmwx(Context context, ScheduledExecutorService scheduledExecutorService, ScheduledExecutorService scheduledExecutorService2, fcsu fcsuVar, eigp eigpVar, fcsu fcsuVar2, fcsu fcsuVar3) {
        new AtomicBoolean(false);
        this.l = new AtomicBoolean(false);
        this.m = new AtomicBoolean(false);
        this.b = new AtomicBoolean(false);
        this.c = new eoqr();
        this.i = cdag.e(cdag.b, "startup_interactive_wait_seconds", 15);
        this.j = cdag.n(161420308);
        this.d = context;
        this.e = scheduledExecutorService;
        this.f = scheduledExecutorService2;
        this.o = fcsuVar;
        this.g = eigpVar;
        this.p = fcsuVar2;
        this.h = fcsuVar3;
        this.n = new eoss(scheduledExecutorService2);
    }

    private final eiju f(final cmwh cmwhVar, String str) {
        eieu eieuVarK = eiiy.k(str);
        try {
            eiju eijuVarF = eijx.f(new Runnable() { // from class: cmwm
                @Override // java.lang.Runnable
                public final void run() {
                    final cmwx cmwxVar = this.a;
                    Map map = (Map) cmwxVar.h.b();
                    final cmwh cmwhVar2 = cmwhVar;
                    final fcsu fcsuVar = (fcsu) map.get(cmwhVar2);
                    fcsuVar.getClass();
                    auvh.h(cmwxVar.c.a(eiid.l(new Callable() { // from class: cmwk
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            cmwxVar.e((Set) fcsuVar.b(), cmwhVar2);
                            return null;
                        }
                    }), cmwxVar.f));
                }
            }, this.n);
            eieuVarK.close();
            return eijuVarF;
        } catch (Throwable th) {
            try {
                eieuVarK.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    private final eiju g() {
        return this.k.getAndSet(true) ? eijx.e(new cmwy(false)) : f(cmwh.APP_CREATED, "StartupHandlerImpl#onApplicationCreatedInternal").i(new eooz() { // from class: cmwt
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                final cmwx cmwxVar = this.a;
                return cmwxVar.i.b().h(new ejvr() { // from class: cmwn
                    @Override // defpackage.ejvr
                    public final Object apply(Object obj2) {
                        cmwx.a.m("Starting timer for onAppInteractive tasks");
                        final cmwx cmwxVar2 = cmwxVar;
                        return cmwxVar2.e.schedule(new Callable() { // from class: cmwl
                            @Override // java.util.concurrent.Callable
                            public final Object call() {
                                cmwx cmwxVar3 = cmwxVar2;
                                eieh eiehVarC = cmwxVar3.g.c("StartupHandlerImpl App Interactive Delay Timer Fired", "com/google/android/apps/messaging/shared/startup/StartupHandlerImpl", "scheduleAppInteractiveTasksInternal", 174);
                                try {
                                    eiju eijuVarD = cmwxVar3.d(true);
                                    eiehVarC.close();
                                    return eijuVarD;
                                } catch (Throwable th) {
                                    try {
                                        eiehVarC.close();
                                    } catch (Throwable th2) {
                                        th.addSuppressed(th2);
                                    }
                                    throw th;
                                }
                            }
                        }, ((Integer) obj2).intValue(), TimeUnit.SECONDS);
                    }
                }, cmwxVar.e);
            }
        }, this.e).h(new ejvr() { // from class: cmwu
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                return new cmwy(true);
            }
        }, eoqg.a);
    }

    private final void h(eiju eijuVar) {
        if (((Boolean) this.j.e()).booleanValue()) {
            auvh.h(eijuVar);
        } else {
            eijuVar.k(auwc.a(new cmwv()), eoqg.a);
        }
    }

    private final boolean i() {
        Context context = this.d;
        return craf.g(context) || craf.h(context);
    }

    @Override // defpackage.cmwj
    public final eiju a(final efwo efwoVar) {
        eieu eieuVarK = eiiy.k("StartupHandlerImpl#onAppInteractiveAccount");
        try {
            eiju eijuVarE = !i() ? eijx.e(null) : d(false).h(new ejvr() { // from class: cmwo
                @Override // defpackage.ejvr
                public final Object apply(Object obj) {
                    cmwx cmwxVar = this.a;
                    AtomicBoolean atomicBoolean = cmwxVar.b;
                    efwo efwoVar2 = efwoVar;
                    if (atomicBoolean.getAndSet(true)) {
                        return obj;
                    }
                    eieu eieuVarK2 = eiiy.k("StartupHandlerImpl#onAppInteractiveAccountInternal");
                    try {
                        cmwx.a aVar = (cmwx.a) ehlh.a(cmwxVar.d, cmwx.a.class, efwoVar2);
                        cmwx.a.m("Starting onAppInteractiveAccount tasks");
                        cmwxVar.e((Set) aVar.hE().b(), cmwh.APP_INTERACTIVE);
                        eieuVarK2.close();
                        return obj;
                    } catch (Throwable th) {
                        try {
                            eieuVarK2.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                }
            }, this.n);
            eieuVarK.close();
            return eijuVarE;
        } catch (Throwable th) {
            try {
                eieuVarK.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.cmwj
    public final eiju b() {
        eieu eieuVarK = eiiy.k("StartupHandlerImpl#onApplicationCreated");
        try {
            eiju eijuVarE = !i() ? eijx.e(null) : g();
            eieuVarK.close();
            return eijuVarE;
        } catch (Throwable th) {
            try {
                eieuVarK.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.cmwj
    public final eiju c() {
        eieu eieuVarK = eiiy.k("StartupHandlerImpl#onRequiredPermissionsAcquired");
        try {
            eiju eijuVarF = (i() && !this.l.getAndSet(true)) ? f(cmwh.PERMISSIONS_ACQUIRED, "StartupTask#PermissionsAcquired") : eijx.e(null);
            eieuVarK.close();
            return eijuVarF;
        } catch (Throwable th) {
            try {
                eieuVarK.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final eiju d(boolean z) {
        eiju eijuVarE;
        if (this.m.getAndSet(true)) {
            return eijx.e(null);
        }
        eiju eijuVarG = g();
        ejvr ejvrVar = new ejvr() { // from class: cmwp
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                if (!((cmwy) obj).a) {
                    return null;
                }
                cqbd cqbdVarE = cmwx.a.e();
                cqbdVarE.I("onApplicationCreated startup tasks were not enqueued before onAppInteractive, executed in onAppInteractive().");
                cqbdVarE.r();
                return null;
            }
        };
        eoqg eoqgVar = eoqg.a;
        eiju eijuVarH = eijuVarG.h(ejvrVar, eoqgVar);
        if (((crma) this.o.b()).j()) {
            a.m("Starting onRequiredPermissionsAcquired tasks in onAppInteractive");
            eijuVarE = c();
        } else {
            eijuVarE = eijx.e(null);
        }
        cqbd cqbdVarA = a.a();
        cqbdVarA.I("Starting onAppInteractive tasks");
        cqbdVarA.B("From timer", z);
        cqbdVarA.r();
        return eijx.k(eijuVarH, eijuVarE, f(cmwh.APP_INTERACTIVE, "StartupHandlerImpl#onAppInteractiveInternal")).c(new Runnable() { // from class: cmwq
            @Override // java.lang.Runnable
            public final void run() {
            }
        }, eoqgVar);
    }

    public final void e(Set set, cmwh cmwhVar) {
        cqbd cqbdVarA = a.a();
        cqbdVarA.y("BG thread startup tasks count", set.size());
        cqbdVarA.A("BG stage", cmwhVar);
        cqbdVarA.r();
        ArrayList arrayList = new ArrayList(set.size());
        Iterator it = set.iterator();
        while (it.hasNext()) {
            final cmwg cmwgVar = (cmwg) it.next();
            Context context = this.d;
            int i = cmwgVar.k;
            if (craf.g(context) && (!cmwgVar.c() || ((crnp) this.p.b()).e())) {
                eiju eijuVarG = eiju.g(this.c.b(eiid.c(new eooy() { // from class: cmwr
                    @Override // defpackage.eooy
                    public final ListenableFuture a() {
                        ecem.b();
                        cmwg cmwgVar2 = cmwgVar;
                        String string = cmwgVar2.getClass().toString();
                        eieu eieuVarA = cmwgVar2.a();
                        try {
                            cqbd cqbdVarD = cmwx.a.d();
                            cqbdVarD.I("Beginning background startup task:");
                            cqbdVarD.I(string);
                            cqbdVarD.r();
                            eiju eijuVarB = cmwgVar2.b();
                            eijuVarB.k(eiid.h(new cmww(string)), eoqg.a);
                            eieuVarA.close();
                            return eijuVarB;
                        } catch (Throwable th) {
                            try {
                                eieuVarA.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                        }
                    }
                }), this.f));
                arrayList.add(eijuVarG);
                h(eijuVarG);
            }
        }
        h(eijx.j(arrayList).c(new Runnable() { // from class: cmws
            @Override // java.lang.Runnable
            public final void run() {
            }
        }, eoqg.a));
    }
}
