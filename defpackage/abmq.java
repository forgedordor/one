package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abmq {
    public static final eksp a = eksp.c("BugleSatelliteBg");
    public final eygg b;
    public final eosc c;
    public final eosc d;
    public final ains e;
    public final abfv f;
    public final aipo g;
    public final eygg h;
    public final abou i;
    public final String j;
    public final AtomicReference k = new AtomicReference(Optional.empty());
    public final AtomicReference l = new AtomicReference(Optional.empty());
    public final abmg m;
    private final aboe n;
    private final fcsu o;

    public abmq(aboe aboeVar, eygg eyggVar, eosc eoscVar, eosc eoscVar2, ains ainsVar, abfv abfvVar, aipo aipoVar, eygg eyggVar2, fcsu fcsuVar, abou abouVar, String str) {
        this.n = aboeVar;
        this.b = eyggVar;
        this.c = eoscVar;
        this.d = eoscVar2;
        this.e = ainsVar;
        this.f = abfvVar;
        this.g = aipoVar;
        this.h = eyggVar2;
        this.o = fcsuVar;
        this.i = abouVar;
        this.j = str;
        this.m = new abmg(eoscVar, abouVar);
    }

    public final abod a() {
        abod abodVarA = this.n.a();
        abodVarA.d = false;
        abodVarA.e();
        return abodVarA;
    }

    public final eiju b() {
        ((eksl) ((eksl) a.h()).h("com/google/android/apps/messaging/dittosatellite/impl/JsBridgeDittoControllerV2", "destroy", 252, "JsBridgeDittoControllerV2.java")).q("Destroying JsBridgeDittoController");
        ((Optional) this.k.getAndSet(Optional.empty())).ifPresent(new Consumer() { // from class: ablb
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void z(Object obj) {
                abmq abmqVar = this.a;
                ((abpk) abmqVar.b.b()).b(abmqVar.i, (abto) obj);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        ((Optional) this.l.getAndSet(Optional.empty())).ifPresent(new Consumer() { // from class: ablc
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void z(Object obj) {
                ((abka) obj).b();
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        final abmg abmgVar = this.m;
        final abmj abmjVar = abmj.DESTROYED;
        return abmgVar.b(null).h(new ejvr() { // from class: ablw
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                abmg abmgVar2 = abmgVar;
                AtomicInteger atomicInteger = abmgVar2.c;
                abmj abmjVar2 = abmjVar;
                ((eksl) ((eksl) abmq.a.h()).h("com/google/android/apps/messaging/dittosatellite/impl/JsBridgeDittoControllerV2$ConnectionStateMachine", "transitionUnchecked", 353, "JsBridgeDittoControllerV2.java")).I("ConnectionStateMachine for %s did an unchecked move from %s to %s", abmgVar2.b.name(), abmj.a(atomicInteger.getAndSet(abmjVar2.ordinal())), abmjVar2);
                return null;
            }
        }, abmgVar.a);
    }

    public final eiju c() {
        final abmg abmgVar = this.m;
        final abmj abmjVarA = abmgVar.a();
        switch (abmjVarA) {
            case NOT_STARTED:
            case PAUSED:
            case PAUSING:
                ((eksl) ((eksl) a.h()).h("com/google/android/apps/messaging/dittosatellite/impl/JsBridgeDittoControllerV2", "pause", 216, "JsBridgeDittoControllerV2.java")).w("Ignoring unnecessary pause(). Current state: %d. Host Type: %s", abmjVarA.ordinal(), this.i);
                return eijx.e(false);
            case CONNECTING:
                final abmj abmjVar = abmj.NOT_STARTED;
                return abmgVar.b(abmjVarA).h(new ejvr() { // from class: ablx
                    @Override // defpackage.ejvr
                    public final Object apply(Object obj) {
                        abmg abmgVar2 = abmgVar;
                        AtomicInteger atomicInteger = abmgVar2.c;
                        abmj abmjVar2 = abmjVar;
                        if (atomicInteger.compareAndSet(abmjVarA.ordinal(), abmjVar2.ordinal())) {
                            ((eksl) ((eksl) abmq.a.h()).h("com/google/android/apps/messaging/dittosatellite/impl/JsBridgeDittoControllerV2$ConnectionStateMachine", "transition", 333, "JsBridgeDittoControllerV2.java")).D("ConnectionStateMachine for %s successfully moved to %s", abmgVar2.b.name(), abmjVar2);
                            return true;
                        }
                        ((eksl) ((eksl) abmq.a.h()).h("com/google/android/apps/messaging/dittosatellite/impl/JsBridgeDittoControllerV2$ConnectionStateMachine", "transition", 338, "JsBridgeDittoControllerV2.java")).D("ConnectionStateMachine for %s preempted before moving to %s", abmgVar2.b.name(), abmjVar2);
                        return false;
                    }
                }, abmgVar.a);
            case CONNECTED:
                return abmgVar.c(abmjVarA, new abmm(this));
            case UNPAUSING:
                ((eksl) ((eksl) a.h()).h("com/google/android/apps/messaging/dittosatellite/impl/JsBridgeDittoControllerV2", "pause", 226, "JsBridgeDittoControllerV2.java")).t("Channel is being unpaused. Cancelling operation. Host Type: %s", this.i);
                eiju eijuVarB = abmgVar.b(abmjVarA);
                ejvr ejvrVar = new ejvr() { // from class: abld
                    @Override // defpackage.ejvr
                    public final Object apply(Object obj) {
                        eksp ekspVar = abmq.a;
                        return true;
                    }
                };
                eosc eoscVar = this.c;
                return eijuVarB.h(ejvrVar, eoscVar).f(CancellationException.class, new eooz() { // from class: able
                    @Override // defpackage.eooz
                    public final ListenableFuture a(Object obj) {
                        eksl ekslVar = (eksl) ((eksl) abmq.a.h()).h("com/google/android/apps/messaging/dittosatellite/impl/JsBridgeDittoControllerV2", "pause", 234, "JsBridgeDittoControllerV2.java");
                        abmq abmqVar = this.a;
                        ekslVar.t("Unpause operation completed. Triggering pause. Host Type: %s", abmqVar.i);
                        return abmqVar.m.c(abmj.PAUSED, new abmm(abmqVar));
                    }
                }, eoscVar);
            case DESTROYED:
                return eijx.d(new IllegalStateException(String.format("Cannot pause channel, service has been destroyed. Host Type: %s", this.i)));
            default:
                throw new IllegalStateException("Unreachable code after pause() switch");
        }
    }

    public final eiju d() {
        abmg abmgVar = this.m;
        abmj abmjVarA = abmgVar.a();
        switch (abmjVarA) {
            case NOT_STARTED:
                ((eksl) ((eksl) a.h()).h("com/google/android/apps/messaging/dittosatellite/impl/JsBridgeDittoControllerV2", "startOrResume", 154, "JsBridgeDittoControllerV2.java")).t("Channel is not open. Starting a new one. Host Type: %s", this.i);
                final abka abkaVar = (abka) this.o.b();
                return abmgVar.c(abmjVarA, new ablu(this, abkaVar)).h(new ejvr() { // from class: abky
                    @Override // defpackage.ejvr
                    public final Object apply(Object obj) {
                        Boolean bool = (Boolean) obj;
                        this.a.l.set(Optional.of(abkaVar));
                        return bool;
                    }
                }, this.c);
            case CONNECTING:
            case CONNECTED:
            case UNPAUSING:
                ((eksl) ((eksl) a.h()).h("com/google/android/apps/messaging/dittosatellite/impl/JsBridgeDittoControllerV2", "startOrResume", 188, "JsBridgeDittoControllerV2.java")).w("Ignoring unnecessary startOrResume(). Current state: %d. Host Type: %s", abmjVarA.ordinal(), this.i);
                return eijx.e(false);
            case PAUSED:
                ((eksl) ((eksl) a.h()).h("com/google/android/apps/messaging/dittosatellite/impl/JsBridgeDittoControllerV2", "startOrResume", 166, "JsBridgeDittoControllerV2.java")).t("Channel is open but paused. Unpausing. Host Type: %s", this.i);
                return abmgVar.c(abmjVarA, new abmp(this));
            case PAUSING:
                ((eksl) ((eksl) a.h()).h("com/google/android/apps/messaging/dittosatellite/impl/JsBridgeDittoControllerV2", "startOrResume", 170, "JsBridgeDittoControllerV2.java")).t("Channel is being paused. Cancelling operation. Host Type: %s", this.i);
                eiju eijuVarB = abmgVar.b(abmjVarA);
                ejvr ejvrVar = new ejvr() { // from class: abkz
                    @Override // defpackage.ejvr
                    public final Object apply(Object obj) {
                        eksp ekspVar = abmq.a;
                        return true;
                    }
                };
                eosc eoscVar = this.c;
                return eijuVarB.h(ejvrVar, eoscVar).f(CancellationException.class, new eooz() { // from class: abla
                    @Override // defpackage.eooz
                    public final ListenableFuture a(Object obj) {
                        eksl ekslVar = (eksl) ((eksl) abmq.a.h()).h("com/google/android/apps/messaging/dittosatellite/impl/JsBridgeDittoControllerV2", "startOrResume", 178, "JsBridgeDittoControllerV2.java");
                        abmq abmqVar = this.a;
                        ekslVar.t("Pause operation completed. Triggering Unpause. Host Type: %s", abmqVar.i);
                        return abmqVar.m.c(abmj.PAUSED, new abmp(abmqVar));
                    }
                }, eoscVar);
            case DESTROYED:
                return eijx.d(new IllegalStateException(String.format("Cannot start channel, service has been destroyed. Host Type: %s", this.i)));
            default:
                throw new IllegalStateException("Unreachable code after startOrResume() switch");
        }
    }
}
