package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.MessageId;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class yvl extends fcyz implements fdat {
    int a;
    final /* synthetic */ MessageId b;
    final /* synthetic */ yvq c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yvl(MessageId messageId, yvq yvqVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = messageId;
        this.c = yvqVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((yvl) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            ekrw ekrwVarH = yvq.a.h();
            ekrwVarH.X(eksq.a, "BugleImage");
            ekrd ekrdVar = (ekrd) ekrwVarH.h("com/google/android/apps/messaging/conversation2/messagelist/message/bubble/image/ImageBubbleUiAdapter$onDownloadClicked$1", "invokeSuspend", 675, "ImageBubbleUiAdapter.kt");
            MessageId messageId = this.b;
            ekrdVar.t("Resuming file transfer for messageId=%s", messageId);
            eiju eijuVarF = this.c.g.F(messageId);
            this.a = 1;
            obj = fdxs.c(eijuVarF, this);
            if (obj == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new yvl(this.b, this.c, fcxyVar);
    }
}
