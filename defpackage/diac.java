package defpackage;

import android.content.Context;
import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class diac {
    public static final boolean a(Context context) {
        Uri uri = diad.a;
        int i = context.getApplicationInfo().uid;
        return i != -1 && context.checkUriPermission(diad.a, 0, i, 1) == 0;
    }
}
