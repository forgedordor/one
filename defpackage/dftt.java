package defpackage;

import com.google.android.rcs.client.messaging.SendMessageRequest;
import com.google.android.rcs.client.messaging.data.Conversation;
import com.google.android.rcs.client.messaging.data.Message;
import com.google.android.rcs.client.messaging.data.MessageClass;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Optional;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dftt extends eyix {
    private final eyir b;
    private final eyir c;
    private final eyir d;
    private final eyir e;
    private final eyir f;

    public dftt(eyik eyikVar, eyik eyikVar2, eyir eyirVar, eyir eyirVar2, eyir eyirVar3, eyir eyirVar4, eyir eyirVar5) {
        super(eyikVar2, new eyji(dftt.class), eyikVar);
        this.b = eyje.c(eyirVar);
        this.c = eyje.c(eyirVar2);
        this.d = eyje.c(eyirVar3);
        this.e = eyje.c(eyirVar4);
        this.f = eyje.c(eyirVar5);
    }

    @Override // defpackage.eyix
    public final /* bridge */ /* synthetic */ ListenableFuture b(Object obj) {
        dgzu dgzuVarA;
        List list = (List) obj;
        SendMessageRequest sendMessageRequest = (SendMessageRequest) list.get(0);
        dfuv dfuvVar = (dfuv) list.get(1);
        dgwa dgwaVar = (dgwa) list.get(2);
        dfvy dfvyVar = (dfvy) list.get(3);
        dfrn dfrnVar = (dfrn) list.get(4);
        dfny dfnyVar = dftq.a;
        Message messageC = sendMessageRequest.c();
        Conversation conversationB = sendMessageRequest.b();
        MessageClass messageClassD = sendMessageRequest.d();
        if (((Boolean) dftq.b.a()).booleanValue()) {
            dgzuVarA = dftq.a(dgwaVar);
        } else {
            dgzuVarA = (dgzu) dgwaVar.a(dgzu.class);
            dgzuVarA.getClass();
        }
        dgyx dgyxVarB = dfuvVar.b(conversationB, messageC, Optional.of(messageClassD), sendMessageRequest.g());
        ebco ebcoVar = dgyxVarB.g;
        ebcoVar.getClass();
        int i = dgzuVarA.t.mSwitchoverSize;
        if (ebcoVar.l() <= i) {
            dhja.d(dftq.c, "Sending SLM message [%s] in pager mode as message content is %s bytes, less than switchOverSize of %s bytes", messageC.h(), Long.valueOf(ebcoVar.l()), Integer.valueOf(i));
            return new dftp(dgzuVarA, conversationB, messageC, dgyxVarB).d();
        }
        dhja.d(dftq.c, "Sending SLM message [%s] in new SLM session [%s]", messageC.h(), conversationB);
        return dfrnVar.a(conversationB, dgyxVarB, dfvyVar.createOutgoingSlmSession(dfwf.f(conversationB.a()))).d(dgyxVarB);
    }

    @Override // defpackage.eyix
    protected final ListenableFuture c() {
        eyir eyirVar = this.f;
        eyir eyirVar2 = this.e;
        eyir eyirVar3 = this.d;
        return eork.f(this.b.d(), this.c.d(), eyirVar3.d(), eyirVar2.d(), eyirVar.d());
    }
}
