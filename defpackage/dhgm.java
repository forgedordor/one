package defpackage;

import java.util.PriorityQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dhgm {
    public static final /* synthetic */ int f = 0;
    private static final long g = TimeUnit.MINUTES.toMillis(1);
    public final dfht a;
    public final dhip c;
    public Thread d;
    private final eosd h;
    public final PriorityQueue b = new PriorityQueue();
    public final AtomicReference e = new AtomicReference();

    public dhgm(dhip dhipVar, dfht dfhtVar, eosd eosdVar) {
        this.c = dhipVar.b("ImsRefreshableManager");
        this.a = dfhtVar;
        this.h = eosdVar;
    }

    private final void c() {
        if (craf.d) {
            AtomicReference atomicReference = this.e;
            if (atomicReference.get() == null) {
                dhja.d(this.c, "Scheduling refresh task with ScheduledExecutor in: %ds", 900L);
                atomicReference.set(this.h.schedule(new Runnable() { // from class: dhgh
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.a.a();
                    }
                }, 900L, TimeUnit.SECONDS));
                return;
            }
            return;
        }
        if (this.d == null) {
            dhip dhipVar = this.c;
            dhja.d(dhipVar, "Scheduling refresh task with AlarmTimer in: %ds", 900L);
            Thread threadB = dhlc.a().b("ims_refresh", new Runnable() { // from class: dhgi
                @Override // java.lang.Runnable
                public final void run() {
                    this.a.a();
                }
            }, g);
            this.d = threadB;
            if (threadB != null) {
                this.a.d(threadB, 900L);
            } else {
                dhja.r(dhipVar, "Unable to schedule a refresh task with AlarmTimer", new Object[0]);
            }
        }
    }

    public final void a() {
        long jCurrentTimeMillis = System.currentTimeMillis() + 900000;
        PriorityQueue priorityQueue = this.b;
        synchronized (priorityQueue) {
            this.d = null;
            this.e.set(null);
            if (priorityQueue.isEmpty()) {
                return;
            }
            for (dhgl dhglVar = (dhgl) priorityQueue.peek(); dhglVar != null && dhglVar.a < jCurrentTimeMillis; dhglVar = (dhgl) priorityQueue.peek()) {
                ((dhgl) priorityQueue.remove()).b.q(new dhgk(this));
                if (priorityQueue.isEmpty()) {
                    break;
                }
            }
            if (!priorityQueue.isEmpty()) {
                c();
            }
        }
    }

    public final void b(dhgg dhggVar) {
        dhip dhipVar = this.c;
        dhja.d(dhipVar, "adding refreshable: %s", dhggVar);
        if (dhggVar.a() <= 900) {
            dhja.r(dhipVar, "Expires value below configured interval. Expected at least: %d was %d", 900L, Integer.valueOf(dhggVar.a()));
            return;
        }
        dhgl dhglVar = new dhgl(dhggVar);
        PriorityQueue priorityQueue = this.b;
        synchronized (priorityQueue) {
            if (priorityQueue.add(dhglVar)) {
                c();
            }
        }
    }
}
