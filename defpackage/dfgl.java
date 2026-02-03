package defpackage;

import com.google.android.ims.provisioning.config.InstantMessageConfiguration;
import com.google.common.util.concurrent.ListenableFuture;
import j$.lang.Iterable$EL;
import j$.util.Collection;
import j$.util.Objects;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import j$.util.stream.Collectors;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.Callable;
import java.util.function.Consumer;
import java.util.function.Function;
import org.apache.http.Header;
import org.apache.http.HttpResponse;
import org.apache.http.auth.AuthScope;
import org.apache.http.auth.Credentials;
import org.apache.http.client.methods.HttpRequestBase;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.protocol.HttpContext;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dfgl implements dfgu {
    public static final dhip a = new dhip("GbaBasedHttpRequestExecutor");
    static final dfny b = dfnv.b("enable_http_gba_failure_logging");
    public final dfgq c;
    public final deyb d;
    public final eosc e;
    public final fcsu f;
    private final InstantMessageConfiguration g;

    public dfgl(dfgq dfgqVar, eosc eoscVar, fcsu fcsuVar, InstantMessageConfiguration instantMessageConfiguration, deyb deybVar) {
        this.c = dfgqVar;
        this.d = deybVar;
        this.e = eoscVar;
        this.f = fcsuVar;
        this.g = instantMessageConfiguration;
    }

    public static final void d(Header[] headerArr, String str) {
        final ArrayList arrayList = new ArrayList();
        Iterable$EL.forEach(Arrays.asList(headerArr), new Consumer() { // from class: dfgf
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void z(Object obj) {
                Header header = (Header) obj;
                dhip dhipVar = dfgl.a;
                arrayList.add(String.format("%s: %s", header.getName(), dhiz.GENERIC.c(header.getValue())));
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        dhja.d(a, "%s headers:\n%s", str, Collection.EL.stream(arrayList).map(new Function() { // from class: dfgg
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((String) obj).toString();
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).collect(Collectors.joining("\n")));
    }

    public static final void e(Header[] headerArr) {
        d(headerArr, "Request");
    }

    private final void f(ListenableFuture listenableFuture, long j, String str) {
        eork.r(listenableFuture, new dfgk(this, str, j), this.e);
    }

    @Override // defpackage.dfgu
    public final ListenableFuture a(final DefaultHttpClient defaultHttpClient, final HttpContext httpContext, final HttpRequestBase httpRequestBase) {
        if (Objects.isNull(httpContext.getAttribute("preemptive-auth"))) {
            dhja.r(a, "No preemptive authentication context found. Falling back to the default HTTP context.", new Object[0]);
            return b(defaultHttpClient, httpRequestBase);
        }
        dhja.l(a, "Executing authenticated HTTP [%s] request to host [%s]", httpRequestBase.getMethod(), httpRequestBase.getURI().getHost());
        InstantMessageConfiguration instantMessageConfiguration = this.g;
        dfgq dfgqVar = this.c;
        final String str = instantMessageConfiguration.mFtHttpContentServerUri;
        ListenableFuture listenableFutureG = eooq.g(c(dfgqVar.a(str, false), defaultHttpClient, httpRequestBase, httpContext), new eooz() { // from class: dfge
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                HttpResponse httpResponse = (HttpResponse) obj;
                dhip dhipVar = dfgl.a;
                HttpRequestBase httpRequestBase2 = httpRequestBase;
                dhja.l(dhipVar, "Obtained HTTP %s response: %s", httpRequestBase2.getMethod(), httpResponse.getStatusLine());
                dfgl.d(httpResponse.getAllHeaders(), "Response");
                if (httpResponse.getStatusLine().getStatusCode() != 401) {
                    return eork.i(httpResponse);
                }
                dfgl dfglVar = this.a;
                HttpContext httpContext2 = httpContext;
                DefaultHttpClient defaultHttpClient2 = defaultHttpClient;
                String str2 = str;
                dhja.r(dhipVar, "HTTP request with GBA authentication failed with %d. Forcing bootstrapping and making a second request.", 401);
                return dfglVar.c(dfglVar.c.a(str2, true), defaultHttpClient2, httpRequestBase2, httpContext2);
            }
        }, this.e);
        return listenableFutureG;
    }

    @Override // defpackage.dfgu
    public final ListenableFuture b(final DefaultHttpClient defaultHttpClient, final HttpRequestBase httpRequestBase) {
        long jLongValue = dhkl.a().longValue();
        String method = httpRequestBase.getMethod();
        dhja.l(a, "Executing unauthenticated HTTP [%s] request to host [%s]", httpRequestBase.getMethod(), httpRequestBase.getURI().getHost());
        deyb deybVar = this.d;
        deybVar.a = ewkt.AUTHENTICATION_TYPE_NONE;
        String strF = dfhq.f(httpRequestBase);
        deybVar.d(strF, dfhq.k(method), ekoj.a);
        e(httpRequestBase.getAllHeaders());
        ListenableFuture listenableFutureSubmit = this.e.submit(new Callable() { // from class: dfgh
            @Override // java.util.concurrent.Callable
            public final Object call() {
                dhip dhipVar = dfgl.a;
                return defaultHttpClient.execute(httpRequestBase);
            }
        });
        f(listenableFutureSubmit, jLongValue, strF);
        return listenableFutureSubmit;
    }

    public final ListenableFuture c(ListenableFuture listenableFuture, final DefaultHttpClient defaultHttpClient, final HttpRequestBase httpRequestBase, final HttpContext httpContext) {
        long jLongValue = dhkl.a().longValue();
        final String method = httpRequestBase.getMethod();
        final String strF = dfhq.f(httpRequestBase);
        ListenableFuture listenableFutureG = eooq.g(listenableFuture, new eooz() { // from class: dfgj
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                String str = method;
                dhja.l(dfgl.a, "Obtained GBA credentials, making authenticated %s request.", str);
                dfgl dfglVar = this.a;
                deyb deybVar = dfglVar.d;
                deybVar.a = ewkt.AUTHENTICATION_TYPE_GBA;
                deybVar.d(strF, dfhq.k(str), ekoj.a);
                final DefaultHttpClient defaultHttpClient2 = defaultHttpClient;
                defaultHttpClient2.getCredentialsProvider().setCredentials(AuthScope.ANY, (Credentials) obj);
                final HttpRequestBase httpRequestBase2 = httpRequestBase;
                dfgl.e(httpRequestBase2.getAllHeaders());
                final HttpContext httpContext2 = httpContext;
                return dfglVar.e.submit(new Callable() { // from class: dfgi
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        dhip dhipVar = dfgl.a;
                        return defaultHttpClient2.execute(httpRequestBase2, httpContext2);
                    }
                });
            }
        }, this.e);
        f(listenableFutureG, jLongValue, strF);
        return listenableFutureG;
    }
}
