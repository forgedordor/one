package defpackage;

import android.os.Build;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class crad {
    public static boolean a() {
        return ejuf.e("GOOGLE", Build.MANUFACTURER) || ejuf.e("GOOGLE", Build.BRAND);
    }

    public static boolean b() {
        return ejuf.e("HUAWEI", Build.MANUFACTURER) || ejuf.e("HONOR", Build.MANUFACTURER) || ejuf.e("HUAWEI", Build.BRAND) || ejuf.e("HONOR", Build.BRAND);
    }

    public static boolean c() {
        return ejuf.e("LGE", Build.MANUFACTURER) || ejuf.e("LGE", Build.BRAND);
    }

    public static boolean d() {
        return ejuf.e("SAMSUNG", Build.MANUFACTURER) || ejuf.e("SAMSUNG", Build.BRAND);
    }
}
