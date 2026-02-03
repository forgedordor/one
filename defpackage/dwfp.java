package defpackage;

import android.content.Context;
import com.google.common.util.concurrent.ListenableFuture;
import io.grpc.Status;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dwfp implements dwgk {
    public final String a = UUID.randomUUID().toString();
    private final Context b;
    private final dwje c;
    private final dwpx d;
    private final evqs e;
    private final List f;
    private final boolean g;
    private final eypt h;

    public dwfp(Context context, dwje dwjeVar, dwpx dwpxVar, evqs evqsVar, List list, eypt eyptVar, boolean z) {
        this.b = context;
        this.c = dwjeVar;
        this.d = dwpxVar;
        this.e = evqsVar;
        this.f = list;
        this.h = eyptVar;
        this.g = z;
    }

    @Override // defpackage.dwgk
    public final ListenableFuture a(ezpp ezppVar) {
        dwaf dwafVar = new dwaf();
        dwafVar.c(this.f);
        dwafVar.b(this.d);
        dwafVar.d(this.a);
        dwafVar.e(this.g ? 1 : 0);
        dwje dwjeVar = this.c;
        dwafVar.a = dwjeVar.c().f();
        dwbf dwbfVarA = dwafVar.a();
        eypt eyptVarB = dweg.b(dwjeVar.c().f());
        ArrayList arrayList = new ArrayList();
        dwag dwagVar = (dwag) dwbfVarA;
        for (String str : dwagVar.c) {
            eysy eysyVar = (eysy) eysz.a.createBuilder();
            eysyVar.copyOnWrite();
            eysz eyszVar = (eysz) eysyVar.instance;
            str.getClass();
            eyszVar.b = str;
            arrayList.add((eysz) eysyVar.build());
        }
        int i = dwagVar.a;
        int i2 = i != 0 ? i != 1 ? 4 : 5 : 3;
        evqd evqdVar = (evqd) evqe.a.createBuilder();
        evqdVar.copyOnWrite();
        ((evqe) evqdVar.instance).b = "type.googleapis.com/google.internal.communications.instantmessaging.v1.ReceiptEvent";
        eysx eysxVar = (eysx) eyta.a.createBuilder();
        eysxVar.copyOnWrite();
        eyta eytaVar = (eyta) eysxVar.instance;
        evtg evtgVar = eytaVar.b;
        if (!evtgVar.c()) {
            eytaVar.b = evsn.mutableCopy(evtgVar);
        }
        evpz.addAll(arrayList, eytaVar.b);
        eysxVar.copyOnWrite();
        ((eyta) eysxVar.instance).c = i2 - 2;
        evqs byteString = ((eyta) eysxVar.build()).toByteString();
        evqdVar.copyOnWrite();
        ((evqe) evqdVar.instance).c = byteString;
        evqe evqeVar = (evqe) evqdVar.build();
        eyso eysoVar = (eyso) eysq.a.createBuilder();
        String str2 = dwagVar.b;
        eysoVar.copyOnWrite();
        ((eysq) eysoVar.instance).i = str2;
        eysoVar.copyOnWrite();
        eysq eysqVar = (eysq) eysoVar.instance;
        eyptVarB.getClass();
        eysqVar.k = eyptVarB;
        eysqVar.b |= 1;
        eyph eyphVarB = dwee.b(dwagVar.e);
        eysoVar.copyOnWrite();
        eysq eysqVar2 = (eysq) eysoVar.instance;
        eyphVarB.getClass();
        eysqVar2.l = eyphVarB;
        eysqVar2.b |= 2;
        eyrc eyrcVar = eyrc.EVENT;
        eysoVar.copyOnWrite();
        ((eysq) eysoVar.instance).n = eyrcVar.a();
        eysm eysmVar = (eysm) eysn.a.createBuilder();
        eysmVar.copyOnWrite();
        ((eysn) eysmVar.instance).c = eyrg.a(6);
        eysmVar.copyOnWrite();
        eysn eysnVar = (eysn) eysmVar.instance;
        evqeVar.getClass();
        eysnVar.d = evqeVar;
        eysnVar.b |= 1;
        eysn eysnVar2 = (eysn) eysmVar.build();
        eysoVar.copyOnWrite();
        eysq eysqVar3 = (eysq) eysoVar.instance;
        eysnVar2.getClass();
        eysqVar3.f = eysnVar2;
        eysqVar3.e = 105;
        eyso eysoVar2 = (eyso) ((eysq) eysoVar.build()).toBuilder();
        evqs evqsVar = this.e;
        eysoVar2.copyOnWrite();
        eysq eysqVar4 = (eysq) eysoVar2.instance;
        evqsVar.getClass();
        eysqVar4.v = evqsVar;
        eysq eysqVar5 = (eysq) eysoVar2.build();
        ewwc ewwcVar = (ewwc) ewwd.a.createBuilder();
        eypt eyptVar = this.h;
        ewwcVar.copyOnWrite();
        ewwd ewwdVar = (ewwd) ewwcVar.instance;
        eyptVar.getClass();
        ewwdVar.d = eyptVar;
        ewwdVar.b |= 2;
        ewwcVar.copyOnWrite();
        ewwd ewwdVar2 = (ewwd) ewwcVar.instance;
        ezppVar.getClass();
        ewwdVar2.c = ezppVar;
        ewwdVar2.b |= 1;
        ewwcVar.copyOnWrite();
        ewwd ewwdVar3 = (ewwd) ewwcVar.instance;
        eysqVar5.getClass();
        ewwdVar3.e = eysqVar5;
        ewwdVar3.b |= 4;
        eyqm eyqmVar = (eyqm) eyqn.a.createBuilder();
        String strA = dvhu.a(this.b);
        eyqmVar.copyOnWrite();
        eyqn eyqnVar = (eyqn) eyqmVar.instance;
        strA.getClass();
        eyqnVar.b = strA;
        eyqn eyqnVar2 = (eyqn) eyqmVar.build();
        ewwcVar.copyOnWrite();
        ewwd ewwdVar4 = (ewwd) ewwcVar.instance;
        eyqnVar2.getClass();
        ewwdVar4.f = eyqnVar2;
        ewwdVar4.b |= 8;
        return eork.i((ewwd) ewwcVar.build());
    }

    @Override // defpackage.dwgk
    public final /* bridge */ /* synthetic */ ListenableFuture b(ListenableFuture listenableFuture, Object obj) {
        final ewwd ewwdVar = (ewwd) obj;
        return eooq.g(listenableFuture, new eooz() { // from class: dwfo
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj2) {
                return ((eyro) obj2).b(ewwdVar);
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
        dwje dwjeVar = this.c;
        dwhpVarR.n(dwjeVar.c().f());
        dwhpVarR.o(dwjeVar.d().E());
        dwhpVarR.p(this.a);
        dwhpVarR.d(this.d);
        dwhpVarR.j(15);
        dwhpVarR.m(Integer.valueOf(status.getCode().value()));
        dwhpVarR.f(i);
        dwhpVarR.e(j);
        dvyxVar.b(dwhpVarR.a());
    }

    @Override // defpackage.dwgk
    public final /* bridge */ /* synthetic */ void e(UUID uuid, Object obj, dvyx dvyxVar, long j) {
        dwhp dwhpVarR = dwhq.r();
        dwhpVarR.g(10003);
        dwje dwjeVar = this.c;
        dwhpVarR.n(dwjeVar.c().f());
        dwhpVarR.o(dwjeVar.d().E());
        dwhpVarR.p(this.a);
        dwhpVarR.d(this.d);
        dwhpVarR.j(15);
        dwhpVarR.f(1);
        dwhpVarR.e(j);
        dvyxVar.b(dwhpVarR.a());
    }
}
