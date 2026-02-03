package defpackage;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkInfo;
import android.os.StrictMode;
import java.io.IOException;
import java.net.Socket;
import org.chromium.base.ApplicationStatus;
import org.chromium.base.TraceEvent;
import org.chromium.net.AndroidNetworkLibrary;
import org.chromium.net.DnsStatus;
import org.chromium.net.NetworkChangeNotifierAutoDetect;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ffzr {
    public final ConnectivityManager a;

    ffzr() {
        this.a = null;
    }

    public static final boolean h(Network network) throws IOException {
        boolean z;
        Socket socket = new Socket();
        try {
            TraceEvent traceEventA = TraceEvent.a("StrictModeContext.allowAllVmPolicies");
            try {
                StrictMode.VmPolicy vmPolicy = StrictMode.getVmPolicy();
                StrictMode.setVmPolicy(StrictMode.VmPolicy.LAX);
                ffyi ffyiVar = new ffyi(null, vmPolicy);
                if (traceEventA != null) {
                    traceEventA.close();
                }
                try {
                    network.bindSocket(socket);
                    ffyiVar.close();
                    z = true;
                } catch (Throwable th) {
                    try {
                        ffyiVar.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                if (traceEventA != null) {
                    try {
                        traceEventA.close();
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                    }
                }
                throw th3;
            }
        } catch (IOException unused) {
            z = false;
        } catch (Throwable th5) {
            try {
                socket.close();
            } catch (IOException unused2) {
            }
            throw th5;
        }
        try {
            socket.close();
        } catch (IOException unused3) {
        }
        return z;
    }

    public final int a(Network network) {
        NetworkInfo networkInfoC = c(network);
        if (networkInfoC == null || !networkInfoC.isConnected()) {
            return 6;
        }
        return NetworkChangeNotifierAutoDetect.convertToConnectionType(networkInfoC.getType(), networkInfoC.getSubtype());
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0053  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.net.Network b() {
        /*
            r10 = this;
            android.net.ConnectivityManager r0 = r10.a
            android.net.Network r1 = r0.getActiveNetwork()
            if (r1 != 0) goto L60
            android.net.NetworkInfo r0 = r0.getActiveNetworkInfo()
            r2 = 0
            if (r0 != 0) goto L10
            return r2
        L10:
            android.net.Network[] r3 = org.chromium.net.NetworkChangeNotifierAutoDetect.m658$$Nest$smgetAllNetworksFiltered(r10, r2)
            int r4 = r3.length
            r5 = 0
        L16:
            if (r5 >= r4) goto L60
            r6 = r3[r5]
            android.net.NetworkInfo r7 = r10.d(r6)
            if (r7 == 0) goto L5d
            int r8 = r7.getType()
            int r9 = r0.getType()
            if (r8 == r9) goto L32
            int r8 = r7.getType()
            r9 = 17
            if (r8 != r9) goto L5d
        L32:
            if (r1 == 0) goto L51
            int r8 = android.os.Build.VERSION.SDK_INT
            r9 = 29
            if (r8 < r9) goto L51
            android.net.NetworkInfo$DetailedState r7 = r7.getDetailedState()
            android.net.NetworkInfo$DetailedState r8 = android.net.NetworkInfo.DetailedState.CONNECTING
            if (r7 == r8) goto L5d
            android.net.NetworkInfo r7 = r10.d(r1)
            if (r7 == 0) goto L51
            android.net.NetworkInfo$DetailedState r7 = r7.getDetailedState()
            android.net.NetworkInfo$DetailedState r8 = android.net.NetworkInfo.DetailedState.CONNECTING
            if (r7 != r8) goto L51
            r1 = r2
        L51:
            if (r1 == 0) goto L5c
            java.lang.String r1 = org.chromium.net.NetworkChangeNotifierAutoDetect.m656$$Nest$sfgetTAG()
            java.lang.String r7 = "There should not be multiple connected networks of the same type. At least as of Android Marshmallow this is not supported. If this becomes supported this assertion may trigger."
            defpackage.ffyc.c(r1, r7)
        L5c:
            r1 = r6
        L5d:
            int r5 = r5 + 1
            goto L16
        L60:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ffzr.b():android.net.Network");
    }

    final NetworkInfo c(Network network) {
        NetworkInfo networkInfoD = d(network);
        return (networkInfoD == null || networkInfoD.getType() != 17) ? networkInfoD : this.a.getActiveNetworkInfo();
    }

    final NetworkInfo d(Network network) {
        try {
            try {
                return this.a.getNetworkInfo(network);
            } catch (NullPointerException unused) {
                return null;
            }
        } catch (NullPointerException unused2) {
            return this.a.getNetworkInfo(network);
        }
    }

    public final ffzn e(Network network) {
        for (int i = 0; i < 2; i++) {
            try {
                return new ffzn(this.a.getNetworkCapabilities(network));
            } catch (SecurityException unused) {
            }
        }
        return null;
    }

    public final void f(ConnectivityManager.NetworkCallback networkCallback) {
        this.a.unregisterNetworkCallback(networkCallback);
    }

    public final NetworkChangeNotifierAutoDetect.NetworkState g() {
        Network networkB = b();
        NetworkInfo networkInfoC = c(networkB);
        if (networkInfoC == null) {
            networkInfoC = null;
        } else if (!networkInfoC.isConnected()) {
            if (networkInfoC.getDetailedState() == NetworkInfo.DetailedState.BLOCKED) {
                ApplicationStatus.getStateForApplication();
            }
            networkInfoC = null;
        }
        if (networkInfoC == null) {
            return new NetworkChangeNotifierAutoDetect.NetworkState(false, -1, -1, false, null, false, "");
        }
        if (networkB != null) {
            ffzn ffznVarE = e(networkB);
            boolean z = (ffznVarE == null || ffznVarE.a(11)) ? false : true;
            DnsStatus dnsStatusB = AndroidNetworkLibrary.b(networkB);
            return dnsStatusB == null ? new NetworkChangeNotifierAutoDetect.NetworkState(true, networkInfoC.getType(), networkInfoC.getSubtype(), z, String.valueOf(NetworkChangeNotifierAutoDetect.networkToNetId(networkB)), false, "") : new NetworkChangeNotifierAutoDetect.NetworkState(true, networkInfoC.getType(), networkInfoC.getSubtype(), z, String.valueOf(NetworkChangeNotifierAutoDetect.networkToNetId(networkB)), dnsStatusB.getPrivateDnsActive(), dnsStatusB.getPrivateDnsServerName());
        }
        if (networkInfoC.getType() != 1) {
            return new NetworkChangeNotifierAutoDetect.NetworkState(true, networkInfoC.getType(), networkInfoC.getSubtype(), false, null, false, "");
        }
        if (networkInfoC.getExtraInfo() != null && !"".equals(networkInfoC.getExtraInfo())) {
            return new NetworkChangeNotifierAutoDetect.NetworkState(true, networkInfoC.getType(), networkInfoC.getSubtype(), false, networkInfoC.getExtraInfo(), false, "");
        }
        networkInfoC.getType();
        networkInfoC.getSubtype();
        throw null;
    }

    public ffzr(Context context) {
        this.a = (ConnectivityManager) context.getSystemService("connectivity");
    }
}
