package defpackage;

import io.grpc.Status;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes6.dex */
abstract class fckp implements fcan {
    static final fbrb e;
    static final fbrb f;
    public static final Status g;
    public static final Random h;
    public static final boolean i;
    public fckc A;
    public long B;
    public fcap C;
    public fcjz D;
    public fcjz E;
    public long F;
    public boolean G;
    private final fbrg a;
    private Status b;
    public final fbrk j;
    public final Executor k;
    public final ScheduledExecutorService m;
    public final fckq n;
    public final fcdz o;
    public final boolean p;
    public final fcjy r;
    public final long s;
    public final long t;
    public final fcko u;
    public final Executor l = new fbtk(new fcjg());
    public final Object q = new Object();
    public final fceg v = new fceg();
    public volatile fcke w = new fcke(new ArrayList(8), Collections.EMPTY_LIST, null, null, false, false, false, 0);
    public final AtomicBoolean x = new AtomicBoolean();
    public final AtomicInteger y = new AtomicInteger();
    public final AtomicInteger z = new AtomicInteger();

    static {
        fbqx fbqxVar = fbrg.c;
        int i2 = fbrb.d;
        e = new fbqw("grpc-previous-rpc-attempts", fbqxVar);
        f = new fbqw("grpc-retry-pushback-ms", fbrg.c);
        g = Status.c.withDescription("Stream thrown away because RetriableStream committed");
        h = new Random();
        i = fcdy.i("GRPC_EXPERIMENTAL_XDS_RLS_LB", true);
    }

    public fckp(fbrk fbrkVar, fbrg fbrgVar, fcjy fcjyVar, long j, long j2, Executor executor, ScheduledExecutorService scheduledExecutorService, fckq fckqVar, fcdz fcdzVar, fcko fckoVar) {
        this.j = fbrkVar;
        this.r = fcjyVar;
        this.s = j;
        this.t = j2;
        this.k = executor;
        this.m = scheduledExecutorService;
        this.a = fbrgVar;
        this.n = fckqVar;
        if (fckqVar != null) {
            this.F = fckqVar.b;
        }
        this.o = fcdzVar;
        ejwl.b(fckqVar == null || fcdzVar == null, "Should not provide both retryPolicy and hedgingPolicy");
        this.p = fcdzVar != null;
        this.u = fckoVar;
    }

    @Override // defpackage.fcan
    public final fbmw a() {
        throw null;
    }

    @Override // defpackage.fcan
    public final void b(fceg fcegVar) {
        fcke fckeVar;
        synchronized (this.q) {
            fcegVar.b("closed", this.v);
            fckeVar = this.w;
        }
        fckn fcknVar = fckeVar.f;
        if (fcknVar != null) {
            fceg fcegVar2 = new fceg();
            fcknVar.a.b(fcegVar2);
            fcegVar.b("committed", fcegVar2);
            return;
        }
        fceg fcegVar3 = new fceg();
        for (fckn fcknVar2 : fckeVar.c) {
            fceg fcegVar4 = new fceg();
            fcknVar2.a.b(fcegVar4);
            fcegVar3.a(fcegVar4);
        }
        fcegVar.b("open", fcegVar3);
    }

    @Override // defpackage.fcan
    public final void c(Status status) {
        fckn fcknVar;
        fckn fcknVar2 = new fckn(0);
        fcknVar2.a = new fchx();
        Runnable runnableT = t(fcknVar2);
        if (runnableT != null) {
            synchronized (this.q) {
                this.w = this.w.c(fcknVar2);
            }
            runnableT.run();
            y(status, fcao.PROCESSED, new fbrg());
            return;
        }
        synchronized (this.q) {
            if (this.w.c.contains(this.w.f)) {
                fcknVar = this.w.f;
            } else {
                this.b = status;
                fcknVar = null;
            }
            fcke fckeVar = this.w;
            this.w = new fcke(fckeVar.b, fckeVar.c, fckeVar.d, fckeVar.f, true, fckeVar.a, fckeVar.h, fckeVar.e);
        }
        if (fcknVar != null) {
            fcknVar.a.c(status);
        }
    }

