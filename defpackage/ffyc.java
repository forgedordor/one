package defpackage;

import android.util.Log;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ffyc {
    public static String a(String str) {
        return "cn_".concat(String.valueOf(str));
    }

    public static void b(String str, String str2, Object... objArr) {
        if (k(str, 3)) {
            int length = objArr.length;
            Throwable th = null;
            if (length != 0) {
                Object obj = objArr[0];
                if (obj instanceof Throwable) {
                    th = (Throwable) obj;
                }
            }
            if (th == null && length > 0) {
                str2 = String.format(Locale.US, str2, objArr);
            }
            String strA = a(str);
            if (th != null) {
                Log.d(strA, str2, th);
            } else {
                Log.d(strA, str2);
            }
        }
    }

    public static void c(String str, String str2) {
        Log.e(a(str), str2);
    }

    public static void d(String str, String str2, Throwable th) {
        Log.e(a(str), str2, th);
    }

    public static void e(String str, String str2) {
        Log.i(a(str), str2);
    }

    public static void f(String str, String str2, Object obj) {
        Log.i(a(str), String.format(Locale.US, str2, obj));
    }

    public static void g(String str, String str2, Throwable th) {
        Log.i(a(str), str2, th);
    }

    public static void h(String str, String str2, Object obj, Object obj2) {
        Log.i(a(str), String.format(Locale.US, str2, obj, obj2));
    }

    public static void i(String str, String str2) {
        Log.w(a(str), str2);
    }

    public static void j(String str, String str2, Throwable th) {
        Log.w(a(str), str2, th);
    }

    public static boolean k(String str, int i) {
        return Log.isLoggable(str, i);
    }

    public static void l(String str, Object obj, Throwable th) {
        Log.e(a("X509Util"), String.format(Locale.US, str, obj), th);
    }
}
