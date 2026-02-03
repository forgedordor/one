package defpackage;

import android.os.SystemClock;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class drvx {
    public final drwc a;
    private final String b;

    public drvx(drvw drvwVar, Class cls, Executor executor) {
        Class<?> cls2 = drvwVar.getClass();
        String strB = drxu.b(drxu.a(cls) + "->" + drxu.a(cls2));
        drwc drwcVar = (drwc) drwc.a.get(executor);
        drwcVar = drwcVar == null ? new drwc(executor, false) : drwcVar;
        this.b = strB;
        this.a = drwcVar;
    }

    final void a(Class cls, drvq drvqVar, drvw drvwVar) {
        String str = this.b;
        drxt drxtVarB = drvv.b(String.valueOf(str).concat(".enqueue"));
        try {
            ArrayDeque arrayDeque = this.a.e;
            synchronized (arrayDeque) {
                drvqVar.a();
                arrayDeque.offerLast(new drwb(str, cls, drvqVar, drvwVar));
            }
            drxtVarB.close();
        } catch (Throwable th) {
            try {
                drxtVarB.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    final void b() {
        final drwc drwcVar = this.a;
        drwcVar.b.execute(new Runnable() { // from class: drwa
            @Override // java.lang.Runnable
            public final void run() {
                AtomicBoolean atomicBoolean;
                drwb drwbVar;
                drwc drwcVar2 = drwcVar;
                AtomicBoolean atomicBoolean2 = drwcVar2.d;
                if (atomicBoolean2 != null && !atomicBoolean2.compareAndSet(false, true)) {
                    return;
                }
                try {
                    long jElapsedRealtime = SystemClock.elapsedRealtime();
                    boolean zD = drle.d(drwcVar2.b);
                    ArrayList arrayList = null;
                    while (true) {
                        ArrayDeque arrayDeque = drwcVar2.e;
                        synchronized (arrayDeque) {
                            drwbVar = (drwb) arrayDeque.pollFirst();
                        }
                        if (drwbVar == null) {
                            long jElapsedRealtime2 = SystemClock.elapsedRealtime() - jElapsedRealtime;
                            if (arrayList != null && jElapsedRealtime2 > 20) {
                                ((ekrd) ((ekrd) drvv.a.j()).h("com/google/android/libraries/inputmethod/notificationcenter/NotificationCenter$NotificationQueue", "notifyPendingNotificationsOnExecutor", 877, "NotificationCenter.java")).C("Heavy notify work detected on UI thread: %s takes %sms", arrayList, jElapsedRealtime2);
                            }
                            if (atomicBoolean != null) {
                                return;
                            } else {
                                return;
                            }
                        }
                        drxt drxtVarB = drvv.b(String.valueOf(drwbVar.a).concat(".notifyOnExecutor"));
                        try {
                            try {
                                drvq drvqVar = drwbVar.c;
                                if (drvqVar == drvv.b) {
                                    drwbVar.d.c(drwbVar.b);
                                } else {
                                    drwbVar.d.d(drvqVar);
                                }
                            } catch (Exception e) {
                                if (drxl.a) {
                                    throw new AssertionError(a.v(drwbVar.a, "Failed to notify "), e);
                                }
                                ((ekrd) ((ekrd) ((ekrd) drvv.a.i()).g(e)).h("com/google/android/libraries/inputmethod/notificationcenter/NotificationCenter$NotificationQueue", "notifyPendingNotificationsOnExecutor", 865, "NotificationCenter.java")).t("Failed to notify %s", drwbVar.a);
                            }
                            if (arrayList == null && zD) {
                                arrayList = new ArrayList();
                            }
                            if (arrayList != null) {
                                arrayList.add(drwbVar.a);
                            }
                            drxtVarB.close();
                        } finally {
                        }
                    }
                } finally {
                    atomicBoolean = drwcVar2.d;
                    if (atomicBoolean != null) {
                        atomicBoolean.set(false);
                    }
                }
            }
        });
    }
}
