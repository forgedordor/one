package defpackage;

import android.app.AppOpsManager;
import android.content.Context;
import android.os.Binder;
import android.os.Build;
import android.os.Process;
import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kya {
    public static int a(Context context, String str, int i, int i2, String str2) {
        int iA;
        if (context.checkPermission(str, i, i2) == -1) {
            return -1;
        }
        String strPermissionToOp = AppOpsManager.permissionToOp(str);
        if (strPermissionToOp == null) {
            return 0;
        }
        if (str2 == null) {
            String[] packagesForUid = context.getPackageManager().getPackagesForUid(i2);
            if (packagesForUid == null || packagesForUid.length <= 0) {
                return -1;
            }
            str2 = packagesForUid[0];
        }
        int iMyUid = Process.myUid();
        String packageName = context.getPackageName();
        if (iMyUid == i2 && Objects.equals(packageName, str2) && Build.VERSION.SDK_INT >= 29) {
            AppOpsManager appOpsManager = (AppOpsManager) context.getSystemService(AppOpsManager.class);
            iA = kut.a(appOpsManager, strPermissionToOp, Binder.getCallingUid(), str2);
            if (iA == 0) {
                iA = kut.a(appOpsManager, strPermissionToOp, i2, context.getOpPackageName());
            }
        } else {
            iA = kuu.a(context, strPermissionToOp, str2);
        }
        return iA == 0 ? 0 : -2;
    }

    public static int b(Context context, String str) {
        return a(context, str, Process.myPid(), Process.myUid(), context.getPackageName());
    }
}
