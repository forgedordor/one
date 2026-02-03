package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class bpp implements Runnable {
    final /* synthetic */ bpq a;

    public bpp(bpq bpqVar) {
        this.a = bpqVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0016, code lost:
    
        r0.interrupt();
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0030, code lost:
    
        if (r1 == false) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0032, code lost:
    
        r0 = java.lang.Thread.currentThread();
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x003d, code lost:
    
        r1 = r1 | java.lang.Thread.interrupted();
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x003e, code lost:
    
        r0.run();
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0045, code lost:
    
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0046, code lost:
    
        defpackage.bbs.d("SequentialExecutor", defpackage.a.l(r0, "Exception while executing runnable "), r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:?, code lost:
    
        return;
     */
    /* JADX WARN: Removed duplicated region for block: B:55:0x002b A[SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            r10 = this;
            r0 = 0
            r1 = r0
        L2:
            r2 = 1
            bpq r3 = r10.a     // Catch: java.lang.Throwable -> L43
            java.util.Deque r4 = r3.a     // Catch: java.lang.Throwable -> L43
            monitor-enter(r4)     // Catch: java.lang.Throwable -> L43
            if (r0 != 0) goto L23
            int r0 = r3.c     // Catch: java.lang.Throwable -> L52
            r5 = 4
            if (r0 != r5) goto L1a
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L52
            if (r1 == 0) goto L37
            java.lang.Thread r0 = java.lang.Thread.currentThread()     // Catch: java.lang.Error -> L5f
        L16:
            r0.interrupt()     // Catch: java.lang.Error -> L5f
            goto L37
        L1a:
            long r6 = r3.b     // Catch: java.lang.Throwable -> L52
            r8 = 1
            long r6 = r6 + r8
            r3.b = r6     // Catch: java.lang.Throwable -> L52
            r3.c = r5     // Catch: java.lang.Throwable -> L52
        L23:
            java.lang.Object r0 = r4.poll()     // Catch: java.lang.Throwable -> L52
            java.lang.Runnable r0 = (java.lang.Runnable) r0     // Catch: java.lang.Throwable -> L52
            if (r0 != 0) goto L38
            bpq r0 = r10.a     // Catch: java.lang.Throwable -> L52
            r0.c = r2     // Catch: java.lang.Throwable -> L52
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L52
            if (r1 == 0) goto L37
            java.lang.Thread r0 = java.lang.Thread.currentThread()     // Catch: java.lang.Error -> L5f
            goto L16
        L37:
            return
        L38:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L52
            boolean r3 = java.lang.Thread.interrupted()     // Catch: java.lang.Throwable -> L43
            r1 = r1 | r3
            r0.run()     // Catch: java.lang.Throwable -> L43 java.lang.RuntimeException -> L45
        L41:
            r0 = r2
            goto L2
        L43:
            r0 = move-exception
            goto L55
        L45:
            r3 = move-exception
            java.lang.String r4 = "SequentialExecutor"
            java.lang.String r5 = "Exception while executing runnable "
            java.lang.String r0 = defpackage.a.l(r0, r5)     // Catch: java.lang.Throwable -> L43
            defpackage.bbs.d(r4, r0, r3)     // Catch: java.lang.Throwable -> L43
            goto L41
        L52:
            r0 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L52
            throw r0     // Catch: java.lang.Throwable -> L43
        L55:
            if (r1 == 0) goto L5e
            java.lang.Thread r1 = java.lang.Thread.currentThread()     // Catch: java.lang.Error -> L5f
            r1.interrupt()     // Catch: java.lang.Error -> L5f
        L5e:
            throw r0     // Catch: java.lang.Error -> L5f
        L5f:
            r0 = move-exception
            bpq r1 = r10.a
            java.util.Deque r3 = r1.a
            monitor-enter(r3)
            r1.c = r2     // Catch: java.lang.Throwable -> L69
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L69
            throw r0
        L69:
            r0 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L69
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bpp.run():void");
    }
}
