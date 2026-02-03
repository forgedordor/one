package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ablu implements ablf {
    public final abka a;
    public final AtomicReference b = new AtomicReference(Optional.empty());
    final /* synthetic */ abmq c;

    public ablu(abmq abmqVar, abka abkaVar) {
        this.c = abmqVar;
        this.a = abkaVar;
    }

    @Override // defpackage.ablf
    public final abmj a() {
        return abmj.CONNECTED;
    }

    @Override // defpackage.ablf
    public final abmj b() {
        return abmj.CONNECTING;
    }

    @Override // defpackage.ablf
    public final eiju c() {
        abmq abmqVar = this.c;
        abmqVar.g.b(abmqVar.j);
        eiju eijuVarE = e(3);
        ejvr ejvrVar = new ejvr() { // from class: ablr
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                abmq abmqVar2 = this.a.c;
                Void r4 = (Void) obj;
                abmqVar2.g.k(abmqVar2.j);
                abmqVar2.e.c("Bugle.Satellite.DittoLoadSuccess.Count");
                return r4;
            }
        };
        eosc eoscVar = abmqVar.c;
        return eijuVarE.h(ejvrVar, eoscVar).e(Exception.class, new ejvr() { // from class: abls
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                abmq abmqVar2 = this.a.c;
                Exception exc = (Exception) obj;
                abmqVar2.g.e(abmqVar2.j);
                if (exc instanceof RuntimeException) {
                    throw ((RuntimeException) exc);
                }
                throw new IllegalStateException(exc);
            }
        }, eoscVar);
    }

    @Override // defpackage.ablf
    public final void d() {
        ((Optional) this.b.getAndSet(Optional.empty())).ifPresent(new Consumer() { // from class: ablo
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void z(Object obj) {
                ablu abluVar = this.a;
                abmq abmqVar = abluVar.c;
                ((abpk) abmqVar.b.b()).b(abmqVar.i, (abto) obj);
                final abka abkaVar = abluVar.a;
                abkaVar.getClass();
                eijx.f(new Runnable() { // from class: abln
                    @Override // java.lang.Runnable
                    public final void run() {
                        abkaVar.b();
                    }
                }, abmqVar.d).k(auvh.b(), abmqVar.c);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
    }

    public final eiju e(final int i) {
        if (i == 0) {
            throw new ablh();
        }
        Callable callable = new Callable() { // from class: ablt
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.a.a.a(ekoj.a);
            }
        };
        abmq abmqVar = this.c;
        eosc eoscVar = abmqVar.d;
        eiju eijuVarI = eijx.g(callable, eoscVar).i(new eooz() { // from class: abli
            /* JADX WARN: Removed duplicated region for block: B:49:0x0141 A[EXC_TOP_SPLITTER, SYNTHETIC] */
            /* JADX WARN: Type inference failed for: r0v13, types: [abqh, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r2v4, types: [abqh, java.lang.Object] */
            @Override // defpackage.eooz
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final com.google.common.util.concurrent.ListenableFuture a(java.lang.Object r15) {
                /*
                    Method dump skipped, instructions count: 422
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.abli.a(java.lang.Object):com.google.common.util.concurrent.ListenableFuture");
            }
        }, eoscVar);
        eooz eoozVar = new eooz() { // from class: ablj
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                abtc abtcVar = (abtc) obj;
                ((eksl) ((eksl) ((eksl) abmq.a.j()).g(abtcVar)).h("com/google/android/apps/messaging/dittosatellite/impl/JsBridgeDittoControllerV2$ConnectOperation", "startWebViewInternal", (char) 554, "JsBridgeDittoControllerV2.java")).q("WebView load failed.");
                ablu abluVar = this.a;
                abluVar.d();
                abtcVar.getClass();
                abluVar.c.e.e("Bugle.Satellite.DittoLoadFailure.LoadError", abtcVar.a.getErrorCode());
                return abluVar.e(i - 1);
            }
        };
        eosc eoscVar2 = abmqVar.c;
        return eijuVarI.f(abtc.class, eoozVar, eoscVar2).f(TimeoutException.class, new eooz() { // from class: ablk
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                ((eksl) ((eksl) ((eksl) abmq.a.j()).g((TimeoutException) obj)).h("com/google/android/apps/messaging/dittosatellite/impl/JsBridgeDittoControllerV2$ConnectOperation", "startWebViewInternal", 566, "JsBridgeDittoControllerV2.java")).q("WebView connection timed out.");
                ablu abluVar = this.a;
                abluVar.d();
                abluVar.c.e.c("Bugle.Satellite.DittoLoadFailure.JsBridgeTimeoutError.Count");
                return abluVar.e(i - 1);
            }
        }, eoscVar2);
    }
}
