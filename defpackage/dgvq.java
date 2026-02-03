package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.TimerTask;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class dgvq {
    public final dfys a;
    public final CopyOnWriteArrayList b;
    public final dgwg c;
    public final dgwn d;
    public final dgwv e;
    public dhjt f;
    private int g = 1;

    protected dgvq(dfys dfysVar, dgwg dgwgVar, dhjt dhjtVar) {
        new ArrayList();
        this.b = new CopyOnWriteArrayList();
        this.a = dfysVar;
        this.c = dgwgVar;
        this.d = new dgwn(((dfyj) dfysVar).k);
        this.e = new dgwv();
        this.f = dhjtVar;
    }

    private final boolean p() {
        return this.g == 2;
    }

    public final String a() {
        return this.a.e();
    }

    public final void b() {
        if (!l()) {
            throw new IllegalStateException("Service not started!");
        }
    }

    public final void c(dgwe dgweVar) {
        TimerTask timerTask = (TimerTask) this.c.d.remove(dgweVar);
        if (timerTask != null) {
            timerTask.cancel();
        }
    }

    public final void d(dezf dezfVar) {
        for (dgwe dgweVar : this.c.b(this)) {
            m(dgweVar, dezfVar);
            dhja.c("Stopped session: %s", dgweVar.k);
        }
    }

    public final void h(dgwe dgweVar, int i, boolean z) {
        dhja.c("Starting task for session refresh: %s interval: %s", dhiz.URI.c(dgweVar.y()), Integer.valueOf(i));
        dgwg dgwgVar = this.c;
        dgwf dgwfVar = new dgwf(dgwgVar, dgweVar, z);
        dgwgVar.d.put(dgweVar, dgwfVar);
        int i2 = i * 1000;
        if (z) {
            i2 -= i2 / 10;
        }
        dgwgVar.c.schedule(dgwfVar, i2);
    }

    public final void i(dgwe dgweVar) {
        dgwg dgwgVar = this.c;
        ConcurrentHashMap concurrentHashMap = dgwgVar.a;
        synchronized (concurrentHashMap) {
            String str = dgweVar.k;
            dhja.c("Remove session %s", str);
            dgwe dgweVar2 = (dgwe) concurrentHashMap.remove(str);
            if (dgweVar2 != dgweVar) {
                dhja.q("Removed session is not the expected session. Removed: %s \n ---- \n Expected: %s", dgweVar2, dgweVar);
                if (dgweVar2 != null) {
                    dgwgVar.c(dgweVar2);
                }
            }
            dgwgVar.c(dgweVar);
        }
    }

    public final synchronized void j() {
        if (l()) {
            dhja.k("Service already started", new Object[0]);
            return;
        }
        if (p()) {
            dhja.q("Service starting", new Object[0]);
            return;
        }
        this.g = 2;
        dhja.c("Starting service: %s", getClass().getName());
        try {
            f();
            if (this.g != 2) {
                return;
            }
            this.g = 3;
            try {
                e();
            } catch (Exception e) {
                dhja.i(e, "Error while starting service: %s", e.getMessage());
            }
        } catch (Exception e2) {
            dhja.i(e2, "Error while starting service: %s", e2.getMessage());
            this.g = 1;
        }
    }

    public final synchronized void k(dezf dezfVar) {
        if (!l() && !p()) {
            dhja.q("Service not started or starting", new Object[0]);
            return;
        }
        this.g = 4;
        dhja.c("Stopping service: %s", getClass().getName());
        try {
            g(dezfVar);
        } catch (Exception e) {
            dhja.g("Error while stopping service: %s", e.getMessage());
        }
        d(dezfVar);
        this.g = 1;
    }

    public final boolean l() {
        return this.g == 3;
    }

    protected void m(dgwe dgweVar, dezf dezfVar) {
        try {
            dhja.c("Stopping session: %s", dgweVar.k);
            dgweVar.n(2, dgvh.a(dezfVar));
        } catch (Exception e) {
            dhja.i(e, "Error while stopping session: %s", e.getMessage());
        }
    }

    public abstract void n();

    public abstract void o();

    protected void e() {
    }

    protected void f() {
    }

    protected void g(dezf dezfVar) {
    }
}
