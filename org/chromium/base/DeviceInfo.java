package org.chromium.base;

import android.app.UiModeManager;
import android.content.Context;
import android.content.pm.FeatureInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import defpackage.ffxu;
import defpackage.ffyc;
import defpackage.ffyg;
import internal.J.N;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class DeviceInfo {
    private static DeviceInfo a;
    private static final Object b = new Object();
    private String c;
    private final boolean d;
    private final boolean e;
    private final boolean f;
    private final boolean g;
    private final int h;

    private DeviceInfo() {
        String strValueOf;
        boolean zHasSystemFeature;
        FeatureInfo[] systemAvailableFeatures;
        int i = 0;
        PackageInfo packageInfoA = ffyg.a("com.google.android.gms", 0);
        if (packageInfoA != null) {
            strValueOf = String.valueOf(Build.VERSION.SDK_INT >= 28 ? packageInfoA.getLongVersionCode() : packageInfoA.versionCode);
        } else {
            strValueOf = "gms versionCode not available.";
        }
        this.c = strValueOf;
        Context context = ffxu.a;
        PackageManager packageManager = context.getPackageManager();
        UiModeManager uiModeManager = (UiModeManager) context.getSystemService("uimode");
        this.d = uiModeManager != null && uiModeManager.getCurrentModeType() == 4;
        try {
            zHasSystemFeature = packageManager.hasSystemFeature("android.hardware.type.automotive");
        } catch (SecurityException e) {
            ffyc.d("DeviceInfo", "Unable to query for Automotive system feature", e);
            zHasSystemFeature = false;
        }
        this.e = zHasSystemFeature;
        this.f = Build.VERSION.SDK_INT >= 30 && packageManager.hasSystemFeature("android.hardware.sensor.hinge_angle");
        this.g = packageManager.hasSystemFeature("android.hardware.type.pc");
        if (Build.VERSION.SDK_INT >= 33 && (systemAvailableFeatures = packageManager.getSystemAvailableFeatures()) != null) {
            int i2 = 0;
            while (true) {
                if (i2 >= systemAvailableFeatures.length) {
                    break;
                }
                FeatureInfo featureInfo = systemAvailableFeatures[i2];
                if ("android.software.vulkan.deqp.level".equals(featureInfo.name)) {
                    i = featureInfo.version;
                    break;
                }
                i2++;
            }
        }
        this.h = i;
    }

    public static int a() {
        return f().h;
    }

    public static boolean b() {
        return f().e;
    }

    public static boolean c() {
        return f().g;
    }

    public static boolean d() {
        return f().f;
    }

    public static boolean e() {
        return f().d;
    }

    private static DeviceInfo f() {
        DeviceInfo deviceInfo;
        synchronized (b) {
            if (a == null) {
                a = new DeviceInfo();
            }
            deviceInfo = a;
        }
        return deviceInfo;
    }

    private static void nativeReadyForFields() {
        N.MFWeJGQZ(f().c, e(), b(), d(), c(), a());
    }
}
