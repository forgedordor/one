package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.MessageId;

/* compiled from: PG */
/* loaded from: classes2.dex */
final /* synthetic */ class zid extends fdbo implements fdap {
    public zid(Object obj) {
        super(1, obj, zih.class, "onDownloadClicked", "onDownloadClicked(Lcom/google/android/apps/messaging/shared/api/messaging/MessageId;)V", 0);
    }

    @Override // defpackage.fdap
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        MessageId messageId = (MessageId) obj;
        messageId.getClass();
        zih zihVar = (zih) this.g;
        auvw.k(zihVar.c, null, null, new zic(messageId, zihVar, null), 3);
        return fctx.a;
    }
}
