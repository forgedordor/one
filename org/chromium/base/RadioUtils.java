package org.chromium.base;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.os.Build;
import android.os.Process;
import android.telephony.SignalStrength;
import android.telephony.TelephonyManager;
import defpackage.ffxn;
import defpackage.ffxu;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class RadioUtils {
    private static Boolean a;
    private static Boolean b;

    private RadioUtils() {
    }

    private static int getCellDataActivity() {
        int dataActivity;
        TraceEvent traceEventA = TraceEvent.a("RadioUtils::getCellDataActivity");
        try {
            try {
                dataActivity = ((TelephonyManager) ffxu.a.getSystemService("phone")).getDataActivity();
            } catch (SecurityException unused) {
                dataActivity = -1;
            }
            if (traceEventA != null) {
                traceEventA.close();
            }
            return dataActivity;
        } catch (Throwable th) {
            if (traceEventA != null) {
                try {
                    traceEventA.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    private static int getCellSignalLevel() {
        TraceEvent traceEventA = TraceEvent.a("RadioUtils::getCellSignalLevel");
        try {
            int level = -1;
            try {
                SignalStrength signalStrength = ((TelephonyManager) ffxu.a.getSystemService("phone")).getSignalStrength();
                if (signalStrength != null) {
                    level = signalStrength.getLevel();
                }
            } catch (SecurityException unused) {
            }
            if (traceEventA != null) {
                traceEventA.close();
            }
            return level;
        } catch (Throwable th) {
            if (traceEventA != null) {
                try {
                    traceEventA.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    private static boolean isSupported() {
        if (Build.VERSION.SDK_INT >= 28) {
            if (a == null) {
                a = Boolean.valueOf(ffxn.a(ffxu.a, "android.permission.ACCESS_NETWORK_STATE", Process.myPid(), Process.myUid()) == 0);
            }
            if (a.booleanValue()) {
                if (b == null) {
                    b = Boolean.valueOf(ffxn.a(ffxu.a, "android.permission.ACCESS_WIFI_STATE", Process.myPid(), Process.myUid()) == 0);
                }
                if (b.booleanValue()) {
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean isWifiConnected() {
        NetworkCapabilities networkCapabilities;
        TraceEvent traceEventA = TraceEvent.a("RadioUtils::isWifiConnected");
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) ffxu.a.getSystemService("connectivity");
            Network activeNetwork = connectivityManager.getActiveNetwork();
            boolean zHasTransport = false;
            if (activeNetwork != null && (networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork)) != null) {
                zHasTransport = networkCapabilities.hasTransport(1);
            }
            if (traceEventA != null) {
                traceEventA.close();
            }
            return zHasTransport;
        } catch (Throwable th) {
            if (traceEventA != null) {
                try {
                    traceEventA.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }
}
