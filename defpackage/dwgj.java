package defpackage;

import android.content.Context;
import com.google.common.util.concurrent.ListenableFuture;
import io.grpc.Status;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dwgj implements dwgk {
    public final String a = UUID.randomUUID().toString();
    private final Context b;
    private final dwje c;
    private final dwpx d;
    private final evqs e;
    private final boolean f;
    private final long g;
    private final eypt h;

    public dwgj(Context context, dwje dwjeVar, dwpx dwpxVar, evqs evqsVar, boolean z, long j, eypt eyptVar) {
        this.b = context;
        this.c = dwjeVar;
        this.d = dwpxVar;
        this.e = evqsVar;
        this.f = z;
        this.g = j;
        this.h = eyptVar;
    }

    @Override // defpackage.dwgk
    public final ListenableFuture a(ezpp ezppVar) {
        ewwc ewwcVar = (ewwc) ewwd.a.createBuilder();
        ewwcVar.copyOnWrite();
        ewwd ewwdVar = (ewwd) ewwcVar.instance;
        eypt eyptVar = this.h;
        eyptVar.getClass();
        ewwdVar.d = eyptVar;
        ewwdVar.b |= 2;
        ewwcVar.copyOnWrite();
        ewwd ewwdVar2 = (ewwd) ewwcVar.instance;
        ezppVar.getClass();
        ewwdVar2.c = ezppVar;
        ewwdVar2.b |= 1;
        dwak dwakVar = new dwak();
        dwakVar.b(this.d);
        dwakVar.e(this.a);
        dwje dwjeVar = this.c;
        dwakVar.a = dwjeVar.c().f();
        dwakVar.f(true != this.f ? 2 : 1);
        dwakVar.c(this.g);
        dwakVar.d(0L);
        dwbm dwbmVarA = dwakVar.a();
        eypt eyptVarB = dweg.b(dwjeVar.c().f());
        dwal dwalVar = (dwal) dwbmVarA;
        int i = dwalVar.d;
        int i2 = i != 1 ? i != 2 ? 2 : 4 : 3;
        evqd evqdVar = (evqd) evqe.a.createBuilder();
        evqdVar.copyOnWrite();
        ((evqe) evqdVar.instance).b = "type.googleapis.com/google.internal.communications.instantmessaging.v1.TypingIndicatorEvent";
        eytd eytdVar = (eytd) eyte.a.createBuilder();
        eytdVar.copyOnWrite();
        ((eyte) eytdVar.instance).b = i2 - 2;
        long j = dwalVar.e;
        eytdVar.copyOnWrite();
        ((eyte) eytdVar.instance).c = j;
        evqs byteString = ((eyte) eytdVar.build()).toByteString();
        evqdVar.copyOnWrite();
        ((evqe) evqdVar.instance).c = byteString;
        evqe evqeVar = (evqe) evqdVar.build();
        eyso eysoVar = (eyso) eysq.a.createBuilder();
        String str = dwalVar.a;
        eysoVar.copyOnWrite();
        ((eysq) eysoVar.instance).i = str;
        eysoVar.copyOnWrite();
        eysq eysqVar = (eysq) eysoVar.instance;
        eyptVarB.getClass();
        eysqVar.k = eyptVarB;
        eysqVar.b |= 1;
        eyph eyphVarB = dwee.b(dwalVar.b);
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
        ((eysn) eysmVar.instance).c = eyrg.a(4);
        eysmVar.copyOnWrite();
        eysn eysnVar = (eysn) eysmVar.instance;
        evqeVar.getClass();
        eysnVar.d = evqeVar;
        eysnVar.b = 1 | eysnVar.b;
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
        return eooq.g(listenableFuture, new eooz() { // from class: dwgi
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
        dwhpVarR.j(23);
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
        dwhpVarR.j(23);
        dwhpVarR.f(1);
        dwhpVarR.e(j);
        dvyxVar.b(dwhpVarR.a());
    }
}
