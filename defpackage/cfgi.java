package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import io.grpc.Status;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cfgi {
    public static final cqce a = cqce.g("BugleNetwork", "TachyonConnectionCheckHandler");
    private static final long i = TimeUnit.SECONDS.toMillis(10);
    public final cogw b;
    public final cepf c;
    public final AtomicBoolean d = new AtomicBoolean(false);
    public final AtomicInteger e = new AtomicInteger(-1);
    public final AtomicLong f = new AtomicLong(-1);
    final AtomicBoolean g = new AtomicBoolean(true);
    public final cfgc h;
    private final eosc j;
    private final cqbm k;
    private final cenj l;

    public cfgi(eosc eoscVar, cqbm cqbmVar, cenj cenjVar, cogw cogwVar, cepf cepfVar, cfgc cfgcVar) {
        this.j = eoscVar;
        this.k = cqbmVar;
        this.l = cenjVar;
        this.b = cogwVar;
        this.c = cepfVar;
        this.h = cfgcVar;
    }

    public final void a() {
        long epochMilli = this.b.f().toEpochMilli();
        AtomicBoolean atomicBoolean = this.g;
        if (!atomicBoolean.get() && epochMilli - this.f.get() <= i) {
            a.p("Connectivity check is already going on, cancel current one");
            return;
        }
        atomicBoolean.set(false);
        eiju eijuVarG = eiju.g(((cqey) this.k.a()).i());
        ejvr ejvrVar = new ejvr() { // from class: cfgd
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                cfgi cfgiVar = this.a;
                Boolean bool = (Boolean) obj;
                if (bool == null || !bool.booleanValue()) {
                    cfgi.a.r("Internet connectivity check failed");
                    cfgiVar.d.set(false);
                    return false;
                }
                cfgi.a.p("Internet connectivity check passed");
                cfgiVar.d.set(true);
                return true;
            }
        };
        eosc eoscVar = this.j;
        eiju eijuVarH = eijuVarG.h(ejvrVar, eoscVar);
        ezpp ezppVar = (ezpp) this.l.a("Bugle").build();
        ezil ezilVar = (ezil) ezim.a.createBuilder();
        ezilVar.copyOnWrite();
        ezim ezimVar = (ezim) ezilVar.instance;
        ezppVar.getClass();
        ezimVar.c = ezppVar;
        ezimVar.b |= 1;
        ezim ezimVar2 = (ezim) ezilVar.build();
        a.p("Check Tachyon connectivity");
        eijx.k(eijuVarH, eiju.g(eijx.e(ezimVar2)).i(new eooz() { // from class: cfge
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                return this.a.c.b((ezim) obj);
            }
        }, eoscVar).h(new ejvr() { // from class: cfgf
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                cfgi.a.p("Received EchoResponse");
                this.a.e.set(Status.Code.OK.value());
                return ezio.a;
            }
        }, eoscVar).e(Throwable.class, new ejvr() { // from class: cfgg
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                Status.Code codeA = cems.a((Throwable) obj);
                cqbd cqbdVarE = cfgi.a.e();
                cqbdVarE.I("Tachyon connectivity check failed.");
                cqbdVarE.A("ErrorCode", codeA);
                cqbdVarE.r();
                this.a.e.set(codeA.value());
                return ezio.a;
            }
        }, eoscVar)).a(new Callable() { // from class: cfgh
            @Override // java.util.concurrent.Callable
            public final Object call() {
                cfgi cfgiVar = this.a;
                cfgiVar.g.set(true);
                cfgiVar.f.set(cfgiVar.b.f().toEpochMilli());
                ((bvio) cfgiVar.h.a.b()).b(cfgiVar.d.get(), cfgiVar.e.get());
                return true;
            }
        }, eoscVar).k(auvh.b(), eoscVar);
    }
}
