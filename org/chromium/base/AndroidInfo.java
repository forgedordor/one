package org.chromium.base;

import android.os.Build;
import android.text.TextUtils;
import internal.J.N;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class AndroidInfo {
    private AndroidInfo() {
    }

    public static String a() {
        return Build.FINGERPRINT.substring(0, Math.min(Build.FINGERPRINT.length(), 128));
    }

    private static void nativeReadyForFields() {
        N.MYc8mtnY(Build.BRAND, Build.DEVICE, Build.ID, Build.MANUFACTURER, Build.MODEL, Build.TYPE, Build.BOARD, a(), Build.VERSION.INCREMENTAL, Build.HARDWARE, Build.VERSION.CODENAME, Build.VERSION.SDK_INT >= 31 ? Build.SOC_MANUFACTURER : "", TextUtils.join(", ", Build.SUPPORTED_ABIS), Build.VERSION.SDK_INT, "eng".equals(Build.TYPE) || "userdebug".equals(Build.TYPE), Build.VERSION.SDK_INT >= 34, Build.VERSION.SDK_INT >= 33);
    }
}
