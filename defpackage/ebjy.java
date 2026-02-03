package defpackage;

import android.text.TextUtils;
import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.UnknownHostException;

/* compiled from: PG */
/* loaded from: classes5.dex */
public enum ebjy {
    IP4("IP4"),
    IP6("IP6");

    private final String d;

    ebjy(String str) {
        this.d = str;
    }

    public static ebjy a(String str) throws ebki, UnknownHostException {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("IpAddress must not be null");
        }
        if (!eomh.b(str)) {
            throw new ebki("Not an IP address: ".concat(String.valueOf(str)));
        }
        try {
            InetAddress byName = InetAddress.getByName(str);
            if (byName instanceof Inet6Address) {
                return IP6;
            }
            if (byName instanceof Inet4Address) {
                return IP4;
            }
            throw new ebki("Unsupported address type: ".concat(String.valueOf(String.valueOf(byName))));
        } catch (UnknownHostException unused) {
            throw new IllegalStateException("Expected valid IP address here!");
        }
    }

    public static ebjy b(String str) {
        ebjy ebjyVar = IP6;
        return ebjyVar.d.equals(str) ? ebjyVar : IP4;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.d;
    }
}
