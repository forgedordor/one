package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bzh implements AutoCloseable {
    public final AtomicBoolean a;
    public final long b;
    public final bxk c;
    private final bzf d;
    private final bnu e;

    public bzh(bzf bzfVar, long j, bxk bxkVar, boolean z) {
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        this.a = atomicBoolean;
        bnu bnuVarA = bnu.a();
        this.e = bnuVarA;
        this.d = bzfVar;
        this.b = j;
        this.c = bxkVar;
        if (z) {
            atomicBoolean.set(true);
        } else {
            bnuVarA.c("stop");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void a(int r11, java.lang.Throwable r12) {
        /*
            r10 = this;
            java.lang.String r0 = "stop() called on a recording that is no longer active: "
            bnu r1 = r10.e
            r1.b()
            java.util.concurrent.atomic.AtomicBoolean r1 = r10.a
            r2 = 1
            boolean r1 = r1.getAndSet(r2)
            if (r1 == 0) goto L12
            goto La7
        L12:
            bzf r3 = r10.d
            java.lang.Object r1 = r3.i
            monitor-enter(r1)
            byz r2 = r3.o     // Catch: java.lang.Throwable -> La8
            boolean r2 = defpackage.bzf.A(r10, r2)     // Catch: java.lang.Throwable -> La8
            if (r2 != 0) goto L3c
            byz r2 = r3.n     // Catch: java.lang.Throwable -> La8
            boolean r2 = defpackage.bzf.A(r10, r2)     // Catch: java.lang.Throwable -> La8
            if (r2 != 0) goto L3c
            java.lang.String r11 = "Recorder"
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> La8
            r12.<init>(r0)     // Catch: java.lang.Throwable -> La8
            bxk r0 = r10.c     // Catch: java.lang.Throwable -> La8
            r12.append(r0)     // Catch: java.lang.Throwable -> La8
            java.lang.String r12 = r12.toString()     // Catch: java.lang.Throwable -> La8
            defpackage.bbs.a(r11, r12)     // Catch: java.lang.Throwable -> La8
            monitor-exit(r1)     // Catch: java.lang.Throwable -> La8
            return
        L3c:
            bze r0 = r3.l     // Catch: java.lang.Throwable -> La8
            int r0 = r0.ordinal()     // Catch: java.lang.Throwable -> La8
            r9 = 0
            switch(r0) {
                case 0: goto L85;
                case 1: goto L71;
                case 2: goto L71;
                case 3: goto L85;
                case 4: goto L53;
                case 5: goto L53;
                case 6: goto L49;
                case 7: goto L49;
                default: goto L46;
            }     // Catch: java.lang.Throwable -> La8
        L46:
            r7 = r11
            r8 = r12
            goto L8d
        L49:
            byz r0 = r3.n     // Catch: java.lang.Throwable -> La8
            boolean r0 = defpackage.bzf.A(r10, r0)     // Catch: java.lang.Throwable -> La8
            defpackage.lcg.c(r0)     // Catch: java.lang.Throwable -> La8
            goto L46
        L53:
            bze r0 = defpackage.bze.STOPPING     // Catch: java.lang.Throwable -> La8
            r3.p(r0)     // Catch: java.lang.Throwable -> La8
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.NANOSECONDS     // Catch: java.lang.Throwable -> La8
            long r4 = java.lang.System.nanoTime()     // Catch: java.lang.Throwable -> La8
            long r5 = r0.toMicros(r4)     // Catch: java.lang.Throwable -> La8
            byz r4 = r3.n     // Catch: java.lang.Throwable -> La8
            java.util.concurrent.Executor r0 = r3.h     // Catch: java.lang.Throwable -> La8
            bxu r2 = new bxu     // Catch: java.lang.Throwable -> La8
            r7 = r11
            r8 = r12
            r2.<init>()     // Catch: java.lang.Throwable -> La8
            r0.execute(r2)     // Catch: java.lang.Throwable -> La8
            goto L8d
        L71:
            r7 = r11
            r8 = r12
            byz r11 = r3.o     // Catch: java.lang.Throwable -> La8
            boolean r11 = defpackage.bzf.A(r10, r11)     // Catch: java.lang.Throwable -> La8
            defpackage.lcg.c(r11)     // Catch: java.lang.Throwable -> La8
            byz r11 = r3.o     // Catch: java.lang.Throwable -> La8
            r3.o = r9     // Catch: java.lang.Throwable -> La8
            r3.m()     // Catch: java.lang.Throwable -> La8
            r9 = r11
            goto L8d
        L85:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> La8
            java.lang.String r12 = "Calling stop() while idling or initializing is invalid."
            r11.<init>(r12)     // Catch: java.lang.Throwable -> La8
            throw r11     // Catch: java.lang.Throwable -> La8
        L8d:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> La8
            if (r9 == 0) goto La7
            r11 = 10
            if (r7 != r11) goto L9b
            java.lang.String r11 = "Recorder"
            java.lang.String r12 = "Recording was stopped due to recording being garbage collected before any valid data has been produced."
            defpackage.bbs.c(r11, r12)
        L9b:
            java.lang.RuntimeException r11 = new java.lang.RuntimeException
            java.lang.String r12 = "Recording was stopped before any data could be produced."
            r11.<init>(r12, r8)
            r12 = 8
            r3.j(r9, r12, r11)
        La7:
            return
        La8:
            r0 = move-exception
            r11 = r0
            monitor-exit(r1)     // Catch: java.lang.Throwable -> La8
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bzh.a(int, java.lang.Throwable):void");
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        a(0, null);
    }

    protected final void finalize() throws Throwable {
        try {
            this.e.d();
            a(10, new RuntimeException("Recording stopped due to being garbage collected."));
        } finally {
            super.finalize();
        }
    }
}
