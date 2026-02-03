package defpackage;

import android.util.Log;
import java.util.Arrays;
import java.util.IllegalFormatException;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dbhe {
    private static final String a = "dbhe";
    private static final boolean b = true;

    private dbhe() {
    }

    public static String a(String str, Object... objArr) {
        String str2;
        try {
            if (objArr.length != 0) {
                str = String.format(Locale.US, str, objArr);
            }
        } catch (IllegalFormatException e) {
            String string = Arrays.toString(objArr);
            Log.wtf("Blog", a("msg: \"%s\" args: %s", str, string), new dbhf(e));
            str = a.q(string, str, " ");
        }
        long id = Thread.currentThread().getId();
        if (!b) {
            return String.format(Locale.US, "[%d] %s", Long.valueOf(id), str);
        }
        StackTraceElement[] stackTrace = new Throwable().fillInStackTrace().getStackTrace();
        int i = 2;
        while (true) {
            if (i >= stackTrace.length) {
                str2 = "<unknown>";
                break;
            }
            StackTraceElement stackTraceElement = stackTrace[i];
            String className = stackTraceElement.getClassName();
            if (!className.equals(a) && !className.endsWith("Log")) {
                str2 = className.substring(className.lastIndexOf(46) + 1) + "." + stackTraceElement.getMethodName();
                break;
            }
            i++;
        }
        return String.format(Locale.US, "[%d] %s: %s", Long.valueOf(id), str2, str);
    }

    public static void b(String str, String str2, Object... objArr) {
        if (Log.isLoggable(str, 2)) {
            Log.v(str, a(str2, objArr));
        }
    }
}
