package defpackage;

import com.google.android.ims.rcsservice.businessinfo.BasePaymentResult;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Optional;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.util.HashMap;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dffl implements dfgs {
    private final ebir a;
    private HttpURLConnection b;
    private final Set c = ekpg.f(Integer.valueOf(BasePaymentResult.ERROR_REQUEST_FAILED));

    public dffl(ebir ebirVar) {
        this.a = ebirVar;
    }

    @Override // defpackage.dfgs
    public final ListenableFuture a() throws IOException {
        HashMap map = new HashMap();
        HttpURLConnection httpURLConnection = this.b;
        if (httpURLConnection == null) {
            throw new IOException("HttpURLConnection is null. Call init() method first");
        }
        httpURLConnection.connect();
        String headerField = this.b.getHeaderField("Accept-Ranges");
        if (headerField != null) {
            map.put("Accept-Ranges", headerField);
        }
        String headerField2 = this.b.getHeaderField("Retry-After");
        if (headerField2 != null) {
            map.put("Retry-After", headerField2);
        }
        int responseCode = this.b.getResponseCode();
        return eork.i(dfgr.d(responseCode, this.c.contains(Integer.valueOf(responseCode)) ? Optional.of(this.b.getInputStream()) : Optional.empty(), map));
    }

    @Override // defpackage.dfgs
    public final void b(String str, String str2) {
        this.b = this.a.a(str, str2);
    }

    @Override // defpackage.dfgs
    public final void c(String str, String str2, long j) throws IOException {
        this.c.add(206);
        HttpURLConnection httpURLConnectionA = this.a.a(str, str2);
        dhja.c("Preparing to resume, starting at offset:%d bytes", Long.valueOf(j));
        httpURLConnectionA.setRequestProperty("Range", a.A(j, "bytes=", "-"));
        httpURLConnectionA.setUseCaches(false);
        this.b = httpURLConnectionA;
    }

    @Override // defpackage.dfgs, java.lang.AutoCloseable
    public final void close() {
        HttpURLConnection httpURLConnection = this.b;
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
    }
}
