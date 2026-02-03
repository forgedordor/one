package defpackage;

import android.content.Context;
import android.os.UserManager;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lal {
    public static boolean a(Context context) {
        return ((UserManager) context.getSystemService(UserManager.class)).isUserUnlocked();
    }
}
