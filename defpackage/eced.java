package defpackage;

import android.util.Log;
import java.io.IOException;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import java.security.Security;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLServerSocketFactory;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eced extends SSLServerSocketFactory {
    public static eceb a;
    private static final String b = "ecee";

    private static final SSLServerSocketFactory a() {
        try {
            return SSLContext.getInstance("Default").getServerSocketFactory();
        } catch (NoSuchAlgorithmException e) {
            throw new AssertionError(e);
        }
    }

    private static final SSLServerSocketFactory b() {
        ecdy ecdyVar = ecdy.a;
        int i = ecdyVar.c;
        a.a(ecdyVar);
        SSLServerSocketFactory sSLServerSocketFactoryA = a();
        if (!(sSLServerSocketFactoryA instanceof eced)) {
            return sSLServerSocketFactoryA;
        }
        String strConcat = "[";
        for (Provider provider : Security.getProviders()) {
            strConcat = strConcat.concat(String.valueOf(provider.toString())).concat(provider.stringPropertyNames().contains("SSLContext.Default") ? "(true), " : "(false), ");
        }
        Log.e(b, strConcat.concat("]"));
        throw new RuntimeException("Unable to find a default SSL provider.");
    }

    @Override // javax.net.ServerSocketFactory
    public final ServerSocket createServerSocket(int i) {
        return b().createServerSocket(i);
    }

    @Override // javax.net.ssl.SSLServerSocketFactory
    public final String[] getDefaultCipherSuites() {
        try {
            return b().getDefaultCipherSuites();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // javax.net.ssl.SSLServerSocketFactory
    public final String[] getSupportedCipherSuites() {
        try {
            return b().getSupportedCipherSuites();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // javax.net.ServerSocketFactory
    public final ServerSocket createServerSocket(int i, int i2) {
        return b().createServerSocket(i, i2);
    }

    @Override // javax.net.ServerSocketFactory
    public final ServerSocket createServerSocket(int i, int i2, InetAddress inetAddress) {
        return b().createServerSocket(i, i2, inetAddress);
    }
}
