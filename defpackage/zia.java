package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.MessageId;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class zia extends fcyz implements fdat {
    final /* synthetic */ MessageId a;
    final /* synthetic */ zih b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zia(MessageId messageId, zih zihVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = messageId;
        this.b = zihVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((zia) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        ekrd ekrdVar = (ekrd) zih.a.h().h("com/google/android/apps/messaging/conversation2/messagelist/message/bubble/video2/VideoBubbleUiAdapter$onCancelClicked$1", "invokeSuspend", 641, "VideoBubbleUiAdapter.kt");
        MessageId messageId = this.a;
        ekrdVar.t("Pausing file transfer for messageId=%s", messageId);
        this.b.t.B(messageId);
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new zia(this.a, this.b, fcxyVar);
    }
}
