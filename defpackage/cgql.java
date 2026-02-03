package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cgql {
    private final Context a;

    public cgql(Context context) {
        this.a = context;
        Pattern.compile("(?<=" + context.getString(R.string.im_notification_tag_suffix) + ")\\d+$");
    }

    public final String a(ConversationIdType conversationIdType) {
        Context context = this.a;
        String strValueOf = String.valueOf(context.getPackageName());
        String strValueOf2 = String.valueOf(context.getString(R.string.im_notification_tag_suffix));
        return strValueOf.concat(strValueOf2).concat(String.valueOf(conversationIdType.a()));
    }
}
