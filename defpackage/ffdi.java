package defpackage;

import android.util.Log;
import java.io.IOException;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.GeneralSecurityException;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.X509Certificate;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;

/* compiled from: PG */
/* loaded from: classes6.dex */
public class ffdi {
    private static final Logger a;
    public static volatile ffdi b;

    static {
        ffdi ffdgVar;
        if (ffdh.b()) {
            CopyOnWriteArraySet copyOnWriteArraySet = ffdn.a;
            for (Map.Entry entry : ffdn.b.entrySet()) {
                String str = (String) entry.getKey();
                String str2 = (String) entry.getValue();
                Logger logger = Logger.getLogger(str);
                if (ffdn.a.add(logger)) {
                    logger.setUseParentHandlers(false);
                    logger.setLevel(Log.isLoggable(str2, 3) ? Level.FINE : Log.isLoggable(str2, 4) ? Level.INFO : Level.WARNING);
                    logger.addHandler(ffdo.a);
                }
            }
            ffdgVar = ffdb.a ? new ffdb() : null;
            if (ffdgVar == null) {
                ffdfVar = ffdd.a ? new ffdd() : null;
                ffdfVar.getClass();
            }
        } else {
            ffdgVar = ffdg.a ? new ffdg() : null;
            if (ffdgVar == null) {
                int i = ffdf.a;
                String property = System.getProperty("java.specification.version", "unknown");
                try {
                    property.getClass();
                } catch (NumberFormatException unused) {
                }
                if (Integer.parseInt(property) < 9) {
                    try {
                        Class<?> cls = Class.forName("org.eclipse.jetty.alpn.ALPN", true, null);
                        Class<?> cls2 = Class.forName(a.x("org.eclipse.jetty.alpn.ALPN", "$Provider"), true, null);
                        Class<?> cls3 = Class.forName(a.x("org.eclipse.jetty.alpn.ALPN", "$ClientProvider"), true, null);
                        Class<?> cls4 = Class.forName(a.x("org.eclipse.jetty.alpn.ALPN", "$ServerProvider"), true, null);
                        Method method = cls.getMethod("put", SSLSocket.class, cls2);
                        Method method2 = cls.getMethod("get", SSLSocket.class);
                        Method method3 = cls.getMethod("remove", SSLSocket.class);
                        method.getClass();
                        method2.getClass();
                        method3.getClass();
                        cls3.getClass();
                        cls4.getClass();
                        ffdfVar = new ffdf(method, method2, method3, cls3, cls4);
                    } catch (ClassNotFoundException | NoSuchMethodException unused2) {
                    }
                }
                ffdgVar = ffdfVar == null ? new ffdi() : ffdfVar;
            }
        }
        b = ffdgVar;
        a = Logger.getLogger(feyy.class.getName());
    }

    public static /* synthetic */ void m(ffdi ffdiVar, String str, int i, int i2) {
        if ((i2 & 2) != 0) {
            i = 4;
        }
        ffdiVar.l(str, i, null);
    }

    public String a(SSLSocket sSLSocket) {
        return null;
    }

    public X509TrustManager b(SSLSocketFactory sSLSocketFactory) {
        try {
            Class<?> cls = Class.forName("sun.security.ssl.SSLContextImpl");
            cls.getClass();
            Object objJ = fezr.j(sSLSocketFactory, cls, "context");
            if (objJ == null) {
                return null;
            }
            return (X509TrustManager) fezr.j(objJ, X509TrustManager.class, "trustManager");
        } catch (ClassNotFoundException unused) {
            return null;
        } catch (RuntimeException e) {
            if (!fdbq.f(e.getClass().getName(), "java.lang.reflect.InaccessibleObjectException")) {
                throw e;
            }
            return null;
        }
    }

    public ffea c(X509TrustManager x509TrustManager) {
        return new ffdy(f(x509TrustManager));
    }

    public boolean e(String str) {
        return true;
    }

    public ffec f(X509TrustManager x509TrustManager) {
        X509Certificate[] acceptedIssuers = x509TrustManager.getAcceptedIssuers();
        return new ffdz((X509Certificate[]) Arrays.copyOf(acceptedIssuers, acceptedIssuers.length));
    }

    public void g(Socket socket, InetSocketAddress inetSocketAddress, int i) throws IOException {
        socket.getClass();
        socket.connect(inetSocketAddress, i);
    }

    public void h(String str, Object obj) {
        if (obj == null) {
            str = str.concat(" To see where this was allocated, set the OkHttpClient logger level to FINE: Logger.getLogger(OkHttpClient.class.getName()).setLevel(Level.FINE);");
        }
        l(str, 5, (Throwable) obj);
    }

    public Object i() {
        if (a.isLoggable(Level.FINE)) {
            return new Throwable("response.body().close()");
        }
        return null;
    }

    public final SSLSocketFactory k(X509TrustManager x509TrustManager) throws NoSuchAlgorithmException, KeyManagementException {
        try {
            SSLContext sSLContext = SSLContext.getInstance("TLS");
            sSLContext.getClass();
            sSLContext.init(null, new TrustManager[]{x509TrustManager}, null);
            SSLSocketFactory socketFactory = sSLContext.getSocketFactory();
            socketFactory.getClass();
            return socketFactory;
        } catch (GeneralSecurityException e) {
            e.toString();
            throw new AssertionError("No System TLS: ".concat(e.toString()), e);
        }
    }

    public final void l(String str, int i, Throwable th) {
        a.log(i == 5 ? Level.WARNING : Level.INFO, str, th);
    }

    public final String toString() {
        String simpleName = getClass().getSimpleName();
        simpleName.getClass();
        return simpleName;
    }

    public void j(SSLSocket sSLSocket) {
    }

    public void d(SSLSocket sSLSocket, String str, List list) {
    }
}
