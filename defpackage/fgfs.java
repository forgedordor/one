package defpackage;

import android.os.Process;
import android.os.Trace;
import android.util.Log;
import j$.time.Duration;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fgfs {
    final fggt a;
    final Executor b;
    final Executor c;
    final /* synthetic */ fgfw d;

    public fgfs(fgfw fgfwVar, UrlRequest.Callback callback, Executor executor) {
        this.d = fgfwVar;
        this.a = new fggt(callback);
        if (fgfwVar.h) {
            this.b = executor;
            this.c = null;
        } else {
            this.b = new fgfz(executor);
            this.c = executor;
        }
    }

    final void a(final fgfx fgfxVar, String str) {
        try {
            final fgfw fgfwVar = this.d;
            b(new Runnable() { // from class: fgfa
                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        fgfxVar.a();
                    } catch (Throwable th) {
                        final fgfw fgfwVar2 = fgfwVar;
                        fgfwVar2.d(new Runnable() { // from class: fgfc
                            @Override // java.lang.Runnable
                            public final void run() {
                                fgfwVar2.x++;
                            }
                        }, "enterUserErrorState");
                        fgfwVar2.b(new fgbz("Exception received from UrlRequest.Callback", th));
                    }
                }
            }, str);
        } catch (RejectedExecutionException e) {
            this.d.b(new fgco("Exception posting task to executor", e));
        }
    }

    final void b(final Runnable runnable, final String str) {
        new ffyu("Cronet JavaUrlRequest.AsyncUrlRequestCallback#executeOnUserExecutor ".concat(str));
        try {
            this.b.execute(new Runnable() { // from class: fgfo
                @Override // java.lang.Runnable
                public final void run() {
                    new ffyu("Cronet JavaUrlRequest.AsyncUrlRequestCallback#executeOnUserExecutor " + str + " running callback");
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

    public final void c() {
        this.d.d(new Runnable() { // from class: fgfq
            @Override // java.lang.Runnable
            public final void run() throws NumberFormatException {
                Map<String, List<String>> allHeaders;
                String str;
                boolean z;
                int i;
                long length;
                long j;
                long length2;
                long j2;
                long j3;
                long j4;
                long j5;
                long j6;
                long j7;
                int i2;
                fgfs fgfsVar = this.a;
                try {
                    fgfw fgfwVar = fgfsVar.d;
                    fgdb fgdbVar = fgfwVar.u;
                    long j8 = fgfwVar.t;
                    fggl fgglVar = fgfwVar.o;
                    if (fgglVar != null) {
                        allHeaders = fgglVar.getAllHeaders();
                        fggl fgglVar2 = fgfwVar.o;
                        str = fgglVar2.c;
                        int i3 = fgglVar2.a;
                        z = fgglVar2.b;
                        i = i3;
                    } else {
                        allHeaders = Collections.EMPTY_MAP;
                        str = "";
                        z = false;
                        i = 0;
                    }
                    String str2 = str;
                    if (z) {
                        j = 0;
                        length = 0;
                    } else {
                        length = 0;
                        for (Map.Entry entry : fgfwVar.e.entrySet()) {
                            if (((String) entry.getKey()) != null) {
                                length += r17.length();
                            }
                            if (((String) entry.getValue()) != null) {
                                length += r10.length();
                            }
                        }
                        j = -1;
                    }
                    if (z) {
                        j3 = j;
                        j4 = length;
                        j5 = 0;
                        j6 = 0;
                        j2 = 0;
                    } else {
                        if (allHeaders == null) {
                            length2 = 0;
                        } else {
                            length2 = 0;
                            for (Map.Entry<String, List<String>> entry2 : allHeaders.entrySet()) {
                                if (entry2.getKey() != null) {
                                    length2 += r18.length();
                                }
                                if (entry2.getValue() != null) {
                                    Iterator<String> it = entry2.getValue().iterator();
                                    while (it.hasNext()) {
                                        if (it.next() != null) {
                                            length2 += r12.length();
                                        }
                                    }
                                }
                            }
                        }
                        j2 = 0;
                        if (allHeaders.containsKey("Content-Length")) {
                            try {
                                j7 = Long.parseLong(allHeaders.get("Content-Length").get(0));
                            } catch (NumberFormatException unused) {
                                j7 = 0;
                            }
                            j3 = j;
                            j4 = length;
                            j5 = length2;
                            j6 = j7;
                        } else {
                            j3 = j;
                            j4 = length;
                            j5 = length2;
                            j6 = -1;
                        }
                    }
                    Duration durationOfSeconds = Duration.ofSeconds(j2);
                    Duration durationOfSeconds2 = Duration.ofSeconds(j2);
                    fgfw fgfwVar2 = fgfsVar.d;
                    int i4 = fgfwVar2.g.get();
                    if (i4 == 6) {
                        i2 = 2;
                    } else if (i4 == 7) {
                        i2 = 1;
                    } else {
                        if (i4 != 8) {
                            throw new IllegalStateException(a.e(i4, "Internal Cronet error: attempted to report metrics but current state (", ") is not a done state!"));
                        }
                        i2 = 3;
                    }
                    int i5 = i2;
                    int i6 = fgfwVar2.x;
                    int i7 = fgfwVar2.w;
                    fgft fgftVar = fgfwVar2.r;
                    fgdbVar.e(j8, new fgcz(j4, j3, j5, j6, i, durationOfSeconds, durationOfSeconds2, str2, false, false, i5, i6, i7, fgftVar != null ? fgftVar.g : 0, false, fgfwVar2.y, Process.myUid(), 0, 0, 0, 1, false, fgcy.CRONET_SOURCE_FALLBACK));
                } catch (RuntimeException e) {
                    Log.i(fgfw.a, "Error while trying to log CronetTrafficInfo: ", e);
                }
            }
        }, "maybeReportMetrics");
    }

    final void d() {
        a(new fgfx() { // from class: fgfm
            @Override // defpackage.fgfx
            public final void a() {
                fgfs fgfsVar = this.a;
                fgfw fgfwVar = fgfsVar.d;
                if (fgfwVar.g.compareAndSet(1, 4)) {
                    fgfsVar.a.onResponseStarted(fgfwVar, fgfwVar.o);
                }
            }
        }, "onResponseStarted");
    }
}
