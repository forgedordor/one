package defpackage;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dfcq {
    private static final Uri a = Uri.parse("content://com.google.android.apps.messaging.shared.datamodel.BugleContentProvider");
    private static final List b = new ArrayList();

    public static boolean a(Context context, String str) {
        List list = b;
        if (!list.isEmpty()) {
            return list.contains(str);
        }
        try {
            Bundle bundleCall = context.getContentResolver().call(a, "is_blocked", str, (Bundle) null);
            if (bundleCall != null) {
                if (bundleCall.getBoolean("blocked", false)) {
                    return true;
                }
            }
        } catch (Exception unused) {
        }
        return false;
    }
}
