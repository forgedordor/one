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
/* loaded from: classes6.dex */
public final class ated extends UrlRequest.Callback {
    private static final eksp a = eksp.c("BugleFileTransfer");
    private final FileOutputStream b;
    private final int c;
    private final AtomicInteger d = new AtomicInteger(0);
    private final AtomicLong e;
    private final int f;
    private final Optional g;
    private final String h;
    private final atbz i;

    public ated(String str, int i, long j, FileOutputStream fileOutputStream, int i2, atbz atbzVar, Optional optional) {
        AtomicLong atomicLong = new AtomicLong();
        this.e = atomicLong;
        this.h = str;
        this.f = i;
        this.b = fileOutputStream;
        atomicLong.set(j);
        this.c = i2;
        this.i = atbzVar;
        this.g = optional;
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final void onCanceled(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) {
        eksl ekslVar = (eksl) a.h();
        ekslVar.X(coie.a, this.h);
        ((eksl) ekslVar.h("com/google/android/apps/messaging/shared/chatapi/filetransfer/downloads/DownloadCallback", "onCanceled", 137, "DownloadCallback.java")).q("Download canceled.");
        atbp atbpVarG = atbq.g();
        int httpStatusCode = urlResponseInfo != null ? urlResponseInfo.getHttpStatusCode() : 0;
        atbz atbzVar = this.i;
        atbpVarG.e(httpStatusCode);
        atbpVarG.f(coid.FILE_TRANSFER_FAILURE_REASON_UNEXPECTED_CANCELLATION);
        atbzVar.a(atbpVarG.a());
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final void onFailed(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, CronetException cronetException) {
        eksp ekspVar = a;
        eksl ekslVar = (eksl) ekspVar.j();
        ekrz ekrzVar = coie.a;
        String str = this.h;
        ekslVar.X(ekrzVar, str);
        ((eksl) ekslVar.h("com/google/android/apps/messaging/shared/chatapi/filetransfer/downloads/DownloadCallback", "onFailed", 116, "DownloadCallback.java")).q("Download failed.");
        if (urlResponseInfo != null) {
            atbz atbzVar = this.i;
            atbp atbpVarG = atbq.g();
            atbpVarG.e(urlResponseInfo.getHttpStatusCode());
            atbpVarG.f(coid.FILE_TRANSFER_FAILURE_REASON_HTTP_REQUEST_FAILED);
            atbpVarG.b(cronetException);
            atbzVar.a(atbpVarG.a());
            return;
        }
        ekrw ekrwVarO = ekspVar.o();
        ekrwVarO.X(ekrzVar, str);
        ((eksl) ekrwVarO.h("com/google/android/apps/messaging/shared/chatapi/filetransfer/downloads/DownloadCallback", "onFailed", 118, "DownloadCallback.java")).q("Download response null.");
        atbz atbzVar2 = this.i;
        atbp atbpVarG2 = atbq.g();
        atbpVarG2.f(coid.FILE_TRANSFER_FAILURE_REASON_EMPTY_HTTP_RESPONSE_BODY);
        atbpVarG2.b(cronetException);
        atbzVar2.a(atbpVarG2.a());
    }

    /* JADX WARN: Type inference failed for: r6v7, types: [coir, java.lang.Object] */
    @Override // org.chromium.net.UrlRequest.Callback
    public final void onReadCompleted(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, ByteBuffer byteBuffer) throws IOException {
        byteBuffer.flip();
        long jRemaining = byteBuffer.remaining();
        DesugarChannels.convertMaybeLegacyFileChannelFromLibrary(this.b.getChannel()).write(byteBuffer);
        long jAddAndGet = this.e.addAndGet(jRemaining);
        Optional optional = this.g;
        if (!optional.isEmpty() && jAddAndGet >= cojd.b()) {
            cohi cohiVar = new cohi();
            cohiVar.b(jAddAndGet);
            cohiVar.c(this.f);
            auvh.h(optional.get().b(this.h, cohiVar.d()));
        }
        byteBuffer.clear();
        urlRequest.read(byteBuffer);
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final void onRedirectReceived(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, String str) {
        AtomicInteger atomicInteger = this.d;
        if (atomicInteger.incrementAndGet() <= this.c) {
            eksp ekspVar = a;
            ((eksl) ((eksl) ekspVar.h()).h("com/google/android/apps/messaging/shared/chatapi/filetransfer/downloads/DownloadCallback", "onRedirectReceived", 66, "DownloadCallback.java")).t("onRedirectReceived: Redirecting to: %s", str);
            eksl ekslVar = (eksl) ekspVar.h();
            ekslVar.X(coie.a, this.h);
            ekslVar.X(coie.c, Integer.valueOf(atomicInteger.intValue()));
            ((eksl) ekslVar.h("com/google/android/apps/messaging/shared/chatapi/filetransfer/downloads/DownloadCallback", "onRedirectReceived", 71, "DownloadCallback.java")).o();
            urlRequest.followRedirect();
            return;
        }
        eksl ekslVar2 = (eksl) a.j();
        ekslVar2.X(coie.a, this.h);
        ((eksl) ekslVar2.h("com/google/android/apps/messaging/shared/chatapi/filetransfer/downloads/DownloadCallback", "onRedirectReceived", 76, "DownloadCallback.java")).q("MaxRedirects reached.");
        atbz atbzVar = this.i;
        atbp atbpVarG = atbq.g();
        atbpVarG.f(coid.FILE_TRANSFER_FAILURE_REASON_MAX_REDIRECTS_REACHED);
        atbzVar.a(atbpVarG.a());
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final void onResponseStarted(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) {
        eksl ekslVar = (eksl) a.h();
        ekslVar.X(coie.a, this.h);
        ekslVar.X(coie.d, Integer.valueOf(urlResponseInfo.getHttpStatusCode()));
        ((eksl) ekslVar.h("com/google/android/apps/messaging/shared/chatapi/filetransfer/downloads/DownloadCallback", "onResponseStarted", 89, "DownloadCallback.java")).q("onResponseStarted: Starting to read the response.");
        urlRequest.read(ByteBuffer.allocateDirect(32768));
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final void onSucceeded(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) {
        eksl ekslVar = (eksl) a.h();
        ekslVar.X(coie.a, this.h);
        ((eksl) ekslVar.h("com/google/android/apps/messaging/shared/chatapi/filetransfer/downloads/DownloadCallback", "onSucceeded", 110, "DownloadCallback.java")).q("HTTP request completed.");
        atbe atbeVar = new atbe(urlResponseInfo, evqs.b);
        UrlResponseInfo urlResponseInfo2 = atbeVar.a;
        atcd atcdVar = this.i.a.a;
        if (atcdVar.d.b(urlResponseInfo2)) {
            atcdVar.a(atcdVar.f, atba.a);
        } else {
            atcdVar.a(atcdVar.h, new ataz(atbeVar));
        }
    }
}
