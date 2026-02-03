package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import io.grpc.Status;
import java.util.List;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dwfa implements dwgk {
    private final dwje a;
    private final List b;

    public dwfa(dwje dwjeVar, List list) {
        this.a = dwjeVar;
        this.b = list;
    }

    @Override // defpackage.dwgk
    public final ListenableFuture a(ezpp ezppVar) {
        ezhn ezhnVar = (ezhn) ezho.a.createBuilder();
        ezhnVar.copyOnWrite();
        ezho ezhoVar = (ezho) ezhnVar.instance;
        ezppVar.getClass();
        ezhoVar.c = ezppVar;
        ezhoVar.b |= 1;
        int i = dwei.a;
        ekfw ekfwVar = new ekfw();
        for (String str : this.b) {
            dwje dwjeVar = this.a;
            ezpg ezpgVar = (ezpg) ezph.a.createBuilder();
            ezpgVar.copyOnWrite();
            ezph ezphVar = (ezph) ezpgVar.instance;
            str.getClass();
            ezphVar.c = str;
            ezol ezolVarC = dweb.c(dwjeVar.c().f());
            ezpgVar.copyOnWrite();
            ezph ezphVar2 = (ezph) ezpgVar.instance;
            ezolVarC.getClass();
            ezphVar2.d = ezolVarC;
            ezphVar2.b |= 1;
            ekfwVar.h((ezph) ezpgVar.build());
        }
        ekgb ekgbVarG = ekfwVar.g();
        ezhnVar.copyOnWrite();
        ezho ezhoVar2 = (ezho) ezhnVar.instance;
        ezhoVar2.a();
        evpz.addAll(ekgbVarG, ezhoVar2.d);
        return eork.i((ezho) ezhnVar.build());
    }

    @Override // defpackage.dwgk
    public final /* bridge */ /* synthetic */ ListenableFuture b(ListenableFuture listenableFuture, Object obj) {
        final ezho ezhoVar = (ezho) obj;
        return eooq.g(listenableFuture, new eooz() { // from class: dwez
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj2) {
                return ((eywc) obj2).b(ezhoVar);
            }
        }, eoqg.a);
    }

    @Override // defpackage.dwgk
    public final /* bridge */ /* synthetic */ Object c(Object obj) {
        return null;
    }

    @Override // defpackage.dwgk
    public final void d(UUID uuid, int i, Status status, dvyx dvyxVar, long j) {
        dwhp dwhpVarR = dwhq.r();
        dwhpVarR.g(10003);
        dwje dwjeVar = this.a;
        dwhpVarR.n(dwjeVar.c().f());
        dwhpVarR.o(dwjeVar.d().E());
        dwhpVarR.p(uuid.toString());
        dwhpVarR.j(13);
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
        dwhpVarR.j(13);
        dwhpVarR.f(1);
        dwhpVarR.e(j);
        dvyxVar.b(dwhpVarR.a());
    }
}
