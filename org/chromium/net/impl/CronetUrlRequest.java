package org.chromium.net.impl;

import android.os.Process;
import android.os.Trace;
import defpackage.a;
import defpackage.ffyc;
import defpackage.ffyu;
import defpackage.fgbz;
import defpackage.fgco;
import defpackage.fgcz;
import defpackage.fgdb;
import defpackage.fgde;
import defpackage.fgdf;
import defpackage.fgdn;
import defpackage.fgdo;
import defpackage.fgdp;
import defpackage.fgdq;
import defpackage.fgdr;
import defpackage.fgds;
import defpackage.fgdt;
import defpackage.fgdu;
import defpackage.fggd;
import defpackage.fggf;
import defpackage.fggg;
import defpackage.fggh;
import defpackage.fggi;
import defpackage.fggl;
import defpackage.fggr;
import defpackage.fggt;
import internal.J.N;
import j$.time.Duration;
import java.nio.ByteBuffer;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import org.chromium.net.CronetException;
import org.chromium.net.ExperimentalUrlRequest;
import org.chromium.net.InlineExecutionProhibitedException;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class CronetUrlRequest extends ExperimentalUrlRequest {
    private final byte[] A;
    private final ByteBuffer B;
    private final String C;
    private final long D;
    private final fgdb E;
    private int F;
    private fgde G;
    private boolean H;
    private boolean I;
    private int J;
    private int K;
    private boolean L;
    private fgdu M;
    public long a;
    public boolean b;
    public final Object c = new Object();
    public final CronetUrlRequestContext d;
    public final fggt e;
    public final CronetUploadDataStream f;
    public fggl g;
    public CronetException h;
    private final boolean i;
    private boolean j;
    private boolean k;
    private final Executor l;
    private final List m;
    private final String n;
    private final int o;
    private final int p;
    private final String q;
    private final List r;
    private final Collection s;
    private final boolean t;
    private final boolean u;
    private final boolean v;
    private final int w;
    private final boolean x;
    private final int y;
    private final fggr z;

    /* JADX WARN: Removed duplicated region for block: B:25:0x007e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public CronetUrlRequest(org.chromium.net.impl.CronetUrlRequestContext r6, java.lang.String r7, int r8, org.chromium.net.UrlRequest.Callback r9, java.util.concurrent.Executor r10, java.util.Collection r11, boolean r12, boolean r13, boolean r14, boolean r15, int r16, boolean r17, int r18, org.chromium.net.RequestFinishedInfo.Listener r19, int r20, long r21, java.lang.String r23, java.util.ArrayList r24, org.chromium.net.UploadDataProvider r25, java.util.concurrent.Executor r26, byte[] r27, java.nio.ByteBuffer r28, java.lang.String r29) {
        /*
            r5 = this;
            r0 = r19
            r1 = r20
            r2 = r25
            r5.<init>()
            java.lang.Object r3 = new java.lang.Object
            r3.<init>()
            r5.c = r3
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r5.m = r3
            r29.getClass()
            r5.i = r14
            r5.d = r6
            fgdb r6 = r6.f
            r5.E = r6
            r5.n = r7
            r3.add(r7)
            r6 = 2
            r7 = 1
            if (r8 == 0) goto L3c
            if (r8 == r7) goto L3a
            r3 = 3
            if (r8 == r6) goto L3d
            r4 = 4
            if (r8 == r3) goto L38
            if (r8 == r4) goto L36
            goto L38
        L36:
            r3 = 5
            goto L3d
        L38:
            r3 = r4
            goto L3d
        L3a:
            r3 = r6
            goto L3d
        L3c:
            r3 = r7
        L3d:
            r5.o = r3
            fggt r8 = new fggt
            r8.<init>(r9)
            r5.e = r8
            r5.l = r10
            r5.s = r11
            r5.t = r12
            r5.u = r13
            r5.v = r15
            r8 = r16
            r5.w = r8
            r8 = r17
            r5.x = r8
            r8 = r18
            r5.y = r8
            r8 = 0
            if (r0 == 0) goto L65
            fggr r9 = new fggr
            r9.<init>(r0)
            goto L66
        L65:
            r9 = r8
        L66:
            r5.z = r9
            r9 = r27
            r5.A = r9
            r9 = r28
            r5.B = r9
            r9 = r29
            r5.C = r9
            r9 = 0
            if (r1 == 0) goto L7e
            if (r1 == r7) goto L7c
            if (r1 == r6) goto L7f
            goto L7e
        L7c:
            r6 = r7
            goto L7f
        L7e:
            r6 = r9
        L7f:
            r5.p = r6
            r6 = r21
            r5.D = r6
            r6 = r23
            r5.q = r6
            java.util.ArrayList r6 = new java.util.ArrayList
            r7 = r24
            r6.<init>(r7)
            java.util.List r6 = j$.util.DesugarCollections.unmodifiableList(r6)
            r5.r = r6
            if (r2 != 0) goto L99
            goto La0
        L99:
            org.chromium.net.impl.CronetUploadDataStream r8 = new org.chromium.net.impl.CronetUploadDataStream
            r6 = r26
            r8.<init>(r2, r6, r5)
        La0:
            r5.f = r8
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.chromium.net.impl.CronetUrlRequest.<init>(org.chromium.net.impl.CronetUrlRequestContext, java.lang.String, int, org.chromium.net.UrlRequest$Callback, java.util.concurrent.Executor, java.util.Collection, boolean, boolean, boolean, boolean, int, boolean, int, org.chromium.net.RequestFinishedInfo$Listener, int, long, java.lang.String, java.util.ArrayList, org.chromium.net.UploadDataProvider, java.util.concurrent.Executor, byte[], java.nio.ByteBuffer, java.lang.String):void");
    }

    private final fggl j(int i, String str, String[] strArr, boolean z, String str2, String str3, long j) {
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < strArr.length; i2 += 2) {
            arrayList.add(new AbstractMap.SimpleImmutableEntry(strArr[i2], strArr[i2 + 1]));
        }
        return new fggl(new ArrayList(this.m), i, str, arrayList, z, str2, str3, j);
    }

    private final void k(CronetException cronetException) {
        synchronized (this.c) {
            if (h()) {
                return;
            }
            this.h = cronetException;
            b(1);
        }
    }

    private final void l(final Runnable runnable, final String str) {
        new ffyu("CronetUrlRequest#postTaskToExecutor ".concat(str));
        try {
            try {
                this.l.execute(new Runnable() { // from class: fgdk
                    @Override // java.lang.Runnable
                    public final void run() {
                        new ffyu("CronetUrlRequest#postTaskToExecutor " + str + " running callback");
                        try {
                            runnable.run();
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
                });
            } catch (RejectedExecutionException e) {
                ffyc.d(CronetUrlRequestContext.a, "Exception posting task to executor", e);
                k(new fgco("Exception posting task to executor", e));
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

    private final void onCanceled() {
        l(new fgdr(this), "onCanceled");
    }

    private final void onError(int i, int i2, int i3, int i4, String str, long j) {
        fggl fgglVar = this.g;
        if (fgglVar != null) {
            fgglVar.a(j);
        }
        if (i == 10 || i3 != 0) {
            k(new fggg("Exception in CronetUrlRequest: ".concat(String.valueOf(str)), i, i2, i3, i4));
            return;
        }
        switch (i) {
            case 1:
                i = 1;
                break;
            case 2:
                i = 2;
                break;
            case 3:
                i = 3;
                break;
            case 4:
                i = 4;
                break;
            case 5:
                i = 5;
                break;
            case 6:
                i = 6;
                break;
            case 7:
                i = 7;
                break;
            case 8:
                i = 8;
                break;
            case 9:
                i = 9;
                break;
            case 10:
                i = 10;
                break;
            case 11:
                i = 11;
                break;
            default:
                ffyc.c(CronetUrlRequestContext.a, a.g(i, "Unknown error code: "));
                break;
        }
        k(new fggd("Exception in CronetUrlRequest: ".concat(String.valueOf(str)), i, i2));
    }

    private final void onMetricsCollected(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, boolean z, long j14, long j15, boolean z2, boolean z3) {
        if (this.G != null) {
            throw new IllegalStateException("Metrics collection should only happen once.");
        }
        this.G = new fgde(j, j2, j3, j4, j5, j6, j7, j8, j9, j10, j11, j12, j13, z, j14, j15);
        this.H = z2;
        this.I = z3;
    }

    private final void onNativeAdapterDestroyed() {
        new ffyu("CronetUrlRequest#onNativeAdapterDestroyed");
        try {
            synchronized (this.c) {
                if (this.h == null) {
                    Trace.endSection();
                    return;
                }
                fgdt fgdtVar = new fgdt(this);
                new ffyu("CronetUrlRequest#onNativeAdapterDestroyed scheduling callback");
                try {
                    try {
                        this.l.execute(fgdtVar);
                    } finally {
                    }
                } catch (RejectedExecutionException e) {
                    ffyc.d(CronetUrlRequestContext.a, "Exception posting task to executor", e);
                }
                Trace.endSection();
                Trace.endSection();
            }
        } catch (Throwable th) {
            try {
                Trace.endSection();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    private final void onReadCompleted(ByteBuffer byteBuffer, int i, int i2, int i3, long j) {
        this.g.a(j);
        if (byteBuffer.position() != i2 || byteBuffer.limit() != i3) {
            k(new fgco("ByteBuffer modified externally during read", null));
            return;
        }
        if (this.M == null) {
            this.M = new fgdu(this);
        }
        fgdu fgduVar = this.M;
        fgduVar.a = byteBuffer;
        l(fgduVar, "onReadCompleted");
    }

    private final void onRedirectReceived(String str, int i, String str2, String[] strArr, boolean z, String str3, String str4, long j) {
        List list = this.m;
        fggl fgglVarJ = j(i, str2, strArr, z, str3, str4, j);
        list.add(str);
        l(new fgdo(this, fgglVarJ, str), "onRedirectReceived");
    }

    private final void onResponseStarted(int i, String str, String[] strArr, boolean z, String str2, String str3, long j) {
        this.g = j(i, str, strArr, z, str2, str3, j);
        l(new fgdp(this), "onResponseStarted");
    }

    private final void onStatus(VersionSafeCallbacks$UrlRequestStatusListener versionSafeCallbacks$UrlRequestStatusListener, int i) {
        l(new fgds(versionSafeCallbacks$UrlRequestStatusListener, i), "onStatus");
    }

    private final void onSucceeded(long j) {
        this.g.a(j);
        l(new fgdq(this), "onSucceeded");
    }

    public final void a() {
        if (this.i) {
            return;
        }
        if (Thread.currentThread() == this.d.d) {
            throw new InlineExecutionProhibitedException();
        }
    }

    public final void b(int i) {
        this.F = i;
        if (this.a == 0) {
            return;
        }
        this.d.d();
        N.M4znfYdB(this.a, this, i == 2);
        this.a = 0L;
    }

    public final void c() {
        Map<String, List<String>> allHeaders;
        String str;
        boolean z;
        int i;
        long length;
        long jMax;
        long jMax2;
        int i2;
        int i3;
        int i4;
        int i5;
        long j;
        long j2;
        long j3;
        fggh fgghVar = new fggh(new Runnable() { // from class: fgdl
            @Override // java.lang.Runnable
            public final void run() {
                this.a.d.e();
            }
        });
        try {
            if (this.G != null) {
                try {
                    fgdb fgdbVar = this.E;
                    CronetUrlRequestContext cronetUrlRequestContext = this.d;
                    long j4 = cronetUrlRequestContext.e;
                    fggl fgglVar = this.g;
                    if (fgglVar != null) {
                        allHeaders = fgglVar.getAllHeaders();
                        fggl fgglVar2 = this.g;
                        str = fgglVar2.c;
                        int i6 = fgglVar2.a;
                        z = fgglVar2.b;
                        i = i6;
                    } else {
                        allHeaders = Collections.EMPTY_MAP;
                        str = "";
                        z = false;
                        i = 0;
                    }
                    String str2 = str;
                    long jLongValue = this.G.b.longValue();
                    long j5 = 0;
                    if (z && jLongValue == 0) {
                        jMax = 0;
                        length = 0;
                    } else {
                        List<Map.Entry> list = this.r;
                        if (list == null) {
                            length = 0;
                        } else {
                            length = 0;
                            for (Map.Entry entry : list) {
                                if (((String) entry.getKey()) != null) {
                                    length += r17.length();
                                }
                                if (((String) entry.getValue()) != null) {
                                    length += ((String) entry.getValue()).length();
                                }
                            }
                        }
                        j5 = 0;
                        jMax = Math.max(0L, jLongValue - length);
                    }
                    long jLongValue2 = this.G.c.longValue();
                    if (z && jLongValue2 == j5) {
                        jMax2 = j5;
                    } else {
                        long jA = fgdf.a(allHeaders);
                        jMax2 = Math.max(j5, jLongValue2 - jA);
                        j5 = jA;
                    }
                    Duration durationOfSeconds = (this.G.getRequestStart() == null || this.G.getResponseStart() == null) ? Duration.ofSeconds(0L) : Duration.ofMillis(this.G.getResponseStart().getTime() - this.G.getRequestStart().getTime());
                    Duration durationOfSeconds2 = (this.G.getRequestStart() == null || this.G.getRequestEnd() == null) ? Duration.ofSeconds(0L) : Duration.ofMillis(this.G.getRequestEnd().getTime() - this.G.getRequestStart().getTime());
                    CronetException cronetException = this.h;
                    if (cronetException instanceof fggd) {
                        j = jMax;
                        j2 = length;
                        j3 = j5;
                        i3 = ((fggd) cronetException).b;
                        i4 = 0;
                        i5 = 0;
                        i2 = 2;
                    } else {
                        if (cronetException instanceof fggg) {
                            fggg fgggVar = (fggg) cronetException;
                            int cronetInternalErrorCode = fgggVar.getCronetInternalErrorCode();
                            int i7 = fgggVar.a;
                            i5 = fgggVar.b;
                            i3 = cronetInternalErrorCode;
                            i4 = i7;
                            i2 = 2;
                        } else {
                            i2 = cronetException != null ? 3 : 1;
                            i3 = 0;
                            i4 = 0;
                            i5 = 0;
                        }
                        j = jMax;
                        j2 = length;
                        j3 = j5;
                    }
                    boolean z2 = this.H;
                    boolean z3 = this.I;
                    Duration duration = durationOfSeconds;
                    int iB = fgdf.b(this.F);
                    int i8 = this.K;
                    int i9 = this.J;
                    CronetUploadDataStream cronetUploadDataStream = this.f;
                    fgdbVar.e(j4, new fgcz(j2, j, j3, jMax2, i, duration, durationOfSeconds2, str2, z2, z3, iB, i8, i9, cronetUploadDataStream == null ? 0 : cronetUploadDataStream.f.get(), false, this.L, Process.myUid(), i3, i4, i5, i2, this.G.a, cronetUrlRequestContext.g));
                } catch (RuntimeException e) {
                    ffyc.d(CronetUrlRequestContext.a, "Error while trying to log CronetTrafficInfo: ", e);
                }
                this.d.g(new fggi(this.n, this.s, this.G, this.F, this.g, this.h), fgghVar, this.z);
            }
        } finally {
            fgghVar.a();
        }
    }

    @Override // org.chromium.net.UrlRequest
    public final void cancel() {
        new ffyu("CronetUrlRequest#cancel");
        try {
            synchronized (this.c) {
                if (!h() && this.j) {
                    b(2);
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

    public final void d(String str, Exception exc) {
        this.L = true;
        ffyc.d(CronetUrlRequestContext.a, a.a(str, "Exception in ", " method"), exc);
    }

    public final void e(Exception exc) {
        this.K++;
        fgbz fgbzVar = new fgbz("Exception received from UrlRequest.Callback", exc);
        ffyc.d(CronetUrlRequestContext.a, "Exception in CalledByNative method", exc);
        k(fgbzVar);
    }

    final void f(Throwable th) {
        fgbz fgbzVar = new fgbz("Exception received from UploadDataProvider", th);
        ffyc.d(CronetUrlRequestContext.a, "Exception in upload method", th);
        k(fgbzVar);
    }

    @Override // org.chromium.net.UrlRequest
    public final void followRedirect() {
        new ffyu("CronetUrlRequest#followRedirect");
        try {
            synchronized (this.c) {
                if (!this.b) {
                    throw new IllegalStateException("No redirect to follow.");
                }
                this.b = false;
                if (!h()) {
                    N.Mhp54Oqs(this.a, this);
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

    public final void g() {
        N.MabZ5m6r(this.a, this);
    }

    @Override // org.chromium.net.UrlRequest
    public final void getStatus(UrlRequest.StatusListener statusListener) {
        VersionSafeCallbacks$UrlRequestStatusListener versionSafeCallbacks$UrlRequestStatusListener = new VersionSafeCallbacks$UrlRequestStatusListener(statusListener);
        synchronized (this.c) {
            long j = this.a;
            if (j != 0) {
                N.MgIIMpT9(j, this, versionSafeCallbacks$UrlRequestStatusListener);
            } else {
                l(new fgdn(versionSafeCallbacks$UrlRequestStatusListener), "getStatus");
            }
        }
    }

    public final boolean h() {
        return this.j && this.a == 0;
    }

    @Override // org.chromium.net.UrlRequest
    public final boolean isDone() {
        boolean zH;
        synchronized (this.c) {
            zH = h();
        }
        return zH;
    }

    @Override // org.chromium.net.UrlRequest
    public final void read(ByteBuffer byteBuffer) throws Throwable {
        Throwable th;
        new ffyu("CronetUrlRequest#read");
        try {
            fggf.b(byteBuffer);
            fggf.a(byteBuffer);
            try {
                synchronized (this.c) {
                    try {
                        if (!this.k) {
                            throw new IllegalStateException("Unexpected read attempt.");
                        }
                        this.k = false;
                        if (h()) {
                            try {
                            } catch (Throwable th2) {
                                th = th2;
                                try {
                                    throw th;
                                } catch (Throwable th3) {
                                    th = th3;
                                    Throwable th4 = th;
                                    try {
                                        Trace.endSection();
                                        throw th4;
                                    } catch (Throwable th5) {
                                        th4.addSuppressed(th5);
                                        throw th4;
                                    }
                                }
                            }
                        } else {
                            if (!N.MfCxA8r3(this.a, this, byteBuffer, byteBuffer.position(), byteBuffer.limit())) {
                                this.k = true;
                                throw new IllegalArgumentException("Unable to call native read");
                            }
                            this.J++;
                        }
                        Trace.endSection();
                    } catch (Throwable th6) {
                        th = th6;
                        th = th;
                        throw th;
                    }
                }
                Trace.endSection();
            } catch (Throwable th7) {
                th = th7;
            }
        } catch (Throwable th8) {
            th = th8;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0018, code lost:
    
        r0 = r25.d;
        r4 = r0.c();
        r6 = r25.n;
        r7 = r25.o;
        r8 = r25.t;
        r9 = r25.u;
        r10 = r25.v;
        r11 = r25.w;
        r12 = r25.x;
        r13 = r25.y;
        r14 = r25.p;
        r15 = r25.A;
        r2 = r25.B;
        r22 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0036, code lost:
    
        if (r2 == null) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0038, code lost:
    
        r17 = r2.position();
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x003f, code lost:
    
        r17 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0041, code lost:
    
        if (r2 == null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0043, code lost:
    
        r18 = r2.limit();
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x004a, code lost:
    
        r18 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0054, code lost:
    
        r25.a = internal.J.N.MuOIsMvf(r25, r4, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r2, r17, r18, r25.C, r25.D);
        r0.f();
        r0 = r25.a;
        r2 = r25.q;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x006b, code lost:
    
        if (internal.J.N.M51RPBJe(r0, r25, r2) == false) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x006d, code lost:
    
        r0 = r25.r.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0077, code lost:
    
        if (r0.hasNext() == false) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0079, code lost:
    
        r1 = (java.util.Map.Entry) r0.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x008b, code lost:
    
        if (((java.lang.String) r1.getKey()).equalsIgnoreCase(defpackage.ffho.a) == false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0097, code lost:
    
        if (((java.lang.String) r1.getValue()).isEmpty() != false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0099, code lost:
    
        r22 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00ad, code lost:
    
        if (internal.J.N.MvHusd1J(r25.a, r25, (java.lang.String) r1.getKey(), (java.lang.String) r1.getValue()) == false) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00cc, code lost:
    
        throw new java.lang.IllegalArgumentException("Invalid header with headername: " + ((java.lang.String) r1.getKey()));
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00cd, code lost:
    
        r0 = r25.f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00cf, code lost:
    
        if (r0 == null) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00d1, code lost:
    
        if (r22 == false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00d3, code lost:
    
        r25.j = true;
        r0.c(new defpackage.fgdm(r25), "CronetUrlRequest#start");
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00e9, code lost:
    
        throw new java.lang.IllegalArgumentException("Requests with upload data must have a Content-Type.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00eb, code lost:
    
        r25.j = true;
        g();
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00f1, code lost:
    
        android.os.Trace.endSection();
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00f4, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0100, code lost:
    
        throw new java.lang.IllegalArgumentException(defpackage.a.v(r2, "Invalid http method "));
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0101, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0103, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0107, code lost:
    
        b(1);
        r25.d.e();
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x010f, code lost:
    
        throw r0;
     */
    @Override // org.chromium.net.UrlRequest
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void start() {
        /*
            Method dump skipped, instructions count: 307
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.chromium.net.impl.CronetUrlRequest.start():void");
    }
}
