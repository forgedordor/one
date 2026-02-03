package defpackage;

import com.google.android.rcs.client.messaging.SendMessageRequest;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dftv extends eyix {
    private final eyir b;
    private final eyir c;
    private final eyir d;

    public dftv(eyik eyikVar, eyik eyikVar2, eyir eyirVar, eyir eyirVar2, eyir eyirVar3) {
        super(eyikVar2, new eyji(dftv.class), eyikVar);
        this.b = eyje.c(eyirVar);
        this.c = eyje.c(eyirVar2);
        this.d = eyje.c(eyirVar3);
    }

    @Override // defpackage.eyix
    public final /* bridge */ /* synthetic */ ListenableFuture b(Object obj) {
        SendMessageRequest sendMessageRequest = (SendMessageRequest) obj;
        dfny dfnyVar = dftq.a;
        if (sendMessageRequest.b().c() == 2) {
            ListenableFuture listenableFutureD = this.d.d();
            dhja.l(dftq.c, "sending message in group conversation, messageId: %s, conversationId: %s", sendMessageRequest.c().h(), sendMessageRequest.b().b());
            return listenableFutureD;
        }
        ListenableFuture listenableFutureD2 = this.c.d();
        dhja.l(dftq.c, "sending message in 1:1 conversation, messageId: %s, conversationId: %s", sendMessageRequest.c().h(), sendMessageRequest.b().b());
        return listenableFutureD2;
    }

    @Override // defpackage.eyix
    protected final ListenableFuture c() {
        return this.b.d();
    }
}
