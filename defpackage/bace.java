package defpackage;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bace {
    public static Uri a(Context context, ConversationIdType conversationIdType) {
        Uri.Builder builderBuildUpon = Uri.parse(m(context).concat("conversation_images")).buildUpon();
        builderBuildUpon.appendPath(conversationIdType.a());
        return builderBuildUpon.build();
    }

    public static Uri b(Context context, ConversationIdType conversationIdType) {
        return c(context, conversationIdType, bary.a, new String[0]);
    }

    public static Uri c(Context context, ConversationIdType conversationIdType, MessageIdType messageIdType, String... strArr) {
        if (conversationIdType.b()) {
            conversationIdType = barn.a;
        }
        Uri.Builder builderBuildUpon = g(context).buildUpon();
        builderBuildUpon.appendPath(conversationIdType.a());
        if (!messageIdType.c()) {
            builderBuildUpon.appendPath(messageIdType.b());
        }
        builderBuildUpon.encodedQuery(TextUtils.join("&", strArr));
        return builderBuildUpon.build();
    }

    public static Uri d(Context context, ConversationId conversationId) {
        if (conversationId == null) {
            return e(context, barn.a);
        }
        Uri.Builder builderBuildUpon = i(context).buildUpon();
        builderBuildUpon.appendPath(conversationId.b());
        return builderBuildUpon.build();
    }

    public static Uri e(Context context, ConversationIdType conversationIdType) {
        Uri.Builder builderBuildUpon = i(context).buildUpon();
        builderBuildUpon.appendPath(conversationIdType.a());
        return builderBuildUpon.build();
    }

    public static Uri f(Uri.Builder builder, ConversationIdType conversationIdType) {
        if (!conversationIdType.b()) {
            builder.appendPath(conversationIdType.a());
        }
        return builder.build();
    }

    public static Uri g(Context context) {
        return Uri.parse(m(context).concat("messages/conversation"));
    }

    public static Uri h(Context context) {
        return Uri.parse(m(context).concat("participants/conversation"));
    }

    public static Uri i(Context context) {
        return Uri.parse(m(context).concat("conversations"));
    }

    public static Uri j(Context context) {
        return k(context).buildUpon().appendPath("delete").build();
    }

    public static Uri k(Context context) {
        return Uri.parse(m(context).concat("desktops"));
    }

    public static Uri l(Context context) {
        return Uri.parse(m(context).concat("messages"));
    }

    public static String m(Context context) {
        return "content://" + axgg.a(context) + "/";
    }
}
