package defpackage;

import android.content.ContentResolver;
import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ecov {
    public final ContentResolver a;
    public final Uri b;
    public final Uri c;
    public final Uri d;

    public ecov(ContentResolver contentResolver, Uri uri, Uri uri2, Uri uri3) {
        this.a = contentResolver;
        this.b = uri;
        this.c = uri2;
        this.d = uri3;
    }

    public static String a(String str) {
        String[] strArrSplit = str.split("/");
        int length = strArrSplit.length - 1;
        strArrSplit[length] = Uri.encode(strArrSplit[length]);
        return ejwc.d('/').f(strArrSplit);
    }
}
