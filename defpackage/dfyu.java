package defpackage;

import android.content.Context;
import android.net.LinkProperties;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.text.TextUtils;
import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class dfyu {
    public static final dfny a = dfod.a(158761105);
    public static final String[] b = {"8.8.8.8", "8.8.4.4"};
    public static final String[] c = {"2001:4860:4860:0:0:0:0:8888", "2001:4860:4860:0:0:0:0:8844"};
    public boolean d;
    public final devr e;
    protected final Context f;
    public Network g;
    public String h;
    public final deym i;
    public final dhip j;
    public final int k;

    public dfyu(Context context, int i, devr devrVar, dhip dhipVar, deym deymVar) {
        this.e = devrVar;
        this.k = i;
        this.j = new dhip(dhipVar.a + "ImsNetworkInterface[" + dfzb.b(i) + "]");
        this.i = deymVar;
        this.f = context;
    }

    public static boolean k(NetworkCapabilities networkCapabilities) {
        return networkCapabilities.hasCapability(12) || networkCapabilities.hasCapability(8) || !networkCapabilities.hasCapability(15);
    }

    public final int a() {
        if (m()) {
            return 4;
        }
        return n() ? 6 : 0;
    }

    public abstract int b();

    public abstract int c();

    public final dhkr d() {
        return dhkq.f(this.f);
    }

    public final ebmr e(dgis dgisVar) {
        String strV = this.k == 1 ? dgisVar.v() : dgisVar.A();
        if ("SIPoUDP".equals(strV)) {
            dhja.d(this.j, "TransportProtocol SIP_OVER_UDP", new Object[0]);
            return ebmr.UDP;
        }
        if ("SIPoTLS".equals(strV)) {
            dhja.d(this.j, "TransportProtocol SIP_OVER_TLS", new Object[0]);
            return ebmr.TLS;
        }
        dhja.d(this.j, "TransportProtocol SIP_OVER_TCP", new Object[0]);
        return ebmr.TCP;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof dfyu)) {
            return TextUtils.equals(this.h, ((dfyu) obj).h);
        }
        return false;
    }

    public final ewms f() {
        return l() ? ewms.NETWORK_INTERFACE_AVAILABILITY_AVAILABLE : ewms.NETWORK_INTERFACE_AVAILABILITY_UNAVAILABLE;
    }

    public final String g() {
        return dfzb.b(this.k);
    }

    public final List h() {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.e.b.iterator();
        while (it.hasNext()) {
            arrayList.add(((InetAddress) it.next()).getHostAddress());
        }
        return arrayList;
    }

    public final int hashCode() {
        String str = this.h;
        str.getClass();
        return str.hashCode();
    }

    public final void i(LinkProperties linkProperties) {
        ArrayList arrayList = new ArrayList();
        this.d = false;
        try {
            arrayList.addAll(linkProperties.getDnsServers());
        } catch (NoSuchMethodException unused) {
            dhja.h(this.j, "Can't retrieve DNS address.", new Object[0]);
        }
        if (arrayList.isEmpty()) {
            dhja.l(this.j, "Using Google DNS server.", new Object[0]);
            String[] strArr = new String[0];
            if (m()) {
                strArr = b;
            } else if (n()) {
                strArr = c;
            }
            for (String str : strArr) {
                try {
                    arrayList.add(InetAddress.getByName(str));
                } catch (UnknownHostException unused2) {
                    dhja.h(this.j, "Invalid nameserver %s", str);
                }
            }
        } else {
            this.d = true;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            InetAddress inetAddress = (InetAddress) arrayList.get(i);
            if (inetAddress instanceof Inet4Address) {
                this.e.c(inetAddress);
            }
        }
        if (n()) {
            int size2 = arrayList.size();
            for (int i2 = 0; i2 < size2; i2++) {
                InetAddress inetAddress2 = (InetAddress) arrayList.get(i2);
                if (inetAddress2 instanceof Inet6Address) {
                    this.e.c(inetAddress2);
                }
            }
        }
    }

    public abstract void j();

    public final boolean l() {
        dhkr dhkrVarD = d();
        Network network = this.g;
        if (network == null) {
            dhja.l(this.j, "Network isn't available because network object is null", new Object[0]);
            return false;
        }
        if (this.e.a == null) {
            dhja.l(this.j, "Network isn't available because ip address is null", new Object[0]);
            return false;
        }
        try {
            if (dhky.a() && dfpk.y()) {
                NetworkCapabilities networkCapabilitiesC = dhkrVarD.c(network);
                dhja.l(this.j, "network capabilities for network[%s]: %s", network, networkCapabilitiesC);
                return dfpk.r() ? networkCapabilitiesC != null && networkCapabilitiesC.hasCapability(12) && networkCapabilitiesC.hasCapability(16) && networkCapabilitiesC.hasCapability(21) : networkCapabilitiesC != null && networkCapabilitiesC.hasCapability(12) && networkCapabilitiesC.hasCapability(16);
            }
            NetworkInfo networkInfoE = dhkrVarD.e(network);
            dhja.l(this.j, "network info for network[%s]: %s", network, networkInfoE);
            return networkInfoE != null && networkInfoE.isConnected() && networkInfoE.getType() == c();
        } catch (dhkf e) {
            dhja.t(e, this.j, "Can't get network capabilities, missing permissions.", new Object[0]);
            return false;
        }
    }

    public final boolean m() {
        return this.e.f();
    }

    public final boolean n() {
        return this.e.g();
    }

    public final String toString() {
        return "Name: " + this.h + ", Network access: " + this.e.toString();
    }
}
