package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import com.google.android.apps.messaging.shared.net.DittoForegroundService;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class ceee implements ceov {
    public final Context e;
    private PowerManager.WakeLock i;
    private final cqba k;
    private static final cczi f = cdag.f(cdag.b, "ditto_foreground_service_duration_milliseconds", TimeUnit.MINUTES.toMillis(2));
    private static final cczi g = cdag.f(cdag.b, "ditto_foreground_service_min_duration_milliseconds", TimeUnit.SECONDS.toMillis(8));
    public static final cqce a = cqce.g("BugleNetwork", "DittoForegroundServiceSchedulerImpl");
    private final Set h = new HashSet();
    public final Set b = Collections.newSetFromMap(new WeakHashMap());
    public ceea c = null;
    final ceed d = new ceed(this);
    private final Runnable j = new Runnable() { // from class: ceeb
        @Override // java.lang.Runnable
        public final void run() {
            ceee ceeeVar = this.a;
            Set set = ceeeVar.b;
            synchronized (set) {
                if (set.isEmpty()) {
                    ceeeVar.d();
                } else {
                    ceee.a.m("Still waiting for services to complete, not stopping the service.");
                    ceeeVar.c();
                }
            }
        }
    };

    public ceee(Context context, cqba cqbaVar) {
        this.e = context;
        this.k = cqbaVar;
    }

    private final void h() {
        PowerManager.WakeLock wakeLock = this.i;
        if (wakeLock == null || !wakeLock.isHeld()) {
            a.m("Ditto lock already released.");
        } else {
            a.m("Releasing Ditto lock.");
            this.i.release();
        }
    }

    private final void i(long j) {
        cqce cqceVar = a;
        cqbd cqbdVarA = cqceVar.a();
        cqbdVarA.z("Extending Ditto foreground notification by (s)", j / 1000);
        cqbdVarA.r();
        if (this.i == null) {
            PowerManager.WakeLock wakeLockNewWakeLock = ((PowerManager) this.e.getSystemService("power")).newWakeLock(1, "ditto_foreground_service_scheduler_impl");
            this.i = wakeLockNewWakeLock;
            wakeLockNewWakeLock.setReferenceCounted(false);
        }
        cqceVar.q("Acquiring Ditto lock.");
        this.i.acquire(j);
        cqdq.d(this.j, j);
    }

    @Override // defpackage.ceov
    public final void a() {
        if (this.c != null) {
            DittoForegroundService.a.r("Cannot hide the foreground notification on Android O and above!");
        } else {
            a.r("ServiceScheduler is not bound to the foreground service.");
        }
    }

    @Override // defpackage.ceov
    public final void b(Object obj) {
        Set set = this.b;
        synchronized (set) {
            set.remove(obj);
        }
        Set set2 = this.h;
        synchronized (set2) {
            set2.remove(obj);
            if (set2.isEmpty()) {
                e();
            }
        }
    }

    @Override // defpackage.ceov
    public final void c() {
        i(((Long) f.e()).longValue());
    }

    @Override // defpackage.ceov
    public final void d() {
        int size;
        int size2;
        try {
            Set set = this.h;
            synchronized (set) {
                size = set.size();
                set.clear();
            }
            Set set2 = this.b;
            synchronized (set2) {
                size2 = set2.size();
            }
            cqce cqceVar = a;
            cqbd cqbdVarA = cqceVar.a();
            cqbdVarA.y("monitorSet size", size);
            cqbdVarA.r();
            cqbd cqbdVarA2 = cqceVar.a();
            cqbdVarA2.y("waitForMonitorSet size", size2);
            cqbdVarA2.r();
            cqdq.a(this.j);
            if (this.c != null) {
                Context context = this.e;
                try {
                    context.unbindService(this.d);
                } catch (IllegalArgumentException e) {
                    cqbd cqbdVarB = DittoForegroundService.a.b();
                    cqbdVarB.I("Unexpected unbindService error");
                    cqbdVarB.A("msg", e.getMessage());
                    cqbdVarB.s(e);
                }
                try {
                    context.stopService(DittoForegroundService.a(context));
                } catch (NullPointerException e2) {
                    cqbd cqbdVarB2 = DittoForegroundService.a.b();
                    cqbdVarB2.I("Unexpected stopService error. Likely due to vendor-specific firmware issue.");
                    cqbdVarB2.s(e2);
                }
                a.m("Stopping foreground service.");
                this.c = null;
            } else {
                cqceVar.r("Foreground service is already stopped.");
            }
        } finally {
            h();
        }
    }

    final void e() {
        i(((Long) g.e()).longValue());
    }

    @Override // defpackage.ceov
    public final void f(Object obj) {
        Set set = this.b;
        synchronized (set) {
            set.add(obj);
        }
    }

    @Override // defpackage.ceov
    public final void g(Object obj) {
        Set set = this.h;
        ceea ceeaVar = this.c;
        synchronized (set) {
            if (obj != null) {
                set.add(obj);
            }
            if (this.k.a) {
                return;
            }
            if (ceeaVar == null) {
                a.m("Starting Ditto foreground notification...");
                cdim.a(new cdil() { // from class: ceec
                    @Override // defpackage.cdil
                    public final void a() {
                        ceee ceeeVar = this.a;
                        Context context = ceeeVar.e;
                        Intent intentA = DittoForegroundService.a(context);
                        context.startForegroundService(intentA);
                        context.bindService(intentA, ceeeVar.d, 1);
                    }
                });
            }
            if (obj == null) {
                e();
            } else {
                c();
            }
        }
    }
}
