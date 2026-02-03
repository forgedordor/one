package defpackage;

import android.content.Context;
import android.content.pm.ShortcutInfo;
import androidx.core.graphics.drawable.IconCompat;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;

/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class cqdn {
    static {
        ekhx.r("com.google.android.apps.messaging.ui.conversationlist.SHARE_TARGET_CATEGORY", "com.google.android.apps.messaging.ui.conversationlist.VIDEO_SHARE_TARGET_CATEGORY");
    }

    public abstract ConversationId a(String str);

    public abstract eiju b(ConversationId conversationId, String str, alqm alqmVar, String str2, boolean z);

    public abstract eiju c(String str, Context context, boolean z, int i);

    public abstract String d(String str);

    public abstract String e(ConversationIdType conversationIdType);

    public abstract void f(Context context);

    public abstract void g();

    public abstract void h();

    public abstract boolean i(String str);

    public abstract eiju j();

    public abstract ShortcutInfo k(Context context, ConversationId conversationId, String str, alqm alqmVar, IconCompat iconCompat, String str2, int i);
}
