package defpackage;

import j$.util.concurrent.ConcurrentLinkedQueue;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.ref.Reference;
import java.net.Socket;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ffaj implements fexk {
    public final feyy a;
    public final fezb b;
    public final ffao c;
    public final feye d;
    public final ffai e;
    public ffaf f;
    public ffam g;
    public ffae h;
    public boolean i;
    public boolean j;
    public boolean k;
    public volatile boolean l;
    public volatile ffae m;
    public volatile ffam n;
    private final AtomicBoolean o;
    private Object p;

    public ffaj(feyy feyyVar, fezb fezbVar) {
        this.a = feyyVar;
        this.b = fezbVar;
        this.c = feyyVar.d.a;
        feye feyeVar = feyyVar.A.a;
        byte[] bArr = fezr.a;
        this.d = feyeVar;
        ffai ffaiVar = new ffai(this);
        ffaiVar.n(0L, TimeUnit.MILLISECONDS);
        this.e = ffaiVar;
        this.o = new AtomicBoolean();
        this.k = true;
    }

    private final IOException k(IOException iOException) throws IOException {
        IOException iOException2;
        Socket socketG;
        byte[] bArr = fezr.a;
        ffam ffamVar = this.g;
        if (ffamVar != null) {
            synchronized (ffamVar) {
                socketG = g();
            }
            if (this.g == null) {
                if (socketG != null) {
                    fezr.s(socketG);
                }
            } else if (socketG != null) {
                throw new IllegalStateException("Check failed.");
            }
        }
        if (this.e.f()) {
            InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
            iOException2 = interruptedIOException;
            if (iOException != null) {
                interruptedIOException.initCause(iOException);
                iOException2 = interruptedIOException;
            }
        } else {
            iOException2 = iOException;
        }
        if (iOException != null) {
            iOException2.getClass();
        }
        return iOException2;
    }

    private final void l() {
        this.p = ffdi.b.i();
    }

    @Override // defpackage.fexk
    public final fezh a() {
        if (!this.o.compareAndSet(false, true)) {
            throw new IllegalStateException("Already Executed");
        }
        this.e.e();
        l();
        try {
            this.a.c.b(this);
            return h();
        } finally {
            this.a.c.d(this);
        }
    }

    @Override // defpackage.fexk
    public final void b() {
        if (this.l) {
            return;
        }
        this.l = true;
        ffae ffaeVar = this.m;
        if (ffaeVar != null) {
            ffaeVar.c.f();
        }
        ffam ffamVar = this.n;
        if (ffamVar != null) {
            ffamVar.b();
        }
    }

    @Override // defpackage.fexk
    public final void c(fexl fexlVar) {
        ffag ffagVar;
        if (!this.o.compareAndSet(false, true)) {
            throw new IllegalStateException("Already Executed");
        }
        l();
        feyy feyyVar = this.a;
        ffag ffagVar2 = new ffag(this, fexlVar);
        feya feyaVar = feyyVar.c;
        synchronized (feyaVar) {
            ArrayDeque arrayDeque = feyaVar.a;
            arrayDeque.add(ffagVar2);
            String strA = ffagVar2.a();
            Iterator it = feyaVar.b.iterator();
            it.getClass();
            while (true) {
                if (!it.hasNext()) {
                    Iterator it2 = arrayDeque.iterator();
                    it2.getClass();
                    while (true) {
                        if (!it2.hasNext()) {
                            ffagVar = null;
                            break;
                        } else {
                            ffagVar = (ffag) it2.next();
                            if (fdbq.f(ffagVar.a(), strA)) {
                                break;
                            }
                        }
                    }
                } else {
                    ffagVar = (ffag) it.next();
                    if (fdbq.f(ffagVar.a(), strA)) {
                        break;
                    }
                }
            }
            if (ffagVar != null) {
                ffagVar2.a = ffagVar.a;
            }
        }
        feyaVar.e();
    }

    public final /* bridge */ /* synthetic */ Object clone() {
        return new ffaj(this.a, this.b);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x003a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.IOException d(defpackage.ffae r3, boolean r4, boolean r5, java.io.IOException r6) {
        /*
            r2 = this;
            ffae r0 = r2.m
            boolean r3 = defpackage.fdbq.f(r3, r0)
            if (r3 != 0) goto L9
            goto L54
        L9:
            monitor-enter(r2)
            r3 = 1
            r0 = 0
            if (r4 == 0) goto L15
            boolean r1 = r2.i     // Catch: java.lang.Throwable -> L13
            if (r1 != 0) goto L1c
            goto L15
        L13:
            r3 = move-exception
            goto L3d
        L15:
            if (r5 == 0) goto L3f
            boolean r5 = r2.j     // Catch: java.lang.Throwable -> L13
            if (r5 == 0) goto L3f
            r5 = r3
        L1c:
            if (r4 == 0) goto L20
            r2.i = r0     // Catch: java.lang.Throwable -> L13
        L20:
            if (r5 == 0) goto L24
            r2.j = r0     // Catch: java.lang.Throwable -> L13
        L24:
            boolean r4 = r2.i     // Catch: java.lang.Throwable -> L13
            if (r4 != 0) goto L2e
            boolean r5 = r2.j     // Catch: java.lang.Throwable -> L13
            if (r5 != 0) goto L2e
            r5 = r3
            goto L2f
        L2e:
            r5 = r0
        L2f:
            if (r4 != 0) goto L3a
            boolean r4 = r2.j     // Catch: java.lang.Throwable -> L13
            if (r4 != 0) goto L3a
            boolean r4 = r2.k     // Catch: java.lang.Throwable -> L13
            if (r4 != 0) goto L3a
            goto L3b
        L3a:
            r3 = r0
        L3b:
            r0 = r5
            goto L40
        L3d:
            monitor-exit(r2)
            throw r3
        L3f:
            r3 = r0
        L40:
            monitor-exit(r2)
            if (r0 == 0) goto L4d
            r4 = 0
            r2.m = r4
            ffam r4 = r2.g
            if (r4 == 0) goto L4d
            r4.c()
        L4d:
            if (r3 == 0) goto L54
            java.io.IOException r3 = r2.k(r6)
            return r3
        L54:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ffaj.d(ffae, boolean, boolean, java.io.IOException):java.io.IOException");
    }

    public final IOException e(IOException iOException) {
        boolean z;
        synchronized (this) {
            z = false;
            if (this.k) {
                this.k = false;
                if (!this.i) {
                    if (!this.j) {
                        z = true;
                    }
                }
            }
        }
        return z ? k(iOException) : iOException;
    }

    public final String f() {
        return this.b.a.e();
    }

    public final Socket g() {
        ffam ffamVar = this.g;
        ffamVar.getClass();
        byte[] bArr = fezr.a;
        List list = ffamVar.l;
        Iterator it = list.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            if (fdbq.f(((Reference) it.next()).get(), this)) {
                break;
            }
            i++;
        }
        if (i == -1) {
            throw new IllegalStateException("Check failed.");
        }
        list.remove(i);
        this.g = null;
        if (list.isEmpty()) {
            ffamVar.m = System.nanoTime();
            ffao ffaoVar = this.c;
            if (ffamVar.i) {
                ffamVar.l();
                ConcurrentLinkedQueue concurrentLinkedQueue = ffaoVar.d;
                concurrentLinkedQueue.remove(ffamVar);
                if (concurrentLinkedQueue.isEmpty()) {
                    ffaoVar.b.a();
                }
                return ffamVar.a();
            }
            ffaoVar.b.f(ffaoVar.c);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0071  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.fezh h() throws java.lang.Throwable {
        /*
            r9 = this;
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            feyy r0 = r9.a
            java.util.List r1 = r0.e
            defpackage.fcva.y(r2, r1)
            ffbd r1 = new ffbd
            r1.<init>(r0)
            r2.add(r1)
            ffat r1 = new ffat
            fexz r3 = r0.j
            r1.<init>(r3)
            r2.add(r1)
            fezt r1 = new fezt
            r1.<init>()
            r2.add(r1)
            ffab r1 = defpackage.ffab.a
            r2.add(r1)
            java.util.List r1 = r0.f
            defpackage.fcva.y(r2, r1)
            ffau r1 = new ffau
            r1.<init>()
            r2.add(r1)
            r1 = r0
            ffba r0 = new ffba
            fezb r5 = r9.b
            int r6 = r1.w
            int r7 = r1.x
            int r8 = r1.y
            r3 = 0
            r4 = 0
            r1 = r9
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r2 = 0
            fezh r0 = r0.b(r5)     // Catch: java.lang.Throwable -> L61 java.io.IOException -> L64
            boolean r3 = r1.l     // Catch: java.lang.Throwable -> L61 java.io.IOException -> L64
            if (r3 != 0) goto L56
            r9.e(r2)
            return r0
        L56:
            defpackage.fezr.r(r0)     // Catch: java.lang.Throwable -> L61 java.io.IOException -> L64
            java.io.IOException r0 = new java.io.IOException     // Catch: java.lang.Throwable -> L61 java.io.IOException -> L64
            java.lang.String r3 = "Canceled"
            r0.<init>(r3)     // Catch: java.lang.Throwable -> L61 java.io.IOException -> L64
            throw r0     // Catch: java.lang.Throwable -> L61 java.io.IOException -> L64
        L61:
            r0 = move-exception
            r3 = 0
            goto L6f
        L64:
            r0 = move-exception
            java.io.IOException r0 = r9.e(r0)     // Catch: java.lang.Throwable -> L6d
            r0.getClass()     // Catch: java.lang.Throwable -> L6d
            throw r0     // Catch: java.lang.Throwable -> L6d
        L6d:
            r0 = move-exception
            r3 = 1
        L6f:
            if (r3 != 0) goto L74
            r9.e(r2)
        L74:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ffaj.h():fezh");
    }

    public final void i(ffam ffamVar) {
        byte[] bArr = fezr.a;
        if (this.g != null) {
            throw new IllegalStateException("Check failed.");
        }
        this.g = ffamVar;
        ffamVar.l.add(new ffah(this, this.p));
    }

    public final void j(boolean z) {
        ffae ffaeVar;
        synchronized (this) {
            if (!this.k) {
                throw new IllegalStateException("released");
            }
        }
        if (z && (ffaeVar = this.m) != null) {
            ffaeVar.c.f();
            ffaeVar.a.d(ffaeVar, true, true, null);
        }
        this.h = null;
    }
}
