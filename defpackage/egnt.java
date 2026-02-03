package defpackage;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.Process;
import android.util.SparseArray;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.SettableFuture;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: PG */
/* loaded from: classes5.dex */
public class egnt extends Service {
    private ListenableFuture a = eork.i(null);
    private int b = -1;

    /* compiled from: PG */
    public interface a {
        egod eh();
    }

    @Override // android.app.Service
    protected final void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        Iterator it = ((a) eygm.a(getApplicationContext(), a.class)).eh().e.entrySet().iterator();
        while (it.hasNext()) {
            printWriter.println((String) ((Map.Entry) it.next()).getValue());
        }
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public final void onDestroy() {
        long j;
        if (this.a.isDone()) {
            return;
        }
        egod egodVarEh = ((a) eygm.a(getApplicationContext(), a.class)).eh();
        int i = this.b;
        AtomicLong atomicLong = egodVarEh.c;
        int iB = egod.b(atomicLong.get());
        if (i == iB) {
            do {
                j = atomicLong.get();
                if (egod.b(j) != iB) {
                    return;
                }
            } while (!atomicLong.compareAndSet(j, egod.c(0, r1 + 1)));
        }
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, final int i2) {
        ListenableFuture listenableFutureI;
        if ((i & 2) == 0 && intent != null) {
            egod egodVarEh = ((a) eygm.a(getApplicationContext(), a.class)).eh();
            ejwl.f(intent.hasExtra("EXTRA_FUTURE_INDEX"), "Intent missing extra %s", intent);
            ejwl.f(intent.hasExtra("EXTRA_PROCESS_UUID"), "Intent missing extra %s", intent);
            ejwl.f(intent.hasExtra("EXTRA_PROCESS_UUID2"), "Intent missing extra %s", intent);
            UUID uuid = egodVarEh.h;
            long longExtra = intent.getLongExtra("EXTRA_PROCESS_UUID", -1L);
            long longExtra2 = intent.getLongExtra("EXTRA_PROCESS_UUID2", -1L);
            if (uuid.getMostSignificantBits() == longExtra && uuid.getLeastSignificantBits() == longExtra2) {
                int intExtra = intent.getIntExtra("EXTRA_FUTURE_INDEX", -1);
                synchronized (egodVarEh.d) {
                    SparseArray sparseArray = egodVarEh.f;
                    listenableFutureI = (SettableFuture) sparseArray.get(intExtra);
                    listenableFutureI.getClass();
                    if (listenableFutureI != egod.b) {
                        egodVarEh.g.put(intExtra, listenableFutureI);
                    }
                    sparseArray.remove(intExtra);
                }
            } else {
                ((ekrd) ((ekrd) egod.a.h()).h("com/google/apps/tiktok/concurrent/AndroidFuturesServiceCounter", "onStartCommand", 224, "AndroidFuturesServiceCounter.java")).u("Stopping service immediately, intent delivered from previous process. Old PID was %d but current PID is %d", intent.getIntExtra("EXTRA_PROCESS_PID", -1), Process.myPid());
                listenableFutureI = eork.i(null);
            }
            this.a = listenableFutureI;
            this.b = intent.getIntExtra("EXTRA_FUTURE_INDEX", -1);
        }
        this.a.b(new Runnable() { // from class: egns
            @Override // java.lang.Runnable
            public final void run() {
                this.a.stopSelf(i2);
            }
        }, eoqg.a);
        return 2;
    }
}
