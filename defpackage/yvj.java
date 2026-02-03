package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.MessageId;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class yvj extends fcyz implements fdat {
    final /* synthetic */ MessageId a;
    final /* synthetic */ yvq b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yvj(MessageId messageId, yvq yvqVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = messageId;
        this.b = yvqVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((yvj) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        ekrw ekrwVarH = yvq.a.h();
        ekrwVarH.X(eksq.a, "BugleImage");
        ekrd ekrdVar = (ekrd) ekrwVarH.h("com/google/android/apps/messaging/conversation2/messagelist/message/bubble/image/ImageBubbleUiAdapter$onCancelClicked$1", "invokeSuspend", 684, "ImageBubbleUiAdapter.kt");
        MessageId messageId = this.a;
        ekrdVar.t("Pausing file transfer for messageId=%s", messageId);
        this.b.g.B(messageId);
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new yvj(this.a, this.b, fcxyVar);
    }
}
