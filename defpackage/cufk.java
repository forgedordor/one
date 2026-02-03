package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.net.Uri;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;
import com.android.vcard.VCardConfig;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.suggestions.notifications.receiver.NotificationSmartActionReceiver;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cufk {
    private final Context a;
    private final ajso b;

    public cufk(Context context, ajso ajsoVar) {
        this.a = context;
        this.b = ajsoVar;
    }

    public final kvf a(ConversationId conversationId, String str, int i, boolean z, String str2) {
        Context context = this.a;
        Intent intent = new Intent(context, (Class<?>) NotificationSmartActionReceiver.class);
        Uri.Builder builderBuildUpon = bace.i(context).buildUpon();
        builderBuildUpon.appendPath(conversationId.b());
        builderBuildUpon.encodedQuery(TextUtils.join("&", new String[]{str}));
        intent.setData(builderBuildUpon.build());
        intent.setAction("com.google.android.apps.messaging.accept_suggestion");
        ajso.d(conversationId, intent, true);
        intent.putExtra("suggestion_id", str);
        PendingIntent pendingIntentD = ebsn.d(context, 0, intent, crag.a(VCardConfig.FLAG_CONVERT_PHONETIC_NAME_STRINGS));
        pendingIntentD.getClass();
        IconCompat iconCompatH = IconCompat.h(context, i);
        if (z) {
            iconCompatH.h = ColorStateList.valueOf(context.getColor(R.color.primary_brand_icon_color));
        }
        kve kveVar = new kve(iconCompatH, str2, pendingIntentD);
        kveVar.d = true;
        kveVar.e = true;
        return kveVar.a();
    }
}
