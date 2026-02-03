package defpackage;

import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class abmg {
    public final Executor a;
    public final abou b;
    public final AtomicInteger c = new AtomicInteger(abmj.NOT_STARTED.ordinal());
    public Optional d = Optional.empty();
    public Optional e = Optional.empty();

    public abmg(ExecutorService executorService, abou abouVar) {
        this.a = new eoss(executorService);
        this.b = abouVar;
    }

    final abmj a() {
        return abmj.a(this.c.get());
    }

    final eiju b(final abmj abmjVar) {
        return eijx.f(new Runnable() { // from class: abmb
            @Override // java.lang.Runnable
            public final void run() {
                final abmg abmgVar = this.a;
                abmj abmjVar2 = abmjVar;
                if (abmjVar2 != null && abmgVar.c.get() != abmjVar2.ordinal()) {
                    throw new CancellationException("Current state did not match");
                }
                abmgVar.d.ifPresent(new Consumer() { // from class: ably
                    @Override // java.util.function.Consumer
                    /* renamed from: accept */
                    public final void z(Object obj) {
                        ((eksl) ((eksl) abmq.a.h()).h("com/google/android/apps/messaging/dittosatellite/impl/JsBridgeDittoControllerV2$ConnectionStateMachine", "cancelInProgressTransition", 466, "JsBridgeDittoControllerV2.java")).q("Explicitly cancelling the lastTransitionAsyncFuture.");
                        ((eiju) obj).cancel(false);
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                });
                abmgVar.d = Optional.empty();
                abmgVar.e.ifPresent(new Consumer() { // from class: ablz
                    @Override // java.util.function.Consumer
                    /* renamed from: accept */
                    public final void z(Object obj) {
                        abmgVar.c.set(((abmj) obj).ordinal());
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                });
                abmgVar.e = Optional.empty();
            }
        }, this.a);
    }

    final eiju c(final abmj abmjVar, final ablf ablfVar) {
        final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        eijs eijsVarC = eijs.c(b(abmjVar));
        eopl eoplVar = new eopl() { // from class: abmc
            @Override // defpackage.eopl
            public final eopy a(eopt eoptVar, Object obj) {
                abmg abmgVar = this.a;
                if (abmgVar.d.isPresent()) {
                    ((eksl) ((eksl) abmq.a.h()).h("com/google/android/apps/messaging/dittosatellite/impl/JsBridgeDittoControllerV2$ConnectionStateMachine", "transitionAsync", 376, "JsBridgeDittoControllerV2.java")).q("Another task interrupted this one. Cancelling.");
                    throw new CancellationException();
                }
                ablf ablfVar2 = ablfVar;
                abmj abmjVar2 = abmjVar;
                if (!abmgVar.c.compareAndSet(abmjVar2.ordinal(), ablfVar2.b().ordinal())) {
                    ((eksl) ((eksl) abmq.a.h()).h("com/google/android/apps/messaging/dittosatellite/impl/JsBridgeDittoControllerV2$ConnectionStateMachine", "transitionAsync", 381, "JsBridgeDittoControllerV2.java")).q("Could not transition to ongoing state. Cancelling.");
                    throw new CancellationException();
                }
                AtomicBoolean atomicBoolean2 = atomicBoolean;
                ((eksl) ((eksl) abmq.a.h()).h("com/google/android/apps/messaging/dittosatellite/impl/JsBridgeDittoControllerV2$ConnectionStateMachine", "transitionAsync", 384, "JsBridgeDittoControllerV2.java")).I("ConnectionStateMachine for %s started async operation by moving from %s to %s", abmgVar.b.name(), abmjVar2, ablfVar2.b());
                eiju eijuVarC = ablfVar2.c();
                eoptVar.a(eiid.i(new ablg(ablfVar2, atomicBoolean2)), eoqg.a);
                abmgVar.d = Optional.of(eijuVarC);
                abmgVar.e = Optional.of(abmjVar2);
                return eijs.c(eijuVarC).a;
            }
        };
        Executor executor = this.a;
        return eijsVarC.g(eoplVar, executor).f(new eopo() { // from class: abmd
            @Override // defpackage.eopo
            public final Object a(eopt eoptVar, Object obj) {
                ablf ablfVar2 = ablfVar;
                int iOrdinal = ablfVar2.b().ordinal();
                int iOrdinal2 = ablfVar2.a().ordinal();
                abmg abmgVar = this.a;
                if (!abmgVar.c.compareAndSet(iOrdinal, iOrdinal2)) {
                    ((eksl) ((eksl) abmq.a.j()).h("com/google/android/apps/messaging/dittosatellite/impl/JsBridgeDittoControllerV2$ConnectionStateMachine", "transitionAsync", 400, "JsBridgeDittoControllerV2.java")).t("Cancelling transition to %s because the state could not be changed", ablfVar2.a());
                    throw new CancellationException();
                }
                AtomicBoolean atomicBoolean2 = atomicBoolean;
                ((eksl) ((eksl) abmq.a.h()).h("com/google/android/apps/messaging/dittosatellite/impl/JsBridgeDittoControllerV2$ConnectionStateMachine", "transitionAsync", 405, "JsBridgeDittoControllerV2.java")).I("ConnectionStateMachine for %s completed async operation by moving from %s to %s", abmgVar.b.name(), ablfVar2.b(), ablfVar2.a());
                atomicBoolean2.set(true);
                abmgVar.d = Optional.empty();
                abmgVar.e = Optional.empty();
                return true;
            }
        }, executor).h().e(CancellationException.class, new ejvr() { // from class: abme
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                eksl ekslVar = (eksl) ((eksl) abmq.a.h()).h("com/google/android/apps/messaging/dittosatellite/impl/JsBridgeDittoControllerV2$ConnectionStateMachine", "transitionAsync", 419, "JsBridgeDittoControllerV2.java");
                ablf ablfVar2 = ablfVar;
                abmg abmgVar = this.a;
                ekslVar.D("ConnectionStateMachine for %s cancelled async operation that would have moved to %s", abmgVar.b.name(), ablfVar2.a());
                abmgVar.d.ifPresent(new Consumer() { // from class: abma
                    @Override // java.util.function.Consumer
                    /* renamed from: accept */
                    public final void z(Object obj2) {
                        ((eiju) obj2).cancel(false);
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                });
                abmgVar.d = Optional.empty();
                abmgVar.c.compareAndSet(ablfVar2.b().ordinal(), abmjVar.ordinal());
                abmgVar.e = Optional.empty();
                return false;
            }
        }, executor).e(Exception.class, new ejvr() { // from class: abmf
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                abmg abmgVar = this.a;
                abmgVar.d.ifPresent(new Consumer() { // from class: ablv
                    @Override // java.util.function.Consumer
                    /* renamed from: accept */
                    public final void z(Object obj2) {
                        ((eiju) obj2).cancel(false);
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                });
                abmgVar.d = Optional.empty();
                ablf ablfVar2 = ablfVar;
                abmgVar.c.compareAndSet(ablfVar2.b().ordinal(), abmjVar.ordinal());
                abmgVar.e = Optional.empty();
                throw new ablh(String.format("Failed during operation to %s for %s", ablfVar2.a(), abmgVar.b.name()), (Exception) obj);
            }
        }, executor);
    }
}
