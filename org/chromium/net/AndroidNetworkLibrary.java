package org.chromium.net;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.LinkProperties;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.net.TrafficStats;
import android.net.TransportInfo;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.os.Process;
import android.security.NetworkSecurityPolicy;
import android.telephony.TelephonyManager;
import android.util.Log;
import defpackage.ffxn;
import defpackage.ffxu;
import defpackage.ffze;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.net.URLConnection;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.util.Enumeration;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class AndroidNetworkLibrary {
    private static Boolean a;
    private static Boolean b;

    /* compiled from: PG */
    public static class NetworkSecurityPolicyProxy {
        private static NetworkSecurityPolicyProxy sInstance = new NetworkSecurityPolicyProxy();

        public static NetworkSecurityPolicyProxy getInstance() {
            return sInstance;
        }

        public static void setInstanceForTesting(NetworkSecurityPolicyProxy networkSecurityPolicyProxy) {
            sInstance = networkSecurityPolicyProxy;
        }

        public boolean isCleartextTrafficPermitted() {
            return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted();
        }

        public boolean isCleartextTrafficPermitted(String str) {
            return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(str);
        }
    }

    AndroidNetworkLibrary() {
    }

    public static WifiInfo a() {
        TransportInfo transportInfo;
        if (!c()) {
            Intent intentA = ffxu.a(ffxu.a, null, new IntentFilter("android.net.wifi.STATE_CHANGE"));
            if (intentA != null) {
                return (WifiInfo) intentA.getParcelableExtra("wifiInfo");
            }
        } else {
            if (Build.VERSION.SDK_INT < 31) {
                return ((WifiManager) ffxu.a.getSystemService("wifi")).getConnectionInfo();
            }
            ConnectivityManager connectivityManager = (ConnectivityManager) ffxu.a.getSystemService("connectivity");
            for (Network network : connectivityManager.getAllNetworks()) {
                NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(network);
                if (networkCapabilities != null && networkCapabilities.hasTransport(1) && (transportInfo = networkCapabilities.getTransportInfo()) != null && (transportInfo instanceof WifiInfo)) {
                    return (WifiInfo) transportInfo;
                }
            }
        }
        return null;
    }

    public static void addTestRootCertificate(byte[] bArr) {
        X509Util.addTestRootCertificate(bArr);
    }

    public static DnsStatus b(Network network) {
        ConnectivityManager connectivityManager;
        if (a == null) {
            a = Boolean.valueOf(ffxn.a(ffxu.a, "android.permission.ACCESS_NETWORK_STATE", Process.myPid(), Process.myUid()) == 0);
        }
        if (!a.booleanValue() || (connectivityManager = (ConnectivityManager) ffxu.a.getSystemService("connectivity")) == null) {
            return null;
        }
        if (network == null) {
            network = connectivityManager.getActiveNetwork();
        }
        if (network == null) {
            return null;
        }
        try {
            LinkProperties linkProperties = connectivityManager.getLinkProperties(network);
            if (linkProperties == null) {
                return null;
            }
            List<InetAddress> dnsServers = linkProperties.getDnsServers();
            String domains = linkProperties.getDomains();
            return Build.VERSION.SDK_INT >= 28 ? new DnsStatus(dnsServers, linkProperties.isPrivateDnsActive(), linkProperties.getPrivateDnsServerName(), domains) : new DnsStatus(dnsServers, false, "", domains);
        } catch (RuntimeException unused) {
            return null;
        }
    }

    private static boolean c() {
        if (b == null) {
            b = Boolean.valueOf(ffxn.a(ffxu.a, "android.permission.ACCESS_WIFI_STATE", Process.myPid(), Process.myUid()) == 0);
        }
        return b.booleanValue();
    }

    public static void clearTestRootCertificates() {
        X509Util.clearTestRootCertificates();
    }

    public static DnsStatus getCurrentDnsStatus() {
        return b(null);
    }

    public static DnsStatus getDnsStatusForNetwork(long j) {
        try {
            return b(Network.fromNetworkHandle(j));
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    private static boolean getIsCaptivePortal() {
        Network activeNetwork;
        NetworkCapabilities networkCapabilities;
        ConnectivityManager connectivityManager = (ConnectivityManager) ffxu.a.getSystemService("connectivity");
        return (connectivityManager == null || (activeNetwork = connectivityManager.getActiveNetwork()) == null || (networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork)) == null || !networkCapabilities.hasCapability(17)) ? false : true;
    }

    private static boolean getIsRoaming() {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) ffxu.a.getSystemService("connectivity")).getActiveNetworkInfo();
        if (activeNetworkInfo == null) {
            return false;
        }
        return activeNetworkInfo.isRoaming();
    }

    public static String getMimeTypeFromExtension(String str) {
        return URLConnection.guessContentTypeFromName("foo.".concat(String.valueOf(str)));
    }

    private static String getNetworkOperator() {
        TelephonyManager telephonyManager = (TelephonyManager) ffxu.a.getSystemService("phone");
        return telephonyManager == null ? "" : telephonyManager.getNetworkOperator();
    }

    public static byte[][] getUserAddedRoots() {
        return X509Util.getUserAddedRoots();
    }

    public static String getWifiSSID() {
        String ssid;
        WifiInfo wifiInfoA = a();
        return (wifiInfoA == null || (ssid = wifiInfoA.getSSID()) == null || ssid.equals("<unknown ssid>")) ? "" : ssid;
    }

    public static int getWifiSignalLevel(int i) {
        int intExtra;
        int iCalculateSignalLevel;
        Context context = ffxu.a;
        if (context == null || context.getContentResolver() == null) {
            return -1;
        }
        if (c()) {
            WifiInfo wifiInfoA = a();
            if (wifiInfoA == null) {
                return -1;
            }
            intExtra = wifiInfoA.getRssi();
        } else {
            try {
                Intent intentA = ffxu.a(ffxu.a, null, new IntentFilter("android.net.wifi.RSSI_CHANGED"));
                if (intentA == null) {
                    return -1;
                }
                intExtra = intentA.getIntExtra("newRssi", Integer.MIN_VALUE);
            } catch (IllegalArgumentException unused) {
                return -1;
            }
        }
        if (intExtra == Integer.MIN_VALUE || (iCalculateSignalLevel = WifiManager.calculateSignalLevel(intExtra, i)) < 0 || iCalculateSignalLevel >= i) {
            return -1;
        }
        return iCalculateSignalLevel;
    }

    public static boolean haveOnlyLoopbackAddresses() throws SocketException {
        try {
            Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
            if (networkInterfaces == null) {
                return false;
            }
            while (networkInterfaces.hasMoreElements()) {
                NetworkInterface networkInterfaceNextElement = networkInterfaces.nextElement();
                if (networkInterfaceNextElement.isUp() && !networkInterfaceNextElement.isLoopback()) {
                    return false;
                }
            }
            return true;
        } catch (Exception e) {
            Log.w("AndroidNetworkLibrary", "could not get network interfaces: ".concat(e.toString()));
            return false;
        }
    }

    private static boolean isCleartextPermitted(String str) {
        try {
            return NetworkSecurityPolicyProxy.getInstance().isCleartextTrafficPermitted(str);
        } catch (IllegalArgumentException unused) {
            return NetworkSecurityPolicyProxy.getInstance().isCleartextTrafficPermitted();
        }
    }

    private static boolean reportBadDefaultNetwork() {
        ConnectivityManager connectivityManager = (ConnectivityManager) ffxu.a.getSystemService("connectivity");
        if (connectivityManager == null) {
            return false;
        }
        connectivityManager.reportNetworkConnectivity(null, false);
        return true;
    }

    private static void tagSocket(int i, int i2, int i3) throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
        int threadStatsTag = TrafficStats.getThreadStatsTag();
        if (i3 != threadStatsTag) {
            TrafficStats.setThreadStatsTag(i3);
        }
        if (i2 != -1) {
            ThreadStatsUid.set(i2);
        }
        ParcelFileDescriptor parcelFileDescriptorAdoptFd = ParcelFileDescriptor.adoptFd(i);
        ffze ffzeVar = new ffze(parcelFileDescriptorAdoptFd.getFileDescriptor());
        TrafficStats.tagSocket(ffzeVar);
        ffzeVar.close();
        if (parcelFileDescriptorAdoptFd != null) {
            parcelFileDescriptorAdoptFd.detachFd();
        }
        if (i3 != threadStatsTag) {
            TrafficStats.setThreadStatsTag(threadStatsTag);
        }
        if (i2 != -1) {
            ThreadStatsUid.clear();
        }
    }

    public static AndroidCertVerifyResult verifyServerCertificates(byte[][] bArr, String str, String str2, byte[] bArr2, byte[] bArr3) {
        try {
            return X509Util.verifyServerCertificates(bArr, str, str2, bArr2, bArr3);
        } catch (IllegalArgumentException unused) {
            return new AndroidCertVerifyResult(-1);
        } catch (KeyStoreException unused2) {
            return new AndroidCertVerifyResult(-1);
        } catch (NoSuchAlgorithmException unused3) {
            return new AndroidCertVerifyResult(-1);
        }
    }
}
