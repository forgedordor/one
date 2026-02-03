package defpackage;

import android.content.Context;
import android.net.Uri;
import com.google.android.ims.provisioning.config.InstantMessageConfiguration;
import com.google.android.ims.rcsservice.filetransfer.FileTransferInfo;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpRequestBase;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.protocol.HttpContext;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dfgb extends dfig {
    static final dfny a = dfnv.b("enable_get_upload_info_retry");
    private static final Uri k = Uri.EMPTY;
    public HttpRequestBase b;
    private final FileTransferInfo l;
    private final String m;
    private final boolean n;
    private final dgfu o;
    private final dfgu p;
    private final String q;
    private final String r;
    private final fcsu s;

    public dfgb(Context context, dfdv dfdvVar, dgfu dgfuVar, fcsu fcsuVar, long j, String str, String str2, FileTransferInfo fileTransferInfo, InstantMessageConfiguration instantMessageConfiguration, dfif dfifVar, boolean z, deyb deybVar, dfgu dfguVar, String str3) {
        super(context, j, str, instantMessageConfiguration, dfifVar, dfdvVar, deybVar, fcsuVar);
        this.l = fileTransferInfo;
        this.m = str2;
        this.n = z;
        this.o = dgfuVar;
        this.s = fcsuVar;
        this.p = dfguVar;
        this.q = str3;
        this.r = instantMessageConfiguration.mFtHttpContentServerUri;
    }

    private final HttpResponse j(DefaultHttpClient defaultHttpClient, HttpRequestBase httpRequestBase, HttpContext httpContext) throws IOException {
        try {
            return (HttpResponse) (httpContext == null ? this.p.b(defaultHttpClient, httpRequestBase) : this.p.a(defaultHttpClient, httpContext, httpRequestBase)).get(((Integer) dfpe.c().a.b.a()).intValue(), TimeUnit.SECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            throw new IOException("Couldn't obtain HttpReponse from future.", e);
        }
    }

    private final HttpPost k() {
        HttpPost httpPost = new HttpPost(this.d.mFtHttpContentServerUri);
        httpPost.setHeader("User-Agent", this.q);
        return httpPost;
    }

    private final void l(Exception exc) {
        int i;
        if (this.j) {
            dhja.o("HTTP file transfer canceled", new Object[0]);
            i = 5;
        } else {
            dhja.i(exc, "Unable to perform HTTP file transfer", new Object[0]);
            b(dfek.e);
            if (!this.j && this.i <= 1) {
                this.h.a(ewkx.FILE_TRANSFER_FAILURE_REASON_SESSION_ERROR);
                i = 8;
            } else {
                this.h.a(ewkx.FILE_TRANSFER_FAILURE_REASON_MAX_RETRIES_REACHED);
                i = 11;
            }
        }
        d(20013, i);
    }

    private final void m(HttpResponse httpResponse, Set set) throws IOException {
        dhja.c("Received %s, expecting %s", httpResponse.getStatusLine(), set);
        int statusCode = httpResponse.getStatusLine().getStatusCode();
        if (set.contains(Integer.valueOf(statusCode))) {
            return;
        }
        this.h.a(ewkx.FILE_TRANSFER_FAILURE_REASON_UNEXPECTED_HTTP_RESPONSE_CODE);
        try {
            throw new dfih(statusCode, dfhq.c(httpResponse));
        } catch (IllegalArgumentException e) {
            this.h.a(ewkx.FILE_TRANSFER_FAILURE_REASON_INVALID_RETRY_AFTER_VALUE);
            throw new IOException(e);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x007b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final byte[] n(org.apache.http.impl.client.DefaultHttpClient r13, org.apache.http.protocol.HttpContext r14) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 290
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dfgb.n(org.apache.http.impl.client.DefaultHttpClient, org.apache.http.protocol.HttpContext):byte[]");
    }

    private static final void o(HttpEntity httpEntity) throws IOException {
        if (httpEntity == null) {
            return;
        }
        httpEntity.consumeContent();
    }

    private static final void p(byte[] bArr) {
        dhja.o("Response:\n%s", new String(bArr, StandardCharsets.UTF_8));
    }

    @Override // defpackage.dfig
    public final void a() {
        super.a();
        synchronized (this) {
            notifyAll();
        }
        HttpRequestBase httpRequestBase = this.b;
        if (httpRequestBase == null || httpRequestBase.isAborted()) {
            return;
        }
        new dfga(this).start();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0306 A[Catch: all -> 0x02ab, TryCatch #4 {all -> 0x02ab, blocks: (B:3:0x0032, B:5:0x0089, B:10:0x00b0, B:12:0x00c6, B:18:0x00d7, B:43:0x0293, B:13:0x00ce, B:15:0x00d2, B:20:0x00df, B:22:0x0135, B:26:0x0154, B:27:0x0162, B:28:0x0166, B:30:0x017b, B:32:0x0197, B:34:0x01f9, B:36:0x0201, B:38:0x0254, B:39:0x0260, B:40:0x0277, B:55:0x02b7, B:58:0x02d0, B:64:0x02eb, B:70:0x0308, B:65:0x02fa, B:67:0x0300, B:68:0x0303, B:69:0x0306, B:42:0x0279, B:23:0x0142, B:25:0x014c, B:6:0x0095, B:8:0x009b, B:9:0x00a5, B:52:0x02af), top: B:78:0x0032, inners: #0 }] */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r16v2 */
    /* JADX WARN: Type inference failed for: r16v3 */
    /* JADX WARN: Type inference failed for: r16v5, types: [java.lang.Long] */
    /* JADX WARN: Type inference failed for: r28v0, types: [dfgb, dfig] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            Method dump skipped, instructions count: 827
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dfgb.run():void");
    }

    @Override // defpackage.dfig
    public final String toString() {
        return "Upload: " + super.toString() + ", TID " + this.m + ", isExplicitResume " + this.n;
    }
}
