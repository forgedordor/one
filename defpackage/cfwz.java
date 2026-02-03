package defpackage;

import io.grpc.Status;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import org.chromium.net.NetworkException;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cfwz extends cayv implements cfwu {
    public static final cqce a = cqce.g("BugleJobs", "RetryManagerWorker");
    public final eygg b;
    private final eygg e;
    private final eosc f;
    private final eosc g;
    public final Object c = new Object();
    private boolean h = false;
    public boolean d = false;

    public cfwz(eygg eyggVar, eygg eyggVar2, eosc eoscVar, eosc eoscVar2) {
        this.b = eyggVar;
        this.e = eyggVar2;
        this.f = eoscVar;
        this.g = eoscVar2;
    }

    private final eiju k() {
        a.m("Executing retry job");
        return ((cfwt) this.e.b()).d();
    }

    @Override // defpackage.cayv, defpackage.cazg
    public final caya a() {
        caxz caxzVarL = caya.l();
        pzh pzhVar = new pzh();
        pzhVar.c(2);
        ((caxk) caxzVarL).a = pzhVar.a();
        caxzVarL.f(pza.a);
        caxzVarL.g(TimeUnit.SECONDS.toMillis(((Integer) bvfd.f.e()).intValue()));
        return caxzVarL.a();
    }

    @Override // defpackage.cazg
    public final eieu b() {
        return eiiy.k("RetryManagerWorkerImpl");
    }

    @Override // defpackage.cfwu
    public final void c(Status status, cfxa cfxaVar) {
        if (status.getCode() == Status.Code.OK) {
            synchronized (this.c) {
                if (this.h) {
                    this.d = false;
                    cqce cqceVar = a;
                    cqceVar.m(String.format("report(%s) canceling retry on RPC success", "ONE_OFF"));
                    this.h = false;
                    cqceVar.m("Canceling previously scheduled RetryManagerWorker.");
                    eijx.g(new Callable() { // from class: cfwx
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            ((cazj) this.a.b.b()).f("retry_manager");
                            return true;
                        }
                    }, this.g).k(auwc.a(new cfwy()), this.f);
                    k();
                }
            }
            return;
        }
        if (!cems.c(status.getCode())) {
            cfxaVar.l();
            a.m(a.E(status, "report(ONE_OFF) ignoring non-retriable error "));
            return;
        }
        cfxaVar.k();
        synchronized (this.c) {
            if (this.h) {
                this.d = true;
                a.m(String.format("report(%s) retry scheduled already, setting pendingRetry bit for error %s", "ONE_OFF", status));
            } else {
                if (status != null) {
                    Throwable th = status.t;
                    if ((th instanceof NetworkException) && ((NetworkException) th).immediatelyRetryable()) {
                        a.m(String.format("report(%s) retrying immediately for error %s", "ONE_OFF", status));
                        k();
                    }
                }
                cqce cqceVar2 = a;
                cqceVar2.m(String.format("report(%s) scheduling retry for error %s", "ONE_OFF", status));
                this.h = true;
                cqceVar2.m("Scheduling RetryManagerWorker.");
                ((cazj) this.b.b()).a(cbcu.f("retry_manager", caxy.a));
            }
        }
    }

    @Override // defpackage.cazg
    public final evuo d() {
        return caxy.a.getParserForType();
    }

    @Override // defpackage.cayv
    public final /* bridge */ /* synthetic */ eiju j(cayy cayyVar, evuh evuhVar) {
        a.m("Retrying...");
        return k().h(new ejvr() { // from class: cfwv
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                cfwz cfwzVar = this.a;
                synchronized (cfwzVar.c) {
                    if (!cfwzVar.d) {
                        return cbcw.i();
                    }
                    cfwzVar.d = false;
                    cfwz.a.r("Reschedule the retry");
                    return cbcw.m();
                }
            }
        }, this.f).e(fbtf.class, new ejvr() { // from class: cfww
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                fbtf fbtfVar = (fbtf) obj;
                if (cems.d(fbtfVar)) {
                    cqbd cqbdVarE = cfwz.a.e();
                    cqbdVarE.I("Failing Ditto retry worker with retriable gRPC error");
                    cqbdVarE.A("status", fbtfVar.a);
                    cqbdVarE.r();
                    return cbcw.m();
                }
                cqbd cqbdVarE2 = cfwz.a.e();
                cqbdVarE2.I("Failing Ditto retry worker with non-retriable gRPC error");
                cqbdVarE2.A("status", fbtfVar.a);
                cqbdVarE2.r();
                return cbcw.k();
            }
        }, eoqg.a);
    }
}
