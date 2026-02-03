package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class drlf extends Thread {
    final /* synthetic */ drlg a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public drlf(drlg drlgVar, Runnable runnable, String str) {
        super(runnable, str);
        this.a = drlgVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001b A[Catch: all -> 0x0048, DONT_GENERATE, FINALLY_INSNS, TRY_LEAVE, TryCatch #1 {all -> 0x0048, blocks: (B:6:0x0013, B:8:0x0017, B:10:0x001b), top: B:18:0x0013 }] */
    @Override // java.lang.Thread, java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() throws java.lang.SecurityException, java.lang.IllegalArgumentException {
        /*
            r5 = this;
            drlg r0 = r5.a
            drln r1 = r0.c
            r1.b()
            int r0 = r0.b
            android.os.Process.setThreadPriority(r0)
            java.lang.String r0 = "ImeThreadFactory.java"
            super.run()     // Catch: java.lang.Throwable -> L12
            goto L40
        L12:
            r1 = move-exception
            boolean r2 = defpackage.drjy.a     // Catch: java.lang.Throwable -> L48
            if (r2 != 0) goto L1b
            boolean r2 = defpackage.drjy.b     // Catch: java.lang.Throwable -> L48
            if (r2 == 0) goto L40
        L1b:
            ekrg r2 = defpackage.drlg.a     // Catch: java.lang.Throwable -> L48
            drub r3 = defpackage.drub.a     // Catch: java.lang.Throwable -> L48
            ekrd r2 = r2.a(r3)     // Catch: java.lang.Throwable -> L48
            ekrw r1 = r2.g(r1)     // Catch: java.lang.Throwable -> L48
            ekrd r1 = (defpackage.ekrd) r1     // Catch: java.lang.Throwable -> L48
            java.lang.String r2 = "com/google/android/libraries/inputmethod/concurrent/ImeThreadFactory$1"
            java.lang.String r3 = "run"
            r4 = 55
            ekrw r0 = r1.h(r2, r3, r4, r0)     // Catch: java.lang.Throwable -> L48
            ekrd r0 = (defpackage.ekrd) r0     // Catch: java.lang.Throwable -> L48
            java.lang.String r1 = "Abort the process because of an uncaught exception on a worker thread"
            r0.q(r1)     // Catch: java.lang.Throwable -> L48
            r0 = 40884407(0x26fd8b7, float:1.7621141E-37)
            java.lang.System.exit(r0)     // Catch: java.lang.Throwable -> L48
        L40:
            drlg r0 = r5.a
            drln r0 = r0.c
            r0.c()
            return
        L48:
            r0 = move-exception
            drlg r1 = r5.a
            drln r1 = r1.c
            r1.c()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.drlf.run():void");
    }
}
