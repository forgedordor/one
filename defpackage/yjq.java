package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.MessageId;

/* compiled from: PG */
/* loaded from: classes2.dex */
final /* synthetic */ class yjq extends fdbo implements fdat {
    public yjq(Object obj) {
        super(2, obj, yjr.class, "onCacheEntryRemoved", "onCacheEntryRemoved(Lcom/google/android/apps/messaging/shared/api/messaging/MessageId;Lcom/google/android/apps/messaging/conversation2/messagelist/message/MessageUiDataCache$CacheValue;)V", 0);
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        MessageId messageId = (MessageId) obj;
        yjo yjoVar = (yjo) obj2;
        messageId.getClass();
        yjoVar.getClass();
        ((ekrd) yjr.a.g().h("com/google/android/apps/messaging/conversation2/messagelist/message/MessageUiDataCache", "onCacheEntryRemoved", 122, "MessageUiDataCache.kt")).t("Canceling message scope. id = %s", messageId.a());
        fdjy.e(yjoVar.c, null);
        return fctx.a;
    }
}
