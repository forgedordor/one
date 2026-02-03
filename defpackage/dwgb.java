package defpackage;

import android.content.Context;
import com.google.common.util.concurrent.ListenableFuture;
import io.grpc.Status;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dwgb implements dwgk {
    public final String a;
    private final Context b;
    private final dwje c;
    private final dwpx d;
    private final evqs e;
    private final eypt f;
    private final ejwi g;
    private final String h;

    public dwgb(Context context, dwje dwjeVar, dwpx dwpxVar, evqs evqsVar, eypt eyptVar, ejwi ejwiVar, String str) {
        this.b = context;
        this.c = dwjeVar;
        String string = UUID.randomUUID().toString();
        string.getClass();
        this.a = string;
        this.d = dwpxVar;
        this.e = evqsVar;
        this.f = eyptVar;
        this.g = ejwiVar;
        this.h = str;
    }

    @Override // defpackage.dwgk
    public final ListenableFuture a(ezpp ezppVar) {
        ewwc ewwcVar = (ewwc) ewwd.a.createBuilder();
        ewwcVar.copyOnWrite();
        ewwd ewwdVar = (ewwd) ewwcVar.instance;
        eypt eyptVar = this.f;
        eyptVar.getClass();
        ewwdVar.d = eyptVar;
        ewwdVar.b |= 2;
        ewwcVar.copyOnWrite();
        ewwd ewwdVar2 = (ewwd) ewwcVar.instance;
        ezppVar.getClass();
        ewwdVar2.c = ezppVar;
        ewwdVar2.b |= 1;
        int i = dwei.a;
        dwpx dwpxVar = this.d;
        eypt eyptVarB = dweg.b(dwpxVar.a());
        eyso eysoVar = (eyso) eysq.a.createBuilder();
        eysoVar.copyOnWrite();
        ((eysq) eysoVar.instance).i = this.a;
        eysoVar.copyOnWrite();
        eysq eysqVar = (eysq) eysoVar.instance;
        eyptVarB.getClass();
        eysqVar.k = eyptVarB;
        eysqVar.b |= 1;
        eyph eyphVarB = dwee.b(dwpxVar);
        eysoVar.copyOnWrite();
        eysq eysqVar2 = (eysq) eysoVar.instance;
        eyphVarB.getClass();
        eysqVar2.l = eyphVarB;
        eysqVar2.b |= 2;
        eysoVar.copyOnWrite();
        eysq eysqVar3 = (eysq) eysoVar.instance;
        evqs evqsVar = this.e;
        evqsVar.getClass();
        eysqVar3.v = evqsVar;
        eysoVar.copyOnWrite();
        eysq eysqVar4 = (eysq) eysoVar.instance;
        eyptVarB.getClass();
        eysqVar4.d = eyptVarB;
        eysqVar4.c = 5;
        eyrc eyrcVar = eyrc.EVENT;
        eysoVar.copyOnWrite();
        ((eysq) eysoVar.instance).n = eyrcVar.a();
        eysm eysmVar = (eysm) eysn.a.createBuilder();
        eysmVar.copyOnWrite();
        ((eysn) eysmVar.instance).c = eyrg.a(8);
        evqd evqdVar = (evqd) evqe.a.createBuilder();
        evqdVar.copyOnWrite();
        ((evqe) evqdVar.instance).b = "type.googleapis.com/google.internal.communications.instantmessaging.v1.ActionEvent";
        eyse eyseVar = (eyse) eysf.a.createBuilder();
        String str = (String) this.g.e("");
        eyseVar.copyOnWrite();
        eysf eysfVar = (eysf) eyseVar.instance;
        String str2 = this.h;
        eysfVar.b = str;
        eyseVar.copyOnWrite();
        ((eysf) eyseVar.instance).c = str2;
        evqs byteString = ((eysf) eyseVar.build()).toByteString();
        evqdVar.copyOnWrite();
        ((evqe) evqdVar.instance).c = byteString;
        evqe evqeVar = (evqe) evqdVar.build();
        eysmVar.copyOnWrite();
        eysn eysnVar = (eysn) eysmVar.instance;
        evqeVar.getClass();
        eysnVar.d = evqeVar;
        eysnVar.b |= 1;
        eysoVar.copyOnWrite();
        eysq eysqVar5 = (eysq) eysoVar.instance;
        eysn eysnVar2 = (eysn) eysmVar.build();
        eysnVar2.getClass();
        eysqVar5.f = eysnVar2;
        eysqVar5.e = 105;
        eysq eysqVar6 = (eysq) eysoVar.build();
        ewwcVar.copyOnWrite();
        ewwd ewwdVar3 = (ewwd) ewwcVar.instance;
        eysqVar6.getClass();
        ewwdVar3.e = eysqVar6;
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
        return eooq.g(listenableFuture, new eooz() { // from class: dwga
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
        dwhpVarR.j(19);
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
        dwhpVarR.j(19);
        dwhpVarR.f(1);
        dwhpVarR.e(j);
        dvyxVar.b(dwhpVarR.a());
    }
}
