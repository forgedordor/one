package defpackage;

import j$.nio.channels.DesugarChannels;
import j$.util.Optional;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import org.chromium.net.CronetException;
import org.chromium.net.UrlRequest;
import org.chromium.net.UrlResponseInfo;

/* compiled from: PG */
@Deprecated
/* loaded from: classes8.dex */
final class comz extends UrlRequest.Callback {
    static final ekhx a = ekhx.s(403, 404, 410);
    private static final eksp b = eksp.c("BugleFileTransfer");
    private final kog c;
    private final FileOutputStream d;
    private final int e;
    private final AtomicInteger f = new AtomicInteger(0);
    private final AtomicLong g;
    private final Optional h;
    private final String i;

    public comz(String str, FileOutputStream fileOutputStream, int i, kog kogVar, Optional optional) {
        AtomicLong atomicLong = new AtomicLong();
        this.g = atomicLong;
        this.i = str;
        this.d = fileOutputStream;
        atomicLong.set(0L);
        this.e = i;
        this.c = kogVar;
        this.h = optional;
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final void onCanceled(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) {
        eksl ekslVar = (eksl) b.h();
        ekslVar.X(coie.a, this.i);
        ((eksl) ekslVar.h("com/google/android/apps/messaging/shared/transfer/downloads/DownloadCallback", "onCanceled", 153, "DownloadCallback.java")).q("Download from server canceled.");
        this.c.d();
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final void onFailed(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, CronetException cronetException) {
        eksl ekslVar = (eksl) b.j();
        ekslVar.X(coie.a, this.i);
        ((eksl) ekslVar.h("com/google/android/apps/messaging/shared/transfer/downloads/DownloadCallback", "onFailed", 133, "DownloadCallback.java")).q("Download from server failed.");
        if (urlResponseInfo == null) {
            this.c.c(new cond(true, "Empty server response during file download.", coid.FILE_TRANSFER_FAILURE_REASON_EMPTY_HTTP_RESPONSE_BODY, (Throwable) cronetException));
            return;
        }
        kog kogVar = this.c;
        urlResponseInfo.getHttpStatusCode();
        kogVar.c(new cond(true, "Cronet failure during file download.", coid.FILE_TRANSFER_FAILURE_REASON_HTTP_REQUEST_FAILED, (Throwable) cronetException));
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final void onReadCompleted(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, ByteBuffer byteBuffer) throws IOException {
        byteBuffer.flip();
        long jRemaining = byteBuffer.remaining();
        DesugarChannels.convertMaybeLegacyFileChannelFromLibrary(this.d.getChannel()).write(byteBuffer);
        long jAddAndGet = this.g.addAndGet(jRemaining);
        Optional optional = this.h;
        if (!optional.isEmpty() && jAddAndGet >= cojd.b()) {
            cohi cohiVar = new cohi();
            cohiVar.b(jAddAndGet);
            cohiVar.c(2147483647L);
            auvh.h(((coir) optional.get()).b(this.i, cohiVar.d()));
        }
        byteBuffer.clear();
        urlRequest.read(byteBuffer);
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final void onRedirectReceived(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, String str) {
        AtomicInteger atomicInteger = this.f;
        if (atomicInteger.incrementAndGet() > this.e) {
            urlRequest.cancel();
            return;
        }
        eksp ekspVar = b;
        ((eksl) ((eksl) ekspVar.h()).h("com/google/android/apps/messaging/shared/transfer/downloads/DownloadCallback", "onRedirectReceived", 79, "DownloadCallback.java")).t("onRedirectReceived: Redirecting to: %s", str);
        eksl ekslVar = (eksl) ekspVar.h();
        ekslVar.X(coie.a, this.i);
        ekslVar.X(coie.c, Integer.valueOf(atomicInteger.intValue()));
        ((eksl) ekslVar.h("com/google/android/apps/messaging/shared/transfer/downloads/DownloadCallback", "onRedirectReceived", 84, "DownloadCallback.java")).o();
        urlRequest.followRedirect();
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final void onResponseStarted(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) {
        int httpStatusCode = urlResponseInfo.getHttpStatusCode();
        eksl ekslVar = (eksl) b.h();
        ekslVar.X(coie.a, this.i);
        ekslVar.X(coie.d, Integer.valueOf(httpStatusCode));
        ((eksl) ekslVar.h("com/google/android/apps/messaging/shared/transfer/downloads/DownloadCallback", "onResponseStarted", 99, "DownloadCallback.java")).q("onResponseStarted: Starting to read the response.");
        if (httpStatusCode == 200 || httpStatusCode == 206) {
            urlRequest.read(ByteBuffer.allocateDirect(32768));
        } else {
            this.c.c(new cond(!a.contains(r2), a.g(httpStatusCode, "Http failure during file download: "), (byte[]) null));
        }
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final void onSucceeded(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) {
        eksl ekslVar = (eksl) b.h();
        ekslVar.X(coie.a, this.i);
        ((eksl) ekslVar.h("com/google/android/apps/messaging/shared/transfer/downloads/DownloadCallback", "onSucceeded", 127, "DownloadCallback.java")).q("Download from server succeeded.");
        this.c.b(urlResponseInfo);
    }
}
