package defpackage;

import android.os.Build;
import android.util.Log;
import j$.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ekun extends ekuc {
    static final boolean a;
    static final boolean b;
    static final boolean c;
    public static final AtomicReference d;
    private static final AtomicLong e;
    private static final ConcurrentLinkedQueue f;
    private volatile ekta g;

    static {
        a = Build.FINGERPRINT == null || "robolectric".equals(Build.FINGERPRINT);
        b = "goldfish".equals(Build.HARDWARE) || "ranchu".equals(Build.HARDWARE);
        c = "eng".equals(Build.TYPE) || "userdebug".equals(Build.TYPE);
        d = new AtomicReference();
        e = new AtomicLong();
        f = new ConcurrentLinkedQueue();
    }

    public ekun(String str) {
        super(str);
        if (a || b) {
            this.g = new ekud().a(d());
            return;
        }
        if (!c) {
            this.g = null;
            return;
        }
        ekur ekurVar = ekut.c;
        String str2 = ekurVar.a;
        int i = ekurVar.f;
        this.g = new ekur(2, Level.OFF, ekurVar.c, ekurVar.d, ekurVar.e).a(d());
    }

    public static void e() {
        while (true) {
            ekun ekunVar = (ekun) ekul.a.poll();
            if (ekunVar == null) {
                f();
                return;
            }
            ekunVar.g = ((ekue) d.get()).a(ekunVar.d());
        }
    }

    private static void f() {
        while (true) {
            ekum ekumVar = (ekum) f.poll();
            if (ekumVar == null) {
                return;
            }
            e.getAndDecrement();
            eksx eksxVar = ekumVar.b;
            ekta ektaVar = ekumVar.a;
            if (eksxVar.R() || ektaVar.c(eksxVar.m())) {
                ektaVar.b(eksxVar);
            }
        }
    }

    @Override // defpackage.ekta
    public final void b(eksx eksxVar) {
        if (this.g != null) {
            this.g.b(eksxVar);
            return;
        }
        if (e.incrementAndGet() > 20) {
            f.poll();
            Log.w("ProxyAndroidLoggerBackend", "Too many Flogger logs received before configuration. Dropping old logs.");
        }
        f.offer(new ekum(this, eksxVar));
        if (this.g != null) {
            f();
        }
    }

    @Override // defpackage.ekta
    public final boolean c(Level level) {
        return this.g == null || this.g.c(level);
    }

    @Override // defpackage.ekuc, defpackage.ekta
    public final void g(RuntimeException runtimeException, eksx eksxVar) {
        if (this.g != null) {
            this.g.g(runtimeException, eksxVar);
        } else {
            Log.e("ProxyAndroidLoggerBackend", "Internal logging error before configuration", runtimeException);
        }
    }
}
