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
public final class dwgh implements dwgk {
    private final dwcx a;
    private final dwpk b;
    private final String c;
    private final ListenableFuture d;
    private final cdpp e;
    private final cdpr f;

    public dwgh(dwpk dwpkVar, dvjj dvjjVar, cdpp cdppVar, String str, cdpr cdprVar, ListenableFuture listenableFuture) {
        this.a = new dwcx(dvjjVar);
        this.b = dwpkVar;
        this.e = cdppVar;
        this.c = str;
        this.f = cdprVar;
        this.d = listenableFuture;
    }

    @Override // defpackage.dwgk
    public final ListenableFuture a(final ezpp ezppVar) {
        final dwpk dwpkVar = this.b;
        ezol ezolVarB = dwcx.b(dwpkVar);
        final ListenableFuture listenableFutureD = dwcx.d();
        final ListenableFuture listenableFutureC = dwcx.c(this.f, null, ezolVarB.d, dwdu.a(ezppVar.d));
        final ListenableFuture listenableFuture = this.d;
        eorg eorgVarD = eork.d(listenableFutureD, listenableFuture, listenableFutureC);
        final dwcx dwcxVar = this.a;
        final String str = this.c;
        return eorgVarD.a(new Callable() { // from class: dwcu
            @Override // java.util.concurrent.Callable
            public final Object call() {
                ezmq ezmqVar = (ezmq) ezmr.a.createBuilder();
                ezmqVar.copyOnWrite();
                ezmr ezmrVar = (ezmr) ezmqVar.instance;
                ezpp ezppVar2 = ezppVar;
                ezppVar2.getClass();
                ezmrVar.c = ezppVar2;
                ezmrVar.b |= 1;
                String strE = dwpkVar.e();
                ezmqVar.copyOnWrite();
                ((ezmr) ezmqVar.instance).f = strE;
                ezmqVar.copyOnWrite();
                ((ezmr) ezmqVar.instance).e = felt.a(2);
                ezlj ezljVarA = dwcxVar.a((String) eork.q(listenableFutureD), str, (String) eork.q(listenableFutureC), ((KeyPair) eork.q(listenableFuture)).getPublic());
                ezmqVar.copyOnWrite();
                ezmr ezmrVar2 = (ezmr) ezmqVar.instance;
                ezljVarA.getClass();
                ezmrVar2.d = ezljVarA;
                ezmrVar2.b |= 2;
                return (ezmr) ezmqVar.build();
            }
        }, eoqg.a);
    }

    @Override // defpackage.dwgk
    public final /* bridge */ /* synthetic */ ListenableFuture b(ListenableFuture listenableFuture, Object obj) {
        final ezmr ezmrVar = (ezmr) obj;
        return this.b.b() != dwpj.EMAIL ? eork.h(new fbtf(Status.e)) : eooq.g(listenableFuture, new eooz() { // from class: dwgg
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj2) {
                return ((eyzg) obj2).d(ezmrVar);
            }
        }, eoqg.a);
    }

    @Override // defpackage.dwgk
    public final /* bridge */ /* synthetic */ Object c(Object obj) {
        ezmt ezmtVar = (ezmt) obj;
        if ((ezmtVar.b & 4) != 0) {
            try {
                dwjb dwjbVarE = dwje.e();
                dwin dwinVar = new dwin();
                dwinVar.e(this.b);
                dwjbVarE.f(dwinVar);
                dwjbVarE.d(ezmtVar.d);
                dwjbVarE.e(dwjd.VALID);
                dwje dwjeVarA = dwjbVarE.a();
                dwjs dwjsVarA = dwju.a();
                ezns eznsVar = ezmtVar.f;
                if (eznsVar == null) {
                    eznsVar = ezns.a;
                }
                dwjsVarA.e(dvhz.a(eznsVar.b.I()));
                dwjsVarA.f((KeyPair) eork.q(this.d));
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                dvhn.a();
                long micros = timeUnit.toMicros(System.currentTimeMillis());
                ezns eznsVar2 = ezmtVar.f;
                if (eznsVar2 == null) {
                    eznsVar2 = ezns.a;
                }
                dwjsVarA.g(micros + eznsVar2.c);
                dvhn.a();
                dwjsVarA.h(System.currentTimeMillis());
                dwju dwjuVarA = dwjsVarA.a();
                dvqk dvqkVar = new dvqk();
                dvqkVar.c(0);
                dvqkVar.d(dwjeVarA);
                dvqkVar.b(dwjuVarA);
                return dvqkVar.a();
            } catch (ExecutionException e) {
                dvhv.d("RegRpcHandler", "KeyPair get was interupted.", e);
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
        dwhpVarR.j(3);
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
            dwhpVarR.j(3);
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
        dwhpVarR2.j(3);
        dwhpVarR2.f(1);
        dwhpVarR2.e(j);
        dvyxVar.b(dwhpVarR2.a());
    }
}
