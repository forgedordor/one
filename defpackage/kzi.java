package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Trace;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kzi {
    public static final kzq a;
    public static final cub b;

    static {
        plm.a("TypefaceCompat static init");
        if (Build.VERSION.SDK_INT >= 29) {
            a = new kzm();
        } else if (Build.VERSION.SDK_INT >= 28) {
            a = new kzl();
        } else {
            a = new kzk();
        }
        b = new cub(16);
        Trace.endSection();
    }

    public static Typeface a(Context context, Resources resources, int i, String str, int i2, int i3) {
        Typeface typefaceD = a.d(context, resources, i, str, i3);
        if (typefaceD != null) {
            b.d(b(resources, i, str, i2, i3), typefaceD);
        }
        return typefaceD;
    }

    public static String b(Resources resources, int i, String str, int i2, int i3) {
        return resources.getResourcePackageName(i) + '-' + str + '-' + i2 + '-' + i + '-' + i3;
    }

    public static Typeface c(Context context, lbd[] lbdVarArr, int i) {
        plm.a("TypefaceCompat.createFromFontInfo");
        try {
            return a.b(context, lbdVarArr, i);
        } finally {
            Trace.endSection();
        }
    }
}
