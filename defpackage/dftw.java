package defpackage;

import com.google.android.rcs.client.messaging.SendMessageRequest;
import com.google.android.rcs.client.messaging.data.MessageClass;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dftw extends eyix {
    private final eyir b;
    private final eyir c;
    private final eyir d;
    private final eyir e;

    public dftw(eyik eyikVar, eyik eyikVar2, eyir eyirVar, eyir eyirVar2, eyir eyirVar3, eyir eyirVar4) {
        super(eyikVar2, new eyji(dftw.class), eyikVar);
        this.b = eyje.c(eyirVar);
        this.c = eyje.c(eyirVar2);
        this.d = eyje.c(eyirVar3);
        this.e = eyje.c(eyirVar4);
    }

    @Override // defpackage.eyix
    public final /* bridge */ /* synthetic */ ListenableFuture b(Object obj) {
        SendMessageRequest sendMessageRequest = (SendMessageRequest) obj;
        dfny dfnyVar = dftq.a;
        if (dfog.E() && efkm.MESSAGING_METHOD_SLM.equals(sendMessageRequest.g())) {
            eyir eyirVar = this.e;
            dhja.l(dftq.c, "sending SLM Message, messageId: %s", sendMessageRequest.c().h());
            return eyirVar.d();
        }
        if (MessageClass.h(sendMessageRequest.d())) {
            eyir eyirVar2 = this.c;
            dhja.l(dftq.c, "sending 1:1 message in new session, messageId: %s, sessionId: %s", sendMessageRequest.c().h(), sendMessageRequest.b().b());
            return eyirVar2.d();
        }
        eyir eyirVar3 = this.d;
        dhja.l(dftq.c, "sending 1:1 message in existing session, messageId: %s, sessionId: %s", sendMessageRequest.c().h(), sendMessageRequest.b().b());
        return eyirVar3.d();
    }

    @Override // defpackage.eyix
    protected final ListenableFuture c() {
        return this.b.d();
    }
}
