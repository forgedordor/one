package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dryc {
    public static final ekrg a = ekrg.c("com/google/android/libraries/inputmethod/utils/ProcessUtil");
    private static final drjx b = new drjx();

    private dryc() {
    }

    public static boolean a(final Context context) {
        String str = (String) b.a(new ejxr() { // from class: dryb
            /* JADX WARN: Code restructure failed: missing block: B:38:0x00a5, code lost:
            
                if (r0 == null) goto L42;
             */
            @Override // defpackage.ejxr
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object get() {
                /*
                    r9 = this;
                    int r0 = android.os.Build.VERSION.SDK_INT
                    r1 = 28
                    if (r0 < r1) goto Lb
                    java.lang.String r0 = defpackage.abn$$ExternalSyntheticApiModelOutline0.m29m()
                    return r0
                Lb:
                    boolean r0 = defpackage.drxx.a
                    r1 = 0
                    if (r0 == 0) goto Lac
                    java.lang.String r0 = "android.app.ActivityThread"
                    java.lang.Class<dryc> r2 = defpackage.dryc.class
                    java.lang.ClassLoader r2 = r2.getClassLoader()     // Catch: java.lang.Throwable -> L32
                    r3 = 0
                    java.lang.Class r0 = java.lang.Class.forName(r0, r3, r2)     // Catch: java.lang.Throwable -> L32
                    java.lang.String r2 = "currentProcessName"
                    java.lang.reflect.Method r0 = r0.getDeclaredMethod(r2, r1)     // Catch: java.lang.Throwable -> L32
                    r2 = 1
                    r0.setAccessible(r2)     // Catch: java.lang.Throwable -> L32
                    java.lang.Object r0 = r0.invoke(r1, r1)     // Catch: java.lang.Throwable -> L32
                    boolean r2 = r0 instanceof java.lang.String     // Catch: java.lang.Throwable -> L32
                    if (r2 == 0) goto L47
                    java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Throwable -> L32
                    goto L48
                L32:
                    r0 = move-exception
                    r8 = r0
                    ekrg r0 = defpackage.dryc.a
                    ekrw r2 = r0.e()
                    r6 = 178(0xb2, float:2.5E-43)
                    java.lang.String r7 = "ProcessUtil.java"
                    java.lang.String r3 = "Unable to check ActivityThread"
                    java.lang.String r4 = "com/google/android/libraries/inputmethod/utils/ProcessUtil"
                    java.lang.String r5 = "processNameFromActivityThread"
                    defpackage.a.o(r2, r3, r4, r5, r6, r7, r8)
                L47:
                    r0 = r1
                L48:
                    if (r0 == 0) goto L4d
                L4a:
                    r1 = r0
                    goto Ld9
                L4d:
                    android.os.StrictMode$ThreadPolicy r2 = android.os.StrictMode.allowThreadDiskReads()
                    java.lang.String r3 = "ProcessUtil.java"
                    java.io.BufferedReader r4 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L7f java.lang.Exception -> L81
                    java.io.FileReader r0 = new java.io.FileReader     // Catch: java.lang.Throwable -> L7f java.lang.Exception -> L81
                    java.lang.String r5 = "/proc/self/cmdline"
                    r0.<init>(r5)     // Catch: java.lang.Throwable -> L7f java.lang.Exception -> L81
                    r5 = 50
                    r4.<init>(r0, r5)     // Catch: java.lang.Throwable -> L7f java.lang.Exception -> L81
                    java.lang.String r0 = r4.readLine()     // Catch: java.lang.Throwable -> L74
                    if (r0 == 0) goto L6c
                    java.lang.String r0 = r0.trim()     // Catch: java.lang.Throwable -> L74
                    goto L6d
                L6c:
                    r0 = r1
                L6d:
                    r4.close()     // Catch: java.lang.Throwable -> L7f java.lang.Exception -> L81
                    android.os.StrictMode.setThreadPolicy(r2)
                    goto La5
                L74:
                    r0 = move-exception
                    r5 = r0
                    r4.close()     // Catch: java.lang.Throwable -> L7a
                    goto L7e
                L7a:
                    r0 = move-exception
                    r5.addSuppressed(r0)     // Catch: java.lang.Throwable -> L7f java.lang.Exception -> L81
                L7e:
                    throw r5     // Catch: java.lang.Throwable -> L7f java.lang.Exception -> L81
                L7f:
                    r0 = move-exception
                    goto La8
                L81:
                    r0 = move-exception
                    ekrg r4 = defpackage.dryc.a     // Catch: java.lang.Throwable -> L7f
                    ekrw r4 = r4.i()     // Catch: java.lang.Throwable -> L7f
                    ekrd r4 = (defpackage.ekrd) r4     // Catch: java.lang.Throwable -> L7f
                    ekrw r0 = r4.g(r0)     // Catch: java.lang.Throwable -> L7f
                    ekrd r0 = (defpackage.ekrd) r0     // Catch: java.lang.Throwable -> L7f
                    java.lang.String r4 = "com/google/android/libraries/inputmethod/utils/ProcessUtil"
                    java.lang.String r5 = "processNameFromProc"
                    r6 = 155(0x9b, float:2.17E-43)
                    ekrw r0 = r0.h(r4, r5, r6, r3)     // Catch: java.lang.Throwable -> L7f
                    ekrd r0 = (defpackage.ekrd) r0     // Catch: java.lang.Throwable -> L7f
                    java.lang.String r3 = "Unable to read /proc/self/cmdline"
                    r0.q(r3)     // Catch: java.lang.Throwable -> L7f
                    android.os.StrictMode.setThreadPolicy(r2)
                    r0 = r1
                La5:
                    if (r0 == 0) goto Lac
                    goto L4a
                La8:
                    android.os.StrictMode.setThreadPolicy(r2)
                    throw r0
                Lac:
                    android.content.Context r0 = r1
                    java.lang.String r2 = "activity"
                    java.lang.Object r0 = r0.getSystemService(r2)
                    android.app.ActivityManager r0 = (android.app.ActivityManager) r0
                    if (r0 != 0) goto Lb9
                    goto Ld9
                Lb9:
                    java.util.List r0 = r0.getRunningAppProcesses()
                    if (r0 == 0) goto Ld9
                    int r2 = android.os.Process.myPid()
                    java.util.Iterator r0 = r0.iterator()
                Lc7:
                    boolean r3 = r0.hasNext()
                    if (r3 == 0) goto Ld9
                    java.lang.Object r3 = r0.next()
                    android.app.ActivityManager$RunningAppProcessInfo r3 = (android.app.ActivityManager.RunningAppProcessInfo) r3
                    int r4 = r3.pid
                    if (r4 != r2) goto Lc7
                    java.lang.String r1 = r3.processName
                Ld9:
                    return r1
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.dryb.get():java.lang.Object");
            }
        });
        if (str != null) {
            return str.equals(context.getPackageName());
        }
        ((ekrd) ((ekrd) a.i()).h("com/google/android/libraries/inputmethod/utils/ProcessUtil", "isMainProcess", 54, "ProcessUtil.java")).q("Process name wasn't available. Assuming we're on the main process");
        return true;
    }
}
