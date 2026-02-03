package defpackage;

import j$.time.Instant;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import org.chromium.net.CallbackException;
import org.chromium.net.CronetException;
import org.chromium.net.NetworkException;
import org.chromium.net.QuicException;
import org.chromium.net.RequestFinishedInfo;
import org.chromium.net.UrlResponseInfo;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dzrx extends RequestFinishedInfo.Listener {
    public dzrx(Executor executor) {
        super(executor);
    }

    @Override // org.chromium.net.RequestFinishedInfo.Listener
    public final void onRequestFinished(RequestFinishedInfo requestFinishedInfo) {
        Map<String, List<String>> allHeaders;
        List<String> list;
        if (!dzfj.a().a.j()) {
            ((ekrd) ((ekrd) dzfq.a.j()).h("com/google/android/libraries/performance/primes/metrics/network/RequestFinishedListener", "onRequestFinished", 61, "RequestFinishedListener.java")).q("onRequestFinished is skipped as primes preconditions failed.");
            return;
        }
        if (requestFinishedInfo == null) {
            ((ekrd) ((ekrd) dzfq.a.j()).h("com/google/android/libraries/performance/primes/metrics/network/RequestFinishedListener", "onRequestFinished", 65, "RequestFinishedListener.java")).q("Un-expected null UrlRequestInfo from cronet's RequestFinishedListener,  skipping current NetworkEvent");
            return;
        }
        RequestFinishedInfo.Metrics metrics = requestFinishedInfo.getMetrics();
        if (metrics == null) {
            ((ekrd) ((ekrd) dzfq.a.j()).h("com/google/android/libraries/performance/primes/metrics/network/RequestFinishedListener", "onRequestFinished", 72, "RequestFinishedListener.java")).q("un-expected null metrics from cronet's RequestFinishedListener, skipping current request");
            return;
        }
        if (requestFinishedInfo.getAnnotations() != null) {
            Iterator<Object> it = requestFinishedInfo.getAnnotations().iterator();
            while (it.hasNext()) {
                if (it.next() instanceof drgl) {
                    ((ekrd) ((ekrd) dzfq.a.g()).h("com/google/android/libraries/performance/primes/metrics/network/RequestFinishedListener", "onRequestFinished", 81, "RequestFinishedListener.java")).q("onRequestFinished is skipped due to PrimesCronetMonitorIgnoreAnnotation");
                    return;
                }
            }
        }
        Date requestStart = metrics.getRequestStart();
        dzrm dzrmVar = new dzrm(null, requestFinishedInfo.getUrl(), false, requestStart == null ? Instant.now().toEpochMilli() : requestStart.getTime());
        UrlResponseInfo responseInfo = requestFinishedInfo.getResponseInfo();
        if (responseInfo != null && (allHeaders = responseInfo.getAllHeaders()) != null && (list = allHeaders.get(ffho.a)) != null && !list.isEmpty()) {
            dzrmVar.k = list.get(0);
        }
        Long receivedByteCount = metrics.getReceivedByteCount();
        if (receivedByteCount != null) {
            dzrmVar.d = receivedByteCount.intValue();
        }
        Long sentByteCount = metrics.getSentByteCount();
        if (sentByteCount != null) {
            dzrmVar.e = sentByteCount.intValue();
        }
        Long ttfbMs = metrics.getTtfbMs();
        if (ttfbMs != null) {
            dzrmVar.b = ttfbMs.longValue();
        }
        Long totalTimeMs = metrics.getTotalTimeMs();
        if (totalTimeMs != null) {
            dzrmVar.c = totalTimeMs.longValue();
        }
        UrlResponseInfo responseInfo2 = requestFinishedInfo.getResponseInfo();
        if (responseInfo2 != null) {
            int httpStatusCode = responseInfo2.getHttpStatusCode();
            if (httpStatusCode >= 0) {
                dzrmVar.j = httpStatusCode;
            }
            String negotiatedProtocol = responseInfo2.getNegotiatedProtocol();
            if (negotiatedProtocol != null && !negotiatedProtocol.isEmpty()) {
                dzrmVar.i = negotiatedProtocol;
            }
        }
        int finishedReason = requestFinishedInfo.getFinishedReason();
        int i = 4;
        dzrmVar.w = finishedReason != 0 ? finishedReason != 1 ? finishedReason != 2 ? 1 : 4 : 3 : 2;
        CronetException exception = requestFinishedInfo.getException();
        if (exception != null) {
            if (exception instanceof NetworkException) {
                switch (((NetworkException) exception).getErrorCode()) {
                    case 1:
                        i = 3;
                        break;
                    case 2:
                        break;
                    case 3:
                        i = 5;
                        break;
                    case 4:
                        i = 6;
                        break;
                    case 5:
                        i = 7;
                        break;
                    case 6:
                        i = 8;
                        break;
                    case 7:
                        i = 9;
                        break;
                    case 8:
                        i = 10;
                        break;
                    case 9:
                        i = 11;
                        break;
                    case 10:
                        i = 12;
                        break;
                    case 11:
                        i = 13;
                        break;
                    default:
                        i = 1;
                        break;
                }
                dzrmVar.o = i - 1;
            } else if (exception instanceof CallbackException) {
                dzrmVar.o = 1;
            } else {
                dzrmVar.o = 0;
            }
            if (exception instanceof QuicException) {
                dzrmVar.p = ((QuicException) exception).getQuicDetailedErrorCode();
            }
        }
        dzrmVar.m = 1;
        dzfj.a().g(dzrmVar);
    }
}
