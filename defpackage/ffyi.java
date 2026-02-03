package defpackage;

import android.os.StrictMode;
import internal.J.N;
import org.chromium.base.EarlyTraceEvent;
import org.chromium.base.TraceEvent;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ffyi extends ffyj {
    private final StrictMode.ThreadPolicy a;
    private final StrictMode.VmPolicy b;

    public ffyi(StrictMode.ThreadPolicy threadPolicy, StrictMode.VmPolicy vmPolicy) {
        this.a = threadPolicy;
        this.b = vmPolicy;
    }

    @Override // defpackage.ffyj, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        StrictMode.ThreadPolicy threadPolicy = this.a;
        if (threadPolicy != null) {
            StrictMode.setThreadPolicy(threadPolicy);
        }
        StrictMode.VmPolicy vmPolicy = this.b;
        if (vmPolicy != null) {
            StrictMode.setVmPolicy(vmPolicy);
        }
        long jHashCode = hashCode();
        EarlyTraceEvent.a();
        if (TraceEvent.a) {
            N.MffNhCLU(jHashCode);
        }
    }

    public ffyi(StrictMode.ThreadPolicy threadPolicy) {
        this(threadPolicy, null);
    }
}
