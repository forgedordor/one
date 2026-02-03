package defpackage;

import android.net.Network;
import android.net.http.BidirectionalStream;
import android.net.http.HttpEngine;
import android.net.http.UrlRequest;
import android.util.Log;
import j$.util.DesugarCollections;
import java.io.IOException;
import java.net.Proxy;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLStreamHandlerFactory;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import org.chromium.net.BidirectionalStream;
import org.chromium.net.ExperimentalBidirectionalStream;
import org.chromium.net.ExperimentalUrlRequest;
import org.chromium.net.RequestFinishedInfo;
import org.chromium.net.UploadDataProvider;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fgbj extends fgcj {
    private static boolean d;
    private static boolean e;
    public final HttpEngine a;
    public final int b;
    public Thread c;
    private final Map f = DesugarCollections.synchronizedMap(new HashMap());

    public fgbj(HttpEngine httpEngine, int i) {
        this.a = httpEngine;
        this.b = i;
    }

    private final Executor d(Executor executor) {
        return this.b == Integer.MIN_VALUE ? executor : new fgbi(this, executor);
    }

    private static final Network e(long j) {
        if (j == -1) {
            return null;
        }
        return Network.fromNetworkHandle(j);
    }

    @Override // defpackage.fgcj
    public final ExperimentalBidirectionalStream a(String str, BidirectionalStream.Callback callback, Executor executor, String str2, List list, int i, boolean z, Collection collection, boolean z2, int i2, boolean z3, int i3, long j) {
        fgbb fgbbVar = new fgbb(callback);
        BidirectionalStream.Builder builderNewBidirectionalStreamBuilder = this.a.newBidirectionalStreamBuilder(str, executor, fgbbVar);
        builderNewBidirectionalStreamBuilder.setHttpMethod(str2);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            builderNewBidirectionalStreamBuilder.addHeader((String) entry.getKey(), (String) entry.getValue());
        }
        builderNewBidirectionalStreamBuilder.setPriority(i);
        builderNewBidirectionalStreamBuilder.setDelayRequestHeadersUntilFirstFlushEnabled(z);
        if (z2) {
            builderNewBidirectionalStreamBuilder.setTrafficStatsTag(i2);
        }
        if (z3) {
            builderNewBidirectionalStreamBuilder.setTrafficStatsUid(i3);
        }
        fgbc fgbcVar = new fgbc(builderNewBidirectionalStreamBuilder.build(), this, str, collection);
        fgbbVar.a = fgbcVar;
        return fgbcVar;
    }

    @Override // org.chromium.net.CronetEngine
    public final void addRequestFinishedListener(RequestFinishedInfo.Listener listener) {
        this.f.put(listener, new fggr(listener));
    }

    @Override // defpackage.fgcj
    public final ExperimentalUrlRequest b(String str, UrlRequest.Callback callback, Executor executor, int i, Collection collection, boolean z, boolean z2, boolean z3, boolean z4, int i2, boolean z5, int i3, RequestFinishedInfo.Listener listener, int i4, long j, String str2, ArrayList arrayList, UploadDataProvider uploadDataProvider, Executor executor2, byte[] bArr, ByteBuffer byteBuffer, String str3) {
        fgbt fgbtVar = new fgbt(callback);
        UrlRequest.Builder builderNewUrlRequestBuilder = this.a.newUrlRequestBuilder(str, executor, fgbtVar);
        builderNewUrlRequestBuilder.setPriority(i);
        if (z) {
            builderNewUrlRequestBuilder.setCacheDisabled(true);
        }
        if (z3) {
            builderNewUrlRequestBuilder.setDirectExecutorAllowed(true);
        }
        if (z4) {
            builderNewUrlRequestBuilder.setTrafficStatsTag(i2);
        }
        if (z5) {
            builderNewUrlRequestBuilder.setTrafficStatsTag(i3);
        }
        builderNewUrlRequestBuilder.bindToNetwork(e(j));
        builderNewUrlRequestBuilder.setHttpMethod(str2);
        int size = arrayList.size();
        for (int i5 = 0; i5 < size; i5++) {
            Map.Entry entry = (Map.Entry) arrayList.get(i5);
            builderNewUrlRequestBuilder.addHeader((String) entry.getKey(), (String) entry.getValue());
        }
        if (uploadDataProvider != null) {
            builderNewUrlRequestBuilder.setUploadDataProvider(new fgbo(uploadDataProvider), executor2);
        }
        fgbv fgbvVar = new fgbv(builderNewUrlRequestBuilder.build(), this, str, collection, listener);
        fgbtVar.b = fgbvVar;
        return fgbvVar;
    }

    @Override // org.chromium.net.CronetEngine
    public final void bindToNetwork(long j) {
        this.a.bindToNetwork(e(j));
    }

    final void c(final RequestFinishedInfo requestFinishedInfo, fggr fggrVar) {
        ArrayList arrayList = new ArrayList();
        Map map = this.f;
        synchronized (map) {
            arrayList.addAll(map.values());
        }
        if (fggrVar != null) {
            arrayList.add(fggrVar);
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            final fggr fggrVar2 = (fggr) arrayList.get(i);
            try {
                fggrVar2.getExecutor().execute(new Runnable() { // from class: fgbg
                    @Override // java.lang.Runnable
                    public final void run() {
                        try {
                            fggrVar2.onRequestFinished(requestFinishedInfo);
                        } catch (Exception e2) {
                            Log.e("HttpEngineWrapper", "Exception thrown from observation task", e2);
                        }
                    }
                });
            } catch (RejectedExecutionException e2) {
                Log.e("HttpEngineWrapper", "Exception posting task to executor", e2);
            }
        }
    }

    @Override // org.chromium.net.CronetEngine
    public final URLStreamHandlerFactory createURLStreamHandlerFactory() {
        return this.a.createUrlStreamHandlerFactory();
    }

    @Override // org.chromium.net.CronetEngine
    public final byte[] getGlobalMetricsDeltas() {
        if (!e) {
            Log.i("HttpEngineWrapper", "GlobalMetricsDelta is unsupported when HttpEngineNativeProvider is used. An empty protobuf is returned.");
            e = true;
        }
        return new byte[0];
    }

    @Override // org.chromium.net.CronetEngine
    public final String getVersionString() {
        return HttpEngine.getVersionString();
    }

    @Override // defpackage.fgcj, org.chromium.net.ExperimentalCronetEngine, org.chromium.net.CronetEngine
    public final ExperimentalUrlRequest.Builder newUrlRequestBuilder(String str, UrlRequest.Callback callback, Executor executor) {
        return new fggj(str, callback, d(executor), this);
    }

    @Override // org.chromium.net.CronetEngine
    public final URLConnection openConnection(final URL url) {
        return (URLConnection) fgcq.a(new fgcp() { // from class: fgbh
            @Override // defpackage.fgcp
            public final Object a() {
                return this.a.a.openConnection(url);
            }
        }, IOException.class);
    }

    @Override // org.chromium.net.CronetEngine
    public final void removeRequestFinishedListener(RequestFinishedInfo.Listener listener) {
        this.f.remove(listener);
    }

    @Override // org.chromium.net.CronetEngine
    public final void shutdown() {
        this.a.shutdown();
    }

    @Override // org.chromium.net.CronetEngine
    public final void startNetLogToFile(String str, boolean z) {
        if (d) {
            return;
        }
        Log.i("HttpEngineWrapper", "Netlog is unsupported when HttpEngineNativeProvider is used.");
        d = true;
    }

    @Override // defpackage.fgcj, org.chromium.net.ExperimentalCronetEngine, org.chromium.net.CronetEngine
    public final ExperimentalBidirectionalStream.Builder newBidirectionalStreamBuilder(String str, BidirectionalStream.Callback callback, Executor executor) {
        return new fgbx(str, callback, d(executor), this);
    }

    @Override // org.chromium.net.ExperimentalCronetEngine
    public final URLConnection openConnection(URL url, Proxy proxy) {
        if (proxy.type() != Proxy.Type.DIRECT) {
            throw new UnsupportedOperationException();
        }
        String protocol = url.getProtocol();
        if ("http".equals(protocol) || "https".equals(protocol)) {
            return openConnection(url);
        }
        throw new UnsupportedOperationException("Unexpected protocol:".concat(String.valueOf(protocol)));
    }

    @Override // defpackage.fgcj, org.chromium.net.ExperimentalCronetEngine, org.chromium.net.CronetEngine
    public final /* bridge */ /* synthetic */ UrlRequest.Builder newUrlRequestBuilder(String str, UrlRequest.Callback callback, Executor executor) {
        return newUrlRequestBuilder(str, callback, executor);
    }

    @Override // org.chromium.net.CronetEngine
    public final void stopNetLog() {
    }
}
