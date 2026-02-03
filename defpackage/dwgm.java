package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import io.grpc.Status;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dwgm implements dwgk {
    private final dwje a;

    public dwgm(dwje dwjeVar) {
        this.a = dwjeVar;
    }

    @Override // defpackage.dwgk
    public final ListenableFuture a(ezpp ezppVar) {
        eznh eznhVar = (eznh) ezni.a.createBuilder();
        eznhVar.copyOnWrite();
        ezni ezniVar = (ezni) eznhVar.instance;
        ezppVar.getClass();
        ezniVar.c = ezppVar;
        ezniVar.b |= 1;
        return eork.i((ezni) eznhVar.build());
    }

    @Override // defpackage.dwgk
    public final /* bridge */ /* synthetic */ ListenableFuture b(ListenableFuture listenableFuture, Object obj) {
        final ezni ezniVar = (ezni) obj;
        return eooq.g(listenableFuture, new eooz() { // from class: dwgl
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj2) {
                return ((eyzg) obj2).e(ezniVar);
            }
        }, eoqg.a);
    }

    @Override // defpackage.dwgk
    public final /* synthetic */ Object c(Object obj) {
        dvij dvijVar = new dvij();
        dvijVar.a = 1;
        return dvijVar.a();
    }

    @Override // defpackage.dwgk
    public final void d(UUID uuid, int i, Status status, dvyx dvyxVar, long j) {
        dwhp dwhpVarR = dwhq.r();
        dwhpVarR.g(10003);
        dwje dwjeVar = this.a;
        dwhpVarR.n(dwjeVar.c().f());
        dwhpVarR.o(dwjeVar.d().E());
        dwhpVarR.p(uuid.toString());
        dwhpVarR.j(4);
        dwhpVarR.m(Integer.valueOf(status.getCode().value()));
        dwhpVarR.f(i);
        dwhpVarR.e(j);
        dvyxVar.b(dwhpVarR.a());
    }

    @Override // defpackage.dwgk
    public final /* bridge */ /* synthetic */ void e(UUID uuid, Object obj, dvyx dvyxVar, long j) {
        dwhp dwhpVarR = dwhq.r();
        dwhpVarR.g(10003);
        dwje dwjeVar = this.a;
        dwhpVarR.n(dwjeVar.c().f());
        dwhpVarR.o(dwjeVar.d().E());
        dwhpVarR.p(uuid.toString());
        dwhpVarR.j(4);
        dwhpVarR.f(1);
        dwhpVarR.e(j);
        dvyxVar.b(dwhpVarR.a());
    }
}
