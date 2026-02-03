package defpackage;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.PowerManager;
import android.os.SystemClock;
import android.os.WorkSource;
import android.text.TextUtils;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class deel {
    public final Object a;
    public int b;
    public boolean c;
    ddms d;
    public final String e;
    public final Map f;
    public AtomicInteger g;
    private final PowerManager.WakeLock l;
    private Future m;
    private long n;
    private final Set o;
    private int p;
    private WorkSource q;
    private final ScheduledExecutorService r;
    private static final long i = TimeUnit.DAYS.toMillis(366);
    private static volatile ScheduledExecutorService j = null;
    private static final Object k = new Object();
    public static volatile deei h = new deei();

    public deel(Context context) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        String packageName = context.getPackageName();
        this.a = new Object();
        this.b = 0;
        this.o = new HashSet();
        this.c = true;
        this.f = new HashMap();
        this.g = new AtomicInteger(0);
        dclh.n(context, "WakeLock: context must not be null");
        dclh.l("wake:com.google.firebase.iid.WakeLockHolder", "WakeLock: wakeLockName must not be empty");
        context.getApplicationContext();
        WorkSource workSource = null;
        this.d = null;
        if ("com.google.android.gms".equals(context.getPackageName())) {
            this.e = "wake:com.google.firebase.iid.WakeLockHolder";
        } else {
            this.e = "*gcore*:wake:com.google.firebase.iid.WakeLockHolder";
        }
        PowerManager powerManager = (PowerManager) context.getSystemService("power");
        ejyb.e(powerManager);
        this.l = powerManager.newWakeLock(1, "wake:com.google.firebase.iid.WakeLockHolder");
        if (dcno.b(context)) {
            packageName = dcnl.a(packageName) ? context.getPackageName() : packageName;
            if (context != null && context.getPackageManager() != null && packageName != null) {
                try {
                    ApplicationInfo applicationInfoA = dcnv.b(context).a(packageName, 0);
                    if (applicationInfoA == null) {
                        Log.e("WorkSourceUtil", "Could not get applicationInfo from package: ".concat(packageName));
                    } else {
                        int i2 = applicationInfoA.uid;
                        workSource = new WorkSource();
                        dcno.a(workSource, i2, packageName);
                    }
                } catch (PackageManager.NameNotFoundException unused) {
                    Log.e("WorkSourceUtil", "Could not find package: ".concat(packageName));
                }
            }
            this.q = workSource;
            if (workSource != null) {
                f(this.l, workSource);
            }
        }
        ScheduledExecutorService scheduledExecutorServiceUnconfigurableScheduledExecutorService = j;
        if (scheduledExecutorServiceUnconfigurableScheduledExecutorService == null) {
            synchronized (k) {
                scheduledExecutorServiceUnconfigurableScheduledExecutorService = j;
                if (scheduledExecutorServiceUnconfigurableScheduledExecutorService == null) {
                    ddmw ddmwVar = ddmx.a;
                    scheduledExecutorServiceUnconfigurableScheduledExecutorService = Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1));
                    j = scheduledExecutorServiceUnconfigurableScheduledExecutorService;
                }
            }
        }
        this.r = scheduledExecutorServiceUnconfigurableScheduledExecutorService;
    }

    private static void f(PowerManager.WakeLock wakeLock, WorkSource workSource) {
        try {
            wakeLock.setWorkSource(workSource);
        } catch (ArrayIndexOutOfBoundsException | IllegalArgumentException e) {
            Log.wtf("WakeLock", e.toString());
        }
    }

    public final void a(long j2) {
        this.g.incrementAndGet();
        long jMax = Math.max(Math.min(Long.MAX_VALUE, i), 1L);
        if (j2 > 0) {
            jMax = Math.min(j2, jMax);
        }
        synchronized (this.a) {
            if (!c()) {
                this.d = ddms.a;
                this.l.acquire();
                SystemClock.elapsedRealtime();
            }
            this.b++;
            this.p++;
            d();
            Map map = this.f;
            deej deejVar = (deej) map.get(null);
            if (deejVar == null) {
                deejVar = new deej();
                map.put(null, deejVar);
            }
            deejVar.a++;
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            long j3 = Long.MAX_VALUE - jElapsedRealtime > jMax ? jElapsedRealtime + jMax : Long.MAX_VALUE;
            if (j3 > this.n) {
                this.n = j3;
                Future future = this.m;
                if (future != null) {
                    future.cancel(false);
                }
                this.m = this.r.schedule(new Runnable() { // from class: deeh
                    @Override // java.lang.Runnable
                    public final void run() {
                        deel deelVar = this.a;
                        synchronized (deelVar.a) {
                            if (deelVar.c()) {
                                deei deeiVar = deel.h;
                                deei.a("%s ** IS FORCE-RELEASED ON TIMEOUT **", deelVar.e);
                                deelVar.b();
                                if (deelVar.c()) {
                                    deelVar.b = 1;
                                    deelVar.e();
                                }
                            }
                        }
                    }
                }, jMax, TimeUnit.MILLISECONDS);
            }
        }
    }

    public final void b() {
        Set set = this.o;
        if (set.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList(set);
        set.clear();
        if (arrayList.size() <= 0) {
            return;
        }
        throw null;
    }

    public final boolean c() {
        boolean z;
        synchronized (this.a) {
            z = this.b > 0;
        }
        return z;
    }

    public final void d() {
        if (this.c) {
            TextUtils.isEmpty(null);
        }
    }

    public final void e() {
        synchronized (this.a) {
            if (c()) {
                if (this.c) {
                    int i2 = this.b - 1;
                    this.b = i2;
                    if (i2 > 0) {
                        return;
                    }
                } else {
                    this.b = 0;
                }
                b();
                Map map = this.f;
                Iterator it = map.values().iterator();
                while (it.hasNext()) {
                    ((deej) it.next()).a = 0;
                }
                map.clear();
                Future future = this.m;
                if (future != null) {
                    future.cancel(false);
                    this.m = null;
                    this.n = 0L;
                }
                this.p = 0;
                PowerManager.WakeLock wakeLock = this.l;
                if (wakeLock.isHeld()) {
                    try {
                        try {
                            wakeLock.release();
                        } catch (RuntimeException e) {
                            if (!e.getClass().equals(RuntimeException.class)) {
                                throw e;
                            }
                            Log.e("WakeLock", String.format("%s failed to release!", this.e), e);
                            if (this.d != null) {
                                this.d = null;
                            }
                        }
                    } finally {
                        if (this.d != null) {
                            this.d = null;
                        }
                    }
                } else {
                    deei.a("%s should be held!", this.e);
                }
            }
        }
    }
}
