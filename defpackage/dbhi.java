package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dbhi extends dbht {
    public static ContentResolver a;
    public final dbhr b = new dbhr(Uri.parse("content://com.google.android.rcs.service.preferences"), ekon.a);

    public static void a(Context context) {
        a = context.getContentResolver();
    }
}
