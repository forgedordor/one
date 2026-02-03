package defpackage;

import android.net.Uri;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes8.dex */
public abstract class cglt {
    public static cglt d(String str, Uri uri) {
        return new cghb(str, uri, Optional.empty());
    }

    public static cglt e(String str, Uri uri, Uri uri2) {
        return new cghb(str, uri, Optional.ofNullable(uri2));
    }

    public abstract Uri a();

    public abstract Optional b();

    public abstract String c();
}
