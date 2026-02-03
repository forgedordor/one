package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class duqq {
    public static Uri a(Uri uri) {
        String string = uri.toString();
        return Uri.parse(string.substring(0, string.lastIndexOf("_")));
    }

    public static String b(String str, String str2) {
        return a.q(str2, str, "_");
    }
}
