package org.chromium.net.impl;

import android.os.Process;
import android.os.Trace;
import defpackage.a;
import defpackage.ffyc;
import defpackage.ffyu;
import defpackage.fgby;
import defpackage.fgbz;
import defpackage.fgcc;
import defpackage.fgcd;
import defpackage.fgce;
import defpackage.fgcf;
import defpackage.fgcg;
import defpackage.fgch;
import defpackage.fgci;
import defpackage.fgco;
import defpackage.fgdb;
import defpackage.fgde;
import defpackage.fggf;
import defpackage.fggg;
import defpackage.fggh;
import defpackage.fggi;
import defpackage.fggk;
import defpackage.fggl;
import defpackage.fggn;
import internal.J.N;
import j$.time.Duration;
import java.nio.ByteBuffer;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import org.chromium.net.BidirectionalStream;
import org.chromium.net.CronetException;
import org.chromium.net.ExperimentalBidirectionalStream;
import org.chromium.net.impl.CronetBidirectionalStream;
import org.chromium.net.impl.CronetUrlRequestContext;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class CronetBidirectionalStream extends ExperimentalBidirectionalStream {
    private final boolean A;
    private final int B;
    private final long C;
    private LinkedList D;
    private LinkedList E;
    private boolean F;
    private long G;
    private fgch H;
    public final CronetUrlRequestContext a;
    public final fggn b;
    public final String c;
    public final String[] d;
    public final fgdb e;
    public fggh f;
    public CronetException g;
    public int h;
    public int i;
    public int j;
    public boolean k;
    public boolean m;
    public fgde n;
    public boolean o;
    public boolean p;
    public fggl s;
    private final Executor t;
    private final String u;
    private final int v;
    private final boolean w;
    private final Collection x;
    private final boolean y;
    private final int z;
    public final Object l = new Object();
    public int q = 0;
    public int r = 0;

    public CronetBidirectionalStream(CronetUrlRequestContext cronetUrlRequestContext, String str, int i, BidirectionalStream.Callback callback, Executor executor, String str2, List list, boolean z, Collection collection, boolean z2, int i2, boolean z3, int i3, long j) {
        int i4 = 0;
        this.a = cronetUrlRequestContext;
        this.u = str;
        int i5 = 1;
        if (i != 0) {
            if (i != 1) {
                i5 = 3;
                if (i != 2) {
                    if (i == 3) {
                        i5 = 4;
                    } else {
                        if (i != 4) {
                            throw new IllegalArgumentException("Invalid stream priority.");
                        }
                        i5 = 5;
                    }
                }
            } else {
                i5 = 2;
            }
        }
        this.v = i5;
        this.b = new fggn(callback);
        this.t = executor;
        this.c = str2;
        int size = list.size();
        String[] strArr = new String[size + size];
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            int i6 = i4 + 1;
            strArr[i4] = (String) entry.getKey();
            i4 += 2;
            strArr[i6] = (String) entry.getValue();
        }
        this.d = strArr;
        this.w = z;
        this.D = new LinkedList();
        this.E = new LinkedList();
        this.x = collection;
        this.y = z2;
        this.z = i2;
        this.A = z3;
        this.B = i3;
        this.C = j;
        this.e = cronetUrlRequestContext.f;
    }

    public static boolean f(String str) {
        return (str.equals("GET") || str.equals("HEAD")) ? false : true;
    }

    private static ArrayList h(String[] strArr) {
        ArrayList arrayList = new ArrayList(strArr.length >> 1);
        for (int i = 0; i < strArr.length; i += 2) {
            arrayList.add(new AbstractMap.SimpleImmutableEntry(strArr[i], strArr[i + 1]));
        }
        return arrayList;
    }

    private final void i(boolean z) {
        new ffyu("CronetBidirectionalStream#destroyNativeStreamLocked");
        try {
            ffyc.e(CronetUrlRequestContext.a, a.J(this, "destroyNativeStreamLocked "));
            long j = this.G;
            if (j != 0) {
                N.MS2l1kNx(j, this, z);
                if (this.q != 0) {
                    this.a.d();
                }
                this.G = 0L;
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

    private final void j(CronetException cronetException) {
        k(new fgcg(this, cronetException), "failWithException");
    }

    private final void k(final Runnable runnable, final String str) {
        new ffyu("CronetBidirectionalStream#postTaskToExecutor ".concat(str));
        try {
            try {
                this.t.execute(new Runnable() { // from class: fgca
                    @Override // java.lang.Runnable
                    public final void run() {
                        new ffyu("CronetBidirectionalStream#postTaskToExecutor " + str + " running callback");
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
            } catch (Throwable th) {
                try {
                    Trace.endSection();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (RejectedExecutionException e) {
            ffyc.d(CronetUrlRequestContext.a, "Exception posting task to executor", e);
            synchronized (this.l) {
                this.r = 6;
                this.q = 6;
                i(false);
            }
        }
        Trace.endSection();
    }

    private final void l() {
        boolean z;
        CronetBidirectionalStream cronetBidirectionalStream;
        int size = this.E.size();
        ByteBuffer[] byteBufferArr = new ByteBuffer[size];
        int[] iArr = new int[size];
        int[] iArr2 = new int[size];
        for (int i = 0; i < size; i++) {
            ByteBuffer byteBuffer = (ByteBuffer) this.E.poll();
            byteBufferArr[i] = byteBuffer;
            iArr[i] = byteBuffer.position();
            iArr2[i] = byteBuffer.limit();
        }
        this.r = 9;
        this.m = true;
        long j = this.G;
        if (this.F && this.D.isEmpty()) {
            cronetBidirectionalStream = this;
            z = true;
        } else {
            z = false;
            cronetBidirectionalStream = this;
        }
        if (N.MwJCBTMQ(j, cronetBidirectionalStream, byteBufferArr, iArr, iArr2, z)) {
            return;
        }
        cronetBidirectionalStream.r = 8;
        throw new IllegalArgumentException("Unable to call native writev.");
    }

    private final void onCanceled() {
        k(new fgcf(this), "onCanceled");
    }

    private final void onError(int i, int i2, int i3, int i4, String str, long j) {
        fggl fgglVar = this.s;
        if (fgglVar != null) {
            fgglVar.a(j);
        }
        if (i == 10 || i3 != 0) {
            j(new fggg("Exception in BidirectionalStream: ".concat(String.valueOf(str)), i, i2, i3, i4));
        } else {
            j(new fgby("Exception in BidirectionalStream: ".concat(String.valueOf(str)), i, i2));
        }
    }

    private final void onMetricsCollected(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, boolean z, long j14, long j15, boolean z2, boolean z3) {
        try {
            if (this.n != null) {
                throw new IllegalStateException("Metrics collection should only happen once.");
            }
            this.n = new fgde(j, j2, j3, j4, j5, j6, j7, j8, j9, j10, j11, j12, j13, z, j14, j15);
            this.o = z2;
            this.p = z3;
            this.a.g(new fggi(this.u, this.x, this.n, a(), this.s, this.g), this.f, null);
        } finally {
            this.f.a();
        }
    }

    private final void onReadCompleted(ByteBuffer byteBuffer, int i, int i2, int i3, long j) {
        int i4;
        this.s.a(j);
        if (byteBuffer.position() != i2 || byteBuffer.limit() != i3) {
            j(new fgco("ByteBuffer modified externally during read", null));
            return;
        }
        if (i < 0 || (i4 = i2 + i) > i3) {
            j(new fgco("Invalid number of bytes read", null));
            return;
        }
        fgch fgchVar = this.H;
        fgchVar.a = byteBuffer;
        fgchVar.b = i == 0;
        k(fgchVar, "onReadCompleted");
    }

    private final void onResponseHeadersReceived(int i, String str, String[] strArr, long j) {
        try {
            this.s = new fggl(Arrays.asList(this.u), i, "", h(strArr), false, str, null, j);
            k(new fgcd(this), "onResponseHeadersReceived");
        } catch (Exception unused) {
            j(new fgco("Cannot prepare ResponseInfo", null));
        }
    }

    private final void onResponseTrailersReceived(String[] strArr) {
        k(new fgce(this, new fggk(h(strArr))), "onResponseTrailersReceived");
    }

    private final void onStreamReady(boolean z) {
        k(new fgcc(this, z), "onStreamReady");
    }

    private final void onWritevCompleted(ByteBuffer[] byteBufferArr, int[] iArr, int[] iArr2, boolean z) {
        synchronized (this.l) {
            if (g()) {
                return;
            }
            this.r = 8;
            if (!this.E.isEmpty()) {
                l();
            }
            int i = 0;
            while (true) {
                int length = byteBufferArr.length;
                if (i >= length) {
                    return;
                }
                ByteBuffer byteBuffer = byteBufferArr[i];
                if (byteBuffer.position() != iArr[i] || byteBuffer.limit() != iArr2[i]) {
                    break;
                }
                k(new fgci(this, byteBuffer, z && i == length + (-1)), "onWritevCompleted");
                i++;
            }
            j(new fgco("ByteBuffer modified externally during write", null));
        }
    }

    public final int a() {
        int i = this.q;
        int i2 = this.r;
        if (i != i2) {
            throw new IllegalStateException(a.z(i2, i, "Cronet bidirectional stream read state is ", " which is different from write state ", "!"));
        }
        if (i == 5) {
            return 2;
        }
        if (i == 6) {
            return 1;
        }
        if (i == 7) {
            return 0;
        }
        throw new IllegalStateException(a.e(i, "Cronet bidirectional stream read state is ", " which is not a valid finished state!"));
    }

    public final void b(CronetException cronetException) {
        this.g = cronetException;
        synchronized (this.l) {
            if (g()) {
                return;
            }
            this.r = 6;
            this.q = 6;
            i(false);
            try {
                this.b.onFailed(this, this.s, cronetException);
            } catch (Exception e) {
                d("onFailed", e);
            }
            this.f.a();
        }
    }

    public final void c() {
        new ffyu("CronetBidirectionalStream#maybeOnSucceededOnExecutor");
        try {
            synchronized (this.l) {
                if (!g()) {
                    if (this.r == 10 && this.q == 4) {
                        this.r = 7;
                        this.q = 7;
                        i(false);
                        try {
                            this.b.onSucceeded(this, this.s);
                        } catch (Exception e) {
                            d("onSucceeded", e);
                        }
                        this.f.a();
                    }
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

    @Override // org.chromium.net.BidirectionalStream
    public final void cancel() {
        new ffyu("CronetBidirectionalStream#cancel");
        try {
            synchronized (this.l) {
                if (!g() && this.q != 0) {
                    this.r = 5;
                    this.q = 5;
                    i(true);
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
        this.k = true;
        ffyc.d(CronetUrlRequestContext.a, a.a(str, "Exception in ", " method"), exc);
    }

    public final void e(Exception exc) {
        this.h++;
        fgbz fgbzVar = new fgbz("CalledByNative method has thrown an exception", exc);
        ffyc.d(CronetUrlRequestContext.a, "Exception in CalledByNative method", exc);
        b(fgbzVar);
    }

    @Override // org.chromium.net.BidirectionalStream
    public final void flush() {
        int i;
        new ffyu("CronetBidirectionalStream#flush");
        try {
            synchronized (this.l) {
                if (!g() && ((i = this.r) == 8 || i == 9)) {
                    if (!this.D.isEmpty() || !this.E.isEmpty()) {
                        if (!this.D.isEmpty()) {
                            this.E.addAll(this.D);
                            this.D.clear();
                        }
                        if (this.r != 9) {
                            l();
                            this.j++;
                        }
                    } else if (!this.m) {
                        this.m = true;
                        N.MGLIR7Sc(this.G, this);
                        if (!f(this.c)) {
                            this.r = 10;
                        }
                    }
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

    public final boolean g() {
        return this.q != 0 && this.G == 0;
    }

    @Override // org.chromium.net.BidirectionalStream
    public final boolean isDone() {
        boolean zG;
        synchronized (this.l) {
            zG = g();
        }
        return zG;
    }

    @Override // org.chromium.net.BidirectionalStream
    public final void read(ByteBuffer byteBuffer) throws Throwable {
        Throwable th;
        new ffyu("CronetBidirectionalStream#read");
        try {
            try {
                synchronized (this.l) {
                    try {
                        fggf.b(byteBuffer);
                        fggf.a(byteBuffer);
                        if (this.q != 2) {
                            throw new IllegalStateException("Unexpected read attempt.");
                        }
                        try {
                            if (!g()) {
                                if (this.H == null) {
                                    this.H = new fgch(this);
                                }
                                this.q = 3;
                                if (!N.Md_rPmgC(this.G, this, byteBuffer, byteBuffer.position(), byteBuffer.limit())) {
                                    this.q = 2;
                                    throw new IllegalArgumentException("Unable to call native read");
                                }
                                this.i++;
                            }
                            Trace.endSection();
                            return;
                        } catch (Throwable th2) {
                            th = th2;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        th = th;
                        throw th;
                    }
                }
            } catch (Throwable th4) {
                th = th4;
            }
            try {
                throw th;
            } catch (Throwable th5) {
                th = th5;
                Throwable th6 = th;
                try {
                    Trace.endSection();
                    throw th6;
                } catch (Throwable th7) {
                    th6.addSuppressed(th7);
                    throw th6;
                }
            }
        } catch (Throwable th8) {
            th = th8;
        }
    }

    @Override // org.chromium.net.BidirectionalStream
    public final void start() {
        CronetUrlRequestContext cronetUrlRequestContext;
        long jMqTDYvZd;
        String str;
        int i;
        String str2;
        String[] strArr;
        final CronetBidirectionalStream cronetBidirectionalStream = this;
        new ffyu("CronetBidirectionalStream#start");
        try {
            synchronized (cronetBidirectionalStream.l) {
                try {
                    if (cronetBidirectionalStream.q != 0) {
                        throw new IllegalStateException("Stream is already started.");
                    }
                    try {
                        cronetUrlRequestContext = cronetBidirectionalStream.a;
                        jMqTDYvZd = N.MqTDYvZd(cronetBidirectionalStream, cronetUrlRequestContext.c(), !cronetBidirectionalStream.w, cronetBidirectionalStream.y, cronetBidirectionalStream.z, cronetBidirectionalStream.A, cronetBidirectionalStream.B, cronetBidirectionalStream.C);
                        cronetBidirectionalStream.G = jMqTDYvZd;
                        str = cronetBidirectionalStream.u;
                        i = cronetBidirectionalStream.v;
                        str2 = cronetBidirectionalStream.c;
                        strArr = cronetBidirectionalStream.d;
                    } catch (RuntimeException e) {
                        e = e;
                    }
                    try {
                        int iMcDUim_I = N.McDUim_I(jMqTDYvZd, cronetBidirectionalStream, str, i, str2, strArr, !f(str2));
                        if (iMcDUim_I == -1) {
                            throw new IllegalArgumentException(a.v(str2, "Invalid http method "));
                        }
                        if (iMcDUim_I > 0) {
                            throw new IllegalArgumentException("Invalid header with headername: " + strArr[iMcDUim_I - 1]);
                        }
                        cronetUrlRequestContext.f();
                        fggh fgghVar = new fggh(new Runnable() { // from class: fgcb
                            @Override // java.lang.Runnable
                            public final void run() {
                                Map<String, List<String>> allHeaders;
                                String str3;
                                boolean z;
                                int i2;
                                long length;
                                boolean z2;
                                long j;
                                long jA;
                                int i3;
                                int i4;
                                int i5;
                                int i6;
                                CronetBidirectionalStream cronetBidirectionalStream2 = this.a;
                                int iA = cronetBidirectionalStream2.a();
                                boolean z3 = cronetBidirectionalStream2.o;
                                boolean z4 = cronetBidirectionalStream2.p;
                                fggl fgglVar = cronetBidirectionalStream2.s;
                                if (fgglVar != null) {
                                    allHeaders = fgglVar.getAllHeaders();
                                    fggl fgglVar2 = cronetBidirectionalStream2.s;
                                    str3 = fgglVar2.c;
                                    int i7 = fgglVar2.a;
                                    z = fgglVar2.b;
                                    i2 = i7;
                                } else {
                                    allHeaders = Collections.EMPTY_MAP;
                                    str3 = "";
                                    z = false;
                                    i2 = 0;
                                }
                                String str4 = str3;
                                long jLongValue = cronetBidirectionalStream2.n.b.longValue();
                                long jMax = 0;
                                if (z && jLongValue == 0) {
                                    z2 = z;
                                    j = 0;
                                    length = 0;
                                } else {
                                    length = 0;
                                    for (String str5 : cronetBidirectionalStream2.d) {
                                        if (str5 != null) {
                                            length += r6.length();
                                        }
                                    }
                                    jMax = 0;
                                    long jMax2 = Math.max(0L, jLongValue - length);
                                    z2 = z;
                                    j = jMax2;
                                }
                                long jLongValue2 = cronetBidirectionalStream2.n.c.longValue();
                                if (z2 && jLongValue2 == jMax) {
                                    jA = jMax;
                                } else {
                                    jA = fgdf.a(allHeaders);
                                    jMax = Math.max(jMax, jLongValue2 - jA);
                                }
                                Duration durationOfSeconds = (cronetBidirectionalStream2.n.getRequestStart() == null || cronetBidirectionalStream2.n.getResponseStart() == null) ? Duration.ofSeconds(0L) : Duration.ofMillis(cronetBidirectionalStream2.n.getResponseStart().getTime() - cronetBidirectionalStream2.n.getRequestStart().getTime());
                                Duration durationOfSeconds2 = (cronetBidirectionalStream2.n.getRequestStart() == null || cronetBidirectionalStream2.n.getRequestEnd() == null) ? Duration.ofSeconds(0L) : Duration.ofMillis(cronetBidirectionalStream2.n.getRequestEnd().getTime() - cronetBidirectionalStream2.n.getRequestStart().getTime());
                                CronetException cronetException = cronetBidirectionalStream2.g;
                                if (cronetException instanceof fggd) {
                                    i4 = ((fggd) cronetException).b;
                                    i3 = 2;
                                } else {
                                    if (cronetException instanceof fggg) {
                                        fggg fgggVar = (fggg) cronetException;
                                        int cronetInternalErrorCode = fgggVar.getCronetInternalErrorCode();
                                        i5 = fgggVar.a;
                                        i6 = fgggVar.b;
                                        i4 = cronetInternalErrorCode;
                                        i3 = 2;
                                        CronetUrlRequestContext cronetUrlRequestContext2 = cronetBidirectionalStream2.a;
                                        cronetBidirectionalStream2.e.e(cronetUrlRequestContext2.e, new fgcz(length, j, jA, jMax, i2, durationOfSeconds, durationOfSeconds2, str4, z3, z4, fgdf.b(iA), cronetBidirectionalStream2.h, cronetBidirectionalStream2.i, cronetBidirectionalStream2.j, true, cronetBidirectionalStream2.k, Process.myUid(), i4, i5, i6, i3, cronetBidirectionalStream2.n.a, cronetUrlRequestContext2.g));
                                        cronetUrlRequestContext2.e();
                                    }
                                    i3 = cronetException != null ? 3 : 1;
                                    i4 = 0;
                                }
                                i5 = 0;
                                i6 = 0;
                                CronetUrlRequestContext cronetUrlRequestContext22 = cronetBidirectionalStream2.a;
                                cronetBidirectionalStream2.e.e(cronetUrlRequestContext22.e, new fgcz(length, j, jA, jMax, i2, durationOfSeconds, durationOfSeconds2, str4, z3, z4, fgdf.b(iA), cronetBidirectionalStream2.h, cronetBidirectionalStream2.i, cronetBidirectionalStream2.j, true, cronetBidirectionalStream2.k, Process.myUid(), i4, i5, i6, i3, cronetBidirectionalStream2.n.a, cronetUrlRequestContext22.g));
                                cronetUrlRequestContext22.e();
                            }
                        });
                        cronetBidirectionalStream.f = fgghVar;
                        fgghVar.b();
                        cronetBidirectionalStream.r = 1;
                        cronetBidirectionalStream.q = 1;
                        Trace.endSection();
                        return;
                    } catch (RuntimeException e2) {
                        e = e2;
                        cronetBidirectionalStream = cronetBidirectionalStream;
                        cronetBidirectionalStream.i(false);
                        throw e;
                    } catch (Throwable th) {
                        th = th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            }
            throw th;
        } finally {
        }
    }

    @Override // org.chromium.net.BidirectionalStream
    public final void write(ByteBuffer byteBuffer, boolean z) {
        new ffyu("CronetBidirectionalStream#write");
        try {
            synchronized (this.l) {
                fggf.a(byteBuffer);
                if (!byteBuffer.hasRemaining() && !z) {
                    throw new IllegalArgumentException("Empty buffer before end of stream.");
                }
                if (this.F) {
                    throw new IllegalArgumentException("Write after writing end of stream.");
                }
                if (!g()) {
                    this.D.add(byteBuffer);
                    if (z) {
                        this.F = true;
                    }
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
}
