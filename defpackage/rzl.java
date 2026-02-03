package defpackage;

import android.util.Log;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class rzl {
    public static String a(String str, Object... objArr) {
        return String.format(Locale.US, str, objArr);
    }

    public static void b(Throwable th, String str) {
        rzk.b(str + "\n" + rzk.a(th));
    }

    public static void c(String str) {
        if (f(4)) {
            rzk.c(4, str);
        }
    }

    public static void d(String str) {
        rzk.d(str);
    }

    public static void e(Throwable th, String str) {
        rzk.d(str + "\n" + rzk.a(th));
    }

    public static boolean f(int i) {
        rzj rzjVar = rzk.a;
        return Log.isLoggable("stetho", i);
    }
}
