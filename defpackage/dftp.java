package defpackage;

import com.google.android.rcs.client.messaging.MessagingOperationResult;
import com.google.android.rcs.client.messaging.MessagingResult;
import com.google.android.rcs.client.messaging.data.Conversation;
import com.google.android.rcs.client.messaging.data.Message;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.SettableFuture;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dftp implements dgzd {
    private final SettableFuture a = SettableFuture.create();
    private final dgzu b;
    private final Message c;
    private final Conversation d;
    private final dgyx e;

    public dftp(dgzu dgzuVar, Conversation conversation, Message message, dgyx dgyxVar) {
        this.b = dgzuVar;
        this.c = message;
        this.d = conversation;
        this.e = dgyxVar;
    }

    @Override // defpackage.dgzd
    public final void a(dgyx dgyxVar, int i) {
        if (this.e.equals(dgyxVar)) {
            this.b.w(this);
            effe effeVarD = MessagingResult.d();
            int i2 = 15;
            if (i != 9 && i != 1 && i != 4 && i != 11) {
                i2 = 16;
            }
            effeVarD.c(i2);
            MessagingResult messagingResultE = effeVarD.e();
            SettableFuture settableFuture = this.a;
            effc effcVarE = MessagingOperationResult.e();
            effcVarE.e(messagingResultE);
            effcVarE.b(this.d);
            effcVarE.d(this.c.h());
            settableFuture.set(effcVarE.a());
        }
    }

    @Override // defpackage.dgzd
    public final void b(dgyx dgyxVar) {
        if (this.e.equals(dgyxVar)) {
            this.b.w(this);
            SettableFuture settableFuture = this.a;
            effc effcVarE = MessagingOperationResult.e();
            effcVarE.e(MessagingResult.d);
            effcVarE.b(this.d);
            effcVarE.d(this.c.h());
            settableFuture.set(effcVarE.a());
        }
    }

    @Override // defpackage.dgzd
    public final void c(dgyx dgyxVar) {
        throw null;
    }

    public final ListenableFuture d() throws ebmn, InterruptedException {
        dgzu dgzuVar = this.b;
        dgzuVar.t(this);
        try {
            dgyx dgyxVar = this.e;
            try {
                if (dgyxVar.a == dgyw.DISPOSITION_NOTIFICATION) {
                    dhja.w(2, 3, "Pager message queued with messageid=%s", dgyxVar.k);
                }
                dgzuVar.r.put(dgyxVar);
            } catch (InterruptedException e) {
                throw new ebmn("Unable to queue message for sending", e);
            }
        } catch (ebmn e2) {
            this.a.setException(e2);
        }
        return this.a;
    }
}
