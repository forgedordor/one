package defpackage;

import java.nio.ByteBuffer;
import org.chromium.net.CronetException;
import org.chromium.net.UrlRequest;
import org.chromium.net.UrlResponseInfo;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class asny extends UrlRequest.Callback {
    final /* synthetic */ asnz a;
    private final kog c;
    private final ekrg b = ekrg.c("com/google/android/apps/messaging/shared/business/RbmBusinessInfoJsonRetriever$UrlRequestCallback");
    private evqs d = evqs.b;

    public asny(asnz asnzVar, kog kogVar) {
        this.a = asnzVar;
        this.c = kogVar;
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final void onCanceled(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) {
        if (urlResponseInfo == null || urlResponseInfo.getHttpStatusCode() <= 0) {
            ekrw ekrwVarJ = this.b.j();
            ekrwVarJ.X(eksq.a, "Bugle");
            ((ekrd) ((ekrd) ekrwVarJ).h("com/google/android/apps/messaging/shared/business/RbmBusinessInfoJsonRetriever$UrlRequestCallback", "onCanceled", 450, "RbmBusinessInfoJsonRetriever.java")).q("Business Info JSON HTTP retrieval cancelled without response code");
            this.c.c(new asoa("Business Info JSON HTTP retrieval was cancelled", 8));
            return;
        }
        ekrw ekrwVarH = this.b.h();
        ekrwVarH.X(eksq.a, "Bugle");
        ((ekrd) ((ekrd) ekrwVarH).h("com/google/android/apps/messaging/shared/business/RbmBusinessInfoJsonRetriever$UrlRequestCallback", "onCanceled", 442, "RbmBusinessInfoJsonRetriever.java")).r("Response was cancelled, but contains status code, response code: %d", urlResponseInfo.getHttpStatusCode());
        this.c.b(new asnx(urlResponseInfo.getHttpStatusCode()));
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final void onFailed(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, CronetException cronetException) {
        ekrw ekrwVarJ = this.b.j();
        ekrwVarJ.X(eksq.a, "Bugle");
        ((ekrd) ((ekrd) ((ekrd) ekrwVarJ).g(cronetException)).h("com/google/android/apps/messaging/shared/business/RbmBusinessInfoJsonRetriever$UrlRequestCallback", "onFailed", (char) 428, "RbmBusinessInfoJsonRetriever.java")).q("Business Info JSON HTTP retrieval failed");
        this.c.c(new asoa(cronetException.getMessage() != null ? cronetException.getMessage() : "Cronet exception has null message", 7, cronetException));
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final void onReadCompleted(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, ByteBuffer byteBuffer) {
        byteBuffer.flip();
        this.d = this.d.u(evqs.w(byteBuffer));
        byteBuffer.clear();
        urlRequest.read(byteBuffer);
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final void onRedirectReceived(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, String str) {
        ekrw ekrwVarH = this.b.h();
        ekrwVarH.X(eksq.a, "Bugle");
        ((ekrd) ((ekrd) ekrwVarH).h("com/google/android/apps/messaging/shared/business/RbmBusinessInfoJsonRetriever$UrlRequestCallback", "onRedirectReceived", 346, "RbmBusinessInfoJsonRetriever.java")).q("onRedirectReceived method called.");
        urlRequest.followRedirect();
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final void onResponseStarted(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) {
        int httpStatusCode = urlResponseInfo.getHttpStatusCode();
        if (httpStatusCode == 200 || httpStatusCode == 304) {
            ekrw ekrwVarH = this.b.h();
            ekrwVarH.X(eksq.a, "Bugle");
            ((ekrd) ((ekrd) ekrwVarH).h("com/google/android/apps/messaging/shared/business/RbmBusinessInfoJsonRetriever$UrlRequestCallback", "onResponseStarted", 358, "RbmBusinessInfoJsonRetriever.java")).r("Response started. status: %d", httpStatusCode);
            urlRequest.read(ByteBuffer.allocateDirect(8192));
            return;
        }
        ekrw ekrwVarH2 = this.b.h();
        ekrwVarH2.X(eksq.a, "Bugle");
        ((ekrd) ((ekrd) ekrwVarH2).h("com/google/android/apps/messaging/shared/business/RbmBusinessInfoJsonRetriever$UrlRequestCallback", "onResponseStarted", 363, "RbmBusinessInfoJsonRetriever.java")).r("Response started, and response code was not 200 OK or 304. response code: %d", httpStatusCode);
        this.c.b(new asnx(httpStatusCode));
        urlRequest.cancel();
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x018f  */
    @Override // org.chromium.net.UrlRequest.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onSucceeded(org.chromium.net.UrlRequest r22, org.chromium.net.UrlResponseInfo r23) throws java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 457
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.asny.onSucceeded(org.chromium.net.UrlRequest, org.chromium.net.UrlResponseInfo):void");
    }
}
