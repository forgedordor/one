package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import j$.util.concurrent.ConcurrentLinkedQueue;
import java.util.Queue;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dqme {
    public final Queue a;
    private final Executor b;
    private final AtomicReference c;
    private final dqmd d;
    private Throwable e;

    public dqme(Executor executor) {
        executor.getClass();
        this.b = executor;
        this.c = new AtomicReference();
        this.a = new ConcurrentLinkedQueue();
        this.d = new dqmd();
    }

    public final ListenableFuture a(Executor executor, eooy eooyVar) {
        final ListenableFuture listenableFutureN = eork.n(eiid.c(eooyVar), new dqlt(this));
        return eork.m(eiid.l(new Callable() { // from class: dqlv
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.a.c(listenableFutureN);
            }
        }), executor);
    }

    public final Object b(eooy eooyVar) {
        return c(eork.n(eooyVar, new dqlt(this)));
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x01f8, code lost:
    
        if (defpackage.dqmg.a(r14) <= defpackage.dqmf.a(r12)) goto L171;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x01fa, code lost:
    
        r7 = defpackage.dqmg.i(r14, false, false, false, 0, defpackage.dqmf.a(r12), 0, 95);
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0212, code lost:
    
        if (defpackage.dqmg.g(r14) == false) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x0218, code lost:
    
        if (r10.compareAndSet(r14, r7) == false) goto L175;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x021e, code lost:
    
        r16 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0228, code lost:
    
        if (defpackage.dqmg.d(r14) != defpackage.dqmg.d(r7)) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x022e, code lost:
    
        if (r10.compareAndSet(r14, r7) == false) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x0231, code lost:
    
        r0 = r16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x024e, code lost:
    
        if (r10.compareAndSet(r14, defpackage.dqmg.i(r7, false, true, false, 0, 0, 0, 125)) == false) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x0250, code lost:
    
        r4.a(defpackage.dqmg.d(r14));
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x025c, code lost:
    
        r16 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x025e, code lost:
    
        java.util.concurrent.locks.LockSupport.park(r16);
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x0265, code lost:
    
        if (r9.get() != r11) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x0276, code lost:
    
        r5 = r5 | java.lang.Thread.interrupted();
        r0 = r16;
        r7 = true;
        r8 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x0283, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x0284, code lost:
    
        r3.d();
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x0287, code lost:
    
        if (r5 != false) goto L130;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x0289, code lost:
    
        r3.a.interrupt();
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x028e, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0183, code lost:
    
        r5 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0184, code lost:
    
        r10 = r3.f;
        r12 = r10.get();
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x019e, code lost:
    
        if (r10.compareAndSet(r12, defpackage.dqmg.i(r12, false, false, true, 0, 0, 0, 123)) == false) goto L160;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x01a2, code lost:
    
        if (r3.c == false) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x01a4, code lost:
    
        r10 = defpackage.dqmg.d(r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x01a9, code lost:
    
        r10 = android.os.Process.getThreadPriority(r3.b);
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x01af, code lost:
    
        r12 = r0.get();
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x01b7, code lost:
    
        if (defpackage.dqmc.c(r12) != false) goto L166;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x01bd, code lost:
    
        if (defpackage.dqmc.b(r12) > r10) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x01ca, code lost:
    
        if (r0.compareAndSet(r12, defpackage.dqmc.e(r12, r10, r7, r8, 4)) == false) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x01cc, code lost:
    
        r12 = defpackage.dqmf.b(r10, r0.b);
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x01d4, code lost:
    
        if (r4.c == false) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x01d6, code lost:
    
        r10 = r4.f;
        r14 = r10.get();
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x01e6, code lost:
    
        if (defpackage.dqmg.e(r14) != defpackage.dqmf.c(r12)) goto L170;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x01ee, code lost:
    
        if (defpackage.dqmg.a(r14) == (-21)) goto L102;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(com.google.common.util.concurrent.ListenableFuture r35) throws java.lang.SecurityException, java.lang.IllegalArgumentException {
        /*
            Method dump skipped, instructions count: 700
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dqme.c(com.google.common.util.concurrent.ListenableFuture):java.lang.Object");
    }

    public final void d(Runnable runnable) {
        runnable.getClass();
        this.a.add(runnable);
    }
}
