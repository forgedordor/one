package defpackage;

import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.PasswordAuthentication;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fciw implements fbsh {
    public static final Logger a = Logger.getLogger(fciw.class.getName());
    private static final fciu c = new fciu();
    private static final ejxr b = new fciv();

    public fciw() {
        ejxr ejxrVar = b;
        fciu fciuVar = c;
        ejxrVar.getClass();
        fciuVar.getClass();
    }

    public static final fbsg a(InetSocketAddress inetSocketAddress) {
        try {
            URI uri = new URI("https", null, inetSocketAddress.getHostString(), inetSocketAddress.getPort(), null, null, null);
            ProxySelector proxySelector = ProxySelector.getDefault();
            if (proxySelector == null) {
                a.logp(Level.FINE, "io.grpc.internal.ProxyDetectorImpl", "detectProxy", "proxy selector is null, so continuing without proxy lookup");
                return null;
            }
            List<Proxy> listSelect = proxySelector.select(uri);
            if (listSelect.size() > 1) {
                a.logp(Level.WARNING, "io.grpc.internal.ProxyDetectorImpl", "detectProxy", "More than 1 proxy detected, gRPC will select the first one");
            }
            Proxy proxy = listSelect.get(0);
            if (proxy.type() == Proxy.Type.DIRECT) {
                return null;
            }
            InetSocketAddress inetSocketAddress2 = (InetSocketAddress) proxy.address();
            PasswordAuthentication passwordAuthenticationA = fciu.a(inetSocketAddress2.getHostString(), inetSocketAddress2.getAddress(), inetSocketAddress2.getPort());
            if (inetSocketAddress2.isUnresolved()) {
                inetSocketAddress2 = new InetSocketAddress(InetAddress.getByName(inetSocketAddress2.getHostName()), inetSocketAddress2.getPort());
            }
            inetSocketAddress.getClass();
            inetSocketAddress2.getClass();
            if (passwordAuthenticationA == null) {
                return new fbpd(inetSocketAddress2, inetSocketAddress, null, null);
            }
            return new fbpd(inetSocketAddress2, inetSocketAddress, passwordAuthenticationA.getUserName(), passwordAuthenticationA.getPassword() != null ? new String(passwordAuthenticationA.getPassword()) : null);
        } catch (URISyntaxException e) {
            a.logp(Level.WARNING, "io.grpc.internal.ProxyDetectorImpl", "detectProxy", "Failed to construct URI for proxy lookup, proceeding without proxy", (Throwable) e);
            return null;
        }
    }
}
