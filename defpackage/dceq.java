package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageInstaller;
import android.content.pm.PackageManager;
import android.os.Build;
import android.util.Log;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class dceq {
    private static boolean a = false;
    static boolean b = false;
    public static final /* synthetic */ int d = 0;

    @Deprecated
    static final AtomicBoolean c = new AtomicBoolean();
    private static final AtomicBoolean e = new AtomicBoolean();

    @Deprecated
    public static int a(Context context) {
        try {
            return context.getPackageManager().getPackageInfo("com.google.android.gms", 0).versionCode;
        } catch (PackageManager.NameNotFoundException unused) {
            Log.w("GooglePlayServicesUtil", "Google Play services is missing.");
            return 0;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0116  */
    @java.lang.Deprecated
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int b(android.content.Context r9, int r10) throws android.content.pm.PackageManager.NameNotFoundException {
        /*
            Method dump skipped, instructions count: 414
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dceq.b(android.content.Context, int):int");
    }

    public static Context c(Context context) {
        try {
            return context.createPackageContext("com.google.android.gms", 3);
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    @Deprecated
    public static void d(Context context, int i) throws dcen, dceo {
        dcdu dcduVar = dcdu.d;
        int iH = dcduVar.h(context, i);
        if (iH != 0) {
            Intent intentI = dcduVar.i(context, iH, "e");
            Log.e("GooglePlayServicesUtil", a.g(iH, "GooglePlayServices not available due to error "));
            if (intentI != null) {
                throw new dceo(iH, "Google Play Services not available", intentI);
            }
            throw new dcen(iH);
        }
    }

    public static boolean e(Context context) {
        try {
            if (!b) {
                PackageInfo packageInfoB = dcnv.b(context).b("com.google.android.gms", Build.VERSION.SDK_INT >= 28 ? 134217792 : 64);
                dcer.c(context);
                if (packageInfoB == null || dcer.e(packageInfoB, false) || !dcer.e(packageInfoB, true)) {
                    a = false;
                } else {
                    a = true;
                }
            }
        } catch (PackageManager.NameNotFoundException e2) {
            Log.w("GooglePlayServicesUtil", "Cannot find Google Play services package name.", e2);
        } finally {
            b = true;
        }
        return a || !"user".equals(Build.TYPE);
    }

    @Deprecated
    public static boolean f(Context context, int i) {
        if (i == 1) {
            return h(context);
        }
        return false;
    }

    @Deprecated
    public static boolean g(int i) {
        return i == 1 || i == 2 || i == 3 || i == 9;
    }

    public static boolean h(Context context) {
        try {
            Iterator<PackageInstaller.SessionInfo> it = context.getPackageManager().getPackageInstaller().getAllSessions().iterator();
            while (it.hasNext()) {
                if ("com.google.android.gms".equals(it.next().getAppPackageName())) {
                    return true;
                }
            }
            return context.getPackageManager().getApplicationInfo("com.google.android.gms", 8192).enabled;
        } catch (PackageManager.NameNotFoundException | Exception unused) {
            return false;
        }
    }
}
