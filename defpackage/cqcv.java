package defpackage;

import android.net.Uri;
import android.util.Log;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import java.nio.charset.StandardCharsets;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cqcv {
    public static String a(ConversationIdType conversationIdType) {
        return b(conversationIdType.toString());
    }

    public static String b(CharSequence charSequence) {
        if (charSequence == null) {
            return null;
        }
        return Log.isLoggable("Bugle", 3) ? a.b(charSequence, "raw-pii[", "]") : e(charSequence);
    }

    public static String c(alqm alqmVar) {
        return b(alqmVar.toString());
    }

    public static String d(Uri uri) {
        String string;
        String path = uri.getPath();
        if (path == null) {
            string = "";
        } else {
            int i = elcz.a;
            string = elcx.a.c(path, StandardCharsets.UTF_8).toString();
        }
        return uri.getScheme() + "://" + uri.getAuthority() + "/redacted-" + string;
    }

    public static String e(CharSequence charSequence) {
        if (charSequence == null) {
            return null;
        }
        return "redacted-pii[" + charSequence.length() + "-chars]";
    }

    public static String f(Uri uri) {
        if (uri == null) {
            return null;
        }
        if (Log.isLoggable("Bugle", 3)) {
            return uri.toString();
        }
        return uri.getScheme() + "://" + uri.getAuthority() + "/...Redacted...";
    }
}
