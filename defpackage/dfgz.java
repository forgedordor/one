package defpackage;

import com.google.android.ims.rcsservice.businessinfo.BasePaymentResult;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Optional;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Set;
import java.util.concurrent.Callable;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.auth.MalformedChallengeException;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.auth.RFC2617Scheme;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.protocol.BasicHttpContext;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dfgz implements dfgs {
    public final deyb a;
    public final dfgu b;
    public final fcsu d;
    public DefaultHttpClient e;
    private final eosc g;
    private HttpGet h;
    public final Set c = ekpg.f(Integer.valueOf(BasePaymentResult.ERROR_REQUEST_FAILED));
    public String f = "";

    public dfgz(eosc eoscVar, fcsu fcsuVar, deyb deybVar, dfgu dfguVar) {
        this.g = eoscVar;
        this.d = fcsuVar;
        this.a = deybVar;
        this.b = dfguVar;
    }

    @Override // defpackage.dfgs
    public final ListenableFuture a() {
        final HttpGet httpGet = this.h;
        httpGet.getClass();
        final DefaultHttpClient defaultHttpClient = this.e;
        if (defaultHttpClient == null) {
            throw new IllegalStateException("The HTTP client is null. Call init() method first");
        }
        this.a.d(this.f, 2, ekoj.a);
        final long jLongValue = dhkl.a().longValue();
        Callable callable = new Callable() { // from class: dfgw
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return defaultHttpClient.execute(httpGet);
            }
        };
        eosc eoscVar = this.g;
        return eijx.g(callable, eoscVar).i(new eooz() { // from class: dfgx
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) throws IOException, MalformedChallengeException {
                RFC2617Scheme rFC2617SchemeA;
                HttpResponse httpResponse = (HttpResponse) obj;
                int statusCode = httpResponse.getStatusLine().getStatusCode();
                dfgz dfgzVar = this.a;
                String str = dfgzVar.f;
                long jLongValue2 = dhkl.a().longValue() - jLongValue;
                deyb deybVar = dfgzVar.a;
                deybVar.b(str, statusCode, jLongValue2);
                ekhv ekhvVar = new ekhv();
                ekhvVar.j(dfgzVar.c);
                ekhvVar.c(401);
                ekhx ekhxVarG = ekhvVar.g();
                dhja.c("[SR] Received %s, expecting %s", httpResponse.getStatusLine(), ekhxVarG);
                int statusCode2 = httpResponse.getStatusLine().getStatusCode();
                if (!ekhxVarG.contains(Integer.valueOf(statusCode2))) {
                    deybVar.a(ewkx.FILE_TRANSFER_FAILURE_REASON_UNEXPECTED_HTTP_RESPONSE_CODE);
                    try {
                        throw new dfih(statusCode2, dfhq.c(httpResponse));
                    } catch (IllegalArgumentException e) {
                        dfgzVar.a.a(ewkx.FILE_TRANSFER_FAILURE_REASON_INVALID_RETRY_AFTER_VALUE);
                        throw new IOException(e);
                    }
                }
                if (statusCode != 401) {
                    return eijx.e(httpResponse);
                }
                HttpEntity entity = httpResponse.getEntity();
                if (entity != null) {
                    entity.consumeContent();
                }
                if (httpResponse.getStatusLine().getStatusCode() != 401) {
                    dhja.o("[SR] HTTP client authentication not required!", new Object[0]);
                    deybVar.a = ewkt.AUTHENTICATION_TYPE_NONE;
                    rFC2617SchemeA = null;
                } else {
                    if (!httpResponse.containsHeader("WWW-Authenticate")) {
                        throw new IOException(String.format("No %s header found in initial response!", "WWW-Authenticate"));
                    }
                    rFC2617SchemeA = dfik.a(httpResponse.getFirstHeader("WWW-Authenticate"));
                    DefaultHttpClient defaultHttpClient2 = dfgzVar.e;
                    defaultHttpClient2.getClass();
                    dfik.c(defaultHttpClient2, rFC2617SchemeA);
                }
                HttpGet httpGet2 = httpGet;
                DefaultHttpClient defaultHttpClient3 = defaultHttpClient;
                BasicHttpContext basicHttpContextB = dfik.b(rFC2617SchemeA);
                return basicHttpContextB == null ? dfgzVar.b.b(defaultHttpClient3, httpGet2) : dfgzVar.b.a(defaultHttpClient3, basicHttpContextB, httpGet2);
            }
        }, eoscVar).i(new eooz() { // from class: dfgy
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) throws IOException {
                Optional optionalOf;
                HttpResponse httpResponse = (HttpResponse) obj;
                HashMap map = new HashMap();
                Header firstHeader = httpResponse.getFirstHeader("Accept-Ranges");
                if (firstHeader != null) {
                    map.put("Accept-Ranges", firstHeader.getValue());
                }
                Header firstHeader2 = httpResponse.getFirstHeader("Retry-After");
                if (firstHeader2 != null) {
                    map.put("Retry-After", firstHeader2.getValue());
                }
                dfgz dfgzVar = this.a;
                int statusCode = httpResponse.getStatusLine().getStatusCode();
                HttpEntity entity = httpResponse.getEntity();
                if (!dfgzVar.c.contains(Integer.valueOf(statusCode))) {
                    optionalOf = Optional.empty();
                } else if (entity == null) {
                    dhja.q("[SR] Did not receive a response body to download.", new Object[0]);
                    optionalOf = Optional.empty();
                } else {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    elec.a(entity.getContent(), byteArrayOutputStream);
                    byteArrayOutputStream.flush();
                    entity.consumeContent();
                    optionalOf = Optional.of(new ByteArrayInputStream(byteArrayOutputStream.toByteArray()));
                }
                return eork.i(dfgr.d(statusCode, optionalOf, map));
            }
        }, eoscVar);
    }

    @Override // defpackage.dfgs
    public final void b(String str, String str2) {
        this.e = ebiq.a(str2);
        HttpGet httpGet = new HttpGet(str2);
        this.h = httpGet;
        httpGet.setHeader("User-Agent", str);
        this.f = dfhq.e(str2);
    }

    @Override // defpackage.dfgs
    public final void c(String str, String str2, long j) {
        b(str, str2);
        if (j > 0) {
            HttpGet httpGet = this.h;
            httpGet.getClass();
            httpGet.setHeader("Range", a.A(j, "bytes=", "-"));
            this.c.add(206);
        }
    }

    @Override // defpackage.dfgs, java.lang.AutoCloseable
    public final void close() {
        DefaultHttpClient defaultHttpClient = this.e;
        defaultHttpClient.getClass();
        defaultHttpClient.getConnectionManager().shutdown();
    }
}
