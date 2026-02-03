package defpackage;

import androidx.car.app.model.Alert;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Optional;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cnop extends cayv {
    public static final eksp a = eksp.c("BugleTelephony");
    public final cnoc b;
    public final fcsu c;
    private final cogw d;
    private final cgbn e;
    private final eosd f;

    public cnop(cogw cogwVar, cnoc cnocVar, cgbn cgbnVar, eosd eosdVar, fcsu fcsuVar) {
        this.d = cogwVar;
        this.b = cnocVar;
        this.e = cgbnVar;
        this.f = eosdVar;
        this.c = fcsuVar;
    }

    @Override // defpackage.cayv, defpackage.cazg
    public final caya a() {
        caxz caxzVarL = caya.l();
        caxzVarL.c(Alert.DURATION_SHOW_INDEFINITELY);
        caxzVarL.b(caze.FOREGROUND_SERVICE);
        ((caxk) caxzVarL).b = this.e.b();
        return caxzVarL.a();
    }

    @Override // defpackage.cazg
    public final eieu b() {
        return eiiy.k("ReverseTelephonySyncWorkItemHandler");
    }

    @Override // defpackage.cazg
    public final evuo d() {
        return cnor.a.getParserForType();
    }

    @Override // defpackage.cayv
    protected final /* bridge */ /* synthetic */ eiju j(cayy cayyVar, evuh evuhVar) {
        cnor cnorVar = (cnor) evuhVar;
        evrj evrjVar = cnorVar.d;
        if (evrjVar == null) {
            evrjVar = evrj.a;
        }
        long jB = evwy.b(evrjVar);
        evvp evvpVar = cnorVar.c;
        if (evvpVar == null) {
            evvpVar = evvp.a;
        }
        long jA = evxc.a(evvpVar) + jB;
        long epochMilli = this.d.f().toEpochMilli();
        eiju eijuVarI = (jA > epochMilli ? eiju.g(this.f.schedule(eiid.l(new Callable() { // from class: cnok
            @Override // java.util.concurrent.Callable
            public final Object call() {
                eksp ekspVar = cnop.a;
                return null;
            }
        }), jA - epochMilli, TimeUnit.MILLISECONDS)) : eijx.e(null)).i(new eooz() { // from class: cnom
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                final cnoc cnocVar = this.a.b;
                return eijx.f(new Runnable() { // from class: cnnn
                    @Override // java.lang.Runnable
                    public final void run() {
                        cnocVar.d(1, Optional.empty());
                    }
                }, cnocVar.d);
            }
        }, this.f);
        ejvr ejvrVar = new ejvr() { // from class: cnon
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                eksp ekspVar = cnop.a;
                return cbcw.i();
            }
        };
        eoqg eoqgVar = eoqg.a;
        return eijuVarI.h(ejvrVar, eoqgVar).f(Throwable.class, new eooz() { // from class: cnoo
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                Throwable th = (Throwable) obj;
                ((eksl) ((eksl) ((eksl) cnop.a.i()).g(th)).h("com/google/android/apps/messaging/shared/telephony/ReverseTelephonySyncWorkItemHandler", "processPendingWorkItemAsync", 'E', "ReverseTelephonySyncWorkItemHandler.java")).q("ReverseTelephonySyncWorkItemHandler failed");
                return ((cden) this.a.c.b()).b(th).h(new ejvr() { // from class: cnol
                    @Override // defpackage.ejvr
                    public final Object apply(Object obj2) {
                        eksp ekspVar = cnop.a;
                        return cbcw.m();
                    }
                }, eoqg.a);
            }
        }, eoqgVar);
    }
}