    @Override // defpackage.fcmn
    public final void d() {
        fcke fckeVar = this.w;
        if (fckeVar.a) {
            fckeVar.f.a.d();
        } else {
            v(new fcjm());
        }
    }

    @Override // defpackage.fcan
    public final void e() {
        v(new fcjn());
    }

    @Override // defpackage.fcmn
    public final void f() {
        v(new fcjq());
    }

    @Override // defpackage.fcmn
    public final void g(int i2) {
        fcke fckeVar = this.w;
        if (fckeVar.a) {
            fckeVar.f.a.g(i2);
        } else {
            v(new fcjr(i2));
        }
    }

    @Override // defpackage.fcmn
    public final void h(fbnr fbnrVar) {
        v(new fcjj(fbnrVar));
    }

    @Override // defpackage.fcan
    public final void i(fbol fbolVar) {
        v(new fcjk(fbolVar));
    }

    @Override // defpackage.fcan
    public final void j(fboo fbooVar) {
        v(new fcjl(fbooVar));
    }

    @Override // defpackage.fcan
    public final void k(int i2) {
        v(new fcjo(i2));
    }

    @Override // defpackage.fcan
    public final void l(int i2) {
        v(new fcjp(i2));
    }

    @Override // defpackage.fcan
    public final void m(fcap fcapVar) {
        fcjz fcjzVar;
        fcko fckoVar;
        this.C = fcapVar;
        Status statusP = p();
        if (statusP != null) {
            c(statusP);
            return;
        }
        synchronized (this.q) {
            this.w.b.add(new fckd(this));
        }
        fckn fcknVarS = s(0, false);
        if (fcknVarS == null) {
            return;
        }
        if (this.p) {
            Object obj = this.q;
            synchronized (obj) {
                this.w = this.w.a(fcknVarS);
                fcjzVar = null;
                if (z(this.w) && ((fckoVar = this.u) == null || fckoVar.a())) {
                    fcjzVar = new fcjz(obj);
                    this.E = fcjzVar;
                }
            }
            if (fcjzVar != null) {
                fcjzVar.b(this.m.schedule(new fckb(this, fcjzVar), this.o.b, TimeUnit.NANOSECONDS));
            }
        }
        w(fcknVarS);
    }

    @Override // defpackage.fcmn
    public final void n(InputStream inputStream) {
        throw new IllegalStateException("RetriableStream.writeMessage() should not be called directly");
    }

    @Override // defpackage.fcmn
    public final boolean o() {
        Iterator it = this.w.c.iterator();
        while (it.hasNext()) {
            if (((fckn) it.next()).a.o()) {
                return true;
            }
        }
        return false;
    }

    public abstract Status p();

    public abstract fcan q(fbrg fbrgVar, fbnl fbnlVar, int i2, boolean z);

    public abstract void r();

    public final fckn s(int i2, boolean z) {
        AtomicInteger atomicInteger;
        int i3;
        do {
            atomicInteger = this.z;
            i3 = atomicInteger.get();
            if (i3 < 0) {
                return null;
            }
        } while (!atomicInteger.compareAndSet(i3, i3 + 1));
        fckn fcknVar = new fckn(i2);
        fcjt fcjtVar = new fcjt(new fcjx(this, fcknVar));
        fbrg fbrgVar = this.a;
        fbrg fbrgVar2 = new fbrg();
        fbrgVar2.g(fbrgVar);
        if (i2 > 0) {
            fbrgVar2.h(e, String.valueOf(i2));
        }
        fcknVar.a = q(fbrgVar2, fcjtVar, i2, z);
        return fcknVar;
    }

