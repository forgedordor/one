package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.android.vcard.VCardConfig;
import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.receiver.CopyOtpReceiver;
import com.google.android.apps.messaging.shared.receiver.RestoreReceiver;
import com.google.android.apps.messaging.shared.receiver.SendStatusReceiver;
import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class ckze implements cldu {
    private static final Uri a = Uri.parse("content://buglesmssend");
    private final Context b;
    private final cmvy c;
    private final aymn d;
    private final aypj e;

    public ckze(Context context, cmvy cmvyVar, aymn aymnVar, aypj aypjVar) {
        this.b = context;
        this.c = cmvyVar;
        this.d = aymnVar;
        this.e = aypjVar;
    }

    @Override // defpackage.cldu
    public final PendingIntent a(String str, Uri uri, int i, int i2, int i3, MessageIdType messageIdType, String str2, long j) {
        Uri uriWithAppendedPath = Uri.withAppendedPath(a, messageIdType.b());
        Context context = this.b;
        Intent intent = new Intent(str, uriWithAppendedPath, context, SendStatusReceiver.class);
        intent.putExtra("partCnt", i);
        intent.putExtra("partId", i2);
        intent.putExtra("subId", i3);
        intent.putExtra(ConversationSuggestion.SUGGESTION_PROPERTY_WEB_URI, uri);
        intent.putExtra("message_id", messageIdType.b());
        intent.putExtra("destination", str2);
        intent.putExtra("messageId", j);
        this.c.f(intent);
        return PendingIntent.getBroadcast(context, i2, intent, crag.a);
    }

    @Override // defpackage.cldu
    public final Intent b(Uri uri, Uri uri2, Bundle bundle, long j) {
        Intent intent = new Intent("com.google.android.apps.messaging.shared.receiver.SendStatusReceiver.MMS_DOWNLOADED", uri, this.b, SendStatusReceiver.class);
        this.c.f(intent);
        intent.putExtra("content_uri", uri2);
        intent.putExtra("messageId", j);
        intent.putExtras(bundle);
        return intent;
    }

    @Override // defpackage.cldu
    public final Intent c(Context context, Uri uri, Uri uri2, boolean z, Bundle bundle, long j) {
        Intent intent = new Intent("com.google.android.apps.messaging.shared.receiver.SendStatusReceiver.MMS_SENT", uri, context, SendStatusReceiver.class);
        intent.putExtra("content_uri", uri2);
        intent.putExtra("response_important", z);
        intent.putExtra("messageId", j);
        if (bundle != null) {
            intent.putExtras(bundle);
        }
        this.c.f(intent);
        return intent;
    }

    @Override // defpackage.cldu
    public final Intent d() {
        Intent intent = new Intent("com.lge.bnr.intent.action.REQUEST_MESSAGE").setClass(this.b, RestoreReceiver.class);
        intent.putExtra("BNR_MODE", 2);
        return intent;
    }

    @Override // defpackage.cldu
    public final PendingIntent e(String str, ConversationIdType conversationIdType, MessageIdType messageIdType) {
        Context context = this.b;
        aiiw aiiwVarC = aiiw.c(context, CopyOtpReceiver.class, "android.intent.action.VIEW");
        aiiwVarC.f(context.getPackageName());
        Intent intentA = aiiwVarC.a();
        intentA.setAction("com.google.android.apps.messaging.copy_otp");
        intentA.addCategory(conversationIdType.a());
        intentA.putExtra("otp_code", str);
        intentA.putExtra("conversation_id", conversationIdType.a());
        intentA.putExtra("mapi_conversation_id", new BugleConversationId(conversationIdType));
        intentA.putExtra("message_id", messageIdType.b());
        PendingIntent pendingIntentD = ebsn.d(context, 123, intentA, crag.a(VCardConfig.FLAG_CONVERT_PHONETIC_NAME_STRINGS));
        pendingIntentD.getClass();
        return pendingIntentD;
    }

    @Override // defpackage.cldu
    public final PendingIntent f(ConversationIdType conversationIdType) {
        Action actionF = this.e.f(conversationIdType, bary.a, true);
        aymn aymnVar = this.d;
        Context context = this.b;
        return aymnVar.a(context, actionF, 120, false, bace.b(context, conversationIdType));
    }
}
