package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dfsv extends eyix {
    private final eyir b;
    private final eyir c;
    private final eyir d;

    public dfsv(eyik eyikVar, eyik eyikVar2, eyir eyirVar, eyir eyirVar2, eyir eyirVar3) {
        super(eyikVar2, new eyji(dfsv.class), eyikVar);
        this.b = eyje.c(eyirVar);
        this.c = eyje.c(eyirVar2);
        this.d = eyje.c(eyirVar3);
    }

    @Override // defpackage.eyix
    public final /* bridge */ /* synthetic */ ListenableFuture b(Object obj) {
        dftb dftbVar = (dftb) obj;
        dhip dhipVarB = dfsq.a.b("produceReceiveMessageResult");
        boolean zIsPresent = dftbVar.b().isPresent();
        eyir eyirVar = this.c;
        if (!zIsPresent) {
            ListenableFuture listenableFutureD = eyirVar.d();
            dhja.l(dhipVarB, "producing standalone message, messageId: %s", dftbVar.a().isPresent() ? ((dgyx) dftbVar.a().get()).k : -1);
            return listenableFutureD;
        }
        if (dftbVar.a().isPresent()) {
            ListenableFuture listenableFutureD2 = eyirVar.d();
            dhja.l(dhipVarB, "received in-session message, sessionId: %s, messageId: %s", ((dgwe) dftbVar.b().get()).k, ((dgyx) dftbVar.a().get()).k);
            return listenableFutureD2;
        }
        ListenableFuture listenableFutureD3 = this.d.d();
        dhja.l(dhipVarB, "producing initial message, sessionId: %s", ((dgwe) dftbVar.b().get()).k);
        return listenableFutureD3;
    }

    @Override // defpackage.eyix
    protected final ListenableFuture c() {
        return this.b.d();
    }
}
