package defpackage;

import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dwcr {
    public static final void a(fcox fcoxVar) throws NoSuchAlgorithmException, KeyManagementException {
        try {
            SSLContext sSLContext = SSLContext.getInstance("TLS");
            sSLContext.init(null, null, null);
            SSLSocketFactory socketFactory = sSLContext.getSocketFactory();
            ejwl.m(true, "Cannot change security when using ChannelCredentials");
            fcoxVar.f = socketFactory;
            fcoxVar.n = 1;
        } catch (KeyManagementException | NoSuchAlgorithmException unused) {
            dvhv.c("OkHttpChannelBuilder", "Failed to set SocketFactory");
        }
    }
}
