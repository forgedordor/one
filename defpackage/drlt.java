package defpackage;

import j$.time.Instant;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class drlt implements Runnable {
    public final drlo a;
    final /* synthetic */ drlu b;
    private final Runnable c;
    private final String d;
    private final long e;

    public drlt(drlu drluVar, Runnable runnable, int i) {
        this.b = drluVar;
        this.c = runnable;
        String str = runnable.getClass().getSimpleName() + "@" + Long.toHexString(System.identityHashCode(runnable)) + "/" + i;
        this.d = str;
        this.e = System.nanoTime();
        drlo drloVar = new drlo(str, drluVar.getQueue().size(), Instant.now().toEpochMilli());
        this.a = drloVar;
        drluVar.b.a(drloVar);
        ((ekrd) ((ekrd) drlu.a.g()).h("com/google/android/libraries/inputmethod/concurrent/ThreadPoolExecutorWrapper$RecordingRunnable", "<init>", 123, "ThreadPoolExecutorWrapper.java")).t("Enqueue: %s", drloVar);
    }

    @Override // java.lang.Runnable
    public final void run() {
        Thread threadCurrentThread = Thread.currentThread();
        long jNanoTime = System.nanoTime();
        String name = threadCurrentThread.getName();
        drlu drluVar = this.b;
        drlr drlrVar = new drlr(name, this.d, drluVar.getQueue().size(), Instant.now().toEpochMilli(), jNanoTime - this.e);
        drluVar.b.a(drlrVar);
        drlk drlkVar = drluVar.c;
        if (drlkVar != null) {
            drlkVar.c.put(this, drlkVar.b.schedule(new drlj(this.a, drlrVar, drluVar, drlkVar.d), 60000L, TimeUnit.MILLISECONDS));
        }
        ((ekrd) ((ekrd) drlu.a.g()).h("com/google/android/libraries/inputmethod/concurrent/ThreadPoolExecutorWrapper$RecordingRunnable", "run", 141, "ThreadPoolExecutorWrapper.java")).t("Start: %s", drlrVar);
        try {
            this.c.run();
            th = null;
        } catch (Throwable th) {
            th = th;
        }
        Throwable th2 = th;
        String name2 = threadCurrentThread.getName();
        String str = this.d;
        drlu drluVar2 = this.b;
        drlp drlpVar = new drlp(name2, str, drluVar2.getQueue().size(), Instant.now().toEpochMilli(), System.nanoTime() - jNanoTime, th2);
        drluVar2.b.a(drlpVar);
        drlk drlkVar2 = drluVar2.c;
        if (drlkVar2 != null) {
            ScheduledFuture scheduledFuture = (ScheduledFuture) drlkVar2.c.remove(this);
            if (scheduledFuture == null) {
                ((ekrd) drlk.a.a(drub.a).h("com/google/android/libraries/inputmethod/concurrent/StalledTaskDetector", "onFinish", 123, "StalledTaskDetector.java")).q("Finished runnable is not registered (unregistered twice?");
            } else {
                scheduledFuture.cancel(false);
            }
        }
        ((ekrd) ((ekrd) drlu.a.g()).h("com/google/android/libraries/inputmethod/concurrent/ThreadPoolExecutorWrapper$RecordingRunnable", "run", 163, "ThreadPoolExecutorWrapper.java")).t("Finish: %s", drlpVar);
        if (th2 != null) {
            if (th2 instanceof RuntimeException) {
                throw ((RuntimeException) th2);
            }
            if (th2 instanceof Error) {
                throw ((Error) th2);
            }
        }
    }

    public final String toString() {
        ejwf ejwfVarB = ejwg.b(this);
        ejwfVarB.a(this.d);
        ejwfVarB.a(this.c);
        return ejwfVarB.toString();
    }
}
