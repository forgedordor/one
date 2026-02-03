package defpackage;

import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class rhm implements rgp, rvq {
    public final rhp c;
    public final rhn d;
    public res e;
    public boolean f;
    public rhy g;
    reb h;
    public boolean i;
    rhs j;
    public boolean k;
    rhq l;
    public volatile boolean m;
    private final lcd n;
    private final rju o;
    private final rju p;
    private final rju q;
    private boolean s;
    private rgt t;
    final rhl a = new rhl(new ArrayList(2));
    public final rvu b = new rvt();
    private final AtomicInteger r = new AtomicInteger();

    public rhm(rju rjuVar, rju rjuVar2, rju rjuVar3, rhn rhnVar, rhp rhpVar, lcd lcdVar) {
        this.o = rjuVar;
        this.p = rjuVar2;
        this.q = rjuVar3;
        this.d = rhnVar;
        this.c = rhpVar;
        this.n = lcdVar;
    }

    private final boolean j() {
        return this.k || this.i || this.m;
    }

    public final rju b() {
        return this.s ? this.q : this.p;
    }

    public final synchronized void c(rtk rtkVar, Executor executor) {
        this.b.a();
        this.a.a.add(new rhk(rtkVar, executor));
        if (this.i) {
            e(1);
            executor.execute(new rhj(this, rtkVar));
        } else if (!this.k) {
            rvi.b(!this.m, "Cannot add callbacks to a cancelled EngineJob");
        } else {
            e(1);
            executor.execute(new rhi(this, rtkVar));
        }
    }

    final void d() {
        rhq rhqVar;
        synchronized (this) {
            this.b.a();
            rvi.b(j(), "Not yet complete!");
            int iDecrementAndGet = this.r.decrementAndGet();
            rvi.b(iDecrementAndGet >= 0, "Can't decrement below 0");
            if (iDecrementAndGet == 0) {
                rhqVar = this.l;
                f();
            } else {
                rhqVar = null;
            }
        }
        if (rhqVar != null) {
            rhqVar.f();
        }
    }

    final synchronized void e(int i) {
        rhq rhqVar;
        rvi.b(j(), "Not yet complete!");
        if (this.r.getAndAdd(i) != 0 || (rhqVar = this.l) == null) {
            return;
        }
        rhqVar.d();
    }

    @Override // defpackage.rvq
    public final rvu eY() {
        return this.b;
    }

    public final synchronized void f() {
        if (this.e == null) {
            throw new IllegalArgumentException();
        }
        this.a.a.clear();
        this.e = null;
        this.l = null;
        this.g = null;
        this.k = false;
        this.m = false;
        this.i = false;
        rgt rgtVar = this.t;
        if (rgtVar.c.d()) {
            rgtVar.b();
        }
        this.t = null;
        this.j = null;
        this.h = null;
        this.n.b(this);
    }

    public final synchronized void g(rtk rtkVar) {
        this.b.a();
        rhk rhkVar = new rhk(rtkVar, rva.b);
        rhl rhlVar = this.a;
        rhlVar.a.remove(rhkVar);
        if (rhlVar.d()) {
            if (!j()) {
                this.m = true;
                rgt rgtVar = this.t;
                rgtVar.p = true;
                rgn rgnVar = rgtVar.o;
                if (rgnVar != null) {
                    rgnVar.a();
                }
                this.d.b(this, this.e);
            }
            if ((this.i || this.k) && this.r.get() == 0) {
                f();
            }
        }
    }

    public final synchronized void h(rgt rgtVar) {
        this.t = rgtVar;
        int iE = rgtVar.e(1);
        ((iE == 2 || iE == 3) ? this.o : b()).execute(rgtVar);
    }

    public final synchronized void i(res resVar, boolean z, boolean z2) {
        this.e = resVar;
        this.f = z;
        this.s = z2;
    }
}
