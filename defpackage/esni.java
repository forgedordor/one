package defpackage;

import com.google.common.util.concurrent.SettableFuture;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import org.chromium.net.CronetException;
import org.chromium.net.UrlRequest;
import org.chromium.net.UrlResponseInfo;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class esni extends UrlRequest.Callback {
    final SettableFuture a;
    final esnp c;
    private final Executor e;
    final esnd b = new esnd();
    public final List d = new ArrayList();

    public esni(SettableFuture settableFuture, Executor executor, esnp esnpVar) {
        this.a = settableFuture;
        this.e = executor;
        this.c = esnpVar;
    }

    public static final ekjo b(Map map) {
        ekgc ekgcVar = new ekgc();
        for (Map.Entry entry : map.entrySet()) {
            Iterator it = ((List) entry.getValue()).iterator();
            while (it.hasNext()) {
                ekgcVar.b(esnm.b((String) entry.getKey()), (String) it.next());
            }
        }
        return ekgcVar.a();
    }

    public final int a(UrlResponseInfo urlResponseInfo) throws NumberFormatException {
        if ("head".equalsIgnoreCase(this.c.g)) {
            return 1;
        }
        Map<String, List<String>> allHeaders = urlResponseInfo.getAllHeaders();
        if (!allHeaders.containsKey("content-length")) {
            return 32768;
        }
        int i = Integer.parseInt(allHeaders.get("content-length").get(0));
        return allHeaders.containsKey("content-encoding") ? Math.max(Math.min(i + i, 32768), 1) : i + 1;
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final void onCanceled(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) {
        this.e.execute(new esng(this));
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final void onFailed(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, CronetException cronetException) {
        this.e.execute(new esnh(this, cronetException));
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final void onReadCompleted(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, ByteBuffer byteBuffer) {
        this.b.a(byteBuffer);
        if (byteBuffer.hasRemaining()) {
            urlRequest.read(byteBuffer);
        } else {
            urlRequest.read(ByteBuffer.allocateDirect(32768));
        }
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final void onRedirectReceived(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, String str) {
        if (this.c.e) {
            this.d.add(str);
            urlRequest.followRedirect();
            return;
        }
        SettableFuture settableFuture = this.a;
        esnu esnuVar = new esnu();
        esnuVar.a(b(urlResponseInfo.getAllHeaders()));
        esnuVar.b(ByteBuffer.allocateDirect(0));
        esnuVar.d = urlResponseInfo.getHttpStatusCode();
        settableFuture.set(new esnv(esnuVar));
        urlRequest.cancel();
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final void onResponseStarted(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) {
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(a(urlResponseInfo));
        this.b.a(byteBufferAllocateDirect);
        urlRequest.read(byteBufferAllocateDirect);
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final void onSucceeded(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) {
        this.e.execute(new esnf(this, urlResponseInfo));
    }
}
