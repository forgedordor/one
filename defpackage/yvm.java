package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.MessageId;

/* compiled from: PG */
/* loaded from: classes2.dex */
final /* synthetic */ class yvm extends fdbo implements fdap {
    public yvm(Object obj) {
        super(1, obj, yvq.class, "onDownloadClicked", "onDownloadClicked(Lcom/google/android/apps/messaging/shared/api/messaging/MessageId;)V", 0);
    }

    @Override // defpackage.fdap
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        MessageId messageId = (MessageId) obj;
        messageId.getClass();
        yvq yvqVar = (yvq) this.g;
        auvw.k(yvqVar.d, null, null, new yvl(messageId, yvqVar, null), 3);
        return fctx.a;
    }
}
