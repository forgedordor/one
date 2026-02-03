package defpackage;

import android.os.Build;
import java.lang.reflect.Field;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.security.Security;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLServerSocketFactory;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ecdx {
    public static final String a = "ecdx";
    public static ecec c;
    public eceb d;
    public static final Object b = new Object();
    private static final String e = ecee.class.getName();
    private static final String f = eced.class.getName();

    private ecdx() {
    }

    public static final void a() throws NoSuchAlgorithmException, KeyManagementException {
        try {
            SSLContext sSLContext = SSLContext.getInstance("TLS");
            sSLContext.init(null, new TrustManager[]{new ecef()}, null);
            SSLContext.setDefault(sSLContext);
            HttpsURLConnection.setDefaultSSLSocketFactory(sSLContext.getSocketFactory());
        } catch (KeyManagementException | NoSuchAlgorithmException e2) {
            throw new RuntimeException(e2);
        }
    }

    public static final void b() throws IllegalAccessException, NoSuchFieldException, NoSuchAlgorithmException, IllegalArgumentException {
        if (Build.VERSION.SDK_INT < 28) {
            try {
                SSLContext sSLContext = SSLContext.getInstance("Default");
                Field declaredField = SSLSocketFactory.class.getDeclaredField("defaultSocketFactory");
                declaredField.setAccessible(true);
                declaredField.set(null, sSLContext.getSocketFactory());
                Field declaredField2 = SSLServerSocketFactory.class.getDeclaredField("defaultServerSocketFactory");
                declaredField2.setAccessible(true);
                declaredField2.set(null, sSLContext.getServerSocketFactory());
            } catch (IllegalAccessException | NoSuchFieldException | NoSuchAlgorithmException e2) {
                throw new RuntimeException(e2);
            }
        }
        Security.setProperty("ssl.SocketFactory.provider", e);
        Security.setProperty("ssl.ServerSocketFactory.provider", f);
    }

    public ecdx(eceb ecebVar) {
        this.d = ecebVar;
    }
}
