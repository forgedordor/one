package org.chromium.base;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Process;
import defpackage.a;
import defpackage.ffxs;
import defpackage.ffxu;
import internal.J.N;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ApkInfo {
    private static volatile ApkInfo h;
    private static final Object i = new Object();
    public final String a;
    public final String b;
    public final long c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;

    private ApkInfo() {
        String str;
        String strQ;
        String[] packagesForUid;
        Context context = ffxu.a;
        String packageName = context.getPackageName();
        PackageManager packageManager = context.getPackageManager();
        int i2 = ffxs.a.b;
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        if (!ffxu.b() || (packagesForUid = packageManager.getPackagesForUid(Process.myUid() - 10000)) == null || packagesForUid.length <= 0) {
            str = packageName;
            strQ = str;
        } else {
            str = packagesForUid[0];
            strQ = a.q(str, packageName, ":");
        }
        this.a = strQ;
        this.b = b(packageManager.getApplicationLabel(applicationInfo));
        this.f = packageName;
        this.c = 1L;
        this.d = "136.0.7091.2";
        this.e = b(packageManager.getInstallerPackageName(str));
        this.g = "Not Enabled";
    }

    public static ApkInfo a() {
        if (h == null) {
            synchronized (i) {
                if (h == null) {
                    h = new ApkInfo();
                }
            }
        }
        return h;
    }

    private static String b(CharSequence charSequence) {
        return charSequence == null ? "" : charSequence.toString();
    }

    private static void nativeReadyForFields() {
        boolean z;
        ApkInfo apkInfoA = a();
        String str = apkInfoA.a;
        long j = apkInfoA.c;
        String str2 = apkInfoA.b;
        String str3 = apkInfoA.d;
        String str4 = apkInfoA.f;
        String str5 = apkInfoA.g;
        String str6 = apkInfoA.e;
        int i2 = ffxu.a.getApplicationInfo().flags & 2;
        int i3 = ffxu.a.getApplicationInfo().targetSdkVersion;
        int i4 = ffxu.a.getApplicationInfo().targetSdkVersion;
        boolean z2 = false;
        if (i3 >= 34) {
            z = false;
            z2 = true;
        } else {
            z = false;
        }
        N.MOh5qbSu(str, "1", str2, "1", str3, str4, str5, str6, i2 == 0 ? z : true, z2, i4);
    }
}
