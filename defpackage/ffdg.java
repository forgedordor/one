package defpackage;

import java.util.List;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ffdg extends ffdi {
    public static final boolean a;

    static {
        String property = System.getProperty("java.specification.version");
        Integer numG = property != null ? fdgn.g(property) : null;
        boolean z = true;
        if (numG == null) {
            try {
                SSLSocket.class.getMethod("getApplicationProtocol", null);
            } catch (NoSuchMethodException unused) {
            }
        } else if (numG.intValue() < 9) {
            z = false;
        }
        a = z;
    }

    @Override // defpackage.ffdi
    public final String a(SSLSocket sSLSocket) {
        try {
            String applicationProtocol = sSLSocket.getApplicationProtocol();
            if (applicationProtocol != null) {
                if (!fdbq.f(applicationProtocol, "")) {
                    return applicationProtocol;
                }
            }
        } catch (UnsupportedOperationException unused) {
        }
        return null;
    }

    @Override // defpackage.ffdi
    public final X509TrustManager b(SSLSocketFactory sSLSocketFactory) {
        throw new UnsupportedOperationException("clientBuilder.sslSocketFactory(SSLSocketFactory) not supported on JDK 9+");
    }

    @Override // defpackage.ffdi
    public final void d(SSLSocket sSLSocket, String str, List list) {
        SSLParameters sSLParameters = sSLSocket.getSSLParameters();
        sSLParameters.setApplicationProtocols((String[]) ffdh.a(list).toArray(new String[0]));
        sSLSocket.setSSLParameters(sSLParameters);
    }
}
