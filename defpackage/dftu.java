package defpackage;

import com.google.android.rcs.client.messaging.MessagingOperationResult;
import com.google.android.rcs.client.messaging.MessagingResult;
import com.google.android.rcs.client.messaging.SendMessageRequest;
import com.google.android.rcs.client.messaging.data.MessageClass;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dftu extends eyix {
    private final eyir b;
    private final eyir c;
    private final eyir d;
    private final eyir e;

    public dftu(eyik eyikVar, eyik eyikVar2, eyir eyirVar, eyir eyirVar2, eyir eyirVar3, eyir eyirVar4) {
        super(eyikVar2, new eyji(dftu.class), eyikVar);
        this.b = eyje.c(eyirVar);
        this.c = eyje.c(eyirVar2);
        this.d = eyje.c(eyirVar3);
        this.e = eyje.c(eyirVar4);
    }

    @Override // defpackage.eyix
    public final /* bridge */ /* synthetic */ ListenableFuture b(Object obj) {
        List list = (List) obj;
        SendMessageRequest sendMessageRequest = (SendMessageRequest) list.get(0);
        dfvw dfvwVar = (dfvw) list.get(1);
        dfuv dfuvVar = (dfuv) list.get(2);
        dfrr dfrrVar = (dfrr) list.get(3);
        dfny dfnyVar = dftq.a;
        if (dfvwVar.d().isPresent()) {
            Object obj2 = dfvwVar.d().get();
            dgyx dgyxVarA = dfuvVar.a(sendMessageRequest.b(), sendMessageRequest.c(), sendMessageRequest.d());
            dhja.l(dftq.c, "send message in group session, messageId: %s, sessionId: %s", sendMessageRequest.c().h(), sendMessageRequest.b().b());
            return dfrrVar.a(sendMessageRequest.b(), sendMessageRequest.c(), sendMessageRequest.d(), (dgzn) obj2).d(dgyxVarA);
        }
        if (MessageClass.g(sendMessageRequest.d())) {
            effc effcVarE = MessagingOperationResult.e();
            effcVarE.b(sendMessageRequest.b());
            effcVarE.d(sendMessageRequest.c().h());
            effcVarE.e(dfwf.b(dfvwVar));
            return eork.i(effcVarE.a());
        }
        effe effeVarD = MessagingResult.d();
        effeVarD.c(16);
        effeVarD.b(6);
        MessagingResult messagingResultE = effeVarD.e();
        effc effcVarE2 = MessagingOperationResult.e();
        effcVarE2.b(sendMessageRequest.b());
        effcVarE2.c(false);
        effcVarE2.d(sendMessageRequest.c().h());
        effcVarE2.e(messagingResultE);
        return eork.i(effcVarE2.a());
    }

    @Override // defpackage.eyix
    protected final ListenableFuture c() {
        eyir eyirVar = this.e;
        eyir eyirVar2 = this.d;
        return eork.f(this.b.d(), this.c.d(), eyirVar2.d(), eyirVar.d());
    }
}
