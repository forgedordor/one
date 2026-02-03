package defpackage;

import android.content.Context;
import android.content.Intent;
import com.google.android.apps.messaging.dittosatellite.backgroundhandler.SatelliteBackgroundHandlerService;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abes implements abdy {
    public static final eksp a = eksp.c("BugleSatelliteBg");
    public final Context b;
    public final eosc c;
    public final Intent d;
    public final Set e = new HashSet();
    public final AtomicReference f = new AtomicReference(Optional.empty());
    public final AtomicBoolean g = new AtomicBoolean(false);
    private final Executor h;

    public abes(Context context, eosc eoscVar) {
        this.b = context;
        this.c = eoscVar;
        this.d = aiiw.c(context, SatelliteBackgroundHandlerService.class, "android.intent.action.VIEW").a();
        this.h = new eoss(eoscVar);
    }

    @Override // defpackage.abdy
    public final eiju a() {
        return eijx.h(new eooy() { // from class: abeh
            @Override // defpackage.eooy
            public final ListenableFuture a() {
                abes abesVar = this.a;
                abesVar.f();
                if (!((Optional) abesVar.f.get()).isPresent()) {
                    return eijx.e(false);
                }
                ((eksl) ((eksl) abes.a.h()).h("com/google/android/apps/messaging/dittosatellite/backgroundhandler/SatelliteBackgroundHandlerManagerImpl", "pauseBackgroundHandler", 132, "SatelliteBackgroundHandlerManagerImpl.java")).q("Pausing Ditto background service");
                return abesVar.e(new Function() { // from class: abef
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        return ((abmq) ((abex) obj).b.get()).c();
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                }).h(new ejvr() { // from class: abeg
                    @Override // defpackage.ejvr
                    public final Object apply(Object obj) {
                        Boolean bool = (Boolean) obj;
                        ((eksl) ((eksl) abes.a.h()).h("com/google/android/apps/messaging/dittosatellite/backgroundhandler/SatelliteBackgroundHandlerManagerImpl", "pauseBackgroundHandler", 137, "SatelliteBackgroundHandlerManagerImpl.java")).q("Successfully paused Ditto background service");
                        return bool;
                    }
                }, abesVar.c);
            }
        }, this.h);
    }

    @Override // defpackage.abdy
    public final eiju b() {
        this.g.set(true);
        ((eksl) ((eksl) a.h()).h("com/google/android/apps/messaging/dittosatellite/backgroundhandler/SatelliteBackgroundHandlerManagerImpl", "startOrResumeBackgroundHandler", 94, "SatelliteBackgroundHandlerManagerImpl.java")).q("Starting Ditto background service");
        return e(new Function() { // from class: abea
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((abmq) ((abex) obj).b.get()).d();
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).h(new ejvr() { // from class: abeb
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                Boolean bool = (Boolean) obj;
                ((eksl) ((eksl) abes.a.h()).h("com/google/android/apps/messaging/dittosatellite/backgroundhandler/SatelliteBackgroundHandlerManagerImpl", "startOrResumeBackgroundHandler", 99, "SatelliteBackgroundHandlerManagerImpl.java")).q("Successfully started Ditto background service");
                return bool;
            }
        }, this.c);
    }

    @Override // defpackage.abdy
    public final eiju c() {
        return eijx.f(new Runnable() { // from class: abed
            @Override // java.lang.Runnable
            public final void run() {
                abes abesVar = this.a;
                abesVar.f();
                Optional optional = (Optional) abesVar.f.getAndSet(Optional.empty());
                final Context context = abesVar.b;
                context.getClass();
                optional.ifPresent(new Consumer() { // from class: abec
                    @Override // java.util.function.Consumer
                    public final void accept(Object obj) {
                        context.unbindService((aber) obj);
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                });
                context.stopService(abesVar.d);
                abesVar.g.set(false);
                ((eksl) ((eksl) abes.a.h()).h("com/google/android/apps/messaging/dittosatellite/backgroundhandler/SatelliteBackgroundHandlerManagerImpl", "stopBackgroundHandler", 156, "SatelliteBackgroundHandlerManagerImpl.java")).q("Stopped Ditto background service");
            }
        }, this.h);
    }

    @Override // defpackage.abdy
    public final eiju d() {
        return b().e(Exception.class, new ejvr() { // from class: abee
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                ((eksl) ((eksl) ((eksl) abes.a.j()).g((Exception) obj)).h("com/google/android/apps/messaging/dittosatellite/backgroundhandler/SatelliteBackgroundHandlerManagerImpl", "tryToStartOrResumeBackgroundHandler", 116, "SatelliteBackgroundHandlerManagerImpl.java")).q("Could not start the background handler service.");
                return false;
            }
        }, this.c);
    }

    public final eiju e(final Function function) {
        eopk eopkVar = new eopk() { // from class: aben
            @Override // defpackage.eopk
            public final eopy a(eopt eoptVar) {
                abes abesVar = this.a;
                Context context = abesVar.b;
                Intent intent = abesVar.d;
                context.startService(intent);
                AtomicReference atomicReference = abesVar.f;
                if (((Optional) atomicReference.get()).isEmpty()) {
                    ((eksl) ((eksl) abes.a.h()).h("com/google/android/apps/messaging/dittosatellite/backgroundhandler/SatelliteBackgroundHandlerManagerImpl", "attachServiceHealthMonitoringConnection", 249, "SatelliteBackgroundHandlerManagerImpl.java")).q("HealthMonitoringConnection connecting");
                    aber aberVar = new aber(abesVar);
                    Optional optionalEmpty = Optional.empty();
                    Optional optionalOf = Optional.of(aberVar);
                    while (true) {
                        if (atomicReference.compareAndSet(optionalEmpty, optionalOf)) {
                            context.bindService(intent, aberVar, 20);
                            break;
                        }
                        if (atomicReference.get() != optionalEmpty) {
                            break;
                        }
                    }
                }
                abeq abeqVar = new abeq();
                eoptVar.a(eiid.i(new abeo(abesVar, intent, abeqVar)), eoqg.a);
                return eijs.c(abeqVar.b).a;
            }
        };
        Executor executor = this.h;
        eijs eijsVarE = eijs.e(eopkVar, executor);
        eopl eoplVar = new eopl() { // from class: abei
            @Override // defpackage.eopl
            public final eopy a(eopt eoptVar, Object obj) {
                Optional optional = (Optional) obj;
                eksp ekspVar = abes.a;
                optional.getClass();
                if (optional.isPresent()) {
                    return eijs.c((ListenableFuture) function.apply((abex) optional.get())).a;
                }
                throw new CancellationException();
            }
        };
        eosc eoscVar = this.c;
        final eiju eijuVarH = eijsVarE.g(eoplVar, eoscVar).h();
        return eijx.g(new Callable() { // from class: abej
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return Boolean.valueOf(this.a.e.add(eijuVarH));
            }
        }, executor).i(new eooz() { // from class: abek
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                eksp ekspVar = abes.a;
                return eijuVarH;
            }
        }, eoscVar).h(new ejvr() { // from class: abel
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                Boolean bool = (Boolean) obj;
                this.a.e.remove(eijuVarH);
                return bool;
            }
        }, executor).f(Exception.class, new eooz() { // from class: abem
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                abes abesVar = this.a;
                final Exception exc = (Exception) obj;
                abesVar.e.remove(eijuVarH);
                ((eksl) ((eksl) abes.a.h()).h("com/google/android/apps/messaging/dittosatellite/backgroundhandler/SatelliteBackgroundHandlerManagerImpl", "makeAsyncCallOnBoundBackgroundHandlerServicePeer", 208, "SatelliteBackgroundHandlerManagerImpl.java")).q("Stopping Ditto background service due to an exception");
                return abesVar.c().h(new ejvr() { // from class: abdz
                    @Override // defpackage.ejvr
                    public final Object apply(Object obj2) {
                        eksp ekspVar = abes.a;
                        Exception exc2 = exc;
                        if (!(exc2 instanceof RuntimeException)) {
                            throw new IllegalStateException(exc2);
                        }
                        exc2.getClass();
                        throw ((RuntimeException) exc2);
                    }
                }, abesVar.c);
            }
        }, executor);
    }

    public final void f() {
        Set set = this.e;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ((eiju) it.next()).cancel(false);
        }
        set.clear();
    }
}
