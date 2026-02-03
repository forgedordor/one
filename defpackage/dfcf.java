package defpackage;

import android.content.Context;
import com.google.android.ims.provisioning.config.CapabilityConfiguration;
import j$.util.Optional;
import java.util.HashMap;
import java.util.Timer;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dfcf implements dgxg {
    public final dfcr c;
    public final dfdi d;
    public final dhgz e;
    public final dgxf f;
    public dfys g;
    public dgxi h;
    public volatile boolean i;
    public CapabilityConfiguration j;
    public Thread k;
    public int p;
    public final dfht r;
    private Timer w;
    public static final dfny a = dfnv.b("disable_ims_contacts_discovery_in_single_reg");
    private static final dfny t = dfnv.b("query_registration_state_to_ims_registration_controller");
    public static final dfny b = dfnv.b("disable_address_book_scan");
    private static final int u = a() + 1;
    private int x = 1;
    private final Object v = new Object();
    public final Object l = new Object();
    public final Object m = new Object();
    public final HashMap n = new HashMap(u, 1.0f);
    public final AtomicInteger o = new AtomicInteger();
    public final AtomicLong q = new AtomicLong();
    public final dfby s = new dfby(this);

    public dfcf(Context context, dfcr dfcrVar, dfdi dfdiVar, dhgz dhgzVar, dgxf dgxfVar) {
        this.r = dfht.a(context, "RCS.imscontacts_discovery");
        this.c = dfcrVar;
        this.d = dfdiVar;
        this.e = dhgzVar;
        this.f = dgxfVar;
    }

    public static int a() {
        return Runtime.getRuntime().availableProcessors() > 1 ? 5 : 2;
    }

    private final void m() {
        this.r.b();
        Object obj = this.m;
        synchronized (obj) {
            obj.notifyAll();
        }
        synchronized (this.l) {
            Thread thread = this.k;
            if (thread != null) {
                thread.interrupt();
                this.k = null;
            }
        }
    }

    private final void n(String str, int i, dgwx dgwxVar) {
        this.c.e(str, i, dgwxVar);
    }

    private final boolean o(String str) {
        int i;
        if (this.k != null) {
            synchronized (this.v) {
                i = this.x;
            }
            if (i == 3) {
                Object obj = this.m;
                synchronized (obj) {
                    HashMap map = this.n;
                    if (!map.containsKey(str)) {
                        return false;
                    }
                    Long l = (Long) map.get(str);
                    long jLongValue = l.longValue();
                    map.remove(str);
                    if (this.q.get() > jLongValue && !map.containsValue(l)) {
                        AtomicInteger atomicInteger = this.o;
                        atomicInteger.incrementAndGet();
                        dhja.c("Discovery progress %d/%d contacts", Integer.valueOf(atomicInteger.get()), Integer.valueOf(this.p));
                    }
                    if (a() > map.size()) {
                        obj.notify();
                    }
                    return true;
                }
            }
        }
        return false;
    }

    public final void b() {
        g();
        m();
    }

    public final void c() {
        dhja.o("Scheduling immediate discovery", new Object[0]);
        synchronized (this.l) {
            if (this.k != null) {
                m();
            }
            Thread thread = new Thread(new dfbz(this), "ImsContactsDiscovery");
            this.k = thread;
            thread.start();
        }
    }

    public final void d() {
        dhja.o("Scheduling discovery according to polling period", new Object[0]);
        if (this.g == null) {
            dhja.o("IMS module not initialized.", new Object[0]);
            return;
        }
        if (!i()) {
            dhja.o("No polling period defined - will wait for the next explicit update", new Object[0]);
            return;
        }
        CapabilityConfiguration capabilityConfiguration = this.j;
        capabilityConfiguration.getClass();
        long j = capabilityConfiguration.mPollingPeriod;
        if (this.k != null) {
            m();
        }
        Thread thread = new Thread(new dfcd(this), "ImsContactsDiscovery");
        this.k = thread;
        this.r.d(thread, j);
    }

    public final void e(dfca dfcaVar) {
        if (this.w == null) {
            this.w = new Timer("DiscoveryCallbackTimer");
        }
        this.w.schedule(dfcaVar, 50L);
    }

    public final void f() {
        dhja.o("IMS discovery shut down request.", new Object[0]);
        if (this.i) {
            dhja.o("IMS discovery already shut down or shutting down, request ignored.", new Object[0]);
            return;
        }
        synchronized (this.l) {
            this.i = true;
            dfdi dfdiVar = this.d;
            dfdiVar.d.remove(this.s);
            this.r.b();
            b();
        }
    }

    public final void g() {
        Timer timer = this.w;
        if (timer != null) {
            timer.cancel();
            this.w = null;
        }
    }

    @Deprecated
    public final boolean h() {
        dfys dfysVar = this.g;
        if (dfysVar == null) {
            return false;
        }
        if (((Boolean) t.a()).booleanValue()) {
            dfyx dfyxVar = ((dfyj) dfysVar).b;
            return dfyxVar != null && dfyxVar.l();
        }
        Optional optionalA = dfyq.a(dfysVar);
        return optionalA.isPresent() && ((dfyt) optionalA.get()).c();
    }

    public final boolean i() {
        CapabilityConfiguration capabilityConfiguration = this.j;
        return capabilityConfiguration != null && capabilityConfiguration.mPollingPeriod > 0;
    }

    public final void j(int i) {
        synchronized (this.v) {
            this.x = i;
        }
    }

    @Override // defpackage.dgxg
    public final void k(long j, String str, dgwx dgwxVar) {
        if (dgwxVar.y()) {
            if (o(str)) {
                n(str, 2, dgwxVar);
            }
        } else if (o(str)) {
            n(str, 1, null);
        }
    }

    @Override // defpackage.dgxg
    public final void l(long j, String str) {
        dhja.c("onCapabilitiesUpdateError %s", dhiz.PHONE_NUMBER.c(str));
        o(str);
    }
}
