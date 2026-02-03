package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.MessageId;

/* compiled from: PG */
/* loaded from: classes2.dex */
final /* synthetic */ class zdf extends fdbo implements fdat {
    public zdf(Object obj) {
        super(2, obj, zdm.class, "startRichCardAttachmentDownload", "startRichCardAttachmentDownload(Lcom/google/android/apps/messaging/shared/api/messaging/MessageId;Lcom/google/android/apps/messaging/shared/api/messaging/message/content/CardAttachment$CardAttachmentContent;)V", 0);
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        MessageId messageId = (MessageId) obj;
        amuy amuyVar = (amuy) obj2;
        messageId.getClass();
        amuyVar.getClass();
        zdm zdmVar = (zdm) this.g;
        ajmh ajmhVar = zdmVar.f;
        if (!(ajmhVar instanceof anfy)) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        ((anfy) ajmhVar).U(zdmVar.e, messageId, amuyVar);
        return fctx.a;
    }
}
