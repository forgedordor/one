package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cpge {
    public static final /* synthetic */ int a = 0;
    private static final ejxr b = ejxx.a(new ejxr() { // from class: cpgd
        @Override // defpackage.ejxr
        public final Object get() {
            int i = cpge.a;
            return Pattern.compile("messages\\.android_(\\d+)_(\\d+)_rc(\\d+)[^\\d].*");
        }
    });
    private static final AtomicReference c = new AtomicReference("");

    public static int a(Context context) throws PackageManager.NameNotFoundException {
        String[] strArrF = f(context);
        if (strArrF.length > 2) {
            try {
                return Integer.parseInt(strArrF[2]);
            } catch (NumberFormatException unused) {
            }
        }
        return -1;
    }

    public static int b(Context context) throws PackageManager.NameNotFoundException {
        String[] strArrF = f(context);
        if (strArrF.length > 0) {
            try {
                return Integer.parseInt(strArrF[0]);
            } catch (NumberFormatException unused) {
            }
        }
        return -1;
    }

    public static int c(Context context) throws PackageManager.NameNotFoundException {
        String[] strArrF = f(context);
        if (strArrF.length > 1) {
            try {
                return Integer.parseInt(strArrF[1]);
            } catch (NumberFormatException unused) {
            }
        }
        return -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x003a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String d(android.content.Context r3) throws android.content.pm.PackageManager.NameNotFoundException {
        /*
            java.lang.String r0 = "unknown_app_version"
            java.util.concurrent.atomic.AtomicReference r1 = defpackage.cpge.c
            java.lang.Object r1 = r1.get()
            java.lang.String r1 = (java.lang.String) r1
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            if (r2 == 0) goto L40
            java.lang.String r1 = r3.getPackageName()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L2f
            android.content.pm.PackageManager r3 = r3.getPackageManager()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L2f
            r2 = 0
            android.content.pm.PackageInfo r3 = r3.getPackageInfo(r1, r2)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L2f
            java.lang.String r1 = r3.versionName     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L2f
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L2f
            if (r1 == 0) goto L26
            goto L33
        L26:
            java.lang.String r3 = r3.versionName     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L2f
            java.util.Locale r1 = java.util.Locale.US     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L2f
            java.lang.String r3 = r3.toLowerCase(r1)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L2f
            goto L34
        L2f:
            r3 = move-exception
            r3.printStackTrace()
        L33:
            r3 = r0
        L34:
            boolean r0 = android.text.TextUtils.equals(r0, r3)
            if (r0 != 0) goto L3f
            java.util.concurrent.atomic.AtomicReference r0 = defpackage.cpge.c
            r0.set(r3)
        L3f:
            return r3
        L40:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cpge.d(android.content.Context):java.lang.String");
    }

    public static String e(Context context) throws PackageManager.NameNotFoundException {
        String strD = d(context);
        Matcher matcher = ((Pattern) b.get()).matcher(strD);
        if (!matcher.matches()) {
            int iIndexOf = strD.indexOf(32);
            return iIndexOf == -1 ? strD : strD.substring(0, iIndexOf);
        }
        return matcher.group(1) + "." + matcher.group(2) + "." + matcher.group(3);
    }

    private static String[] f(Context context) throws PackageManager.NameNotFoundException {
        String strD = d(context);
        Matcher matcher = ((Pattern) b.get()).matcher(strD);
        return matcher.matches() ? new String[]{matcher.group(1), matcher.group(2), matcher.group(3)} : strD.split("[\\. ]", -1);
    }
}
