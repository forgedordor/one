package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dvwf {
    public static Uri a(long j, dwxj dwxjVar) {
        return f("conversations", "REGISTRATION", String.valueOf(j), "BLOCKS_PATH", String.valueOf(dwxjVar.hashCode()));
    }

    public static Uri b(long j, dwpk dwpkVar) {
        return f("contacts", "REGISTRATION", String.valueOf(j), "CONTACT_PATH", String.valueOf(dwpkVar.hashCode()));
    }

    public static Uri c(long j, dwpx dwpxVar) {
        return f("conversations", "REGISTRATION", String.valueOf(j), "CONVERSATION_PATH", String.valueOf(dwpxVar.hashCode()));
    }

    public static Uri d(long j, dwpx dwpxVar) {
        return f("messages", "REGISTRATION", String.valueOf(j), "MESSAGES_FOR_CONVERSATION_PATH", String.valueOf(dwpxVar.hashCode()));
    }

    public static Uri e(long j, dwpx dwpxVar) {
        return f("participants", "REGISTRATION", String.valueOf(j), "PARTICIPANTS_LIST_PATH", String.valueOf(dwpxVar.hashCode()));
    }

    public static Uri f(String str, String... strArr) {
        Uri.Builder builder = new Uri.Builder();
        builder.scheme("content");
        builder.authority("com.google.android.libraries.messaging.lighter.internal.data");
        builder.appendEncodedPath(str);
        for (String str2 : strArr) {
            builder.appendEncodedPath(str2);
        }
        return builder.build();
    }
}
