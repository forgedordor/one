package defpackage;

import android.os.Build;
import java.lang.ref.Reference;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eief implements eifn, eijf {
    public final eifn a;
    public Thread b;
    public eiit c;
    private final eije d;
    private final eijg e;

    private eief(eije eijeVar, eief eiefVar, eifi eifiVar) {
        this.d = eijeVar;
        this.e = eiefVar.e;
        this.a = eiefVar;
        eiit eiitVar = eifiVar.e;
        if (eiitVar == null) {
            this.c = null;
            this.b = Thread.currentThread();
        } else {
            this.c = eiitVar;
            this.b = null;
        }
    }

    private final void i() {
        if (Build.VERSION.SDK_INT >= 28) {
            Reference.reachabilityFence(this);
        }
    }

    @Override // defpackage.eifn
    public final eifn a() {
        return this.a;
    }

    @Override // defpackage.eifn
    public final eiit b() {
        return this.c;
    }

    @Override // defpackage.eijf
    public final int c() {
        return this.d.f;
    }

    @Override // defpackage.eifp, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        eidc.p(this);
        this.b = null;
        this.c = null;
    }

    @Override // defpackage.eifn
    public final String d() {
        return this.d.c;
    }

    @Override // defpackage.eifn
    public final String e() {
        return this.e.c;
    }

    @Override // defpackage.eifn
    public final Thread f() {
        return this.b;
    }

    @Override // defpackage.eifn
    public final UUID g() {
        return this.e.b;
    }

    @Override // defpackage.eijf
    public final eiim h() {
        return this.e.b();
    }

    @Override // defpackage.eifn
    public final eiev j(eiew eiewVar) {
        return eiez.j(eiewVar, k());
    }

    @Override // defpackage.eifn
    public final eiez k() {
        eije eijeVar = this.d;
        return eiez.e(eijeVar.e, eijeVar.b());
    }

    @Override // defpackage.eifn
    public final long l() {
        return this.e.a() / 1000000;
    }

    @Override // defpackage.eifn
    public final eiez n() {
        throw null;
    }

    @Override // defpackage.eifn
    public final void o(int i) {
        eije eijeVar = this.d;
        if (eijeVar.e()) {
            eijeVar = eijeVar.b;
        }
        eijeVar.addAndGet(i);
        i();
    }

    @Override // defpackage.eifn
    public final void p(eiew eiewVar, Object obj) {
        eije eijeVar;
        eija eijaVar;
        eijb eijbVarA;
        eijb eijbVar = new eijb(eiewVar, obj);
        do {
            eijeVar = this.d;
            eijaVar = eije.a;
            eijbVarA = eijaVar.a(eijeVar);
            if (eijbVarA != null) {
                eijbVar.c = eijbVarA;
            }
        } while (!eijaVar.b(eijeVar, eijbVarA, eijbVar));
        i();
    }

    @Override // defpackage.eifn
    public final void q(boolean z) {
        long jA = this.e.a();
        eije eijeVar = this.d;
        long j = jA - eijeVar.d;
        ejwl.l(!eijeVar.d());
        eijeVar.i = (j & 4611686018427387903L) | (true != z ? 0L : 4611686018427387904L) | Long.MIN_VALUE;
        i();
    }

    @Override // defpackage.eifn
    public final boolean r() {
        return this.e.d;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0043, code lost:
    
        r9 = new defpackage.eief(r2, r8, r11);
        r10 = r9.a;
        r11 = defpackage.eidc.a;
        r10.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0052, code lost:
    
        if (r9.b != null) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0056, code lost:
    
        if (r9.c == null) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0059, code lost:
    
        r11 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x005b, code lost:
    
        r11 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x005c, code lost:
    
        defpackage.ejwl.m(r11, "isSynchronousChild should not be called if the trace has been closed on its creation thread.");
        r11 = r9.c;
        r10 = (defpackage.eief) r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0065, code lost:
    
        if (r11 == null) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0069, code lost:
    
        if (r11 != r10.c) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0070, code lost:
    
        if (r10.b != r9.b) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0073, code lost:
    
        r3 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0074, code lost:
    
        r2.h = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0076, code lost:
    
        return r9;
     */
    @Override // defpackage.eifn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.eifn s(java.lang.String r9, defpackage.eiez r10, defpackage.eifi r11) {
        /*
            r8 = this;
            eijg r1 = r8.e
            long r5 = r1.a()
            eije r2 = new eije
            eije r3 = r8.d
            r4 = r9
            r7 = r10
            r2.<init>(r3, r4, r5, r7)
        Lf:
            java.util.concurrent.atomic.AtomicReference r9 = r1.f
            java.lang.Object r10 = r9.get()
            eije r10 = (defpackage.eije) r10
            int r0 = r10.f
            r3 = 1
            int r0 = r0 + r3
            eihg r4 = r1.a
            int r4 = r4.f
            if (r0 < r4) goto L33
            r9 = -2147483648(0xffffffff80000000, float:-0.0)
            r10 = 0
            r2.c(r9, r10)
            monitor-enter(r1)
            int r9 = r1.h     // Catch: java.lang.Throwable -> L2f
            int r9 = r9 + r3
            r1.h = r9     // Catch: java.lang.Throwable -> L2f
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L2f
            goto L43
        L2f:
            r0 = move-exception
            r9 = r0
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L2f
            throw r9
        L33:
            r2.c(r0, r10)
        L36:
            boolean r0 = r9.compareAndSet(r10, r2)
            if (r0 != 0) goto L43
            java.lang.Object r0 = r9.get()
            if (r0 == r10) goto L36
            goto Lf
        L43:
            eief r9 = new eief
            r9.<init>(r2, r8, r11)
            eifn r10 = r9.a
            boolean r11 = defpackage.eidc.a
            r10.getClass()
            java.lang.Thread r11 = r9.b
            r0 = 0
            if (r11 != 0) goto L5b
            eiit r11 = r9.c
            if (r11 == 0) goto L59
            goto L5b
        L59:
            r11 = r0
            goto L5c
        L5b:
            r11 = r3
        L5c:
            java.lang.String r1 = "isSynchronousChild should not be called if the trace has been closed on its creation thread."
            defpackage.ejwl.m(r11, r1)
            eiit r11 = r9.c
            eief r10 = (defpackage.eief) r10
            if (r11 == 0) goto L6c
            eiit r10 = r10.c
            if (r11 != r10) goto L73
            goto L74
        L6c:
            java.lang.Thread r10 = r10.b
            java.lang.Thread r11 = r9.b
            if (r10 != r11) goto L73
            goto L74
        L73:
            r3 = r0
        L74:
            r2.h = r3
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eief.s(java.lang.String, eiez, eifi):eifn");
    }

    public final String toString() {
        return eidc.o(this);
    }

    @Override // defpackage.eifn
    public final void u() {
        this.d.j = 3;
    }

    public eief(eije eijeVar, eijg eijgVar, eifi eifiVar) {
        this.d = eijeVar;
        this.e = eijgVar;
        Thread threadCurrentThread = null;
        this.a = null;
        eiit eiitVar = eifiVar.e;
        if (eiitVar == null) {
            this.c = null;
            threadCurrentThread = Thread.currentThread();
        } else {
            this.c = eiitVar;
        }
        this.b = threadCurrentThread;
    }
}
