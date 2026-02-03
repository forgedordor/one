package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public class lvv {
    static final Object b = new Object();
    private final aku a;
    final Object c;
    int d;
    public boolean e;
    volatile Object f;
    public int g;
    private volatile Object h;
    private boolean i;
    private boolean j;
    private final Runnable k;

    public lvv() {
        this.c = new Object();
        this.a = new aku();
        this.d = 0;
        Object obj = b;
        this.f = obj;
        this.k = new lvr(this);
        this.h = obj;
        this.g = -1;
    }

    private final void b(lvu lvuVar) {
        if (lvuVar.d) {
            if (!lvuVar.eA()) {
                lvuVar.d(false);
                return;
            }
            int i = lvuVar.e;
            int i2 = this.g;
            if (i < i2) {
                lvuVar.e = i2;
                lvuVar.c.a(this.h);
            }
        }
    }

    static void d(String str) {
        if (!akj.a().c()) {
            throw new IllegalStateException(a.a(str, "Cannot invoke ", " on a background thread"));
        }
    }

    public Object a() {
        Object obj = this.h;
        if (obj != b) {
            return obj;
        }
        return null;
    }

    final void e(lvu lvuVar) {
        if (this.i) {
            this.j = true;
            return;
        }
        this.i = true;
        while (true) {
            this.j = false;
            if (lvuVar != null) {
                b(lvuVar);
            } else {
                akr akrVarE = this.a.e();
                while (akrVarE.hasNext()) {
                    b((lvu) ((akq) akrVarE.next()).b);
                    if (this.j) {
                        break;
                    }
                }
            }
            if (!this.j) {
                this.i = false;
                return;
            }
            lvuVar = null;
        }
    }

    public final void f(lvj lvjVar, lvz lvzVar) {
        d("observe");
        if (lvjVar.P().a() == lvb.a) {
            return;
        }
        lvt lvtVar = new lvt(this, lvjVar, lvzVar);
        lvu lvuVar = (lvu) this.a.f(lvzVar, lvtVar);
        if (lvuVar != null && !lvuVar.c(lvjVar)) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
        if (lvuVar != null) {
            return;
        }
        lvjVar.P().c(lvtVar);
    }

    public final void g(lvz lvzVar) {
        d("observeForever");
        lvs lvsVar = new lvs(this, lvzVar);
        lvu lvuVar = (lvu) this.a.f(lvzVar, lvsVar);
        if (lvuVar instanceof lvt) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
        if (lvuVar != null) {
            return;
        }
        lvsVar.d(true);
    }

    public final void j(Object obj) {
        Object obj2;
        Object obj3;
        synchronized (this.c) {
            obj2 = this.f;
            obj3 = b;
            this.f = obj;
        }
        if (obj2 != obj3) {
            return;
        }
        akj.a().b(this.k);
    }

    public void k(lvz lvzVar) {
        d("removeObserver");
        lvu lvuVar = (lvu) this.a.b(lvzVar);
        if (lvuVar == null) {
            return;
        }
        lvuVar.b();
        lvuVar.d(false);
    }

    public final void l(lvj lvjVar) {
        d("removeObservers");
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            akq akqVar = (akq) ((aks) it).next();
            if (((lvu) akqVar.b).c(lvjVar)) {
                k((lvz) akqVar.a);
            }
        }
    }

    protected void m(Object obj) {
        d("setValue");
        this.g++;
        this.h = obj;
        e(null);
    }

    public final boolean n() {
        return this.d > 0;
    }

    public final boolean o() {
        return this.a.e > 0;
    }

    public lvv(Object obj) {
        this.c = new Object();
        this.a = new aku();
        this.d = 0;
        this.f = b;
        this.k = new lvr(this);
        this.h = obj;
        this.g = 0;
    }

    protected void h() {
    }

    protected void i() {
    }
}
