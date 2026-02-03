package defpackage;

import com.google.android.rcs.client.messaging.MessagingOperationResult;
import com.google.android.rcs.client.messaging.MessagingResult;
import com.google.android.rcs.client.messaging.data.Conversation;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.SettableFuture;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dfrm extends dgym {
    private final SettableFuture a = SettableFuture.create();
    private final Conversation b;
    private final dgzn c;
    private final dgyx d;
    private final dfuw e;

    public dfrm(dfuw dfuwVar, Conversation conversation, dgyx dgyxVar, dgzn dgznVar) {
        this.b = conversation;
        this.d = dgyxVar;
        this.c = dgznVar;
        this.e = dfuwVar;
    }

    @Override // defpackage.dgym, defpackage.dgzd
    public final void a(dgyx dgyxVar, int i) {
        dgzn dgznVar = this.c;
        dgznVar.aU(this);
        MessagingResult messagingResultA = this.e.apply(dgznVar.S);
        effc effcVarE = MessagingOperationResult.e();
        effcVarE.e(messagingResultA);
        effcVarE.b(this.b);
        String str = this.d.k;
        str.getClass();
        effcVarE.d(str);
        this.a.set(effcVarE.a());
        dgznVar.l();
    }

    @Override // defpackage.dgym, defpackage.dgzd
    public final void b(dgyx dgyxVar) {
        dgzn dgznVar = this.c;
        dgznVar.aU(this);
        effc effcVarE = MessagingOperationResult.e();
        effcVarE.e(MessagingResult.d);
        effcVarE.b(this.b);
        String str = this.d.k;
        str.getClass();
        effcVarE.d(str);
        effcVarE.c(false);
        this.a.set(effcVarE.a());
        dgznVar.l();
    }

    final ListenableFuture d(dgyx dgyxVar) {
        dgzn dgznVar = this.c;
        dgznVar.aF(this);
        dgznVar.N = dgyxVar;
        dgznVar.j();
        return this.a;
    }
}
