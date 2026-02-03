package defpackage;

import io.grpc.Status;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fccd implements fchm {
    public final fbtk b;
    public Runnable c;
    public Runnable d;
    public Runnable e;
    public fchl f;
    private final Executor j;
    private final fbpn i = fbpn.a(fccd.class, null);
    public final Object a = new Object();
    public Collection g = new LinkedHashSet();
    public volatile fccc h = new fccc(null, null);

    public fccd(Executor executor, fbtk fbtkVar) {
        this.j = executor;
        this.b = fbtkVar;
    }

    final void a(fbqg fbqgVar) {
        Runnable runnable;
        synchronized (this.a) {
            this.h = new fccc(fbqgVar, this.h.b);
            if (fbqgVar != null && b()) {
                ArrayList arrayList = new ArrayList(this.g);
                ArrayList arrayList2 = new ArrayList();
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    fccb fccbVar = (fccb) arrayList.get(i);
                    fbqd fbqdVar = fccbVar.a;
                    fbqc fbqcVarA = fbqgVar.a(fbqdVar);
                    fbnc fbncVar = ((fcit) fbqdVar).a;
                    if (fbncVar.i() && fbqcVarA.d()) {
                        fccbVar.d = fbqcVarA.c;
                    }
                    fcaq fcaqVarC = fcdy.c(fbqcVarA, fbncVar.i());
                    if (fcaqVarC != null) {
                        Executor executor = this.j;
                        Executor executor2 = fbncVar.c;
                        fbog fbogVar = fccbVar.b;
                        fbog fbogVarA = fbogVar.a();
                        try {
                            fcan fcanVarD = fcaqVarC.d(((fcit) fbqdVar).c, ((fcit) fbqdVar).b, fbncVar, fccbVar.c);
                            fbogVar.f(fbogVarA);
                            Runnable runnableQ = fccbVar.q(fcanVarD);
                            if (runnableQ != null) {
                                if (executor2 != null) {
                                    executor = executor2;
                                }
                                executor.execute(runnableQ);
                            }
                            arrayList2.add(fccbVar);
                        } catch (Throwable th) {
                            fccbVar.b.f(fbogVarA);
                            throw th;
                        }
                    }
                }
                synchronized (this.a) {
                    if (b()) {
                        Iterator it = arrayList2.iterator();
                        while (it.hasNext()) {
                            this.g.remove((fccb) it.next());
                        }
                        if (this.g.isEmpty()) {
                            this.g = new LinkedHashSet();
                        }
                        if (!b()) {
                            fbtk fbtkVar = this.b;
                            fbtkVar.c(this.d);
                            if (this.h.b != null && (runnable = this.e) != null) {
                                fbtkVar.c(runnable);
                                this.e = null;
                            }
                        }
                        this.b.b();
                    }
                }
            }
        }
    }

    public final boolean b() {
        boolean z;
        synchronized (this.a) {
            z = !this.g.isEmpty();
        }
        return z;
    }

    @Override // defpackage.fbpt
    public final fbpn c() {
        return this.i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x003b, code lost:
    
        r3 = new defpackage.fccb(r2, r0, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0046, code lost:
    
        if (r0.a.i() == false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0048, code lost:
    
        if (r4 == null) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x004e, code lost:
    
        if (r4.d() == false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0050, code lost:
    
        r3.d = r4.c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0054, code lost:
    
        r2.g.add(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0059, code lost:
    
        monitor-enter(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x005a, code lost:
    
        r4 = r2.g.size();
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x007a, code lost:
    
        return r3;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v11, types: [fcan] */
    /* JADX WARN: Type inference failed for: r3v4, types: [fcdh] */
    /* JADX WARN: Type inference failed for: r3v5, types: [fcan] */
    /* JADX WARN: Type inference failed for: r3v7, types: [fccb, java.lang.Object] */
    @Override // defpackage.fcaq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.fcan d(defpackage.fbrk r3, defpackage.fbrg r4, defpackage.fbnc r5, defpackage.fbnm[] r6) {
        /*
            r2 = this;
            fcit r0 = new fcit     // Catch: java.lang.Throwable -> L84
            fchz r1 = new fchz     // Catch: java.lang.Throwable -> L84
            r1.<init>()     // Catch: java.lang.Throwable -> L84
            r0.<init>(r3, r4, r5, r1)     // Catch: java.lang.Throwable -> L84
            fccc r3 = r2.h     // Catch: java.lang.Throwable -> L84
        Lc:
            io.grpc.Status r4 = r3.b     // Catch: java.lang.Throwable -> L84
            if (r4 == 0) goto L16
            fcdh r3 = new fcdh     // Catch: java.lang.Throwable -> L84
            r3.<init>(r4, r6)     // Catch: java.lang.Throwable -> L84
            goto L75
        L16:
            fbqg r4 = r3.a     // Catch: java.lang.Throwable -> L84
            if (r4 == 0) goto L33
            fbqc r4 = r4.a(r0)     // Catch: java.lang.Throwable -> L84
            fbnc r5 = r0.a     // Catch: java.lang.Throwable -> L84
            boolean r1 = r5.i()     // Catch: java.lang.Throwable -> L84
            fcaq r1 = defpackage.fcdy.c(r4, r1)     // Catch: java.lang.Throwable -> L84
            if (r1 == 0) goto L34
            fbrk r3 = r0.c     // Catch: java.lang.Throwable -> L84
            fbrg r4 = r0.b     // Catch: java.lang.Throwable -> L84
            fcan r3 = r1.d(r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L84
            goto L75
        L33:
            r4 = 0
        L34:
            java.lang.Object r5 = r2.a     // Catch: java.lang.Throwable -> L84
            monitor-enter(r5)     // Catch: java.lang.Throwable -> L84
            fccc r1 = r2.h     // Catch: java.lang.Throwable -> L81
            if (r3 != r1) goto L7e
            fccb r3 = new fccb     // Catch: java.lang.Throwable -> L81
            r3.<init>(r2, r0, r6)     // Catch: java.lang.Throwable -> L81
            fbnc r0 = r0.a     // Catch: java.lang.Throwable -> L81
            boolean r0 = r0.i()     // Catch: java.lang.Throwable -> L81
            if (r0 == 0) goto L54
            if (r4 == 0) goto L54
            boolean r0 = r4.d()     // Catch: java.lang.Throwable -> L81
            if (r0 == 0) goto L54
            io.grpc.Status r4 = r4.c     // Catch: java.lang.Throwable -> L81
            r3.d = r4     // Catch: java.lang.Throwable -> L81
        L54:
            java.util.Collection r4 = r2.g     // Catch: java.lang.Throwable -> L81
            r4.add(r3)     // Catch: java.lang.Throwable -> L81
            monitor-enter(r5)     // Catch: java.lang.Throwable -> L81
            java.util.Collection r4 = r2.g     // Catch: java.lang.Throwable -> L7b
            int r4 = r4.size()     // Catch: java.lang.Throwable -> L7b
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L7b
            r0 = 1
            if (r4 != r0) goto L6b
            fbtk r4 = r2.b     // Catch: java.lang.Throwable -> L81
            java.lang.Runnable r0 = r2.c     // Catch: java.lang.Throwable -> L81
            r4.c(r0)     // Catch: java.lang.Throwable -> L81
        L6b:
            int r4 = r6.length     // Catch: java.lang.Throwable -> L81
            r0 = 0
        L6d:
            if (r0 >= r4) goto L74
            r1 = r6[r0]     // Catch: java.lang.Throwable -> L81
            int r0 = r0 + 1
            goto L6d
        L74:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L81
        L75:
            fbtk r4 = r2.b
            r4.b()
            return r3
        L7b:
            r3 = move-exception
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L7b
            throw r3     // Catch: java.lang.Throwable -> L81
        L7e:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L81
            r3 = r1
            goto Lc
        L81:
            r3 = move-exception
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L81
            throw r3     // Catch: java.lang.Throwable -> L84
        L84:
            r3 = move-exception
            fbtk r4 = r2.b
            r4.b()
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fccd.d(fbrk, fbrg, fbnc, fbnm[]):fcan");
    }

    @Override // defpackage.fchm
    public final Runnable e(fchl fchlVar) {
        throw null;
    }

    @Override // defpackage.fchm
    public final void n(Status status) {
        Runnable runnable;
        synchronized (this.a) {
            if (this.h.b != null) {
                return;
            }
            this.h = new fccc(this.h.a, status);
            fbtk fbtkVar = this.b;
            fbtkVar.c(new fcca(this));
            if (!b() && (runnable = this.e) != null) {
                fbtkVar.c(runnable);
                this.e = null;
            }
            this.b.b();
        }
    }

    @Override // defpackage.fchm
    public final void o(Status status) {
        throw null;
    }
}