    public final Runnable t(fckn fcknVar) {
        List list;
        Collection collectionSingleton;
        boolean z;
        Future future;
        Future future2;
        synchronized (this.q) {
            if (this.w.f != null) {
                return null;
            }
            Collection collection = this.w.c;
            fcke fckeVar = this.w;
            ejwl.m(fckeVar.f == null, "Already committed");
            List list2 = fckeVar.b;
            if (fckeVar.c.contains(fcknVar)) {
                list = null;
                collectionSingleton = Collections.singleton(fcknVar);
                z = true;
            } else {
                list = list2;
                collectionSingleton = Collections.EMPTY_LIST;
                z = false;
            }
            this.w = new fcke(list, collectionSingleton, fckeVar.d, fcknVar, fckeVar.g, z, fckeVar.h, fckeVar.e);
            this.r.a(-this.B);
            fcjz fcjzVar = this.D;
            boolean z2 = fcjzVar != null ? fcjzVar.c : false;
            if (fcjzVar != null) {
                Future futureA = fcjzVar.a();
                this.D = null;
                future = futureA;
            } else {
                future = null;
            }
            fcjz fcjzVar2 = this.E;
            if (fcjzVar2 != null) {
                Future futureA2 = fcjzVar2.a();
                this.E = null;
                future2 = futureA2;
            } else {
                future2 = null;
            }
            return new fcji(this, collection, fcknVar, future, z2, future2);
        }
    }

    public final void u(fckn fcknVar) {
        Runnable runnableT = t(fcknVar);
        if (runnableT != null) {
            this.k.execute(runnableT);
        }
    }

