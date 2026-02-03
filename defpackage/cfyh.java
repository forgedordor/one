package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import io.grpc.Status;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cfyh implements cfya {
    public static final cqce a = cqce.g("BugleNetworkRetry", "DittoRetryExecutorImpl");
    private static final ekrg m = ekrg.c("com/google/android/apps/messaging/shared/net/retry/ditto/DittoRetryExecutorImpl");
    public final eosc b;

    @Deprecated
    public final cezv c;
    public final eygg d;
    public final eygg e;
    public final eygg f;
    public final ains g;
    public final cenj h;
    public final fcsu i;
    public final ceku j;
    public final cepf k;
    public final fcsu l;
    private final eygg n;
    private final fcsu o;
    private final fcsu p;

    public cfyh(eosc eoscVar, cezv cezvVar, eygg eyggVar, eygg eyggVar2, eygg eyggVar3, ains ainsVar, cenj cenjVar, fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, ceku cekuVar, cepf cepfVar, eygg eyggVar4, fcsu fcsuVar4) {
        this.b = eoscVar;
        this.c = cezvVar;
        this.d = eyggVar;
        this.e = eyggVar2;
        this.f = eyggVar3;
        this.g = ainsVar;
        this.h = cenjVar;
        this.i = fcsuVar2;
        this.j = cekuVar;
        this.k = cepfVar;
        this.l = fcsuVar;
        this.n = eyggVar4;
        this.o = fcsuVar4;
        this.p = fcsuVar3;
    }

    private final eiju d(final cfeg cfegVar, boolean z) {
        if (!((apsa) this.p.b()).a()) {
            cfegVar.r();
            if (!e()) {
                return eijx.c();
            }
        } else {
            if (!e()) {
                return eijx.c();
            }
            cfegVar.r();
        }
        final ceku cekuVar = ((cdio) this.l.b()).a() ? (ceku) this.i.b() : this.j;
        eiju eijuVarC = c(cfegVar, cekuVar.w());
        eooz eoozVar = new eooz() { // from class: cfye
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                Throwable th = (Throwable) obj;
                if (cems.a(th) != Status.Code.UNAUTHENTICATED) {
                    return eijx.d(th);
                }
                ceku cekuVar2 = cekuVar;
                cfeg cfegVar2 = cfegVar;
                cfyh cfyhVar = this.a;
                cfyh.a.m("Handle UNAUTHENTICATED error by immediately refreshing registration.");
                return cfyhVar.c(cfegVar2, cekuVar2.m(cedo.FORCE_REFRESH));
            }
        };
        eosc eoscVar = this.b;
        eiju eijuVarI = eijuVarC.f(Throwable.class, eoozVar, eoscVar).i(new eooz() { // from class: cfyf
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                cfeg cfegVar2 = cfegVar;
                ListenableFuture listenableFutureE = cfegVar2.e((ezjn) obj);
                cfegVar2.j();
                return listenableFutureE;
            }
        }, eoqg.a);
        eika.l(eijuVarI, new cfyg(this, cfegVar, z), eoscVar);
        return eijuVarI;
    }

    private final boolean e() {
        for (bvmk bvmkVar : (Set) this.n.b()) {
            if (!bvmkVar.b()) {
                ekrw ekrwVarE = m.e();
                ekrwVarE.X(eksq.a, "BugleNetworkRetry");
                ((ekrd) ((ekrd) ekrwVarE).h("com/google/android/apps/messaging/shared/net/retry/ditto/DittoRetryExecutorImpl", "areDittoRpcsEnabled", 240, "DittoRetryExecutorImpl.java")).t("Ignoring execute RPC with reason %s", bvmkVar.a());
                ((bvio) this.o.b()).d(bvmkVar.a().d);
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.cfya
    public final eiju a(cfeg cfegVar) {
        this.g.c("Bugle.Ditto.RetryExecutor.Rpc.Execution.Count");
        return d(cfegVar, true);
    }

    @Override // defpackage.cfya
    public final eiju b(cfeg cfegVar) {
        return d(cfegVar, false);
    }

    public final eiju c(final cfeg cfegVar, eiju eijuVar) {
        eooz eoozVar = new eooz() { // from class: cfyb
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                ezns eznsVar = (ezns) obj;
                eznsVar.getClass();
                cfyh cfyhVar = this.a;
                boolean zA = ((cdio) cfyhVar.l.b()).a();
                cfeg cfegVar2 = cfegVar;
                ezpo ezpoVarA = cfyhVar.h.a(zA ? cfegVar2.p() : "Bugle");
                evqs evqsVar = eznsVar.b;
                ezpoVarA.copyOnWrite();
                ezpp ezppVar = (ezpp) ezpoVarA.instance;
                ezpp ezppVar2 = ezpp.a;
                evqsVar.getClass();
                ezppVar.f = evqsVar;
                return cfegVar2.c((ezpp) ezpoVarA.build());
            }
        };
        eosc eoscVar = this.b;
        return eijuVar.i(eoozVar, eoscVar).i(new eooz() { // from class: cfyc
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                ezjl ezjlVar = (ezjl) obj;
                ezjlVar.getClass();
                long serializedSize = ezjlVar.getSerializedSize();
                cfyh cfyhVar = this.a;
                cfyhVar.g.g("Bugle.Network.Rpc.Request.Size.Bytes", serializedSize);
                cfeg cfegVar2 = cfegVar;
                cfegVar2.i();
                return cfegVar2.d(cfyhVar.c, ezjlVar);
            }
        }, eoscVar);
    }
}
