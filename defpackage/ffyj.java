package defpackage;

import android.os.StrictMode;
import java.io.Closeable;
import org.chromium.base.TraceEvent;

/* compiled from: PG */
/* loaded from: classes6.dex */
public class ffyj implements Closeable {
    public static ffyj a() {
        TraceEvent traceEventA = TraceEvent.a("StrictModeContext.allowDiskReads");
        try {
            ffyi ffyiVar = new ffyi(StrictMode.allowThreadDiskReads());
            if (traceEventA != null) {
                traceEventA.close();
            }
            return ffyiVar;
        } catch (Throwable th) {
            if (traceEventA != null) {
                try {
                    traceEventA.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public static ffyj b() {
        TraceEvent traceEventA = TraceEvent.a("StrictModeContext.allowDiskWrites");
        try {
            ffyi ffyiVar = new ffyi(StrictMode.allowThreadDiskWrites());
            if (traceEventA != null) {
                traceEventA.close();
            }
            return ffyiVar;
        } catch (Throwable th) {
            if (traceEventA != null) {
                try {
                    traceEventA.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }
}
