package defpackage;

import android.text.TextUtils;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lcg {
    public static void a(boolean z) {
        if (!z) {
            throw new IllegalArgumentException();
        }
    }

    public static void b(boolean z, Object obj) {
        if (!z) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    public static void c(boolean z) {
        d(z, null);
    }

    public static void d(boolean z, String str) {
        if (!z) {
            throw new IllegalStateException(str);
        }
    }

    public static void e(double d, String str) {
        Double dValueOf = Double.valueOf(0.0d);
        Double dValueOf2 = Double.valueOf(1.0d);
        if (d < 0.0d) {
            throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%f, %f] (too low)", str, dValueOf, dValueOf2));
        }
        if (d > 1.0d) {
            throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%f, %f] (too high)", str, dValueOf, dValueOf2));
        }
    }

    public static void f(int i, int i2, int i3, String str) {
        if (i < i2) {
            throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%d, %d] (too low)", str, Integer.valueOf(i2), Integer.valueOf(i3)));
        }
        if (i > i3) {
            throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%d, %d] (too high)", str, Integer.valueOf(i2), Integer.valueOf(i3)));
        }
    }

    public static void g(int i) {
        if (i < 0) {
            throw new IllegalArgumentException();
        }
    }

    public static void h(int i, String str) {
        if (i < 0) {
            throw new IllegalArgumentException(str);
        }
    }

    public static void i(Object obj) {
        obj.getClass();
    }

    public static void j(Object obj, Object obj2) {
        if (obj == null) {
            throw new NullPointerException((String) obj2);
        }
    }

    public static void k(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            throw new IllegalArgumentException("id cannot be empty");
        }
    }
}
