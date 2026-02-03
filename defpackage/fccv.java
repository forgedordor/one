package defpackage;

import io.grpc.Status;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes6.dex */
class fccv implements fcan {
    private volatile boolean a;
    private fcap b;
    private Status c;
    private fccu e;
    public fcan f;
    private long g;
    private long h;
    private List d = new ArrayList();
    private List i = new ArrayList();

    private final void s(Runnable runnable) {
        ejwl.m(this.b != null, "May only be called after start");
        synchronized (this) {
            if (this.a) {
                runnable.run();
            } else {
                this.d.add(runnable);
            }
        }
    }

    private final void t(fcap fcapVar) {
        Iterator it = this.i.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
        this.i = null;
        this.f.m(fcapVar);
    }

    private final void u(fcan fcanVar) {
        fcan fcanVar2 = this.f;
        ejwl.p(fcanVar2 == null, "realStream already set to %s", fcanVar2);
        this.f = fcanVar;
        this.h = System.nanoTime();
    }

    @Override // defpackage.fcan
    public final fbmw a() {
        throw null;
    }

    @Override // defpackage.fcan
    public void b(fceg fcegVar) {
        synchronized (this) {
            if (this.b == null) {
                return;
            }
            if (this.f != null) {
                fcegVar.b("buffered_nanos", Long.valueOf(this.h - this.g));
                this.f.b(fcegVar);
            } else {
                fcegVar.b("buffered_nanos", Long.valueOf(System.nanoTime() - this.g));
                fcegVar.a("waiting_for_connection");
            }
        }
    }

    @Override // defpackage.fcan
    public void c(Status status) {
        boolean z = true;
        ejwl.m(this.b != null, "May only be called after start");
        status.getClass();
        synchronized (this) {
            if (this.f == null) {
                u(fchx.c);
                this.c = status;
                z = false;
            }
        }
        if (z) {
            s(new fcco(this, status));
            return;
        }
        r();
        p();
        this.b.a(status, fcao.PROCESSED, new fbrg());
    }

    @Override // defpackage.fcmn
    public final void d() {
        ejwl.m(this.b != null, "May only be called after start");
        if (this.a) {
            this.f.d();
        } else {
            s(new fccn(this));
        }
    }

    @Override // defpackage.fcan
    public final void e() {
        ejwl.m(this.b != null, "May only be called after start");
        s(new fccp(this));
    }

    @Override // defpackage.fcmn
    public final void f() {
        ejwl.m(this.b == null, "May only be called before start");
        this.i.add(new fccf(this));
    }

    @Override // defpackage.fcmn
    public final void g(int i) {
        ejwl.m(this.b != null, "May only be called after start");
        if (this.a) {
            this.f.g(i);
        } else {
            s(new fcce(this, i));
        }
    }

    @Override // defpackage.fcmn
    public final void h(fbnr fbnrVar) {
        ejwl.m(this.b == null, "May only be called before start");
        fbnrVar.getClass();
        this.i.add(new fccg(this, fbnrVar));
    }

    @Override // defpackage.fcan
    public final void i(fbol fbolVar) {
        ejwl.m(this.b == null, "May only be called before start");
        this.i.add(new fcck(this, fbolVar));
    }

    @Override // defpackage.fcan
    public final void j(fboo fbooVar) {
        ejwl.m(this.b == null, "May only be called before start");
        fbooVar.getClass();
        this.i.add(new fcch(this, fbooVar));
    }

    @Override // defpackage.fcan
    public final void k(int i) {
        ejwl.m(this.b == null, "May only be called before start");
        this.i.add(new fcci(this, i));
    }

    @Override // defpackage.fcan
    public final void l(int i) {
        ejwl.m(this.b == null, "May only be called before start");
        this.i.add(new fccj(this, i));
    }

    @Override // defpackage.fcan
    public final void m(fcap fcapVar) {
        Status status;
        boolean z;
        ejwl.m(this.b == null, "already started");
        synchronized (this) {
            status = this.c;
            z = this.a;
            if (!z) {
                fccu fccuVar = new fccu(fcapVar);
                this.e = fccuVar;
                fcapVar = fccuVar;
            }
            this.b = fcapVar;
            this.g = System.nanoTime();
        }
        if (status != null) {
            fcapVar.a(status, fcao.PROCESSED, new fbrg());
        } else if (z) {
            t(fcapVar);
        }
    }

    @Override // defpackage.fcmn
    public final void n(InputStream inputStream) {
        ejwl.m(this.b != null, "May only be called after start");
        if (this.a) {
            this.f.n(inputStream);
        } else {
            s(new fccm(this, inputStream));
        }
    }

    @Override // defpackage.fcmn
    public final boolean o() {
        if (this.a) {
            return this.f.o();
        }
        return false;
    }

    final Runnable q(fcan fcanVar) {
        synchronized (this) {
            if (this.f == null) {
                fcanVar.getClass();
                u(fcanVar);
                fcap fcapVar = this.b;
                if (fcapVar == null) {
                    this.d = null;
                    this.a = true;
                }
                if (fcapVar != null) {
                    t(fcapVar);
                    return new fccl(this);
                }
            }
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0054, code lost:
    
        r0 = r1.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x005c, code lost:
    
        if (r0.hasNext() == false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x005e, code lost:
    
        ((java.lang.Runnable) r0.next()).run();
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void r() {
        /*
            r6 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
        L5:
            monitor-enter(r6)
            java.util.List r1 = r6.d     // Catch: java.lang.Throwable -> L6d
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L6d
            if (r1 == 0) goto L4f
            r0 = 0
            r6.d = r0     // Catch: java.lang.Throwable -> L6d
            r1 = 1
            r6.a = r1     // Catch: java.lang.Throwable -> L6d
            fccu r2 = r6.e     // Catch: java.lang.Throwable -> L6d
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L6d
            if (r2 == 0) goto L4e
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
        L1e:
            monitor-enter(r2)
            java.util.List r4 = r2.c     // Catch: java.lang.Throwable -> L4b
            boolean r4 = r4.isEmpty()     // Catch: java.lang.Throwable -> L4b
            if (r4 == 0) goto L2d
            r2.c = r0     // Catch: java.lang.Throwable -> L4b
            r2.b = r1     // Catch: java.lang.Throwable -> L4b
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L4b
            return
        L2d:
            java.util.List r4 = r2.c     // Catch: java.lang.Throwable -> L4b
            r2.c = r3     // Catch: java.lang.Throwable -> L4b
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L4b
            java.util.Iterator r3 = r4.iterator()
        L36:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L46
            java.lang.Object r5 = r3.next()
            java.lang.Runnable r5 = (java.lang.Runnable) r5
            r5.run()
            goto L36
        L46:
            r4.clear()
            r3 = r4
            goto L1e
        L4b:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L4b
            throw r0
        L4e:
            return
        L4f:
            java.util.List r1 = r6.d     // Catch: java.lang.Throwable -> L6d
            r6.d = r0     // Catch: java.lang.Throwable -> L6d
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L6d
            java.util.Iterator r0 = r1.iterator()
        L58:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L68
            java.lang.Object r2 = r0.next()
            java.lang.Runnable r2 = (java.lang.Runnable) r2
            r2.run()
            goto L58
        L68:
            r1.clear()
            r0 = r1
            goto L5
        L6d:
            r0 = move-exception
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L6d
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fccv.r():void");
    }

    protected void p() {
    }
}
