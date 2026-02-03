package defpackage;

import android.content.Context;
import android.content.Intent;
import com.google.android.ims.rcsservice.ims.ImsEvent;
import com.google.android.ims.util.common.RcsIntents;
import com.google.android.rcs.client.messaging.MessagingOperationResult;
import com.google.android.rcs.client.messaging.MessagingResult;
import com.google.android.rcs.client.messaging.data.Conversation;
import com.google.android.rcs.client.messaging.data.Message;
import com.google.android.rcs.client.messaging.data.MessageClass;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.SettableFuture;
import j$.util.Optional;
import java.util.concurrent.ExecutionException;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dfto extends dgym {
    public final SettableFuture a = SettableFuture.create();
    public final dgzn b;
    private final Conversation c;
    private final Message d;
    private final MessageClass e;
    private final Context f;
    private final dfuw g;

    public dfto(Context context, dfuw dfuwVar, Conversation conversation, Message message, MessageClass messageClass, dgzn dgznVar) {
        this.c = conversation;
        this.d = message;
        this.e = messageClass;
        this.b = dgznVar;
        this.f = context;
        this.g = dfuwVar;
    }

    @Override // defpackage.dgym, defpackage.dgzd
    public final void a(dgyx dgyxVar, int i) {
        dgzn dgznVar = this.b;
        dgznVar.aU(this);
        MessagingResult messagingResultA = this.g.apply(dgznVar.S);
        effc effcVarE = MessagingOperationResult.e();
        effcVarE.e(messagingResultA);
        effcVarE.b(this.c);
        effcVarE.d(this.d.h());
        this.a.set(effcVarE.a());
    }

    @Override // defpackage.dgym, defpackage.dgzd
    public final void b(dgyx dgyxVar) {
        this.b.aU(this);
        effc effcVarE = MessagingOperationResult.e();
        effcVarE.e(MessagingResult.d);
        effcVarE.b(this.c);
        effcVarE.d(this.d.h());
        effcVarE.c(false);
        this.a.set(effcVarE.a());
    }

    final ListenableFuture d(dgyx dgyxVar) {
        dgzn dgznVar = this.b;
        dgznVar.aF(this);
        try {
            dgznVar.aV(dgyxVar);
            return this.a;
        } catch (dgzc e) {
            this.b.aU(this);
            SettableFuture settableFuture = this.a;
            settableFuture.setException(e);
            return settableFuture;
        }
    }

    @Override // defpackage.dgym, defpackage.dgwh
    public final void h(int i, String str) {
        if (i == 404) {
            dgzn dgznVar = this.b;
            if (dgznVar.E) {
                return;
            }
            dhdq dhdqVar = new dhdq();
            dhdqVar.a = 30014;
            dhdqVar.b = dgznVar.z();
            ImsEvent imsEventA = dhdqVar.a();
            Intent intent = new Intent(RcsIntents.ACTION_NEW_EVENT);
            intent.putExtra(RcsIntents.EXTRA_EVENT, imsEventA);
            dhjm.a(this.f, intent, dhjl.SEND_MESSAGE_PRODUCER_MODULE);
        }
    }

    final ListenableFuture q(efgw efgwVar) {
        dgyi dgyiVar;
        efgw efgwVar2;
        ListenableFuture listenableFutureI;
        dgzn dgznVar = this.b;
        dgznVar.aF(this);
        try {
            boolean z = this.e.b() == efjy.USER;
            dgyiVar = new dgyi();
            dgyiVar.a(true);
            dgyiVar.b = efgwVar;
            dgyiVar.a(z);
        } catch (InterruptedException unused) {
            dhja.r(dftq.c, "[%s] Interrupted while waiting for message send", this.d.h());
        } catch (ExecutionException e) {
            this.b.aU(this);
            this.a.setException(e);
        }
        if (dgyiVar.c == 1 && (efgwVar2 = dgyiVar.b) != null) {
            dgyj dgyjVar = new dgyj(dgyiVar.a, efgwVar2);
            if (dgznVar.bg()) {
                efgw efgwVar3 = dgyjVar.b;
                efgm efgmVar = new efgm(efgwVar3);
                Optional optional = ((dfzw) ((dfzz) dgznVar.T).b()).g;
                if (dfpc.n() && optional.isPresent()) {
                    String str = "NS" + ((int) (Math.random() * 100.0d));
                    efgmVar.g(str, (String) dfpc.a().a.e.a());
                    efgmVar.f(str, "P-Access-Network-Info", (String) optional.get());
                }
                String strC = ((efhb) efgwVar3.h("Message-ID").get()).c();
                dgyx dgyxVar = new dgyx(dgyw.CPIM_MESSAGE);
                dgyxVar.b = dgznVar.y();
                dgyxVar.c = dgznVar.l.g;
                dgyxVar.k = strC;
                dgyxVar.f("message/cpim", efgmVar.a());
                dgyxVar.r = dgyjVar.a;
                dhja.w(13, 3, "Queueing message for sending %s with messageid=%s", dgyxVar, dgyxVar.k);
                dgznVar.K.add(dgyxVar);
                listenableFutureI = eork.i(new dgyk(Optional.empty()));
            } else {
                dhja.h(dgzn.B, "Unable to send message: %s, %d", dgznVar.a.toString(), Integer.valueOf(dgznVar.n));
                listenableFutureI = eork.h(new dgzc());
            }
            listenableFutureI.get();
            return this.a;
        }
        StringBuilder sb = new StringBuilder();
        if (dgyiVar.c == 0) {
            sb.append(" requiresFailureReport");
        }
        if (dgyiVar.b == null) {
            sb.append(" message");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }
}
