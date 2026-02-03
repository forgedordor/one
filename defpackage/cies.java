package defpackage;

import com.google.android.ims.rcs.engine.RcsEngineLifecycleServiceResult;
import com.google.android.rcs.client.lifecycle.RcsEngineLifecycleServiceV2;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeoutException;
import java.util.function.BiFunction;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cies {
    public static final cqce a = cqce.g("BugleRcs", "RcsEngineLifecycleManagerV2");
    public final crso b;
    public final eosc c;
    public final fcsu d;
    private final fcsu e;
    private final BiFunction f;

    public cies(fcsu fcsuVar, BiFunction biFunction, fcsu fcsuVar2, crso crsoVar, eosc eoscVar) {
        this.b = crsoVar;
        this.c = eoscVar;
        this.e = fcsuVar;
        this.f = biFunction;
        this.d = fcsuVar2;
    }

    public final eiju a(final cier cierVar, final boolean z) {
        eiju eijuVarA = ((crru) this.e.b()).a(this.f, RcsEngineLifecycleServiceV2.class);
        eooz eoozVar = new eooz() { // from class: cieh
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                final cier cierVar2 = cierVar;
                cies ciesVar = this.a;
                final RcsEngineLifecycleServiceV2 rcsEngineLifecycleServiceV2 = (RcsEngineLifecycleServiceV2) obj;
                final eiju eijuVarA2 = z ? ciesVar.b.a(new Callable() { // from class: ciej
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return cierVar2.a(rcsEngineLifecycleServiceV2);
                    }
                }) : eijx.g(new Callable() { // from class: ciek
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return cierVar2.a(rcsEngineLifecycleServiceV2);
                    }
                }, ciesVar.c);
                return eijx.k(eijuVarA2).b(new eooy() { // from class: ciel
                    @Override // defpackage.eooy
                    public final ListenableFuture a() {
                        rcsEngineLifecycleServiceV2.disconnect();
                        return eijuVarA2;
                    }
                }, ciesVar.c);
            }
        };
        eosc eoscVar = this.c;
        return eijuVarA.i(eoozVar, eoscVar).e(efao.class, new ejvr() { // from class: cien
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                ((ains) this.a.d.b()).c("Bugle.Rcs.WaitForServiceState.Throw.JibeServiceException.Counts");
                cies.a.s("JibeServiceException was raised while calling RcsEngineLifecycleServiceV2", (efao) obj);
                return new RcsEngineLifecycleServiceResult(1);
            }
        }, eoscVar).e(TimeoutException.class, new ejvr() { // from class: cieo
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                cies.a.o("TimeoutException was raised while waiting to connect to RcsEngineLifecycleServiceV2", (TimeoutException) obj);
                return new RcsEngineLifecycleServiceResult(14);
            }
        }, eoscVar).e(IllegalArgumentException.class, new ejvr() { // from class: ciep
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                cies.a.o("IllegalArgumentException was raised while waiting to connect to RcsEngineLifecycleServiceV2", (IllegalArgumentException) obj);
                return new RcsEngineLifecycleServiceResult(1);
            }
        }, eoscVar).e(IllegalStateException.class, new ejvr() { // from class: cieq
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                cies.a.o("IllegalStateException was raised while waiting to connect to RcsEngineLifecycleServiceV2", (IllegalStateException) obj);
                return new RcsEngineLifecycleServiceResult(1);
            }
        }, eoscVar).e(SecurityException.class, new ejvr() { // from class: cief
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                cies.a.o("SecurityException was raised while waiting to connect to RcsEngineLifecycleServiceV2", (SecurityException) obj);
                return new RcsEngineLifecycleServiceResult(1);
            }
        }, eoscVar).e(crsk.class, new ejvr() { // from class: cieg
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                cies.a.o("RcsServiceConnectionException was raised while waiting to connect to RcsEngineLifecycleServiceV2", (crsk) obj);
                return new RcsEngineLifecycleServiceResult(1);
            }
        }, eoscVar);
    }

    public final eiju b(ewwt ewwtVar, int i) {
        ewwq ewwqVar = (ewwq) ewwr.a.createBuilder();
        ewwqVar.copyOnWrite();
        ewwr ewwrVar = (ewwr) ewwqVar.instance;
        ewwrVar.b |= 1;
        ewwrVar.c = i;
        ewwqVar.copyOnWrite();
        ewwr ewwrVar2 = (ewwr) ewwqVar.instance;
        ewwrVar2.d = ewwtVar.d;
        ewwrVar2.b |= 2;
        final ewwr ewwrVar3 = (ewwr) ewwqVar.build();
        return a(new cier() { // from class: ciei
            @Override // defpackage.cier
            public final RcsEngineLifecycleServiceResult a(RcsEngineLifecycleServiceV2 rcsEngineLifecycleServiceV2) {
                return rcsEngineLifecycleServiceV2.initializeAndStartRcsTransport(new dhdt(ewwrVar3));
            }
        }, true);
    }

    public final eiju c(ewwt ewwtVar, List list) {
        ewwu ewwuVar = (ewwu) ewwv.a.createBuilder();
        ewwuVar.copyOnWrite();
        ewwv ewwvVar = (ewwv) ewwuVar.instance;
        evsx evsxVar = ewwvVar.c;
        if (!evsxVar.c()) {
            ewwvVar.c = evsn.mutableCopy(evsxVar);
        }
        evpz.addAll(list, ewwvVar.c);
        ewwuVar.copyOnWrite();
        ewwv ewwvVar2 = (ewwv) ewwuVar.instance;
        ewwvVar2.d = ewwtVar.d;
        ewwvVar2.b |= 1;
        final ewwv ewwvVar3 = (ewwv) ewwuVar.build();
        return a(new cier() { // from class: ciem
            @Override // defpackage.cier
            public final RcsEngineLifecycleServiceResult a(RcsEngineLifecycleServiceV2 rcsEngineLifecycleServiceV2) {
                return rcsEngineLifecycleServiceV2.stopAllRcsTransportsExcept(new dhdu(ewwvVar3));
            }
        }, false);
    }
}
