package defpackage;

import android.R;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.text.TextUtils;
import android.util.Log;
import androidx.core.graphics.drawable.IconCompat;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eufu {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final Intent e;
    public final int f;

    public eufu(String str, String str2, String str3, String str4, Intent intent, int i) {
        if (TextUtils.isEmpty(str2) && TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("titleWithEntity and titleWithoutEntity should not be both null");
        }
        this.a = str;
        this.b = str2;
        str3.getClass();
        this.c = str3;
        this.d = str4;
        intent.getClass();
        this.e = intent;
        this.f = i;
    }

    static /* synthetic */ CharSequence a(eufu eufuVar) {
        String str = eufuVar.b;
        return !TextUtils.isEmpty(str) ? str : eufuVar.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0062  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final androidx.core.app.RemoteActionCompat c(android.content.Context r7, android.content.Intent r8, androidx.core.graphics.drawable.IconCompat r9, boolean r10, android.content.pm.ResolveInfo r11) {
        /*
            r6 = this;
            int r0 = r6.f
            r1 = 201326592(0xc000000, float:9.8607613E-32)
            android.app.PendingIntent r8 = android.app.PendingIntent.getActivity(r7, r0, r8, r1)
            java.lang.CharSequence r0 = a(r6)
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 == 0) goto L1b
            java.lang.String r0 = "Custom titleChooser return null, fallback to the default titleChooser"
            defpackage.eufs.a(r0)
            java.lang.CharSequence r0 = a(r6)
        L1b:
            androidx.core.app.RemoteActionCompat r1 = new androidx.core.app.RemoteActionCompat
            android.content.pm.PackageManager r7 = r7.getPackageManager()
            java.lang.String r2 = r6.d
            boolean r3 = android.text.TextUtils.isEmpty(r2)
            if (r3 != 0) goto L62
            r3 = 0
            if (r11 == 0) goto L51
            android.content.pm.ActivityInfo r4 = r11.activityInfo
            if (r4 != 0) goto L31
            goto L51
        L31:
            android.content.pm.ActivityInfo r4 = r11.activityInfo
            java.lang.String r4 = r4.packageName
            java.lang.String r5 = "android"
            boolean r4 = r5.equals(r4)
            if (r4 == 0) goto L3e
            goto L51
        L3e:
            android.content.pm.ActivityInfo r4 = r11.activityInfo
            android.content.pm.ApplicationInfo r4 = r4.applicationInfo
            if (r4 != 0) goto L45
            goto L51
        L45:
            android.content.pm.ActivityInfo r11 = r11.activityInfo
            android.content.pm.ApplicationInfo r11 = r11.applicationInfo
            java.lang.CharSequence r7 = r7.getApplicationLabel(r11)
            java.lang.String r3 = r7.toString()
        L51:
            boolean r7 = android.text.TextUtils.isEmpty(r3)
            if (r7 != 0) goto L62
            r7 = 1
            java.lang.Object[] r7 = new java.lang.Object[r7]
            r11 = 0
            r7[r11] = r3
            java.lang.String r7 = java.lang.String.format(r2, r7)
            goto L64
        L62:
            java.lang.String r7 = r6.c
        L64:
            r1.<init>(r9, r0, r7, r8)
            r1.f = r10
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eufu.c(android.content.Context, android.content.Intent, androidx.core.graphics.drawable.IconCompat, boolean, android.content.pm.ResolveInfo):androidx.core.app.RemoteActionCompat");
    }

    public final euft b(Context context) {
        PackageManager packageManager = context.getPackageManager();
        Intent intent = this.e;
        ResolveInfo resolveInfoResolveActivity = packageManager.resolveActivity(intent, 65536);
        IconCompat iconCompatH = null;
        if (resolveInfoResolveActivity == null || resolveInfoResolveActivity.activityInfo == null) {
            if ("android.intent.action.VIEW".equals(intent.getAction())) {
                String scheme = intent.getScheme();
                if (ejwh.a(scheme, "http") || ejwh.a(scheme, "https")) {
                    return new euft(new Intent(intent), c(context, intent, IconCompat.h(context, R.drawable.ic_menu_more), false, resolveInfoResolveActivity));
                }
            }
            eufs.a("resolveInfo or activityInfo is null");
            return null;
        }
        ActivityInfo activityInfo = resolveInfoResolveActivity.activityInfo;
        if (!activityInfo.exported || (activityInfo.permission != null && kxj.c(context, activityInfo.permission) != 0)) {
            String strValueOf = String.valueOf(String.valueOf(resolveInfoResolveActivity.activityInfo));
            int i = eufs.a;
            Log.d("androidtc", "No permission to access: ".concat(strValueOf));
            return null;
        }
        String str = resolveInfoResolveActivity.activityInfo.packageName;
        String str2 = resolveInfoResolveActivity.activityInfo.name;
        if (str == null || str2 == null) {
            eufs.a("packageName or className is null");
            return null;
        }
        Intent intent2 = new Intent(intent);
        boolean z = false;
        if (!"android".equals(str)) {
            intent2.setComponent(new ComponentName(str, str2));
            if (resolveInfoResolveActivity.activityInfo.getIconResource() != 0) {
                try {
                    iconCompatH = IconCompat.h(context.createPackageContext(str, 0), resolveInfoResolveActivity.activityInfo.getIconResource());
                } catch (PackageManager.NameNotFoundException e) {
                    int i2 = eufs.a;
                    Log.e("androidtc", "createIconFromPackage: failed to create package context", e);
                }
                z = true;
            }
        }
        boolean z2 = z;
        if (iconCompatH == null) {
            iconCompatH = IconCompat.h(context, R.drawable.ic_menu_more);
        }
        return new euft(intent2, c(context, intent2, iconCompatH, z2, resolveInfoResolveActivity));
    }
}
