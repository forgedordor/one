package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.MessageId;

/* compiled from: PG */
/* loaded from: classes2.dex */
final /* synthetic */ class yxz extends fdbo implements fdap {
    public yxz(Object obj) {
        super(1, obj, yya.class, "pauseFileTransfer", "pauseFileTransfer(Lcom/google/android/apps/messaging/shared/api/messaging/MessageId;)V", 0);
    }

    @Override // defpackage.fdap
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        MessageId messageId = (MessageId) obj;
        messageId.getClass();
        auvh.h(((yya) this.g).c.B(messageId));
        ((ekrd) yya.a.h().h("com/google/android/apps/messaging/conversation2/messagelist/message/bubble/progress/ProgressBarOverlayUiAdapter", "pauseFileTransfer", 335, "ProgressBarOverlayUiAdapter.kt")).t("Pausing file transfer for messageId=%s", messageId);
        return fctx.a;
    }
}
