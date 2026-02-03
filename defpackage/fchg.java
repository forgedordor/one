package defpackage;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Level;
import java.util.logging.LogRecord;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fchg extends WeakReference {
    public static final /* synthetic */ int b = 0;
    private static final boolean c = Boolean.parseBoolean(System.getProperty("io.grpc.ManagedChannel.enableAllocationTracking", "true"));
    private static final RuntimeException d;
    public final AtomicBoolean a;
    private final ReferenceQueue e;
    private final ConcurrentMap f;
    private final String g;
    private final Reference h;

    static {
        RuntimeException runtimeException = new RuntimeException("ManagedChannel allocation site not recorded.  Set -Dio.grpc.ManagedChannel.enableAllocationTracking=true to enable it");
        runtimeException.setStackTrace(new StackTraceElement[0]);
        d = runtimeException;
    }

    public fchg(fchh fchhVar, fbqm fbqmVar, ReferenceQueue referenceQueue, ConcurrentMap concurrentMap) {
        super(fchhVar, referenceQueue);
        this.a = new AtomicBoolean();
        this.h = new SoftReference(c ? new RuntimeException("ManagedChannel allocation site") : d);
        this.g = fbqmVar.toString();
        this.e = referenceQueue;
        this.f = concurrentMap;
        concurrentMap.put(this, this);
        a(referenceQueue);
    }

    static void a(ReferenceQueue referenceQueue) {
        while (true) {
            fchg fchgVar = (fchg) referenceQueue.poll();
            if (fchgVar == null) {
                return;
            }
            RuntimeException runtimeException = (RuntimeException) fchgVar.h.get();
            fchgVar.b();
            if (!fchgVar.a.get()) {
                Level level = Level.SEVERE;
                Logger logger = fchh.b;
                if (logger.isLoggable(level)) {
                    LogRecord logRecord = new LogRecord(level, "*~*~*~ Previous channel {0} was garbage collected without being shut down! ~*~*~*" + System.getProperty("line.separator") + "    Make sure to call shutdown()/shutdownNow()");
                    logRecord.setLoggerName(logger.getName());
                    logRecord.setParameters(new Object[]{fchgVar.g});
                    logRecord.setThrown(runtimeException);
                    logger.log(logRecord);
                }
            }
        }
    }

    private final void b() {
        super.clear();
        this.f.remove(this);
        this.h.clear();
    }

    @Override // java.lang.ref.Reference
    public final void clear() {
        b();
        a(this.e);
    }
}
