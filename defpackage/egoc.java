package defpackage;

import android.app.Notification;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.PowerManager;
import android.os.Process;
import android.util.SparseArray;
import com.google.apps.tiktok.concurrent.InternalForegroundService;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.SettableFuture;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class egoc {
    public static final ekrg a = ekrg.c("com/google/apps/tiktok/concurrent/AndroidFutures");
    public final egod b;
    public final Context c;
    public final egop d;
    public final Map e;
    public final Map f;
    private final PowerManager g;
    private final eosc h;
    private final egoh i;
    private final eosd j;
    private final eosd k;
    private final ebbw n;
    private final ejxr l = ejxx.a(new ejxr() { // from class: egny
        @Override // defpackage.ejxr
        public final Object get() {
            egoc egocVar = this.a;
            Map map = egocVar.e;
            String strA = egocVar.a();
            ejwl.p(map.containsKey(strA), "If you are using AndroidFutures on %s process, please load and call the generated_android_futures_services macro and name those processes.", strA);
            return new Intent(egocVar.c, (Class<?>) ((fcsu) map.get(strA)).b());
        }
    });
    private final ejxr m = ejxx.a(new ejxr() { // from class: egnz
        @Override // defpackage.ejxr
        public final Object get() {
            egoc egocVar = this.a;
            fcsu fcsuVar = (fcsu) egocVar.f.get(egocVar.a());
            if (fcsuVar != null) {
                return (Class) fcsuVar.b();
            }
            ((ekrd) ((ekrd) egoc.a.j()).h("com/google/apps/tiktok/concurrent/AndroidFutures", "getForegroundService", 324, "AndroidFutures.java")).q("Calling attachForegroundService from non-main-process opens the main process which might be unintentional. Instead load and call the generated_android_futures_services macro for this process.");
            return InternalForegroundService.class;
        }
    });
    private boolean o = false;

    public egoc(Context context, PowerManager powerManager, egod egodVar, eosc eoscVar, Map map, Map map2, egop egopVar, egoh egohVar, eosd eosdVar, eosd eosdVar2, ebbw ebbwVar) {
        this.c = context;
        this.g = powerManager;
        this.h = eoscVar;
        this.d = egopVar;
        this.i = egohVar;
        this.j = eosdVar;
        this.k = eosdVar2;
        this.b = egodVar;
        this.e = map;
        this.f = map2;
        this.n = ebbwVar;
    }

    static /* synthetic */ void b(ListenableFuture listenableFuture, String str, String str2, int i, String str3, Object[] objArr) {
        try {
            eork.q(listenableFuture);
        } catch (CancellationException unused) {
        } catch (ExecutionException e) {
            ((ekrd) ((ekrd) ((ekrd) a.i()).g(e.getCause())).h(str, str2, i, null)).P(str3, objArr);
        }
    }

    public static void c(ListenableFuture listenableFuture, String str, Object... objArr) {
        d("", "", 0, listenableFuture, str, objArr);
    }

    public static void d(final String str, final String str2, final int i, final ListenableFuture listenableFuture, final String str3, final Object... objArr) {
        listenableFuture.b(eiid.k(new Runnable() { // from class: egoa
            @Override // java.lang.Runnable
            public final void run() {
                egoc.b(listenableFuture, str, str2, i, str3, objArr);
            }
        }), eoqg.a);
    }

    private final void j(ListenableFuture listenableFuture, String str) throws PackageManager.NameNotFoundException {
        if (listenableFuture.isDone()) {
            return;
        }
        try {
            final PowerManager.WakeLock wakeLockNewWakeLock = this.g.newWakeLock(1, str);
            wakeLockNewWakeLock.acquire();
            ListenableFuture listenableFutureA = eiip.a(eork.j(listenableFuture), 45L, TimeUnit.SECONDS, this.j);
            eora eoraVarH = eiid.h(new egob(str));
            eoqg eoqgVar = eoqg.a;
            eork.r(listenableFutureA, eoraVarH, eoqgVar);
            ListenableFuture listenableFutureP = eork.p(eork.j(listenableFuture), 3600L, TimeUnit.SECONDS, this.k);
            wakeLockNewWakeLock.getClass();
            listenableFutureP.b(new Runnable() { // from class: egnx
                @Override // java.lang.Runnable
                public final void run() {
                    wakeLockNewWakeLock.release();
                }
            }, eoqgVar);
        } catch (SecurityException e) {
            if (this.o) {
                return;
            }
            try {
                Context context = this.c;
                PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 4096);
                if (packageInfo.requestedPermissions != null) {
                    for (String str2 : packageInfo.requestedPermissions) {
                        if ("android.permission.WAKE_LOCK".equals(str2)) {
                            this.o = true;
                            ((ekrd) ((ekrd) ((ekrd) a.i()).g(e)).h("com/google/apps/tiktok/concurrent/AndroidFutures", "checkPermissionRequested", 168, "AndroidFutures.java")).q("Failed to acquire wakelock");
                            return;
                        }
                    }
                }
            } catch (PackageManager.NameNotFoundException e2) {
                e.addSuppressed(e2);
            }
            throw e;
        }
    }

    public final String a() {
        ebbw ebbwVar = this.n;
        String strA = ebbu.a(this.c);
        return ebbwVar.a() ? "main_process_service_key" : strA.substring(strA.lastIndexOf(":") + 1);
    }

    public final void e(final ListenableFuture listenableFuture, String str) {
        long jC;
        Intent intent = (Intent) this.l.get();
        if (listenableFuture.isDone()) {
            return;
        }
        egod egodVar = this.b;
        egodVar.e.put(listenableFuture, str);
        while (true) {
            AtomicLong atomicLong = egodVar.c;
            long j = atomicLong.get();
            int iA = egod.a(j);
            if (iA == 0) {
                int iB = egod.b(j) + 1;
                jC = iB | 4294967296L;
                if (atomicLong.compareAndSet(j, jC)) {
                    synchronized (egodVar.d) {
                        egodVar.f.put(iB, SettableFuture.create());
                    }
                    Context context = egodVar.i;
                    Intent intentPutExtra = intent.cloneFilter().putExtra("EXTRA_FUTURE_INDEX", iB);
                    UUID uuid = egodVar.h;
                    if (context.startService(intentPutExtra.putExtra("EXTRA_PROCESS_UUID", uuid.getMostSignificantBits()).putExtra("EXTRA_PROCESS_UUID2", uuid.getLeastSignificantBits()).putExtra("EXTRA_PROCESS_PID", Process.myPid())) == null) {
                        ((ekrd) ((ekrd) egod.a.h()).h("com/google/apps/tiktok/concurrent/AndroidFuturesServiceCounter", "increment", 135, "AndroidFuturesServiceCounter.java")).q("startService() returned null");
                    }
                }
            } else {
                jC = egod.c(iA + 1, j);
                if (atomicLong.compareAndSet(j, jC)) {
                    break;
                }
            }
        }
        final int iB2 = egod.b(jC);
        listenableFuture.b(new Runnable() { // from class: egnu
            @Override // java.lang.Runnable
            public final void run() {
                SettableFuture settableFuture;
                egod egodVar2 = this.a.b;
                egodVar2.e.remove(listenableFuture);
                while (true) {
                    int i = iB2;
                    AtomicLong atomicLong2 = egodVar2.c;
                    long j2 = atomicLong2.get();
                    int iA2 = egod.a(j2);
                    int iB3 = egod.b(j2);
                    if (iB3 != i) {
                        synchronized (egodVar2.d) {
                            egodVar2.g.remove(i);
                        }
                        return;
                    }
                    if (iA2 == 1) {
                        if (atomicLong2.compareAndSet(j2, iB3)) {
                            synchronized (egodVar2.d) {
                                SparseArray sparseArray = egodVar2.g;
                                settableFuture = (SettableFuture) sparseArray.get(iB3);
                                if (settableFuture == null) {
                                    SparseArray sparseArray2 = egodVar2.f;
                                    settableFuture = (SettableFuture) sparseArray2.get(iB3);
                                    settableFuture.getClass();
                                    sparseArray2.put(iB3, egod.b);
                                } else {
                                    sparseArray.remove(iB3);
                                }
                            }
                            settableFuture.set(null);
                            return;
                        }
                    } else {
                        if (iA2 <= 0) {
                            throw new IllegalStateException(a.g(iA2, "Can't decrement at zero or less refcount: "));
                        }
                        if (atomicLong2.compareAndSet(j2, egod.c(iA2 - 1, j2))) {
                            return;
                        }
                    }
                }
            }
        }, eoqg.a);
    }

    public final void f(final ListenableFuture listenableFuture, final long j, final TimeUnit timeUnit) {
        final eosb eosbVarSchedule = this.j.schedule(eiid.k(new Runnable() { // from class: egnv
            @Override // java.lang.Runnable
            public final void run() {
                ListenableFuture listenableFuture2 = listenableFuture;
                if (listenableFuture2.isDone()) {
                    return;
                }
                ((ekrd) ((ekrd) ((ekrd) egoc.a.i()).g(eiip.c())).h("com/google/apps/tiktok/concurrent/AndroidFutures", "crashApplicationOnFailure", 361, "AndroidFutures.java")).I("Timeout exceeded waiting on crashApplicationOnFailure future. Waited %s %s. Allowing future %s to continue anyway.", Long.valueOf(j), timeUnit, listenableFuture2);
            }
        }), j, timeUnit);
        listenableFuture.b(eiid.k(new Runnable() { // from class: egnw
            @Override // java.lang.Runnable
            public final void run() {
                eosbVarSchedule.cancel(true);
                ListenableFuture listenableFuture2 = listenableFuture;
                if (listenableFuture2.isCancelled()) {
                    return;
                }
                try {
                    eork.q(listenableFuture2);
                } catch (ExecutionException e) {
                    eiip.k(e.getCause());
                }
            }
        }), this.h);
    }

    public final void g(ListenableFuture listenableFuture) throws PackageManager.NameNotFoundException {
        String strD = eiiy.d();
        e(listenableFuture, strD);
        j(listenableFuture, strD);
    }

    public final void h(ListenableFuture listenableFuture) {
        j(listenableFuture, eiiy.d());
    }

    public final void i(ListenableFuture listenableFuture, Notification notification) {
        this.d.a((Class) this.m.get()).f(listenableFuture, notification, this.i.a());
    }
}
