package org.chromium.net.impl;

import android.os.ConditionVariable;
import android.os.Trace;
import defpackage.a;
import defpackage.ffyc;
import defpackage.ffye;
import defpackage.ffyf;
import defpackage.ffyu;
import defpackage.fgaz;
import defpackage.fgbx;
import defpackage.fgcj;
import defpackage.fgcl;
import defpackage.fgcm;
import defpackage.fgcn;
import defpackage.fgcv;
import defpackage.fgcy;
import defpackage.fgda;
import defpackage.fgdb;
import defpackage.fgdc;
import defpackage.fgdw;
import defpackage.fgdx;
import defpackage.fgdy;
import defpackage.fgdz;
import defpackage.fgea;
import defpackage.fggh;
import defpackage.fggj;
import defpackage.fggp;
import defpackage.fggq;
import defpackage.fggr;
import defpackage.fghh;
import defpackage.fghl;
import internal.J.N;
import java.net.Proxy;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLStreamHandlerFactory;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicInteger;
import org.chromium.net.BidirectionalStream;
import org.chromium.net.ExperimentalBidirectionalStream;
import org.chromium.net.ExperimentalUrlRequest;
import org.chromium.net.NetworkQualityRttListener;
import org.chromium.net.NetworkQualityThroughputListener;
import org.chromium.net.RequestContextConfigOptions;
import org.chromium.net.RequestFinishedInfo;
import org.chromium.net.UploadDataProvider;
import org.chromium.net.UrlRequest;
import org.chromium.net.impl.CronetUrlRequestContext;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class CronetUrlRequestContext extends fgcj {
    public static final String a = "CronetUrlRequestContext";
    public static final /* synthetic */ int h = 0;
    private static final HashSet i = new HashSet();
    private long A;
    public final Object b;
    public long c;
    public Thread d;
    public final long e;
    public final fgdb f;
    public final fgcy g;
    private final ConditionVariable j;
    private final AtomicInteger k;
    private final AtomicInteger l;
    private final boolean m;
    private final Object n;
    private final Object o;
    private int p;
    private int q;
    private int r;
    private int s;
    private final ffyf t;
    private final ffyf u;
    private final Map v;
    private final ConditionVariable w;
    private final String x;
    private boolean y;
    private boolean z;

    public CronetUrlRequestContext(fgcn fgcnVar, long j) {
        Object obj = new Object();
        this.b = obj;
        this.j = new ConditionVariable(false);
        this.k = new AtomicInteger(0);
        this.l = new AtomicInteger(0);
        this.n = new Object();
        this.o = new Object();
        this.p = 0;
        this.q = -1;
        this.r = -1;
        this.s = -1;
        this.t = new ffyf();
        this.u = new ffyf();
        this.v = new HashMap();
        this.w = new ConditionVariable();
        this.A = -1L;
        new ffyu("CronetUrlRequestContext#CronetUrlRequestContext");
        try {
            this.g = fgcnVar.f;
            this.m = fgcnVar.p;
            boolean zC = CronetLibraryLoader.c(fgcnVar.c, fgcnVar, false);
            if (fgcnVar.a() == 1) {
                String str = fgcnVar.i;
                this.x = str;
                HashSet hashSet = i;
                synchronized (hashSet) {
                    if (!hashSet.add(str)) {
                        throw new IllegalStateException("Disk cache storage path already in use");
                    }
                }
            } else {
                this.x = null;
            }
            synchronized (obj) {
                new ffyu("CronetUrlRequestContext#CronetUrlRequestContext creating adapter");
                try {
                    fgaz fgazVar = (fgaz) CronetLibraryLoader.a().a().get("Cronet_override_network_thread_priority");
                    RequestContextConfigOptions.Builder builderNewBuilder = RequestContextConfigOptions.newBuilder();
                    builderNewBuilder.setQuicEnabled(fgcnVar.j);
                    builderNewBuilder.setHttp2Enabled(fgcnVar.k);
                    builderNewBuilder.setBrotliEnabled(fgcnVar.l);
                    builderNewBuilder.setDisableCache(!fgcnVar.m.f);
                    builderNewBuilder.setHttpCacheMode(fgcnVar.a());
                    builderNewBuilder.setHttpCacheMaxSize(fgcnVar.n);
                    builderNewBuilder.setMockCertVerifier(0L);
                    builderNewBuilder.setEnableNetworkQualityEstimator(fgcnVar.p);
                    builderNewBuilder.setBypassPublicKeyPinningForLocalTrustAnchors(fgcnVar.g);
                    builderNewBuilder.setNetworkThreadPriority(fgazVar != null ? (int) fgazVar.b() : fgcnVar.b(10));
                    String str2 = fgcnVar.h;
                    if (str2 != null) {
                        builderNewBuilder.setUserAgent(str2);
                    }
                    String str3 = fgcnVar.i;
                    if (str3 != null) {
                        builderNewBuilder.setStoragePath(str3);
                    }
                    fgcnVar.c();
                    builderNewBuilder.setQuicDefaultUserAgentId(fgcnVar.c());
                    String str4 = fgcnVar.o;
                    if (str4 != null) {
                        builderNewBuilder.setExperimentalOptions(str4);
                    }
                    long jMB3ntV7V = N.MB3ntV7V(builderNewBuilder.build().toByteArray());
                    if (jMB3ntV7V == 0) {
                        throw new IllegalArgumentException("Experimental options parsing failed.");
                    }
                    for (fgcm fgcmVar : fgcnVar.d) {
                        N.MyRIv1Ij(jMB3ntV7V, fgcmVar.a, fgcmVar.b, fgcmVar.c);
                    }
                    for (fgcl fgclVar : fgcnVar.e) {
                        N.Muq3ic6p(jMB3ntV7V, fgclVar.a, fgclVar.b, fgclVar.c, fgclVar.d.getTime());
                    }
                    this.c = N.M135Cu0D(jMB3ntV7V);
                    Trace.endSection();
                    if (this.c == 0) {
                        throw new NullPointerException("Context Adapter creation failed.");
                    }
                } finally {
                }
            }
            fgdb fgdbVarA = fgdc.a(fgcnVar.c, fgcnVar.f);
            this.f = fgdbVarA;
            long jA = fgdbVarA.a();
            this.e = jA;
            fgcv fgcvVarD = fgcnVar.d();
            try {
                fgdbVarA.c(jA, fgcvVarD, new fgda("Cronet/".concat(ImplVersion.getCronetVersionWithLastChange()).split("/")[1].split("@")[0]), fgcnVar.f);
            } catch (RuntimeException e) {
                ffyc.g(a, "Error while trying to log CronetEngine creation: ", e);
            }
            fgea fgeaVar = zC ? new fgea(this.f, fgcvVarD.i, j, fgcnVar.f) : null;
            CronetLibraryLoader.b(new fgdw(this, fgeaVar));
            if (fgeaVar != null) {
                int iA = fgeaVar.a();
                synchronized (fgeaVar.a) {
                    fgeaVar.a.b = iA;
                    fgeaVar.b();
                }
            }
            Trace.endSection();
        } finally {
        }
    }

    private final void h() {
        if (!k()) {
            throw new IllegalStateException("Engine is shut down.");
        }
    }

    private static void i(Executor executor, Runnable runnable, String str) {
        j(executor, runnable, null, str);
    }

    private final void initNetworkThread() {
        this.d = Thread.currentThread();
        this.j.open();
        Thread.currentThread().setName("ChromiumNet");
    }

    private static void j(Executor executor, final Runnable runnable, final fggh fgghVar, final String str) {
        new ffyu("CronetUrlRequestContext#postObservationTaskToExecutor ".concat(str));
        if (fgghVar != null) {
            try {
                fgghVar.b();
            } catch (Throwable th) {
                try {
                    Trace.endSection();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        try {
            executor.execute(new Runnable() { // from class: fgdv
                @Override // java.lang.Runnable
                public final void run() {
                    int i2 = CronetUrlRequestContext.h;
                    new ffyu("CronetUrlRequestContext#postObservationTaskToExecutor " + str + " running callback");
                    Runnable runnable2 = runnable;
                    fggh fgghVar2 = fgghVar;
                    try {
                        try {
                            try {
                                runnable2.run();
                            } catch (Exception e) {
                                ffyc.d(CronetUrlRequestContext.a, "Exception thrown from observation task", e);
                                if (fgghVar2 != null) {
                                }
                            }
                            Trace.endSection();
                        } finally {
                            if (fgghVar2 != null) {
                                fgghVar2.a();
                            }
                        }
                    } catch (Throwable th3) {
                        try {
                            Trace.endSection();
                        } catch (Throwable th4) {
                            th3.addSuppressed(th4);
                        }
                        throw th3;
                    }
                }
            });
        } catch (RejectedExecutionException e) {
            if (fgghVar != null) {
                fgghVar.a();
            }
            ffyc.d(a, "Exception posting task to executor", e);
        }
        Trace.endSection();
    }

    private final boolean k() {
        return this.c != 0;
    }

    private final void onEffectiveConnectionTypeChanged(int i2) {
        synchronized (this.n) {
            this.p = i2;
        }
    }

    private final void onRTTOrThroughputEstimatesComputed(int i2, int i3, int i4) {
        synchronized (this.n) {
            this.q = i2;
            this.r = i3;
            this.s = i4;
        }
    }

    private final void onRttObservation(int i2, long j, int i3) {
        synchronized (this.n) {
            ffye ffyeVar = new ffye(this.t);
            while (ffyeVar.hasNext()) {
                fggp fggpVar = (fggp) ffyeVar.next();
                int i4 = i2;
                long j2 = j;
                int i5 = i3;
                i(fggpVar.getExecutor(), new fgdx(fggpVar, i4, j2, i5), "onRttObservation");
                i2 = i4;
                j = j2;
                i3 = i5;
            }
        }
    }

    private final void onThroughputObservation(int i2, long j, int i3) {
        synchronized (this.n) {
            ffye ffyeVar = new ffye(this.u);
            while (ffyeVar.hasNext()) {
                fggq fggqVar = (fggq) ffyeVar.next();
                int i4 = i2;
                long j2 = j;
                int i5 = i3;
                i(fggqVar.getExecutor(), new fgdy(fggqVar, i4, j2, i5), "onThroughputObservation");
                i2 = i4;
                j = j2;
                i3 = i5;
            }
        }
    }

    @Override // defpackage.fgcj
    protected final ExperimentalBidirectionalStream a(String str, BidirectionalStream.Callback callback, Executor executor, String str2, List list, int i2, boolean z, Collection collection, boolean z2, int i3, boolean z3, int i4, long j) throws Throwable {
        long j2 = j == -1 ? this.A : j;
        synchronized (this.b) {
            try {
                try {
                    h();
                    return new CronetBidirectionalStream(this, str, i2, callback, executor, str2, list, z, collection, z2, i3, z3, i4, j2);
                } catch (Throwable th) {
                    th = th;
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                throw th;
            }
        }
    }

    @Override // org.chromium.net.CronetEngine
    public final void addRequestFinishedListener(RequestFinishedInfo.Listener listener) {
        synchronized (this.o) {
            this.v.put(listener, new fggr(listener));
        }
    }

    @Override // org.chromium.net.CronetEngine
    public final void addRttListener(NetworkQualityRttListener networkQualityRttListener) {
        if (!this.m) {
            throw new IllegalStateException("Network quality estimator must be enabled");
        }
        synchronized (this.n) {
            if (this.t.b()) {
                synchronized (this.b) {
                    h();
                    N.MpnFLFF2(this.c, this, true);
                }
            }
            this.t.d(new fggp(networkQualityRttListener));
        }
    }

    @Override // org.chromium.net.CronetEngine
    public final void addThroughputListener(NetworkQualityThroughputListener networkQualityThroughputListener) {
        if (!this.m) {
            throw new IllegalStateException("Network quality estimator must be enabled");
        }
        synchronized (this.n) {
            if (this.u.b()) {
                synchronized (this.b) {
                    h();
                    N.MnPUhNKP(this.c, this, true);
                }
            }
            this.u.d(new fggq(networkQualityThroughputListener));
        }
    }

    @Override // defpackage.fgcj
    public final ExperimentalUrlRequest b(String str, UrlRequest.Callback callback, Executor executor, int i2, Collection collection, boolean z, boolean z2, boolean z3, boolean z4, int i3, boolean z5, int i4, RequestFinishedInfo.Listener listener, int i5, long j, String str2, ArrayList arrayList, UploadDataProvider uploadDataProvider, Executor executor2, byte[] bArr, ByteBuffer byteBuffer, String str3) throws Throwable {
        long j2 = j == -1 ? this.A : j;
        synchronized (this.b) {
            try {
                try {
                    h();
                    return new CronetUrlRequest(this, str, i2, callback, executor, collection, z, z2, z3, z4, i3, z5, i4, listener, i5, j2, str2, arrayList, uploadDataProvider, executor2, bArr, byteBuffer, str3);
                } catch (Throwable th) {
                    th = th;
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                throw th;
            }
        }
    }

    @Override // org.chromium.net.CronetEngine
    public final void bindToNetwork(long j) {
        this.A = j;
    }

    public final long c() {
        long j;
        synchronized (this.b) {
            h();
            j = this.c;
        }
        return j;
    }

    @Override // org.chromium.net.CronetEngine
    public final void configureNetworkQualityEstimatorForTesting(boolean z, boolean z2, boolean z3) {
        if (!this.m) {
            throw new IllegalStateException("Network quality estimator must be enabled");
        }
        synchronized (this.b) {
            h();
            N.M6sIJDgy_ForTesting(this.c, this, z, z2, z3);
        }
    }

    @Override // org.chromium.net.CronetEngine
    public final URLStreamHandlerFactory createURLStreamHandlerFactory() {
        return new fghl(this);
    }

    final void d() {
        this.k.decrementAndGet();
    }

    public final void e() {
        this.l.decrementAndGet();
    }

    final void f() {
        this.l.incrementAndGet();
        this.k.incrementAndGet();
    }

    final void g(RequestFinishedInfo requestFinishedInfo, fggh fgghVar, fggr fggrVar) {
        ArrayList arrayList = new ArrayList();
        synchronized (this.o) {
            arrayList.addAll(this.v.values());
        }
        if (fggrVar != null) {
            arrayList.add(fggrVar);
        }
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            fggr fggrVar2 = (fggr) arrayList.get(i2);
            j(fggrVar2.getExecutor(), new fgdz(fggrVar2, requestFinishedInfo), fgghVar, "reportRequestFinished");
        }
    }

    @Override // org.chromium.net.CronetEngine
    public final int getActiveRequestCount() {
        return this.l.get();
    }

    @Override // org.chromium.net.CronetEngine
    public final int getDownstreamThroughputKbps() {
        int i2;
        if (!this.m) {
            throw new IllegalStateException("Network quality estimator must be enabled");
        }
        synchronized (this.n) {
            i2 = this.s;
            if (i2 == -1) {
                i2 = -1;
            }
        }
        return i2;
    }

    @Override // org.chromium.net.CronetEngine
    public final int getEffectiveConnectionType() {
        int i2;
        if (!this.m) {
            throw new IllegalStateException("Network quality estimator must be enabled");
        }
        synchronized (this.n) {
            int i3 = this.p;
            if (i3 != 0) {
                i2 = 1;
                if (i3 != 1) {
                    i2 = 2;
                    if (i3 != 2) {
                        i2 = 3;
                        if (i3 != 3) {
                            i2 = 4;
                            if (i3 != 4) {
                                i2 = 5;
                                if (i3 != 5) {
                                    throw new RuntimeException(a.g(i3, "Internal Error: Illegal EffectiveConnectionType value "));
                                }
                            }
                        }
                    }
                }
            } else {
                i2 = 0;
            }
        }
        return i2;
    }

    @Override // org.chromium.net.CronetEngine
    public final byte[] getGlobalMetricsDeltas() {
        return (byte[]) N.M7CZ_Klr();
    }

    @Override // org.chromium.net.CronetEngine
    public final int getHttpRttMs() {
        int i2;
        if (!this.m) {
            throw new IllegalStateException("Network quality estimator must be enabled");
        }
        synchronized (this.n) {
            i2 = this.q;
            if (i2 == -1) {
                i2 = -1;
            }
        }
        return i2;
    }

    @Override // org.chromium.net.CronetEngine
    public final int getTransportRttMs() {
        int i2;
        if (!this.m) {
            throw new IllegalStateException("Network quality estimator must be enabled");
        }
        synchronized (this.n) {
            i2 = this.r;
            if (i2 == -1) {
                i2 = -1;
            }
        }
        return i2;
    }

    @Override // org.chromium.net.CronetEngine
    public final String getVersionString() {
        return "Cronet/".concat(ImplVersion.getCronetVersionWithLastChange());
    }

    @Override // defpackage.fgcj, org.chromium.net.ExperimentalCronetEngine, org.chromium.net.CronetEngine
    public final /* synthetic */ BidirectionalStream.Builder newBidirectionalStreamBuilder(String str, BidirectionalStream.Callback callback, Executor executor) {
        return new fgbx(str, callback, executor, this);
    }

    @Override // defpackage.fgcj, org.chromium.net.ExperimentalCronetEngine, org.chromium.net.CronetEngine
    public final /* synthetic */ UrlRequest.Builder newUrlRequestBuilder(String str, UrlRequest.Callback callback, Executor executor) {
        return new fggj(str, callback, executor, this);
    }

    @Override // org.chromium.net.CronetEngine
    public final URLConnection openConnection(URL url) {
        return openConnection(url, Proxy.NO_PROXY);
    }

    @Override // org.chromium.net.CronetEngine
    public final void removeRequestFinishedListener(RequestFinishedInfo.Listener listener) {
        synchronized (this.o) {
            this.v.remove(listener);
        }
    }

    @Override // org.chromium.net.CronetEngine
    public final void removeRttListener(NetworkQualityRttListener networkQualityRttListener) {
        if (!this.m) {
            throw new IllegalStateException("Network quality estimator must be enabled");
        }
        synchronized (this.n) {
            ffyf ffyfVar = this.t;
            if (ffyfVar.c(new fggp(networkQualityRttListener)) && ffyfVar.b()) {
                synchronized (this.b) {
                    h();
                    N.MpnFLFF2(this.c, this, false);
                }
            }
        }
    }

    @Override // org.chromium.net.CronetEngine
    public final void removeThroughputListener(NetworkQualityThroughputListener networkQualityThroughputListener) {
        if (!this.m) {
            throw new IllegalStateException("Network quality estimator must be enabled");
        }
        synchronized (this.n) {
            ffyf ffyfVar = this.u;
            if (ffyfVar.c(new fggq(networkQualityThroughputListener)) && ffyfVar.b()) {
                synchronized (this.b) {
                    h();
                    N.MnPUhNKP(this.c, this, false);
                }
            }
        }
    }

    @Override // org.chromium.net.CronetEngine
    public final void shutdown() {
        new ffyu("CronetUrlRequestContext#shutdown");
        try {
            String str = this.x;
            if (str != null) {
                HashSet hashSet = i;
                synchronized (hashSet) {
                    hashSet.remove(str);
                }
            }
            synchronized (this.b) {
                h();
                if (this.k.get() != 0) {
                    throw new IllegalStateException("Cannot shutdown with running requests.");
                }
                if (Thread.currentThread() == this.d) {
                    throw new IllegalThreadStateException("Cannot shutdown from network thread.");
                }
            }
            this.j.block();
            stopNetLog();
            synchronized (this.b) {
                if (k()) {
                    N.MeBvNXm5(this.c, this);
                    this.c = 0L;
                }
            }
            Trace.endSection();
        } catch (Throwable th) {
            try {
                Trace.endSection();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // org.chromium.net.CronetEngine
    public final void startNetLogToDisk(String str, boolean z, int i2) throws Throwable {
        Throwable th;
        synchronized (this.b) {
            try {
                try {
                    h();
                    if (!this.y) {
                        N.MTULt02u(this.c, this, str, z, i2);
                        this.y = true;
                    } else {
                        try {
                        } catch (Throwable th2) {
                            th = th2;
                            throw th;
                        }
                    }
                } catch (Throwable th3) {
                    th = th3;
                    th = th;
                    throw th;
                }
            } catch (Throwable th4) {
                th = th4;
                th = th;
                throw th;
            }
        }
    }

    @Override // org.chromium.net.CronetEngine
    public final void startNetLogToFile(String str, boolean z) {
        synchronized (this.b) {
            h();
            if (this.y) {
                return;
            }
            if (!N.MgwJQAH1(this.c, this, str, z)) {
                throw new RuntimeException("Unable to start NetLog");
            }
            this.y = true;
        }
    }

    @Override // org.chromium.net.CronetEngine
    public final void stopNetLog() {
        Object obj = this.b;
        synchronized (obj) {
            h();
            if (this.y && !this.z) {
                N.MKFm_qQ7(this.c, this);
                this.z = true;
                ConditionVariable conditionVariable = this.w;
                conditionVariable.block();
                conditionVariable.close();
                synchronized (obj) {
                    this.z = false;
                    this.y = false;
                }
            }
        }
    }

    public final void stopNetLogCompleted() {
        this.w.open();
    }

    @Override // defpackage.fgcj, org.chromium.net.ExperimentalCronetEngine, org.chromium.net.CronetEngine
    public final ExperimentalBidirectionalStream.Builder newBidirectionalStreamBuilder(String str, BidirectionalStream.Callback callback, Executor executor) {
        return new fgbx(str, callback, executor, this);
    }

    @Override // org.chromium.net.ExperimentalCronetEngine
    public final URLConnection openConnection(URL url, Proxy proxy) {
        if (proxy.type() != Proxy.Type.DIRECT) {
            throw new UnsupportedOperationException();
        }
        String protocol = url.getProtocol();
        if ("http".equals(protocol) || "https".equals(protocol)) {
            return new fghh(url, this);
        }
        throw new UnsupportedOperationException("Unexpected protocol:".concat(String.valueOf(protocol)));
    }
}
