package defpackage;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.util.Log;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dcer {
    private static dcer b;
    private static volatile Set c;
    private static volatile Set d;
    public final Context a;
    private volatile String e;

    public dcer(Context context) {
        this.a = context.getApplicationContext();
    }

    public static dcer c(Context context) {
        dclh.m(context);
        synchronized (dcer.class) {
            if (b == null) {
                dceg.c(context);
                b = new dcer(context);
            }
        }
        return b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:56:0x00c6, code lost:
    
        r5 = r9;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @java.lang.Deprecated
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean e(android.content.pm.PackageInfo r10, boolean r11) {
        /*
            Method dump skipped, instructions count: 241
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dcer.e(android.content.pm.PackageInfo, boolean):boolean");
    }

    private static dcec f(PackageInfo packageInfo, dcec... dcecVarArr) {
        if (packageInfo.signatures != null) {
            if (packageInfo.signatures.length != 1) {
                Log.w("GoogleSignatureVerifier", "Package has more than one signature.");
                return null;
            }
            dced dcedVar = new dced(packageInfo.signatures[0].toByteArray());
            for (int i = 0; i < dcecVarArr.length; i++) {
                if (dcecVarArr[i].equals(dcedVar)) {
                    return dcecVarArr[i];
                }
            }
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:89:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r4v0, types: [android.os.StrictMode$ThreadPolicy] */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r6v2, types: [android.os.IBinder, com.google.android.gms.dynamic.IObjectWrapper] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.dcel a(java.lang.String r17) throws android.content.pm.PackageManager.NameNotFoundException {
        /*
            Method dump skipped, instructions count: 346
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dcer.a(java.lang.String):dcel");
    }

    public final dcel b(int i) throws PackageManager.NameNotFoundException {
        String[] packagesForUid = this.a.getPackageManager().getPackagesForUid(i);
        dcel dcelVarA = null;
        if (packagesForUid == null || (packagesForUid.length) == 0) {
            return new dcel(false, "no pkgs", null);
        }
        for (String str : packagesForUid) {
            dcelVarA = a(str);
            if (dcelVarA.b) {
                return dcelVarA;
            }
        }
        dclh.m(dcelVarA);
        return dcelVarA;
    }

    public final boolean d(int i) throws PackageManager.NameNotFoundException {
        dcel dcelVarB = b(i);
        dcelVarB.b();
        return dcelVarB.b;
    }
}
