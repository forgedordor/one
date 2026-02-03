package defpackage;

import org.apache.http.Header;
import org.apache.http.auth.MalformedChallengeException;
import org.apache.http.impl.auth.BasicScheme;
import org.apache.http.impl.auth.DigestScheme;
import org.apache.http.impl.auth.RFC2617Scheme;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.protocol.BasicHttpContext;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dfik {
    public static RFC2617Scheme a(Header header) throws MalformedChallengeException {
        String value = header.getValue();
        if (value.contains("Basic")) {
            return new BasicScheme();
        }
        if (!value.contains("Digest")) {
            dhja.q("Unable to perform pre-emptive auth for %s", value);
            return null;
        }
        DigestScheme digestScheme = new DigestScheme();
        try {
            digestScheme.processChallenge(header);
            return digestScheme;
        } catch (MalformedChallengeException e) {
            dhja.i(e, "Unable to process challenge for %s. Cannot perform authentication.", value);
            return null;
        }
    }

    public static BasicHttpContext b(RFC2617Scheme rFC2617Scheme) {
        if (rFC2617Scheme == null) {
            dhja.q("Unable to create preemptive authentication context, scheme is null", new Object[0]);
            return null;
        }
        BasicHttpContext basicHttpContext = new BasicHttpContext();
        basicHttpContext.setAttribute("preemptive-auth", rFC2617Scheme);
        return basicHttpContext;
    }

    public static void c(DefaultHttpClient defaultHttpClient, RFC2617Scheme rFC2617Scheme) {
        defaultHttpClient.addRequestInterceptor(new dfij(), 0);
        if (rFC2617Scheme instanceof DigestScheme) {
            defaultHttpClient.addResponseInterceptor(new dfii());
        }
    }
}
