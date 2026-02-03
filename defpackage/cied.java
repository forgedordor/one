package defpackage;

import com.google.android.rcs.client.lifecycle.RcsEngineLifecycleService;
import com.google.android.rcs.client.lifecycle.RcsEngineLifecycleServiceResult;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeoutException;
import java.util.function.BiFunction;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cied {
    public static final cqce a = cqce.g("BugleRcs", "RcsEngineLifecycleManager");
    public final eosc b;
    public final fcsu c;
    public final crso d;
    private final fcsu e;
    private final BiFunction f;

    public cied(fcsu fcsuVar, BiFunction biFunction, fcsu fcsuVar2, crso crsoVar, eosc eoscVar) {
        this.b = eoscVar;
        this.e = fcsuVar;
        this.f = biFunction;
        this.c = fcsuVar2;
        this.d = crsoVar;
    }

    public final eiju a(final boolean z, final String str) {
        eiju eijuVarA = ((crru) this.e.b()).a(this.f, RcsEngineLifecycleService.class);
        eooz eoozVar = new eooz() { // from class: cidx
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                cied ciedVar = this.a;
                final RcsEngineLifecycleService rcsEngineLifecycleService = (RcsEngineLifecycleService) obj;
                final String str2 = str;
                final eiju eijuVarA2 = z ? ciedVar.d.a(new Callable() { // from class: cidu
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return rcsEngineLifecycleService.triggerStartRcsStack(str2);
                    }
                }) : ciedVar.d.a(new Callable() { // from class: cidv
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return rcsEngineLifecycleService.triggerStopRcsStack(str2);
                    }
                });
                return eijx.k(eijuVarA2).b(new eooy() { // from class: cidw
                    @Override // defpackage.eooy
                    public final ListenableFuture a() {
                        rcsEngineLifecycleService.disconnect();
                        return eijuVarA2;
                    }
                }, ciedVar.b);
            }
        };
        eosc eoscVar = this.b;
        return eijuVarA.i(eoozVar, eoscVar).e(efao.class, new ejvr() { // from class: cidy
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                ((ains) this.a.c.b()).c("Bugle.Rcs.WaitForServiceState.Throw.JibeServiceException.Counts");
                cied.a.s("JibeServiceException was raised while calling RcsEngineLifecycleService", (efao) obj);
                return new RcsEngineLifecycleServiceResult(1);
            }
        }, eoscVar).e(TimeoutException.class, new ejvr() { // from class: cidz
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                cied.a.o("TimeoutException was raised while waiting to connect to RcsEngineLifecycleService", (TimeoutException) obj);
                return new RcsEngineLifecycleServiceResult(14);
            }
        }, eoscVar).e(IllegalArgumentException.class, new ejvr() { // from class: ciea
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                cied.a.o("IllegalArgumentException was raised while waiting to connect to RcsEngineLifecycleService", (IllegalArgumentException) obj);
                return new RcsEngineLifecycleServiceResult(1);
            }
        }, eoscVar).e(SecurityException.class, new ejvr() { // from class: cieb
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                cied.a.o("SecurityException was raised while waiting to connect to RcsEngineLifecycleService", (SecurityException) obj);
                return new RcsEngineLifecycleServiceResult(1);
            }
        }, eoscVar).e(crsk.class, new ejvr() { // from class: ciec
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                cied.a.o("RcsServiceConnectionException was raised while waiting to connect to RcsEngineLifecycleService", (crsk) obj);
                return new RcsEngineLifecycleServiceResult(1);
            }
        }, eoscVar);
    }
}
