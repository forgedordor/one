package defpackage;

import android.os.AsyncTask;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ffyy extends ThreadPoolExecutor implements AutoCloseable {
    private static final int a;
    private static final int b;
    private static final int c;
    private static final ThreadFactory d;
    private static final BlockingQueue e;

    static {
        int iAvailableProcessors = Runtime.getRuntime().availableProcessors();
        a = iAvailableProcessors;
        b = Math.max(2, Math.min(iAvailableProcessors - 1, 4));
        c = iAvailableProcessors + iAvailableProcessors + 1;
        d = new ffyx();
        e = new ArrayBlockingQueue(128);
    }

    public ffyy() {
        super(b, c, 30L, TimeUnit.SECONDS, (BlockingQueue<Runnable>) e, d);
        allowCoreThreadTimeOut(true);
    }

    @Override // java.lang.AutoCloseable
    public final /* synthetic */ void close() throws InterruptedException {
        if (this == ForkJoinPool.commonPool() || isTerminated()) {
            return;
        }
        shutdown();
        boolean zAwaitTermination = false;
        boolean z = false;
        while (!zAwaitTermination) {
            try {
                zAwaitTermination = awaitTermination(1L, TimeUnit.DAYS);
            } catch (InterruptedException unused) {
                if (!z) {
                    shutdownNow();
                }
                z = true;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
    }

    @Override // java.util.concurrent.ThreadPoolExecutor, java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        try {
            super.execute(runnable);
        } catch (RejectedExecutionException e2) {
            HashMap map = new HashMap();
            for (Runnable runnable2 : (Runnable[]) getQueue().toArray(new Runnable[0])) {
                Class<?> cls = runnable2.getClass();
                if (cls == ffyw.class) {
                    throw null;
                }
                if (cls.getEnclosingClass() == AsyncTask.class) {
                    cls = AsyncTask.class;
                }
                String name = cls.getName();
                map.put(name, Integer.valueOf((map.containsKey(name) ? ((Integer) map.get(name)).intValue() : 0) + 1));
            }
            StringBuilder sb = new StringBuilder();
            for (Map.Entry entry : map.entrySet()) {
                if (((Integer) entry.getValue()).intValue() > 32) {
                    sb.append((String) entry.getKey());
                    sb.append(' ');
                }
            }
            throw new RejectedExecutionException("Prominent classes in AsyncTask: ".concat(sb.length() == 0 ? "NO CLASSES FOUND" : sb.toString()), e2);
        }
    }
}
