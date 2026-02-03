package defpackage;

import android.content.Context;
import android.util.Base64;
import com.google.common.util.concurrent.ListenableFuture;
import io.grpc.Status;
import java.util.List;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dwfe implements dwgk {
    public final String a = UUID.randomUUID().toString();
    private final Context b;
    private final dwje c;
    private final dwpx d;
    private final evqs e;
    private final boolean f;
    private final boolean g;
    private final eypt h;
    private final List i;
    private final String j;

    public dwfe(Context context, dwje dwjeVar, dwpx dwpxVar, evqs evqsVar, String str, boolean z, boolean z2, eypt eyptVar, List list) {
        this.b = context;
        this.c = dwjeVar;
        this.d = dwpxVar;
        this.e = evqsVar;
        this.j = str;
        this.f = z;
        this.g = z2;
        this.h = eyptVar;
        this.i = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.dwgk
    public final ListenableFuture a(ezpp ezppVar) {
        byte[] bArrDecode = Base64.decode(this.j, 8);
        int i = dwei.a;
        StringBuilder sb = new StringBuilder("isEmptyDeviceConversation: ");
        boolean z = this.f;
        sb.append(z);
        dvhv.a("MsgProtoConverter", sb.toString());
        dwpx dwpxVar = this.d;
        eypt eyptVarB = dweg.b(dwpxVar.a());
        eyso eysoVar = (eyso) eysq.a.createBuilder();
        eysoVar.copyOnWrite();
        eysq eysqVar = (eysq) eysoVar.instance;
        String str = this.a;
        str.getClass();
        eysqVar.i = str;
        eysoVar.copyOnWrite();
        eysq eysqVar2 = (eysq) eysoVar.instance;
        eyptVarB.getClass();
        eysqVar2.k = eyptVarB;
        eysqVar2.b |= 1;
        eyph eyphVarB = dwee.b(dwpxVar);
        eysoVar.copyOnWrite();
        eysq eysqVar3 = (eysq) eysoVar.instance;
        eyphVarB.getClass();
        eysqVar3.l = eyphVarB;
        eysqVar3.b |= 2;
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
        ((eysn) eysmVar.instance).c = eyrg.a(7);
        evqd evqdVar = (evqd) evqe.a.createBuilder();
        evqdVar.copyOnWrite();
        ((evqe) evqdVar.instance).b = "type.googleapis.com/google.internal.communications.instantmessaging.v1.ConversationIntentOpenedEvent";
        eysi eysiVar = (eysi) eysj.a.createBuilder();
        evqs evqsVarX = evqs.x(bArrDecode);
        eysiVar.copyOnWrite();
        ((eysj) eysiVar.instance).b = evqsVarX;
        eysiVar.copyOnWrite();
        ((eysj) eysiVar.instance).c = z;
        eysiVar.copyOnWrite();
        ((eysj) eysiVar.instance).d = this.g;
        List listA = dvjj.c().a();
        eysiVar.copyOnWrite();
        eysj eysjVar = (eysj) eysiVar.instance;
        evsx evsxVar = eysjVar.e;
        if (!evsxVar.c()) {
            eysjVar.e = evsn.mutableCopy(evsxVar);
        }
        ekqh it = ((ekgb) listA).iterator();
        while (it.hasNext()) {
            eysjVar.e.h(((Integer) it.next()).intValue());
        }
        evqs byteString = ((eysj) eysiVar.build()).toByteString();
        evqdVar.copyOnWrite();
        ((evqe) evqdVar.instance).c = byteString;
        eysmVar.copyOnWrite();
        eysn eysnVar = (eysn) eysmVar.instance;
        evqe evqeVar = (evqe) evqdVar.build();
        evqeVar.getClass();
        eysnVar.d = evqeVar;
        eysnVar.b |= 1;
        eysoVar.copyOnWrite();
        eysq eysqVar5 = (eysq) eysoVar.instance;
        eysn eysnVar2 = (eysn) eysmVar.build();
        eysnVar2.getClass();
        eysqVar5.f = eysnVar2;
        eysqVar5.e = 105;
        eyso eysoVar2 = (eyso) ((eysq) eysoVar.build()).toBuilder();
        evqs evqsVar = this.e;
        eysoVar2.copyOnWrite();
        eysq eysqVar6 = (eysq) eysoVar2.instance;
        evqsVar.getClass();
        eysqVar6.v = evqsVar;
        eysq eysqVar7 = (eysq) eysoVar2.build();
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
        eysqVar7.getClass();
        ewwdVar3.e = eysqVar7;
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
        return eooq.g(listenableFuture, new eooz() { // from class: dwfd
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
        dwhpVarR.j(16);
        dwhpVarR.m(Integer.valueOf(status.getCode().value()));
        dwhpVarR.f(i);
        dwhpVarR.h(ekgb.n(this.i));
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
        dwhpVarR.j(16);
        dwhpVarR.f(1);
        dwhpVarR.h(ekgb.n(this.i));
        dwhpVarR.e(j);
        dvyxVar.b(dwhpVarR.a());
    }
}
