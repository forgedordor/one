package defpackage;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.os.LocaleList;
import android.os.UserManager;
import android.text.TextUtils;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class craf {
    public static final boolean a;
    public static final boolean b;
    public static final boolean c;
    public static final boolean d;
    public static final boolean e;
    public static final boolean f;
    public static final boolean g;
    public static final boolean h;
    public static final boolean i;
    public static final boolean j;
    static final AtomicReference n;
    static final AtomicInteger k = new AtomicInteger(0);
    private static final AtomicInteger o = new AtomicInteger(0);
    private static final AtomicInteger p = new AtomicInteger(0);
    private static final AtomicInteger q = new AtomicInteger(0);
    public static final AtomicBoolean l = new AtomicBoolean(false);
    public static final AtomicReference m = new AtomicReference(null);

    static {
        int i2 = Build.VERSION.SDK_INT;
        a = i2 >= 27;
        b = i2 >= 28;
        c = i2 >= 29;
        d = i2 >= 30;
        e = i2 >= 31;
        f = i2 >= 33;
        g = i2 == 33;
        h = i2 >= 34;
        i = Build.VERSION.CODENAME.charAt(0) == 'V' || i2 >= 35;
        j = Build.VERSION.CODENAME.charAt(0) == 'B' || i2 >= 36;
        n = new AtomicReference();
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:61:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String a(android.content.Context r4) {
        /*
            java.util.concurrent.atomic.AtomicReference r0 = defpackage.craf.n     // Catch: java.lang.Throwable -> L6e java.lang.RuntimeException -> L73
            java.lang.Object r0 = r0.get()     // Catch: java.lang.Throwable -> L6e java.lang.RuntimeException -> L73
            crae r0 = (defpackage.crae) r0     // Catch: java.lang.Throwable -> L6e java.lang.RuntimeException -> L73
            int r0 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L6e java.lang.RuntimeException -> L73
            r1 = 28
            if (r0 < r1) goto L21
            java.lang.String r0 = defpackage.abn$$ExternalSyntheticApiModelOutline0.m29m()     // Catch: java.lang.Throwable -> L6e java.lang.RuntimeException -> L73
            boolean r1 = defpackage.ejwk.c(r0)     // Catch: java.lang.Throwable -> L6e java.lang.RuntimeException -> L73
            if (r1 != 0) goto L19
            goto L3a
        L19:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L6e java.lang.RuntimeException -> L73
            java.lang.String r1 = "Application.getProcessName() returned Null or empty string"
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L6e java.lang.RuntimeException -> L73
            throw r0     // Catch: java.lang.Throwable -> L6e java.lang.RuntimeException -> L73
        L21:
            java.lang.String r0 = "android.app.ActivityThread"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.ClassNotFoundException -> L65 java.lang.Throwable -> L6e java.lang.RuntimeException -> L73
            java.lang.String r1 = "currentProcessName"
            r2 = 0
            java.lang.reflect.Method r0 = r0.getMethod(r1, r2)     // Catch: java.lang.NoSuchMethodException -> L5c java.lang.Throwable -> L6e java.lang.RuntimeException -> L73
            java.lang.Object r0 = r0.invoke(r2, r2)     // Catch: java.lang.IllegalAccessException -> L51 java.lang.reflect.InvocationTargetException -> L53 java.lang.Throwable -> L6e java.lang.RuntimeException -> L73
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.IllegalAccessException -> L51 java.lang.reflect.InvocationTargetException -> L53 java.lang.Throwable -> L6e java.lang.RuntimeException -> L73
            boolean r1 = defpackage.ejwk.c(r0)     // Catch: java.lang.Throwable -> L6e java.lang.RuntimeException -> L73
            if (r1 != 0) goto L49
        L3a:
            boolean r1 = defpackage.ejwk.c(r0)     // Catch: java.lang.Throwable -> L6e java.lang.RuntimeException -> L73
            if (r1 != 0) goto L41
            return r0
        L41:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L6e java.lang.RuntimeException -> L73
            java.lang.String r1 = "getProcessNameFromInProcessData returned null or empty string"
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L6e java.lang.RuntimeException -> L73
            throw r0     // Catch: java.lang.Throwable -> L6e java.lang.RuntimeException -> L73
        L49:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L6e java.lang.RuntimeException -> L73
            java.lang.String r1 = "currentProcessName (via reflection) returned Null or empty string"
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L6e java.lang.RuntimeException -> L73
            throw r0     // Catch: java.lang.Throwable -> L6e java.lang.RuntimeException -> L73
        L51:
            r0 = move-exception
            goto L54
        L53:
            r0 = move-exception
        L54:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L6e java.lang.RuntimeException -> L73
            java.lang.String r2 = "invokeCurrentProcessName"
            r1.<init>(r2, r0)     // Catch: java.lang.Throwable -> L6e java.lang.RuntimeException -> L73
            throw r1     // Catch: java.lang.Throwable -> L6e java.lang.RuntimeException -> L73
        L5c:
            r0 = move-exception
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L6e java.lang.RuntimeException -> L73
            java.lang.String r2 = "getCurrentProcessNameMethod"
            r1.<init>(r2, r0)     // Catch: java.lang.Throwable -> L6e java.lang.RuntimeException -> L73
            throw r1     // Catch: java.lang.Throwable -> L6e java.lang.RuntimeException -> L73
        L65:
            r0 = move-exception
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L6e java.lang.RuntimeException -> L73
            java.lang.String r2 = "getActivityThreadClass"
            r1.<init>(r2, r0)     // Catch: java.lang.Throwable -> L6e java.lang.RuntimeException -> L73
            throw r1     // Catch: java.lang.Throwable -> L6e java.lang.RuntimeException -> L73
        L6e:
            r0 = move-exception
            k(r0)
            goto L77
        L73:
            r0 = move-exception
            k(r0)
        L77:
            java.util.concurrent.atomic.AtomicBoolean r0 = defpackage.craf.l
            r1 = 1
            r0.set(r1)
            java.util.concurrent.atomic.AtomicReference r0 = defpackage.craf.n
            java.lang.Object r0 = r0.get()
            crae r0 = (defpackage.crae) r0
            java.lang.String r0 = "activity"
            java.lang.Object r4 = r4.getSystemService(r0)
            android.app.ActivityManager r4 = (android.app.ActivityManager) r4
            r4.getClass()
            java.util.List r4 = r4.getRunningAppProcesses()
            java.lang.String r0 = ""
            if (r4 != 0) goto L99
            goto Lb5
        L99:
            int r1 = android.os.Process.myPid()
            java.util.Iterator r4 = r4.iterator()
        La1:
            boolean r2 = r4.hasNext()
            if (r2 == 0) goto Lb5
            java.lang.Object r2 = r4.next()
            android.app.ActivityManager$RunningAppProcessInfo r2 = (android.app.ActivityManager.RunningAppProcessInfo) r2
            if (r2 == 0) goto La1
            int r3 = r2.pid
            if (r3 != r1) goto La1
            java.lang.String r0 = r2.processName
        Lb5:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.craf.a(android.content.Context):java.lang.String");
    }

    public static String b(PackageManager packageManager) {
        ResolveInfo resolveInfoResolveActivity = packageManager.resolveActivity(new Intent("android.intent.action.VIEW", Uri.parse("http://")), 0);
        if (resolveInfoResolveActivity == null || resolveInfoResolveActivity.activityInfo == null || TextUtils.isEmpty(resolveInfoResolveActivity.activityInfo.packageName)) {
            return null;
        }
        return resolveInfoResolveActivity.activityInfo.packageName;
    }

    public static Locale c(Context context) {
        LocaleList locales = context.getResources().getConfiguration().getLocales();
        return locales.size() > 0 ? locales.get(0) : Locale.getDefault();
    }

    public static void d(Context context) {
        context.startActivity(new Intent("android.settings.APPLICATION_DETAILS_SETTINGS", Uri.parse("package:".concat(String.valueOf(context.getPackageName())))));
    }

    public static boolean e(Activity activity, boolean z) {
        return activity.isInMultiWindowMode() && !z;
    }

    public static boolean f(Context context) {
        AtomicInteger atomicInteger = o;
        if (atomicInteger.get() != 0) {
            return atomicInteger.get() == 1;
        }
        Object systemService = context.getSystemService("activity");
        if (systemService == null) {
            return false;
        }
        boolean zIsLowRamDevice = ((ActivityManager) systemService).isLowRamDevice();
        atomicInteger.set(true != zIsLowRamDevice ? 2 : 1);
        return zIsLowRamDevice;
    }

    public static boolean g(Context context) {
        AtomicInteger atomicInteger = k;
        int i2 = atomicInteger.get();
        if (i2 != 0) {
            return i2 == 1;
        }
        boolean zEquals = a(context).equals(context.getPackageName());
        atomicInteger.set(true != zEquals ? 2 : 1);
        return zEquals;
    }

    public static boolean h(Context context) {
        AtomicInteger atomicInteger = q;
        int i2 = atomicInteger.get();
        if (i2 != 0) {
            return i2 == 1;
        }
        boolean zEquals = a(context).equals(context.getPackageName().concat(":rcs"));
        atomicInteger.set(true != zEquals ? 2 : 1);
        return zEquals;
    }

    public static boolean i(Context context) {
        AtomicInteger atomicInteger = p;
        boolean z = false;
        if (atomicInteger.get() != 0) {
            return atomicInteger.get() == 1;
        }
        if (!"Nexus 10".equals(Build.MODEL)) {
            z = !((Build.VERSION.SDK_INT < 34 || context.checkSelfPermission("android.permission.QUERY_USERS") != 0) ? new cral(context) : new crak(context)).a();
        }
        atomicInteger.set(true != z ? 2 : 1);
        return z;
    }

    public static boolean j(Context context) {
        UserManager userManager = (UserManager) context.getSystemService("user");
        userManager.getClass();
        return !userManager.hasUserRestriction("no_sms");
    }

    private static void k(Throwable th) {
        AtomicReference atomicReference = m;
        while (!atomicReference.compareAndSet(null, th) && atomicReference.get() == null) {
        }
    }
}
