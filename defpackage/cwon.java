package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cwon {
    public static final Uri a(Uri uri) {
        if (uri.isHierarchical()) {
            return uri;
        }
        String string = uri.toString();
        string.getClass();
        Uri uri2 = Uri.parse(fdgn.r(string));
        uri2.getClass();
        return uri2;
    }
}
