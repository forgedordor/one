package defpackage;

import android.content.Intent;
import android.os.Build;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kxl {
    public static Object a(Intent intent, String str, Class cls) {
        if (Build.VERSION.SDK_INT >= 34) {
            return intent.getParcelableExtra(str, cls);
        }
        Parcelable parcelableExtra = intent.getParcelableExtra(str);
        if (cls.isInstance(parcelableExtra)) {
            return parcelableExtra;
        }
        return null;
    }
}
