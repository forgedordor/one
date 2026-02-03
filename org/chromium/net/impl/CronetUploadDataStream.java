package org.chromium.net.impl;

import android.os.Trace;
import defpackage.a;
import defpackage.ffyc;
import defpackage.ffyu;
import defpackage.fgdh;
import defpackage.fgdi;
import defpackage.fgdj;
import defpackage.fggs;
import internal.J.N;
import java.nio.ByteBuffer;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import org.chromium.net.UploadDataProvider;
import org.chromium.net.UploadDataSink;
import org.chromium.net.impl.CronetUploadDataStream;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class CronetUploadDataStream extends UploadDataSink {
    public static final String a = "CronetUploadDataStream";
    public final fggs b;
    public final CronetUrlRequest c;
    public long d;
    public long e;
    public ByteBuffer g;
    public long i;
    private final Executor k;
    private long l;
    private boolean n;
    public final AtomicInteger f = new AtomicInteger();
    private final Runnable m = new fgdh(this);
    public final Object h = new Object();
    public int j = 3;

    public CronetUploadDataStream(UploadDataProvider uploadDataProvider, Executor executor, CronetUrlRequest cronetUrlRequest) {
        this.k = executor;
        this.b = new fggs(uploadDataProvider);
        this.c = cronetUrlRequest;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void e(int i) {
        int i2 = this.j;
        if (i2 != i) {
            throw new IllegalStateException(a.s(i2, i, "Expected ", ", but was "));
        }
    }

    private final void f() {
        synchronized (this.h) {
            if (this.j == 0) {
                this.n = true;
                return;
            }
            long j = this.i;
            if (j == 0) {
                return;
            }
            N.MMW1G0N1(j);
            this.i = 0L;
            c(new fgdj(this), "destroyAdapter");
        }
    }

    private final void g() {
        synchronized (this.h) {
            if (this.j == 0) {
                throw new IllegalStateException("Method should not be called when read has not completed.");
            }
            if (this.n) {
                f();
            }
        }
    }

    public final void a() {
        this.c.a();
    }

    public final void b(Throwable th) {
        int i;
        synchronized (this.h) {
            i = this.j;
            if (i == 3) {
                throw new IllegalStateException("There is no read or rewind or length check in progress.", th);
            }
            this.j = 3;
            this.g = null;
            g();
        }
        if (i == 2) {
            try {
                this.b.close();
            } catch (Exception e) {
                ffyc.d(a, "Failure closing data provider", e);
            }
        }
        this.c.f(th);
    }

    final void c(final Runnable runnable, final String str) {
        new ffyu("CronetUploadDataStream#postTaskToExecutor ".concat(str));
        try {
            this.k.execute(new Runnable() { // from class: fgdg
                @Override // java.lang.Runnable
                public final void run() {
                    String str2 = CronetUploadDataStream.a;
                    new ffyu("CronetUploadDataStream#postTaskToExecutor " + str + " running callback");
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
                this.c.f(th);
            } catch (Throwable th2) {
                try {
                    Trace.endSection();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        }
        Trace.endSection();
    }

    @Override // org.chromium.net.UploadDataSink
    public final void onReadError(Exception exc) {
        new ffyu("CronetUploadDataStream#onReadError");
        try {
            synchronized (this.h) {
                e(0);
                b(exc);
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

    /* JADX WARN: Removed duplicated region for block: B:24:0x004f A[Catch: all -> 0x009e, TryCatch #2 {, blocks: (B:6:0x000b, B:10:0x001f, B:13:0x0026, B:14:0x002d, B:15:0x002e, B:18:0x0038, B:19:0x0042, B:22:0x0045, B:24:0x004f, B:27:0x0056, B:28:0x0074, B:29:0x0075, B:31:0x008c, B:33:0x008e, B:34:0x0091, B:37:0x0096, B:38:0x009d), top: B:51:0x000b, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x008c A[Catch: all -> 0x009e, DONT_GENERATE, TryCatch #2 {, blocks: (B:6:0x000b, B:10:0x001f, B:13:0x0026, B:14:0x002d, B:15:0x002e, B:18:0x0038, B:19:0x0042, B:22:0x0045, B:24:0x004f, B:27:0x0056, B:28:0x0074, B:29:0x0075, B:31:0x008c, B:33:0x008e, B:34:0x0091, B:37:0x0096, B:38:0x009d), top: B:51:0x000b, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x008e A[Catch: all -> 0x009e, TryCatch #2 {, blocks: (B:6:0x000b, B:10:0x001f, B:13:0x0026, B:14:0x002d, B:15:0x002e, B:18:0x0038, B:19:0x0042, B:22:0x0045, B:24:0x004f, B:27:0x0056, B:28:0x0074, B:29:0x0075, B:31:0x008c, B:33:0x008e, B:34:0x0091, B:37:0x0096, B:38:0x009d), top: B:51:0x000b, outer: #0 }] */
    @Override // org.chromium.net.UploadDataSink
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onReadSucceeded(boolean r11) {
        /*
            r10 = this;
            ffyu r0 = new ffyu
            java.lang.String r1 = "CronetUploadDataStream#onReadSucceeded"
            r0.<init>(r1)
            java.lang.Object r0 = r10.h     // Catch: java.lang.Throwable -> La1
            monitor-enter(r0)     // Catch: java.lang.Throwable -> La1
            r1 = 0
            r10.e(r1)     // Catch: java.lang.Throwable -> L9e
            long r2 = r10.l     // Catch: java.lang.Throwable -> L9e
            java.nio.ByteBuffer r4 = r10.g     // Catch: java.lang.Throwable -> L9e
            int r4 = r4.limit()     // Catch: java.lang.Throwable -> L9e
            long r4 = (long) r4     // Catch: java.lang.Throwable -> L9e
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 != 0) goto L96
            r2 = 0
            if (r11 == 0) goto L2e
            long r4 = r10.d     // Catch: java.lang.Throwable -> L9e
            int r4 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r4 >= 0) goto L26
            goto L2e
        L26:
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L9e
            java.lang.String r1 = "Non-chunked upload can't have last chunk"
            r11.<init>(r1)     // Catch: java.lang.Throwable -> L9e
            throw r11     // Catch: java.lang.Throwable -> L9e
        L2e:
            java.nio.ByteBuffer r4 = r10.g     // Catch: java.lang.Throwable -> L9e
            int r4 = r4.position()     // Catch: java.lang.Throwable -> L9e
            if (r4 != 0) goto L45
            if (r11 != 0) goto L44
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L9e
            java.lang.String r1 = "Bytes read can't be zero except for last chunk!"
            r11.<init>(r1)     // Catch: java.lang.Throwable -> L9e
            r10.b(r11)     // Catch: java.lang.Throwable -> L9e
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L9e
            goto L92
        L44:
            r4 = r1
        L45:
            long r5 = r10.e     // Catch: java.lang.Throwable -> L9e
            long r7 = (long) r4     // Catch: java.lang.Throwable -> L9e
            long r5 = r5 - r7
            r10.e = r5     // Catch: java.lang.Throwable -> L9e
            int r7 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r7 >= 0) goto L75
            long r7 = r10.d     // Catch: java.lang.Throwable -> L9e
            int r9 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r9 >= 0) goto L56
            goto L75
        L56:
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L9e
            java.lang.String r2 = "Read upload data length %d exceeds expected length %d"
            long r7 = r7 - r5
            java.lang.Long r3 = java.lang.Long.valueOf(r7)     // Catch: java.lang.Throwable -> L9e
            long r4 = r10.d     // Catch: java.lang.Throwable -> L9e
            java.lang.Long r4 = java.lang.Long.valueOf(r4)     // Catch: java.lang.Throwable -> L9e
            r5 = 2
            java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch: java.lang.Throwable -> L9e
            r5[r1] = r3     // Catch: java.lang.Throwable -> L9e
            r1 = 1
            r5[r1] = r4     // Catch: java.lang.Throwable -> L9e
            java.lang.String r1 = java.lang.String.format(r2, r5)     // Catch: java.lang.Throwable -> L9e
            r11.<init>(r1)     // Catch: java.lang.Throwable -> L9e
            throw r11     // Catch: java.lang.Throwable -> L9e
        L75:
            java.nio.ByteBuffer r5 = r10.g     // Catch: java.lang.Throwable -> L9e
            java.nio.Buffer r1 = r5.position(r1)     // Catch: java.lang.Throwable -> L9e
            java.nio.ByteBuffer r1 = (java.nio.ByteBuffer) r1     // Catch: java.lang.Throwable -> L9e
            r1 = 0
            r10.g = r1     // Catch: java.lang.Throwable -> L9e
            r1 = 3
            r10.j = r1     // Catch: java.lang.Throwable -> L9e
            r10.g()     // Catch: java.lang.Throwable -> L9e
            long r5 = r10.i     // Catch: java.lang.Throwable -> L9e
            int r1 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r1 != 0) goto L8e
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L9e
            goto L92
        L8e:
            internal.J.N.MpWH3VIr(r5, r10, r4, r11)     // Catch: java.lang.Throwable -> L9e
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L9e
        L92:
            android.os.Trace.endSection()
            return
        L96:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L9e
            java.lang.String r1 = "ByteBuffer limit changed"
            r11.<init>(r1)     // Catch: java.lang.Throwable -> L9e
            throw r11     // Catch: java.lang.Throwable -> L9e
        L9e:
            r11 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L9e
            throw r11     // Catch: java.lang.Throwable -> La1
        La1:
            r11 = move-exception
            android.os.Trace.endSection()     // Catch: java.lang.Throwable -> La6
            goto Laa
        La6:
            r0 = move-exception
            r11.addSuppressed(r0)
        Laa:
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: org.chromium.net.impl.CronetUploadDataStream.onReadSucceeded(boolean):void");
    }

    @Override // org.chromium.net.UploadDataSink
    public final void onRewindError(Exception exc) {
        new ffyu("CronetUploadDataStream#onRewindError");
        try {
            synchronized (this.h) {
                e(1);
                b(exc);
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

    @Override // org.chromium.net.UploadDataSink
    public final void onRewindSucceeded() {
        new ffyu("CronetUploadDataStream#onRewindSucceeded");
        try {
            synchronized (this.h) {
                e(1);
                this.j = 3;
                this.e = this.d;
                long j = this.i;
                if (j != 0) {
                    N.MFpRjSMv(j, this);
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

    final void onUploadDataStreamDestroyed() {
        f();
    }

    final void readData(ByteBuffer byteBuffer) {
        this.g = byteBuffer;
        this.l = byteBuffer.limit();
        c(this.m, "readData");
    }

    final void rewind() {
        c(new fgdi(this), "rewind");
    }
}
