package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import io.grpc.Status;
import java.security.KeyPair;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dwfz implements dwgk {
    private final dwcx a;
    private final dwpk b;
    private final String c;
    private final ListenableFuture d;
    private final cdpp e;
    private final cdpr f;

    public dwfz(dwpk dwpkVar, dvjj dvjjVar, cdpp cdppVar, String str, cdpr cdprVar, ListenableFuture listenableFuture) {
        this.a = new dwcx(dvjjVar);
        this.b = dwpkVar;
        this.e = cdppVar;
        this.c = str;
        this.f = cdprVar;
        this.d = listenableFuture;
    }

    @Override // defpackage.dwgk
    public final ListenableFuture a(final ezpp ezppVar) {
        final ezol ezolVarB = dwcx.b(this.b);
        final ListenableFuture listenableFutureD = dwcx.d();
        final ListenableFuture listenableFutureC = dwcx.c(this.f, ezolVarB.c, ezolVarB.d, null);
        final ListenableFuture listenableFuture = this.d;
        eorg eorgVarD = eork.d(listenableFutureD, listenableFuture, listenableFutureC);
        final dwcx dwcxVar = this.a;
        final String str = this.c;
        return eorgVarD.a(new Callable() { // from class: dwcw
            @Override // java.util.concurrent.Callable
            public final Object call() {
                ezlo ezloVar = (ezlo) ezlp.a.createBuilder();
                ezloVar.copyOnWrite();
                ezlp ezlpVar = (ezlp) ezloVar.instance;
                ezpp ezppVar2 = ezppVar;
                ezppVar2.getClass();
                ezlpVar.c = ezppVar2;
                ezlpVar.b |= 1;
                ezloVar.copyOnWrite();
                ezlp ezlpVar2 = (ezlp) ezloVar.instance;
                ezol ezolVar = ezolVarB;
                ezolVar.getClass();
                ezlpVar2.d = ezolVar;
                ezlpVar2.b |= 2;
                ezlj ezljVarA = dwcxVar.a((String) eork.q(listenableFutureD), str, (String) eork.q(listenableFutureC), ((KeyPair) eork.q(listenableFuture)).getPublic());
                ezloVar.copyOnWrite();
                ezlp ezlpVar3 = (ezlp) ezloVar.instance;
                ezljVarA.getClass();
                ezlpVar3.e = ezljVarA;
                ezlpVar3.b |= 4;
                return (ezlp) ezloVar.build();
            }
        }, eoqg.a);
    }

    @Override // defpackage.dwgk
    public final /* bridge */ /* synthetic */ ListenableFuture b(ListenableFuture listenableFuture, Object obj) {
        final ezlp ezlpVar = (ezlp) obj;
        return eooq.g(listenableFuture, new eooz() { // from class: dwfy
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj2) {
                return ((eyzg) obj2).b(ezlpVar);
            }
        }, eoqg.a);
    }

    @Override // defpackage.dwgk
    public final /* bridge */ /* synthetic */ Object c(Object obj) {
        ezlr ezlrVar = (ezlr) obj;
        int i = 2;
        if ((ezlrVar.b & 2) != 0) {
            try {
                boolean z = ezlrVar.d;
                dwjb dwjbVarE = dwje.e();
                dwin dwinVar = new dwin();
                dwinVar.e(this.b);
                dwjbVarE.f(dwinVar);
                dwjbVarE.d(ezlrVar.g);
                dwjbVarE.e(z ? dwjd.VALID : dwjd.INVALID);
                dwje dwjeVarA = dwjbVarE.a();
                dwjs dwjsVarA = dwju.a();
                ezns eznsVar = ezlrVar.e;
                if (eznsVar == null) {
                    eznsVar = ezns.a;
                }
                dwjsVarA.e(dvhz.a(eznsVar.b.I()));
                dwjsVarA.f((KeyPair) eork.q(this.d));
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                dvhn.a();
                long micros = timeUnit.toMicros(System.currentTimeMillis());
                ezns eznsVar2 = ezlrVar.e;
                if (eznsVar2 == null) {
                    eznsVar2 = ezns.a;
                }
                dwjsVarA.g(micros + eznsVar2.c);
                dvhn.a();
                dwjsVarA.h(System.currentTimeMillis());
                dwju dwjuVarA = dwjsVarA.a();
                dvqk dvqkVar = new dvqk();
                if (true == z) {
                    i = 0;
                }
                dvqkVar.c(i);
                dvqkVar.d(dwjeVarA);
                dvqkVar.b(dwjuVarA);
                return dvqkVar.a();
            } catch (ExecutionException e) {
                dvhv.d("RegRpcHandler", "Failed parsing RegisterResponse.", e);
            }
        }
        dvqk dvqkVar2 = new dvqk();
        dvqkVar2.c(1);
        return dvqkVar2.a();
    }

    @Override // defpackage.dwgk
    public final void d(UUID uuid, int i, Status status, dvyx dvyxVar, long j) {
        dwhp dwhpVarR = dwhq.r();
        dwhpVarR.g(10003);
        dwhpVarR.n(this.b);
        dwhpVarR.p(uuid.toString());
        dwhpVarR.j(2);
        dwhpVarR.m(Integer.valueOf(status.getCode().value()));
        dwhpVarR.f(i);
        dwhpVarR.e(j);
        dvyxVar.b(dwhpVarR.a());
    }

    @Override // defpackage.dwgk
    public final /* synthetic */ void e(UUID uuid, Object obj, dvyx dvyxVar, long j) {
        dvqy dvqyVar = (dvqy) obj;
        if (!dvqyVar.c().g()) {
            dwhp dwhpVarR = dwhq.r();
            dwhpVarR.g(10003);
            dwhpVarR.n(this.b);
            dwhpVarR.p(uuid.toString());
            dwhpVarR.j(2);
            dwhpVarR.f(2);
            dwhpVarR.e(j);
            dvyxVar.b(dwhpVarR.a());
            return;
        }
        dwhp dwhpVarR2 = dwhq.r();
        dwhpVarR2.g(10003);
        dwhpVarR2.n(((dwim) dvqyVar.c().c()).b.f());
        dwhpVarR2.o(((dwim) dvqyVar.c().c()).c.E());
        dwhpVarR2.p(uuid.toString());
        dwhpVarR2.j(2);
        dwhpVarR2.f(1);
        dwhpVarR2.e(j);
        dvyxVar.b(dwhpVarR2.a());
    }
}
