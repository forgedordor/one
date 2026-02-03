package defpackage;

import android.os.AsyncTask;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ThreadPoolExecutor;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class cqda {
    static {
        long j = cqdd.e;
    }

    public static Executor a() {
        return cqaz.n() ? eoqg.a : AsyncTask.THREAD_POOL_EXECUTOR;
    }

    public static void b(cqdd cqddVar, RejectedExecutionException rejectedExecutionException) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm:ss.SSS aa", Locale.US);
        StringBuilder sb = new StringBuilder();
        Map map = cqdd.f;
        synchronized (map) {
            String str = map.containsKey(cqddVar) ? simpleDateFormat.format(new Date(((Long) map.get(cqddVar)).longValue())) : "unknown time";
            ekrw ekrwVarI = cqdc.a.i();
            ekrwVarI.X(eksq.a, "Bugle");
            ((ekrd) ((ekrd) ((ekrd) ekrwVarI).g(rejectedExecutionException)).h("com/google/android/apps/messaging/shared/util/common/SafeAsyncExecutable", "dumpCrashInfo", 85, "SafeAsyncExecutable.java")).D("Failed to run %s, enqueued for execution at %s", cqddVar, str);
            sb.append("\nTHREAD_POOL_EXECUTOR executing list and enqueuing times: ");
            sb.append(map.size());
            sb.append(" tasks(s) or runnable(s)");
            for (Object obj : map.keySet()) {
                cqca.r(sb, String.format("\n %s, %s", obj, simpleDateFormat.format(new Date(((Long) map.get(obj)).longValue()))), "\nTHREAD_POOL_EXECUTOR executing list (continued):");
            }
        }
        cqca.i("Bugle", sb.toString());
        sb.setLength(0);
        BlockingQueue<Runnable> queue = ((ThreadPoolExecutor) AsyncTask.THREAD_POOL_EXECUTOR).getQueue();
        synchronized (queue) {
            sb.append("THREAD_POOL_EXECUTOR queued list: ");
            sb.append(queue.size());
            sb.append(" runnable(s)");
            Iterator it = queue.iterator();
            while (it.hasNext()) {
                cqca.r(sb, "\n " + String.valueOf((Runnable) it.next()), "\nTHREAD_POOL_EXECUTOR queued list (continued):");
            }
        }
        cqca.i("Bugle", sb.toString());
    }
}
