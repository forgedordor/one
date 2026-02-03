package defpackage;

import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qlk {
    private static final String a = qas.d("ProcessUtils");

    public static final boolean a(Context context, pzd pzdVar) {
        String processName;
        Object next;
        Object objInvoke;
        context.getClass();
        pzdVar.getClass();
        if (Build.VERSION.SDK_INT >= 28) {
            processName = Application.getProcessName();
            processName.getClass();
        } else {
            processName = null;
            try {
                Method declaredMethod = Class.forName("android.app.ActivityThread", false, qbr.class.getClassLoader()).getDeclaredMethod("currentProcessName", null);
                declaredMethod.setAccessible(true);
                objInvoke = declaredMethod.invoke(null, null);
                objInvoke.getClass();
            } catch (Throwable th) {
                qas.c().b(a, "Unable to check ActivityThread for processName", th);
            }
            if (objInvoke instanceof String) {
                processName = (String) objInvoke;
            } else {
                int iMyPid = Process.myPid();
                Object systemService = context.getSystemService("activity");
                systemService.getClass();
                List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) systemService).getRunningAppProcesses();
                if (runningAppProcesses != null) {
                    Iterator<T> it = runningAppProcesses.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                        if (((ActivityManager.RunningAppProcessInfo) next).pid == iMyPid) {
                            break;
                        }
                    }
                    ActivityManager.RunningAppProcessInfo runningAppProcessInfo = (ActivityManager.RunningAppProcessInfo) next;
                    if (runningAppProcessInfo != null) {
                        processName = runningAppProcessInfo.processName;
                    }
                }
            }
        }
        String str = pzdVar.g;
        return (str == null || str.length() == 0) ? fdbq.f(processName, context.getApplicationInfo().processName) : fdbq.f(processName, str);
    }
}
