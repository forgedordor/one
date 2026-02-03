package defpackage;

import android.net.Uri;
import j$.util.Objects;
import org.apache.http.conn.scheme.Scheme;
import org.apache.http.conn.ssl.SSLSocketFactory;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.impl.client.DefaultHttpRequestRetryHandler;
import org.apache.http.params.HttpParams;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ebiq {
    static final dfny a = dfnv.b("file_transfer_http_socket_timeout");
    private static final DefaultHttpRequestRetryHandler b = new DefaultHttpRequestRetryHandler(0, false);

    public static final DefaultHttpClient a(String str) {
        DefaultHttpClient defaultHttpClient;
        Uri uri = Uri.parse(str);
        if (Objects.toString(uri.getScheme(), "").equals("http")) {
            defaultHttpClient = new DefaultHttpClient();
        } else {
            int port = uri.getPort();
            if (port <= 0) {
                port = 443;
            }
            try {
                dhja.o("Creating a HTTPS client for host: %s on port: %d", uri.getHost(), Integer.valueOf(port));
                Scheme scheme = new Scheme("https", SSLSocketFactory.getSocketFactory(), port);
                defaultHttpClient = new DefaultHttpClient();
                defaultHttpClient.getConnectionManager().getSchemeRegistry().register(scheme);
            } catch (Exception e) {
                dhja.s(e, "Unable to create custom secure http client", new Object[0]);
                defaultHttpClient = new DefaultHttpClient();
            }
        }
        defaultHttpClient.setHttpRequestRetryHandler(b);
        HttpParams params = defaultHttpClient.getParams();
        params.setIntParameter("http.connection.timeout", 15000);
        if (((Boolean) a.a()).booleanValue()) {
            params.setIntParameter("http.socket.timeout", 30000);
        }
        return defaultHttpClient;
    }
}
