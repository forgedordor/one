package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cvqm implements fdae {
    final /* synthetic */ cvqp a;
    final /* synthetic */ cvqu b;

    public cvqm(cvqp cvqpVar, cvqu cvquVar) {
        this.a = cvqpVar;
        this.b = cvquVar;
    }

    @Override // defpackage.fdae
    public final /* bridge */ /* synthetic */ Object invoke() {
        ResolvedRecipient resolvedRecipient = this.b.b;
        cvqp cvqpVar = this.a;
        auvw.k(cvqpVar.d, null, null, new cvqn(resolvedRecipient, cvqpVar, null), 3);
        return fctx.a;
    }
}
