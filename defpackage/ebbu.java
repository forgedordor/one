package defpackage;

import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import android.os.StrictMode;
import android.util.Log;
import java.io.BufferedReader;
import java.io.FileReader;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ebbu {
    private static String a;
    private static Boolean b;

    private ebbu() {
    }

    public static String a(Context context) {
        String strTrim;
        BufferedReader bufferedReader;
        Object objInvoke;
        String str = a;
        if (str != null) {
            return str;
        }
        if (Build.VERSION.SDK_INT >= 28) {
            String processName = Application.getProcessName();
            a = processName;
            return processName;
        }
        String str2 = null;
        if (!"robolectric".equals(Build.FINGERPRINT)) {
            try {
                Method declaredMethod = Class.forName("android.app.ActivityThread", false, ebbu.class.getClassLoader()).getDeclaredMethod("currentProcessName", null);
                declaredMethod.setAccessible(true);
                objInvoke = declaredMethod.invoke(null, null);
            } catch (Throwable th) {
                Log.d("CurrentProcess", "Unable to check ActivityThread", th);
            }
            String str3 = objInvoke instanceof String ? (String) objInvoke : null;
            a = str3;
            if (str3 != null) {
                return str3;
            }
            StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
            try {
                try {
                    bufferedReader = new BufferedReader(new FileReader("/proc/self/cmdline"), 50);
                } catch (Exception e) {
                    Log.e("CurrentProcess", "Unable to read /proc/self/cmdline", e);
                    StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                    strTrim = null;
                }
                try {
                    strTrim = bufferedReader.readLine().trim();
                    bufferedReader.close();
                    a = strTrim;
                    if (strTrim != null) {
                        return strTrim;
                    }
                } catch (Throwable th2) {
                    try {
                        bufferedReader.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                    throw th2;
                }
            } finally {
                StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
            }
        }
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) context.getSystemService("activity")).getRunningAppProcesses();
        if (runningAppProcesses != null) {
            int iMyPid = Process.myPid();
            Iterator<ActivityManager.RunningAppProcessInfo> it = runningAppProcesses.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                ActivityManager.RunningAppProcessInfo next = it.next();
                if (next.pid == iMyPid) {
                    str2 = next.processName;
                    break;
                }
            }
        }
        a = str2;
        return str2;
    }

    public static boolean b() {
        if (b == null) {
            b = Boolean.valueOf(Process.isApplicationUid(Process.myUid()));
        }
        return b.booleanValue();
    }
}
