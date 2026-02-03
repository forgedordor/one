package defpackage;

import com.google.android.rcs.client.messaging.MessagingOperationResult;
import com.google.android.rcs.client.messaging.MessagingResult;
import com.google.android.rcs.client.messaging.SendMessageRequest;
import com.google.android.rcs.client.messaging.data.Conversation;
import com.google.android.rcs.client.messaging.data.MessageClass;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Optional;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dftr extends eyix {
    private final eyir b;
    private final eyir c;
    private final eyir d;
    private final eyir e;
    private final eyir f;

    public dftr(eyik eyikVar, eyik eyikVar2, eyir eyirVar, eyir eyirVar2, eyir eyirVar3, eyir eyirVar4, eyir eyirVar5) {
        super(eyikVar2, new eyji(dftr.class), eyikVar);
        this.b = eyje.c(eyirVar);
        this.c = eyje.c(eyirVar2);
        this.d = eyje.c(eyirVar3);
        this.e = eyje.c(eyirVar4);
        this.f = eyje.c(eyirVar5);
    }

    @Override // defpackage.eyix
    public final /* synthetic */ ListenableFuture b(Object obj) {
        dfwe dfweVarA;
        List list = (List) obj;
        SendMessageRequest sendMessageRequest = (SendMessageRequest) list.get(0);
        dfuv dfuvVar = (dfuv) list.get(1);
        dfwc dfwcVar = (dfwc) list.get(2);
        dfrq dfrqVar = (dfrq) list.get(3);
        dfrr dfrrVar = (dfrr) list.get(4);
        dfny dfnyVar = dftq.a;
        String strH = sendMessageRequest.c().h();
        Conversation conversationB = sendMessageRequest.b();
        String strC = dfwc.c(conversationB);
        dhiz dhizVar = dhiz.PHONE_NUMBER;
        dhja.c("Using session key for outgoing session: %s", dhizVar.c(strC));
        synchronized (dfwcVar.b) {
            String strC2 = dhizVar.c(strC);
            dfwa dfwaVar = dfwcVar.c;
            dhja.c("Looking up session key: %s in  sessions: %s", strC2, dfwaVar.values());
            dgzn dgznVarCreateOutgoingSession = (dgzn) dfwaVar.get(strC);
            dfvn dfvnVar = new dfvn();
            if (dgznVarCreateOutgoingSession == null) {
                dgznVarCreateOutgoingSession = dfwcVar.a.createOutgoingSession(dfwf.f(conversationB.a()));
                dgznVarCreateOutgoingSession.aF(new dfwb(dfwcVar, strC, dgznVarCreateOutgoingSession));
                dfwaVar.put(strC, dgznVarCreateOutgoingSession);
                dfvnVar.a = 1;
            } else {
                dfvnVar.a = 2;
            }
            dfvnVar.b(dgznVarCreateOutgoingSession);
            dfweVarA = dfvnVar.a();
        }
        dfvo dfvoVar = (dfvo) dfweVarA;
        dgzn dgznVar = dfvoVar.a;
        dhip dhipVar = dftq.c;
        dhja.l(dhipVar.b("produceSendSessionCreationalOneToOneMessage"), "created new or get existing outgoing session via session store with result: %s", dfweVarA);
        dfto dftoVarA = dfrrVar.a(sendMessageRequest.b(), sendMessageRequest.c(), sendMessageRequest.d(), dgznVar);
        int i = dfvoVar.b - 1;
        if (i != 0) {
            if (i == 1) {
                dhja.d(dhipVar, "Sending message [%s] in existing session [%s]", strH, sendMessageRequest.b());
                return dfpc.n() ? dftoVarA.q(dfuvVar.c(sendMessageRequest.b(), sendMessageRequest.c(), Optional.of(sendMessageRequest.d()))) : dftoVarA.d(dfuvVar.a(sendMessageRequest.b(), sendMessageRequest.c(), sendMessageRequest.d()));
            }
            effe effeVarD = MessagingResult.d();
            effeVarD.c(16);
            MessagingResult messagingResultE = effeVarD.e();
            effc effcVarE = MessagingOperationResult.e();
            effcVarE.e(messagingResultE);
            effcVarE.d(sendMessageRequest.c().h());
            effcVarE.b(sendMessageRequest.b());
            return eork.i(effcVarE.a());
        }
        dgznVar.aF(dfrqVar.a(dgznVar));
        dgyx dgyxVarA = dfuvVar.a(sendMessageRequest.b(), sendMessageRequest.c(), sendMessageRequest.d());
        if (dhjv.v(dgznVar.y())) {
            dgznVar.bl();
        }
        if (((Boolean) dfpk.a().b.x.a()).booleanValue()) {
            dgznVar.aX(MessageClass.i(sendMessageRequest.d()));
        } else if (((Boolean) dfpk.a().b.v.a()).booleanValue()) {
            dgznVar.aY(MessageClass.i(sendMessageRequest.d()));
        }
        dhja.d(dhipVar, "Sending message [%s] in new session [%s]", strH, sendMessageRequest.b());
        dgzn dgznVar2 = dftoVarA.b;
        dgznVar2.aF(dftoVarA);
        dgznVar2.N = dgyxVarA;
        dgznVar2.j();
        return dftoVarA.a;
    }

    @Override // defpackage.eyix
    protected final ListenableFuture c() {
        eyir eyirVar = this.f;
        eyir eyirVar2 = this.e;
        eyir eyirVar3 = this.d;
        return eork.f(this.b.d(), this.c.d(), eyirVar3.d(), eyirVar2.d(), eyirVar.d());
    }
}