    public final void v(fcjw fcjwVar) {
        Collection collection;
        synchronized (this.q) {
            if (!this.w.a) {
                this.w.b.add(fcjwVar);
            }
            collection = this.w.c;
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            fcjwVar.a((fckn) it.next());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0034, code lost:
    
        if (r1 == null) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0036, code lost:
    
        r9.l.execute(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x003b, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x003c, code lost:
    
        if (r4 != false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x003e, code lost:
    
        r10.a.m(new defpackage.fckm(r9, r10));
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0048, code lost:
    
        r0 = r10.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x004e, code lost:
    
        if (r9.w.f != r10) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0050, code lost:
    
        r10 = r9.b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0053, code lost:
    
        r10 = defpackage.fckp.g;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0055, code lost:
    
        r0.c(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0058, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0080, code lost:
    
        r2 = r3.size();
        r5 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0085, code lost:
    
        if (r5 >= r2) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0087, code lost:
    
        r7 = (defpackage.fcjw) r3.get(r5);
        r7.a(r10);
        r4 = r4 | (r7 instanceof defpackage.fckd);
        r7 = r9.w;
        r8 = r7.f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0097, code lost:
    
        if (r8 == null) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0099, code lost:
    
        if (r8 != r10) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x009b, code lost:
    
        r5 = r5 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x009f, code lost:
    
        if (r7.g == false) goto L61;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void w(defpackage.fckn r10) {
        /*
            r9 = this;
            r0 = 0
            r1 = 0
            r2 = r0
            r4 = r2
            r3 = r1
        L5:
            java.lang.Object r5 = r9.q
            monitor-enter(r5)
            fcke r6 = r9.w     // Catch: java.lang.Throwable -> La4
            fckn r7 = r6.f     // Catch: java.lang.Throwable -> La4
            if (r7 == 0) goto L12
            if (r7 == r10) goto L12
            monitor-exit(r5)     // Catch: java.lang.Throwable -> La4
            goto L34
        L12:
            boolean r7 = r6.g     // Catch: java.lang.Throwable -> La4
            if (r7 == 0) goto L18
            monitor-exit(r5)     // Catch: java.lang.Throwable -> La4
            goto L34
        L18:
            java.util.List r7 = r6.b     // Catch: java.lang.Throwable -> La4
            int r8 = r7.size()     // Catch: java.lang.Throwable -> La4
            if (r2 != r8) goto L59
            fcke r0 = r6.c(r10)     // Catch: java.lang.Throwable -> La4
            r9.w = r0     // Catch: java.lang.Throwable -> La4
            boolean r0 = r9.o()     // Catch: java.lang.Throwable -> La4
            if (r0 != 0) goto L2e
            monitor-exit(r5)     // Catch: java.lang.Throwable -> La4
            return
        L2e:
            fcju r1 = new fcju     // Catch: java.lang.Throwable -> La4
            r1.<init>(r9)     // Catch: java.lang.Throwable -> La4
            monitor-exit(r5)     // Catch: java.lang.Throwable -> La4
        L34:
            if (r1 == 0) goto L3c
            java.util.concurrent.Executor r10 = r9.l
            r10.execute(r1)
            return
        L3c:
            if (r4 != 0) goto L48
            fcan r0 = r10.a
            fckm r1 = new fckm
            r1.<init>(r9, r10)
            r0.m(r1)
        L48:
            fcan r0 = r10.a
            fcke r1 = r9.w
            fckn r1 = r1.f
            if (r1 != r10) goto L53
            io.grpc.Status r10 = r9.b
            goto L55
        L53:
            io.grpc.Status r10 = defpackage.fckp.g
        L55:
            r0.c(r10)
            return
        L59:
            boolean r6 = r10.b     // Catch: java.lang.Throwable -> La4
            if (r6 == 0) goto L5f
            monitor-exit(r5)     // Catch: java.lang.Throwable -> La4
            return
        L5f:
            int r6 = r2 + 128
            int r8 = r7.size()     // Catch: java.lang.Throwable -> La4
            int r6 = java.lang.Math.min(r6, r8)     // Catch: java.lang.Throwable -> La4
            if (r3 != 0) goto L75
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch: java.lang.Throwable -> La4
            java.util.List r2 = r7.subList(r2, r6)     // Catch: java.lang.Throwable -> La4
            r3.<init>(r2)     // Catch: java.lang.Throwable -> La4
            goto L7f
        L75:
            r3.clear()     // Catch: java.lang.Throwable -> La4
            java.util.List r2 = r7.subList(r2, r6)     // Catch: java.lang.Throwable -> La4
            r3.addAll(r2)     // Catch: java.lang.Throwable -> La4
        L7f:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> La4
            int r2 = r3.size()
            r5 = r0
        L85:
            if (r5 >= r2) goto La1
            java.lang.Object r7 = r3.get(r5)
            fcjw r7 = (defpackage.fcjw) r7
            r7.a(r10)
            boolean r7 = r7 instanceof defpackage.fckd
            r4 = r4 | r7
            fcke r7 = r9.w
            fckn r8 = r7.f
            if (r8 == 0) goto L9b
            if (r8 != r10) goto La1
        L9b:
            boolean r7 = r7.g
            int r5 = r5 + 1
            if (r7 == 0) goto L85
        La1:
            r2 = r6
            goto L5
        La4:
            r10 = move-exception
            monitor-exit(r5)     // Catch: java.lang.Throwable -> La4
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fckp.w(fckn):void");
    }

    public final void x() {
        Future future;
        synchronized (this.q) {
            fcjz fcjzVar = this.E;
            future = null;
            if (fcjzVar != null) {
                Future futureA = fcjzVar.a();
                this.E = null;
                future = futureA;
            }
            this.w = this.w.b();
        }
        if (future != null) {
            future.cancel(false);
        }
    }

    public final void y(Status status, fcao fcaoVar, fbrg fbrgVar) {
        this.A = new fckc(status, fcaoVar, fbrgVar);
        if (this.z.addAndGet(Integer.MIN_VALUE) == Integer.MIN_VALUE) {
            this.l.execute(new fcjv(this, status, fcaoVar, fbrgVar));
        }
    }

    public final boolean z(fcke fckeVar) {
        return fckeVar.f == null && fckeVar.e < this.o.a && !fckeVar.h;
    }
}
