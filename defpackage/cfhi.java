package defpackage;

import io.grpc.Status;
import j$.time.Instant;
import j$.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class cfhi implements fcsf {
    final AtomicBoolean a = new AtomicBoolean(false);
    final /* synthetic */ cfhm b;

    public cfhi(cfhm cfhmVar) {
        this.b = cfhmVar;
        eieu eieuVarK = eiiy.k("InnerReceiveMessagesResponseObserver");
        try {
            ((bvio) cfhmVar.f.b()).q(elxr.BINDING_STARTED, exmt.OK, ((cehg) cfhmVar.u.b()).F(), cfhmVar.J);
            ekrw ekrwVarE = cfhm.c.e();
            ekrwVarE.X(eksq.a, "BugleNetwork");
            ((ekrd) ((ekrd) ekrwVarE).h("com/google/android/apps/messaging/shared/net/handler/bindhandler/BindHandlerImpl$InnerReceiveMessagesResponseObserver", "<init>", 776, "BindHandlerImpl.java")).t("%s BindHandler: New receiveMessages observer, pushing watchdog", emjc.a(cfhmVar.J));
            cfhmVar.g();
            eieuVarK.close();
        } catch (Throwable th) {
            try {
                eieuVarK.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    private final void d() {
        if (this.a.compareAndSet(false, true)) {
            eieu eieuVarK = eiiy.k("InnerReceiveMessagesResponseObserver::onNext::logDittoBindingStatusEvent");
            try {
                cfhm cfhmVar = this.b;
                ((bvio) cfhmVar.f.b()).q(elxr.FIRST_DATA_RECEIVED, exmt.OK, ((cehg) cfhmVar.u.b()).F(), cfhmVar.J);
                eieuVarK.close();
            } catch (Throwable th) {
                try {
                    eieuVarK.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
    }

    @Override // defpackage.fcsf
    public final void a() {
        cfhm cfhmVar = this.b;
        bvio bvioVar = (bvio) cfhmVar.f.b();
        elxr elxrVar = elxr.ON_COMPLETE;
        exmt exmtVar = exmt.OK;
        boolean zF = ((cehg) cfhmVar.u.b()).F();
        int i = cfhmVar.J;
        bvioVar.q(elxrVar, exmtVar, zF, i);
        ekrw ekrwVarH = cfhm.c.h();
        ekrwVarH.X(eksq.a, "BugleNetwork");
        ((ekrd) ((ekrd) ekrwVarH).h("com/google/android/apps/messaging/shared/net/handler/bindhandler/BindHandlerImpl$InnerReceiveMessagesResponseObserver", "onCompleted", 894, "BindHandlerImpl.java")).D("%s BindHandler: onCompleted thread: %s", emjc.a(i), Thread.currentThread().getName());
        cfhmVar.j();
    }

    @Override // defpackage.fcsf
    public final void b(Throwable th) {
        exmt exmtVar;
        final cfhm cfhmVar = this.b;
        fcsu fcsuVar = cfhmVar.f;
        Status statusC = Status.c(th);
        bvio bvioVar = (bvio) fcsuVar.b();
        elxr elxrVar = elxr.ON_ERROR;
        Status.Code code = statusC.getCode();
        switch (code) {
            case OK:
                exmtVar = exmt.OK;
                break;
            case CANCELLED:
                exmtVar = exmt.CANCELLED;
                break;
            case UNKNOWN:
                exmtVar = exmt.UNKNOWN;
                break;
            case INVALID_ARGUMENT:
                exmtVar = exmt.INVALID_ARGUMENT;
                break;
            case DEADLINE_EXCEEDED:
                exmtVar = exmt.DEADLINE_EXCEEDED;
                break;
            case NOT_FOUND:
                exmtVar = exmt.NOT_FOUND;
                break;
            case ALREADY_EXISTS:
                exmtVar = exmt.ALREADY_EXISTS;
                break;
            case PERMISSION_DENIED:
                exmtVar = exmt.PERMISSION_DENIED;
                break;
            case RESOURCE_EXHAUSTED:
                exmtVar = exmt.RESOURCE_EXHAUSTED;
                break;
            case FAILED_PRECONDITION:
                exmtVar = exmt.FAILED_PRECONDITION;
                break;
            case ABORTED:
                exmtVar = exmt.ABORTED;
                break;
            case OUT_OF_RANGE:
                exmtVar = exmt.OUT_OF_RANGE;
                break;
            case UNIMPLEMENTED:
                exmtVar = exmt.UNIMPLEMENTED;
                break;
            case INTERNAL:
                exmtVar = exmt.INTERNAL;
                break;
            case UNAVAILABLE:
                exmtVar = exmt.UNAVAILABLE;
                break;
            case DATA_LOSS:
                exmtVar = exmt.DATA_LOSS;
                break;
            case UNAUTHENTICATED:
                exmtVar = exmt.UNAUTHENTICATED;
                break;
            default:
                throw new IllegalArgumentException("unknown enum value: ".concat(code.toString()));
        }
        boolean zF = ((cehg) cfhmVar.u.b()).F();
        int i = cfhmVar.J;
        bvioVar.q(elxrVar, exmtVar, zF, i);
        ains ainsVar = cfhmVar.v;
        ainsVar.e("Bugle.Binding.Error.Counts", statusC.getCode().value());
        if (th.getCause() instanceof cfhj) {
            ekrw ekrwVarH = cfhm.c.h();
            ekrwVarH.X(eksq.a, "BugleNetwork");
            ((ekrd) ((ekrd) ekrwVarH).h("com/google/android/apps/messaging/shared/net/handler/bindhandler/BindHandlerImpl$InnerReceiveMessagesResponseObserver", "onError", 857, "BindHandlerImpl.java")).t("%s BindHandler: onError is called with IntendedStreamCloseException. No-op.", emjc.a(i));
            return;
        }
        if (th.getCause() instanceof cfhk) {
            ekrw ekrwVarJ = cfhm.c.j();
            ekrwVarJ.X(eksq.a, "BugleNetwork");
            ((ekrd) ((ekrd) ((ekrd) ekrwVarJ).g(th)).h("com/google/android/apps/messaging/shared/net/handler/bindhandler/BindHandlerImpl$InnerReceiveMessagesResponseObserver", "onError", 865, "BindHandlerImpl.java")).t("%s BindHandler: onError triggered due to pong watchdog timeout", emjc.a(i));
        } else {
            ekrw ekrwVarJ2 = cfhm.c.j();
            ekrwVarJ2.X(eksq.a, "BugleNetwork");
            ((ekrd) ((ekrd) ((ekrd) ekrwVarJ2).g(th)).h("com/google/android/apps/messaging/shared/net/handler/bindhandler/BindHandlerImpl$InnerReceiveMessagesResponseObserver", "onError", 869, "BindHandlerImpl.java")).I("%s BindHandler: onError status: %s thread: %s", emjc.a(i), statusC, Thread.currentThread().getName());
        }
        if (!cems.c(statusC.getCode())) {
            if (statusC.getCode() != Status.Code.UNAUTHENTICATED) {
                ekrw ekrwVarH2 = cfhm.c.h();
                ekrwVarH2.X(eksq.a, "BugleNetwork");
                ((ekrd) ((ekrd) ekrwVarH2).h("com/google/android/apps/messaging/shared/net/handler/bindhandler/BindHandlerImpl$InnerReceiveMessagesResponseObserver", "onError", 878, "BindHandlerImpl.java")).t("%s BindHandler: Error is not retriable. Stopping bind handler.", emjc.a(i));
                cfhmVar.j();
                return;
            }
            ekrw ekrwVarH3 = cfhm.c.h();
            ekrwVarH3.X(eksq.a, "BugleNetwork");
            ((ekrd) ((ekrd) ekrwVarH3).h("com/google/android/apps/messaging/shared/net/handler/bindhandler/BindHandlerImpl", "isUnauthenticateAndRetriable", 903, "BindHandlerImpl.java")).t("%s BindHandler: Got Unauthenticated error. Will use refreshed token for next Bind retry", emjc.a(i));
            cfhmVar.l.set(true);
        }
        cfhmVar.i();
        AtomicInteger atomicInteger = cfhmVar.k;
        int i2 = cfhmVar.F;
        int andIncrement = atomicInteger.getAndIncrement();
        int i3 = i2 - andIncrement;
        boolean z = ((cqba) cfhmVar.g.b()).a;
        if (z) {
            ekrw ekrwVarH4 = cfhm.c.h();
            ekrwVarH4.X(eksq.a, "BugleNetwork");
            ((ekrd) ((ekrd) ekrwVarH4).h("com/google/android/apps/messaging/shared/net/handler/bindhandler/BindHandlerImpl", "shouldRetry", 915, "BindHandlerImpl.java")).B("%s BindHandler: Retry bind because app is in foreground count: %d", emjc.a(i), andIncrement);
        } else {
            if (i3 <= 0) {
                ekrg ekrgVar = cfhm.c;
                ekrw ekrwVarH5 = ekrgVar.h();
                ekrz ekrzVar = eksq.a;
                ekrwVarH5.X(ekrzVar, "BugleNetwork");
                ekrd ekrdVar = (ekrd) ((ekrd) ekrwVarH5).h("com/google/android/apps/messaging/shared/net/handler/bindhandler/BindHandlerImpl", "shouldRetry", 926, "BindHandlerImpl.java");
                int i4 = cfhmVar.J;
                ekrdVar.J("%s BindHandler: Not retrying bind count: %d left: %d isForeground: %s", emjc.a(i4), Integer.valueOf(andIncrement), Integer.valueOf(i3), false);
                ekrw ekrwVarH6 = ekrgVar.h();
                ekrwVarH6.X(ekrzVar, "BugleNetwork");
                ((ekrd) ((ekrd) ekrwVarH6).h("com/google/android/apps/messaging/shared/net/handler/bindhandler/BindHandlerImpl", "retryStreamOrCloseSession", 591, "BindHandlerImpl.java")).t("%s BindHandler: No binding retry times left, skip binding retry", emjc.a(i4));
                cfhmVar.v.e("Bugle.Ditto.Binding.Retry.Counts", 1);
                cfhmVar.j();
                return;
            }
            ekrw ekrwVarH7 = cfhm.c.h();
            ekrwVarH7.X(eksq.a, "BugleNetwork");
            ((ekrd) ((ekrd) ekrwVarH7).h("com/google/android/apps/messaging/shared/net/handler/bindhandler/BindHandlerImpl", "shouldRetry", 921, "BindHandlerImpl.java")).I("%s BindHandler: Retry bind count: %d left: %d", emjc.a(i), Integer.valueOf(andIncrement), Integer.valueOf(i3));
        }
        if (andIncrement == 0) {
            ainsVar.e("Bugle.Ditto.Binding.Retry.Counts", 2);
        } else if (andIncrement == 1) {
            ainsVar.e("Bugle.Ditto.Binding.Retry.Counts", 3);
        } else if (andIncrement != 2) {
            ainsVar.e("Bugle.Ditto.Binding.Retry.Counts", 5);
        } else {
            ainsVar.e("Bugle.Ditto.Binding.Retry.Counts", 4);
        }
        double dDoubleValue = ((Double) cfhm.a.e()).doubleValue();
        int iIntValue = ((Integer) cefs.f.e()).intValue();
        int iIntValue2 = ((Integer) cfhm.b.e()).intValue();
        synchronized (cfhmVar.n) {
            ScheduledFuture scheduledFuture = cfhmVar.o;
            if (scheduledFuture != null && !scheduledFuture.isDone()) {
                ekrw ekrwVarE = cfhm.c.e();
                ekrwVarE.X(eksq.a, "BugleNetwork");
                ((ekrd) ((ekrd) ekrwVarE).h("com/google/android/apps/messaging/shared/net/handler/bindhandler/BindHandlerImpl", "randomizeRetryBackOff", 611, "BindHandlerImpl.java")).t("%s BindHandler: RetryTimeoutFuture is running, skipping", emjc.a(i));
                return;
            }
            if (z) {
                andIncrement = Math.min(andIncrement, iIntValue2);
            }
            int iPow = (int) (Math.pow(dDoubleValue, andIncrement) * 1000.0d);
            int iNextInt = iIntValue * (iPow - ThreadLocalRandom.current().nextInt(iPow / 2));
            ekrw ekrwVarH8 = cfhm.c.h();
            ekrwVarH8.X(eksq.a, "BugleNetwork");
            ((ekrd) ((ekrd) ekrwVarH8).h("com/google/android/apps/messaging/shared/net/handler/bindhandler/BindHandlerImpl", "randomizeRetryBackOff", 619, "BindHandlerImpl.java")).B("%s BindHandler: Start binding retry in: %d ms", emjc.a(i), iNextInt);
            cfhmVar.o = cfhmVar.x.schedule(new Runnable() { // from class: cfhd
                @Override // java.lang.Runnable
                public final void run() {
                    cfhm cfhmVar2 = cfhmVar;
                    eieh eiehVarC = cfhmVar2.i.c("BindHandlerImpl#triggerRetryTimeout", "com/google/android/apps/messaging/shared/net/handler/bindhandler/BindHandlerImpl", "triggerRetryTimeout", 643);
                    try {
                        ekrw ekrwVarH9 = cfhm.c.h();
                        ekrwVarH9.X(eksq.a, "BugleNetwork");
                        ((ekrd) ((ekrd) ekrwVarH9).h("com/google/android/apps/messaging/shared/net/handler/bindhandler/BindHandlerImpl", "triggerRetryTimeout", 644, "BindHandlerImpl.java")).t("%s BindHandler: Binding retry timeout triggered", emjc.a(cfhmVar2.J));
                        synchronized (cfhmVar2.n) {
                            cfhmVar2.o = null;
                        }
                        cfhmVar2.e(false);
                        eiehVarC.close();
                    } catch (Throwable th2) {
                        try {
                            eiehVarC.close();
                        } catch (Throwable th3) {
                            th2.addSuppressed(th3);
                        }
                        throw th2;
                    }
                }
            }, iNextInt, TimeUnit.MILLISECONDS);
        }
    }

    @Override // defpackage.fcsf
    public final /* bridge */ /* synthetic */ void c(Object obj) {
        ezlb ezlbVar = (ezlb) obj;
        ekrg ekrgVar = cfhm.c;
        ekrw ekrwVarF = ekrgVar.f();
        ekrz ekrzVar = eksq.a;
        ekrwVarF.X(ekrzVar, "BugleNetwork");
        ekrd ekrdVar = (ekrd) ((ekrd) ekrwVarF).h("com/google/android/apps/messaging/shared/net/handler/bindhandler/BindHandlerImpl$InnerReceiveMessagesResponseObserver", "onNext", 785, "BindHandlerImpl.java");
        ezkm ezkmVarA = ezkm.a(ezlbVar.b);
        cfhm cfhmVar = this.b;
        int i = cfhmVar.J;
        ekrdVar.D("%s BindHandler: Received onNext in BindHandlerImpl body: %s", emjc.a(i), ezkmVarA);
        try {
            cfhmVar.g();
            int iOrdinal = ezkm.a(ezlbVar.b).ordinal();
            if (iOrdinal == 0) {
                cfhm cfhmVar2 = this.b;
                cfhmVar2.v.g("Bugle.Network.Rpc.Response.Size.Bytes", ezlbVar.getSerializedSize());
                ezjj ezjjVar = ezlbVar.b == 2 ? (ezjj) ezlbVar.c : ezjj.a;
                ekrw ekrwVarH = cfhm.c.h();
                ekrwVarH.X(eksq.a, "BugleNetwork");
                ((ekrd) ((ekrd) ekrwVarH).h("com/google/android/apps/messaging/shared/net/handler/bindhandler/BindHandlerImpl", "handleInboxMessage", 453, "BindHandlerImpl.java")).D("%s BindHandler: Received message messageId: %s", emjc.a(cfhmVar2.J), ezjjVar.c);
                cgam cgamVar = (cgam) cfhmVar2.j.b();
                ezku ezkuVar = ezlbVar.d;
                if (ezkuVar == null) {
                    ezkuVar = ezku.a;
                }
                ezji ezjiVarB = ezji.b(ezjjVar.d);
                if (ezjiVarB == null) {
                    ezjiVarB = ezji.UNRECOGNIZED;
                }
                if (ezjiVarB == ezji.TACHYGRAM_MESSAGE) {
                    feby febyVar = (feby) febz.a.createBuilder();
                    cgak cgakVar = new cgak();
                    int i2 = ezkuVar.b;
                    ezkt ezktVar = i2 != 0 ? i2 != 1 ? i2 != 2 ? i2 != 3 ? null : ezkt.INITIAL_PULL_MESSAGES : ezkt.COLLIDER_SECOND_FANOUT_ATTEMPT : ezkt.COLLIDER_FIRST_FANOUT_ATTEMPT : ezkt.UNKNOWN_MESSAGE_ORIGIN;
                    if (ezktVar == null) {
                        ezktVar = ezkt.UNRECOGNIZED;
                    }
                    febu febuVar = (febu) cgakVar.fM(ezktVar);
                    febyVar.copyOnWrite();
                    febz febzVar = (febz) febyVar.instance;
                    febzVar.c = Integer.valueOf(febuVar.a());
                    febzVar.b = 5;
                    febz febzVar2 = (febz) febyVar.build();
                    basd basdVarA = basd.a(ezjjVar.c);
                    febx febxVar = (febx) fecc.a.createBuilder();
                    fhaz fhazVarA = cqdr.a();
                    febxVar.copyOnWrite();
                    fecc feccVar = (fecc) febxVar.instance;
                    fhazVarA.getClass();
                    feccVar.c = fhazVarA;
                    feccVar.b = 1 | feccVar.b;
                    febxVar.copyOnWrite();
                    ((fecc) febxVar.instance).e = fecb.a(9);
                    febxVar.copyOnWrite();
                    ((fecc) febxVar.instance).g = feca.a(50);
                    febv febvVar = (febv) febw.a.createBuilder();
                    febvVar.a(ezjjVar.c);
                    febw febwVar = (febw) febvVar.build();
                    febxVar.copyOnWrite();
                    fecc feccVar2 = (fecc) febxVar.instance;
                    febwVar.getClass();
                    feccVar2.d = febwVar;
                    feccVar2.b = 2 | feccVar2.b;
                    febxVar.copyOnWrite();
                    fecc feccVar3 = (fecc) febxVar.instance;
                    febzVar2.getClass();
                    feccVar3.i = febzVar2;
                    feccVar3.b |= 32;
                    cgamVar.b(basdVarA, febxVar);
                }
                cfhmVar2.h();
                cfhmVar2.z.a(ezjjVar);
            } else if (iOrdinal == 1) {
                Instant instantF = cfhmVar.h.f();
                synchronized (cfhmVar.n) {
                    if (instantF.isAfter(cfhmVar.r)) {
                        ekrw ekrwVarH2 = ekrgVar.h();
                        ekrwVarH2.X(ekrzVar, "BugleNetwork");
                        ((ekrd) ((ekrd) ekrwVarH2).h("com/google/android/apps/messaging/shared/net/handler/bindhandler/BindHandlerImpl$InnerReceiveMessagesResponseObserver", "onNext", 805, "BindHandlerImpl.java")).I("%s BindHandler: Received pong after scheduled idle timeout. Treat it as idle timeout. now: %s idleTimerExpirationTime: %s", emjc.a(i), instantF, cfhmVar.r);
                        cfhmVar.k();
                    }
                }
            }
        } finally {
            d();
        }
    }
}
