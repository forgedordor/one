package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.MessageId;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class zic extends fcyz implements fdat {
    int a;
    final /* synthetic */ MessageId b;
    final /* synthetic */ zih c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zic(MessageId messageId, zih zihVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = messageId;
        this.c = zihVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((zic) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            ekrd ekrdVar = (ekrd) zih.a.h().h("com/google/android/apps/messaging/conversation2/messagelist/message/bubble/video2/VideoBubbleUiAdapter$onDownloadClicked$1", "invokeSuspend", 632, "VideoBubbleUiAdapter.kt");
            MessageId messageId = this.b;
            ekrdVar.t("Resuming file transfer for messageId=%s", messageId);
            eiju eijuVarF = this.c.t.F(messageId);
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
        return new zic(this.b, this.c, fcxyVar);
    }
}
