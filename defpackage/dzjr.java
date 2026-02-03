package defpackage;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Trace;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dzjr {
    public static volatile ActivityManager a;
    static volatile boolean b;
    private static volatile String c;

    private dzjr() {
    }

    public static dzju a(Context context, String str) {
        dzjo dzjoVar;
        try {
            Trace.beginSection(str);
            Object systemService = context.getSystemService("activity");
            systemService.getClass();
            List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) systemService).getRunningAppProcesses();
            if (runningAppProcesses == null) {
                int i = ekgb.d;
                dzjoVar = new dzjo(false, ekoe.a);
            } else {
                dzjoVar = new dzjo(true, ekgb.n(runningAppProcesses));
            }
            return dzjoVar;
        } finally {
            Trace.endSection();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x003e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String b() throws java.lang.Throwable {
        /*
            java.lang.String r0 = defpackage.dzjr.c
            if (r0 == 0) goto L5
            goto L40
        L5:
            int r0 = android.os.Process.myPid()
            r1 = 0
            if (r0 > 0) goto Ld
            goto L3c
        Ld:
            java.io.BufferedReader r2 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L31 java.io.IOException -> L38
            java.io.FileReader r3 = new java.io.FileReader     // Catch: java.lang.Throwable -> L31 java.io.IOException -> L38
            java.lang.String r4 = "/proc/"
            java.lang.String r5 = "/cmdline"
            java.lang.String r0 = defpackage.a.e(r0, r4, r5)     // Catch: java.lang.Throwable -> L31 java.io.IOException -> L38
            r3.<init>(r0)     // Catch: java.lang.Throwable -> L31 java.io.IOException -> L38
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L31 java.io.IOException -> L38
            java.lang.String r0 = r2.readLine()     // Catch: java.lang.Throwable -> L2e java.io.IOException -> L39
            r0.getClass()     // Catch: java.lang.Throwable -> L2e java.io.IOException -> L39
            java.lang.String r1 = r0.trim()     // Catch: java.lang.Throwable -> L2e java.io.IOException -> L39
        L2a:
            r2.close()     // Catch: java.io.IOException -> L3c
            goto L3c
        L2e:
            r0 = move-exception
            r1 = r2
            goto L32
        L31:
            r0 = move-exception
        L32:
            if (r1 == 0) goto L37
            r1.close()     // Catch: java.io.IOException -> L37
        L37:
            throw r0
        L38:
            r2 = r1
        L39:
            if (r2 == 0) goto L3c
            goto L2a
        L3c:
            if (r1 == 0) goto L40
            defpackage.dzjr.c = r1
        L40:
            java.lang.String r0 = defpackage.dzjr.c
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dzjr.b():java.lang.String");
    }

    public static String c(String str, String str2) {
        if (str2 == null || str == null || !str2.startsWith(str)) {
            return str2;
        }
        int length = str.length();
        if (str2.length() == length) {
            return null;
        }
        return str2.substring(length + 1);
    }

    public static boolean d(Context context, dzju dzjuVar) {
        if (!dzjuVar.b()) {
            return false;
        }
        ekgb<ActivityManager.RunningAppProcessInfo> ekgbVarC = dzjuVar.c();
        String packageName = context.getPackageName();
        String strValueOf = String.valueOf(packageName);
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : ekgbVarC) {
            if (runningAppProcessInfo.importance == 100) {
                if (!runningAppProcessInfo.processName.equals(packageName)) {
                    if (runningAppProcessInfo.processName.startsWith(strValueOf.concat(":"))) {
                    }
                }
                return true;
            }
        }
        return false;
    }
}
