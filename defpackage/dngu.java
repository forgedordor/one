package defpackage;

import android.net.Uri;
import java.nio.charset.StandardCharsets;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dngu {
    public static final String a(Uri uri) {
        uri.getClass();
        String scheme = uri.getScheme();
        String authority = uri.getAuthority();
        String path = uri.getPath();
        return scheme + "://" + authority + "/redacted-" + (path != null ? c(path) : null);
    }

    public static final String b(String str) {
        return "redacted-".concat(c(str));
    }

    private static final String c(String str) {
        int i = elcz.a;
        return elcx.a.c(str, StandardCharsets.UTF_8).toString();
    }
}
