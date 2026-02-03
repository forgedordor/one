package defpackage;

import java.nio.ByteBuffer;
import org.chromium.net.CronetException;
import org.chromium.net.UrlRequest;
import org.chromium.net.UrlResponseInfo;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class atch extends UrlRequest.Callback {
    final /* synthetic */ atci a;
    private final UrlRequest.Callback b;

    public atch(atci atciVar, UrlRequest.Callback callback) {
        this.a = atciVar;
        this.b = callback;
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final void onCanceled(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) {
        this.a.c();
        this.b.onCanceled(urlRequest, urlResponseInfo);
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final void onFailed(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, CronetException cronetException) {
        this.a.c();
        this.b.onFailed(urlRequest, urlResponseInfo, cronetException);
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final void onReadCompleted(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, ByteBuffer byteBuffer) {
        ((eksl) atci.a.o().h("com/google/android/apps/messaging/shared/chatapi/filetransfer/MonitoredUrlRequest$MonitoredCallback", "onReadCompleted", 158, "MonitoredUrlRequest.java")).t("Reading HTTP response, restarting read timer (%d millis)", atci.b.e());
        this.a.d(((Integer) atci.c.e()).intValue());
        this.b.onReadCompleted(urlRequest, urlResponseInfo, byteBuffer);
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final void onRedirectReceived(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, String str) {
        eksl ekslVar = (eksl) atci.a.o().h("com/google/android/apps/messaging/shared/chatapi/filetransfer/MonitoredUrlRequest$MonitoredCallback", "onRedirectReceived", 136, "MonitoredUrlRequest.java");
        cczi ccziVar = atci.b;
        ekslVar.t("HTTP request redirected, restarting connection timer (%d millis)", ccziVar.e());
        this.a.d(((Integer) ccziVar.e()).intValue());
        this.b.onRedirectReceived(urlRequest, urlResponseInfo, str);
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final void onResponseStarted(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) {
        ((eksl) atci.a.o().h("com/google/android/apps/messaging/shared/chatapi/filetransfer/MonitoredUrlRequest$MonitoredCallback", "onResponseStarted", 147, "MonitoredUrlRequest.java")).t("HTTP response started, starting read timer (%d millis)", atci.b.e());
        this.a.d(((Integer) atci.c.e()).intValue());
        this.b.onResponseStarted(urlRequest, urlResponseInfo);
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final void onSucceeded(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) {
        this.a.c();
        this.b.onSucceeded(urlRequest, urlResponseInfo);
    }
}
