package defpackage;

import com.google.android.ims.provisioning.config.InstantMessageConfiguration;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Objects;
import org.apache.http.HttpResponse;
import org.apache.http.auth.AuthScope;
import org.apache.http.auth.UsernamePasswordCredentials;
import org.apache.http.client.methods.HttpRequestBase;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.protocol.HttpContext;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dffj implements dfgu {
    private static final dhip a = new dhip("DigestBasedHttpRequestExecutor");
    private final deyb b;
    private final InstantMessageConfiguration c;

    public dffj(InstantMessageConfiguration instantMessageConfiguration, deyb deybVar) {
        this.c = instantMessageConfiguration;
        this.b = deybVar;
    }

    @Override // defpackage.dfgu
    public final ListenableFuture a(DefaultHttpClient defaultHttpClient, HttpContext httpContext, HttpRequestBase httpRequestBase) {
        dhip dhipVar = a;
        dhja.l(dhipVar, "Executing authenticated HTTP [%s] request to host [%s]", httpRequestBase.getMethod(), httpRequestBase.getURI().getHost());
        if (Objects.isNull(httpContext.getAttribute("preemptive-auth"))) {
            dhja.l(dhipVar, "No preemptive authentication context found. Falling back to the default HTTP context.", new Object[0]);
            return b(defaultHttpClient, httpRequestBase);
        }
        String strF = dfhq.f(httpRequestBase);
        deyb deybVar = this.b;
        deybVar.d(strF, dfhq.k(httpRequestBase.getMethod()), ekoj.a);
        long jLongValue = dhkl.a().longValue();
        dhja.p(dhipVar, "Setting up HTTP client authentication!", new Object[0]);
        deybVar.a = ewkt.AUTHENTICATION_TYPE_DIGEST;
        InstantMessageConfiguration instantMessageConfiguration = this.c;
        defaultHttpClient.getCredentialsProvider().setCredentials(AuthScope.ANY, new UsernamePasswordCredentials(instantMessageConfiguration.mFtHttpContentServerUser, instantMessageConfiguration.mFtHttpContentServerPassword));
        HttpResponse httpResponseExecute = defaultHttpClient.execute(httpRequestBase, httpContext);
        dhja.l(dhipVar, "completed HTTP [%s] to host [%s] with result [%d]", httpRequestBase.getMethod(), httpRequestBase.getURI().getHost(), Integer.valueOf(httpResponseExecute.getStatusLine().getStatusCode()));
        deybVar.b(strF, httpResponseExecute.getStatusLine().getStatusCode(), dhkl.a().longValue() - jLongValue);
        return eork.i(httpResponseExecute);
    }

    @Override // defpackage.dfgu
    public final ListenableFuture b(DefaultHttpClient defaultHttpClient, HttpRequestBase httpRequestBase) {
        dhja.l(a, "Executing unauthenticated HTTP [%s] request to host [%s]", httpRequestBase.getMethod(), httpRequestBase.getURI().getHost());
        String strF = dfhq.f(httpRequestBase);
        int iK = dfhq.k(httpRequestBase.getMethod());
        deyb deybVar = this.b;
        deybVar.d(strF, iK, ekoj.a);
        long jLongValue = dhkl.a().longValue();
        HttpResponse httpResponseExecute = defaultHttpClient.execute(httpRequestBase);
        deybVar.b(strF, httpResponseExecute.getStatusLine().getStatusCode(), dhkl.a().longValue() - jLongValue);
        return eork.i(httpResponseExecute);
    }
}
