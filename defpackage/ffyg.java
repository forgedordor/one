package defpackage;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ffyg {
    public static final char[] a = "0123456789ABCDEF".toCharArray();

    public static PackageInfo a(String str, int i) {
        try {
            return ffxu.a.getPackageManager().getPackageInfo(str, i);
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }
}
