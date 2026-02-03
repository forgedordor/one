package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import io.grpc.Status;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dwhb implements dwgk {
    private final dwje a;
    private final String b;
    private final dwqw c;

    public dwhb(dwje dwjeVar, String str, dwqw dwqwVar) {
        this.a = dwjeVar;
        this.b = str;
        this.c = dwqwVar;
    }

    @Override // defpackage.dwgk
    public final ListenableFuture a(ezpp ezppVar) {
        eykn eyknVar = (eykn) eyko.a.createBuilder();
        eyknVar.copyOnWrite();
        eyko eykoVar = (eyko) eyknVar.instance;
        ezppVar.getClass();
        eykoVar.c = ezppVar;
        eykoVar.b |= 1;
        eyknVar.copyOnWrite();
        ((eyko) eyknVar.instance).d = 1;
        eykl eyklVar = (eykl) eykm.a.createBuilder();
        eyklVar.copyOnWrite();
        eykm eykmVar = (eykm) eyklVar.instance;
        eykmVar.b = 1;
        eykmVar.c = this.b;
        eyknVar.copyOnWrite();
        eyko eykoVar2 = (eyko) eyknVar.instance;
        eykm eykmVar2 = (eykm) eyklVar.build();
        eykmVar2.getClass();
        eykoVar2.e = eykmVar2;
        eykoVar2.b |= 2;
        eyknVar.copyOnWrite();
        ((eyko) eyknVar.instance).f = eyki.a(5);
        return eork.i((eyko) eyknVar.build());
    }

    @Override // defpackage.dwgk
    public final /* bridge */ /* synthetic */ ListenableFuture b(ListenableFuture listenableFuture, Object obj) {
        final eyko eykoVar = (eyko) obj;
        return eooq.g(listenableFuture, new eooz() { // from class: dwha
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj2) {
                return ((eyzs) obj2).b(eykoVar);
            }
        }, eoqg.a);
    }

    @Override // defpackage.dwgk
    public final /* bridge */ /* synthetic */ Object c(Object obj) {
        eykq eykqVar = (eykq) obj;
        int i = dwhf.i;
        dwhc dwhcVar = new dwhc();
        eykk eykkVar = eykqVar.b;
        if (eykkVar == null) {
            eykkVar = eykk.a;
        }
        dwhcVar.i((eykkVar.b == 1 ? (eyks) eykkVar.c : eyks.a).c);
        eykk eykkVar2 = eykqVar.b;
        if (eykkVar2 == null) {
            eykkVar2 = eykk.a;
        }
        dwhcVar.c((eykkVar2.b == 1 ? (eyks) eykkVar2.c : eyks.a).d);
        eykk eykkVar3 = eykqVar.b;
        if (eykkVar3 == null) {
            eykkVar3 = eykk.a;
        }
        dwhcVar.g((eykkVar3.b == 1 ? (eyks) eykkVar3.c : eyks.a).e);
        eykk eykkVar4 = eykqVar.b;
        if (eykkVar4 == null) {
            eykkVar4 = eykk.a;
        }
        dwhcVar.d((eykkVar4.b == 1 ? (eyks) eykkVar4.c : eyks.a).f);
        eykk eykkVar5 = eykqVar.b;
        if (eykkVar5 == null) {
            eykkVar5 = eykk.a;
        }
        dwhcVar.b((eykkVar5.b == 1 ? (eyks) eykkVar5.c : eyks.a).g);
        dwqw dwqwVar = this.c;
        dwhcVar.h(dwgp.b(dwqwVar));
        if (fbfm.l()) {
            dvhn.a();
            dwhcVar.e(System.currentTimeMillis() + TimeUnit.DAYS.toMillis(29L));
        }
        return new dwgw(dwqwVar.r(), dwhcVar.a());
    }

    @Override // defpackage.dwgk
    public final void d(UUID uuid, int i, Status status, dvyx dvyxVar, long j) {
        dwhp dwhpVarR = dwhq.r();
        dwhpVarR.g(10003);
        dwje dwjeVar = this.a;
        dwhpVarR.n(dwjeVar.c().f());
        dwhpVarR.o(dwjeVar.d().E());
        dwhpVarR.p(uuid.toString());
        dwhpVarR.j(88);
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
        dwhpVarR.j(88);
        dwhpVarR.f(1);
        dwhpVarR.e(j);
        dvyxVar.b(dwhpVarR.a());
    }
}
